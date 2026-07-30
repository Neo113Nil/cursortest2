package com.crrepa.band.my.device.cricket.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.cricket.fragment.CWCFragment;
import com.crrepa.band.my.device.cricket.fragment.CricketSubscribedGameFragment;
import com.crrepa.band.my.device.cricket.model.CricketGameUpdater;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class j {
    private b1.f view;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateCricketSchedule$0(Integer num) {
        org.greenrobot.eventbus.c.getDefault().post(new y0.a());
    }

    public void initTabLayout(Context context) {
        this.view.renderTabLayout(new String[]{context.getString(R.string.cricket_subscriptions), context.getString(R.string.cricket_cwc)});
    }

    public void loadViewPagerFragment() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CricketSubscribedGameFragment.getInstance());
        arrayList.add(CWCFragment.getInstance());
        this.view.renderViewPager(arrayList);
    }

    public void setView(b1.f fVar) {
        this.view = fVar;
    }

    @SuppressLint({"CheckResult"})
    public void updateCricketSchedule() {
        new CricketGameUpdater().updateCricketSchedule().observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.presenter.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                j.lambda$updateCricketSchedule$0((Integer) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.device.cricket.presenter.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }
}
