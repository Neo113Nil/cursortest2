package com.crrepa.band.my.device.cricket.model;

import a1.e;
import com.crrepa.band.my.device.cricket.model.CricketGameUpdater;
import com.crrepa.band.my.device.cricket.net.b;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketGameUpdater {
    private static final long DEFAULT_UPDATE_INTERVAL = 600000;

    private boolean isUpdate() {
        return Math.abs(System.currentTimeMillis() - g.getInstance().getLong(BaseParamNames.CRICKET_GAME_UPDATE_TIME, 0L)) < DEFAULT_UPDATE_INTERVAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$updateCricketSchedule$0(List list) {
        f.d("cricketGameList: " + list.size());
        e.saveCricketGame(list);
        saveUpdateTime();
        return 0;
    }

    private void saveUpdateTime() {
        g.getInstance().putLong(BaseParamNames.CRICKET_GAME_UPDATE_TIME, System.currentTimeMillis());
    }

    public Observable<Integer> updateCricketSchedule() {
        return isUpdate() ? Observable.just(0) : b.getInstance().getApiStores().getCricketSchedule().subscribeOn(Schedulers.io()).map(new Function() { // from class: z0.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Integer lambda$updateCricketSchedule$0;
                lambda$updateCricketSchedule$0 = CricketGameUpdater.this.lambda$updateCricketSchedule$0((List) obj);
                return lambda$updateCricketSchedule$0;
            }
        });
    }
}
