package com.crrepa.band.my.device.cricket.presenter;

import android.annotation.SuppressLint;
import com.crrepa.band.my.device.cricket.model.CricketTeamPointsEntity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    private b1.a view;

    class a implements Function {

        /* renamed from: com.crrepa.band.my.device.cricket.presenter.c$a$a, reason: collision with other inner class name */
        class C0176a implements Comparator {
            C0176a() {
            }

            @Override // java.util.Comparator
            public int compare(CricketTeamPointsEntity cricketTeamPointsEntity, CricketTeamPointsEntity cricketTeamPointsEntity2) {
                int parseInt = Integer.parseInt(cricketTeamPointsEntity.getPoints());
                int parseInt2 = Integer.parseInt(cricketTeamPointsEntity2.getPoints());
                if (parseInt > parseInt2) {
                    return -1;
                }
                if (parseInt < parseInt2) {
                    return 1;
                }
                int parseInt3 = Integer.parseInt(cricketTeamPointsEntity.getPlayed());
                int parseInt4 = Integer.parseInt(cricketTeamPointsEntity2.getPlayed());
                if (parseInt3 < parseInt4) {
                    return -1;
                }
                return parseInt3 > parseInt4 ? 1 : 0;
            }
        }

        a() {
        }

        @Override // io.reactivex.functions.Function
        public List<CricketTeamPointsEntity> apply(List<CricketTeamPointsEntity> list) {
            if (list != null && !list.isEmpty()) {
                Collections.sort(list, new C0176a());
            }
            return list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRanking$0(List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.view.renderRanking(list);
    }

    @SuppressLint({"CheckResult"})
    public void getRanking() {
        com.crrepa.band.my.device.cricket.net.b.getInstance().getApiStores().getCricketRankingList().map(new a()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.presenter.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$getRanking$0((List) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    public void setView(b1.a aVar) {
        this.view = aVar;
    }
}
