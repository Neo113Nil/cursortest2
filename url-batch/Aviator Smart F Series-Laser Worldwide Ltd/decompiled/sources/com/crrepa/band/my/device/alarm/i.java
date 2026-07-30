package com.crrepa.band.my.device.alarm;

import android.annotation.SuppressLint;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.band.my.model.db.proxy.BandAlarmDaoProxy;
import com.crrepa.ble.conn.bean.CRPAlarmInfo;
import com.crrepa.ble.conn.callback.CRPAlarmCallback;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements com.moyoung.dafit.module.common.baseui.f {
    private static final int DEFAULT_ALARM_COUNT = 3;
    private static final int DEFAULT_NEW_ALARM_COUNT = 8;
    private j view;
    private BandAlarmDaoProxy alarmDaoProxy = new BandAlarmDaoProxy();
    private b alarmCallback = new b(this);
    private int maxAlarmCount = 3;

    class a implements Consumer {
        final /* synthetic */ boolean val$addable;
        final /* synthetic */ List val$alarmList;

        a(boolean z7, List list) {
            this.val$addable = z7;
            this.val$alarmList = list;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(List<Alarm> list) {
            i.this.view.renderAddAlarmVisible(this.val$addable && this.val$alarmList.size() < i.this.maxAlarmCount);
            i.this.view.renderAlarmList(list, this.val$addable);
            i.this.renderAlarmHint();
        }
    }

    static class b implements CRPAlarmCallback {
        private WeakReference<i> weakReference;

        public b(i iVar) {
            this.weakReference = new WeakReference<>(iVar);
        }

        private void parseAlarmList(List<CRPAlarmInfo> list, boolean z7, int i8) {
            com.orhanobut.logger.f.d("alarm list: " + list);
            i iVar = this.weakReference.get();
            if (iVar == null) {
                return;
            }
            iVar.maxAlarmCount = i8;
            iVar.deleteAllAlarm();
            ArrayList arrayList = new ArrayList();
            if (list != null && !list.isEmpty()) {
                Iterator<CRPAlarmInfo> it = list.iterator();
                while (it.hasNext()) {
                    Alarm convertAlarm = v0.a.convertAlarm(it.next());
                    arrayList.add(convertAlarm);
                    iVar.saveAlarm(convertAlarm);
                }
            }
            iVar.showAlarmList(arrayList, z7);
        }

        @Override // com.crrepa.ble.conn.callback.CRPAlarmCallback
        public void onAlarmList(List<CRPAlarmInfo> list) {
            parseAlarmList(list, false, 3);
        }

        @Override // com.crrepa.ble.conn.callback.CRPAlarmCallback
        public void onNewAlarmList(List<CRPAlarmInfo> list) {
            parseAlarmList(list, true, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteAllAlarm() {
        BandAlarmDaoProxy bandAlarmDaoProxy = this.alarmDaoProxy;
        if (bandAlarmDaoProxy != null) {
            bandAlarmDaoProxy.deleteAll();
        }
    }

    private boolean getBandAlarmList() {
        return i4.getInstance().queryAllAlarm(this.alarmCallback) && i4.getInstance().queryAllNewAlarm(this.alarmCallback);
    }

    private void getLocalAlarmList() {
        showAlarmList(this.alarmDaoProxy.getAll(), this.maxAlarmCount != 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderAlarmHint() {
        if (this.view == null || !isNewAlarm()) {
            return;
        }
        this.view.renderAlarmHint(this.maxAlarmCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void showAlarmList(List<Alarm> list, boolean z7) {
        if (this.view != null) {
            Observable.just(list).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(z7, list));
        }
    }

    public void deleteAlarm(Alarm alarm, int i8) {
        if (alarm != null) {
            boolean deleteNewAlarm = i4.getInstance().deleteNewAlarm(alarm.getAlarm_id());
            if (deleteNewAlarm) {
                this.alarmDaoProxy.delete(alarm);
            }
            this.view.renderDeleteAlarm(i8, deleteNewAlarm);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    public void getAllAlarm() {
        if (getBandAlarmList()) {
            return;
        }
        getLocalAlarmList();
    }

    public int getMaxAlarmCount() {
        return this.maxAlarmCount;
    }

    public boolean isNewAlarm() {
        return this.maxAlarmCount == 8;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveAlarm(Alarm alarm) {
        BandAlarmDaoProxy bandAlarmDaoProxy = this.alarmDaoProxy;
        if (bandAlarmDaoProxy != null) {
            bandAlarmDaoProxy.save(alarm);
        }
    }

    public void setView(j jVar) {
        this.view = jVar;
    }

    public void updateAlarnList() {
        if (isNewAlarm()) {
            getAllAlarm();
        } else {
            getLocalAlarmList();
        }
    }
}
