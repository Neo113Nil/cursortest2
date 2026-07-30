package com.crrepa.band.my.device.stock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.databinding.ActivityStockSettingBinding;
import com.crrepa.band.my.device.stock.adapter.StockSettingAdapter;
import com.crrepa.band.my.device.stock.model.SaveStockEvent;
import com.crrepa.band.my.device.stock.model.StockDetailBean;
import com.crrepa.band.my.device.stock.model.StockModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class StockSettingActivity extends BaseVBActivity<ActivityStockSettingBinding> {
    private StockModel stockModel;
    private StockSettingAdapter stockSettingAdapter;

    class a implements t5.a {
        a() {
        }

        @Override // t5.a
        public void onItemDismiss(RecyclerView.ViewHolder viewHolder) {
        }

        @Override // t5.a
        public boolean onItemMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return StockSettingActivity.this.dealOnItemMove(viewHolder, viewHolder2);
        }
    }

    private void createMenu(com.yanzhenjie.recyclerview.i iVar) {
        iVar.addMenuItem(new com.yanzhenjie.recyclerview.l(this).setBackgroundColor(ContextCompat.getColor(this, R.color.color_delete_text)).setText(R.string.delete).setTextColorResource(R.color.white).setTextSize(16).setWidth(getResources().getDimensionPixelSize(R.dimen.dp_100)).setHeight(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public void dealOnItemMenuClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
        jVar.closeMenu();
        List<StockDetailBean> data = this.stockSettingAdapter.getData();
        StockModel.deleteSortAndSymbol(data.get(i8).getSymbol());
        data.remove(i8);
        this.stockSettingAdapter.setNewData(data);
        this.stockSettingAdapter.notifyDataSetChanged();
        if (data.size() >= c.getSupportStockCount()) {
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(8);
        } else {
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(0);
        }
        if (data.size() == 0) {
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(8);
            showNoData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dealOnItemMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder.getItemViewType() != viewHolder2.getItemViewType()) {
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition() - ((ActivityStockSettingBinding) this.binding).rvStock.getHeaderCount();
        int adapterPosition2 = viewHolder2.getAdapterPosition() - ((ActivityStockSettingBinding) this.binding).rvStock.getHeaderCount();
        Collections.swap(this.stockSettingAdapter.getData(), adapterPosition, adapterPosition2);
        this.stockSettingAdapter.notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) StockSettingActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
        createMenu(iVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view, int i8) {
        ((Vibrator) getSystemService("vibrator")).vibrate(30L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$2(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        resetSavedStockSort();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        startActivity(new Intent(this, (Class<?>) StockSearchActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        startActivity(new Intent(this, (Class<?>) StockSearchActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockDetail$6(String str, List list) {
        if (list == null) {
            showNoData();
        } else {
            requestStockSpark(list, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockDetail$7(Throwable th) {
        showNetError(th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockSpark$8(List list, List list2) {
        if (list2 == null) {
            showNoData();
        } else {
            getPageLoadingUI().hide();
            showStockData(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestStockSpark$9(Throwable th) {
        showNetError(th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$5(View view) {
        onBackPressed();
    }

    @SuppressLint({"CheckResult"})
    private void requestStockDetail(final String str) {
        getPageLoadingUI().show();
        this.stockModel.requestStockDetail(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.stock.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StockSettingActivity.this.lambda$requestStockDetail$6(str, (List) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.stock.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StockSettingActivity.this.lambda$requestStockDetail$7((Throwable) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    private void requestStockSpark(final List<StockDetailBean> list, String str) {
        this.stockModel.requestStockSpark(list, str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.stock.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StockSettingActivity.this.lambda$requestStockSpark$8(list, (List) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.stock.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StockSettingActivity.this.lambda$requestStockSpark$9((Throwable) obj);
            }
        });
    }

    private void resetSavedStockSort() {
        ArrayList arrayList = new ArrayList();
        Iterator<StockDetailBean> it = this.stockSettingAdapter.getData().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSymbol());
        }
        StockModel.resetStockSort(arrayList);
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityStockSettingBinding) this.binding).titleBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityStockSettingBinding) vb).titleBar.tvTitle, ((ActivityStockSettingBinding) vb).titleBar.tvExpandedTitle);
        setSupportActionBar(((ActivityStockSettingBinding) this.binding).titleBar.toolbar);
    }

    private void setTitle() {
        ((ActivityStockSettingBinding) this.binding).titleBar.tvTitle.setText(R.string.stock_title);
        ((ActivityStockSettingBinding) this.binding).titleBar.tvExpandedTitle.setText(R.string.stock_title);
        ((ActivityStockSettingBinding) this.binding).titleBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityStockSettingBinding) this.binding).titleBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.stock.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockSettingActivity.this.lambda$setTitle$5(view);
            }
        });
    }

    private void showNetError(String str) {
        Log.d("showNetError", str);
        getPageLoadingUI().hide();
        r0.showShort(this, getString(R.string.net_disonnected));
    }

    private void showNoData() {
        getPageLoadingUI().hide();
        i4.getInstance().clearStock();
        ((ActivityStockSettingBinding) this.binding).rlEmpty.setVisibility(0);
        ((ActivityStockSettingBinding) this.binding).rvStock.setVisibility(8);
    }

    private void showStockData(List<StockDetailBean> list) {
        if (list.size() == 0) {
            ((ActivityStockSettingBinding) this.binding).rlEmpty.setVisibility(0);
            ((ActivityStockSettingBinding) this.binding).rvStock.setVisibility(8);
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(8);
        } else {
            ((ActivityStockSettingBinding) this.binding).rlEmpty.setVisibility(8);
            ((ActivityStockSettingBinding) this.binding).rvStock.setVisibility(0);
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(0);
            this.stockSettingAdapter.setNewData(list);
        }
        if (list.size() >= c.getSupportStockCount()) {
            ((ActivityStockSettingBinding) this.binding).ivAdd.setVisibility(8);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    @SuppressLint({"ClickableViewAccessibility"})
    protected void initBinding() {
        super.initBinding();
        k0.setColorNoTranslucent(this, 0);
        setActionBar();
        setTitle();
        this.stockModel = new StockModel();
        this.stockSettingAdapter = new StockSettingAdapter();
        ((ActivityStockSettingBinding) this.binding).rvStock.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityStockSettingBinding) this.binding).rvStock.setSwipeMenuCreator(new com.yanzhenjie.recyclerview.k() { // from class: com.crrepa.band.my.device.stock.k
            @Override // com.yanzhenjie.recyclerview.k
            public final void onCreateMenu(com.yanzhenjie.recyclerview.i iVar, com.yanzhenjie.recyclerview.i iVar2, int i8) {
                StockSettingActivity.this.lambda$initBinding$0(iVar, iVar2, i8);
            }
        });
        ((ActivityStockSettingBinding) this.binding).rvStock.setLongPressDragEnabled(true);
        ((ActivityStockSettingBinding) this.binding).rvStock.setOnItemLongClickListener(new com.yanzhenjie.recyclerview.f() { // from class: com.crrepa.band.my.device.stock.m
            @Override // com.yanzhenjie.recyclerview.f
            public final void onItemLongClick(View view, int i8) {
                StockSettingActivity.this.lambda$initBinding$1(view, i8);
            }
        });
        ((ActivityStockSettingBinding) this.binding).rvStock.setOnItemMoveListener(new a());
        ((ActivityStockSettingBinding) this.binding).rvStock.setOnTouchListener(new View.OnTouchListener() { // from class: com.crrepa.band.my.device.stock.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$initBinding$2;
                lambda$initBinding$2 = StockSettingActivity.this.lambda$initBinding$2(view, motionEvent);
                return lambda$initBinding$2;
            }
        });
        ((ActivityStockSettingBinding) this.binding).rvStock.setOnItemMenuClickListener(new com.yanzhenjie.recyclerview.g() { // from class: com.crrepa.band.my.device.stock.o
            @Override // com.yanzhenjie.recyclerview.g
            public final void onItemClick(com.yanzhenjie.recyclerview.j jVar, int i8) {
                StockSettingActivity.this.dealOnItemMenuClick(jVar, i8);
            }
        });
        ((ActivityStockSettingBinding) this.binding).rvStock.setAdapter(this.stockSettingAdapter);
        ((ActivityStockSettingBinding) this.binding).tvAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.stock.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockSettingActivity.this.lambda$initBinding$3(view);
            }
        });
        ((ActivityStockSettingBinding) this.binding).ivAdd.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.stock.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockSettingActivity.this.lambda$initBinding$4(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        ((ActivityStockSettingBinding) this.binding).tvDescription.setText(getString(R.string.stock_subtitle, String.valueOf(c.getSupportStockCount())));
        String savedSymbols = StockModel.getSavedSymbols();
        if (TextUtils.isEmpty(savedSymbols)) {
            showNoData();
        } else {
            requestStockDetail(savedSymbols);
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

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onSaveStockEvent(SaveStockEvent saveStockEvent) {
        loadData();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        ((ActivityStockSettingBinding) this.binding).rvStock.smoothCloseMenu();
    }
}
