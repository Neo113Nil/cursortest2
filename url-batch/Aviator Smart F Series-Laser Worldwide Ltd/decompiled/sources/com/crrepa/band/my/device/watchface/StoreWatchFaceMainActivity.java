package com.crrepa.band.my.device.watchface;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityStoreWatchFaceMainBinding;
import com.crrepa.band.my.device.watchface.adapter.StoreWatchFaceTagAdapter;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceMainActivity extends BaseVBActivity<ActivityStoreWatchFaceMainBinding> implements x1.d {
    private BaseLoadMoreModule loadMoreModule;
    private final com.crrepa.band.my.device.watchface.presenter.g presenter = new com.crrepa.band.my.device.watchface.presenter.g();
    private final StoreWatchFaceTagAdapter watchFaceTagAdapter = new StoreWatchFaceTagAdapter();
    private int pageIndex = 1;

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) StoreWatchFaceMainActivity.class);
    }

    private void getWatchFaceTagList() {
        this.presenter.getWatchFaceTagList(this, this.pageIndex);
    }

    private void initWatchFaceList() {
        ((ActivityStoreWatchFaceMainBinding) this.binding).rcvWatchFace.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityStoreWatchFaceMainBinding) this.binding).rcvWatchFace.setHasFixedSize(true);
        ((ActivityStoreWatchFaceMainBinding) this.binding).rcvWatchFace.setAdapter(this.watchFaceTagAdapter);
        BaseLoadMoreModule loadMoreModule = this.watchFaceTagAdapter.getLoadMoreModule();
        this.loadMoreModule = loadMoreModule;
        loadMoreModule.setLoadMoreView(new com.crrepa.band.my.health.widgets.g());
        this.loadMoreModule.setOnLoadMoreListener(new OnLoadMoreListener() { // from class: com.crrepa.band.my.device.watchface.j0
            @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
            public final void onLoadMore() {
                StoreWatchFaceMainActivity.this.lambda$initWatchFaceList$1();
            }
        });
        this.watchFaceTagAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.watchface.k0
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                StoreWatchFaceMainActivity.this.lambda$initWatchFaceList$2(baseQuickAdapter, view, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWatchFaceList$1() {
        this.pageIndex++;
        getWatchFaceTagList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initWatchFaceList$2(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        StoreWatchFaceTagBean storeWatchFaceTagBean = (StoreWatchFaceTagBean) baseQuickAdapter.getData().get(i8);
        startActivity(StoreWatchFaceListActivity.getCallingIntent(this, storeWatchFaceTagBean.getId(), storeWatchFaceTagBean.getTag_name()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderNetError$3(View view) {
        this.pageIndex = 1;
        getWatchFaceTagList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$0(View view) {
        finish();
    }

    private void setActionBar() {
        VB vb = this.binding;
        Toolbar toolbar = ((ActivityStoreWatchFaceMainBinding) vb).layoutTitle.toolbar;
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityStoreWatchFaceMainBinding) vb).layoutTitle.appbar);
        VB vb2 = this.binding;
        bVar.addTitleScrollEvent(((ActivityStoreWatchFaceMainBinding) vb2).layoutTitle.tvTitle, ((ActivityStoreWatchFaceMainBinding) vb2).layoutTitle.tvExpandedTitle);
        setSupportActionBar(toolbar);
    }

    private void setTitle() {
        ((ActivityStoreWatchFaceMainBinding) this.binding).layoutTitle.tvTitle.setText(R.string.face_gallery);
        ((ActivityStoreWatchFaceMainBinding) this.binding).layoutTitle.tvExpandedTitle.setText(R.string.face_gallery);
        ((ActivityStoreWatchFaceMainBinding) this.binding).layoutTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceMainActivity.this.lambda$setTitle$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setColorNoTranslucent(this, 0);
        this.presenter.setView(this);
        setActionBar();
        setTitle();
        initWatchFaceList();
        getPageLoadingUI().show();
        this.pageIndex = 1;
        getWatchFaceTagList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "表盘市场");
    }

    @Override // x1.d
    public void renderBandDisconnect(int i8) {
        com.moyoung.dafit.module.common.utils.r0.showLong(this, getString(R.string.band_setting_send_fail) + "#code:" + i8);
    }

    @Override // x1.d
    public void renderInsufficientStorage() {
        if (this.watchFaceTagAdapter.getData().isEmpty()) {
            this.watchFaceTagAdapter.setEmptyView(getLayoutInflater().inflate(R.layout.view_watch_face_insufficient_storage, (ViewGroup) ((ActivityStoreWatchFaceMainBinding) this.binding).rcvWatchFace, false));
        }
    }

    @Override // x1.d
    public void renderNetError() {
        View inflate = getLayoutInflater().inflate(R.layout.watch_face_net_error, (ViewGroup) ((ActivityStoreWatchFaceMainBinding) this.binding).rcvWatchFace, false);
        this.watchFaceTagAdapter.setEmptyView(inflate);
        inflate.findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceMainActivity.this.lambda$renderNetError$3(view);
            }
        });
    }

    @Override // x1.d
    public void renderWatchFaceLoadComplete() {
        this.loadMoreModule.loadMoreComplete();
        getPageLoadingUI().hide();
    }

    @Override // x1.d
    public void renderWatchFaceLoadEnd() {
        this.loadMoreModule.loadMoreEnd();
        getPageLoadingUI().hide();
    }

    @Override // x1.d
    public void renderWatchFaceTagList(List<StoreWatchFaceTagBean> list) {
        if (list == null) {
            this.loadMoreModule.loadMoreEnd();
            return;
        }
        if (list.size() < 20) {
            this.loadMoreModule.loadMoreEnd();
        } else {
            this.loadMoreModule.loadMoreComplete();
        }
        if (this.pageIndex == 1) {
            this.watchFaceTagAdapter.setNewData(list);
        } else {
            this.watchFaceTagAdapter.addData((Collection<? extends StoreWatchFaceTagBean>) list);
        }
    }
}
