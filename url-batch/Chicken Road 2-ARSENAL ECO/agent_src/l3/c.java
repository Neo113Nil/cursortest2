package l3;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.j;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class c extends i {

    public static final class a extends j implements InterfaceC0732a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class b extends j implements InterfaceC0732a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* renamed from: l3.c$c, reason: collision with other inner class name */
    public static final class C0085c extends j implements InterfaceC0732a {
        public static final C0085c INSTANCE = new C0085c();

        public C0085c() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
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
        return getBooleanProperty("isValid", C0085c.INSTANCE);
    }

    public final void setActiveDuration(long j4) {
        i.setLongProperty$default(this, "activeDuration", j4, null, false, 12, null);
    }

    public final void setFocusTime(long j4) {
        i.setLongProperty$default(this, "focusTime", j4, null, false, 12, null);
    }

    public final void setSessionId(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        i.setStringProperty$default(this, "sessionId", value, null, false, 12, null);
    }

    public final void setStartTime(long j4) {
        i.setLongProperty$default(this, "startTime", j4, null, false, 12, null);
    }

    public final void setValid(boolean z5) {
        i.setBooleanProperty$default(this, "isValid", z5, null, false, 12, null);
    }
}
