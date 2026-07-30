package com.crrepa.band.my.device.muslim;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityDuasDirectoryBinding;
import com.crrepa.band.my.device.muslim.adapter.DuasDirectoryAdapter;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class FavoriteDuasDirectoryActivity extends BaseVBActivity<ActivityDuasDirectoryBinding> {
    DuasDirectoryAdapter adapter = new DuasDirectoryAdapter(this);

    class a implements GroupedRecyclerViewAdapter.h {
        a() {
        }

        @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter.h
        public void onHeaderClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i8) {
            DuasDirectoryAdapter duasDirectoryAdapter = (DuasDirectoryAdapter) groupedRecyclerViewAdapter;
            if (duasDirectoryAdapter.isExpand(i8)) {
                duasDirectoryAdapter.collapseGroup(i8, true);
            } else {
                duasDirectoryAdapter.expandGroup(i8, true);
            }
        }
    }

    class b implements GroupedRecyclerViewAdapter.d {
        b() {
        }

        @Override // com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter.d
        public void onChildClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, BaseViewHolder baseViewHolder, int i8, int i9) {
            FavoriteDuasDirectoryActivity.this.startActivity(new Intent());
        }
    }

    private void initRecyclerView() {
        ((ActivityDuasDirectoryBinding) this.binding).rcvDua.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityDuasDirectoryBinding) this.binding).rcvDua.setAdapter(this.adapter);
        this.adapter.setOnHeaderClickListener(new a());
        this.adapter.setOnChildClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$0(View view) {
        onBackPressed();
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityDuasDirectoryBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityDuasDirectoryBinding) vb).topBar.tvTitle, ((ActivityDuasDirectoryBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityDuasDirectoryBinding) this.binding).topBar.toolbar);
        ((ActivityDuasDirectoryBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_duas_title);
        ((ActivityDuasDirectoryBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_duas_title);
        ((ActivityDuasDirectoryBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityDuasDirectoryBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteDuasDirectoryActivity.this.lambda$setSupportActionBar$0(view);
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
