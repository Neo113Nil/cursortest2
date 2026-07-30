package com.crrepa.band.my.device.stock;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.CustomConfirmDialog;
import com.crrepa.band.my.databinding.ActivityStockSearchBinding;
import com.crrepa.band.my.device.stock.adapter.StockSearchAdapter;
import com.crrepa.band.my.device.stock.model.SaveStockEvent;
import com.crrepa.band.my.device.stock.model.StockModel;
import com.crrepa.band.my.device.stock.model.StockSearchBean;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class StockSearchActivity extends BaseVBActivity<ActivityStockSearchBinding> {
    private boolean isAndBtnClicked = false;
    private StockModel stockModel;
    private StockSearchAdapter stockSearchAdapter;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((ActivityStockSearchBinding) ((BaseVBActivity) StockSearchActivity.this).binding).tvClear.setVisibility(editable.length() == 0 ? 8 : 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        TextView textView = (TextView) view.findViewById(R.id.tv_is_added);
        if (this.isAndBtnClicked || textView.getVisibility() == 0) {
            return;
        }
        this.isAndBtnClicked = true;
        StockSearchBean stockSearchBean = (StockSearchBean) baseQuickAdapter.getData().get(i8);
        String symbol = stockSearchBean.getSymbol();
        showAddedDialog(symbol);
        this.stockModel.saveSortAndSymbol(stockSearchBean.getSymbol());
        org.greenrobot.eventbus.c.getDefault().post(new SaveStockEvent(symbol));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        ((ActivityStockSearchBinding) this.binding).etInput.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$3(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return false;
        }
        b.hide(((ActivityStockSearchBinding) this.binding).etInput);
        searchStock();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchStock$4(List list) {
        if (list == null || list.isEmpty()) {
            showNoData();
            return;
        }
        getPageLoadingUI().hide();
        getNoDataUI().hide();
        this.stockSearchAdapter.setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$searchStock$5(Throwable th) {
        showNetError(th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddedDialog$6(DialogInterface dialogInterface) {
        finish();
    }

    @SuppressLint({"CheckResult"})
    private void searchStock() {
        String obj = ((ActivityStockSearchBinding) this.binding).etInput.getText().toString();
        getPageLoadingUI().show();
        getNoDataUI().hide();
        this.stockModel.searchStock(obj).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.stock.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                StockSearchActivity.this.lambda$searchStock$4((List) obj2);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.stock.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj2) {
                StockSearchActivity.this.lambda$searchStock$5((Throwable) obj2);
            }
        });
    }

    private void showAddedDialog(String str) {
        CustomConfirmDialog customConfirmDialog = new CustomConfirmDialog(this);
        customConfirmDialog.setTitleTxt(R.string.stock_add_success_title);
        customConfirmDialog.setContentTxt(getString(R.string.stock_add_success_content, str));
        customConfirmDialog.hideCancelTv();
        customConfirmDialog.setCanceledOnTouchOutside(false);
        customConfirmDialog.show();
        customConfirmDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.crrepa.band.my.device.stock.d
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                StockSearchActivity.this.lambda$showAddedDialog$6(dialogInterface);
            }
        });
    }

    private void showNetError(String str) {
        getPageLoadingUI().hide();
        Log.d("showNetError", str);
        r0.showShort(this, getString(R.string.net_disonnected));
    }

    private void showNoData() {
        getPageLoadingUI().hide();
        getNoDataUI().show(getString(R.string.world_clock_search_no_results));
        this.stockSearchAdapter.setNewData(null);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.stockModel = new StockModel();
        this.stockSearchAdapter = new StockSearchAdapter(StockModel.getSavedSymbols());
        ((ActivityStockSearchBinding) this.binding).rvStock.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityStockSearchBinding) this.binding).rvStock.setAdapter(this.stockSearchAdapter);
        this.stockSearchAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.stock.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                StockSearchActivity.this.lambda$initBinding$0(baseQuickAdapter, view, i8);
            }
        });
        ((ActivityStockSearchBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.stock.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockSearchActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivityStockSearchBinding) this.binding).tvClear.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.stock.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockSearchActivity.this.lambda$initBinding$2(view);
            }
        });
        ((ActivityStockSearchBinding) this.binding).etInput.requestFocus();
        ((ActivityStockSearchBinding) this.binding).etInput.addTextChangedListener(new a());
        ((ActivityStockSearchBinding) this.binding).etInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.crrepa.band.my.device.stock.j
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean lambda$initBinding$3;
                lambda$initBinding$3 = StockSearchActivity.this.lambda$initBinding$3(textView, i8, keyEvent);
                return lambda$initBinding$3;
            }
        });
    }
}
