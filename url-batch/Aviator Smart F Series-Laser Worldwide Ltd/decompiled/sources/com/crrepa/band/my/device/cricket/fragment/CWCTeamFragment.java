package com.crrepa.band.my.device.cricket.fragment;

import a1.e;
import android.annotation.SuppressLint;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.my.databinding.FragmentCricketCwcTeamBinding;
import com.crrepa.band.my.device.cricket.adapter.CWCTeamsAdapter;
import com.crrepa.band.my.model.db.CricketTeamModel;
import com.crrepa.band.my.model.db.proxy.CricketTeamDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class CWCTeamFragment extends BaseVBFragment<FragmentCricketCwcTeamBinding> implements b1.b {
    private MaterialDialog calendarPermissionDialog;
    private com.crrepa.band.my.device.cricket.presenter.d presenter = new com.crrepa.band.my.device.cricket.presenter.d();
    private CricketTeamDaoProxy teamDaoProxy = new CricketTeamDaoProxy();

    class a implements CWCTeamsAdapter.a {
        a() {
        }

        @Override // com.crrepa.band.my.device.cricket.adapter.CWCTeamsAdapter.a
        public void onCheckedChange(CompoundButton compoundButton, boolean z7, CricketTeamModel cricketTeamModel) {
            if (a1.c.hasCalendarPermission(CWCTeamFragment.this.requireContext())) {
                cricketTeamModel.setSelected(Boolean.valueOf(z7));
                CWCTeamFragment.this.teamDaoProxy.update(cricketTeamModel);
                CWCTeamFragment.this.subscriptTeam(cricketTeamModel.getName(), Boolean.valueOf(z7));
            } else {
                CWCTeamFragment cWCTeamFragment = CWCTeamFragment.this;
                cWCTeamFragment.calendarPermissionDialog = a1.c.showCalendarPermissionDialog(cWCTeamFragment.requireActivity());
                compoundButton.setChecked(!z7);
            }
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            org.greenrobot.eventbus.c.getDefault().post(new y0.a());
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class d implements ObservableOnSubscribe {
        final /* synthetic */ Boolean val$isReserve;
        final /* synthetic */ String val$team;

        d(String str, Boolean bool) {
            this.val$team = str;
            this.val$isReserve = bool;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<String> observableEmitter) {
            e.updateTeamSubscription(this.val$team, this.val$isReserve);
            observableEmitter.onNext(this.val$team);
        }
    }

    public static CWCTeamFragment getInstance() {
        return new CWCTeamFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MaterialDialog materialDialog = this.calendarPermissionDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.calendarPermissionDialog.dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.getAllTeam();
    }

    @Override // b1.b
    public void renderTeams(List<CricketTeamModel> list) {
        ((FragmentCricketCwcTeamBinding) this.binding).rcvCwcTeam.setLayoutManager(new LinearLayoutManager(requireContext()));
        CWCTeamsAdapter cWCTeamsAdapter = new CWCTeamsAdapter(list);
        ((FragmentCricketCwcTeamBinding) this.binding).rcvCwcTeam.setAdapter(cWCTeamsAdapter);
        cWCTeamsAdapter.setOnTeamCheckedChangeListener(new a());
    }

    @SuppressLint({"CheckResult"})
    public void subscriptTeam(String str, Boolean bool) {
        Observable.create(new d(str, bool)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(), new c());
    }
}
