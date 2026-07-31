package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;

/* loaded from: classes13.dex */
public class MotionWidget implements TypedValues {
    WidgetFrame widgetFrame;

    public static class Motion {
    }

    public static class PropertySet {
    }

    public String toString() {
        return this.widgetFrame.left + ", " + this.widgetFrame.top + ", " + this.widgetFrame.right + ", " + this.widgetFrame.bottom;
    }
}
