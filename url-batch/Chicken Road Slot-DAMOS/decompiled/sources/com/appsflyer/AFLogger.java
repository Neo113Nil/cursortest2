package com.appsflyer;

import a4.j;
import androidx.lifecycle.d0;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFh1ySDK;
import hd.g;
import hd.h;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0013\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0019J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0019J#\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u001dJ#\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ+\u0010\u001e\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010 J+\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010 J3\u0010\u0013\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010!J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010$\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\b2\u0012\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\"\"\u00020\u0001¢\u0006\u0004\b&\u0010%J'\u0010*\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b*\u0010+JG\u0010.\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010+J'\u00101\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010+J'\u00102\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u0010+J\u001f\u00103\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00104R\u001b\u00106\u001a\b\u0012\u0004\u0012\u00020\u0001058BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b6\u00107R\u0015\u00109\u001a\u0002088BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b9\u00107"}, d2 = {"Lcom/appsflyer/AFLogger;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "", "logMessage", "", "shouldRemoteDebug", "", "afInfoLog", "(Ljava/lang/String;Z)V", "debugLogMessage", "afDebugLog", "message", "", "ex", "printMessage", "printThrowable", "shouldReportToExManager", "afErrorLog", "(Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V", "warningLogMessage", "afWarnLog", "rdLogMessage", "afVerboseLog", "(Ljava/lang/String;)V", "afRDLog", "afLogForce", "errorLogMessage", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "afErrorLogForExcManagerOnly", "disableReporting", "(Ljava/lang/String;Ljava/lang/Throwable;Z)V", "(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V", "", "client", "registerClient", "([Lcom/appsflyer/internal/AFh1ySDK;)V", "unregisterClient", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", "msg", "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", "throwable", "printMsg", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "i", "w", "v", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "", "getMediationNetwork", "Lhd/g;", "Ljava/util/concurrent/ExecutorService;", "getCurrencyIso4217Code", "LogLevel"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFLogger extends AFh1ySDK {
    public static final AFLogger INSTANCE = new AFLogger();
    private static final g getMediationNetwork = h.b(AnonymousClass7.getRevenue);
    private static final g getCurrencyIso4217Code = h.b(AnonymousClass5.AFAdRevenueData);

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $AFAdRevenueData;
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$AFAdRevenueData = z10;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.i(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$AFAdRevenueData);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$10, reason: invalid class name */
    public static final class AnonymousClass10 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getRevenue = z10;
        }

        public final void getMediationNetwork(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.v(this.$getMonetizationNetwork, this.$getCurrencyIso4217Code, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    public static final class AnonymousClass2 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
            this.$getCurrencyIso4217Code = z10;
        }

        public final void getCurrencyIso4217Code(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.d(this.$getMonetizationNetwork, this.$getRevenue, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "getRevenue", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    public static final class AnonymousClass3 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $areAllFieldsValid;
        private /* synthetic */ boolean $component1;
        private /* synthetic */ AFg1cSDK $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ Throwable $getMonetizationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z10, boolean z11, boolean z12, boolean z13) {
            super(1);
            this.$getCurrencyIso4217Code = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = th;
            this.$getMediationNetwork = z10;
            this.$getRevenue = z11;
            this.$component1 = z12;
            this.$areAllFieldsValid = z13;
        }

        public final void getRevenue(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.e(this.$getCurrencyIso4217Code, this.$AFAdRevenueData, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$getRevenue, this.$component1, this.$areAllFieldsValid);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getRevenue((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    public static final class AnonymousClass4 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ AFg1cSDK $getMonetizationNetwork;
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMonetizationNetwork = aFg1cSDK;
            this.$getRevenue = str;
        }

        public final void getMonetizationNetwork(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.force(this.$getMonetizationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "AFAdRevenueData", "()Ljava/util/concurrent/ExecutorService;"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    public static final class AnonymousClass5 extends p implements Function0<ExecutorService> {
        public static final AnonymousClass5 AFAdRevenueData = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1kSDK.getMediationNetwork();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/appsflyer/internal/AFh1ySDK;", "getMediationNetwork", "()Ljava/util/Set;"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$7, reason: invalid class name */
    public static final class AnonymousClass7 extends p implements Function0<Set<AFh1ySDK>> {
        public static final AnonymousClass7 getRevenue = new AnonymousClass7();

        public AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFh1ySDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", "p0", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFh1ySDK;)V"}, k = j.INTEGER_FIELD_NUMBER, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    public static final class AnonymousClass9 extends p implements Function1<AFh1ySDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z10) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getMonetizationNetwork = z10;
        }

        public final void AFAdRevenueData(AFh1ySDK aFh1ySDK) {
            aFh1ySDK.getClass();
            aFh1ySDK.w(this.$getMediationNetwork, this.$AFAdRevenueData, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFh1ySDK) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/AFLogger$LogLevel;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "level", "I", "getLevel", "()I", "NONE", "ERROR", "WARNING", "INFO", "DEBUG", "VERBOSE"}, k = 1, mv = {1, j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i3) {
            this.level = i3;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    @hd.a
    public static final void afDebugLog(String debugLogMessage) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, true);
    }

    @hd.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.r(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, false, false, 120, null);
    }

    @hd.a
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex, boolean disableReporting) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.r(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, !disableReporting, false, 64, null);
    }

    @hd.a
    public static final void afInfoLog(String logMessage) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, true);
    }

    @hd.a
    public static final void afLogForce(String logMessage) {
        logMessage.getClass();
        INSTANCE.force(AFg1cSDK.OTHER, logMessage);
    }

    @hd.a
    public static final void afRDLog(String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, true);
    }

    @hd.a
    public static final void afVerboseLog(String rdLogMessage) {
        rdLogMessage.getClass();
        INSTANCE.v(AFg1cSDK.OTHER, rdLogMessage, false);
    }

    @hd.a
    public static final void afWarnLog(String warningLogMessage) {
        warningLogMessage.getClass();
        AFh1ySDK.w$default(INSTANCE, AFg1cSDK.OTHER, warningLogMessage, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        Set set = (Set) getMediationNetwork.getValue();
        set.getClass();
        List asList = Arrays.asList(aFh1ySDKArr);
        asList.getClass();
        set.addAll(asList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFh1ySDK[] aFh1ySDKArr) {
        aFh1ySDKArr.getClass();
        ((Set) getMediationNetwork.getValue()).removeAll(w.x(aFh1ySDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(Function1 function1) {
        function1.getClass();
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFh1ySDK) it.next());
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass2(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(AFg1cSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        throwable.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass3(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(AFg1cSDK tag, String msg) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass4(tag, msg)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass1(tag, msg, shouldRemoteDebug)));
    }

    public final void registerClient(AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(client, 1));
    }

    public final void unregisterClient(AFh1ySDK... client) {
        client.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new a(client, 0));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass10(tag, msg, shouldRemoteDebug)));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
        tag.getClass();
        msg.getClass();
        ((ExecutorService) getCurrencyIso4217Code.getValue()).execute(new d0(2, new AnonymousClass9(tag, msg, shouldRemoteDebug)));
    }

    @hd.a
    public static final void afDebugLog(String debugLogMessage, boolean shouldRemoteDebug) {
        debugLogMessage.getClass();
        INSTANCE.d(AFg1cSDK.OTHER, debugLogMessage, shouldRemoteDebug);
    }

    @hd.a
    public static final void afInfoLog(String logMessage, boolean shouldRemoteDebug) {
        logMessage.getClass();
        INSTANCE.i(AFg1cSDK.OTHER, logMessage, shouldRemoteDebug);
    }

    @hd.a
    public static final void afWarnLog(String warningLogMessage, boolean shouldRemoteDebug) {
        warningLogMessage.getClass();
        INSTANCE.w(AFg1cSDK.OTHER, warningLogMessage, shouldRemoteDebug);
    }

    @hd.a
    public static final void afErrorLog(String message, Throwable ex, boolean printMessage, boolean printThrowable, boolean shouldReportToExManager) {
        message.getClass();
        ex.getClass();
        AFh1ySDK.e$default(INSTANCE, AFg1cSDK.OTHER, message, ex, printMessage, printThrowable, shouldReportToExManager, false, 64, null);
    }

    @hd.a
    public static final void afErrorLogForExcManagerOnly(String errorLogMessage, Throwable ex) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.r(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, false, true, false, 64, null);
    }

    @hd.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.r(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, false, false, 104, null);
    }

    @hd.a
    public static final void afErrorLog(String errorLogMessage, Throwable ex, boolean printThrowable, boolean shouldReportToExManager) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (errorLogMessage == null || StringsKt.r(errorLogMessage)) {
            errorLogMessage = "null";
        }
        String str = errorLogMessage;
        if (ex == null) {
            ex = new NullPointerException("Invoked with null Throwable");
        }
        AFh1ySDK.e$default(aFLogger, aFg1cSDK, str, ex, false, printThrowable, shouldReportToExManager, false, 72, null);
    }
}
