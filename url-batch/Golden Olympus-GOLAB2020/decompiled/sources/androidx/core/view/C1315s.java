package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: androidx.core.view.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315s {

    /* renamed from: a, reason: collision with root package name */
    private final GestureDetector f11982a;

    public C1315s(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f11982a = new GestureDetector(context, onGestureListener, handler);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f11982a.onTouchEvent(motionEvent);
    }
}
