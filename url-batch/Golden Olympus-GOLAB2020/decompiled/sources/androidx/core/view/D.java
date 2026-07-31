package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public abstract class D {
    public static boolean a(MotionEvent motionEvent, int i4) {
        return (motionEvent.getSource() & i4) == i4;
    }
}
