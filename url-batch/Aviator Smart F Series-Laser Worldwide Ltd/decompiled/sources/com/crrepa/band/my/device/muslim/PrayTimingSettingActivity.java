package com.crrepa.band.my.device.muslim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityPrayTimingSettingBinding;
import com.crrepa.band.my.device.muslim.adapter.PrayReminderSwitchAdapter;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayMethodChangeEvent;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayReminderStateChangeEvent;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import com.crrepa.band.my.health.widgets.dialog.m;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PrayTimingSettingActivity extends BaseVBActivity<ActivityPrayTimingSettingBinding> {
    private com.crrepa.band.my.device.muslim.utils.b muslimManager;
    boolean[] prayTimeSwitchArray;
    List<String> prayMethodList = new ArrayList();
    List<String> asrJuristicMethodList = new ArrayList();
    PrayReminderSwitchAdapter adapter = new PrayReminderSwitchAdapter();

    private String getCorrectionsValueStr() {
        int[] prayerCompensation = com.crrepa.band.my.device.muslim.utils.c.getPrayerCompensation();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < prayerCompensation.length; i8++) {
            if (i8 != 4) {
                sb.append(prayerCompensation[i8]);
                if (i8 != prayerCompensation.length - 1) {
                    sb.append(SystemInfoUtil.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private boolean[] getCurrentTimeSwitchArray() {
        List<MuslimPray> data = this.adapter.getData();
        if (data.size() == 0) {
            return this.prayTimeSwitchArray;
        }
        boolean[] zArr = new boolean[data.size()];
        for (int i8 = 0; i8 < data.size(); i8++) {
            zArr[i8] = data.get(i8).isRemind();
        }
        return zArr;
    }

    private List<MuslimPray> getPrayList() {
        int[] iArr = {R.string.muslim_pray_time_fajr, R.string.muslim_pray_time_sunrise, R.string.muslim_pray_time_dhuhr, R.string.muslim_pray_time_asr, R.string.muslim_pray_time_maghrib, R.string.muslim_pray_time_lsha};
        int[] iArr2 = {R$drawable.ic_prayer_timings_fajr, R$drawable.ic_prayer_timings_sunrise, R$drawable.ic_prayer_timings_dhuhr, R$drawable.ic_prayer_timings_asr, R$drawable.ic_prayer_timings_maghrib, R$drawable.ic_prayer_timings_lsha};
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < 6; i8++) {
            MuslimPray muslimPray = new MuslimPray();
            muslimPray.setRemind(this.prayTimeSwitchArray[i8]);
            muslimPray.setName(getString(iArr[i8]));
            muslimPray.setIcon(iArr2[i8]);
            arrayList.add(muslimPray);
        }
        return arrayList;
    }

    private void initRecyclerView() {
        ((ActivityPrayTimingSettingBinding) this.binding).rcvMuslimTime.setVisibility(0);
        ((ActivityPrayTimingSettingBinding) this.binding).rcvMuslimTime.setLayoutManager(new LinearLayoutManager(this));
        this.adapter.setItemCheckedChangeListener(new PrayReminderSwitchAdapter.a() { // from class: com.crrepa.band.my.device.muslim.v
            @Override // com.crrepa.band.my.device.muslim.adapter.PrayReminderSwitchAdapter.a
            public final void onItemCheckedChange(boolean z7) {
                PrayTimingSettingActivity.this.lambda$initRecyclerView$5(z7);
            }
        });
        ((ActivityPrayTimingSettingBinding) this.binding).rcvMuslimTime.setAdapter(this.adapter);
        this.adapter.setNewData(getPrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        showMethodDialog(this.prayMethodList, com.crrepa.band.my.device.muslim.utils.c.getPrayMethod(), new m.a() { // from class: com.crrepa.band.my.device.muslim.w
            @Override // com.crrepa.band.my.health.widgets.dialog.m.a
            public final void onClick(String str) {
                PrayTimingSettingActivity.this.updatePrayMethod(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        showMethodDialog(this.asrJuristicMethodList, com.crrepa.band.my.device.muslim.utils.c.getAsrJuristicMethod(), new m.a() { // from class: com.crrepa.band.my.device.muslim.c0
            @Override // com.crrepa.band.my.health.widgets.dialog.m.a
            public final void onClick(String str) {
                PrayTimingSettingActivity.this.updateAsrJuristicMethod(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(CompoundButton compoundButton, boolean z7) {
        this.prayTimeSwitchArray = getCurrentTimeSwitchArray();
        renderPraySwitchListState(z7);
        this.muslimManager.sendMuslimPraySwitchArray(z7, this.prayTimeSwitchArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        startActivity(new Intent(this, (Class<?>) PrayerCompensationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRecyclerView$5(boolean z7) {
        boolean[] currentTimeSwitchArray = getCurrentTimeSwitchArray();
        this.prayTimeSwitchArray = currentTimeSwitchArray;
        this.muslimManager.sendMuslimPraySwitchArray(true, currentTimeSwitchArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setSupportActionBar$4(View view) {
        onBackPressed();
    }

    private void renderPraySwitchListState(boolean z7) {
        if (z7) {
            initRecyclerView();
        } else {
            ((ActivityPrayTimingSettingBinding) this.binding).rcvMuslimTime.setVisibility(8);
        }
    }

    private void renderPraySwitchState() {
        this.prayTimeSwitchArray = com.crrepa.band.my.device.muslim.utils.c.getPrayTimeSwitchArray(false);
        boolean praySwitchState = com.crrepa.band.my.device.muslim.utils.c.getPraySwitchState();
        renderPraySwitchListState(praySwitchState);
        ((ActivityPrayTimingSettingBinding) this.binding).sbtnPrayerReminder.setCheckedNoEvent(praySwitchState);
    }

    private void savePrayTimeData() {
        com.crrepa.band.my.device.muslim.utils.c.savePraySwitchState(((ActivityPrayTimingSettingBinding) this.binding).sbtnPrayerReminder.isChecked());
        boolean[] currentTimeSwitchArray = getCurrentTimeSwitchArray();
        this.prayTimeSwitchArray = currentTimeSwitchArray;
        com.crrepa.band.my.device.muslim.utils.c.savePrayTimeSwitchArray(currentTimeSwitchArray);
        org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayReminderStateChangeEvent(false));
    }

    private void setSupportActionBar() {
        com.moyoung.dafit.module.common.widgets.b bVar = new com.moyoung.dafit.module.common.widgets.b(((ActivityPrayTimingSettingBinding) this.binding).topBar.appbar);
        VB vb = this.binding;
        bVar.addTitleScrollEvent(((ActivityPrayTimingSettingBinding) vb).topBar.tvTitle, ((ActivityPrayTimingSettingBinding) vb).topBar.tvExpandedTitle);
        setSupportActionBar(((ActivityPrayTimingSettingBinding) this.binding).topBar.toolbar);
        ((ActivityPrayTimingSettingBinding) this.binding).topBar.tvTitle.setText(R.string.muslim_pray_time_setting_title);
        ((ActivityPrayTimingSettingBinding) this.binding).topBar.tvExpandedTitle.setText(R.string.muslim_pray_time_setting_title);
        ((ActivityPrayTimingSettingBinding) this.binding).topBar.ivTitleBack.setImageResource(R.drawable.selector_title_back);
        ((ActivityPrayTimingSettingBinding) this.binding).topBar.ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrayTimingSettingActivity.this.lambda$setSupportActionBar$4(view);
            }
        });
    }

    private void showMethodDialog(List<String> list, int i8, m.a aVar) {
        new com.crrepa.band.my.health.widgets.dialog.m(this).setMethodList(list).setSelectedPosition(i8).setCyclic(false).setOnDoneClickListener(aVar).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAsrJuristicMethod(String str) {
        ((ActivityPrayTimingSettingBinding) this.binding).tvAsrJuristicMethod.setText(str);
        for (int i8 = 0; i8 < this.asrJuristicMethodList.size(); i8++) {
            if (str.equals(this.asrJuristicMethodList.get(i8))) {
                if (i8 != com.crrepa.band.my.device.muslim.utils.c.getAsrJuristicMethod()) {
                    com.crrepa.band.my.device.muslim.utils.c.saveAsrJuristicMethod(i8);
                    org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayMethodChangeEvent());
                    this.muslimManager.sendMuslimPrayMethodType();
                    com.crrepa.band.my.device.muslim.utils.c.deletePrayerCompensation();
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePrayMethod(String str) {
        ((ActivityPrayTimingSettingBinding) this.binding).tvCalculateMethod.setText(str);
        for (int i8 = 0; i8 < this.prayMethodList.size(); i8++) {
            if (str.equals(this.prayMethodList.get(i8))) {
                if (i8 != com.crrepa.band.my.device.muslim.utils.c.getPrayMethod()) {
                    com.crrepa.band.my.device.muslim.utils.c.savePrayMethod(i8);
                    org.greenrobot.eventbus.c.getDefault().post(new BandMuslimPrayMethodChangeEvent());
                    this.muslimManager.sendMuslimPrayMethodType();
                    com.crrepa.band.my.device.muslim.utils.c.deletePrayerCompensation();
                    return;
                }
                return;
            }
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.muslimManager = new com.crrepa.band.my.device.muslim.utils.b();
        setSupportActionBar();
        this.prayMethodList.add(getString(R.string.muslim_method_sia));
        this.prayMethodList.add(getString(R.string.muslim_method_uis));
        this.prayMethodList.add(getString(R.string.muslim_method_mwl));
        this.prayMethodList.add(getString(R.string.muslim_method_isna));
        this.prayMethodList.add(getString(R.string.muslim_method_uq));
        if (com.crrepa.band.my.device.muslim.utils.c.getSupportSIHATKEMENAG()) {
            this.prayMethodList.add(getString(R.string.muslim_method_kemenag));
        }
        ((ActivityPrayTimingSettingBinding) this.binding).tvCalculateMethod.setText(this.prayMethodList.get(com.crrepa.band.my.device.muslim.utils.c.getPrayMethod()));
        ((ActivityPrayTimingSettingBinding) this.binding).rlCalculateMethod.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrayTimingSettingActivity.this.lambda$initBinding$0(view);
            }
        });
        if (com.crrepa.band.my.device.muslim.utils.c.isShowAsrMethod()) {
            ((ActivityPrayTimingSettingBinding) this.binding).rlAsrJuristicMethod.setVisibility(0);
            this.asrJuristicMethodList.add(getString(R.string.muslim_asr_juristic_shafii));
            this.asrJuristicMethodList.add(getString(R.string.muslim_asr_juristic_hanafi));
            ((ActivityPrayTimingSettingBinding) this.binding).tvAsrJuristicMethod.setText(this.asrJuristicMethodList.get(com.crrepa.band.my.device.muslim.utils.c.getAsrJuristicMethod()));
            ((ActivityPrayTimingSettingBinding) this.binding).rlAsrJuristicMethod.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrayTimingSettingActivity.this.lambda$initBinding$1(view);
                }
            });
        }
        ((ActivityPrayTimingSettingBinding) this.binding).sbtnPrayerReminder.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.muslim.z
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                PrayTimingSettingActivity.this.lambda$initBinding$2(compoundButton, z7);
            }
        });
        renderPraySwitchState();
        if (com.crrepa.band.my.device.muslim.utils.c.isSupportPrayerCompensation()) {
            ((ActivityPrayTimingSettingBinding) this.binding).rlPrayerCompensation.setVisibility(0);
            ((ActivityPrayTimingSettingBinding) this.binding).rlPrayerCompensation.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.muslim.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PrayTimingSettingActivity.this.lambda$initBinding$3(view);
                }
            });
            ((ActivityPrayTimingSettingBinding) this.binding).tvPrayerCompensationValue.setText(getCorrectionsValueStr());
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandPrayReminderStateChangeEvent(BandMuslimPrayReminderStateChangeEvent bandMuslimPrayReminderStateChangeEvent) {
        if (bandMuslimPrayReminderStateChangeEvent.isWatchCallback()) {
            boolean praySwitchState = com.crrepa.band.my.device.muslim.utils.c.getPraySwitchState();
            ((ActivityPrayTimingSettingBinding) this.binding).sbtnPrayerReminder.setCheckedNoEvent(praySwitchState);
            ((ActivityPrayTimingSettingBinding) this.binding).rcvMuslimTime.setVisibility(praySwitchState ? 0 : 8);
            boolean[] prayTimeSwitchArray = com.crrepa.band.my.device.muslim.utils.c.getPrayTimeSwitchArray(false);
            List<MuslimPray> data = this.adapter.getData();
            for (int i8 = 0; i8 < prayTimeSwitchArray.length; i8++) {
                if (i8 < data.size() && data.get(i8).isRemind() != prayTimeSwitchArray[i8]) {
                    data.get(i8).setRemind(prayTimeSwitchArray[i8]);
                    this.adapter.notifyItemChanged(i8);
                }
            }
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        savePrayTimeData();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((ActivityPrayTimingSettingBinding) this.binding).tvPrayerCompensationValue.setText(getCorrectionsValueStr());
    }
}
