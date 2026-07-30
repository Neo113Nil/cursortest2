package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes.dex */
public final class C0 extends FrameLayout {
    public final com.onevcat.uniwebview.d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(Activity context, com.onevcat.uniwebview.d inspector) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inspector, "inspector");
        this.a = inspector;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.onevcat.uniwebview.d dVar = this.a;
        dVar.getClass();
        if ((motionEvent != null && dVar.a(motionEvent.getRawX(), motionEvent.getRawY())) ? dVar.k : false) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        com.onevcat.uniwebview.d dVar = this.a;
        dVar.getClass();
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (!dVar.a(rawX, rawY)) {
                z = true;
            } else if (!dVar.k) {
                B b = B.b;
                b.a(A.DEBUG, AbstractC0094p0.a(new StringBuilder("Transparency click check ignored for "), dVar.b, " because feature is disabled", b, "message"));
            } else if (dVar.z.getHeight() <= 0 || dVar.z.getWidth() <= 0) {
                B b2 = B.b;
                b2.a(A.DEBUG, AbstractC0094p0.a(new StringBuilder("Transparency click check ignored for "), dVar.b, " because layout size is zero", b2, "message"));
            } else {
                float f = rawX - AbstractC0060h.a(dVar.z).x;
                float f2 = rawY - AbstractC0060h.a(dVar.z).y;
                C0109t0 c0109t0 = dVar.s;
                if (c0109t0 == null) {
                    B b3 = B.b;
                    b3.a(A.DEBUG, AbstractC0094p0.a(new StringBuilder("Transparency click check for "), dVar.b, " has no mask yet", b3, "message"));
                } else {
                    float f3 = c0109t0.b;
                    if (f3 <= 0.0f) {
                        float scale = dVar.v.getScale();
                        Float valueOf = Float.valueOf(scale);
                        if (scale <= 0.0f) {
                            valueOf = null;
                        }
                        f3 = valueOf != null ? valueOf.floatValue() : dVar.v.getResources().getDisplayMetrics().density;
                    }
                    float x = (f - dVar.v.getX()) / f3;
                    float y = (f2 - dVar.v.getY()) / f3;
                    float width = dVar.v.getWidth() / f3;
                    float height = dVar.v.getHeight() / f3;
                    if (x < 0.0f || x > width || y < 0.0f || y > height) {
                        B b4 = B.b;
                        StringBuilder append = new StringBuilder("Transparency click check for ").append(dVar.b).append(" outside web bounds raw=");
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        Locale locale = Locale.US;
                        String format = String.format(locale, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(rawX), Float.valueOf(rawY)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                        StringBuilder append2 = append.append(format).append(" css=");
                        String format2 = String.format(locale, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(x), Float.valueOf(y)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
                        String message = append2.append(format2).toString();
                        b4.getClass();
                        Intrinsics.checkNotNullParameter(message, "message");
                        b4.a(A.DEBUG, message);
                    } else {
                        List list = c0109t0.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((RectF) it.next()).contains(x, y)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        boolean z3 = !z2;
                        B b5 = B.b;
                        StringBuilder append3 = new StringBuilder("Transparency click check for ").append(dVar.b).append(" raw=");
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        Locale locale2 = Locale.US;
                        String format3 = String.format(locale2, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(rawX), Float.valueOf(rawY)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format3, "format(locale, format, *args)");
                        StringBuilder append4 = append3.append(format3).append(" css=");
                        String format4 = String.format(locale2, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(x), Float.valueOf(y)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format4, "format(locale, format, *args)");
                        String message2 = append4.append(format4).append(" passThrough=").append(z3).toString();
                        b5.getClass();
                        Intrinsics.checkNotNullParameter(message2, "message");
                        b5.a(A.DEBUG, message2);
                        z = z3;
                    }
                }
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent == null) {
                return super.onTouchEvent(motionEvent);
            }
            w3 w3Var = this.a.z;
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getX() - w3Var.getX(), motionEvent.getY() - w3Var.getY(), motionEvent.getMetaState());
            boolean dispatchTouchEvent = this.a.z.dispatchTouchEvent(obtain);
            obtain.recycle();
            return dispatchTouchEvent;
        }
        z = false;
        if (!z) {
        }
    }
}
