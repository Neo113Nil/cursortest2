package sb;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import ea.f;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pc.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements rb.a {
    public static final C0074a Companion = new C0074a(null);
    private static final String EVENT_NOTIFICATION_INFLUENCE_OPEN = "os_notification_influence_open";
    private static final String EVENT_NOTIFICATION_OPENED = "os_notification_opened";
    private static final String EVENT_NOTIFICATION_RECEIVED = "os_notification_received";
    private static Class<?> firebaseAnalyticsClass;
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final sa.a _time;
    private AtomicLong lastOpenedTime;
    private String lastReceivedNotificationCampaign;
    private String lastReceivedNotificationId;
    private AtomicLong lastReceivedTime;
    private Object mFirebaseAnalyticsInstance;

    public a(f fVar, com.onesignal.core.internal.config.b bVar, sa.a aVar) {
        fVar.getClass();
        bVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._time = aVar;
    }

    private final Object getFirebaseAnalyticsInstance() {
        if (this.mFirebaseAnalyticsInstance == null) {
            Method instanceMethod = Companion.getInstanceMethod(firebaseAnalyticsClass);
            try {
                instanceMethod.getClass();
                this.mFirebaseAnalyticsInstance = instanceMethod.invoke(null, this._applicationService.getAppContext());
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.mFirebaseAnalyticsInstance;
    }

    private final boolean isEnabled() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getFirebaseAnalytics();
    }

    @Override // rb.a
    public void trackInfluenceOpenEvent() {
        if (!isEnabled() || this.lastReceivedTime == null || this.lastReceivedNotificationId == null) {
            return;
        }
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        AtomicLong atomicLong = this.lastReceivedTime;
        atomicLong.getClass();
        if (currentTimeMillis - atomicLong.get() > 120000) {
            return;
        }
        AtomicLong atomicLong2 = this.lastOpenedTime;
        if (atomicLong2 != null) {
            atomicLong2.getClass();
            if (currentTimeMillis - atomicLong2.get() < 30000) {
                return;
            }
        }
        try {
            Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
            Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            String str = this.lastReceivedNotificationId;
            str.getClass();
            bundle.putString(e.NOTIFICATION_ID_TAG, str);
            String str2 = this.lastReceivedNotificationCampaign;
            str2.getClass();
            bundle.putString("campaign", str2);
            trackMethod.getClass();
            trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_INFLUENCE_OPEN, bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // rb.a
    public void trackOpenedEvent(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (isEnabled()) {
            if (this.lastOpenedTime == null) {
                this.lastOpenedTime = new AtomicLong();
            }
            AtomicLong atomicLong = this.lastOpenedTime;
            atomicLong.getClass();
            atomicLong.set(this._time.getCurrentTimeMillis());
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", "notification");
                bundle.putString(e.NOTIFICATION_ID_TAG, str);
                bundle.putString("campaign", str2);
                trackMethod.getClass();
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_OPENED, bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // rb.a
    public void trackReceivedEvent(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (isEnabled()) {
            try {
                Object firebaseAnalyticsInstance = getFirebaseAnalyticsInstance();
                Method trackMethod = Companion.getTrackMethod(firebaseAnalyticsClass);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", "notification");
                bundle.putString(e.NOTIFICATION_ID_TAG, str);
                bundle.putString("campaign", str2);
                trackMethod.getClass();
                trackMethod.invoke(firebaseAnalyticsInstance, EVENT_NOTIFICATION_RECEIVED, bundle);
                if (this.lastReceivedTime == null) {
                    this.lastReceivedTime = new AtomicLong();
                }
                AtomicLong atomicLong = this.lastReceivedTime;
                atomicLong.getClass();
                atomicLong.set(this._time.getCurrentTimeMillis());
                this.lastReceivedNotificationId = str;
                this.lastReceivedNotificationCampaign = str2;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: sb.a$a, reason: collision with other inner class name */
    public static final class C0074a {
        public /* synthetic */ C0074a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getInstanceMethod(Class<?> cls) {
            try {
                cls.getClass();
                return cls.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getTrackMethod(Class<?> cls) {
            try {
                cls.getClass();
                return cls.getMethod("logEvent", String.class, Bundle.class);
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public final boolean canTrack() {
            try {
                a.firebaseAnalyticsClass = FirebaseAnalytics.class;
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }

        private C0074a() {
        }
    }
}
