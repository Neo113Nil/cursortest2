package com.onevcat.uniwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class X extends FrameLayout {
    public final Y a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Context context, Y inspector) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inspector, "inspector");
        this.a = inspector;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((N) this.a).l) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        N n = (N) this.a;
        if (n.l && motionEvent != null && n.e.getHeight() > 0 && n.e.getWidth() > 0) {
            Bitmap a = n.a((Rect) null);
            if (motionEvent.getY() > 0.0f && motionEvent.getY() < a.getHeight() && motionEvent.getX() > 0.0f && motionEvent.getX() < a.getWidth()) {
                int pixel = a.getPixel((int) motionEvent.getX(), (int) motionEvent.getY());
                int red = Color.red(pixel);
                int green = Color.green(pixel);
                int blue = Color.blue(pixel);
                int alpha = Color.alpha(pixel);
                C0060l c0060l = C0060l.b;
                String message = "Clicking on color: (" + red + ", " + green + ", " + blue + ") @ " + alpha;
                c0060l.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0060l.a(EnumC0057k.VERBOSE, message);
                if (alpha == 0) {
                    return super.onTouchEvent(motionEvent);
                }
            }
        }
        return ((N) this.a).p.onTouchEvent(motionEvent);
    }
}
