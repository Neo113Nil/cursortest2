package com.crrepa.band.my.device.watchface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchface.adapter.StoreWatchFaceListAdapter;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.model.band.provider.BandDisplayLanguageProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.watchface.BaseWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class StoreWatchFaceListActivity extends BaseActivity {
    private BaseLoadMoreModule loadMoreModule;
    private int tagId;
    private StoreWatchFaceListAdapter watchFaceListAdapter = new StoreWatchFaceListAdapter();
    private final BaseWatchFaceProvider netWatchFaceProvider = new DefaultWatchFaceProvider();
    private int pageIndex = 1;

    public static Intent getCallingIntent(Context context, int i8, String str) {
        Intent intent = new Intent(context, (Class<?>) StoreWatchFaceListActivity.class);
        intent.putExtra("tagId", i8);
        intent.putExtra("tagName", str);
        return intent;
    }

    @SuppressLint({"CheckResult"})
    private void getWatchFaceList() {
        if (!com.moyoung.dafit.module.common.utils.a0.isNetworkConnected(getApplicationContext())) {
            showNetError();
            return;
        }
        String watchFaceTpls = com.crrepa.band.my.device.watchface.presenter.g.getWatchFaceTpls();
        String firmwareVersion = BandInfoManager.getFirmwareVersion();
        if (TextUtils.isEmpty(watchFaceTpls) || TextUtils.isEmpty(firmwareVersion)) {
            showNetError();
        } else {
            this.netWatchFaceProvider.getStoreWatchFaceListV3(watchFaceTpls, this.tagId, "yes", firmwareVersion, this.pageIndex, "", new LanguageDaoProxy().getLanguageCode(BandDisplayLanguageProvider.getDisplayLanguage())).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.watchface.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    StoreWatchFaceListActivity.this.lambda$getWatchFaceList$3((List) obj);
                }
            }, new Consumer() { // from class: com.crrepa.band.my.device.watchface.d0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    StoreWatchFaceListActivity.this.lambda$getWatchFaceList$4((Throwable) obj);
                }
            });
        }
    }

    private void initView() {
        findViewById(R.id.iv_title_back).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceListActivity.this.lambda$initView$0(view);
            }
        });
        ((TextView) findViewById(R.id.tv_title)).setText(getIntent().getStringExtra("tagName"));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_watch_face);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        BaseLoadMoreModule loadMoreModule = this.watchFaceListAdapter.getLoadMoreModule();
        this.loadMoreModule = loadMoreModule;
        loadMoreModule.setLoadMoreView(new com.crrepa.band.my.health.widgets.g());
        this.loadMoreModule.setOnLoadMoreListener(new OnLoadMoreListener() { // from class: com.crrepa.band.my.device.watchface.f0
            @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
            public final void onLoadMore() {
                StoreWatchFaceListActivity.this.lambda$initView$1();
            }
        });
        this.watchFaceListAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.watchface.g0
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                StoreWatchFaceListActivity.this.lambda$initView$2(baseQuickAdapter, view, i8);
            }
        });
        recyclerView.setAdapter(this.watchFaceListAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getWatchFaceList$4(Throwable th) {
        th.printStackTrace();
        showNetError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$1() {
        com.orhanobut.logger.f.d("onLoadMoreRequested");
        this.pageIndex++;
        getWatchFaceList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        startActivity(StoreWatchFaceDetailActivity.getCallingIntent(this, ((StoreWatchFaceBean) baseQuickAdapter.getData().get(i8)).getId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showNetError$5(View view) {
        this.pageIndex = 1;
        getWatchFaceList();
    }

    private void showNetError() {
        View inflate = getLayoutInflater().inflate(R.layout.watch_face_net_error, (ViewGroup) findViewById(R.id.rcv_watch_face), false);
        this.watchFaceListAdapter.setEmptyView(inflate);
        this.loadMoreModule.loadMoreComplete();
        inflate.findViewById(R.id.btn_refresh).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StoreWatchFaceListActivity.this.lambda$showNetError$5(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWatchFaceList, reason: merged with bridge method [inline-methods] */
    public void lambda$getWatchFaceList$3(List<StoreWatchFaceBean> list) {
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
            this.watchFaceListAdapter.setNewData(list);
        } else {
            this.watchFaceListAdapter.addData((Collection) list);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store_watch_face_list);
        this.tagId = getIntent().getIntExtra("tagId", -1);
        initView();
        this.pageIndex = 1;
        getWatchFaceList();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "分类下所有表盘");
    }
}
