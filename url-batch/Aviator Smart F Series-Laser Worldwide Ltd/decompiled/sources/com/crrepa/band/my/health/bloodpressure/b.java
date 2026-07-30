package com.crrepa.band.my.health.bloodpressure;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bloodpressure.model.BandBloodPressureChangeEvent;
import com.crrepa.band.my.health.widgets.BloodPressureHorizontalDisplayView;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.proxy.BloodPressureDaoProxy;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class b extends com.crrepa.band.my.home.health.viewholder.b {
    private BloodPressureHorizontalDisplayView bloodPressureDisplayView;

    public b(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.bloodPressureDisplayView = (BloodPressureHorizontalDisplayView) baseViewHolder.getView(R.id.bp_horizontal_display_view);
        this.holder.setText(R.id.tv_data_type, R.string.blood_pressure_shorthand);
        this.holder.setText(R.id.tv_today_data_description, R.string.blood_pressure_data_format);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_blood_pressure));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.blood_pressure_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
    }

    private void setBloodPressure(BloodPressure bloodPressure) {
        Date date;
        if (bloodPressure == null) {
            date = new Date();
        } else {
            Date date2 = bloodPressure.getDate();
            int intValue = bloodPressure.getSbp().intValue();
            int intValue2 = bloodPressure.getDbp().intValue();
            this.bloodPressureDisplayView.setBp(intValue, intValue2);
            this.holder.setText(R.id.tv_date_first_part, String.format(this.context.getString(R.string.blood_pressure_data), Integer.valueOf(intValue), Integer.valueOf(intValue2)));
            date = date2;
        }
        setSyncTime(date);
    }

    private void setLastBloodPressure() {
        setBloodPressure(new BloodPressureDaoProxy().getLastTimeBloodPressure());
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setLastBloodPressure();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBloodPressureChangeEvent(BandBloodPressureChangeEvent bandBloodPressureChangeEvent) {
        BloodPressure bloodPressure = bandBloodPressureChangeEvent.getBloodPressure();
        if (bloodPressure != null) {
            setBloodPressure(bloodPressure);
        } else {
            setLastBloodPressure();
        }
    }
}
