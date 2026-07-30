package com.crrepa.band.my.device.cricket.presenter;

import android.annotation.SuppressLint;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.proxy.CricketGameProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private CricketGameProxy gameProxy = new CricketGameProxy();
    private b1.d view;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCricketSchedule$0(ObservableEmitter observableEmitter) {
        List<CricketGame> all = this.gameProxy.getAll();
        if (all == null || all.size() <= 0) {
            observableEmitter.onComplete();
        } else {
            observableEmitter.onNext(all);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCricketSchedule$1(List list) {
        this.view.renderCricketSchedule(a1.e.convertGameListWithDatabase(list));
    }

    @SuppressLint({"CheckResult"})
    public void getCricketSchedule() {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.cricket.presenter.e
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                g.this.lambda$getCricketSchedule$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.presenter.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                g.this.lambda$getCricketSchedule$1((List) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    public void setView(b1.d dVar) {
        this.view = dVar;
    }
}
