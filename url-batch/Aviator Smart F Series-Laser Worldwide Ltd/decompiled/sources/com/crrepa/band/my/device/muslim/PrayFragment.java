package com.crrepa.band.my.device.muslim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.adapter.PrayAdapter;
import com.crrepa.band.my.device.muslim.model.BandMuslimPrayReminderStateChangeEvent;
import com.crrepa.band.my.device.muslim.model.MuslimConst;
import com.crrepa.band.my.device.muslim.model.MuslimPray;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PrayFragment extends Fragment {
    RecyclerView rcvPray;
    PrayAdapter adapter = new PrayAdapter();
    ArrayList<String> prayTimes = null;
    int[] prayNames = {R.string.muslim_pray_time_fajr, R.string.muslim_pray_time_sunrise, R.string.muslim_pray_time_dhuhr, R.string.muslim_pray_time_asr, R.string.muslim_pray_time_maghrib, R.string.muslim_pray_time_lsha};
    Date date = null;
    Date todayPrayTime = null;
    int prayTimeIndex = -1;

    private List<MuslimPray> getPrayList() {
        int i8 = this.prayTimeIndex;
        if (i8 == -1) {
            i8 = com.crrepa.band.my.device.muslim.utils.d.getCurrentPrayIndex(this.prayTimes, this.date, this.todayPrayTime);
        }
        boolean[] zArr = new boolean[6];
        if (com.crrepa.band.my.device.muslim.utils.c.getPraySwitchState()) {
            zArr = com.crrepa.band.my.device.muslim.utils.c.getPrayTimeSwitchArray(false);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < this.prayNames.length) {
            MuslimPray muslimPray = new MuslimPray();
            muslimPray.setRemind(zArr[i9]);
            muslimPray.setName(getString(this.prayNames[i9]));
            muslimPray.setTime(this.prayTimes.isEmpty() ? requireContext().getString(R.string.data_blank) : this.prayTimes.get(i9));
            muslimPray.setCurrent(i8 == i9);
            arrayList.add(muslimPray);
            i9++;
        }
        return arrayList;
    }

    private void updatePrayTime() {
        if (this.prayTimes == null) {
            this.prayTimes = new ArrayList<>();
        }
        if (this.date == null) {
            this.date = new Date();
        }
        if (this.todayPrayTime == null) {
            this.todayPrayTime = new Date();
        }
        this.adapter.setNewData(getPrayList());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandPrayReminderStateChangeEvent(BandMuslimPrayReminderStateChangeEvent bandMuslimPrayReminderStateChangeEvent) {
        updatePrayTime();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_pray, viewGroup, false);
        this.rcvPray = (RecyclerView) inflate.findViewById(R.id.rcv_pray);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.rcvPray.setLayoutManager(new LinearLayoutManager(requireContext()));
        this.rcvPray.setAdapter(this.adapter);
        if (getArguments() == null) {
            return;
        }
        Bundle arguments = getArguments();
        this.prayTimes = arguments.getStringArrayList(MuslimConst.MUSLIM_PRAY_TIMES);
        this.date = (Date) arguments.getSerializable(MuslimConst.MUSLIM_PRAY_DATE);
        this.prayTimeIndex = arguments.getInt(MuslimConst.MUSLIM_PRAY_TIME_INDEX);
        updatePrayTime();
    }

    public void setTodayPrayTime(Date date) {
        this.todayPrayTime = date;
    }
}
