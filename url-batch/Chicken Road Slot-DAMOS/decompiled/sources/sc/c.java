package sc;

import com.onesignal.common.modeling.i;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends i {

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class d extends p implements Function0 {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", a.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", b.INSTANCE);
    }

    public final String getSessionId() {
        return i.getStringProperty$default(this, "sessionId", null, 2, null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", d.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", C0075c.INSTANCE);
    }

    public final void setActiveDuration(long j) {
        i.setLongProperty$default(this, "activeDuration", j, null, false, 12, null);
    }

    public final void setFocusTime(long j) {
        i.setLongProperty$default(this, "focusTime", j, null, false, 12, null);
    }

    public final void setSessionId(String str) {
        str.getClass();
        i.setStringProperty$default(this, "sessionId", str, null, false, 12, null);
    }

    public final void setStartTime(long j) {
        i.setLongProperty$default(this, "startTime", j, null, false, 12, null);
    }

    public final void setValid(boolean z10) {
        i.setBooleanProperty$default(this, "isValid", z10, null, false, 12, null);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: sc.c$c, reason: collision with other inner class name */
    public static final class C0075c extends p implements Function0 {
        public static final C0075c INSTANCE = new C0075c();

        public C0075c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }
}
