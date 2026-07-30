package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes4.dex */
abstract class g {
    private static final Rect RECT = new Rect();
    private static final RectF RECT_F = new RectF();
    private static final Paint PAINT = new Paint(1);

    private g() {
    }

    static Paint paint() {
        return PAINT;
    }

    static Rect rect() {
        return RECT;
    }

    static RectF rectF() {
        return RECT_F;
    }
}
