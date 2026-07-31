package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.yandex.mobile.ads.impl.rx;
import com.yandex.mobile.ads.impl.sx;
import com.yandex.mobile.ads.impl.tk0;
import com.yandex.mobile.ads.impl.uw;
import com.yandex.mobile.ads.impl.wx;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import o2.InterfaceC3359v0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;

/* loaded from: classes3.dex */
public final class no0 extends xg2 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ce0 f29690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k32 f29691c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final be0 f29692d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ae0 f29693e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final zd0 f29694f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final de0 f29695g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final zw f29696h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2293v9 f29697i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final C2224s9 f29698j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2156p9 f29699k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final jz0 f29700l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final r2.u f29701m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final r2.G f29702n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final q2.d f29703o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC3396f f29704p;

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$sendEvent$1", f = "IntegrationInspectorViewModel.kt", l = {158}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29705b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ sx f29707d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(sx sxVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f29707d = sxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return no0.this.new a(this.f29707d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return no0.this.new a(this.f29707d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f29705b;
            if (i4 == 0) {
                ResultKt.a(obj);
                q2.d dVar = no0.this.f29703o;
                sx sxVar = this.f29707d;
                this.f29705b = 1;
                if (dVar.s(sxVar, this) == f4) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$shareReport$1", f = "IntegrationInspectorViewModel.kt", l = {131}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29708b;

        b(kotlin.coroutines.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return no0.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return no0.this.new b((kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            sx sxVar;
            Object f4 = AbstractC1241b.f();
            int i4 = this.f29708b;
            if (i4 == 0) {
                ResultKt.a(obj);
                ce0 ce0Var = no0.this.f29690b;
                this.f29708b = 1;
                obj = ce0Var.a(this);
                if (obj == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
            }
            tk0 tk0Var = (tk0) obj;
            if (tk0Var instanceof tk0.c) {
                sxVar = new sx.d(((tk0.c) tk0Var).a());
            } else if (tk0Var instanceof tk0.a) {
                sxVar = new sx.c(((tk0.a) tk0Var).a());
            } else {
                if (!(tk0Var instanceof tk0.b)) {
                    throw new W1.m();
                }
                sxVar = sx.b.f32066a;
            }
            no0.this.a(sxVar);
            return Unit.f41027a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$showMessage$1", f = "IntegrationInspectorViewModel.kt", l = {144}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29710b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f29712d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
            return no0.this.new c(this.f29712d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return no0.this.new c(this.f29712d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object f4 = AbstractC1241b.f();
            int i4 = this.f29710b;
            if (i4 == 0) {
                ResultKt.a(obj);
                q2.d dVar = no0.this.f29703o;
                sx.e eVar = new sx.e(this.f29712d);
                this.f29710b = 1;
                if (dVar.s(eVar, this) == f4) {
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

    public no0(@NotNull ce0 getInspectorReportUseCase, @NotNull k32 switchDebugErrorIndicatorVisibilityUseCase, @NotNull be0 getDebugPanelFeedDataUseCase, @NotNull ae0 getAdUnitsDataUseCase, @NotNull zd0 getAdUnitDataUseCase, @NotNull de0 getMediationNetworkDataUseCase, @NotNull zw debugPanelFeedUiMapper, @NotNull C2293v9 adUnitsUiMapper, @NotNull C2224s9 adUnitUiMapper, @NotNull C2156p9 adUnitMediationAdapterUiMapper, @NotNull jz0 mediationNetworkUiMapper) {
        Intrinsics.checkNotNullParameter(getInspectorReportUseCase, "getInspectorReportUseCase");
        Intrinsics.checkNotNullParameter(switchDebugErrorIndicatorVisibilityUseCase, "switchDebugErrorIndicatorVisibilityUseCase");
        Intrinsics.checkNotNullParameter(getDebugPanelFeedDataUseCase, "getDebugPanelFeedDataUseCase");
        Intrinsics.checkNotNullParameter(getAdUnitsDataUseCase, "getAdUnitsDataUseCase");
        Intrinsics.checkNotNullParameter(getAdUnitDataUseCase, "getAdUnitDataUseCase");
        Intrinsics.checkNotNullParameter(getMediationNetworkDataUseCase, "getMediationNetworkDataUseCase");
        Intrinsics.checkNotNullParameter(debugPanelFeedUiMapper, "debugPanelFeedUiMapper");
        Intrinsics.checkNotNullParameter(adUnitsUiMapper, "adUnitsUiMapper");
        Intrinsics.checkNotNullParameter(adUnitUiMapper, "adUnitUiMapper");
        Intrinsics.checkNotNullParameter(adUnitMediationAdapterUiMapper, "adUnitMediationAdapterUiMapper");
        Intrinsics.checkNotNullParameter(mediationNetworkUiMapper, "mediationNetworkUiMapper");
        this.f29690b = getInspectorReportUseCase;
        this.f29691c = switchDebugErrorIndicatorVisibilityUseCase;
        this.f29692d = getDebugPanelFeedDataUseCase;
        this.f29693e = getAdUnitsDataUseCase;
        this.f29694f = getAdUnitDataUseCase;
        this.f29695g = getMediationNetworkDataUseCase;
        this.f29696h = debugPanelFeedUiMapper;
        this.f29697i = adUnitsUiMapper;
        this.f29698j = adUnitUiMapper;
        this.f29699k = adUnitMediationAdapterUiMapper;
        this.f29700l = mediationNetworkUiMapper;
        r2.u a4 = r2.I.a(new ux(null, uw.d.f33430b, false, CollectionsKt.emptyList()));
        this.f29701m = a4;
        this.f29702n = AbstractC3398h.a(a4);
        q2.d b4 = q2.g.b(0, null, null, 7, null);
        this.f29703o = b4;
        this.f29704p = AbstractC3398h.s(b4);
    }

    public static final void m(no0 no0Var) {
        Object value;
        ux b4 = ((ux) no0Var.f29701m.getValue()).b();
        if (b4 == null) {
            no0Var.a(sx.a.f32065a);
            return;
        }
        ux a4 = ux.a(b4, null, null, false, null, 11);
        r2.u uVar = no0Var.f29701m;
        do {
            value = uVar.getValue();
        } while (!uVar.b(value, a4));
    }

    private final void e() {
        AbstractC3337k.d(b(), null, null, new b(null), 3, null);
    }

    private final void f() {
        AbstractC3337k.d(b(), null, null, new oo0(this, false, null), 3, null);
    }

    @NotNull
    public final InterfaceC3396f c() {
        return this.f29704p;
    }

    @NotNull
    public final r2.G d() {
        return this.f29702n;
    }

    public static final void a(no0 no0Var, ux uxVar) {
        Object value;
        r2.u uVar = no0Var.f29701m;
        do {
            value = uVar.getValue();
        } while (!uVar.b(value, uxVar));
    }

    public final void a(@NotNull rx action) {
        uw eVar;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof rx.a) {
            f();
            return;
        }
        if (action instanceof rx.g) {
            e();
            return;
        }
        if (action instanceof rx.e) {
            this.f29691c.a();
            f();
            return;
        }
        if (action instanceof rx.d) {
            ux b4 = ((ux) this.f29701m.getValue()).b();
            if (b4 == null) {
                a(sx.a.f32065a);
                return;
            }
            ux a4 = ux.a(b4, null, null, false, null, 11);
            r2.u uVar = this.f29701m;
            do {
                value4 = uVar.getValue();
            } while (!uVar.b(value4, a4));
            return;
        }
        if (action instanceof rx.c) {
            uw.c cVar = uw.c.f33429b;
            ux uxVar = (ux) this.f29701m.getValue();
            ux a5 = ux.a(uxVar, uxVar, cVar, false, null, 12);
            r2.u uVar2 = this.f29701m;
            do {
                value3 = uVar2.getValue();
            } while (!uVar2.b(value3, a5));
            f();
            return;
        }
        if (action instanceof rx.b) {
            uw.a aVar = new uw.a(((rx.b) action).a());
            ux uxVar2 = (ux) this.f29701m.getValue();
            ux a6 = ux.a(uxVar2, uxVar2, aVar, false, null, 12);
            r2.u uVar3 = this.f29701m;
            do {
                value2 = uVar3.getValue();
            } while (!uVar3.b(value2, a6));
            f();
            return;
        }
        if (action instanceof rx.f) {
            uw a7 = ((ux) this.f29701m.getValue()).a();
            wx.g a8 = ((rx.f) action).a();
            if (a7 instanceof uw.a) {
                eVar = new uw.b(a8);
            } else {
                eVar = new uw.e(a8.f());
            }
            uw uwVar = eVar;
            ux uxVar3 = (ux) this.f29701m.getValue();
            ux a9 = ux.a(uxVar3, uxVar3, uwVar, false, null, 12);
            r2.u uVar4 = this.f29701m;
            do {
                value = uVar4.getValue();
            } while (!uVar4.b(value, a9));
            f();
            return;
        }
        if (action instanceof rx.h) {
            a(((rx.h) action).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3359v0 a(sx sxVar) {
        InterfaceC3359v0 d4;
        d4 = AbstractC3337k.d(b(), null, null, new a(sxVar, null), 3, null);
        return d4;
    }

    private final void a(String str) {
        AbstractC3337k.d(b(), null, null, new c(str, null), 3, null);
    }
}
