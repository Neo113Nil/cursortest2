package f2;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractC3212b;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class h implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    private final File f36632a;

    /* renamed from: b, reason: collision with root package name */
    private final FileWalkDirection f36633b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1 f36634c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f36635d;

    /* renamed from: e, reason: collision with root package name */
    private final Function2 f36636e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36637f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractC3212b {

        /* renamed from: b, reason: collision with root package name */
        private final ArrayDeque f36638b;

        private final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36640b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f36641c;

            /* renamed from: d, reason: collision with root package name */
            private int f36642d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f36643e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f36644f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f36644f = bVar;
            }

            @Override // f2.h.c
            public File b() {
                if (!this.f36643e && this.f36641c == null) {
                    Function1 function1 = h.this.f36634c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f36641c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = h.this.f36636e;
                        if (function2 != null) {
                            function2.invoke(a(), new C2418a(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f36643e = true;
                    }
                }
                File[] fileArr = this.f36641c;
                if (fileArr != null) {
                    int i4 = this.f36642d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i4 < fileArr.length) {
                        File[] fileArr2 = this.f36641c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i5 = this.f36642d;
                        this.f36642d = i5 + 1;
                        return fileArr2[i5];
                    }
                }
                if (!this.f36640b) {
                    this.f36640b = true;
                    return a();
                }
                Function1 function12 = h.this.f36635d;
                if (function12 != null) {
                    function12.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: f2.h$b$b, reason: collision with other inner class name */
        private final class C0216b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36645b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f36646c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f36646c = bVar;
            }

            @Override // f2.h.c
            public File b() {
                if (this.f36645b) {
                    return null;
                }
                this.f36645b = true;
                return a();
            }
        }

        private final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f36647b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f36648c;

            /* renamed from: d, reason: collision with root package name */
            private int f36649d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f36650e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f36650e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // f2.h.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File b() {
                Function2 function2;
                if (!this.f36647b) {
                    Function1 function1 = h.this.f36634c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.f36647b = true;
                    return a();
                }
                File[] fileArr = this.f36648c;
                if (fileArr != null) {
                    int i4 = this.f36649d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i4 >= fileArr.length) {
                        Function1 function12 = h.this.f36635d;
                        if (function12 != null) {
                            function12.invoke(a());
                        }
                        return null;
                    }
                }
                if (this.f36648c == null) {
                    File[] listFiles = a().listFiles();
                    this.f36648c = listFiles;
                    if (listFiles == null && (function2 = h.this.f36636e) != null) {
                        function2.invoke(a(), new C2418a(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f36648c;
                    if (fileArr2 != null) {
                        Intrinsics.checkNotNull(fileArr2);
                    }
                    Function1 function13 = h.this.f36635d;
                    if (function13 != null) {
                        function13.invoke(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.f36648c;
                Intrinsics.checkNotNull(fileArr3);
                int i5 = this.f36649d;
                this.f36649d = i5 + 1;
                return fileArr3[i5];
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f36651a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.f41125b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.f41126c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f36651a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f36638b = arrayDeque;
            if (h.this.f36632a.isDirectory()) {
                arrayDeque.push(b(h.this.f36632a));
            } else if (h.this.f36632a.isFile()) {
                arrayDeque.push(new C0216b(this, h.this.f36632a));
            } else {
                done();
            }
        }

        private final a b(File file) {
            int i4 = d.f36651a[h.this.f36633b.ordinal()];
            if (i4 == 1) {
                return new c(this, file);
            }
            if (i4 == 2) {
                return new a(this, file);
            }
            throw new W1.m();
        }

        private final File c() {
            File b4;
            while (true) {
                c cVar = (c) this.f36638b.peek();
                if (cVar == null) {
                    return null;
                }
                b4 = cVar.b();
                if (b4 == null) {
                    this.f36638b.pop();
                } else {
                    if (Intrinsics.areEqual(b4, cVar.a()) || !b4.isDirectory() || this.f36638b.size() >= h.this.f36637f) {
                        break;
                    }
                    this.f36638b.push(b(b4));
                }
            }
            return b4;
        }

        @Override // kotlin.collections.AbstractC3212b
        protected void computeNext() {
            File c4 = c();
            if (c4 != null) {
                setNext(c4);
            } else {
                done();
            }
        }
    }

    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final File f36652a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f36652a = root;
        }

        public final File a() {
            return this.f36652a;
        }

        public abstract File b();
    }

    private h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i4) {
        this.f36632a = file;
        this.f36633b = fileWalkDirection;
        this.f36634c = function1;
        this.f36635d = function12;
        this.f36636e = function2;
        this.f36637f = i4;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i5 & 2) != 0 ? FileWalkDirection.f41125b : fileWalkDirection, function1, function12, function2, (i5 & 32) != 0 ? Integer.MAX_VALUE : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
