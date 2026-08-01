package dd;

import a2.r;
import com.onesignal.common.modeling.i;
import com.onesignal.inAppMessages.internal.display.impl.n;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends i {
    public d() {
        super(null, null, 3, null);
    }

    public final String getAddress() {
        return i.getStringProperty$default(this, "address", null, 2, null);
    }

    public final String getAppVersion() {
        return getStringProperty("appVersion", a.INSTANCE);
    }

    public final String getCarrier() {
        return getStringProperty("carrier", b.INSTANCE);
    }

    public final String getDeviceOS() {
        return getStringProperty("deviceOS", c.INSTANCE);
    }

    public final boolean getOptedIn() {
        return i.getBooleanProperty$default(this, "optedIn", null, 2, null);
    }

    public final String getSdk() {
        return getStringProperty("sdk", C0073d.INSTANCE);
    }

    public final f getStatus() {
        if (!hasProperty("status")) {
            f fVar = f.SUBSCRIBED;
            setOptAnyProperty("status", fVar != null ? fVar.toString() : null, "NORMAL", false);
        }
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "status", null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof f ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? f.valueOf((String) optAnyProperty$default) : (f) optAnyProperty$default : null;
        if (valueOf != null) {
            return (f) valueOf;
        }
        r.j("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
        return null;
    }

    public final g getType() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, n.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (g) valueOf;
        }
        r.j("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
        return null;
    }

    public final void setAddress(String str) {
        str.getClass();
        i.setStringProperty$default(this, "address", str, null, false, 12, null);
    }

    public final void setAppVersion(String str) {
        str.getClass();
        i.setStringProperty$default(this, "appVersion", str, null, false, 12, null);
    }

    public final void setCarrier(String str) {
        str.getClass();
        i.setStringProperty$default(this, "carrier", str, null, false, 12, null);
    }

    public final void setDeviceOS(String str) {
        str.getClass();
        i.setStringProperty$default(this, "deviceOS", str, null, false, 12, null);
    }

    public final void setOptedIn(boolean z10) {
        i.setBooleanProperty$default(this, "optedIn", z10, null, false, 12, null);
    }

    public final void setSdk(String str) {
        str.getClass();
        i.setStringProperty$default(this, "sdk", str, null, false, 12, null);
    }

    public final void setStatus(f fVar) {
        fVar.getClass();
        setOptAnyProperty("status", fVar.toString(), "NORMAL", false);
    }

    public final void setType(g gVar) {
        gVar.getClass();
        setOptAnyProperty(n.EVENT_TYPE_KEY, gVar.toString(), "NORMAL", false);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function0 {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: dd.d$d, reason: collision with other inner class name */
    public static final class C0073d extends p implements Function0 {
        public static final C0073d INSTANCE = new C0073d();

        public C0073d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }
}
