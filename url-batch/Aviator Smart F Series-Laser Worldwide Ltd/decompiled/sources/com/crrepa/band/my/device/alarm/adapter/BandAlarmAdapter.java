package com.crrepa.band.my.device.alarm.adapter;

import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.CompoundButton;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.band.my.model.db.proxy.BandAlarmDaoProxy;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.kyleduo.switchbutton.SwitchButton;
import java.util.Calendar;
import java.util.Locale;
import v0.b;

/* loaded from: classes2.dex */
public class BandAlarmAdapter extends BaseQuickAdapter<Alarm, BaseViewHolder> {
    private BandAlarmDaoProxy daoProxy;

    class a implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ Alarm val$item;
        final /* synthetic */ SwitchButton val$switchButton;

        a(Alarm alarm, SwitchButton switchButton) {
            this.val$item = alarm;
            this.val$switchButton = switchButton;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            BandAlarmAdapter.this.updateAlarmState(z7, this.val$item, this.val$switchButton);
        }
    }

    public BandAlarmAdapter() {
        super(R.layout.item_band_alarm);
        this.daoProxy = new BandAlarmDaoProxy();
    }

    private boolean sendAlarm(CRPAlarmInfo cRPAlarmInfo) {
        i4 i4Var = i4.getInstance();
        return i4Var.sendAlarm(cRPAlarmInfo) && i4Var.sendNewAlarm(cRPAlarmInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAlarmState(boolean z7, Alarm alarm, SwitchButton switchButton) {
        alarm.setSwitchOn(Boolean.valueOf(z7));
        if (sendAlarm(v0.a.convert(alarm))) {
            this.daoProxy.save(alarm);
        } else {
            switchButton.setCheckedNoEvent(!z7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, Alarm alarm) {
        String string;
        int intValue = alarm.getHour().intValue();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, intValue);
        if (BandTimeSystemProvider.is12HourTime()) {
            baseViewHolder.setText(R.id.tv_time_noon, calendar.getDisplayName(9, 1, Locale.getDefault()));
            string = getContext().getString(R.string.hour_minute_format);
        } else {
            baseViewHolder.setGone(R.id.tv_time_noon, true);
            string = getContext().getString(R.string.hour_minute_format_24);
        }
        calendar.set(12, alarm.getMinute().intValue());
        baseViewHolder.setText(R.id.tv_alarm_time, DateFormat.format(string, calendar.getTime()));
        String repeatMessage = b.toRepeatMessage(getContext(), alarm.getRepeat() == null ? 0 : alarm.getRepeat().intValue());
        if (!TextUtils.isEmpty(repeatMessage)) {
            baseViewHolder.setText(R.id.tv_alarm_repeat, repeatMessage);
        }
        SwitchButton switchButton = (SwitchButton) baseViewHolder.getView(R.id.sbtn_alarm);
        switchButton.setCheckedNoEvent(alarm.getSwitchOn().booleanValue());
        switchButton.setOnCheckedChangeListener(new a(alarm, switchButton));
    }
}
