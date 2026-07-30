package okhttp3.internal.cache;

import f6.l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.io.b;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.t;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.d;
import okio.e;
import okio.j0;
import okio.m;
import okio.v0;
import okio.x0;
import y5.w;

/* loaded from: classes5.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private d journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache this$0, Entry entry) {
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(entry, "entry");
            this.this$0 = this$0;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[this$0.getValueCount$okhttp()];
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.done)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (s.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    w wVar = w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                try {
                    if (!(!this.done)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (s.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    w wVar = w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void detach$okhttp() {
            if (s.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final v0 newSink(int i8) {
            final DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!s.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                    return j0.blackhole();
                }
                if (!getEntry$okhttp().getReadable$okhttp()) {
                    boolean[] written$okhttp = getWritten$okhttp();
                    s.checkNotNull(written$okhttp);
                    written$okhttp[i8] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(getEntry$okhttp().getDirtyFiles$okhttp().get(i8)), new l() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // f6.l
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((IOException) obj);
                            return w.INSTANCE;
                        }

                        public final void invoke(IOException it) {
                            s.checkNotNullParameter(it, "it");
                            DiskLruCache diskLruCache2 = DiskLruCache.this;
                            DiskLruCache.Editor editor = this;
                            synchronized (diskLruCache2) {
                                editor.detach$okhttp();
                                w wVar = w.INSTANCE;
                            }
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return j0.blackhole();
                }
            }
        }

        public final x0 newSource(int i8) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!(!this.done)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                x0 x0Var = null;
                if (!getEntry$okhttp().getReadable$okhttp() || !s.areEqual(getEntry$okhttp().getCurrentEditor$okhttp(), this) || getEntry$okhttp().getZombie$okhttp()) {
                    return null;
                }
                try {
                    x0Var = diskLruCache.getFileSystem$okhttp().source(getEntry$okhttp().getCleanFiles$okhttp().get(i8));
                } catch (FileNotFoundException unused) {
                }
                return x0Var;
            }
        }
    }

    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache this$0, String key) {
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(key, "key");
            this.this$0 = this$0;
            this.key = key;
            this.lengths = new long[this$0.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = this$0.getValueCount$okhttp();
            for (int i8 = 0; i8 < valueCount$okhttp; i8++) {
                sb.append(i8);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException(s.stringPlus("unexpected journal line: ", list));
        }

        private final x0 newSource(int i8) {
            final x0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i8));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new m(diskLruCache, this) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;
                final /* synthetic */ DiskLruCache this$0;
                final /* synthetic */ DiskLruCache.Entry this$1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(x0.this);
                    this.this$0 = diskLruCache;
                    this.this$1 = this;
                }

                @Override // okio.m, okio.x0, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = this.this$0;
                    DiskLruCache.Entry entry = this.this$1;
                    synchronized (diskLruCache2) {
                        try {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                            if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                            w wVar = w.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) {
            s.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                int i8 = 0;
                while (i8 < size) {
                    int i9 = i8 + 1;
                    this.lengths[i8] = Long.parseLong(strings.get(i8));
                    i8 = i9;
                }
            } catch (NumberFormatException unused) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i8) {
            this.lockingSourceCount = i8;
        }

        public final void setReadable$okhttp(boolean z7) {
            this.readable = z7;
        }

        public final void setSequenceNumber$okhttp(long j8) {
            this.sequenceNumber = j8;
        }

        public final void setZombie$okhttp(boolean z7) {
            this.zombie = z7;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i8 = 0; i8 < valueCount$okhttp; i8++) {
                    arrayList.add(newSource(i8));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((x0) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(d writer) {
            s.checkNotNullParameter(writer, "writer");
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i8 = 0;
            while (i8 < length) {
                long j8 = jArr[i8];
                i8++;
                writer.writeByte(32).writeDecimalLong(j8);
            }
        }
    }

    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<x0> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache this$0, String key, long j8, List<? extends x0> sources, long[] lengths) {
            s.checkNotNullParameter(this$0, "this$0");
            s.checkNotNullParameter(key, "key");
            s.checkNotNullParameter(sources, "sources");
            s.checkNotNullParameter(lengths, "lengths");
            this.this$0 = this$0;
            this.key = key;
            this.sequenceNumber = j8;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<x0> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i8) {
            return this.lengths[i8];
        }

        public final x0 getSource(int i8) {
            return this.sources.get(i8);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, int i8, int i9, long j8, TaskRunner taskRunner) {
        s.checkNotNullParameter(fileSystem, "fileSystem");
        s.checkNotNullParameter(directory, "directory");
        s.checkNotNullParameter(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i8;
        this.valueCount = i9;
        this.maxSize = j8;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String stringPlus = s.stringPlus(Util.okHttpName, " Cache");
        this.cleanupTask = new Task(stringPlus) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z7;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z7 = diskLruCache.initialized;
                    if (!z7 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = j0.buffer(j0.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (j8 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i9 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(directory, JOURNAL_FILE);
        this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i8 = this.redundantOpCount;
        return i8 >= 2000 && i8 >= this.lruEntries.size();
    }

    private final d newJournalWriter() {
        return j0.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new l() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IOException) obj);
                return w.INSTANCE;
            }

            public final void invoke(IOException it) {
                s.checkNotNullParameter(it, "it");
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                    DiskLruCache.this.hasJournalErrors = true;
                    return;
                }
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + diskLruCache);
            }
        }));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            s.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = next;
            int i8 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i9 = this.valueCount;
                while (i8 < i9) {
                    this.size += entry.getLengths$okhttp()[i8];
                    i8++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i10 = this.valueCount;
                while (i8 < i10) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i8));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i8));
                    i8++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() {
        e buffer = j0.buffer(this.fileSystem.source(this.journalFile));
        try {
            String readUtf8LineStrict = buffer.readUtf8LineStrict();
            String readUtf8LineStrict2 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict3 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict4 = buffer.readUtf8LineStrict();
            String readUtf8LineStrict5 = buffer.readUtf8LineStrict();
            if (!s.areEqual(MAGIC, readUtf8LineStrict) || !s.areEqual(VERSION_1, readUtf8LineStrict2) || !s.areEqual(String.valueOf(this.appVersion), readUtf8LineStrict3) || !s.areEqual(String.valueOf(getValueCount$okhttp()), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + ']');
            }
            int i8 = 0;
            while (true) {
                try {
                    readJournalLine(buffer.readUtf8LineStrict());
                    i8++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i8 - getLruEntries$okhttp().size();
                    if (buffer.exhausted()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    w wVar = w.INSTANCE;
                    b.closeFinally(buffer, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void readJournalLine(String str) {
        String substring;
        List<String> split$default;
        int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            throw new IOException(s.stringPlus("unexpected journal line: ", str));
        }
        int i8 = indexOf$default + 1;
        int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i8, false, 4, (Object) null);
        if (indexOf$default2 == -1) {
            substring = str.substring(i8);
            s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = REMOVE;
            if (indexOf$default == str2.length() && t.startsWith$default(str, str2, false, 2, null)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i8, indexOf$default2);
            s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            this.lruEntries.put(substring, entry);
        }
        if (indexOf$default2 != -1) {
            String str3 = CLEAN;
            if (indexOf$default == str3.length() && t.startsWith$default(str, str3, false, 2, null)) {
                String substring2 = str.substring(indexOf$default2 + 1);
                s.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                split$default = StringsKt__StringsKt.split$default((CharSequence) substring2, new char[]{' '}, false, 0, 6, (Object) null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(split$default);
                return;
            }
        }
        if (indexOf$default2 == -1) {
            String str4 = DIRTY;
            if (indexOf$default == str4.length() && t.startsWith$default(str, str4, false, 2, null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (indexOf$default2 == -1) {
            String str5 = READ;
            if (indexOf$default == str5.length() && t.startsWith$default(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(s.stringPlus("unexpected journal line: ", str));
    }

    private final boolean removeOldestEntry() {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie$okhttp()) {
                s.checkNotNullExpressionValue(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor currentEditor$okhttp;
        try {
            if (this.initialized && !this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                s.checkNotNullExpressionValue(values, "lruEntries.values");
                int i8 = 0;
                Object[] array = values.toArray(new Entry[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i8 < length) {
                    Entry entry = entryArr[i8];
                    i8++;
                    if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                d dVar = this.journalWriter;
                s.checkNotNull(dVar);
                dVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z7) {
        s.checkNotNullParameter(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!s.areEqual(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int i8 = 0;
        if (z7 && !entry$okhttp.getReadable$okhttp()) {
            int i9 = this.valueCount;
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                boolean[] written$okhttp = editor.getWritten$okhttp();
                s.checkNotNull(written$okhttp);
                if (!written$okhttp[i10]) {
                    editor.abort();
                    throw new IllegalStateException(s.stringPlus("Newly created entry didn't create value for index ", Integer.valueOf(i10)));
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i10))) {
                    editor.abort();
                    return;
                }
                i10 = i11;
            }
        }
        int i12 = this.valueCount;
        while (i8 < i12) {
            int i13 = i8 + 1;
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i8);
            if (!z7 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i8);
                this.fileSystem.rename(file, file2);
                long j8 = entry$okhttp.getLengths$okhttp()[i8];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i8] = size;
                this.size = (this.size - j8) + size;
            }
            i8 = i13;
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        d dVar = this.journalWriter;
        s.checkNotNull(dVar);
        if (!entry$okhttp.getReadable$okhttp() && !z7) {
            getLruEntries$okhttp().remove(entry$okhttp.getKey$okhttp());
            dVar.writeUtf8(REMOVE).writeByte(32);
            dVar.writeUtf8(entry$okhttp.getKey$okhttp());
            dVar.writeByte(10);
            dVar.flush();
            if (this.size <= this.maxSize || journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
        entry$okhttp.setReadable$okhttp(true);
        dVar.writeUtf8(CLEAN).writeByte(32);
        dVar.writeUtf8(entry$okhttp.getKey$okhttp());
        entry$okhttp.writeLengths$okhttp(dVar);
        dVar.writeByte(10);
        if (z7) {
            long j9 = this.nextSequenceNumber;
            this.nextSequenceNumber = 1 + j9;
            entry$okhttp.setSequenceNumber$okhttp(j9);
        }
        dVar.flush();
        if (this.size <= this.maxSize) {
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String key) {
        s.checkNotNullParameter(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized void evictAll() {
        try {
            initialize();
            Collection<Entry> values = this.lruEntries.values();
            s.checkNotNullExpressionValue(values, "lruEntries.values");
            Object[] array = values.toArray(new Entry[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i8 = 0;
            while (i8 < length) {
                Entry entry = entryArr[i8];
                i8++;
                s.checkNotNullExpressionValue(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            d dVar = this.journalWriter;
            s.checkNotNull(dVar);
            dVar.flush();
        }
    }

    public final synchronized Snapshot get(String key) {
        s.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        d dVar = this.journalWriter;
        s.checkNotNull(dVar);
        dVar.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        try {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e8) {
                    Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + ((Object) e8.getMessage()) + ", removing", 5, e8);
                    try {
                        delete();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() {
        try {
            d dVar = this.journalWriter;
            if (dVar != null) {
                dVar.close();
            }
            d buffer = j0.buffer(this.fileSystem.sink(this.journalFileTmp));
            try {
                buffer.writeUtf8(MAGIC).writeByte(10);
                buffer.writeUtf8(VERSION_1).writeByte(10);
                buffer.writeDecimalLong(this.appVersion).writeByte(10);
                buffer.writeDecimalLong(getValueCount$okhttp()).writeByte(10);
                buffer.writeByte(10);
                for (Entry entry : getLruEntries$okhttp().values()) {
                    if (entry.getCurrentEditor$okhttp() != null) {
                        buffer.writeUtf8(DIRTY).writeByte(32);
                        buffer.writeUtf8(entry.getKey$okhttp());
                        buffer.writeByte(10);
                    } else {
                        buffer.writeUtf8(CLEAN).writeByte(32);
                        buffer.writeUtf8(entry.getKey$okhttp());
                        entry.writeLengths$okhttp(buffer);
                        buffer.writeByte(10);
                    }
                }
                w wVar = w.INSTANCE;
                b.closeFinally(buffer, null);
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                this.fileSystem.delete(this.journalFileBackup);
                this.journalWriter = newJournalWriter();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean remove(String key) {
        s.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        d dVar;
        s.checkNotNullParameter(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (dVar = this.journalWriter) != null) {
                dVar.writeUtf8(DIRTY);
                dVar.writeByte(32);
                dVar.writeUtf8(entry.getKey$okhttp());
                dVar.writeByte(10);
                dVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i8 = this.valueCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i9));
            this.size -= entry.getLengths$okhttp()[i9];
            entry.getLengths$okhttp()[i9] = 0;
        }
        this.redundantOpCount++;
        d dVar2 = this.journalWriter;
        if (dVar2 != null) {
            dVar2.writeUtf8(REMOVE);
            dVar2.writeByte(32);
            dVar2.writeUtf8(entry.getKey$okhttp());
            dVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z7) {
        this.closed = z7;
    }

    public final synchronized void setMaxSize(long j8) {
        this.maxSize = j8;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized Editor edit(String key, long j8) {
        s.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (j8 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j8)) {
            return null;
        }
        if ((entry == null ? null : entry.getCurrentEditor$okhttp()) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            d dVar = this.journalWriter;
            s.checkNotNull(dVar);
            dVar.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
            dVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor);
            return editor;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
