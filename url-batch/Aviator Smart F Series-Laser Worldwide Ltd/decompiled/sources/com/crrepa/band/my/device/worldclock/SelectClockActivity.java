package com.crrepa.band.my.device.worldclock;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.my.databinding.ActivitySelectClockBinding;
import com.crrepa.band.my.device.worldclock.adapter.SearchClockAdapter;
import com.crrepa.band.my.model.WorldClockModel;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.List;
import me.yokeyword.indexablerv.d;

/* loaded from: classes2.dex */
public class SelectClockActivity extends BaseVBActivity<ActivitySelectClockBinding> implements f2.a {
    public static final String SELECT_CLOCK_LIST = "select_clock_list";
    private final d2.c presenter = new d2.c();
    private SearchClockAdapter searchClockAdapter;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((ActivitySelectClockBinding) ((BaseVBActivity) SelectClockActivity.this).binding).tvClear.setVisibility(editable.length() == 0 ? 8 : 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SelectClockActivity.this.searchClock();
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) SelectClockActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        ((ActivitySelectClockBinding) this.binding).etInput.setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$initBinding$2(TextView textView, int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            return false;
        }
        com.crrepa.band.my.device.stock.b.hide(((ActivitySelectClockBinding) this.binding).etInput);
        searchClock();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderClockList$4(View view, int i8, int i9, WorldClockModel worldClockModel) {
        Intent intent = new Intent();
        intent.putExtra(BaseParamNames.WORLD_CLOCK_ENTITY, worldClockModel);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSearchResultList$5(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Intent intent = new Intent();
        intent.putExtra(BaseParamNames.WORLD_CLOCK_ENTITY, (WorldClockModel) baseQuickAdapter.getItem(i8));
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchClock() {
        String obj = ((ActivitySelectClockBinding) this.binding).etInput.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setVisibility(0);
            ((ActivitySelectClockBinding) this.binding).rcvSearchResult.setVisibility(8);
        } else {
            ((ActivitySelectClockBinding) this.binding).rcvSearchResult.setVisibility(0);
            ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setVisibility(8);
        }
        ((ActivitySelectClockBinding) this.binding).tvEmpty.setVisibility(8);
        this.searchClockAdapter.getFilter().filter(obj);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        k0.setColorNoTranslucent(this, -1);
        this.presenter.getAllClock();
        ((ActivitySelectClockBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClockActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivitySelectClockBinding) this.binding).tvClear.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClockActivity.this.lambda$initBinding$1(view);
            }
        });
        ((ActivitySelectClockBinding) this.binding).etInput.requestFocus();
        ((ActivitySelectClockBinding) this.binding).etInput.addTextChangedListener(new a());
        ((ActivitySelectClockBinding) this.binding).etInput.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.crrepa.band.my.device.worldclock.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
                boolean lambda$initBinding$2;
                lambda$initBinding$2 = SelectClockActivity.this.lambda$initBinding$2(textView, i8, keyEvent);
                return lambda$initBinding$2;
            }
        });
        ((ActivitySelectClockBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.worldclock.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectClockActivity.this.lambda$initBinding$3(view);
            }
        });
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
        s0.logPage(getClass(), "世界时钟添加页面");
    }

    @Override // f2.a
    public void renderClockList(List<WorldClockModel> list) {
        com.crrepa.band.my.device.worldclock.adapter.a aVar = new com.crrepa.band.my.device.worldclock.adapter.a(this);
        ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setLayoutManager(new LinearLayoutManager(this));
        ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setCompareMode(0);
        ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setAdapter(aVar);
        ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setIndexBarVisibility(true);
        aVar.setDatas(list);
        aVar.setOnItemContentClickListener(new d.b() { // from class: com.crrepa.band.my.device.worldclock.b
            @Override // me.yokeyword.indexablerv.d.b
            public final void onItemClick(View view, int i8, int i9, Object obj) {
                SelectClockActivity.this.lambda$renderClockList$4(view, i8, i9, (WorldClockModel) obj);
            }
        });
        renderSearchResultList(list);
    }

    @Override // f2.a
    public void renderSearchResult(boolean z7) {
        ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setIndexBarVisibility(false);
        if (z7) {
            ((ActivitySelectClockBinding) this.binding).tvEmpty.setVisibility(8);
            ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setVisibility(0);
        } else {
            ((ActivitySelectClockBinding) this.binding).tvEmpty.setVisibility(0);
            ((ActivitySelectClockBinding) this.binding).clockIndexableLayout.setVisibility(8);
        }
    }

    public void renderSearchResultList(List<WorldClockModel> list) {
        this.searchClockAdapter = new SearchClockAdapter(list, ((ActivitySelectClockBinding) this.binding).tvEmpty);
        ((ActivitySelectClockBinding) this.binding).rcvSearchResult.setLayoutManager(new LinearLayoutManager(this));
        ((ActivitySelectClockBinding) this.binding).rcvSearchResult.setHasFixedSize(true);
        ((ActivitySelectClockBinding) this.binding).rcvSearchResult.setAdapter(this.searchClockAdapter);
        this.searchClockAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.device.worldclock.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                SelectClockActivity.this.lambda$renderSearchResultList$5(baseQuickAdapter, view, i8);
            }
        });
    }

    @Override // f2.a
    public void renderSelectedClock(WorldClockModel worldClockModel) {
        Intent intent = new Intent();
        intent.putExtra(SELECT_CLOCK_LIST, worldClockModel);
        setResult(-1, intent);
        finish();
    }
}
