package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import k6.InterfaceC0608c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFj1nSDK {
    final Intent getMediationNetwork;

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1nSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.p implements Function0<Intent> {
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
    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1nSDK$3, reason: invalid class name */
    public static final class AnonymousClass3<T> extends kotlin.jvm.internal.p implements Function0<T> {
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

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1nSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends kotlin.jvm.internal.p implements Function0<Boolean> {
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

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1nSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.p implements Function0<String> {
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
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [R5.m] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [R5.m] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t6, boolean z7) {
        T t7;
        ?? n7;
        synchronized (this.getMediationNetwork) {
            try {
                R5.l lVar = R5.n.f2421d;
                t7 = function0.invoke();
            } catch (Throwable th) {
                R5.l lVar2 = R5.n.f2421d;
                t7 = V6.b.n(th);
            }
            InterfaceC0608c[] interfaceC0608cArr = {E.a(ConcurrentModificationException.class), E.a(ArrayIndexOutOfBoundsException.class)};
            Throwable a7 = R5.n.a(t7);
            T t8 = t7;
            if (a7 != null) {
                try {
                } catch (Throwable th2) {
                    R5.l lVar3 = R5.n.f2421d;
                    n7 = V6.b.n(th2);
                }
                if (!kotlin.collections.p.k(interfaceC0608cArr, E.a(a7.getClass()))) {
                    throw a7;
                }
                if (z7) {
                    n7 = getCurrencyIso4217Code(function0, str, t6, false);
                } else {
                    AFLogger.afErrorLog(str, a7, false, false);
                    n7 = t6;
                }
                t8 = n7;
            }
            Throwable a8 = R5.n.a(t8);
            if (a8 == null) {
                t6 = t8;
            } else {
                AFLogger.afErrorLog(str, a8, false, false);
            }
        }
        return t6;
    }

    public final boolean AFAdRevenueData(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new AnonymousClass4(str), r4.f.d("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final <T extends Parcelable> T H_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new AnonymousClass3(str), r4.f.d("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new AnonymousClass1(str, j), r4.f.d("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final String getMediationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new AnonymousClass5(str), r4.f.d("Error while trying to read ", str, " extra from intent"), null, true);
    }
}
