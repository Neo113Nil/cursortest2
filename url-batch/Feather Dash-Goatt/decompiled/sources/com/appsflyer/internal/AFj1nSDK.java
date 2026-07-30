package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AFLogger;
import defpackage.a21;
import defpackage.i31;
import defpackage.j31;
import defpackage.k31;
import defpackage.pc0;
import defpackage.qy0;
import defpackage.ry0;
import defpackage.y9;
import defpackage.yg;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFj1nSDK {
    final Intent getMediationNetwork;

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1nSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends pc0 implements Function0<Intent> {
        private /* synthetic */ long $getMediationNetwork;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getMediationNetwork = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1nSDK.this.getMediationNetwork.putExtra(this.$getMonetizationNetwork, this.$getMediationNetwork);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1nSDK$3, reason: invalid class name */
    public static final class AnonymousClass3<T> extends pc0 implements Function0<T> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1nSDK.this.getMediationNetwork.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1nSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends pc0 implements Function0<Boolean> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getRevenue = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1nSDK.this.getMediationNetwork.hasExtra(this.$getRevenue));
        }
    }

    /* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = 3, mv = {1, ry0.BYTES_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1nSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends pc0 implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1nSDK.this.getMediationNetwork.getStringExtra(this.$AFAdRevenueData);
        }
    }

    public AFj1nSDK(Intent intent) {
        intent.getClass();
        this.getMediationNetwork = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j31] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j31] */
    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t, boolean z) {
        T j31Var;
        ?? r5;
        synchronized (this.getMediationNetwork) {
            try {
                i31 i31Var = k31.d;
                j31Var = function0.invoke();
            } catch (Throwable th) {
                i31 i31Var2 = k31.d;
                j31Var = new j31(th);
            }
            yg[] ygVarArr = {a21.a(ConcurrentModificationException.class), a21.a(ArrayIndexOutOfBoundsException.class)};
            Throwable a = k31.a(j31Var);
            T j31Var2 = j31Var;
            if (a != null) {
                try {
                    if (!y9.i(ygVarArr, a21.a(a.getClass()))) {
                        throw a;
                    }
                    if (z) {
                        r5 = getCurrencyIso4217Code(function0, str, t, false);
                    } else {
                        AFLogger.afErrorLog(str, a, false, false);
                        r5 = t;
                    }
                    j31Var2 = r5;
                } catch (Throwable th2) {
                    i31 i31Var3 = k31.d;
                    j31Var2 = new j31(th2);
                }
            }
            Throwable a2 = k31.a(j31Var2);
            if (a2 == null) {
                t = j31Var2;
            } else {
                AFLogger.afErrorLog(str, a2, false, false);
            }
        }
        return t;
    }

    public final boolean AFAdRevenueData(String str) {
        str.getClass();
        Boolean bool = (Boolean) getCurrencyIso4217Code(new AnonymousClass4(str), qy0.k("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final <T extends Parcelable> T H_(String str) {
        str.getClass();
        return (T) getCurrencyIso4217Code(new AnonymousClass3(str), qy0.k("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(String str, long j) {
        str.getClass();
        return (Intent) getCurrencyIso4217Code(new AnonymousClass1(str, j), qy0.k("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final String getMediationNetwork(String str) {
        str.getClass();
        return (String) getCurrencyIso4217Code(new AnonymousClass5(str), qy0.k("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
