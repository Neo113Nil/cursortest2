package com.crrepa.band.my.device.calendar.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.crrepa.ble.conn.bean.CRPCalendarEventInfo;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: com.crrepa.band.my.device.calendar.utils.a$a, reason: collision with other inner class name */
    class C0171a implements Consumer {
        C0171a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(ArrayList<CRPCalendarEventInfo> arrayList) {
            Iterator<CRPCalendarEventInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                CRPCalendarEventInfo next = it.next();
                f.d("sendCalendarEvent: " + next.toString());
                i4.getInstance().sendCalendarEvent(next);
            }
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class c implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;

        c(Context context) {
            this.val$context = context;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<ArrayList<CRPCalendarEventInfo>> observableEmitter) {
            int maxEventCount = BandCalendarEventProvider.getMaxEventCount();
            f.d("eventCount: " + maxEventCount);
            ArrayList<CRPCalendarEventInfo> eventList = com.crrepa.band.my.device.calendar.utils.b.getEventList(this.val$context, maxEventCount);
            if (eventList == null || eventList.isEmpty()) {
                observableEmitter.onComplete();
            } else {
                observableEmitter.onNext(eventList);
            }
        }
    }

    private static class d {
        private static a INSTANCE = new a(null);

        private d() {
        }
    }

    /* synthetic */ a(C0171a c0171a) {
        this();
    }

    public static a getInstance() {
        return d.INSTANCE;
    }

    public void clearCalendarEvent() {
        i4.getInstance().clearCalendarEvent();
    }

    @SuppressLint({"CheckResult"})
    public void sendAllCalendarEvent(Context context) {
        clearCalendarEvent();
        Observable.create(new c(context)).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new C0171a(), new b());
    }

    private a() {
    }
}
