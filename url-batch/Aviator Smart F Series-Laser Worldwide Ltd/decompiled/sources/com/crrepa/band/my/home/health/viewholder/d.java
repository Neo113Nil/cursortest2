package com.crrepa.band.my.home.health.viewholder;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.ecg.view.EcgView;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Date;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class d extends com.crrepa.band.my.home.health.viewholder.b {
    private EcgView ecgView;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(int[] iArr) {
            d.this.showEcg(iArr);
        }
    }

    class b implements Function {
        b() {
        }

        @Override // io.reactivex.functions.Function
        public int[] apply(String str) {
            return new n2.a().readEcgData(str);
        }
    }

    public d(Context context, BaseViewHolder baseViewHolder) {
        super(context, baseViewHolder);
        this.ecgView = (EcgView) this.holder.getView(R.id.ecgview);
        initView();
    }

    private void getMeasureEcgData(String str) {
        Observable.just(str).map(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    private void initView() {
        this.holder.setText(R.id.tv_data_type, R.string.ecg);
        this.holder.setText(R.id.tv_today_data_description, R.string.average_hr);
        this.holder.setGone(R.id.tv_date_second_part, true);
        this.holder.setGone(R.id.tv_date_second_part_unit, true);
        this.holder.setGone(R.id.tv_date_first_part_unit, true);
        this.holder.setTextColor(R.id.tv_date_first_part, ContextCompat.getColor(this.context, R.color.color_ecg));
    }

    private void setEcgViewPerGridCount(int i8) {
        this.ecgView.setPerGridCount(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEcg(int[] iArr) {
        this.ecgView.setData(iArr);
    }

    private void updateEcg() {
        Date date;
        Ecg lastTimeEcg = new EcgDaoProxy().getLastTimeEcg();
        if (lastTimeEcg == null) {
            date = new Date();
        } else {
            Date date2 = lastTimeEcg.getDate();
            r1 = lastTimeEcg.getAverageHeartRate() != null ? lastTimeEcg.getAverageHeartRate().intValue() : 0;
            setEcgViewPerGridCount(lastTimeEcg.getPerGridNumber().intValue());
            this.ecgView.setPerGridUvValue(com.crrepa.band.my.health.ecg.view.b.getPerGridUvValue(lastTimeEcg.getPerGridUvValue()));
            getMeasureEcgData(lastTimeEcg.getPath());
            date = date2;
        }
        setSyncTime(date);
        String string = this.context.getString(R.string.data_blank);
        if (r1 > 0) {
            string = String.valueOf(r1);
        }
        this.holder.setText(R.id.tv_date_first_part, string);
    }

    @Override // com.crrepa.band.my.home.health.viewholder.b, com.crrepa.band.my.home.health.b
    public void bindViewHolder() {
        updateEcg();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEcgMeasureCompleteEvent(com.crrepa.band.my.health.ecg.c cVar) {
        updateEcg();
    }
}
