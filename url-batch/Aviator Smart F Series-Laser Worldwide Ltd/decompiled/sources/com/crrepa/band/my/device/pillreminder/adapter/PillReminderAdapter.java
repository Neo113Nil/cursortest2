package com.crrepa.band.my.device.pillreminder.adapter;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.proxy.PillReminderDaoProxy;
import com.kyleduo.switchbutton.SwitchButton;
import com.moyoung.dafit.module.common.utils.s;
import k1.b;

/* loaded from: classes2.dex */
public class PillReminderAdapter extends BaseQuickAdapter<PillReminder, BaseViewHolder> {
    private PillReminderDaoProxy pillReminderDaoProxy;

    class a implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ PillReminder val$item;

        a(PillReminder pillReminder) {
            this.val$item = pillReminder;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
            PillReminderAdapter.this.savePillReminderState(z7, this.val$item);
        }
    }

    public PillReminderAdapter() {
        super(R.layout.item_pill_reminder);
        this.pillReminderDaoProxy = new PillReminderDaoProxy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void savePillReminderState(boolean z7, PillReminder pillReminder) {
        pillReminder.setEnable(Boolean.valueOf(z7));
        if (z7) {
            pillReminder.setIndex(Integer.valueOf(this.pillReminderDaoProxy.getNextPillReminderIndex()));
            i4.getInstance().sendPillReminder(b.toCRPPillReminderInfo(pillReminder));
        } else {
            i4.getInstance().deletePillReminder(pillReminder.getIndex().intValue());
        }
        this.pillReminderDaoProxy.save(pillReminder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, PillReminder pillReminder) {
        baseViewHolder.setText(R.id.tv_pill_name, pillReminder.getName());
        SwitchButton switchButton = (SwitchButton) baseViewHolder.getView(R.id.sbtn_pill_reminder_state);
        switchButton.setCheckedNoEvent(pillReminder.getEnable().booleanValue());
        switchButton.setOnCheckedChangeListener(new a(pillReminder));
        Context context = switchButton.getContext();
        int intValue = pillReminder.getRepeat().intValue();
        if (1 < intValue) {
            baseViewHolder.setText(R.id.tv_reminder_repeat, context.getString(R.string.every_days, Integer.valueOf(intValue)));
        } else {
            baseViewHolder.setText(R.id.tv_reminder_repeat, R.string.every_day);
        }
        int intValue2 = pillReminder.getTimes().intValue();
        if (intValue2 == 1) {
            baseViewHolder.setText(R.id.tv_reminder_times, R.string.once_a_day);
        } else if (intValue2 != 2) {
            baseViewHolder.setText(R.id.tv_reminder_times, context.getString(R.string.many_times_a_day, Integer.valueOf(intValue2)));
        } else {
            baseViewHolder.setText(R.id.tv_reminder_times, R.string.twice_a_day);
        }
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R.id.rcv_reminder_time_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new PillReminderTimeAdapter(context, s.json2List(pillReminder.getReminderTime(), PillReminderTimeModel[].class)));
    }
}
