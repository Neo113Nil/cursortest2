package com.crrepa.band.my.device.pillreminder.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.PillReminderTimeModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes2.dex */
public class PillReminderTimeAdapter extends BaseQuickAdapter<PillReminderTimeModel, BaseViewHolder> {
    private Context context;
    private boolean is12HourTime;

    public PillReminderTimeAdapter(Context context, @Nullable List<PillReminderTimeModel> list) {
        super(R.layout.item_pill_reminder_time, list);
        this.is12HourTime = BandTimeSystemProvider.is12HourTime();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, PillReminderTimeModel pillReminderTimeModel) {
        int time = pillReminderTimeModel.getTime();
        int i8 = time / 60;
        int i9 = time % 60;
        int i10 = this.is12HourTime ? R.string.hour_minute_format_12 : R.string.hour_minute_format_24;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i8);
        calendar.set(12, i9);
        baseViewHolder.setText(R.id.tv_reminder_time, m.format(calendar.getTime(), this.context.getString(i10)));
        baseViewHolder.setText(R.id.tv_pill_count, "x" + pillReminderTimeModel.getCount());
    }
}
