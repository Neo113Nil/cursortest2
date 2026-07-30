package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.heartrate.model.BandOnceHeartRateChangeEvent;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import com.crrepa.band.my.model.db.OnceHeartRate;
import com.crrepa.band.my.model.db.proxy.OnceHeartRateDaoProxy;
import com.crrepa.band.my.model.user.provider.UserAgeProvider;
import com.crrepa.band.my.profile.userinfo.model.UserAgeChangeEvent;
import com.crrepa.band.my.profile.userinfo.model.UserGenderChangeEvent;
import com.crrepa.band.my.profile.userinfo.model.UserWeightChangeEvent;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class f extends b {
    private m3.i segmentBarProxy;
    private SegmentedBarView segmentedBarView;

    public f(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.segmentBarProxy = new m3.i();
        this.holder.setText(R.id.tv_data_type, R.string.heart_rate);
        this.holder.setText(R.id.tv_today_data_description, R.string.lower_case_heart_rate);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_heart_rate));
        this.holder.setText(R.id.tv_date_first_part_unit, R.string.heart_rate_unit);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.segmentedBarView = (SegmentedBarView) this.holder.getView(R.id.heart_rate_slider_bar);
        updateHeartRateDegreeValue();
    }

    private void setHeartRateDegreeValue(int i8) {
        this.segmentBarProxy.createBarView(this.segmentedBarView, q2.b.getHeartRateSegmentValues(i8), q2.b.getHeartRateSegmentColors(this.context));
    }

    private void setLastOnceHeartRate() {
        setOnceHeartRate(new OnceHeartRateDaoProxy().getLastOnceHeartRate());
    }

    private void setOnceHeartRate(OnceHeartRate onceHeartRate) {
        int intValue;
        String valueOf;
        Date date;
        if (onceHeartRate == null) {
            date = new Date();
            valueOf = this.context.getString(R.string.data_blank);
            intValue = -1;
        } else {
            Date date2 = onceHeartRate.getDate();
            intValue = onceHeartRate.getHeartRate().intValue();
            valueOf = String.valueOf(intValue);
            date = date2;
        }
        setSyncTime(date);
        this.holder.setText(R.id.tv_date_first_part, valueOf);
        this.segmentBarProxy.setSlider(this.segmentedBarView, intValue);
    }

    private void updateHeartRateDegreeValue() {
        setHeartRateDegreeValue(UserAgeProvider.getUserAge());
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setLastOnceHeartRate();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandOnceHeartRateChanged(BandOnceHeartRateChangeEvent bandOnceHeartRateChangeEvent) {
        OnceHeartRate onceHeartRate = bandOnceHeartRateChangeEvent.getOnceHeartRate();
        if (onceHeartRate != null) {
            setOnceHeartRate(onceHeartRate);
        } else {
            setLastOnceHeartRate();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onUserAgeChangeEvent(UserAgeChangeEvent userAgeChangeEvent) {
        setHeartRateDegreeValue(userAgeChangeEvent.getAge());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onUserAgeChangeEvent(UserGenderChangeEvent userGenderChangeEvent) {
        updateHeartRateDegreeValue();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onUserAgeChangeEvent(UserWeightChangeEvent userWeightChangeEvent) {
        updateHeartRateDegreeValue();
    }
}
