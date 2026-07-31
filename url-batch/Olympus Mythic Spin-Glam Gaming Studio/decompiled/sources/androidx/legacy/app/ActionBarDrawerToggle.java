package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

@Deprecated
/* loaded from: classes15.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private static final int[] THEME_ATTRS = {R.attr.homeAsUpIndicator};
    final Activity mActivity;
    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    private boolean mDrawerIndicatorEnabled;
    private final int mOpenDrawerContentDescRes;
    private SlideDrawable mSlider;

    @Deprecated
    public interface Delegate {
        void setActionBarDescription(int i);
    }

    @Deprecated
    public interface DelegateProvider {
    }

    private static class SetIndicatorInfo {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        float min;
        float position = this.mSlider.getPosition();
        if (f > 0.5f) {
            min = Math.max(position, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(position, f * 2.0f);
        }
        this.mSlider.setPosition(min);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        this.mSlider.setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        this.mSlider.setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    private void setActionBarDescription(int i) {
        Delegate delegate = this.mActivityImpl;
        if (delegate != null) {
            delegate.setActionBarDescription(i);
            return;
        }
        ActionBar actionBar = this.mActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    private class SlideDrawable extends InsetDrawable implements Drawable.Callback {
        private final boolean mHasMirroring;
        private float mOffset;
        private float mPosition;
        private final Rect mTmpRect;
        final /* synthetic */ ActionBarDrawerToggle this$0;

        public void setPosition(float f) {
            this.mPosition = f;
            invalidateSelf();
        }

        public float getPosition() {
            return this.mPosition;
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            copyBounds(this.mTmpRect);
            canvas.save();
            boolean z = ViewCompat.getLayoutDirection(this.this$0.mActivity.getWindow().getDecorView()) == 1;
            int i = z ? -1 : 1;
            float width = this.mTmpRect.width();
            canvas.translate((-this.mOffset) * width * this.mPosition * i, 0.0f);
            if (z && !this.mHasMirroring) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }
}
