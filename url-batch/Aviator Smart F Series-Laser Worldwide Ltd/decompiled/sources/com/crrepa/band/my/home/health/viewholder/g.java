package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bodytemperature.model.BandOnceTempChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.TemperatureUnitChangeEvent;
import com.crrepa.band.my.health.widgets.segmentedbar.SegmentedBarView;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.proxy.OnceTempDaoProxy;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class g extends b {
    private OnceTempDaoProxy onceTempDaoProxy;
    private m3.i segmentBarProxy;
    private SegmentedBarView segmentedBarView;

    public g(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.onceTempDaoProxy = new OnceTempDaoProxy();
        this.segmentBarProxy = new m3.i();
        initView();
    }

    private void createTempSegmentBar() {
        this.segmentBarProxy.createBarView(this.segmentedBarView, l2.b.getTempSegmentValues(), l2.b.getTempSegmentColors(this.context));
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, R.string.temperature);
        this.holder.setText(R.id.tv_today_data_description, R.string.lower_case_temperature);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_temperature));
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.segmentedBarView = (SegmentedBarView) this.holder.getView(R.id.temp_segmentedbar);
        createTempSegmentBar();
    }

    private void setLastOnceTemp() {
        setOnceTemp(this.onceTempDaoProxy.getLastOnceTemp());
    }

    private void setOnceTemp(OnceTemp onceTemp) {
        float f8;
        Date date = new Date();
        if (onceTemp != null) {
            date = onceTemp.getDate();
            f8 = onceTemp.getTemp().floatValue();
        } else {
            f8 = 0.0f;
        }
        setSyncTime(date);
        boolean isFahrenheit = BandTempSystemProvider.isFahrenheit();
        this.holder.setText(R.id.tv_date_first_part_unit, isFahrenheit ? R.string.fahrenheit_unit : R.string.celsius_unit);
        String string = this.context.getString(R.string.data_blank);
        if (0.0f < f8) {
            if (isFahrenheit) {
                f8 = l2.c.celsius2Fahrenheit(f8);
            }
            string = com.moyoung.dafit.module.common.utils.n.formatTemp(f8);
            this.segmentBarProxy.setSlider(this.segmentedBarView, f8);
        }
        this.holder.setText(R.id.tv_date_first_part, string);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        setLastOnceTemp();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onOnceTempChangeEvent(BandOnceTempChangeEvent bandOnceTempChangeEvent) {
        com.orhanobut.logger.f.d("onOnceTempChangeEvent temp: " + bandOnceTempChangeEvent.getOnceTemp().getTemp());
        setOnceTemp(bandOnceTempChangeEvent.getOnceTemp());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onTemperatureUnitChangeEvent(TemperatureUnitChangeEvent temperatureUnitChangeEvent) {
        setLastOnceTemp();
        createTempSegmentBar();
    }
}
