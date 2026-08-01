package com.appsflyer.internal;

import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000 \t2\u00020\u0001:\u0004\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "getRevenue", "Ljava/lang/String;", "getMediationNetwork", "AFa1ySDK", "AFa1tSDK", "AFa1zSDK", "AFa1uSDK"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFe1rSDK {

    /* renamed from: AFa1ySDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<String> getMediationNetwork = y.f(AFInAppEventType.ACHIEVEMENT_UNLOCKED, AFInAppEventType.AD_CLICK, AFInAppEventType.AD_VIEW, AFInAppEventType.ADD_PAYMENT_INFO, AFInAppEventType.ADD_TO_CART, AFInAppEventType.ADD_TO_WISH_LIST, AFInAppEventType.COMPLETE_REGISTRATION, AFInAppEventType.CONTENT_VIEW, AFInAppEventType.INITIATED_CHECKOUT, AFInAppEventType.INVITE, AFInAppEventType.LEVEL_ACHIEVED, AFInAppEventType.LIST_VIEW, AFInAppEventType.LOGIN, AFInAppEventType.OPENED_FROM_PUSH_NOTIFICATION, AFInAppEventType.PURCHASE, AFInAppEventType.RATE, AFInAppEventType.RE_ENGAGE, AFInAppEventType.SEARCH, AFInAppEventType.SHARE, AFInAppEventType.SPENT_CREDIT, AFInAppEventType.START_TRIAL, AFInAppEventType.SUBSCRIBE, AFInAppEventType.TRAVEL_BOOKING, AFInAppEventType.TUTORIAL_COMPLETION, AFInAppEventType.UPDATE);

    /* renamed from: getRevenue, reason: from kotlin metadata */
    public final String getMediationNetwork;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1tSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    public static final class AFa1tSDK extends AFe1rSDK {
        public static final AFa1tSDK INSTANCE = new AFa1tSDK();

        private AFa1tSDK() {
            super("install");
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1uSDK;", "Lcom/appsflyer/internal/AFe1rSDK;", "<init>", "()V"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    public static final class AFa1uSDK extends AFe1rSDK {
        public static final AFa1uSDK INSTANCE = new AFa1uSDK();

        private AFa1uSDK() {
            super("af_sandbox_revenue");
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class AFa1zSDK extends AFe1rSDK {
        public final Integer AFAdRevenueData;
        public final Float getCurrencyIso4217Code;
        private final String getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AFa1zSDK(String str, Float f3, Integer num) {
            super(str);
            str.getClass();
            this.getMediationNetwork = str;
            this.getCurrencyIso4217Code = f3;
            this.AFAdRevenueData = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1zSDK)) {
                return false;
            }
            AFa1zSDK aFa1zSDK = (AFa1zSDK) obj;
            return Intrinsics.a(this.getMediationNetwork, aFa1zSDK.getMediationNetwork) && Intrinsics.a(this.getCurrencyIso4217Code, aFa1zSDK.getCurrencyIso4217Code) && Intrinsics.a(this.AFAdRevenueData, aFa1zSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int hashCode = this.getMediationNetwork.hashCode() * 31;
            Float f3 = this.getCurrencyIso4217Code;
            int hashCode2 = (hashCode + (f3 == null ? 0 : f3.hashCode())) * 31;
            Integer num = this.AFAdRevenueData;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "PredefinedInAppEvent(name=" + this.getMediationNetwork + ", eventRevenue=" + this.getCurrencyIso4217Code + ", eventCounter=" + this.AFAdRevenueData + ")";
        }
    }

    public AFe1rSDK(String str) {
        str.getClass();
        this.getMediationNetwork = str;
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFe1rSDK$AFa1ySDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1mSDK;", "p0", "Lcom/appsflyer/internal/AFe1rSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1mSDK;)Lcom/appsflyer/internal/AFe1rSDK;", "", "", "Ljava/util/List;", "AFAdRevenueData"}, k = 1, mv = {1, a4.j.BYTES_FIELD_NUMBER, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFe1rSDK$AFa1ySDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static AFe1rSDK getMediationNetwork(AFh1mSDK p02) {
            Float f3;
            Object obj;
            String obj2;
            Object obj3;
            String obj4;
            p02.getClass();
            if (p02.AFAdRevenueData() == AFe1pSDK.CONVERSION) {
                return AFa1tSDK.INSTANCE;
            }
            Integer num = null;
            if (p02.AFAdRevenueData() != AFe1pSDK.INAPP || !AFe1rSDK.getMediationNetwork.contains(p02.areAllFieldsValid)) {
                return null;
            }
            Map<String, Object> map = p02.getRevenue;
            if (map != null && (obj3 = map.get(AFInAppEventParameterName.REVENUE)) != null && (obj4 = obj3.toString()) != null) {
                if (kotlin.text.n.e(obj4)) {
                    f3 = Float.valueOf(Float.parseFloat(obj4));
                    obj = p02.AFAdRevenueData.get("iaecounter");
                    if (obj != null && (obj2 = obj.toString()) != null) {
                        num = StringsKt.toIntOrNull(obj2);
                    }
                    String str = p02.areAllFieldsValid;
                    str.getClass();
                    return new AFa1zSDK(str, f3, num);
                }
            }
            f3 = null;
            obj = p02.AFAdRevenueData.get("iaecounter");
            if (obj != null) {
                num = StringsKt.toIntOrNull(obj2);
            }
            String str2 = p02.areAllFieldsValid;
            str2.getClass();
            return new AFa1zSDK(str2, f3, num);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
