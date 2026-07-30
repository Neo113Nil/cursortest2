package com.crrepa.band.my.health.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentListHistoryDataBinding;
import com.moyoung.dafit.module.common.widgets.decoration.RecycleItemDivider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes2.dex */
public abstract class BaseListHistoryFragment extends BaseStatisticsFragment {
    private FragmentListHistoryDataBinding binding;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(BaseQuickAdapter baseQuickAdapter) {
            BaseListHistoryFragment.this.binding.rcvHistoryList.setAdapter(baseQuickAdapter);
            BaseListHistoryFragment.this.setOnItemClickListener(baseQuickAdapter);
        }
    }

    private void initRecyclerView() {
        this.binding.rcvHistoryList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.binding.rcvHistoryList.setHasFixedSize(true);
        this.binding.rcvHistoryList.addItemDecoration(new RecycleItemDivider(getContext(), 1, 1, ContextCompat.getColor(getContext(), R.color.color_line_bg)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnItemClickListener$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        onHistoryClicked(baseQuickAdapter, i8);
    }

    private void setHistoryData() {
        Observable.just(getHistoryAdapter()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnItemClickListener(BaseQuickAdapter baseQuickAdapter) {
        baseQuickAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.crrepa.band.my.health.base.g
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter2, View view, int i8) {
                BaseListHistoryFragment.this.lambda$setOnItemClickListener$0(baseQuickAdapter2, view, i8);
            }
        });
    }

    protected abstract BaseQuickAdapter getHistoryAdapter();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        FragmentListHistoryDataBinding inflate = FragmentListHistoryDataBinding.inflate(layoutInflater, viewGroup, false);
        this.binding = inflate;
        return inflate.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    protected abstract void onHistoryClicked(BaseQuickAdapter baseQuickAdapter, int i8);

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        setActivityMenuVisible(false);
        initRecyclerView();
        setHistoryData();
    }
}
