package com.crrepa.band.my.device.pillreminder;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.pillreminder.model.BandPillReminderChangeEvent;
import com.crrepa.band.my.model.band.provider.BandPillReminderProvider;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.proxy.PillReminderDaoProxy;
import com.crrepa.ble.conn.bean.CRPPillReminderInfo;
import com.crrepa.ble.conn.callback.CRPPillReminderCallback;
import io.reactivex.Observable;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class d implements CRPPillReminderCallback {
    private boolean received = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(PillReminder pillReminder) {
            com.orhanobut.logger.f.d("onPillReminder: " + pillReminder.getName());
            i4.getInstance().sendPillReminder(k1.b.toCRPPillReminderInfo(pillReminder));
        }
    }

    class b implements Function {
        final /* synthetic */ List val$reminderList;

        b(List list) {
            this.val$reminderList = list;
        }

        @Override // io.reactivex.functions.Function
        public PillReminder apply(@NonNull Long l8) {
            return (PillReminder) this.val$reminderList.get(l8.intValue());
        }
    }

    @Override // com.crrepa.ble.conn.callback.CRPPillReminderCallback
    public void onPillReminder(int i8, List<CRPPillReminderInfo> list) {
        if (!BandPillReminderProvider.hasPillReminder()) {
            BandPillReminderProvider.savePillReminderCount(i8);
            org.greenrobot.eventbus.c.getDefault().post(new BandPillReminderChangeEvent(true));
        }
        com.orhanobut.logger.f.d("onPillReminder received: " + this.received);
        if (this.received) {
            return;
        }
        this.received = true;
        i4.getInstance().clearPillReminder();
        List<PillReminder> enableList = new PillReminderDaoProxy().getEnableList();
        if (enableList == null || enableList.isEmpty()) {
            return;
        }
        Observable.intervalRange(0L, enableList.size(), 3L, 3L, TimeUnit.SECONDS).map(new b(enableList)).subscribe(new a());
    }
}
