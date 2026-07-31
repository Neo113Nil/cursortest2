package androidx.appcompat.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes13.dex */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {
    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private final int mOpenDrawerContentDescRes;
    private DrawerArrowDrawable mSlider;
    View.OnClickListener mToolbarNavigationClickListener;

    public interface Delegate {
        void setActionBarDescription(int i);

        void setActionBarUpIndicator(Drawable drawable, int i);
    }

    public interface DelegateProvider {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    class AnonymousClass1 implements View.OnClickListener {
        final /* synthetic */ ActionBarDrawerToggle this$0;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionBarDrawerToggle actionBarDrawerToggle = this.this$0;
            if (actionBarDrawerToggle.mDrawerIndicatorEnabled) {
                actionBarDrawerToggle.toggle();
                return;
            }
            View.OnClickListener onClickListener = actionBarDrawerToggle.mToolbarNavigationClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    void toggle() {
        int drawerLockMode = this.mDrawerLayout.getDrawerLockMode(8388611);
        if (this.mDrawerLayout.isDrawerVisible(8388611) && drawerLockMode != 2) {
            this.mDrawerLayout.closeDrawer(8388611);
        } else if (drawerLockMode != 1) {
            this.mDrawerLayout.openDrawer(8388611);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.mDrawerSlideAnimationEnabled) {
            setPosition(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            setPosition(0.0f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        setPosition(1.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        setPosition(0.0f);
        if (this.mDrawerIndicatorEnabled) {
            setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    void setActionBarDescription(int i) {
        this.mActivityImpl.setActionBarDescription(i);
    }

    private void setPosition(float f) {
        if (f == 1.0f) {
            this.mSlider.setVerticalMirror(true);
        } else if (f == 0.0f) {
            this.mSlider.setVerticalMirror(false);
        }
        this.mSlider.setProgress(f);
    }

    private static class FrameworkActionBarDelegate implements Delegate {
        private final Activity mActivity;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                Api18Impl.setHomeAsUpIndicator(actionBar, drawable);
                Api18Impl.setHomeActionContentDescription(actionBar, i);
            }
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            android.app.ActionBar actionBar = this.mActivity.getActionBar();
            if (actionBar != null) {
                Api18Impl.setHomeActionContentDescription(actionBar, i);
            }
        }

        @RequiresApi
        static class Api18Impl {
            @DoNotInline
            static void setHomeActionContentDescription(android.app.ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @DoNotInline
            static void setHomeAsUpIndicator(android.app.ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }
    }

    static class ToolbarCompatDelegate implements Delegate {
        final CharSequence mDefaultContentDescription;
        final Toolbar mToolbar;

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(Drawable drawable, int i) {
            this.mToolbar.setNavigationIcon(drawable);
            setActionBarDescription(i);
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int i) {
            if (i == 0) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(i);
            }
        }
    }
}
