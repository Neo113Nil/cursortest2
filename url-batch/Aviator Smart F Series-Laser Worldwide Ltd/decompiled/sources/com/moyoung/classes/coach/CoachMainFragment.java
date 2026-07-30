package com.moyoung.classes.coach;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.adapter.CoachMainAdapter;
import com.moyoung.classes.coach.model.event.ClassesMainDataLoadedEvent;
import com.moyoung.classes.databinding.FragmentCoachMainBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachMainFragment extends BaseVBFragment<FragmentCoachMainBinding> implements com.moyoung.classes.k {
    private com.moyoung.classes.i classesModel;
    private CoachMainAdapter mainAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        requestTagList();
        if (a0.isNetworkConnected(requireContext())) {
            getPageLoadingUI().show();
        } else {
            r0.showShort(requireContext(), R$string.classes_network_exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        ((FragmentCoachMainBinding) this.binding).tvNetError.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTagList$2(List list) {
        getPageLoadingUI().hide();
        if (list == null || list.isEmpty()) {
            showNetError();
            return;
        }
        ((FragmentCoachMainBinding) this.binding).tvNetError.setVisibility(8);
        ((FragmentCoachMainBinding) this.binding).slRefresh.setVisibility(8);
        this.mainAdapter.addData((Collection) list);
        org.greenrobot.eventbus.c.getDefault().post(new ClassesMainDataLoadedEvent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTagList$3(Throwable th) {
        showNetError();
    }

    @SuppressLint({"CheckResult"})
    private void requestTagList() {
        if (this.classesModel == null) {
            this.classesModel = new com.moyoung.classes.i();
        }
        this.classesModel.requestCoachTagList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.coach.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachMainFragment.this.lambda$requestTagList$2((List) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.coach.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachMainFragment.this.lambda$requestTagList$3((Throwable) obj);
            }
        });
    }

    private void showNetError() {
        getPageLoadingUI().hide();
        ((FragmentCoachMainBinding) this.binding).tvNetError.setVisibility(0);
        ((FragmentCoachMainBinding) this.binding).slRefresh.setVisibility(0);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        ((FragmentCoachMainBinding) this.binding).tvNetError.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachMainFragment.this.lambda$initBinding$0(view);
            }
        });
        ((FragmentCoachMainBinding) this.binding).slRefresh.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachMainFragment.this.lambda$initBinding$1(view);
            }
        });
        ((FragmentCoachMainBinding) this.binding).rv.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentCoachMainBinding) this.binding).rv.setNestedScrollingEnabled(false);
        CoachMainAdapter coachMainAdapter = new CoachMainAdapter();
        this.mainAdapter = coachMainAdapter;
        ((FragmentCoachMainBinding) this.binding).rv.setAdapter(coachMainAdapter);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        requestTagList();
    }

    @Override // com.moyoung.classes.k
    public void refreshOnNetworkReconnected() {
        this.mainAdapter.refreshChildAdapter();
    }
}
