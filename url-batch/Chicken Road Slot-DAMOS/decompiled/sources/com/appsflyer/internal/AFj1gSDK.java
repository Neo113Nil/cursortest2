package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class AFj1gSDK {
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Parcelable;", "T", "J_", "()Landroid/os/Parcelable;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends wd.p implements Function0<T> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getMonetizationNetwork);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getMediationNetwork", "()Ljava/lang/String;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends wd.p implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.getStringExtra(this.$AFAdRevenueData);
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrencyIso4217Code", "()Ljava/lang/Boolean;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends wd.p implements Function0<Boolean> {
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$getMonetizationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1gSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMonetizationNetwork));
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Intent;", "K_", "()Landroid/content/Intent;"}, k = a4.j.INTEGER_FIELD_NUMBER, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFj1gSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends wd.p implements Function0<Intent> {
        private /* synthetic */ long $AFAdRevenueData;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, long j) {
            super(0);
            this.$getRevenue = str;
            this.$AFAdRevenueData = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1gSDK.this.getCurrencyIso4217Code.putExtra(this.$getRevenue, this.$AFAdRevenueData);
        }
    }

    public AFj1gSDK(Intent intent) {
        intent.getClass();
        this.getCurrencyIso4217Code = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0013, B:7:0x0055, B:13:0x005d, B:24:0x004d, B:29:0x000b, B:15:0x002f, B:18:0x003f, B:20:0x0046, B:21:0x004c, B:4:0x0003), top: B:3:0x0003, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /* JADX WARN: Type inference failed for: r10v2, types: [hd.m] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [hd.m] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getRevenue(Function0<? extends T> function0, String str, T t6, boolean z10) {
        T t10;
        Throwable a9;
        ?? r72;
        Throwable a10;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                hd.l lVar = hd.n.f4511e;
                t10 = function0.invoke();
            } finally {
                ce.b[] bVarArr = {c0.a(ConcurrentModificationException.class), c0.a(ArrayIndexOutOfBoundsException.class)};
                a9 = hd.n.a(t10);
                T t11 = t10;
                if (a9 != null) {
                }
                a10 = hd.n.a(t11);
                if (a10 != null) {
                }
                return t6;
            }
            ce.b[] bVarArr2 = {c0.a(ConcurrentModificationException.class), c0.a(ArrayIndexOutOfBoundsException.class)};
            a9 = hd.n.a(t10);
            T t112 = t10;
            if (a9 != null) {
                try {
                    if (!w.l(bVarArr2, c0.a(a9.getClass()))) {
                        throw a9;
                    }
                    if (z10) {
                        r72 = getRevenue(function0, str, t6, false);
                    } else {
                        AFLogger.afErrorLog(str, a9, false, false);
                        r72 = t6;
                    }
                    t112 = r72;
                } catch (Throwable th) {
                }
            }
            a10 = hd.n.a(t112);
            if (a10 != null) {
                t6 = t112;
            } else {
                AFLogger.afErrorLog(str, a10, false, false);
            }
        }
        return t6;
    }

    public final String AFAdRevenueData(String str) {
        str.getClass();
        return (String) getRevenue(new AnonymousClass3(str), n0.l.g("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final <T extends Parcelable> T H_(String str) {
        str.getClass();
        return (T) getRevenue(new AnonymousClass2(str), n0.l.g("Error while trying to read ", str, " extra from intent"), null, true);
    }

    public final Intent I_(String str, long j) {
        str.getClass();
        return (Intent) getRevenue(new AnonymousClass5(str, j), n0.l.g("Error while trying to write ", str, " extra to intent"), null, true);
    }

    public final boolean getMediationNetwork(String str) {
        str.getClass();
        Boolean bool = (Boolean) getRevenue(new AnonymousClass4(str), n0.l.g("Error while trying to check presence of ", str, " extra from intent"), Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
