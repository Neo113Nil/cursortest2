package com.onevcat.uniwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 extends FrameLayout {
    public final c1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Context context, c1 inspector) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inspector, "inspector");
        this.a = inspector;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((s0) this.a).l) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s0 s0Var = (s0) this.a;
        if (s0Var.l && motionEvent != null && s0Var.e.getHeight() > 0 && s0Var.e.getWidth() > 0) {
            Bitmap a = s0Var.a((Rect) null);
            if (motionEvent.getY() > 0.0f && motionEvent.getY() < a.getHeight() && motionEvent.getX() > 0.0f && motionEvent.getX() < a.getWidth()) {
                int pixel = a.getPixel((int) motionEvent.getX(), (int) motionEvent.getY());
                int red = Color.red(pixel);
                int green = Color.green(pixel);
                int blue = Color.blue(pixel);
                int alpha = Color.alpha(pixel);
                o oVar = o.b;
                String message = "Clicking on color: (" + red + ", " + green + ", " + blue + ") @ " + alpha;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                oVar.a(n.VERBOSE, message);
                if (alpha == 0) {
                    return super.onTouchEvent(motionEvent);
                }
            }
        }
        return ((s0) this.a).p.onTouchEvent(motionEvent);
    }
}
