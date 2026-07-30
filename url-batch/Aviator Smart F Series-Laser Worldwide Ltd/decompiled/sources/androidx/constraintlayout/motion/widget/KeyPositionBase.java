package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes.dex */
abstract class KeyPositionBase extends Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit = Key.UNSET;

    KeyPositionBase() {
    }

    abstract void calcPosition(int i8, int i9, float f8, float f9, float f10, float f11);

    @Override // androidx.constraintlayout.motion.widget.Key
    void getAttributeNames(HashSet<String> hashSet) {
    }

    abstract float getPositionX();

    abstract float getPositionY();

    public abstract boolean intersects(int i8, int i9, RectF rectF, RectF rectF2, float f8, float f9);

    abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f8, float f9, String[] strArr, float[] fArr);
}
