package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class c extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f36982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f36983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f36982a = safePackageManager;
        this.f36983b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f36982a;
        Context context = this.f36983b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
