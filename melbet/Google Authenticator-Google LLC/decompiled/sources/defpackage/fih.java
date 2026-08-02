package defpackage;

import android.util.FloatProperty;
import com.google.android.material.focus.FocusRingDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fih extends FloatProperty {
    public fih() {
        super("interpolation");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = FocusRingDrawable.a;
        return Float.valueOf(((FocusRingDrawable) obj).b);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
        int[] iArr = FocusRingDrawable.a;
        focusRingDrawable.b = f;
        focusRingDrawable.invalidateSelf();
    }
}
