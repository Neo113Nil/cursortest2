package com.crrepa.band.my.device.ai.picture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityAiPictureHistoryBinding;
import com.crrepa.band.my.device.ai.picture.adapter.AIPictureHistoryAdapter;
import com.crrepa.band.my.device.ai.picture.model.AIPictureHistoryEvent;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class AIPictureHistoryActivity extends BaseVBActivity<ActivityAiPictureHistoryBinding> {
    private AIPictureHistoryAdapter historyAdapter;
    private final com.yanzhenjie.recyclerview.k swipeMenuCreator = new com.yanzhenjie.recyclerview.k() { // from class: com.crrepa.band.my.device.ai.picture.p
        @Override // com.yanzhenjie.recyclerview.k
        public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
            AIPictureHistoryActivity.this.lambda$new$2(iVar, iVar2, i8);
        }
    };
    private final com.yanzhenjie.recyclerview.g menuItemClickListener = new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.device.ai.picture.q
        @Override // com.yanzhenjie.recyclerview.g
        public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
            AIPictureHistoryActivity.this.lambda$new$3(jVar, i8);
        }
    };

    @SuppressLint({"NotifyDataSetChanged"})
    private void initAiPictureHistoryAdapter() {
        ((ActivityAiPictureHistoryBinding) this.binding).rvPicture.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityAiPictureHistoryBinding) this.binding).rvPicture.setSwipeMenuCreator(this.swipeMenuCreator);
        ((ActivityAiPictureHistoryBinding) this.binding).rvPicture.setOnItemMenuClickListener(this.menuItemClickListener);
        AIPictureHistoryAdapter aIPictureHistoryAdapter = new AIPictureHistoryAdapter();
        this.historyAdapter = aIPictureHistoryAdapter;
        ((ActivityAiPictureHistoryBinding) this.binding).rvPicture.setAdapter(aIPictureHistoryAdapter);
        this.historyAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.ai.picture.n
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                AIPictureHistoryActivity.this.lambda$initAiPictureHistoryAdapter$1(baseQuickAdapter, view, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAiPictureHistoryAdapter$1(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        AIPictureResultActivity.start(this, this.historyAdapter.getItem(i8), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        iVar2.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.assist_15)).setText(R.string.remove).setTextColor(getResources().getColor(R.color.white)).setWidth(getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        AIPictureModel.deleteOnePictureHistory(i8);
        loadAIPictureHistory();
        org.greenrobot.eventbus.c.getDefault().post(new AIPictureHistoryEvent());
    }

    private void loadAIPictureHistory() {
        this.historyAdapter.setNewData(AIPictureModel.getPictureHistoryList());
    }

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, AIPictureHistoryActivity.class);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.translucent));
        initAiPictureHistoryAdapter();
        ((ActivityAiPictureHistoryBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.picture.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIPictureHistoryActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        loadAIPictureHistory();
    }
}
