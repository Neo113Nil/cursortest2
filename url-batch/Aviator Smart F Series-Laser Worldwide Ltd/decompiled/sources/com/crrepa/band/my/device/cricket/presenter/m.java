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
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class m {
    private b1.e view;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSubscribedGameList$0(ObservableEmitter observableEmitter) {
        List<CricketGame> subscribedGameList = new CricketGameProxy().getSubscribedGameList();
        if (subscribedGameList == null || subscribedGameList.size() <= 0) {
            observableEmitter.onNext(new ArrayList());
        } else {
            observableEmitter.onNext(subscribedGameList);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSubscribedGameList$1(List list) {
        com.orhanobut.logger.f.d("list: " + list.size());
        this.view.renderSubscribedGameList(a1.e.convertGameListWithDatabase(list));
    }

    @SuppressLint({"CheckResult"})
    public void getSubscribedGameList() {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.cricket.presenter.k
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                m.lambda$getSubscribedGameList$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.presenter.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                m.this.lambda$getSubscribedGameList$1((List) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    public void setView(b1.e eVar) {
        this.view = eVar;
    }
}
