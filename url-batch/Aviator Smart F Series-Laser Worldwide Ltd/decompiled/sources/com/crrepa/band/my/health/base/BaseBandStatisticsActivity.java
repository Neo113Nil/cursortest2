package com.crrepa.band.my.health.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityBaseBandStatisticsBinding;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;

/* loaded from: classes2.dex */
public abstract class BaseBandStatisticsActivity extends BaseActivity {
    protected ActivityBaseBandStatisticsBinding binding;
    private Menu menu;
    private boolean menuVisible = true;

    public static Intent getCallingIntent(Context context, Class<?> cls) {
        return new Intent(context, cls);
    }

    private boolean isMenuVisible() {
        return this.menuVisible;
    }

    private void setActionBar(@ColorInt int i8) {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundColor(i8);
    }

    private void setMenuVisible(Menu menu) {
        if (menu == null) {
            return;
        }
        for (int i8 = 0; i8 < menu.size(); i8++) {
            menu.getItem(i8).setVisible(isMenuVisible());
        }
    }

    protected long getId() {
        return getIntent().getLongExtra("statistics_id", -1L);
    }

    protected abstract BaseFragement getRootFragment();

    protected abstract void initView();

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBaseBandStatisticsBinding inflate = ActivityBaseBandStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        initView();
        setActionBar(getStatusBarColor());
        loadRootFragment(R.id.statistics_content, getRootFragment());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_history_menu, menu);
        return true;
    }

    protected abstract void onHistoryClick();

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressedSupport();
        } else if (itemId == R.id.menu_band_data_history) {
            onHistoryClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.menu = menu;
        setMenuVisible(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    public void setTitleContent(@StringRes int i8) {
        this.binding.includeTitleBar.tvToolbarTitle.setText(i8);
    }

    public void setTitleContent(String str) {
        this.binding.includeTitleBar.tvToolbarTitle.setText(str);
    }

    public void setMenuVisible(boolean z7) {
        this.menuVisible = z7;
        setMenuVisible(this.menu);
    }
}
