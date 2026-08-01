package defpackage;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ql extends FloatProperty {
    @Override // android.util.Property
    public final Float get(Object obj) {
        return Float.valueOf(((FocusRingDrawable) obj).p);
    }

    @Override // android.util.FloatProperty
    public final void setValue(Object obj, float f) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        focusRingDrawable.p = f;
        focusRingDrawable.invalidateSelf();
    }
}
