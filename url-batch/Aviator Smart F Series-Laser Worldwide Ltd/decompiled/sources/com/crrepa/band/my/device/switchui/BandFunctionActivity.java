package com.crrepa.band.my.device.switchui;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityBandFunctionBinding;
import com.crrepa.band.my.device.switchui.adapter.BandFunctionAdapter;
import com.crrepa.band.my.model.BandFunctionModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.orhanobut.logger.f;
import java.util.List;

/* loaded from: classes2.dex */
public class BandFunctionActivity extends BaseVBActivity<ActivityBandFunctionBinding> implements v1.a, OnItemChildClickListener {
    private BandFunctionAdapter bandFunctionAdapter;
    private com.crrepa.band.my.device.switchui.presenter.a bandFunctionPresenter;
    private ItemTouchHelper itemTouchHelper;

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) BandFunctionActivity.class);
    }

    private View getHeaderView(String str) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.header_band_function, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.tv_function_name)).setText(str);
        return inflate;
    }

    private void initFunctionList() {
        ((ActivityBandFunctionBinding) this.binding).rcvBandFunction.setLayoutManager(new LinearLayoutManager(this));
        this.bandFunctionAdapter.getDraggableModule().setDragEnabled(true);
        this.bandFunctionAdapter.setOnItemChildClickListener(this);
        ((ActivityBandFunctionBinding) this.binding).rcvBandFunction.setAdapter(this.bandFunctionAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityBandFunctionBinding) this.binding).includeTitle.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityBandFunctionBinding) vb).includeTitle.tvTitle, ((ActivityBandFunctionBinding) vb).includeTitle.tvExpandedTitle);
        setSupportActionBar(((ActivityBandFunctionBinding) this.binding).includeTitle.toolbar);
    }

    private void setTitle() {
        ((ActivityBandFunctionBinding) this.binding).includeTitle.tvTitle.setText(R.string.function_switch);
        ((ActivityBandFunctionBinding) this.binding).includeTitle.tvExpandedTitle.setText(R.string.function_switch);
        ((ActivityBandFunctionBinding) this.binding).includeTitle.ivTitleBack.setImageResource(R.drawable.selector_title_back);
    }

    @Override // v1.a
    public void addFunctionHeaaerView(String str, int i8) {
        this.bandFunctionAdapter.addHeaderView(getHeaderView(str), i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.crrepa.band.my.device.switchui.presenter.a aVar = new com.crrepa.band.my.device.switchui.presenter.a(this);
        this.bandFunctionPresenter = aVar;
        aVar.setView(this);
        setActionBar();
        setTitle();
        initFunctionList();
        this.bandFunctionPresenter.addFunctionHeaderView();
        this.bandFunctionPresenter.getBandFunctionList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityBandFunctionBinding) this.binding).includeTitle.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.switchui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandFunctionActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.bandFunctionPresenter.saveBandDisplayFunctionList(this, this.bandFunctionAdapter.getData());
        this.bandFunctionPresenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        f.d(Integer.valueOf(i8));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.bandFunctionPresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.bandFunctionPresenter.resume();
        s0.logPage(getClass(), "功能开关");
    }

    @Override // v1.a
    public void renderFunctionList(List<BandFunctionModel> list) {
        this.bandFunctionAdapter.setNewData(list);
    }

    @Override // v1.a
    public void saveFailed(String str) {
        r0.showLong(this, str);
    }
}
