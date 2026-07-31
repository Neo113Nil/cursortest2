package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1798a7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2176q6 f23172a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2198r6 f23173b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2359y6 f23174c;

    public /* synthetic */ C1798a7(int i4) {
        this(new C2176q6(), new C2198r6(), new C2359y6());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2382z6 a(@NotNull Context context) {
        Object m243constructorimpl;
        Throwable d4;
        C1989i6 c4;
        InterfaceC2382z6 c1893e6;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            int i4 = ew1.f25476l;
            du1 a4 = ew1.a.a().a(context);
            c4 = a4 != null ? a4.c() : null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (c4 != null && c4.e()) {
            this.f23173b.getClass();
            AdQualityVerifierAdapterConfiguration a5 = C2198r6.a(c4);
            this.f23172a.getClass();
            AdQualityVerifierAdapter a6 = C2176q6.a();
            if (a6 == null) {
                ap0.a(new Object[0]);
                c1893e6 = new C1893e6();
            } else {
                this.f23174c.getClass();
                C2036k6 a7 = C2359y6.a(c4);
                long verificationTimeoutInSec = a5.getVerificationTimeoutInSec() + 1;
                C2336x6 c2336x6 = new C2336x6(a7);
                C2130o6 c2130o6 = new C2130o6(a7);
                ap0.a(new Object[0]);
                c1893e6 = new C1917f6(a6, a5, verificationTimeoutInSec, c2336x6, c2130o6);
            }
            m243constructorimpl = Result.m243constructorimpl(c1893e6);
            d4 = Result.d(m243constructorimpl);
            if (d4 != null) {
                d4.getMessage();
                ap0.a(new Object[0]);
                m243constructorimpl = new C1893e6();
            }
            return (InterfaceC2382z6) m243constructorimpl;
        }
        ap0.a(new Object[0]);
        c1893e6 = new C1893e6();
        m243constructorimpl = Result.m243constructorimpl(c1893e6);
        d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
        }
        return (InterfaceC2382z6) m243constructorimpl;
    }

    public C1798a7(@NotNull C2176q6 verifierAdapterCreator, @NotNull C2198r6 verifierAdapterConfigurationFactory, @NotNull C2359y6 adQualityVerifierVerificationPolicyFactory) {
        Intrinsics.checkNotNullParameter(verifierAdapterCreator, "verifierAdapterCreator");
        Intrinsics.checkNotNullParameter(verifierAdapterConfigurationFactory, "verifierAdapterConfigurationFactory");
        Intrinsics.checkNotNullParameter(adQualityVerifierVerificationPolicyFactory, "adQualityVerifierVerificationPolicyFactory");
        this.f23172a = verifierAdapterCreator;
        this.f23173b = verifierAdapterConfigurationFactory;
        this.f23174c = adQualityVerifierVerificationPolicyFactory;
    }
}
