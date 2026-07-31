package com.yandex.mobile.ads.impl;

import com.yandex.div.core.DivKit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m01 extends u01 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28822a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xa2 f28823b;

    public m01(@NotNull xa2 versionNameParser) {
        Intrinsics.checkNotNullParameter(versionNameParser, "versionNameParser");
        this.f28822a = false;
        this.f28823b = versionNameParser;
    }

    @Override // com.yandex.mobile.ads.impl.u01
    protected final void a(@NotNull Function1<? super jo0, Unit> onValidationFailed) {
        Intrinsics.checkNotNullParameter(onValidationFailed, "onValidationFailed");
        try {
            xa2 xa2Var = this.f28823b;
            String versionName = DivKit.Companion.getVersionName();
            xa2Var.getClass();
            wa2 a4 = xa2.a(versionName);
            this.f28823b.getClass();
            wa2 a5 = xa2.a("32.5.0");
            Integer valueOf = a5 != null ? Integer.valueOf(a5.a()) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if (a4 == null || !(this.f28822a || a4.a() == intValue)) {
                    String a6 = C2284v0.a(new Object[]{valueOf, a4 != null ? Integer.valueOf(a4.a()) : null}, 2, "Unsupported DivKit major version. Expected: %s. Actual: %s", "format(...)");
                    onValidationFailed.invoke(new jo0(a6, a6));
                    throw null;
                }
            }
        } catch (NoClassDefFoundError unused) {
            String a7 = C2284v0.a(new Object[0], 0, "DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", "format(...)");
            onValidationFailed.invoke(new jo0(a7, a7));
            throw null;
        }
    }
}
