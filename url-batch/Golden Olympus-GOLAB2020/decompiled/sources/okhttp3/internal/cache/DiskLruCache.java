package okhttp3.internal.cache;

import f2.AbstractC2420c;
import io.jsonwebtoken.JwtParser;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.B;
import okio.f;
import okio.g;
import okio.k;
import okio.p;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class DiskLruCache implements Closeable, Flushable, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    private final FileSystem f42633b;

    /* renamed from: c, reason: collision with root package name */
    private final File f42634c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42635d;

    /* renamed from: e, reason: collision with root package name */
    private final int f42636e;

    /* renamed from: f, reason: collision with root package name */
    private long f42637f;

    /* renamed from: g, reason: collision with root package name */
    private final File f42638g;

    /* renamed from: h, reason: collision with root package name */
    private final File f42639h;

    /* renamed from: i, reason: collision with root package name */
    private final File f42640i;

    /* renamed from: j, reason: collision with root package name */
    private long f42641j;

    /* renamed from: k, reason: collision with root package name */
    private f f42642k;

    /* renamed from: l, reason: collision with root package name */
    private final LinkedHashMap f42643l;

    /* renamed from: m, reason: collision with root package name */
    private int f42644m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f42645n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f42646o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42647p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f42648q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f42649r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f42650s;

    /* renamed from: t, reason: collision with root package name */
    private long f42651t;

    /* renamed from: u, reason: collision with root package name */
    private final TaskQueue f42652u;

    /* renamed from: v, reason: collision with root package name */
    private final DiskLruCache$cleanupTask$1 f42653v;

    /* renamed from: w, reason: collision with root package name */
    public static final Companion f42629w = new Companion(null);

    /* renamed from: x, reason: collision with root package name */
    public static final String f42630x = "journal";

    /* renamed from: y, reason: collision with root package name */
    public static final String f42631y = "journal.tmp";

    /* renamed from: z, reason: collision with root package name */
    public static final String f42632z = "journal.bkp";

    /* renamed from: A, reason: collision with root package name */
    public static final String f42621A = "libcore.io.DiskLruCache";

    /* renamed from: B, reason: collision with root package name */
    public static final String f42622B = "1";

    /* renamed from: C, reason: collision with root package name */
    public static final long f42623C = -1;

    /* renamed from: D, reason: collision with root package name */
    public static final Regex f42624D = new Regex("[a-z0-9_-]{1,120}");

    /* renamed from: E, reason: collision with root package name */
    public static final String f42625E = "CLEAN";

    /* renamed from: F, reason: collision with root package name */
    public static final String f42626F = "DIRTY";

    /* renamed from: G, reason: collision with root package name */
    public static final String f42627G = "REMOVE";

    /* renamed from: H, reason: collision with root package name */
    public static final String f42628H = "READ";

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public final class Editor {

        /* renamed from: a, reason: collision with root package name */
        private final Entry f42654a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f42655b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f42656c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f42657d;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f42657d = diskLruCache;
            this.f42654a = entry;
            this.f42655b = entry.g() ? null : new boolean[diskLruCache.W()];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.f42657d;
            synchronized (diskLruCache) {
                try {
                    if (this.f42656c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f42654a.b(), this)) {
                        diskLruCache.n(this, false);
                    }
                    this.f42656c = true;
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.f42657d;
            synchronized (diskLruCache) {
                try {
                    if (this.f42656c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f42654a.b(), this)) {
                        diskLruCache.n(this, true);
                    }
                    this.f42656c = true;
                    Unit unit = Unit.f41027a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (Intrinsics.areEqual(this.f42654a.b(), this)) {
                if (this.f42657d.f42646o) {
                    this.f42657d.n(this, false);
                } else {
                    this.f42654a.q(true);
                }
            }
        }

        public final Entry d() {
            return this.f42654a;
        }

        public final boolean[] e() {
            return this.f42655b;
        }

        public final z f(int i4) {
            DiskLruCache diskLruCache = this.f42657d;
            synchronized (diskLruCache) {
                if (this.f42656c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.areEqual(this.f42654a.b(), this)) {
                    return p.b();
                }
                if (!this.f42654a.g()) {
                    boolean[] zArr = this.f42655b;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i4] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.V().b((File) this.f42654a.c().get(i4)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return p.b();
                }
            }
        }
    }

    @Metadata
    public final class Entry {

        /* renamed from: a, reason: collision with root package name */
        private final String f42660a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f42661b;

        /* renamed from: c, reason: collision with root package name */
        private final List f42662c;

        /* renamed from: d, reason: collision with root package name */
        private final List f42663d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f42664e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f42665f;

        /* renamed from: g, reason: collision with root package name */
        private Editor f42666g;

        /* renamed from: h, reason: collision with root package name */
        private int f42667h;

        /* renamed from: i, reason: collision with root package name */
        private long f42668i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f42669j;

        public Entry(DiskLruCache diskLruCache, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f42669j = diskLruCache;
            this.f42660a = key;
            this.f42661b = new long[diskLruCache.W()];
            this.f42662c = new ArrayList();
            this.f42663d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append(JwtParser.SEPARATOR_CHAR);
            int length = sb.length();
            int W3 = diskLruCache.W();
            for (int i4 = 0; i4 < W3; i4++) {
                sb.append(i4);
                this.f42662c.add(new File(this.f42669j.U(), sb.toString()));
                sb.append(".tmp");
                this.f42663d.add(new File(this.f42669j.U(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List list) {
            throw new IOException("unexpected journal line: " + list);
        }

        private final B k(int i4) {
            final B a4 = this.f42669j.V().a((File) this.f42662c.get(i4));
            if (this.f42669j.f42646o) {
                return a4;
            }
            this.f42667h++;
            final DiskLruCache diskLruCache = this.f42669j;
            return new k(a4) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1

                /* renamed from: g, reason: collision with root package name */
                private boolean f42670g;

                @Override // okio.k, okio.B, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (this.f42670g) {
                        return;
                    }
                    this.f42670g = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        try {
                            entry.n(entry.f() - 1);
                            if (entry.f() == 0 && entry.i()) {
                                diskLruCache2.f0(entry);
                            }
                            Unit unit = Unit.f41027a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }

        public final List a() {
            return this.f42662c;
        }

        public final Editor b() {
            return this.f42666g;
        }

        public final List c() {
            return this.f42663d;
        }

        public final String d() {
            return this.f42660a;
        }

        public final long[] e() {
            return this.f42661b;
        }

        public final int f() {
            return this.f42667h;
        }

        public final boolean g() {
            return this.f42664e;
        }

        public final long h() {
            return this.f42668i;
        }

        public final boolean i() {
            return this.f42665f;
        }

        public final void l(Editor editor) {
            this.f42666g = editor;
        }

        public final void m(List strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f42669j.W()) {
                j(strings);
                throw new W1.f();
            }
            try {
                int size = strings.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.f42661b[i4] = Long.parseLong((String) strings.get(i4));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new W1.f();
            }
        }

        public final void n(int i4) {
            this.f42667h = i4;
        }

        public final void o(boolean z4) {
            this.f42664e = z4;
        }

        public final void p(long j4) {
            this.f42668i = j4;
        }

        public final void q(boolean z4) {
            this.f42665f = z4;
        }

        public final Snapshot r() {
            DiskLruCache diskLruCache = this.f42669j;
            if (Util.f42596h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.f42664e) {
                return null;
            }
            if (!this.f42669j.f42646o && (this.f42666g != null || this.f42665f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f42661b.clone();
            int i4 = 0;
            try {
                int W3 = this.f42669j.W();
                for (int i5 = 0; i5 < W3; i5++) {
                    arrayList.add(k(i5));
                }
                return new Snapshot(this.f42669j, this.f42660a, this.f42668i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                int size = arrayList.size();
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    Util.l((B) obj);
                }
                try {
                    this.f42669j.f0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(f writer) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j4 : this.f42661b) {
                writer.w(32).P(j4);
            }
        }
    }

    @Metadata
    public final class Snapshot implements Closeable, AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        private final String f42673b;

        /* renamed from: c, reason: collision with root package name */
        private final long f42674c;

        /* renamed from: d, reason: collision with root package name */
        private final List f42675d;

        /* renamed from: e, reason: collision with root package name */
        private final long[] f42676e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DiskLruCache f42677f;

        public Snapshot(DiskLruCache diskLruCache, String key, long j4, List sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f42677f = diskLruCache;
            this.f42673b = key;
            this.f42674c = j4;
            this.f42675d = sources;
            this.f42676e = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f42675d.iterator();
            while (it.hasNext()) {
                Util.l((B) it.next());
            }
        }

        public final Editor m() {
            return this.f42677f.p(this.f42673b, this.f42674c);
        }

        public final B n(int i4) {
            return (B) this.f42675d.get(i4);
        }

        public final String o() {
            return this.f42673b;
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, int i4, int i5, long j4, TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f42633b = fileSystem;
        this.f42634c = directory;
        this.f42635d = i4;
        this.f42636e = i5;
        this.f42637f = j4;
        this.f42643l = new LinkedHashMap(0, 0.75f, true);
        this.f42652u = taskRunner.i();
        final String str = Util.f42597i + " Cache";
        this.f42653v = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                boolean z4;
                boolean Y3;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z4 = diskLruCache.f42647p;
                    if (!z4 || diskLruCache.Q()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.h0();
                    } catch (IOException unused) {
                        diskLruCache.f42649r = true;
                    }
                    try {
                        Y3 = diskLruCache.Y();
                        if (Y3) {
                            diskLruCache.d0();
                            diskLruCache.f42644m = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.f42650s = true;
                        diskLruCache.f42642k = p.c(p.b());
                    }
                    return -1L;
                }
            }
        };
        if (j4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i5 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f42638g = new File(directory, f42630x);
        this.f42639h = new File(directory, f42631y);
        this.f42640i = new File(directory, f42632z);
    }

    public static /* synthetic */ Editor J(DiskLruCache diskLruCache, String str, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = f42623C;
        }
        return diskLruCache.p(str, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        int i4 = this.f42644m;
        return i4 >= 2000 && i4 >= this.f42643l.size();
    }

    private final f Z() {
        return p.c(new FaultHidingSink(this.f42633b.g(this.f42638g), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void a0() {
        this.f42633b.f(this.f42639h);
        Iterator it = this.f42643l.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = (Entry) next;
            int i4 = 0;
            if (entry.b() == null) {
                int i5 = this.f42636e;
                while (i4 < i5) {
                    this.f42641j += entry.e()[i4];
                    i4++;
                }
            } else {
                entry.l(null);
                int i6 = this.f42636e;
                while (i4 < i6) {
                    this.f42633b.f((File) entry.a().get(i4));
                    this.f42633b.f((File) entry.c().get(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    private final void b0() {
        g d4 = p.d(this.f42633b.a(this.f42638g));
        try {
            String I3 = d4.I();
            String I4 = d4.I();
            String I5 = d4.I();
            String I6 = d4.I();
            String I7 = d4.I();
            if (!Intrinsics.areEqual(f42621A, I3) || !Intrinsics.areEqual(f42622B, I4) || !Intrinsics.areEqual(String.valueOf(this.f42635d), I5) || !Intrinsics.areEqual(String.valueOf(this.f42636e), I6) || I7.length() > 0) {
                throw new IOException("unexpected journal header: [" + I3 + ", " + I4 + ", " + I6 + ", " + I7 + ']');
            }
            int i4 = 0;
            while (true) {
                try {
                    c0(d4.I());
                    i4++;
                } catch (EOFException unused) {
                    this.f42644m = i4 - this.f42643l.size();
                    if (d4.v()) {
                        this.f42642k = Z();
                    } else {
                        d0();
                    }
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(d4, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void c0(String str) {
        String substring;
        int b02 = StringsKt.b0(str, ' ', 0, false, 6, null);
        if (b02 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i4 = b02 + 1;
        int b03 = StringsKt.b0(str, ' ', i4, false, 4, null);
        if (b03 == -1) {
            substring = str.substring(i4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = f42627G;
            if (b02 == str2.length() && StringsKt.K(str, str2, false, 2, null)) {
                this.f42643l.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i4, b03);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) this.f42643l.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            this.f42643l.put(substring, entry);
        }
        if (b03 != -1) {
            String str3 = f42625E;
            if (b02 == str3.length() && StringsKt.K(str, str3, false, 2, null)) {
                String substring2 = str.substring(b03 + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                List D02 = StringsKt.D0(substring2, new char[]{' '}, false, 0, 6, null);
                entry.o(true);
                entry.l(null);
                entry.m(D02);
                return;
            }
        }
        if (b03 == -1) {
            String str4 = f42626F;
            if (b02 == str4.length() && StringsKt.K(str, str4, false, 2, null)) {
                entry.l(new Editor(this, entry));
                return;
            }
        }
        if (b03 == -1) {
            String str5 = f42628H;
            if (b02 == str5.length() && StringsKt.K(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean g0() {
        for (Entry toEvict : this.f42643l.values()) {
            if (!toEvict.i()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                f0(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void i0(String str) {
        if (f42624D.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    private final synchronized void m() {
        if (this.f42648q) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized Snapshot N(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        X();
        m();
        i0(key);
        Entry entry = (Entry) this.f42643l.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot r4 = entry.r();
        if (r4 == null) {
            return null;
        }
        this.f42644m++;
        f fVar = this.f42642k;
        Intrinsics.checkNotNull(fVar);
        fVar.C(f42628H).w(32).C(key).w(10);
        if (Y()) {
            TaskQueue.j(this.f42652u, this.f42653v, 0L, 2, null);
        }
        return r4;
    }

    public final boolean Q() {
        return this.f42648q;
    }

    public final File U() {
        return this.f42634c;
    }

    public final FileSystem V() {
        return this.f42633b;
    }

    public final int W() {
        return this.f42636e;
    }

    public final synchronized void X() {
        try {
            if (Util.f42596h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f42647p) {
                return;
            }
            if (this.f42633b.d(this.f42640i)) {
                if (this.f42633b.d(this.f42638g)) {
                    this.f42633b.f(this.f42640i);
                } else {
                    this.f42633b.e(this.f42640i, this.f42638g);
                }
            }
            this.f42646o = Util.E(this.f42633b, this.f42640i);
            if (this.f42633b.d(this.f42638g)) {
                try {
                    b0();
                    a0();
                    this.f42647p = true;
                    return;
                } catch (IOException e4) {
                    Platform.f43120a.g().k("DiskLruCache " + this.f42634c + " is corrupt: " + e4.getMessage() + ", removing", 5, e4);
                    try {
                        o();
                        this.f42648q = false;
                    } catch (Throwable th) {
                        this.f42648q = false;
                        throw th;
                    }
                }
            }
            d0();
            this.f42647p = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Editor b4;
        try {
            if (this.f42647p && !this.f42648q) {
                Collection values = this.f42643l.values();
                Intrinsics.checkNotNullExpressionValue(values, "lruEntries.values");
                for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                    if (entry.b() != null && (b4 = entry.b()) != null) {
                        b4.c();
                    }
                }
                h0();
                f fVar = this.f42642k;
                Intrinsics.checkNotNull(fVar);
                fVar.close();
                this.f42642k = null;
                this.f42648q = true;
                return;
            }
            this.f42648q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d0() {
        try {
            f fVar = this.f42642k;
            if (fVar != null) {
                fVar.close();
            }
            f c4 = p.c(this.f42633b.b(this.f42639h));
            try {
                c4.C(f42621A).w(10);
                c4.C(f42622B).w(10);
                c4.P(this.f42635d).w(10);
                c4.P(this.f42636e).w(10);
                c4.w(10);
                for (Entry entry : this.f42643l.values()) {
                    if (entry.b() != null) {
                        c4.C(f42626F).w(32);
                        c4.C(entry.d());
                        c4.w(10);
                    } else {
                        c4.C(f42625E).w(32);
                        c4.C(entry.d());
                        entry.s(c4);
                        c4.w(10);
                    }
                }
                Unit unit = Unit.f41027a;
                AbstractC2420c.a(c4, null);
                if (this.f42633b.d(this.f42638g)) {
                    this.f42633b.e(this.f42638g, this.f42640i);
                }
                this.f42633b.e(this.f42639h, this.f42638g);
                this.f42633b.f(this.f42640i);
                this.f42642k = Z();
                this.f42645n = false;
                this.f42650s = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        X();
        m();
        i0(key);
        Entry entry = (Entry) this.f42643l.get(key);
        if (entry == null) {
            return false;
        }
        boolean f02 = f0(entry);
        if (f02 && this.f42641j <= this.f42637f) {
            this.f42649r = false;
        }
        return f02;
    }

    public final boolean f0(Entry entry) {
        f fVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f42646o) {
            if (entry.f() > 0 && (fVar = this.f42642k) != null) {
                fVar.C(f42626F);
                fVar.w(32);
                fVar.C(entry.d());
                fVar.w(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        Editor b4 = entry.b();
        if (b4 != null) {
            b4.c();
        }
        int i4 = this.f42636e;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f42633b.f((File) entry.a().get(i5));
            this.f42641j -= entry.e()[i5];
            entry.e()[i5] = 0;
        }
        this.f42644m++;
        f fVar2 = this.f42642k;
        if (fVar2 != null) {
            fVar2.C(f42627G);
            fVar2.w(32);
            fVar2.C(entry.d());
            fVar2.w(10);
        }
        this.f42643l.remove(entry.d());
        if (Y()) {
            TaskQueue.j(this.f42652u, this.f42653v, 0L, 2, null);
        }
        return true;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f42647p) {
            m();
            h0();
            f fVar = this.f42642k;
            Intrinsics.checkNotNull(fVar);
            fVar.flush();
        }
    }

    public final void h0() {
        while (this.f42641j > this.f42637f) {
            if (!g0()) {
                return;
            }
        }
        this.f42649r = false;
    }

    public final synchronized void n(Editor editor, boolean z4) {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Entry d4 = editor.d();
        if (!Intrinsics.areEqual(d4.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z4 && !d4.g()) {
            int i4 = this.f42636e;
            for (int i5 = 0; i5 < i4; i5++) {
                boolean[] e4 = editor.e();
                Intrinsics.checkNotNull(e4);
                if (!e4[i5]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                }
                if (!this.f42633b.d((File) d4.c().get(i5))) {
                    editor.a();
                    return;
                }
            }
        }
        int i6 = this.f42636e;
        for (int i7 = 0; i7 < i6; i7++) {
            File file = (File) d4.c().get(i7);
            if (!z4 || d4.i()) {
                this.f42633b.f(file);
            } else if (this.f42633b.d(file)) {
                File file2 = (File) d4.a().get(i7);
                this.f42633b.e(file, file2);
                long j4 = d4.e()[i7];
                long h4 = this.f42633b.h(file2);
                d4.e()[i7] = h4;
                this.f42641j = (this.f42641j - j4) + h4;
            }
        }
        d4.l(null);
        if (d4.i()) {
            f0(d4);
            return;
        }
        this.f42644m++;
        f fVar = this.f42642k;
        Intrinsics.checkNotNull(fVar);
        if (!d4.g() && !z4) {
            this.f42643l.remove(d4.d());
            fVar.C(f42627G).w(32);
            fVar.C(d4.d());
            fVar.w(10);
            fVar.flush();
            if (this.f42641j <= this.f42637f || Y()) {
                TaskQueue.j(this.f42652u, this.f42653v, 0L, 2, null);
            }
        }
        d4.o(true);
        fVar.C(f42625E).w(32);
        fVar.C(d4.d());
        d4.s(fVar);
        fVar.w(10);
        if (z4) {
            long j5 = this.f42651t;
            this.f42651t = 1 + j5;
            d4.p(j5);
        }
        fVar.flush();
        if (this.f42641j <= this.f42637f) {
        }
        TaskQueue.j(this.f42652u, this.f42653v, 0L, 2, null);
    }

    public final void o() {
        close();
        this.f42633b.c(this.f42634c);
    }

    public final synchronized Editor p(String key, long j4) {
        Intrinsics.checkNotNullParameter(key, "key");
        X();
        m();
        i0(key);
        Entry entry = (Entry) this.f42643l.get(key);
        if (j4 != f42623C && (entry == null || entry.h() != j4)) {
            return null;
        }
        if ((entry != null ? entry.b() : null) != null) {
            return null;
        }
        if (entry != null && entry.f() != 0) {
            return null;
        }
        if (!this.f42649r && !this.f42650s) {
            f fVar = this.f42642k;
            Intrinsics.checkNotNull(fVar);
            fVar.C(f42626F).w(32).C(key).w(10);
            fVar.flush();
            if (this.f42645n) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.f42643l.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.l(editor);
            return editor;
        }
        TaskQueue.j(this.f42652u, this.f42653v, 0L, 2, null);
        return null;
    }
}
