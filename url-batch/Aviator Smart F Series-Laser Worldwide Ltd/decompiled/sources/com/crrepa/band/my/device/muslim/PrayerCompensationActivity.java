package com.crrepa.band.my.device.muslim;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPrayerCompensationBinding;
import com.crrepa.band.my.device.muslim.PrayerCompensationSelectDialog;
import com.crrepa.band.my.device.muslim.adapter.PrayerCompensationAdapter;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayerCompensationChangeEvent;
import com.crrepa.band.my.device.muslim.model.PrayerCompensationModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PrayerCompensationActivity extends BaseVBActivity<ActivityPrayerCompensationBinding> implements OnItemClickListener {
    PrayerCompensationAdapter adapter = new PrayerCompensationAdapter();

    private void initRecyclerView() {
        ((ActivityPrayerCompensationBinding) this.binding).rvPrayerCompensationList.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityPrayerCompensationBinding) this.binding).rvPrayerCompensationList.setAdapter(this.adapter);
        this.adapter.setNewData(getManualCorrectionList());
        this.adapter.setOnItemClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$0(View view) {
        onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: saveCorrectionValue, reason: merged with bridge method [inline-methods] */
    public void lambda$showCorrectionValueSelectDialog$1(int i8, PrayerCompensationModel.TimeType timeType) {
        int[] prayerCompensation = com.crrepa.band.my.device.muslim.utils.c.getPrayerCompensation();
        prayerCompensation[timeType.ordinal()] = i8;
        com.crrepa.band.my.device.muslim.utils.c.savePrayerCompensation(prayerCompensation);
        this.adapter.setNewData(getManualCorrectionList());
    }

    private void setActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityPrayerCompensationBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityPrayerCompensationBinding) vb).topBar.tvTitle, ((ActivityPrayerCompensationBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityPrayerCompensationBinding) this.binding).topBar.toolbar);
    }

    private void setTitle() {
        ((ActivityPrayerCompensationBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_prayer_compensation);
        ((ActivityPrayerCompensationBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_prayer_compensation);
        ((ActivityPrayerCompensationBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.ic_back_n);
        ((ActivityPrayerCompensationBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrayerCompensationActivity.this.lambda$setTitle$0(view);
            }
        });
    }

    private void showCorrectionValueSelectDialog(final PrayerCompensationModel.TimeType timeType) {
        PrayerCompensationSelectDialog prayerCompensationSelectDialog = new PrayerCompensationSelectDialog(this);
        prayerCompensationSelectDialog.setSelectedValue(com.crrepa.band.my.device.muslim.utils.c.getPrayerCompensation()[timeType.ordinal()]);
        prayerCompensationSelectDialog.setOnDoneClickListener(new PrayerCompensationSelectDialog.a() { // from class: com.crrepa.band.my.device.muslim.e0
            @Override // com.crrepa.band.my.device.muslim.PrayerCompensationSelectDialog.a
            public final void onDone(int i8) {
                PrayerCompensationActivity.this.lambda$showCorrectionValueSelectDialog$1(timeType, i8);
            }
        });
        prayerCompensationSelectDialog.show();
    }

    public List<PrayerCompensationModel> getManualCorrectionList() {
        ArrayList arrayList = new ArrayList();
        int[] prayerCompensation = com.crrepa.band.my.device.muslim.utils.c.getPrayerCompensation();
        String string = getString(R.string.muslim_pray_time_fajr);
        PrayerCompensationModel.TimeType timeType = PrayerCompensationModel.TimeType.FAJR;
        arrayList.add(new PrayerCompensationModel(string, prayerCompensation[timeType.ordinal()], timeType));
        String string2 = getString(R.string.muslim_pray_time_sunrise);
        PrayerCompensationModel.TimeType timeType2 = PrayerCompensationModel.TimeType.SUNRISE;
        arrayList.add(new PrayerCompensationModel(string2, prayerCompensation[timeType2.ordinal()], timeType2));
        String string3 = getString(R.string.muslim_pray_time_dhuhr);
        PrayerCompensationModel.TimeType timeType3 = PrayerCompensationModel.TimeType.DHUHR;
        arrayList.add(new PrayerCompensationModel(string3, prayerCompensation[timeType3.ordinal()], timeType3));
        String string4 = getString(R.string.muslim_pray_time_asr);
        PrayerCompensationModel.TimeType timeType4 = PrayerCompensationModel.TimeType.ASR;
        arrayList.add(new PrayerCompensationModel(string4, prayerCompensation[timeType4.ordinal()], timeType4));
        String string5 = getString(R.string.muslim_pray_time_maghrib);
        PrayerCompensationModel.TimeType timeType5 = PrayerCompensationModel.TimeType.MAGHRIB;
        arrayList.add(new PrayerCompensationModel(string5, prayerCompensation[timeType5.ordinal()], timeType5));
        String string6 = getString(R.string.muslim_pray_time_lsha);
        PrayerCompensationModel.TimeType timeType6 = PrayerCompensationModel.TimeType.LSHA;
        arrayList.add(new PrayerCompensationModel(string6, prayerCompensation[timeType6.ordinal()], timeType6));
        return arrayList;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        com.moyoung.dafit.module.common.utils.k0.setDarkMode(this);
        setTitle();
        setActionBar();
        initRecyclerView();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        PrayerCompensationModel prayerCompensationModel;
        if ((baseQuickAdapter instanceof PrayerCompensationAdapter) && (prayerCompensationModel = (PrayerCompensationModel) baseQuickAdapter.getItem(i8)) != null) {
            showCorrectionValueSelectDialog(prayerCompensationModel.getTimeType());
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayerCompensationChangeEvent());
        i1.b.sendCompensationArray(com.crrepa.band.my.device.muslim.utils.c.getPrayerCompensation());
    }
}
