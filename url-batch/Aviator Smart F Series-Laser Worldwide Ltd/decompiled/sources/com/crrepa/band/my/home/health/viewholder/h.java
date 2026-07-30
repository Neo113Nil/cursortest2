package com.crrepa.band.my.home.health.viewholder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class h extends b implements x2.c {
    private final int DELAY_TIME;
    List<View> barViewList;
    com.crrepa.band.my.health.physiologicalcycle.presenter.j holderPresenter;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            h.this.getPhysiological();
        }
    }

    public h(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.DELAY_TIME = 200;
        this.holderPresenter = new com.crrepa.band.my.health.physiologicalcycle.presenter.j();
        this.barViewList = new ArrayList();
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getPhysiological() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.context.getResources().getInteger(R.integer.calendar_min_year));
        Calendar calendar2 = new Calendar();
        calendar2.setYear(this.context.getResources().getInteger(R.integer.calendar_max_year));
        this.holderPresenter.getPhysiologcalPeriod(this.context, calendar, calendar2);
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, R.string.physiological_period_title);
        this.barViewList.add(this.holder.getView(R.id.physiological_1));
        this.barViewList.add(this.holder.getView(R.id.physiological_2));
        this.barViewList.add(this.holder.getView(R.id.physiological_3));
        this.barViewList.add(this.holder.getView(R.id.physiological_4));
        this.barViewList.add(this.holder.getView(R.id.physiological_5));
        this.barViewList.add(this.holder.getView(R.id.physiological_6));
        this.barViewList.add(this.holder.getView(R.id.physiological_7));
        this.barViewList.add(this.holder.getView(R.id.physiological_8));
        this.barViewList.add(this.holder.getView(R.id.physiological_9));
    }

    private void showBottomDate(Date date) {
        Date dateOfOffsetDay = com.moyoung.dafit.module.common.utils.m.getDateOfOffsetDay(date, -4);
        Date dateOfOffsetDay2 = com.moyoung.dafit.module.common.utils.m.getDateOfOffsetDay(date, 4);
        String string = this.context.getString(R.string.month_day_format);
        String format = com.moyoung.dafit.module.common.utils.m.format(dateOfOffsetDay, string);
        String format2 = com.moyoung.dafit.module.common.utils.m.format(dateOfOffsetDay2, string);
        this.holder.setText(R.id.tv_start_date, format);
        this.holder.setText(R.id.tv_end_date, format2);
    }

    private void showPeriod() {
        updatePeriod();
    }

    private void updatePeriod() {
        setSyncTime(new Date());
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        showPeriod();
        showBottomDate(new Date());
        this.holderPresenter.setPhysiologicalHolderView(this);
        getPhysiological();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    @SuppressLint({"CheckResult"})
    public void onToCalender(v2.c cVar) {
        Observable.timer(200L, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    @Override // x2.c
    public void renderBarList(List<Map.Entry<String, Calendar>> list) {
        if (list.size() < 1) {
            return;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.barViewList.get(i8).setBackgroundResource(w2.a.getImageId(this.context, list.get(i8).getValue()));
        }
    }

    @Override // x2.c
    public void renderCountDayText(String str) {
        this.holder.setText(R.id.tv_today_data_description, str);
    }

    @Override // x2.c
    public void renderDescription(String str) {
        TextView textView = (TextView) this.holder.getView(R.id.tv_physiological_description);
        int color = ContextCompat.getColor(this.context, R.color.color_physiological);
        int color2 = ContextCompat.getColor(this.context, R.color.black);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        textView.setTextColor(color2);
        textView.setTextSize(14.0f);
        textView.setText(w2.a.getSpecifyString(color, str), TextView.BufferType.SPANNABLE);
    }
}
