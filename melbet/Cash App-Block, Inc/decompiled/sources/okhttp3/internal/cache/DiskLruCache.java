package okhttp3.internal.cache;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Android10Platform;
import okhttp3.internal.platform.Platform;
import okio.FileSystem;
import okio.ForwardingSource;
import okio.Okio;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Source;
import papa.internal.Perfs$$ExternalSyntheticLambda2;

/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public boolean civilizedFileSystem;
    public final TaskQueue cleanupQueue;
    public final DiskLruCache$cleanupTask$1 cleanupTask;
    public boolean closed;
    public final Path directory;
    public final DiskLruCache$fileSystem$1 fileSystem;
    public boolean hasJournalErrors;
    public boolean initialized;
    public final Path journalFile;
    public final Path journalFileBackup;
    public final Path journalFileTmp;
    public RealBufferedSink journalWriter;
    public final LinkedHashMap lruEntries;
    public final long maxSize;
    public boolean mostRecentRebuildFailed;
    public boolean mostRecentTrimFailed;
    public long nextSequenceNumber;
    public int redundantOpCount;
    public long size;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    public final class Entry {
        public final ArrayList cleanFiles;
        public Response currentEditor;
        public final ArrayList dirtyFiles;
        public final String key;
        public final long[] lengths;
        public int lockingSourceCount;
        public boolean readable;
        public long sequenceNumber;
        public final /* synthetic */ DiskLruCache this$0;
        public boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            str.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            diskLruCache.getClass();
            this.lengths = new long[2];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < 2; i++) {
                sb.append(i);
                this.cleanFiles.add(this.this$0.directory.resolve(sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(this.this$0.directory.resolve(sb.toString()));
                sb.setLength(length);
            }
        }

        public final Snapshot snapshot$okhttp() {
            TimeZone timeZone = _UtilJvmKt.UTC;
            if (!this.readable) {
                return null;
            }
            final DiskLruCache diskLruCache = this.this$0;
            if (!diskLruCache.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            for (int i = 0; i < 2; i++) {
                try {
                    final Source source = diskLruCache.fileSystem.source((Path) this.cleanFiles.get(i));
                    if (!diskLruCache.civilizedFileSystem) {
                        this.lockingSourceCount++;
                        source = new ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                            public boolean closed;

                            @Override // okio.ForwardingSource, java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                super.close();
                                if (this.closed) {
                                    return;
                                }
                                this.closed = true;
                                DiskLruCache diskLruCache2 = diskLruCache;
                                DiskLruCache.Entry entry = this;
                                synchronized (diskLruCache2) {
                                    int i2 = entry.lockingSourceCount - 1;
                                    entry.lockingSourceCount = i2;
                                    if (i2 == 0 && entry.zombie) {
                                        diskLruCache2.removeEntry$okhttp(entry);
                                    }
                                }
                            }
                        };
                    }
                    arrayList.add(source);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        _UtilCommonKt.closeQuietly((Source) it.next());
                    }
                    try {
                        diskLruCache.removeEntry$okhttp(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
        }
    }

    /* loaded from: classes9.dex */
    public final class Snapshot implements Closeable {
        public final String key;
        public final long sequenceNumber;
        public final ArrayList sources;
        public final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, ArrayList arrayList, long[] jArr) {
            str.getClass();
            jArr.getClass();
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator it = this.sources.iterator();
            while (it.hasNext()) {
                _UtilCommonKt.closeQuietly((Source) it.next());
            }
        }

        public final Response edit() {
            String str = this.key;
            return this.this$0.edit(this.sequenceNumber, str);
        }

        public final Source getSource(int i) {
            return (Source) this.sources.get(i);
        }
    }

    public DiskLruCache(FileSystem fileSystem, Path path, long j, TaskRunner taskRunner) {
        fileSystem.getClass();
        taskRunner.getClass();
        this.directory = path;
        this.fileSystem = new DiskLruCache$fileSystem$1(fileSystem);
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), _UtilJvmKt.okHttpName, " Cache"), 0, this);
        if (j <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("maxSize <= 0");
            throw null;
        }
        this.journalFile = path.resolve("journal");
        this.journalFileTmp = path.resolve("journal.tmp");
        this.journalFileBackup = path.resolve("journal.bkp");
    }

    public static void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matches(str)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    public final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.initialized && !this.closed) {
                Collection values = this.lruEntries.values();
                values.getClass();
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    entry.getClass();
                    Response response = entry.currentEditor;
                    if (response != null) {
                        response.detach$okhttp();
                    }
                }
                trimToSize();
                RealBufferedSink realBufferedSink = this.journalWriter;
                if (realBufferedSink != null) {
                    _UtilCommonKt.closeQuietly(realBufferedSink);
                }
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void completeEdit$okhttp(Response response, boolean z) {
        Entry entry$okhttp = response.getEntry$okhttp();
        if (!Intrinsics.areEqual(entry$okhttp.currentEditor, response)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z && !entry$okhttp.readable) {
            for (int i = 0; i < 2; i++) {
                boolean[] written$okhttp = response.getWritten$okhttp();
                written$okhttp.getClass();
                if (!written$okhttp[i]) {
                    response.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.fileSystem.exists((Path) entry$okhttp.dirtyFiles.get(i))) {
                    response.abort();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < 2; i2++) {
            Path path = (Path) entry$okhttp.dirtyFiles.get(i2);
            if (!z || entry$okhttp.zombie) {
                _UtilCommonKt.deleteIfExists(this.fileSystem, path);
            } else if (this.fileSystem.exists(path)) {
                Path path2 = (Path) entry$okhttp.cleanFiles.get(i2);
                this.fileSystem.atomicMove(path, path2);
                long j = entry$okhttp.lengths[i2];
                Long l = (Long) this.fileSystem.metadata(path2).size;
                long longValue = l != null ? l.longValue() : 0L;
                entry$okhttp.lengths[i2] = longValue;
                this.size = (this.size - j) + longValue;
            }
        }
        entry$okhttp.currentEditor = null;
        if (entry$okhttp.zombie) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        RealBufferedSink realBufferedSink = this.journalWriter;
        realBufferedSink.getClass();
        if (!entry$okhttp.readable && !z) {
            this.lruEntries.remove(entry$okhttp.key);
            realBufferedSink.writeUtf8(REMOVE);
            realBufferedSink.writeByte(32);
            realBufferedSink.writeUtf8(entry$okhttp.key);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (this.size <= this.maxSize || journalRebuildRequired()) {
                this.cleanupQueue.schedule(this.cleanupTask, 0L);
            }
        }
        entry$okhttp.readable = true;
        realBufferedSink.writeUtf8(CLEAN);
        realBufferedSink.writeByte(32);
        realBufferedSink.writeUtf8(entry$okhttp.key);
        for (long j2 : entry$okhttp.lengths) {
            realBufferedSink.writeByte(32);
            realBufferedSink.writeDecimalLong(j2);
        }
        realBufferedSink.writeByte(10);
        if (z) {
            long j3 = this.nextSequenceNumber;
            this.nextSequenceNumber = 1 + j3;
            entry$okhttp.sequenceNumber = j3;
        }
        realBufferedSink.flush();
        if (this.size <= this.maxSize) {
        }
        this.cleanupQueue.schedule(this.cleanupTask, 0L);
    }

    public final synchronized Response edit(long j, String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = (Entry) this.lruEntries.get(str);
        if (j != -1 && (entry == null || entry.sequenceNumber != j)) {
            return null;
        }
        if ((entry != null ? entry.currentEditor : null) != null) {
            return null;
        }
        if (entry != null && entry.lockingSourceCount != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            RealBufferedSink realBufferedSink = this.journalWriter;
            realBufferedSink.getClass();
            realBufferedSink.writeUtf8(DIRTY);
            realBufferedSink.writeByte(32);
            realBufferedSink.writeUtf8(str);
            realBufferedSink.writeByte(10);
            realBufferedSink.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, str);
                this.lruEntries.put(str, entry);
            }
            Response response = new Response(this, entry);
            entry.currentEditor = response;
            return response;
        }
        this.cleanupQueue.schedule(this.cleanupTask, 0L);
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            RealBufferedSink realBufferedSink = this.journalWriter;
            realBufferedSink.getClass();
            realBufferedSink.flush();
        }
    }

    public final synchronized Snapshot get(String str) {
        str.getClass();
        initialize();
        checkNotClosed();
        validateKey(str);
        Entry entry = (Entry) this.lruEntries.get(str);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        RealBufferedSink realBufferedSink = this.journalWriter;
        realBufferedSink.getClass();
        realBufferedSink.writeUtf8(READ);
        realBufferedSink.writeByte(32);
        realBufferedSink.writeUtf8(str);
        realBufferedSink.writeByte(10);
        if (journalRebuildRequired()) {
            this.cleanupQueue.schedule(this.cleanupTask, 0L);
        }
        return snapshot$okhttp;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x0068, B:28:0x0074, B:24:0x00b7, B:33:0x007f, B:36:0x00b0, B:39:0x00b4, B:40:0x00b6, B:50:0x0064, B:51:0x00be, B:62:0x0053, B:59:0x004e, B:35:0x00a6, B:19:0x0041), top: B:3:0x0003, inners: #0, #2, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #3 {all -> 0x0027, blocks: (B:4:0x0003, B:9:0x000b, B:11:0x0015, B:14:0x0023, B:15:0x002a, B:16:0x002f, B:22:0x0068, B:28:0x0074, B:24:0x00b7, B:33:0x007f, B:36:0x00b0, B:39:0x00b4, B:40:0x00b6, B:50:0x0064, B:51:0x00be, B:62:0x0053, B:59:0x004e, B:35:0x00a6, B:19:0x0041), top: B:3:0x0003, inners: #0, #2, #7, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void initialize() {
        boolean z;
        try {
            TimeZone timeZone = _UtilJvmKt.UTC;
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                boolean exists = this.fileSystem.exists(this.journalFile);
                DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
                Path path = this.journalFileBackup;
                if (exists) {
                    diskLruCache$fileSystem$1.delete(path);
                } else {
                    diskLruCache$fileSystem$1.atomicMove(path, this.journalFile);
                }
            }
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$12 = this.fileSystem;
            Path path2 = this.journalFileBackup;
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            diskLruCache$fileSystem$12.getClass();
            path2.getClass();
            Sink sink = diskLruCache$fileSystem$12.sink(path2, false);
            try {
                diskLruCache$fileSystem$12.delete(path2, false);
                if (sink != null) {
                    try {
                        sink.close();
                    } catch (Throwable unused) {
                    }
                }
                z = true;
            } catch (IOException unused2) {
                if (sink != null) {
                    try {
                        sink.close();
                    } catch (Throwable th) {
                        th = th;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        diskLruCache$fileSystem$12.delete(path2, false);
                        z = false;
                        this.civilizedFileSystem = z;
                        if (this.fileSystem.exists(this.journalFile)) {
                        }
                        rebuildJournal$okhttp();
                        this.initialized = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (sink != null) {
                    try {
                        sink.close();
                    } catch (Throwable th3) {
                        ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
                    }
                }
                if (th != null) {
                }
            }
            this.civilizedFileSystem = z;
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Android10Platform android10Platform = Platform.platform;
                    Platform.platform.log(5, "DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", e);
                    try {
                        close();
                        _UtilCommonKt.deleteContents(this.fileSystem, this.directory);
                        this.closed = false;
                    } catch (Throwable th4) {
                        this.closed = false;
                        throw th4;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        return i >= 2000 && i >= this.lruEntries.size();
    }

    public final void processJournal() {
        Path path = this.journalFileTmp;
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
        _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, path);
        Iterator it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            Entry entry = (Entry) next;
            int i = 0;
            if (entry.currentEditor == null) {
                while (i < 2) {
                    this.size += entry.lengths[i];
                    i++;
                }
            } else {
                entry.currentEditor = null;
                while (i < 2) {
                    _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, (Path) entry.cleanFiles.get(i));
                    _UtilCommonKt.deleteIfExists(diskLruCache$fileSystem$1, (Path) entry.dirtyFiles.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void readJournal() {
        DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
        Path path = this.journalFile;
        RealBufferedSource buffer = Okio.buffer(diskLruCache$fileSystem$1.source(path));
        try {
            String readUtf8LineStrict = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict2 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict3 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict4 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            String readUtf8LineStrict5 = buffer.readUtf8LineStrict(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(readUtf8LineStrict) || !"1".equals(readUtf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(201105), readUtf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(2), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    readJournalLine(buffer.readUtf8LineStrict(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i - this.lruEntries.size();
                    if (buffer.exhausted()) {
                        RealBufferedSink realBufferedSink = this.journalWriter;
                        if (realBufferedSink != null) {
                            _UtilCommonKt.closeQuietly(realBufferedSink);
                        }
                        diskLruCache$fileSystem$1.getClass();
                        path.getClass();
                        this.journalWriter = new RealBufferedSink(new FaultHidingSink(diskLruCache$fileSystem$1.appendingSink(path), new Perfs$$ExternalSyntheticLambda2(this, 8)));
                    } else {
                        rebuildJournal$okhttp();
                    }
                    try {
                        buffer.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (th != null) {
                        throw th;
                    }
                    return;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                buffer.close();
            } catch (Throwable th3) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, th3);
            }
        }
    }

    public final void readJournalLine(String str) {
        String substring;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6);
        if (indexOf$default == -1) {
            a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
            return;
        }
        int i = indexOf$default + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4);
        LinkedHashMap linkedHashMap = this.lruEntries;
        if (indexOf$default2 == -1) {
            substring = str.substring(i);
            String str2 = REMOVE;
            if (indexOf$default == str2.length() && StringsKt__StringsJVMKt.startsWith(str, str2, false)) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf$default2);
        }
        Entry entry = (Entry) linkedHashMap.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            linkedHashMap.put(substring, entry);
        }
        if (indexOf$default2 != -1) {
            String str3 = CLEAN;
            if (indexOf$default == str3.length() && StringsKt__StringsJVMKt.startsWith(str, str3, false)) {
                List split$default = StringsKt.split$default(str.substring(indexOf$default2 + 1), new char[]{' '}, 6);
                entry.readable = true;
                entry.currentEditor = null;
                split$default.getClass();
                int size = split$default.size();
                entry.this$0.getClass();
                if (size != 2) {
                    a$$ExternalSyntheticBUOutline0.m$3(split$default, "unexpected journal line: ");
                    return;
                }
                try {
                    int size2 = split$default.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        entry.lengths[i2] = Long.parseLong((String) split$default.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    a$$ExternalSyntheticBUOutline0.m$3(split$default, "unexpected journal line: ");
                    return;
                }
            }
        }
        if (indexOf$default2 == -1) {
            String str4 = DIRTY;
            if (indexOf$default == str4.length() && StringsKt__StringsJVMKt.startsWith(str, str4, false)) {
                entry.currentEditor = new Response(this, entry);
                return;
            }
        }
        if (indexOf$default2 == -1) {
            String str5 = READ;
            if (indexOf$default == str5.length() && StringsKt__StringsJVMKt.startsWith(str, str5, false)) {
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4("unexpected journal line: ".concat(str));
    }

    public final synchronized void rebuildJournal$okhttp() {
        Throwable th;
        try {
            RealBufferedSink realBufferedSink = this.journalWriter;
            if (realBufferedSink != null) {
                realBufferedSink.close();
            }
            RealBufferedSink buffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp, false));
            try {
                buffer.writeUtf8("libcore.io.DiskLruCache");
                buffer.writeByte(10);
                buffer.writeUtf8("1");
                buffer.writeByte(10);
                buffer.writeDecimalLong(201105L);
                buffer.writeByte(10);
                buffer.writeDecimalLong(2L);
                buffer.writeByte(10);
                buffer.writeByte(10);
                for (Object obj : this.lruEntries.values()) {
                    obj.getClass();
                    Entry entry = (Entry) obj;
                    if (entry.currentEditor != null) {
                        buffer.writeUtf8(DIRTY);
                        buffer.writeByte(32);
                        buffer.writeUtf8(entry.key);
                        buffer.writeByte(10);
                    } else {
                        buffer.writeUtf8(CLEAN);
                        buffer.writeByte(32);
                        buffer.writeUtf8(entry.key);
                        for (long j : entry.lengths) {
                            buffer.writeByte(32);
                            buffer.writeDecimalLong(j);
                        }
                        buffer.writeByte(10);
                    }
                }
                try {
                    buffer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    buffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt__ExceptionsKt.addSuppressed(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean exists = this.fileSystem.exists(this.journalFile);
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$1 = this.fileSystem;
            if (exists) {
                diskLruCache$fileSystem$1.atomicMove(this.journalFile, this.journalFileBackup);
                this.fileSystem.atomicMove(this.journalFileTmp, this.journalFile);
                _UtilCommonKt.deleteIfExists(this.fileSystem, this.journalFileBackup);
            } else {
                diskLruCache$fileSystem$1.atomicMove(this.journalFileTmp, this.journalFile);
            }
            RealBufferedSink realBufferedSink2 = this.journalWriter;
            if (realBufferedSink2 != null) {
                _UtilCommonKt.closeQuietly(realBufferedSink2);
            }
            DiskLruCache$fileSystem$1 diskLruCache$fileSystem$12 = this.fileSystem;
            Path path = this.journalFile;
            diskLruCache$fileSystem$12.getClass();
            path.getClass();
            this.journalWriter = new RealBufferedSink(new FaultHidingSink(diskLruCache$fileSystem$12.appendingSink(path), new Perfs$$ExternalSyntheticLambda2(this, 8)));
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final void removeEntry$okhttp(Entry entry) {
        RealBufferedSink realBufferedSink;
        String str = entry.key;
        if (!this.civilizedFileSystem) {
            if (entry.lockingSourceCount > 0 && (realBufferedSink = this.journalWriter) != null) {
                realBufferedSink.writeUtf8(DIRTY);
                realBufferedSink.writeByte(32);
                realBufferedSink.writeUtf8(str);
                realBufferedSink.writeByte(10);
                realBufferedSink.flush();
            }
            if (entry.lockingSourceCount > 0 || entry.currentEditor != null) {
                entry.zombie = true;
                return;
            }
        }
        Response response = entry.currentEditor;
        if (response != null) {
            response.detach$okhttp();
        }
        for (int i = 0; i < 2; i++) {
            _UtilCommonKt.deleteIfExists(this.fileSystem, (Path) entry.cleanFiles.get(i));
            long j = this.size;
            long[] jArr = entry.lengths;
            this.size = j - jArr[i];
            jArr[i] = 0;
        }
        this.redundantOpCount++;
        RealBufferedSink realBufferedSink2 = this.journalWriter;
        if (realBufferedSink2 != null) {
            realBufferedSink2.writeUtf8(REMOVE);
            realBufferedSink2.writeByte(32);
            realBufferedSink2.writeUtf8(str);
            realBufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(str);
        if (journalRebuildRequired()) {
            this.cleanupQueue.schedule(this.cleanupTask, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        removeEntry$okhttp(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void trimToSize() {
        while (this.size > this.maxSize) {
            for (Object obj : this.lruEntries.values()) {
                obj.getClass();
                Entry entry = (Entry) obj;
                if (!entry.zombie) {
                    break;
                }
            }
            return;
        }
        this.mostRecentTrimFailed = false;
    }
}
