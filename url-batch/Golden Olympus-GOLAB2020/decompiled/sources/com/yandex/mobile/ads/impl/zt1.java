package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.gv1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1", f = "SdkBidderTokenLoader.kt", l = {InterfaceC1490j3.d.b.f16815g, 78, IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class zt1 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    EnumC2082m4 f35767b;

    /* renamed from: c, reason: collision with root package name */
    au1 f35768c;

    /* renamed from: d, reason: collision with root package name */
    C2074lk f35769d;

    /* renamed from: e, reason: collision with root package name */
    int f35770e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f35771f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ au1 f35772g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C2074lk f35773h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ns f35774i;

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$1", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ns f35775b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h52 f35776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ns nsVar, h52 h52Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f35775b = nsVar;
            this.f35776c = h52Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new a(this.f35775b, this.f35776c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a(this.f35775b, this.f35776c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            this.f35775b.onBidderTokenLoaded(this.f35776c.a());
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$2", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ns f35777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ns nsVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f35777b = nsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new b(this.f35777b, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.f35777b, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            this.f35777b.a();
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$1", f = "SdkBidderTokenLoader.kt", l = {IronSourceConstants.REGISTER_TRIGGER_FAIL}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f35778b;

        c(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new c((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f35778b;
            if (i4 == 0) {
                ResultKt.a(obj);
                this.f35778b = 1;
                if (o2.U.a(2000L, this) == f4) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$2", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function1<kotlin.coroutines.d, Object> {
        d(kotlin.coroutines.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@NotNull kotlin.coroutines.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            new d((kotlin.coroutines.d) obj);
            Unit unit = Unit.f41027a;
            AbstractC1241b.f();
            ResultKt.a(unit);
            return bu1.f23919d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            return bu1.f23919d;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$3", f = "SdkBidderTokenLoader.kt", l = {IronSourceConstants.RETRY_LIMIT}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f35779b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ au1 f35780c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(au1 au1Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f35780c = au1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return new e(this.f35780c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new e(this.f35780c, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            jv1 jv1Var;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f35779b;
            if (i4 == 0) {
                ResultKt.a(obj);
                jv1Var = this.f35780c.f23456f;
                ok0 ok0Var = ok0.f30069f;
                this.f35779b = 1;
                obj = jv1Var.a(ok0Var, this);
                if (obj == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            gv1 gv1Var = (gv1) obj;
            if (gv1Var instanceof gv1.b) {
                return null;
            }
            if (gv1Var instanceof gv1.a) {
                return bu1.f23918c;
            }
            throw new W1.m();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$4", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2<bu1, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35781b;

        f(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            f fVar = new f(dVar);
            fVar.f35781b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            f fVar = new f((kotlin.coroutines.d) obj2);
            fVar.f35781b = (bu1) obj;
            return fVar.invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC1241b.f();
            ResultKt.a(obj);
            return (bu1) this.f35781b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zt1(au1 au1Var, C2074lk c2074lk, ns nsVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f35772g = au1Var;
        this.f35773h = c2074lk;
        this.f35774i = nsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        zt1 zt1Var = new zt1(this.f35772g, this.f35773h, this.f35774i, dVar);
        zt1Var.f35771f = obj;
        return zt1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zt1) create((InterfaceC3316J) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        if (o2.AbstractC3333i.g(r2, r3, r17) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0135, code lost:
    
        if (o2.AbstractC3333i.g(r2, r3, r17) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        y22 y22Var;
        C2105n4 c2105n4;
        EnumC2082m4 adLoadingPhaseType;
        InterfaceC3359v0 d4;
        o2.Q b4;
        Object m4;
        au1 au1Var;
        C2074lk c2074lk;
        yt1 yt1Var;
        Context context;
        C1803ac c1803ac;
        e50 e50Var;
        we1 we1Var;
        we1 we1Var2;
        y22 y22Var2;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f35770e;
        if (i4 == 0) {
            ResultKt.a(obj);
            InterfaceC3316J interfaceC3316J = (InterfaceC3316J) this.f35771f;
            y22Var = this.f35772g.f23457g;
            y22Var.b(fq0.f25896b, this.f35772g);
            c2105n4 = this.f35772g.f23453c;
            adLoadingPhaseType = EnumC2082m4.f28867x;
            au1 au1Var2 = this.f35772g;
            C2074lk c2074lk2 = this.f35773h;
            c2105n4.getClass();
            Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
            c2105n4.a(adLoadingPhaseType, null);
            w2.f fVar = new w2.f(getContext());
            d4 = AbstractC3337k.d(interfaceC3316J, null, null, new c(null), 3, null);
            fVar.r(d4.getOnJoin(), new d(null));
            b4 = AbstractC3337k.b(interfaceC3316J, null, null, new e(au1Var2, null), 3, null);
            fVar.s(b4.getOnAwait(), new f(null));
            this.f35771f = c2105n4;
            this.f35767b = adLoadingPhaseType;
            this.f35768c = au1Var2;
            this.f35769d = c2074lk2;
            this.f35770e = 1;
            m4 = fVar.m(this);
            if (m4 != f4) {
                au1Var = au1Var2;
                c2074lk = c2074lk2;
            }
            return f4;
        }
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.a(obj);
            y22Var2 = this.f35772g.f23457g;
            y22Var2.a(fq0.f25896b, this.f35772g);
            return Unit.f41027a;
        }
        C2074lk c2074lk3 = this.f35769d;
        au1Var = this.f35768c;
        EnumC2082m4 enumC2082m4 = this.f35767b;
        C2105n4 c2105n42 = (C2105n4) this.f35771f;
        ResultKt.a(obj);
        m4 = obj;
        c2074lk = c2074lk3;
        adLoadingPhaseType = enumC2082m4;
        c2105n4 = c2105n42;
        bu1 bu1Var = (bu1) m4;
        yt1Var = au1Var.f23458h;
        context = au1Var.f23452b;
        c1803ac = au1Var.f23455e;
        e50Var = au1Var.f23454d;
        h52 h52Var = new h52(yt1Var.a(context, c1803ac, e50Var.c(), c2074lk, bu1Var), bu1Var);
        c2105n4.a(adLoadingPhaseType);
        if (h52Var.a() != null) {
            we1Var2 = this.f35772g.f23459i;
            we1Var2.a(this.f35773h, h52Var.b());
            o2.H0 p4 = o2.Z.c().p();
            a aVar = new a(this.f35774i, h52Var, null);
            this.f35771f = null;
            this.f35767b = null;
            this.f35768c = null;
            this.f35769d = null;
            this.f35770e = 2;
        } else {
            we1Var = this.f35772g.f23459i;
            we1Var.a(this.f35773h);
            o2.H0 p5 = o2.Z.c().p();
            b bVar = new b(this.f35774i, null);
            this.f35771f = null;
            this.f35767b = null;
            this.f35768c = null;
            this.f35769d = null;
            this.f35770e = 3;
        }
    }
}
