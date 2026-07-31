package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.si;
import com.chartboost.sdk.internal.Model.CBError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class g0 implements i0, x1, q7 {
    public final c0 a;
    public final u8 b;
    public final j3 c;
    public final xk d;
    public final b2 e;
    public final w f;
    public final se g;
    public final Mediation h;
    public final q7 i;
    public final AtomicReference j;
    public q1 k;
    public h0 l;
    public e0 m;
    public final AtomicBoolean n;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y1.values().length];
            try {
                iArr[y1.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y1.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y1.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public g0(c0 adType, u8 fileCache, j3 reachability, xk videoRepository, b2 assetsDownloader, w adLoader, se ortbLoader, Mediation mediation, q7 eventTracker, AtomicReference atomicReference) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(assetsDownloader, "assetsDownloader");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(ortbLoader, "ortbLoader");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = adType;
        this.b = fileCache;
        this.c = reachability;
        this.d = videoRepository;
        this.e = assetsDownloader;
        this.f = adLoader;
        this.g = ortbLoader;
        this.h = mediation;
        this.i = eventTracker;
        this.j = atomicReference;
        this.n = new AtomicBoolean(false);
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi clearFromStorage(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi persist(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public mi refresh(mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.i.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public ci store(ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.i.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    public pi track(pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.i.track(piVar);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.i.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.i.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo3222track(event);
    }

    public final void h(q1 q1Var) {
        try {
            g(q1Var);
        } catch (Exception e2) {
            xb.b("sendAdGetRequest", e2);
            a(q1Var, new CBError(CBError.Internal.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    public final void g(q1 q1Var) {
        e0 e0Var = this.m;
        Integer valueOf = e0Var != null ? Integer.valueOf(e0Var.a()) : null;
        e0 e0Var2 = this.m;
        tb tbVar = new tb(q1Var, true, valueOf, e0Var2 != null ? Integer.valueOf(e0Var2.c()) : null);
        AtomicReference atomicReference = this.j;
        sg sgVar = atomicReference != null ? (sg) atomicReference.get() : null;
        if (sgVar == null) {
            xb.e("SDK configuration is null for location: " + q1Var.d() + ". Falling back to legacy ad request.", null, 2, null);
        }
        boolean j = sgVar != null ? sgVar.j() : false;
        EndpointConfig c2 = sgVar != null ? sgVar.c() : null;
        Pair a2 = k0.a.a(q1Var, tbVar, new e(this), new f(this), new g(this), this.a, j, c2 == null ? EndpointConfig.INSTANCE.a() : c2);
        ((Function2) a2.component1()).invoke(q1Var, (tb) a2.component2());
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function2 {
        public e(Object obj) {
            super(2, obj, g0.class, "loadOpenRTBAd", "loadOpenRTBAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(q1 p0, tb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).c(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((q1) obj, (tb) obj2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function2 {
        public f(Object obj) {
            super(2, obj, g0.class, "loadAdGet", "loadAdGet(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(q1 p0, tb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).a(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((q1) obj, (tb) obj2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function2 {
        public g(Object obj) {
            super(2, obj, g0.class, "loadNrpAd", "loadNrpAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(q1 p0, tb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).b(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((q1) obj, (tb) obj2);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ q1 b;
        public final /* synthetic */ g0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q1 q1Var, g0 g0Var) {
            super(1);
            this.b = q1Var;
            this.c = g0Var;
        }

        public final void a(ub loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            y.a(loadAd, new a(this.b, this.c), new b(this.c, this.b));
        }

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ q1 b;
            public final /* synthetic */ g0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var, g0 g0Var) {
                super(1);
                this.b = q1Var;
                this.c = g0Var;
            }

            public final void a(ub fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.b.a(fold.a());
                this.c.e(this.b);
                this.c.b(fold, this.b);
                this.c.a(this.b, si.a.e);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ub) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function2 {
            public final /* synthetic */ g0 b;
            public final /* synthetic */ q1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g0 g0Var, q1 q1Var) {
                super(2);
                this.b = g0Var;
                this.c = q1Var;
            }

            public final void a(ub fold, CBError it) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(it, "it");
                this.b.a(fold, this.c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ub) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ub) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends Lambda implements Function1 {
        public final /* synthetic */ q1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q1 q1Var) {
            super(1);
            this.c = q1Var;
        }

        public final void a(ub loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            y.a(loadAd, new a(g0.this, this.c), new C0220b(g0.this, this.c));
        }

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ g0 b;
            public final /* synthetic */ q1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, q1 q1Var) {
                super(1);
                this.b = g0Var;
                this.c = q1Var;
            }

            public final void a(ub fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.b.b(fold, this.c);
                this.b.b(this.c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ub) obj);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.chartboost.sdk.impl.g0$b$b, reason: collision with other inner class name */
        public static final class C0220b extends Lambda implements Function2 {
            public final /* synthetic */ g0 b;
            public final /* synthetic */ q1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0220b(g0 g0Var, q1 q1Var) {
                super(2);
                this.b = g0Var;
                this.c = q1Var;
            }

            public final void a(ub fold, CBError error) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(error, "error");
                this.b.a(error, this.c.d());
                this.b.a(fold, this.c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ub) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ub) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public final /* synthetic */ q1 b;
        public final /* synthetic */ g0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q1 q1Var, g0 g0Var) {
            super(1);
            this.b = q1Var;
            this.c = g0Var;
        }

        public final void a(ub loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            y.a(loadAd, new a(this.b, this.c), new b(this.c, this.b));
        }

        public static final class a extends Lambda implements Function1 {
            public final /* synthetic */ q1 b;
            public final /* synthetic */ g0 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q1 q1Var, g0 g0Var) {
                super(1);
                this.b = q1Var;
                this.c = g0Var;
            }

            public final void a(ub fold) {
                Unit unit;
                String c;
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.b.a(fold.a());
                d0 a = fold.a();
                if (a == null || (c = a.c()) == null) {
                    unit = null;
                } else {
                    q1 q1Var = this.b;
                    g0 g0Var = this.c;
                    q1Var.a(c);
                    g0Var.a(c, si.a.e);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    q1 q1Var2 = this.b;
                    g0 g0Var2 = this.c;
                    xb.e("NRP waterfall response missing ADM for location " + q1Var2.d(), null, 2, null);
                    g0Var2.a(q1Var2, new CBError(CBError.Internal.MISCELLANEOUS, "NRP waterfall response missing ADM"));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((ub) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class b extends Lambda implements Function2 {
            public final /* synthetic */ g0 b;
            public final /* synthetic */ q1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g0 g0Var, q1 q1Var) {
                super(2);
                this.b = g0Var;
                this.c = q1Var;
            }

            public final void a(ub fold, CBError error) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(error, "error");
                this.b.a(error, this.c.d());
                this.b.a(fold, this.c);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((ub) obj, (CBError) obj2);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((ub) obj);
            return Unit.INSTANCE;
        }
    }

    public final void d(q1 q1Var) {
        b(q1Var, CBError.Impression.ASSETS_DOWNLOAD_FAILURE);
        f(q1Var);
    }

    public final void e(q1 q1Var) {
        String str;
        String B;
        d0 a2 = q1Var.a();
        if (a2 == null || !a2.D()) {
            return;
        }
        xk xkVar = this.d;
        d0 a3 = q1Var.a();
        String str2 = "";
        if (a3 == null || (str = a3.C()) == null) {
            str = "";
        }
        d0 a4 = q1Var.a();
        if (a4 != null && (B = a4.B()) != null) {
            str2 = B;
        }
        xkVar.a(str, str2, false, null);
    }

    public final void f(q1 q1Var) {
        a(q1Var);
        q1Var.a((d0) null);
        this.n.set(false);
    }

    public final void b(q1 q1Var) {
        this.e.a(q1Var, this.a.b(), this, this);
    }

    public final String c(q1 q1Var) {
        d0 a2 = q1Var.a();
        if (a2 != null) {
            return a2.m();
        }
        return null;
    }

    public final void a(q1 q1Var) {
        String str;
        q7 q7Var = this.i;
        d0 a2 = q1Var.a();
        if (a2 == null || (str = a2.r()) == null) {
            str = "";
        }
        q7Var.clear(str, q1Var.d());
    }

    public final void c(q1 q1Var, tb tbVar) {
        this.g.a(tbVar, new d(q1Var, this));
    }

    public final void b(q1 q1Var, tb tbVar) {
        this.f.a(tbVar, new c(q1Var, this));
    }

    public final void b() {
        if (this.n.get()) {
            return;
        }
        q1 q1Var = this.k;
        if (q1Var != null) {
            a(q1Var);
            q1Var.a((d0) null);
        }
        this.k = null;
    }

    public final void a(ub ubVar, q1 q1Var) {
        a(q1Var.d(), (d0) null);
        a(q1Var, ubVar.b());
    }

    public final q1 a() {
        return this.k;
    }

    public final void b(q1 q1Var, CBError.Impression impression) {
        this.n.set(false);
        a(q1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String b2 = this.a.b();
        d0 a2 = q1Var.a();
        String a3 = a2 != null ? a2.a() : null;
        xb.b("reportError: adTypeTraits: " + b2 + " reason: cache  format: web error: " + impression + " adId: " + a3 + " appRequest.location: " + q1Var.d(), (Throwable) null, 2, (Object) null);
    }

    public final CBError.Impression a(CBError cBError) {
        return (cBError != null ? cBError.getImpressionError() : null) != null ? cBError.getImpressionError() : CBError.Impression.INTERNAL;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 2, list:
          (r14v0 ?? I:com.chartboost.sdk.impl.q1) from 0x0064: INVOKE (r14v0 ?? I:com.chartboost.sdk.impl.q1), (r19v0 ?? I:com.chartboost.sdk.impl.e0) VIRTUAL call: com.chartboost.sdk.impl.q1.a(com.chartboost.sdk.impl.e0):void A[MD:(com.chartboost.sdk.impl.e0):void (m)] (LINE:1212)
          (r14v0 ?? I:com.chartboost.sdk.impl.q1) from 0x0067: IPUT (r14v0 ?? I:com.chartboost.sdk.impl.q1), (r15v0 'this' ?? I:com.chartboost.sdk.impl.g0 A[IMMUTABLE_TYPE, THIS]) (LINE:1213) com.chartboost.sdk.impl.g0.k com.chartboost.sdk.impl.q1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 2, list:
          (r14v0 ?? I:com.chartboost.sdk.impl.q1) from 0x0064: INVOKE (r14v0 ?? I:com.chartboost.sdk.impl.q1), (r19v0 ?? I:com.chartboost.sdk.impl.e0) VIRTUAL call: com.chartboost.sdk.impl.q1.a(com.chartboost.sdk.impl.e0):void A[MD:(com.chartboost.sdk.impl.e0):void (m)] (LINE:1212)
          (r14v0 ?? I:com.chartboost.sdk.impl.q1) from 0x0067: IPUT (r14v0 ?? I:com.chartboost.sdk.impl.q1), (r15v0 'this' ?? I:com.chartboost.sdk.impl.g0 A[IMMUTABLE_TYPE, THIS]) (LINE:1213) com.chartboost.sdk.impl.g0.k com.chartboost.sdk.impl.q1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static /* synthetic */ void a(g0 g0Var, String str, h0 h0Var, String str2, e0 e0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            e0Var = null;
        }
        g0Var.a(str, h0Var, str2, e0Var);
    }

    public final void b(ub ubVar, q1 q1Var) {
        a(q1Var.d(), ubVar.a());
        q1Var.a(ubVar.a());
    }

    public final void a(q1 q1Var, tb tbVar) {
        this.f.a(tbVar, new b(q1Var));
    }

    public final void a(q1 q1Var, CBError cBError) {
        b(q1Var, a(cBError));
        f(q1Var);
    }

    @Override // com.chartboost.sdk.impl.i0
    public void a(q1 appRequest, si trackingEventName) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.b(c(appRequest), trackingEventName);
        }
        this.n.set(false);
    }

    @Override // com.chartboost.sdk.impl.x1
    public void a(q1 request, y1 resultAsset) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(resultAsset, "resultAsset");
        int i = a.a[resultAsset.ordinal()];
        if (i == 1) {
            d(request);
        } else if (i == 2) {
            xb.a("onAssetDownloaded: Ready to show", (Throwable) null, 2, (Object) null);
        } else {
            if (i != 3) {
                return;
            }
            xb.a("onAssetDownloaded: Success", (Throwable) null, 2, (Object) null);
        }
    }

    public final void a(String bidResponse, si trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.a(bidResponse, trackingEventName);
        }
        this.n.set(false);
    }

    public final void a(q1 q1Var, CBError.Impression impression) {
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.a(c(q1Var), impression);
        }
    }

    public final void a(String str, d0 d0Var) {
        String y;
        String b2;
        String p;
        String i;
        String m;
        if (str == null) {
            str = "no location";
        }
        store(new ci(str, this.a.b(), (d0Var == null || (m = d0Var.m()) == null) ? "" : m, (d0Var == null || (i = d0Var.i()) == null) ? "" : i, (d0Var == null || (p = d0Var.p()) == null) ? "" : p, (d0Var == null || (b2 = d0Var.b()) == null) ? "" : b2, (d0Var == null || (y = d0Var.y()) == null) ? "" : y, f0.a(this.m)));
    }

    public final void a(CBError cBError, String str) {
        CBError.Type type = cBError.getType();
        if (type == CBError.Internal.HTTP_NOT_FOUND || type == CBError.Internal.HTTP_NOT_OK) {
            a(cBError, si.a.k, str);
        } else if (type == CBError.Internal.UNSUPPORTED_OS_VERSION) {
            a(cBError, si.f.h, str);
        } else {
            a(cBError, si.a.j, str);
        }
    }

    public final void a(CBError cBError, si siVar, String str) {
        String message = cBError.getMessage();
        if (message == null) {
            message = "";
        }
        track((pi) new l7(siVar, message, this.a.b(), str, this.h));
    }

    public final void a(si siVar, String str) {
        track((pi) new ya(siVar, "", this.a.b(), str, this.h, null, 32, null));
    }
}
