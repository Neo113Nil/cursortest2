package com.moyoung.classes.meditation;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.moyoung.classes.R$color;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.model.event.ClassesMainDataLoadedEvent;
import com.moyoung.classes.databinding.FragmentMeditationMainBinding;
import com.moyoung.classes.k;
import com.moyoung.classes.meditation.localclass.model.LocalClassDoneEvent;
import com.moyoung.classes.meditation.localclass.model.MeditationLocalModel;
import com.moyoung.classes.meditation.model.MeditationTagBean;
import com.moyoung.classes.meditation.model.MeditationTagResp;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.utils.a0;
import com.moyoung.dafit.module.common.utils.q0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.y;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes4.dex */
public class MeditationMainFragment extends BaseVBFragment<FragmentMeditationMainBinding> implements k {
    private com.moyoung.classes.i classesModel;
    private MeditationMainAdapter mainAdapter;

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
        y.openMindsootheAppDetailPage(requireContext());
        s0.logEvent("冥想引流入口", "meditation_entry_type", "2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestTagList$2(List list) {
        getPageLoadingUI().hide();
        if (list == null || list.isEmpty()) {
            showNetError();
            return;
        }
        ((FragmentMeditationMainBinding) this.binding).tvNetError.setVisibility(8);
        this.mainAdapter.addData((Collection) MeditationTagBean.convert((List<MeditationTagResp>) list));
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
        this.classesModel.requestMeditationTagList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.meditation.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MeditationMainFragment.this.lambda$requestTagList$2((List) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.meditation.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MeditationMainFragment.this.lambda$requestTagList$3((Throwable) obj);
            }
        });
    }

    private void showNetError() {
        getPageLoadingUI().hide();
        ((FragmentMeditationMainBinding) this.binding).tvNetError.setVisibility(0);
    }

    private void updateLocalClass() {
        this.mainAdapter.setData(0, MeditationLocalModel.getLocalClassList(requireContext()).get(0));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        ((FragmentMeditationMainBinding) this.binding).tvNetError.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeditationMainFragment.this.lambda$initBinding$0(view);
            }
        });
        ((FragmentMeditationMainBinding) this.binding).rv.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        ((FragmentMeditationMainBinding) this.binding).rv.setNestedScrollingEnabled(false);
        MeditationMainAdapter meditationMainAdapter = new MeditationMainAdapter();
        this.mainAdapter = meditationMainAdapter;
        ((FragmentMeditationMainBinding) this.binding).rv.setAdapter(meditationMainAdapter);
        int[] iArr = {ContextCompat.getColor(requireContext(), R$color.assist_banner1_1), ContextCompat.getColor(requireContext(), R$color.assist_banner1_2)};
        q0.setGradientColor(((FragmentMeditationMainBinding) this.binding).includeMindsoothe.tvMindsootheTitle, iArr);
        q0.setGradientColor(((FragmentMeditationMainBinding) this.binding).includeMindsoothe.tvMindsootheContent, iArr);
        y.initMindsootheCard(((FragmentMeditationMainBinding) this.binding).includeMindsoothe.cardMindsoothe);
        ((FragmentMeditationMainBinding) this.binding).includeMindsoothe.cardMindsoothe.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeditationMainFragment.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void loadData() {
        super.loadData();
        this.mainAdapter.setNewData(MeditationLocalModel.getLocalClassList(requireContext()));
        requestTagList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(LocalClassDoneEvent localClassDoneEvent) {
        updateLocalClass();
    }

    @Override // com.moyoung.classes.k
    public void refreshOnNetworkReconnected() {
        this.mainAdapter.refreshChildAdapter();
    }
}
