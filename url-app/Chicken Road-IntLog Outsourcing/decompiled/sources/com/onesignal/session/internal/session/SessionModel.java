package com.onesignal.session.internal.session;

import com.onesignal.common.modeling.Model;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SessionModel extends Model {
    public SessionModel() {
        super(null, null, 3, null);
    }

    public final long getActiveDuration() {
        return getLongProperty("activeDuration", SessionModel$activeDuration$1.INSTANCE);
    }

    public final long getFocusTime() {
        return getLongProperty("focusTime", SessionModel$focusTime$1.INSTANCE);
    }

    public final String getSessionId() {
        return Model.getStringProperty$default(this, "sessionId", null, 2, null);
    }

    public final long getStartTime() {
        return getLongProperty("startTime", SessionModel$startTime$1.INSTANCE);
    }

    public final boolean isValid() {
        return getBooleanProperty("isValid", SessionModel$isValid$1.INSTANCE);
    }

    public final void setActiveDuration(long j2) {
        Model.setLongProperty$default(this, "activeDuration", j2, null, false, 12, null);
    }

    public final void setFocusTime(long j2) {
        Model.setLongProperty$default(this, "focusTime", j2, null, false, 12, null);
    }

    public final void setSessionId(String value) {
        i.e(value, "value");
        Model.setStringProperty$default(this, "sessionId", value, null, false, 12, null);
    }

    public final void setStartTime(long j2) {
        Model.setLongProperty$default(this, "startTime", j2, null, false, 12, null);
    }

    public final void setValid(boolean z) {
        Model.setBooleanProperty$default(this, "isValid", z, null, false, 12, null);
    }
}
