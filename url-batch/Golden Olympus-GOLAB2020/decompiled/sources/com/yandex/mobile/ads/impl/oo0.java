package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import com.ironsource.InterfaceC1490j3;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.bw;
import com.yandex.mobile.ads.impl.uw;
import com.yandex.mobile.ads.impl.wx;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@kotlin.coroutines.jvm.internal.f(c = "com.yandex.mobile.ads.features.debugpanel.ui.viewmodel.IntegrationInspectorViewModel$updateData$1", f = "IntegrationInspectorViewModel.kt", l = {108, InterfaceC1490j3.d.b.f16815g, InterfaceC1490j3.d.b.f16817i, BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class oo0 extends kotlin.coroutines.jvm.internal.l implements Function2<InterfaceC3316J, kotlin.coroutines.d, Object> {

    /* renamed from: b, reason: collision with root package name */
    uw f30124b;

    /* renamed from: c, reason: collision with root package name */
    Object f30125c;

    /* renamed from: d, reason: collision with root package name */
    int f30126d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ no0 f30127e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f30128f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    oo0(no0 no0Var, boolean z4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f30127e = no0Var;
        this.f30128f = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d create(@Nullable Object obj, @NotNull kotlin.coroutines.d dVar) {
        return new oo0(this.f30127e, this.f30128f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new oo0(this.f30127e, this.f30128f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f41027a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe A[LOOP:1: B:58:0x00f8->B:60:0x00fe, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        r2.u uVar;
        uw a4;
        r2.u uVar2;
        r2.u uVar3;
        de0 de0Var;
        Object a5;
        uw uwVar;
        zd0 zd0Var;
        Object a6;
        C2156p9 c2156p9;
        C2293v9 c2293v9;
        ae0 ae0Var;
        Object a7;
        C2293v9 c2293v92;
        zw zwVar;
        be0 be0Var;
        Object a8;
        zw zwVar2;
        zv adUnit;
        C2224s9 c2224s9;
        hw hwVar;
        r2.u uVar4;
        r2.u uVar5;
        gw mediationNetworkData;
        jz0 jz0Var;
        Object f4 = AbstractC1241b.f();
        int i4 = this.f30126d;
        ?? r7 = 0;
        r7 = 0;
        if (i4 == 0) {
            ResultKt.a(obj);
            uVar = this.f30127e.f29701m;
            a4 = ((ux) uVar.getValue()).a();
            uVar2 = this.f30127e.f29701m;
            if (((ux) uVar2.getValue()).c().isEmpty() || this.f30128f) {
                no0 no0Var = this.f30127e;
                uVar3 = no0Var.f29701m;
                no0.a(no0Var, ux.a((ux) uVar3.getValue(), null, null, true, null, 11));
            }
            if (a4 instanceof uw.d) {
                zwVar = this.f30127e.f29696h;
                be0Var = this.f30127e.f29692d;
                boolean z4 = this.f30128f;
                this.f30124b = a4;
                this.f30125c = zwVar;
                this.f30126d = 1;
                a8 = be0Var.a(z4, this);
                if (a8 != f4) {
                    zwVar2 = zwVar;
                    r7 = zwVar2.a((xw) a8);
                    if (r7 == 0) {
                    }
                    return Unit.f41027a;
                }
            } else if (a4 instanceof uw.c) {
                c2293v9 = this.f30127e.f29697i;
                ae0Var = this.f30127e.f29693e;
                boolean z5 = this.f30128f;
                this.f30124b = a4;
                this.f30125c = c2293v9;
                this.f30126d = 2;
                a7 = ae0Var.a(z5, this);
                if (a7 != f4) {
                    c2293v92 = c2293v9;
                    ew adUnits = (ew) a7;
                    c2293v92.getClass();
                    Intrinsics.checkNotNullParameter(adUnits, "adUnits");
                    List<yv> a9 = adUnits.a();
                    r7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a9, 10));
                    while (r1.hasNext()) {
                    }
                    if (r7 == 0) {
                    }
                    return Unit.f41027a;
                }
            } else {
                if (a4 instanceof uw.b) {
                    c2156p9 = this.f30127e.f29699k;
                    wx.g b4 = ((uw.b) a4).b();
                    c2156p9.getClass();
                    r7 = C2156p9.a(b4);
                    if (r7 == 0) {
                    }
                    return Unit.f41027a;
                }
                if (a4 instanceof uw.a) {
                    zd0Var = this.f30127e.f29694f;
                    String b5 = ((uw.a) a4).b();
                    boolean z6 = this.f30128f;
                    this.f30124b = a4;
                    this.f30126d = 3;
                    a6 = zd0Var.a(b5, z6, this);
                    if (a6 != f4) {
                        uwVar = a4;
                        adUnit = (zv) a6;
                        if (adUnit != null) {
                        }
                        a4 = uwVar;
                        if (r7 == 0) {
                        }
                        return Unit.f41027a;
                    }
                } else {
                    if (!(a4 instanceof uw.e)) {
                        throw new W1.m();
                    }
                    de0Var = this.f30127e.f29695g;
                    String b6 = ((uw.e) a4).b();
                    boolean z7 = this.f30128f;
                    this.f30124b = a4;
                    this.f30126d = 4;
                    a5 = de0Var.a(b6, z7, this);
                    if (a5 != f4) {
                        uwVar = a4;
                        mediationNetworkData = (gw) a5;
                        if (mediationNetworkData != null) {
                        }
                        a4 = uwVar;
                        if (r7 == 0) {
                        }
                        return Unit.f41027a;
                    }
                }
            }
            return f4;
        }
        if (i4 == 1) {
            zwVar2 = (zw) this.f30125c;
            a4 = this.f30124b;
            ResultKt.a(obj);
            a8 = obj;
            r7 = zwVar2.a((xw) a8);
            if (r7 == 0) {
            }
            return Unit.f41027a;
        }
        if (i4 == 2) {
            c2293v92 = (C2293v9) this.f30125c;
            a4 = this.f30124b;
            ResultKt.a(obj);
            a7 = obj;
            ew adUnits2 = (ew) a7;
            c2293v92.getClass();
            Intrinsics.checkNotNullParameter(adUnits2, "adUnits");
            List<yv> a92 = adUnits2.a();
            r7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(a92, 10));
            for (yv yvVar : a92) {
                r7.add(new wx.a(yvVar.c(), yvVar.b(), yvVar.a()));
            }
            if (r7 == 0) {
            }
            return Unit.f41027a;
        }
        if (i4 != 3) {
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uwVar = this.f30124b;
            ResultKt.a(obj);
            a5 = obj;
            mediationNetworkData = (gw) a5;
            if (mediationNetworkData != null) {
                jz0Var = this.f30127e.f29700l;
                jz0Var.getClass();
                Intrinsics.checkNotNullParameter(mediationNetworkData, "mediationNetworkData");
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(wx.d.f34228a);
                createListBuilder.add(new wx.e("Integration"));
                String b7 = mediationNetworkData.b();
                if (b7 != null) {
                    createListBuilder.add(new wx.f("Adapter Version", b7));
                }
                String c4 = mediationNetworkData.c();
                if (c4 != null) {
                    createListBuilder.add(new wx.f("Latest Adapter Version", c4));
                }
                wx.c.a aVar = wx.c.a.f34226b;
                createListBuilder.add(new wx.c());
                r7 = CollectionsKt.build(createListBuilder);
            }
            a4 = uwVar;
            if (r7 == 0) {
                no0.m(this.f30127e);
            } else {
                uVar4 = this.f30127e.f29701m;
                if (Intrinsics.areEqual(a4, ((ux) uVar4.getValue()).a())) {
                    uVar5 = this.f30127e.f29701m;
                    no0.a(this.f30127e, ux.a((ux) uVar5.getValue(), null, null, false, r7, 3));
                }
            }
            return Unit.f41027a;
        }
        uwVar = this.f30124b;
        ResultKt.a(obj);
        a6 = obj;
        adUnit = (zv) a6;
        if (adUnit != null) {
            c2224s9 = this.f30127e.f29698j;
            c2224s9.getClass();
            Intrinsics.checkNotNullParameter(adUnit, "adUnit");
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(wx.d.f34228a);
            createListBuilder2.add(new wx.e(adUnit.d()));
            createListBuilder2.add(new wx.f("Format", adUnit.b()));
            createListBuilder2.add(new wx.f("ID", adUnit.a()));
            for (bw bwVar : adUnit.c().a()) {
                bw.a f5 = bwVar.f();
                if (f5 instanceof bw.a.C0182a) {
                    hwVar = hw.f26960c;
                } else {
                    if (!(f5 instanceof bw.a.b)) {
                        throw new W1.m();
                    }
                    hwVar = hw.f26961d;
                }
                hw hwVar2 = hwVar;
                bw.a f6 = bwVar.f();
                bw.a.b bVar = f6 instanceof bw.a.b ? (bw.a.b) f6 : null;
                createListBuilder2.add(new wx.g(bwVar.b(), bwVar.c(), new qx("Mediation", R.attr.debug_panel_label_secondary, null, R.style.DebugPanelText_Body2, 4), new ow(R.attr.debug_panel_label_primary, R.style.DebugPanelText_Body1, hwVar2.a()), null, bwVar.a(), bwVar.d(), bwVar.e(), bVar != null ? bVar.a() : null, hwVar2, null, 1024));
            }
            r7 = CollectionsKt.build(createListBuilder2);
        }
        a4 = uwVar;
        if (r7 == 0) {
        }
        return Unit.f41027a;
    }
}
