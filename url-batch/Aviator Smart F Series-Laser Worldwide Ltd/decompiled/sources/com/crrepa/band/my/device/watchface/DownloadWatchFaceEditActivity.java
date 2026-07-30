package com.crrepa.band.my.device.watchface;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityDownloadWatchFaceEditBinding;
import com.crrepa.band.my.device.watchface.adapter.DownloadWatchFaceAdapter;
import com.crrepa.band.my.health.widgets.dialog.j;
import com.crrepa.band.my.model.DownloadWatchFaceModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.widgets.decoration.RecycleItemDivider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DownloadWatchFaceEditActivity extends BaseVBActivity<ActivityDownloadWatchFaceEditBinding> implements x1.a {
    private com.crrepa.band.my.health.widgets.dialog.j loadingDialog;
    private final com.crrepa.band.my.device.watchface.presenter.b presenter = new com.crrepa.band.my.device.watchface.presenter.b();
    private DownloadWatchFaceAdapter watchFaceAdapter = new DownloadWatchFaceAdapter();

    class a implements OnItemClickListener {
        a() {
        }

        @Override // com.chad.library.adapter.base.listener.OnItemClickListener
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
            com.orhanobut.logger.f.d("onItemClick: " + i8);
            DownloadWatchFaceModel downloadWatchFaceModel = (DownloadWatchFaceModel) baseQuickAdapter.getItem(i8);
            if (downloadWatchFaceModel != null) {
                downloadWatchFaceModel.setChecked(!downloadWatchFaceModel.isChecked());
                baseQuickAdapter.notifyItemChanged(i8, Boolean.TRUE);
            }
            DownloadWatchFaceEditActivity.this.updateDoneState();
        }
    }

    class b implements j.c {
        b() {
        }

        @Override // com.crrepa.band.my.health.widgets.dialog.j.c
        public void onDone() {
            DownloadWatchFaceEditActivity.this.presenter.getDownloadWatchFace();
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) DownloadWatchFaceEditActivity.class);
    }

    private void initWatchFaceList() {
        ((ActivityDownloadWatchFaceEditBinding) this.binding).rcvDownloadWatchFace.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityDownloadWatchFaceEditBinding) this.binding).rcvDownloadWatchFace.addItemDecoration(new RecycleItemDivider(this, 1, com.moyoung.dafit.module.common.utils.o.dp2px(this, 0.5f), ContextCompat.getColor(this, R.color.color_line_bg)));
        ((ActivityDownloadWatchFaceEditBinding) this.binding).rcvDownloadWatchFace.setAdapter(this.watchFaceAdapter);
        this.watchFaceAdapter.setOnItemClickListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onDoneClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onAddWatchfaceClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onCancelClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDoneState() {
        int i8;
        Iterator<DownloadWatchFaceModel> it = this.watchFaceAdapter.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                ((ActivityDownloadWatchFaceEditBinding) this.binding).tvDone.setText(R.string.done);
                i8 = R.color.black;
                break;
            } else if (it.next().isChecked()) {
                ((ActivityDownloadWatchFaceEditBinding) this.binding).tvDone.setText(R.string.remove);
                i8 = R.color.color_delete_text;
                break;
            }
        }
        ((ActivityDownloadWatchFaceEditBinding) this.binding).tvDone.setTextColor(ContextCompat.getColor(this, i8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        initWatchFaceList();
        this.presenter.getDownloadWatchFace();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityDownloadWatchFaceEditBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadWatchFaceEditActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityDownloadWatchFaceEditBinding) this.binding).btnAddWatchFace.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadWatchFaceEditActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityDownloadWatchFaceEditBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.watchface.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DownloadWatchFaceEditActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    public void onAddWatchfaceClick() {
        startActivity(StoreWatchFaceMainActivity.getCallingIntent(this));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        setResult(-1);
        super.onBackPressedSupport();
    }

    public void onCancelClick() {
        setResult(-1);
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    public void onDoneClick() {
        List<DownloadWatchFaceModel> data = this.watchFaceAdapter.getData();
        ArrayList arrayList = new ArrayList();
        for (DownloadWatchFaceModel downloadWatchFaceModel : data) {
            if (downloadWatchFaceModel.isChecked()) {
                arrayList.add(Integer.valueOf(downloadWatchFaceModel.getWatchFace().getWatchFaceId().intValue()));
            }
        }
        if (!arrayList.isEmpty()) {
            this.presenter.deleteWatchFace(arrayList);
        } else {
            setResult(-1);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        com.moyoung.dafit.module.common.utils.s0.logPage(getClass(), "设备首页编辑表盘");
    }

    @Override // x1.a
    public void renderDeleteWatchFaceComplete() {
        com.crrepa.band.my.health.widgets.dialog.j jVar = this.loadingDialog;
        if (jVar != null) {
            jVar.complete();
        }
    }

    @Override // x1.a
    public void renderDeleteWatchFaceError() {
        com.crrepa.band.my.health.widgets.dialog.j jVar = this.loadingDialog;
        if (jVar != null) {
            jVar.error();
        }
    }

    @Override // x1.a
    public void renderDeleteWatchFaceStart() {
        com.orhanobut.logger.f.d("renderDeleteWatchFaceStart");
        com.crrepa.band.my.health.widgets.dialog.j jVar = new com.crrepa.band.my.health.widgets.dialog.j(this);
        this.loadingDialog = jVar;
        jVar.setOnDoneListener(new b());
        this.loadingDialog.show();
        this.loadingDialog.loading();
    }

    @Override // x1.a
    public void renderWatchFaceList(List<DownloadWatchFaceModel> list) {
        if (list.isEmpty()) {
            ((ActivityDownloadWatchFaceEditBinding) this.binding).rlWatchFaceEmpty.setVisibility(0);
            ((ActivityDownloadWatchFaceEditBinding) this.binding).rcvDownloadWatchFace.setVisibility(8);
        } else {
            ((ActivityDownloadWatchFaceEditBinding) this.binding).rcvDownloadWatchFace.setVisibility(0);
            ((ActivityDownloadWatchFaceEditBinding) this.binding).rlWatchFaceEmpty.setVisibility(8);
        }
        this.watchFaceAdapter.setNewData(list);
        updateDoneState();
    }
}
