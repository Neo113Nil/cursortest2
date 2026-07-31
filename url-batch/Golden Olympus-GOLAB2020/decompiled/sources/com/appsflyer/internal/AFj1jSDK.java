package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFj1jSDK {
    final Intent getCurrencyIso4217Code;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1jSDK$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends kotlin.jvm.internal.s implements Function0<T> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getParcelableExtra(this.$getCurrencyIso4217Code);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1jSDK$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.jvm.internal.s implements Function0<String> {
        private /* synthetic */ String $getCurrencyIso4217Code;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            this.$getCurrencyIso4217Code = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.getStringExtra(this.$getCurrencyIso4217Code);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1jSDK$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.jvm.internal.s implements Function0<Intent> {
        private /* synthetic */ String $getMonetizationNetwork;
        private /* synthetic */ long $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, long j4) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getRevenue = j4;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1jSDK.this.getCurrencyIso4217Code.putExtra(this.$getMonetizationNetwork, this.$getRevenue);
        }
    }

    @Metadata
    /* renamed from: com.appsflyer.internal.AFj1jSDK$5, reason: invalid class name */
    static final class AnonymousClass5 extends kotlin.jvm.internal.s implements Function0<Boolean> {
        private /* synthetic */ String $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str) {
            super(0);
            this.$getMediationNetwork = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1jSDK.this.getCurrencyIso4217Code.hasExtra(this.$getMediationNetwork));
        }
    }

    public AFj1jSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    public final <T extends Parcelable> T H_(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getMonetizationNetwork(new AnonymousClass1(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final Intent I_(String str, long j4) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getMonetizationNetwork(new AnonymousClass3(str, j4), "Error while trying to write " + str + " extra to intent", null, true);
    }

    public final boolean getMonetizationNetwork(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getMonetizationNetwork(new AnonymousClass5(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final String getRevenue(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getMonetizationNetwork(new AnonymousClass2(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x001a, B:7:0x0062, B:13:0x006a, B:25:0x0057, B:30:0x0010, B:15:0x0035, B:18:0x0045, B:19:0x0050, B:21:0x004c, B:22:0x0056, B:4:0x0004), top: B:3:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <T> T getMonetizationNetwork(Function0<? extends T> function0, String str, T t4, boolean z4) {
        T t5;
        Throwable d4;
        ?? m243constructorimpl;
        Object obj;
        Throwable d5;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.Companion;
                t5 = Result.m243constructorimpl(function0.invoke());
            } finally {
                m2.c[] cVarArr = {kotlin.jvm.internal.H.b(ConcurrentModificationException.class), kotlin.jvm.internal.H.b(ArrayIndexOutOfBoundsException.class)};
                d4 = Result.d(t5);
                T t6 = t5;
                if (d4 != null) {
                }
                d5 = Result.d(t6);
                if (d5 != null) {
                }
                return t4;
            }
            m2.c[] cVarArr2 = {kotlin.jvm.internal.H.b(ConcurrentModificationException.class), kotlin.jvm.internal.H.b(ArrayIndexOutOfBoundsException.class)};
            d4 = Result.d(t5);
            T t62 = t5;
            if (d4 != null) {
                try {
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
                }
                if (AbstractC3219i.A(cVarArr2, kotlin.jvm.internal.H.b(d4.getClass()))) {
                    if (z4) {
                        obj = getMonetizationNetwork(function0, str, t4, false);
                    } else {
                        AFLogger.afErrorLog(str, d4, false, false);
                        obj = t4;
                    }
                    m243constructorimpl = Result.m243constructorimpl(obj);
                    t62 = m243constructorimpl;
                } else {
                    throw d4;
                }
            }
            d5 = Result.d(t62);
            if (d5 != null) {
                t4 = t62;
            } else {
                AFLogger.afErrorLog(str, d5, false, false);
            }
        }
        return t4;
    }
}
