package com.crrepa.band.my.device.muslim;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityAllahNamesBinding;
import com.crrepa.band.my.device.muslim.adapter.AllahNameAdapter;
import com.crrepa.band.my.device.muslim.model.AllahName;
import com.crrepa.band.my.device.muslim.model.BandMuslimNameChangeEvent;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class FavoriteAllahNamesActivity extends BaseVBActivity<ActivityAllahNamesBinding> {
    AllahNameAdapter adapter = new AllahNameAdapter();
    private List<AllahName> allahNameList = new ArrayList();

    private List<AllahName> getFavoriteAllahNameList() {
        this.allahNameList = com.crrepa.band.my.device.muslim.utils.c.getAllahNameList();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.allahNameList.size(); i8++) {
            AllahName allahName = this.allahNameList.get(i8);
            if (allahName.isFavorite()) {
                arrayList.add(allahName);
            }
        }
        return arrayList;
    }

    private void initRecyclerView() {
        ((ActivityAllahNamesBinding) this.binding).rcvNames.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityAllahNamesBinding) this.binding).rcvNames.setAdapter(this.adapter);
        this.adapter.setNewData(getFavoriteAllahNameList());
        this.adapter.setOnItemChildClickListener(new OnItemChildClickListener() { // from class: com.crrepa.band.my.device.muslim.g
            @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                FavoriteAllahNamesActivity.this.lambda$initRecyclerView$1(baseQuickAdapter, view, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRecyclerView$1(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        AllahName allahName = (AllahName) baseQuickAdapter.getData().get(i8);
        allahName.setFavorite(!allahName.isFavorite());
        boolean isFavorite = allahName.isFavorite();
        int index = allahName.getIndex();
        baseQuickAdapter.remove(i8);
        this.allahNameList.get(index - 1).setFavorite(isFavorite);
        com.crrepa.band.my.device.muslim.utils.b.getInstance().sendMuslimAllahNameList(isFavorite, index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityAllahNamesBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityAllahNamesBinding) vb).topBar.tvTitle, ((ActivityAllahNamesBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityAllahNamesBinding) this.binding).topBar.toolbar);
        ((ActivityAllahNamesBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_favorite_name_title);
        ((ActivityAllahNamesBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_favorite_name_title);
        ((ActivityAllahNamesBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityAllahNamesBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteAllahNamesActivity.this.lambda$setSupportActionBar$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setSupportActionBar();
        initRecyclerView();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandMuslinNameChangeEvent(BandMuslimNameChangeEvent bandMuslimNameChangeEvent) {
        if (!bandMuslimNameChangeEvent.isCancel()) {
            this.adapter.setNewData(getFavoriteAllahNameList());
            return;
        }
        List<Integer> indexList = bandMuslimNameChangeEvent.getIndexList();
        List<AllahName> data = this.adapter.getData();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = indexList.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            for (int i8 = 0; i8 < data.size(); i8++) {
                if (data.get(i8).getIndex() - 1 == intValue) {
                    arrayList.add(Integer.valueOf(i8));
                    this.allahNameList.get(intValue).setFavorite(false);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.adapter.remove(((Integer) it2.next()).intValue());
        }
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
        if (!this.allahNameList.isEmpty()) {
            com.crrepa.band.my.device.muslim.utils.c.saveAllahNameList(this.allahNameList);
        }
        super.onPause();
    }
}
