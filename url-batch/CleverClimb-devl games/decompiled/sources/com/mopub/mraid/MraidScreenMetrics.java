package com.mopub.mraid;

import android.content.Context;
import android.graphics.Rect;
import com.mopub.common.util.Dips;

/* loaded from: classes2.dex */
class MraidScreenMetrics {
    private final Context mContext;
    private final float mDensity;
    private final Rect mScreenRect = new Rect();
    private final Rect mScreenRectDips = new Rect();
    private final Rect mRootViewRect = new Rect();
    private final Rect mRootViewRectDips = new Rect();
    private final Rect mCurrentAdRect = new Rect();
    private final Rect mCurrentAdRectDips = new Rect();
    private final Rect mDefaultAdRect = new Rect();
    private final Rect mDefaultAdRectDips = new Rect();

    MraidScreenMetrics(Context context, float f) {
        this.mContext = context.getApplicationContext();
        this.mDensity = f;
    }

    private void convertToDips(Rect rect, Rect rect2) {
        rect2.set(Dips.pixelsToIntDips(rect.left, this.mContext), Dips.pixelsToIntDips(rect.top, this.mContext), Dips.pixelsToIntDips(rect.right, this.mContext), Dips.pixelsToIntDips(rect.bottom, this.mContext));
    }

    public float getDensity() {
        return this.mDensity;
    }

    void setScreenSize(int i, int i2) {
        this.mScreenRect.set(0, 0, i, i2);
        convertToDips(this.mScreenRect, this.mScreenRectDips);
    }

    Rect getScreenRect() {
        return this.mScreenRect;
    }

    Rect getScreenRectDips() {
        return this.mScreenRectDips;
    }

    void setRootViewPosition(int i, int i2, int i3, int i4) {
        this.mRootViewRect.set(i, i2, i3 + i, i4 + i2);
        convertToDips(this.mRootViewRect, this.mRootViewRectDips);
    }

    Rect getRootViewRect() {
        return this.mRootViewRect;
    }

    Rect getRootViewRectDips() {
        return this.mRootViewRectDips;
    }

    void setCurrentAdPosition(int i, int i2, int i3, int i4) {
        this.mCurrentAdRect.set(i, i2, i3 + i, i4 + i2);
        convertToDips(this.mCurrentAdRect, this.mCurrentAdRectDips);
    }

    Rect getCurrentAdRect() {
        return this.mCurrentAdRect;
    }

    Rect getCurrentAdRectDips() {
        return this.mCurrentAdRectDips;
    }

    void setDefaultAdPosition(int i, int i2, int i3, int i4) {
        this.mDefaultAdRect.set(i, i2, i3 + i, i4 + i2);
        convertToDips(this.mDefaultAdRect, this.mDefaultAdRectDips);
    }

    Rect getDefaultAdRect() {
        return this.mDefaultAdRect;
    }

    Rect getDefaultAdRectDips() {
        return this.mDefaultAdRectDips;
    }
}
