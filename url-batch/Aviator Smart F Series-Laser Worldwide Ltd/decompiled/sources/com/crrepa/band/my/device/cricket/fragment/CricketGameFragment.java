package com.crrepa.band.my.device.cricket.fragment;

import a1.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import b1.d;
import com.afollestad.materialdialogs.MaterialDialog;
import com.crrepa.band.my.databinding.FragmentCricketGameBinding;
import com.crrepa.band.my.device.cricket.adapter.DayCricketGameAdapter;
import com.crrepa.band.my.device.cricket.model.CricketGameModel;
import com.crrepa.band.my.device.cricket.model.DayCricketGameModel;
import com.crrepa.band.my.device.cricket.presenter.g;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.proxy.CricketGameProxy;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class CricketGameFragment extends BaseVBFragment<FragmentCricketGameBinding> implements d {
    private MaterialDialog calendarPermissionDialog;
    private g presenter = new g();
    private DayCricketGameAdapter cricketGameAdapter = new DayCricketGameAdapter();

    class a implements Runnable {
        final /* synthetic */ int val$finalIndex;

        a(int i8) {
            this.val$finalIndex = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((FragmentCricketGameBinding) ((BaseVBFragment) CricketGameFragment.this).binding).rcvCricketList.smoothScrollToPosition(this.val$finalIndex);
        }
    }

    public static CricketGameFragment getInstance() {
        return new CricketGameFragment();
    }

    private void initGameSessions() {
        ((FragmentCricketGameBinding) this.binding).rcvCricketList.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((FragmentCricketGameBinding) this.binding).rcvCricketList.setAdapter(this.cricketGameAdapter);
        this.cricketGameAdapter.setOnSubscribeClickListener(new DayCricketGameAdapter.a() { // from class: com.crrepa.band.my.device.cricket.fragment.a
            @Override // com.crrepa.band.my.device.cricket.adapter.DayCricketGameAdapter.a
            public final void onSubscribeClick(CricketGameModel cricketGameModel) {
                CricketGameFragment.this.lambda$initGameSessions$0(cricketGameModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateGameReserveState, reason: merged with bridge method [inline-methods] */
    public void lambda$initGameSessions$0(CricketGameModel cricketGameModel) {
        if (!c.hasCalendarPermission(requireContext())) {
            this.calendarPermissionDialog = c.showCalendarPermissionDialog(requireActivity());
            return;
        }
        CricketGameProxy cricketGameProxy = new CricketGameProxy();
        CricketGame cricketGame = cricketGameProxy.get(Integer.valueOf(cricketGameModel.getId()).intValue());
        if (cricketGame != null) {
            cricketGame.setReserved(Boolean.valueOf(!cricketGameModel.isReserved()));
            cricketGameProxy.update(cricketGame);
        }
        org.greenrobot.eventbus.c.getDefault().post(new y0.a());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        initGameSessions();
        this.presenter.getCricketSchedule();
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        MaterialDialog materialDialog = this.calendarPermissionDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            return;
        }
        this.calendarPermissionDialog.dismiss();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onSubscription(y0.a aVar) {
        this.presenter.getCricketSchedule();
    }

    @Override // b1.d
    public void renderCricketSchedule(List<DayCricketGameModel> list) {
        List<DayCricketGameModel> data = this.cricketGameAdapter.getData();
        this.cricketGameAdapter.setNewData(list);
        if (data == null || data.isEmpty()) {
            Date date = new Date();
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (date.getTime() <= list.get(i9).getDate().getTime()) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            ((FragmentCricketGameBinding) this.binding).rcvCricketList.post(new a(i8));
        }
    }
}
