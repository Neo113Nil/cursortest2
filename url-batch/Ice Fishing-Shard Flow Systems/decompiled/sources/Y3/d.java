package Y3;

import com.onesignal.common.modeling.i;
import com.onesignal.inAppMessages.internal.display.impl.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class d extends i {

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

    /* renamed from: Y3.d$d, reason: collision with other inner class name */
    public static final class C0003d extends p implements Function0 {
        public static final C0003d INSTANCE = new C0003d();

        public C0003d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class e extends p implements Function0 {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

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
        return getStringProperty("sdk", e.INSTANCE);
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
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionStatus");
    }

    public final g getType() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, m.EVENT_TYPE_KEY, null, 2, null);
        Enum valueOf = optAnyProperty$default != null ? optAnyProperty$default instanceof g ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? g.valueOf((String) optAnyProperty$default) : (g) optAnyProperty$default : null;
        if (valueOf != null) {
            return (g) valueOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.onesignal.user.internal.subscriptions.SubscriptionType");
    }

    public final boolean isDisabledInternally() {
        return getBooleanProperty("isDisabledInternally", C0003d.INSTANCE);
    }

    public final void setAddress(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "address", value, null, false, 12, null);
    }

    public final void setAppVersion(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "appVersion", value, null, false, 12, null);
    }

    public final void setCarrier(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "carrier", value, null, false, 12, null);
    }

    public final void setDeviceOS(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "deviceOS", value, null, false, 12, null);
    }

    public final void setDisabledInternally(boolean z7) {
        i.setBooleanProperty$default(this, "isDisabledInternally", z7, null, false, 12, null);
    }

    public final void setOptedIn(boolean z7) {
        i.setBooleanProperty$default(this, "optedIn", z7, null, false, 12, null);
    }

    public final void setSdk(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "sdk", value, null, false, 12, null);
    }

    public final void setStatus(f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setOptAnyProperty("status", value.toString(), "NORMAL", false);
    }

    public final void setType(g value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setOptAnyProperty(m.EVENT_TYPE_KEY, value.toString(), "NORMAL", false);
    }
}
