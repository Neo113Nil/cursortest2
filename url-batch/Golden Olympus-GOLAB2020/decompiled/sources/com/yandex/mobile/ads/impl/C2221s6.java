package com.yandex.mobile.ads.impl;

import a2.AbstractC1241b;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2221s6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31591a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f31592b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2060l6 f31593c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private C2360y7<?> f31594d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private AdQualityVerificationResult f31595e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final W1.h f31596f;

    /* renamed from: com.yandex.mobile.ads.impl.s6$a */
    static final class a extends kotlin.jvm.internal.s implements Function0<InterfaceC2382z6> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new C1798a7(0).a(C2221s6.this.f31592b);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.monetization.ads.base.quality.AdQualityVerifierController", f = "AdQualityVerifierController.kt", l = {IronSourceConstants.APP_ENTER_FOREGROUND}, m = "verifyAd")
    /* renamed from: com.yandex.mobile.ads.impl.s6$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        C2221s6 f31598b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f31599c;

        /* renamed from: e, reason: collision with root package name */
        int f31601e;

        b(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31599c = obj;
            this.f31601e |= Integer.MIN_VALUE;
            return C2221s6.this.a(null, null, null, this);
        }
    }

    public /* synthetic */ C2221s6(C2286v2 c2286v2, Context context) {
        this(c2286v2, context, new C2060l6(c2286v2));
    }

    private final boolean e() {
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(this.f31592b);
        C1989i6 c4 = a4 != null ? a4.c() : null;
        return c4 != null && c4.e();
    }

    public final void b() {
        if (e()) {
            ((InterfaceC2382z6) this.f31596f.getValue()).onAdClosed();
            d();
        }
    }

    public final void c() {
        if (e()) {
            ((InterfaceC2382z6) this.f31596f.getValue()).onAdWillDisplay();
        }
    }

    public final void d() {
        if (e()) {
            this.f31593c.a(this.f31592b, this.f31595e, this.f31594d);
            ((InterfaceC2382z6) this.f31596f.getValue()).onInvalidated();
        }
    }

    public final void a() {
        if (e()) {
            ((InterfaceC2382z6) this.f31596f.getValue()).onAdClicked();
        }
    }

    public C2221s6(@NotNull C2286v2 adConfiguration, @NotNull Context context, @NotNull C2060l6 adQualityVerificationReporter) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adQualityVerificationReporter, "adQualityVerificationReporter");
        this.f31591a = adConfiguration;
        this.f31592b = context;
        this.f31593c = adQualityVerificationReporter;
        this.f31595e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.f31596f = W1.i.b(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Object obj, @Nullable C2360y7<?> c2360y7, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull kotlin.coroutines.d dVar) {
        b bVar;
        int i4;
        C2221s6 c2221s6;
        AdQualityVerificationResult adQualityVerificationResult;
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i5 = bVar.f31601e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.f31601e = i5 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj2 = bVar2.f31599c;
                Object f4 = AbstractC1241b.f();
                i4 = bVar2.f31601e;
                if (i4 != 0) {
                    ResultKt.a(obj2);
                    if (e()) {
                        this.f31594d = c2360y7;
                        InterfaceC2382z6 interfaceC2382z6 = (InterfaceC2382z6) this.f31596f.getValue();
                        Context context = this.f31592b;
                        C2286v2 c2286v2 = this.f31591a;
                        bVar2.f31598b = this;
                        bVar2.f31601e = 1;
                        obj2 = interfaceC2382z6.a(context, obj, c2360y7, c2286v2, mediatedAdObjectInfo, bVar2);
                        if (obj2 == f4) {
                            return f4;
                        }
                        c2221s6 = this;
                    } else {
                        return C2290v6.f33516a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2221s6 = bVar2.f31598b;
                    ResultKt.a(obj2);
                }
                adQualityVerificationResult = (AdQualityVerificationResult) obj2;
                c2221s6.f31595e = adQualityVerificationResult;
                if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
                    AdQualityVerificationState adQualityVerificationState = (AdQualityVerificationState) ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd().getVerificationResultStateFlow().getValue();
                    if (adQualityVerificationState instanceof AdQualityVerificationState.Blocked) {
                        adQualityVerificationBlockingReasons = ((AdQualityVerificationState.Blocked) adQualityVerificationState).getReason();
                    } else if (adQualityVerificationState instanceof AdQualityVerificationState.ShouldBeBlockedOnDisplay) {
                        adQualityVerificationBlockingReasons = ((AdQualityVerificationState.ShouldBeBlockedOnDisplay) adQualityVerificationState).getReason();
                    }
                    if (adQualityVerificationBlockingReasons == null && (!adQualityVerificationBlockingReasons.getBlockReasons().isEmpty() || !adQualityVerificationBlockingReasons.getReportReasons().isEmpty())) {
                        c2221s6.d();
                        return new C2244t6(adQualityVerificationBlockingReasons);
                    }
                    return C2290v6.f33516a;
                }
                adQualityVerificationBlockingReasons = null;
                if (adQualityVerificationBlockingReasons == null) {
                }
                return C2290v6.f33516a;
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj22 = bVar22.f31599c;
        Object f42 = AbstractC1241b.f();
        i4 = bVar22.f31601e;
        if (i4 != 0) {
        }
        adQualityVerificationResult = (AdQualityVerificationResult) obj22;
        c2221s6.f31595e = adQualityVerificationResult;
        if (adQualityVerificationResult instanceof AdQualityVerificationResult.Verified) {
        }
        adQualityVerificationBlockingReasons = null;
        if (adQualityVerificationBlockingReasons == null) {
        }
        return C2290v6.f33516a;
    }
}
