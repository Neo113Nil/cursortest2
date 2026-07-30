package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bloodoxygen.model.BandBloodOxygenChangeEvent;
import com.crrepa.band.my.health.widgets.BoDisplayView;
import com.crrepa.band.my.model.db.BloodOxygen;
import com.crrepa.band.my.model.db.proxy.BloodOxygenDaoProxy;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class c extends b {
    private BoDisplayView boDisplayView;

    public c(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.boDisplayView = (BoDisplayView) baseViewHolder.getView(R.id.bo_display_view);
        this.holder.setText(R.id.tv_data_type, R.string.blood_oxygen);
        this.holder.setText(R.id.tv_today_data_description, R.string.blood_oxygen_normal_range);
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.percent_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_blood_oxygen));
        this.boDisplayView.setBottomText(this.context.getResources().getStringArray(R.array.bo_array));
        this.boDisplayView.setBottomTextColor(R.color.color_blood_oxygen);
        this.boDisplayView.setProgressDrawable(R.drawable.progressbar_bo_blue);
    }

    private void setBloodOxygen(BloodOxygen bloodOxygen) {
        int intValue;
        String valueOf;
        Date date;
        if (bloodOxygen == null) {
            date = new Date();
            valueOf = this.context.getString(R.string.data_blank);
            intValue = -1;
        } else {
            Date date2 = bloodOxygen.getDate();
            intValue = bloodOxygen.getBloodOxygen().intValue();
            valueOf = String.valueOf(intValue);
            date = date2;
        }
        setSyncTime(date);
        this.boDisplayView.setBo(intValue);
        this.holder.setText(R.id.tv_date_first_part, valueOf);
    }

    private void setLastBloodOxygen() {
        setBloodOxygen(new BloodOxygenDaoProxy().getLastTimeBloodOxygen());
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setLastBloodOxygen();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBloodOxygenChangeEvent(BandBloodOxygenChangeEvent bandBloodOxygenChangeEvent) {
        BloodOxygen bloodOxygen = bandBloodOxygenChangeEvent.getBloodOxygen();
        if (bloodOxygen != null) {
            setBloodOxygen(bloodOxygen);
        } else {
            setLastBloodOxygen();
        }
    }
}
