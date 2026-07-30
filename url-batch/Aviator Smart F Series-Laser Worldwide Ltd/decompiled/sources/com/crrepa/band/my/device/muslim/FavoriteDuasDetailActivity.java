package com.crrepa.band.my.device.muslim;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityDuasDetailBinding;
import com.crrepa.band.my.device.muslim.adapter.DuasDetailAdapter;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class FavoriteDuasDetailActivity extends BaseVBActivity<ActivityDuasDetailBinding> {
    DuasDetailAdapter adapter = new DuasDetailAdapter();

    private void initRecyclerView() {
        ((ActivityDuasDetailBinding) this.binding).rcvDua.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityDuasDetailBinding) this.binding).rcvDua.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityDuasDetailBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityDuasDetailBinding) vb).topBar.tvTitle, ((ActivityDuasDetailBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityDuasDetailBinding) this.binding).topBar.toolbar);
        ((ActivityDuasDetailBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_duas_title);
        ((ActivityDuasDetailBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_duas_title);
        ((ActivityDuasDetailBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityDuasDetailBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteDuasDetailActivity.this.lambda$setSupportActionBar$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        setSupportActionBar();
        initRecyclerView();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }
}
