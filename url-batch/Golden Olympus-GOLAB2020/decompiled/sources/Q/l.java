package Q;

import W1.AbstractC1233c;
import a2.AbstractC1241b;
import f2.AbstractC2420c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o2.InterfaceC3316J;
import r2.AbstractC3398h;
import r2.I;
import r2.InterfaceC3396f;
import r2.InterfaceC3397g;
import r2.u;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes.dex */
public final class l implements Q.e {

    /* renamed from: k, reason: collision with root package name */
    public static final a f9089k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Set f9090l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    private static final Object f9091m = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f9092a;

    /* renamed from: b, reason: collision with root package name */
    private final Q.j f9093b;

    /* renamed from: c, reason: collision with root package name */
    private final Q.a f9094c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3316J f9095d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3396f f9096e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9097f;

    /* renamed from: g, reason: collision with root package name */
    private final W1.h f9098g;

    /* renamed from: h, reason: collision with root package name */
    private final u f9099h;

    /* renamed from: i, reason: collision with root package name */
    private List f9100i;

    /* renamed from: j, reason: collision with root package name */
    private final Q.k f9101j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return l.f9090l;
        }

        public final Object b() {
            return l.f9091m;
        }

        private a() {
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Q.m f9102a;

            public a(Q.m mVar) {
                super(null);
                this.f9102a = mVar;
            }

            public Q.m a() {
                return this.f9102a;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static final class c extends OutputStream implements AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        private final FileOutputStream f9103b;

        public c(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.f9103b = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f9103b.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i4) {
            this.f9103b.write(i4);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b4) {
            Intrinsics.checkNotNullParameter(b4, "b");
            this.f9103b.write(b4);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i4, int i5) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.f9103b.write(bytes, i4, i5);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    static final class d extends s implements Function1 {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.f41027a;
        }

        public final void invoke(Throwable th) {
            if (th != null) {
                l.this.f9099h.setValue(new Q.g(th));
            }
            a aVar = l.f9089k;
            Object b4 = aVar.b();
            l lVar = l.this;
            synchronized (b4) {
                aVar.a().remove(lVar.m().getAbsolutePath());
                Unit unit = Unit.f41027a;
            }
        }
    }

    static final class e extends s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final e f9105i = new e();

        e() {
            super(2);
        }

        public final void a(b msg, Throwable th) {
            Intrinsics.checkNotNullParameter(msg, "msg");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return Unit.f41027a;
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f9106l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f9107m;

        f(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, kotlin.coroutines.d dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            f fVar = l.this.new f(dVar);
            fVar.f9107m = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f9106l;
            if (i4 == 0) {
                ResultKt.a(obj);
                b bVar = (b) this.f9107m;
                if (bVar instanceof b.a) {
                    this.f9106l = 1;
                    if (l.this.n((b.a) bVar, this) == f4) {
                        return f4;
                    }
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: l, reason: collision with root package name */
        int f9109l;

        /* renamed from: m, reason: collision with root package name */
        private /* synthetic */ Object f9110m;

        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* renamed from: l, reason: collision with root package name */
            int f9112l;

            /* renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f9113m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Q.m f9114n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q.m mVar, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f9114n = mVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Q.m mVar, kotlin.coroutines.d dVar) {
                return ((a) create(mVar, dVar)).invokeSuspend(Unit.f41027a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
                a aVar = new a(this.f9114n, dVar);
                aVar.f9113m = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC1241b.f();
                if (this.f9112l != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                Q.m mVar = (Q.m) this.f9113m;
                Q.m mVar2 = this.f9114n;
                boolean z4 = false;
                if (!(mVar2 instanceof Q.b) && !(mVar2 instanceof Q.g) && mVar == mVar2) {
                    z4 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z4);
            }
        }

        public static final class b implements InterfaceC3396f {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3396f f9115b;

            public static final class a implements InterfaceC3397g {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC3397g f9116b;

                /* renamed from: Q.l$g$b$a$a, reason: collision with other inner class name */
                public static final class C0059a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: l, reason: collision with root package name */
                    /* synthetic */ Object f9117l;

                    /* renamed from: m, reason: collision with root package name */
                    int f9118m;

                    public C0059a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f9117l = obj;
                        this.f9118m |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC3397g interfaceC3397g) {
                    this.f9116b = interfaceC3397g;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // r2.InterfaceC3397g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object emit(Object obj, kotlin.coroutines.d dVar) {
                    C0059a c0059a;
                    int i4;
                    if (dVar instanceof C0059a) {
                        c0059a = (C0059a) dVar;
                        int i5 = c0059a.f9118m;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            c0059a.f9118m = i5 - Integer.MIN_VALUE;
                            Object obj2 = c0059a.f9117l;
                            Object f4 = AbstractC1241b.f();
                            i4 = c0059a.f9118m;
                            if (i4 != 0) {
                                ResultKt.a(obj2);
                                InterfaceC3397g interfaceC3397g = this.f9116b;
                                Q.m mVar = (Q.m) obj;
                                if (mVar instanceof Q.i) {
                                    throw ((Q.i) mVar).a();
                                }
                                if (mVar instanceof Q.g) {
                                    throw ((Q.g) mVar).a();
                                }
                                if (!(mVar instanceof Q.b)) {
                                    if (mVar instanceof Q.n) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new W1.m();
                                }
                                Object a4 = ((Q.b) mVar).a();
                                c0059a.f9118m = 1;
                                if (interfaceC3397g.emit(a4, c0059a) == f4) {
                                    return f4;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.a(obj2);
                            }
                            return Unit.f41027a;
                        }
                    }
                    c0059a = new C0059a(dVar);
                    Object obj22 = c0059a.f9117l;
                    Object f42 = AbstractC1241b.f();
                    i4 = c0059a.f9118m;
                    if (i4 != 0) {
                    }
                    return Unit.f41027a;
                }
            }

            public b(InterfaceC3396f interfaceC3396f) {
                this.f9115b = interfaceC3396f;
            }

            @Override // r2.InterfaceC3396f
            public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
                Object a4 = this.f9115b.a(new a(interfaceC3397g), dVar);
                return a4 == AbstractC1241b.f() ? a4 : Unit.f41027a;
            }
        }

        g(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            return ((g) create(interfaceC3397g, dVar)).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            g gVar = l.this.new g(dVar);
            gVar.f9110m = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f9109l;
            if (i4 == 0) {
                ResultKt.a(obj);
                InterfaceC3397g interfaceC3397g = (InterfaceC3397g) this.f9110m;
                Q.m mVar = (Q.m) l.this.f9099h.getValue();
                if (!(mVar instanceof Q.b)) {
                    l.this.f9101j.e(new b.a(mVar));
                }
                b bVar = new b(AbstractC3398h.i(l.this.f9099h, new a(mVar, null)));
                this.f9109l = 1;
                if (AbstractC3398h.k(interfaceC3397g, bVar, this) == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            return Unit.f41027a;
        }
    }

    static final class h extends s implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            File file = (File) l.this.f9092a.invoke();
            String it = file.getAbsolutePath();
            a aVar = l.f9089k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(it)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set a4 = aVar.a();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                a4.add(it);
            }
            return file;
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f9121l;

        /* renamed from: m, reason: collision with root package name */
        Object f9122m;

        /* renamed from: n, reason: collision with root package name */
        Object f9123n;

        /* renamed from: o, reason: collision with root package name */
        Object f9124o;

        /* renamed from: p, reason: collision with root package name */
        Object f9125p;

        /* renamed from: q, reason: collision with root package name */
        Object f9126q;

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f9127r;

        /* renamed from: t, reason: collision with root package name */
        int f9129t;

        i(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9127r = obj;
            this.f9129t |= Integer.MIN_VALUE;
            return l.this.o(this);
        }
    }

    public static final class j implements Q.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3515a f9130a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ D f9131b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ G f9132c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f9133d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: l, reason: collision with root package name */
            Object f9134l;

            /* renamed from: m, reason: collision with root package name */
            Object f9135m;

            /* renamed from: n, reason: collision with root package name */
            Object f9136n;

            /* renamed from: o, reason: collision with root package name */
            Object f9137o;

            /* renamed from: p, reason: collision with root package name */
            Object f9138p;

            /* renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f9139q;

            /* renamed from: s, reason: collision with root package name */
            int f9141s;

            a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f9139q = obj;
                this.f9141s |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        j(InterfaceC3515a interfaceC3515a, D d4, G g4, l lVar) {
            this.f9130a = interfaceC3515a;
            this.f9131b = d4;
            this.f9132c = g4;
            this.f9133d = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // Q.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(Function2 function2, kotlin.coroutines.d dVar) {
            a aVar;
            int i4;
            InterfaceC3515a interfaceC3515a;
            l lVar;
            D d4;
            G g4;
            InterfaceC3515a interfaceC3515a2;
            InterfaceC3515a interfaceC3515a3;
            l lVar2;
            Object obj;
            G g5;
            try {
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i5 = aVar.f9141s;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aVar.f9141s = i5 - Integer.MIN_VALUE;
                        Object obj2 = aVar.f9139q;
                        Object f4 = AbstractC1241b.f();
                        i4 = aVar.f9141s;
                        if (i4 != 0) {
                            ResultKt.a(obj2);
                            interfaceC3515a = this.f9130a;
                            D d5 = this.f9131b;
                            G g6 = this.f9132c;
                            lVar = this.f9133d;
                            aVar.f9134l = function2;
                            aVar.f9135m = interfaceC3515a;
                            aVar.f9136n = d5;
                            aVar.f9137o = g6;
                            aVar.f9138p = lVar;
                            aVar.f9141s = 1;
                            if (interfaceC3515a.b(null, aVar) != f4) {
                                d4 = d5;
                                g4 = g6;
                            }
                            return f4;
                        }
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = aVar.f9136n;
                                g5 = (G) aVar.f9135m;
                                interfaceC3515a2 = (InterfaceC3515a) aVar.f9134l;
                                try {
                                    ResultKt.a(obj2);
                                    g5.f41132b = obj;
                                    g4 = g5;
                                    Object obj3 = g4.f41132b;
                                    interfaceC3515a2.c(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC3515a2.c(null);
                                    throw th;
                                }
                            }
                            lVar2 = (l) aVar.f9136n;
                            g4 = (G) aVar.f9135m;
                            interfaceC3515a3 = (InterfaceC3515a) aVar.f9134l;
                            try {
                                ResultKt.a(obj2);
                                if (!Intrinsics.areEqual(obj2, g4.f41132b)) {
                                    interfaceC3515a2 = interfaceC3515a3;
                                    Object obj32 = g4.f41132b;
                                    interfaceC3515a2.c(null);
                                    return obj32;
                                }
                                aVar.f9134l = interfaceC3515a3;
                                aVar.f9135m = g4;
                                aVar.f9136n = obj2;
                                aVar.f9141s = 3;
                                if (lVar2.s(obj2, aVar) != f4) {
                                    obj = obj2;
                                    g5 = g4;
                                    interfaceC3515a2 = interfaceC3515a3;
                                    g5.f41132b = obj;
                                    g4 = g5;
                                    Object obj322 = g4.f41132b;
                                    interfaceC3515a2.c(null);
                                    return obj322;
                                }
                                return f4;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC3515a2 = interfaceC3515a3;
                                interfaceC3515a2.c(null);
                                throw th;
                            }
                        }
                        l lVar3 = (l) aVar.f9138p;
                        g4 = (G) aVar.f9137o;
                        d4 = (D) aVar.f9136n;
                        InterfaceC3515a interfaceC3515a4 = (InterfaceC3515a) aVar.f9135m;
                        Function2 function22 = (Function2) aVar.f9134l;
                        ResultKt.a(obj2);
                        lVar = lVar3;
                        function2 = function22;
                        interfaceC3515a = interfaceC3515a4;
                        if (!d4.f41129b) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj4 = g4.f41132b;
                        aVar.f9134l = interfaceC3515a;
                        aVar.f9135m = g4;
                        aVar.f9136n = lVar;
                        aVar.f9137o = null;
                        aVar.f9138p = null;
                        aVar.f9141s = 2;
                        Object invoke = function2.invoke(obj4, aVar);
                        if (invoke != f4) {
                            interfaceC3515a3 = interfaceC3515a;
                            obj2 = invoke;
                            lVar2 = lVar;
                            if (!Intrinsics.areEqual(obj2, g4.f41132b)) {
                            }
                        }
                        return f4;
                    }
                }
                if (!d4.f41129b) {
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC3515a2 = interfaceC3515a;
                interfaceC3515a2.c(null);
                throw th;
            }
            aVar = new a(dVar);
            Object obj22 = aVar.f9139q;
            Object f42 = AbstractC1241b.f();
            i4 = aVar.f9141s;
            if (i4 != 0) {
            }
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f9142l;

        /* renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f9143m;

        /* renamed from: o, reason: collision with root package name */
        int f9145o;

        k(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9143m = obj;
            this.f9145o |= Integer.MIN_VALUE;
            return l.this.p(this);
        }
    }

    /* renamed from: Q.l$l, reason: collision with other inner class name */
    static final class C0060l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f9146l;

        /* renamed from: m, reason: collision with root package name */
        Object f9147m;

        /* renamed from: n, reason: collision with root package name */
        Object f9148n;

        /* renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f9149o;

        /* renamed from: q, reason: collision with root package name */
        int f9151q;

        C0060l(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9149o = obj;
            this.f9151q |= Integer.MIN_VALUE;
            return l.this.q(this);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f9152l;

        /* renamed from: m, reason: collision with root package name */
        Object f9153m;

        /* renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f9154n;

        /* renamed from: p, reason: collision with root package name */
        int f9156p;

        m(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9154n = obj;
            this.f9156p |= Integer.MIN_VALUE;
            return l.this.r(this);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f9157l;

        /* renamed from: m, reason: collision with root package name */
        Object f9158m;

        /* renamed from: n, reason: collision with root package name */
        Object f9159n;

        /* renamed from: o, reason: collision with root package name */
        Object f9160o;

        /* renamed from: p, reason: collision with root package name */
        Object f9161p;

        /* renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f9162q;

        /* renamed from: s, reason: collision with root package name */
        int f9164s;

        n(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9162q = obj;
            this.f9164s |= Integer.MIN_VALUE;
            return l.this.s(null, this);
        }
    }

    public l(Function0 produceFile, Q.j serializer, List initTasksList, Q.a corruptionHandler, InterfaceC3316J scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f9092a = produceFile;
        this.f9093b = serializer;
        this.f9094c = corruptionHandler;
        this.f9095d = scope;
        this.f9096e = AbstractC3398h.o(new g(null));
        this.f9097f = ".tmp";
        this.f9098g = W1.i.b(new h());
        this.f9099h = I.a(Q.n.f9165a);
        this.f9100i = CollectionsKt.toList(initTasksList);
        this.f9101j = new Q.k(scope, new d(), e.f9105i, new f(null));
    }

    private final void l(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File m() {
        return (File) this.f9098g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object n(b.a aVar, kotlin.coroutines.d dVar) {
        Q.m mVar = (Q.m) this.f9099h.getValue();
        if (!(mVar instanceof Q.b)) {
            if (mVar instanceof Q.i) {
                if (mVar == aVar.a()) {
                    Object p4 = p(dVar);
                    return p4 == AbstractC1241b.f() ? p4 : Unit.f41027a;
                }
            } else {
                if (Intrinsics.areEqual(mVar, Q.n.f9165a)) {
                    Object p5 = p(dVar);
                    return p5 == AbstractC1241b.f() ? p5 : Unit.f41027a;
                }
                if (mVar instanceof Q.g) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(kotlin.coroutines.d dVar) {
        i iVar;
        int i4;
        InterfaceC3515a b4;
        G g4;
        l lVar;
        G g5;
        List list;
        l lVar2;
        G g6;
        j jVar;
        Iterator it;
        InterfaceC3515a interfaceC3515a;
        D d4;
        D d5;
        i iVar2;
        l lVar3;
        G g7;
        InterfaceC3515a interfaceC3515a2;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i5 = iVar.f9129t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                iVar.f9129t = i5 - Integer.MIN_VALUE;
                Object obj = iVar.f9127r;
                Object f4 = AbstractC1241b.f();
                i4 = iVar.f9129t;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    if (!(Intrinsics.areEqual(this.f9099h.getValue(), Q.n.f9165a) || (this.f9099h.getValue() instanceof Q.i))) {
                        throw new IllegalStateException("Check failed.");
                    }
                    b4 = AbstractC3517c.b(false, 1, null);
                    g4 = new G();
                    iVar.f9121l = this;
                    iVar.f9122m = b4;
                    iVar.f9123n = g4;
                    iVar.f9124o = g4;
                    iVar.f9129t = 1;
                    obj = r(iVar);
                    if (obj != f4) {
                        lVar = this;
                        g5 = g4;
                    }
                    return f4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3515a2 = (InterfaceC3515a) iVar.f9124o;
                        d5 = (D) iVar.f9123n;
                        g7 = (G) iVar.f9122m;
                        lVar3 = (l) iVar.f9121l;
                        ResultKt.a(obj);
                        try {
                            d5.f41129b = true;
                            Unit unit = Unit.f41027a;
                            interfaceC3515a2.c(null);
                            u uVar = lVar3.f9099h;
                            Object obj2 = g7.f41132b;
                            uVar.setValue(new Q.b(obj2, obj2 != null ? obj2.hashCode() : 0));
                            return Unit.f41027a;
                        } catch (Throwable th) {
                            interfaceC3515a2.c(null);
                            throw th;
                        }
                    }
                    it = (Iterator) iVar.f9126q;
                    jVar = (j) iVar.f9125p;
                    d4 = (D) iVar.f9124o;
                    g6 = (G) iVar.f9123n;
                    interfaceC3515a = (InterfaceC3515a) iVar.f9122m;
                    lVar2 = (l) iVar.f9121l;
                    ResultKt.a(obj);
                    while (it.hasNext()) {
                        Function2 function2 = (Function2) it.next();
                        iVar.f9121l = lVar2;
                        iVar.f9122m = interfaceC3515a;
                        iVar.f9123n = g6;
                        iVar.f9124o = d4;
                        iVar.f9125p = jVar;
                        iVar.f9126q = it;
                        iVar.f9129t = 2;
                        if (function2.invoke(jVar, iVar) == f4) {
                            break;
                        }
                    }
                    iVar2 = iVar;
                    d5 = d4;
                    g5 = g6;
                    b4 = interfaceC3515a;
                    lVar3 = lVar2;
                    lVar3.f9100i = null;
                    iVar2.f9121l = lVar3;
                    iVar2.f9122m = g5;
                    iVar2.f9123n = d5;
                    iVar2.f9124o = b4;
                    iVar2.f9125p = null;
                    iVar2.f9126q = null;
                    iVar2.f9129t = 3;
                    if (b4.b(null, iVar2) != f4) {
                        g7 = g5;
                        interfaceC3515a2 = b4;
                        d5.f41129b = true;
                        Unit unit2 = Unit.f41027a;
                        interfaceC3515a2.c(null);
                        u uVar2 = lVar3.f9099h;
                        Object obj22 = g7.f41132b;
                        uVar2.setValue(new Q.b(obj22, obj22 != null ? obj22.hashCode() : 0));
                        return Unit.f41027a;
                    }
                    return f4;
                }
                g4 = (G) iVar.f9124o;
                g5 = (G) iVar.f9123n;
                b4 = (InterfaceC3515a) iVar.f9122m;
                lVar = (l) iVar.f9121l;
                ResultKt.a(obj);
                g4.f41132b = obj;
                D d6 = new D();
                j jVar2 = new j(b4, d6, g5, lVar);
                list = lVar.f9100i;
                if (list != null) {
                    d5 = d6;
                    iVar2 = iVar;
                    lVar3 = lVar;
                    lVar3.f9100i = null;
                    iVar2.f9121l = lVar3;
                    iVar2.f9122m = g5;
                    iVar2.f9123n = d5;
                    iVar2.f9124o = b4;
                    iVar2.f9125p = null;
                    iVar2.f9126q = null;
                    iVar2.f9129t = 3;
                    if (b4.b(null, iVar2) != f4) {
                    }
                    return f4;
                }
                lVar2 = lVar;
                g6 = g5;
                jVar = jVar2;
                it = list.iterator();
                interfaceC3515a = b4;
                d4 = d6;
                while (it.hasNext()) {
                }
                iVar2 = iVar;
                d5 = d4;
                g5 = g6;
                b4 = interfaceC3515a;
                lVar3 = lVar2;
                lVar3.f9100i = null;
                iVar2.f9121l = lVar3;
                iVar2.f9122m = g5;
                iVar2.f9123n = d5;
                iVar2.f9124o = b4;
                iVar2.f9125p = null;
                iVar2.f9126q = null;
                iVar2.f9129t = 3;
                if (b4.b(null, iVar2) != f4) {
                }
                return f4;
            }
        }
        iVar = new i(dVar);
        Object obj3 = iVar.f9127r;
        Object f42 = AbstractC1241b.f();
        i4 = iVar.f9129t;
        if (i4 != 0) {
        }
        g4.f41132b = obj3;
        D d62 = new D();
        j jVar22 = new j(b4, d62, g5, lVar);
        list = lVar.f9100i;
        if (list != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(kotlin.coroutines.d dVar) {
        k kVar;
        int i4;
        l lVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i5 = kVar.f9145o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                kVar.f9145o = i5 - Integer.MIN_VALUE;
                Object obj = kVar.f9143m;
                Object f4 = AbstractC1241b.f();
                i4 = kVar.f9145o;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    try {
                        kVar.f9142l = this;
                        kVar.f9145o = 1;
                        if (o(kVar) == f4) {
                            return f4;
                        }
                    } catch (Throwable th) {
                        th = th;
                        lVar = this;
                        lVar.f9099h.setValue(new Q.i(th));
                        return Unit.f41027a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar = (l) kVar.f9142l;
                    try {
                        ResultKt.a(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        lVar.f9099h.setValue(new Q.i(th));
                        return Unit.f41027a;
                    }
                }
                return Unit.f41027a;
            }
        }
        kVar = new k(dVar);
        Object obj2 = kVar.f9143m;
        Object f42 = AbstractC1241b.f();
        i4 = kVar.f9145o;
        if (i4 != 0) {
        }
        return Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [Q.l] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Q.l$l, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Q.l] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [Q.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(kotlin.coroutines.d dVar) {
        ?? r02;
        int i4;
        ?? fileInputStream;
        Throwable th;
        Closeable closeable;
        try {
            if (dVar instanceof C0060l) {
                C0060l c0060l = (C0060l) dVar;
                int i5 = c0060l.f9151q;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0060l.f9151q = i5 - Integer.MIN_VALUE;
                    r02 = c0060l;
                    Object obj = r02.f9149o;
                    Object f4 = AbstractC1241b.f();
                    i4 = r02.f9151q;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        try {
                            fileInputStream = new FileInputStream(m());
                            try {
                                ?? r6 = this.f9093b;
                                r02.f9146l = this;
                                r02.f9147m = fileInputStream;
                                r02.f9148n = null;
                                r02.f9151q = 1;
                                obj = r6.readFrom(fileInputStream, r02);
                                if (obj == f4) {
                                    return f4;
                                }
                                th = null;
                                closeable = fileInputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r02 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e4) {
                            e = e4;
                            r02 = this;
                            if (r02.m().exists()) {
                                throw e;
                            }
                            return r02.f9093b.getDefaultValue();
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) r02.f9148n;
                        fileInputStream = (Closeable) r02.f9147m;
                        r02 = (l) r02.f9146l;
                        try {
                            ResultKt.a(obj);
                            closeable = fileInputStream;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } finally {
                                AbstractC2420c.a(fileInputStream, th);
                            }
                        }
                    }
                    return obj;
                }
            }
            if (i4 != 0) {
            }
            return obj;
        } catch (FileNotFoundException e5) {
            e = e5;
        }
        r02 = new C0060l(dVar);
        Object obj2 = r02.f9149o;
        Object f42 = AbstractC1241b.f();
        i4 = r02.f9151q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(kotlin.coroutines.d dVar) {
        m mVar;
        int i4;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i5 = mVar.f9156p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                mVar.f9156p = i5 - Integer.MIN_VALUE;
                Object obj = mVar.f9154n;
                Object f4 = AbstractC1241b.f();
                i4 = mVar.f9156p;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    mVar.f9152l = this;
                    mVar.f9156p = 1;
                    Object q4 = q(mVar);
                    if (q4 != f4) {
                        return q4;
                    }
                } else {
                    if (i4 == 1) {
                        ResultKt.a(obj);
                        return obj;
                    }
                    try {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = mVar.f9153m;
                            android.support.v4.media.session.b.a(mVar.f9152l);
                            ResultKt.a(obj);
                            return obj2;
                        }
                        android.support.v4.media.session.b.a(mVar.f9153m);
                        l lVar = (l) mVar.f9152l;
                        ResultKt.a(obj);
                        mVar.f9152l = null;
                        mVar.f9153m = obj;
                        mVar.f9156p = 3;
                        if (lVar.s(obj, mVar) != f4) {
                            return obj;
                        }
                    } catch (IOException e4) {
                        AbstractC1233c.a(null, e4);
                        throw null;
                    }
                }
                return f4;
            }
        }
        mVar = new m(dVar);
        Object obj3 = mVar.f9154n;
        Object f42 = AbstractC1241b.f();
        i4 = mVar.f9156p;
        if (i4 != 0) {
        }
        return f42;
    }

    @Override // Q.e
    public InterfaceC3396f getData() {
        return this.f9096e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, kotlin.coroutines.d dVar) {
        n nVar;
        int i4;
        ?? r32;
        File file;
        ?? fileOutputStream;
        l lVar;
        FileOutputStream fileOutputStream2;
        Throwable th;
        try {
            if (dVar instanceof n) {
                nVar = (n) dVar;
                int i5 = nVar.f9164s;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    nVar.f9164s = i5 - Integer.MIN_VALUE;
                    Object obj2 = nVar.f9162q;
                    Object f4 = AbstractC1241b.f();
                    i4 = nVar.f9164s;
                    r32 = 1;
                    if (i4 != 0) {
                        ResultKt.a(obj2);
                        l(m());
                        file = new File(Intrinsics.stringPlus(m().getAbsolutePath(), this.f9097f));
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                Q.j jVar = this.f9093b;
                                c cVar = new c(fileOutputStream);
                                nVar.f9157l = this;
                                nVar.f9158m = file;
                                nVar.f9159n = fileOutputStream;
                                nVar.f9160o = null;
                                nVar.f9161p = fileOutputStream;
                                nVar.f9164s = 1;
                                if (jVar.writeTo(obj, cVar, nVar) == f4) {
                                    return f4;
                                }
                                lVar = this;
                                r32 = file;
                                fileOutputStream2 = fileOutputStream;
                                th = null;
                                fileOutputStream = fileOutputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r32 = file;
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileOutputStream2 = (FileOutputStream) nVar.f9161p;
                        th = (Throwable) nVar.f9160o;
                        fileOutputStream = (Closeable) nVar.f9159n;
                        r32 = (File) nVar.f9158m;
                        lVar = (l) nVar.f9157l;
                        try {
                            ResultKt.a(obj2);
                            fileOutputStream = fileOutputStream;
                            r32 = r32;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                AbstractC2420c.a(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    Unit unit = Unit.f41027a;
                    AbstractC2420c.a(fileOutputStream, th);
                    if (!r32.renameTo(lVar.m())) {
                        return Unit.f41027a;
                    }
                    throw new IOException("Unable to rename " + r32 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (i4 != 0) {
            }
            fileOutputStream2.getFD().sync();
            Unit unit2 = Unit.f41027a;
            AbstractC2420c.a(fileOutputStream, th);
            if (!r32.renameTo(lVar.m())) {
            }
        } catch (IOException e5) {
            e = e5;
            file = r32;
            if (file.exists()) {
            }
            throw e;
        }
        nVar = new n(dVar);
        Object obj22 = nVar.f9162q;
        Object f42 = AbstractC1241b.f();
        i4 = nVar.f9164s;
        r32 = 1;
    }
}
