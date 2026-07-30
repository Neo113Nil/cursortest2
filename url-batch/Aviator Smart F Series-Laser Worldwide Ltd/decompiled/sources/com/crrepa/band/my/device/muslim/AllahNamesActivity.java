package com.crrepa.band.my.device.muslim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityAllahNamesBinding;
import com.crrepa.band.my.device.muslim.adapter.AllahNameAdapter;
import com.crrepa.band.my.device.muslim.model.AllahName;
import com.crrepa.band.my.device.muslim.model.BandMuslimNameChangeEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class AllahNamesActivity extends BaseVBActivity<ActivityAllahNamesBinding> {
    AllahNameAdapter adapter = new AllahNameAdapter();
    private com.crrepa.band.my.device.muslim.utils.b muslimManager;

    private void initRecyclerView() {
        if (this.adapter.getData().isEmpty()) {
            ((ActivityAllahNamesBinding) this.binding).rcvNames.setLayoutManager(new LinearLayoutManager(this));
            ((ActivityAllahNamesBinding) this.binding).rcvNames.setAdapter(this.adapter);
            this.adapter.setOnItemChildClickListener(new OnItemChildClickListener() { // from class: com.crrepa.band.my.device.muslim.c
                @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
                public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                    AllahNamesActivity.this.lambda$initRecyclerView$2(baseQuickAdapter, view, i8);
                }
            });
            i4.getInstance().queryMuslimSavedName();
        }
        this.adapter.setNewData(com.crrepa.band.my.device.muslim.utils.c.getAllahNameList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRecyclerView$2(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        AllahName allahName = (AllahName) baseQuickAdapter.getData().get(i8);
        allahName.setFavorite(!allahName.isFavorite());
        baseQuickAdapter.notifyItemChanged(i8);
        this.muslimManager.sendMuslimAllahNameList(allahName.isFavorite(), allahName.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$1(View view) {
        startActivity(new Intent(this, (Class<?>) FavoriteAllahNamesActivity.class));
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityAllahNamesBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityAllahNamesBinding) vb).topBar.tvTitle, ((ActivityAllahNamesBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityAllahNamesBinding) this.binding).topBar.toolbar);
        ((ActivityAllahNamesBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_allah_names_title);
        ((ActivityAllahNamesBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_allah_names_title);
        ((ActivityAllahNamesBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityAllahNamesBinding) this.binding).topBar.ivHistory.setImageResource(R$drawable.ic_duas_collect);
        ((ActivityAllahNamesBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllahNamesActivity.this.lambda$setSupportActionBar$0(view);
            }
        });
        ((ActivityAllahNamesBinding) this.binding).topBar.ivHistory.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AllahNamesActivity.this.lambda$setSupportActionBar$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.muslimManager = new com.crrepa.band.my.device.muslim.utils.b();
        setSupportActionBar();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandMuslinNameChangeEvent(BandMuslimNameChangeEvent bandMuslimNameChangeEvent) {
        List<Integer> indexList;
        if (bandMuslimNameChangeEvent.isCancel() && (indexList = bandMuslimNameChangeEvent.getIndexList()) != null && indexList.size() > 0) {
            List<AllahName> data = this.adapter.getData();
            Iterator<Integer> it = indexList.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue < data.size()) {
                    data.get(intValue).setFavorite(false);
                }
            }
            com.crrepa.band.my.device.muslim.utils.c.saveAllahNameList(data);
        }
        this.adapter.setNewData(com.crrepa.band.my.device.muslim.utils.c.getAllahNameList());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity, com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        if (!this.adapter.getData().isEmpty()) {
            com.crrepa.band.my.device.muslim.utils.c.saveAllahNameList(this.adapter.getData());
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        initRecyclerView();
    }
}
