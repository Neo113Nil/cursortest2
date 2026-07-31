package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.fragment.app.FragmentTransaction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NavigationMode {
    }

    public interface OnMenuVisibilityListener {
        void onMenuVisibilityChanged(boolean z);
    }

    @Deprecated
    public interface OnNavigationListener {
        boolean onNavigationItemSelected(int i, long j);
    }

    @Deprecated
    public static abstract class Tab {
        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract int getPosition();

        public abstract CharSequence getText();

        public abstract void select();
    }

    @Deprecated
    public interface TabListener {
        void onTabReselected(Tab tab, FragmentTransaction fragmentTransaction);

        void onTabSelected(Tab tab, FragmentTransaction fragmentTransaction);

        void onTabUnselected(Tab tab, FragmentTransaction fragmentTransaction);
    }

    public boolean closeOptionsMenu() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
    }

    public abstract int getDisplayOptions();

    public Context getThemedContext() {
        return null;
    }

    public boolean invalidateOptionsMenu() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    void onDestroy() {
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onMenuKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    public boolean openOptionsMenu() {
        return false;
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean z);

    public void setHomeActionContentDescription(int i) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
    }

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public void setWindowTitle(CharSequence charSequence) {
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBarLayout);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
