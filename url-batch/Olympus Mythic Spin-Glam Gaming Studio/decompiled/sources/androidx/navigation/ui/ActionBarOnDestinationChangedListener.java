package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

@RestrictTo
/* loaded from: classes6.dex */
class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity mActivity;

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(CharSequence charSequence) {
        this.mActivity.getSupportActionBar().setTitle(charSequence);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(Drawable drawable, int i) {
        ActionBar supportActionBar = this.mActivity.getSupportActionBar();
        if (drawable == null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
        } else {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            this.mActivity.getDrawerToggleDelegate().setActionBarUpIndicator(drawable, i);
        }
    }
}
