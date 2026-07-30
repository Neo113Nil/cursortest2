package com.crrepa.band.my.health.weight;

import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityWeightHistoryBinding;
import com.crrepa.band.my.health.base.editpage.EditInfoActivity;
import com.crrepa.band.my.health.base.editpage.h;
import com.crrepa.band.my.health.weight.adapter.WeightHistoryAdapter;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.db.Weight;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.yanzhenjie.recyclerview.g;
import com.yanzhenjie.recyclerview.i;
import com.yanzhenjie.recyclerview.j;
import com.yanzhenjie.recyclerview.k;
import com.yanzhenjie.recyclerview.l;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class WeightHistoryActivity extends BaseVBActivity<ActivityWeightHistoryBinding> implements j3.a {
    private final h3.a presenter = new h3.a();
    private final k swipeMenuCreator = new k() { // from class: com.crrepa.band.my.health.weight.b
        @Override // com.yanzhenjie.recyclerview.k
        public final void onCreateMenu(i iVar, i iVar2, int i8) {
            WeightHistoryActivity.this.lambda$new$1(iVar, iVar2, i8);
        }
    };
    private WeightHistoryAdapter weightHistoryAdapter;

    private void initListener() {
        this.weightHistoryAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.health.weight.c
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                WeightHistoryActivity.this.lambda$initListener$2(baseQuickAdapter, view, i8);
            }
        });
    }

    private void initRecycleView() {
        this.weightHistoryAdapter = new WeightHistoryAdapter(null, this);
        ((ActivityWeightHistoryBinding) this.binding).rcvWeightRecords.setLayoutManager(new LinearLayoutManager(this));
        this.presenter.getAllWeightHistoryList();
        setRecycleViewMenu();
    }

    private void initView() {
        setActionBar();
        initRecycleView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$2(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Weight weightByPosition = this.presenter.getWeightByPosition(i8);
        if (weightByPosition != null) {
            startActivity(WeightStatisticsActivity.getCallingIntent(this, weightByPosition.getDate()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(i iVar, i iVar2, int i8) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.weight_history_menu_width);
        iVar2.addMenuItem(new l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_weight)).setTextColor(ContextCompat.getColor(this, R.color.white)).setText(getString(R.string.edit)).setTextSize(13).setWidth(dimensionPixelSize).setHeight(-1));
        iVar2.addMenuItem(new l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_remove_menu_bg)).setTextColor(ContextCompat.getColor(this, R.color.white)).setText(getString(R.string.remove)).setTextSize(13).setWidth(dimensionPixelSize).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setRecycleViewMenu$0(j jVar, int i8) {
        jVar.closeMenu();
        int position = jVar.getPosition();
        Weight weightByPosition = this.presenter.getWeightByPosition(i8);
        if (weightByPosition == null || !weightByPosition.isShowWeight()) {
            return;
        }
        if (position == 0) {
            com.orhanobut.logger.f.d("weight ==> edit : " + i8);
            startActivity(EditInfoActivity.getCallingIntent(this, 0, h.getInstance().setEditObject(this, 0, weightByPosition)));
            return;
        }
        if (position == 1) {
            com.orhanobut.logger.f.d("weight ==> delete : " + i8);
            int i9 = i8 + (-1);
            boolean isShowWeight = this.presenter.getWeightByPosition(i9).isShowWeight() ^ true;
            Weight weightByPosition2 = this.presenter.getWeightByPosition(i8 + 1);
            this.weightHistoryAdapter.remove(i8);
            if (isShowWeight && (weightByPosition2 == null || !weightByPosition2.isShowWeight())) {
                this.weightHistoryAdapter.remove(i9);
                com.orhanobut.logger.f.d("weight ==> delete day : " + i9);
            }
            this.presenter.deleteWeight(weightByPosition);
            updateShowMenu();
        }
    }

    private void setActionBar() {
        setSupportActionBar(((ActivityWeightHistoryBinding) this.binding).includeAppToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWeightHistoryBinding) this.binding).includeAppToolbar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        ((ActivityWeightHistoryBinding) this.binding).includeAppToolbar.toolbar.setBackgroundResource(R.color.color_weight);
        ((ActivityWeightHistoryBinding) this.binding).includeAppToolbar.tvToolbarTitle.setTextColor(ContextCompat.getColor(this, R.color.white));
        ((ActivityWeightHistoryBinding) this.binding).includeAppToolbar.tvToolbarTitle.setText(getString(R.string.tv_weight_records));
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_weight));
    }

    private void setRecycleViewMenu() {
        ((ActivityWeightHistoryBinding) this.binding).rcvWeightRecords.setSwipeMenuCreator(this.swipeMenuCreator);
        ((ActivityWeightHistoryBinding) this.binding).rcvWeightRecords.setOnItemMenuClickListener(new g() { // from class: com.crrepa.band.my.health.weight.a
            @Override // com.yanzhenjie.recyclerview.g
            public final void onItemClick(j jVar, int i8) {
                WeightHistoryActivity.this.lambda$setRecycleViewMenu$0(jVar, i8);
            }
        });
        ((ActivityWeightHistoryBinding) this.binding).rcvWeightRecords.setAdapter(this.weightHistoryAdapter);
        updateShowMenu();
    }

    private void updateShowMenu() {
        for (int i8 = 0; i8 < this.presenter.getHistoryListSize(); i8++) {
            ((ActivityWeightHistoryBinding) this.binding).rcvWeightRecords.setSwipeItemMenuEnabled(i8, this.presenter.getWeightByPosition(i8).isShowWeight());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.presenter.setView(this);
        initView();
        initListener();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(WeightStatisticsActivity.getCallingIntent(this, new Date()));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressedSupport();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onWeightChangeEvent(WeightChangeEvent weightChangeEvent) {
        if (weightChangeEvent.isUpdateHistory()) {
            this.presenter.getAllWeightHistoryList();
            updateShowMenu();
        }
    }

    @Override // j3.a
    public void renderWeightRecords(List<Weight> list) {
        this.weightHistoryAdapter.setNewData(list);
    }
}
