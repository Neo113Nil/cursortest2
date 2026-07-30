package e3;

import android.annotation.SuppressLint;
import com.crrepa.band.my.health.water.model.WaterCalendarModel;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.WaterDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class c implements f {
    private g3.a view;
    private final WaterDaoProxy waterDaoProxy = new WaterDaoProxy();
    private final com.crrepa.band.my.health.water.util.a waterManager = com.crrepa.band.my.health.water.util.a.getInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCalendarModelList$0(ObservableEmitter observableEmitter) {
        ArrayList arrayList = new ArrayList();
        List<Water> calendarWaterList = this.waterDaoProxy.getCalendarWaterList();
        List<Date> calendarMonthList = this.waterManager.getCalendarMonthList((calendarWaterList == null || calendarWaterList.size() <= 0) ? new Date() : calendarWaterList.get(0).getDate());
        for (int i8 = 0; i8 < calendarMonthList.size(); i8++) {
            Date date = calendarMonthList.get(i8);
            arrayList.add(new WaterCalendarModel(date, this.waterDaoProxy.getMonthCalendarWaterList(date, calendarWaterList)));
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCalendarModelList$1(List list) {
        this.view.renderWaterCalendar(list);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    @SuppressLint({"CheckResult"})
    public void getCalendarModelList() {
        Observable.create(new ObservableOnSubscribe() { // from class: e3.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                c.this.lambda$getCalendarModelList$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: e3.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$getCalendarModelList$1((List) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(g3.a aVar) {
        this.view = aVar;
    }
}
