package d2;

import android.util.Log;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.device.worldclock.model.WorldClockConvert;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.db.proxy.WorldClockDaoProxy;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.baseui.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class e implements f {
    private List<WorldClock> clockList;
    private Disposable timerSubscribe;
    private f2.b view;
    private final WorldClockDaoProxy daoProxy = new WorldClockDaoProxy();
    private final i4 bandSettingManager = i4.getInstance();

    public e() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void disposeTimeScribe() {
        Disposable disposable = this.timerSubscribe;
        if (disposable != null) {
            disposable.dispose();
            this.timerSubscribe = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimer$0(Long l8) {
        updateWorldClockTime();
    }

    private void updateWorldClockTime() {
        if (Calendar.getInstance().get(13) == 0) {
            this.view.renderClockList(this.clockList);
        }
    }

    public void addClock(WorldClock worldClock) {
        com.orhanobut.logger.f.d("addClock ：" + worldClock);
        this.clockList.add(worldClock);
        startTimer();
        CRPWorldClockInfo convertCRPWorldClock = WorldClockConvert.convertCRPWorldClock(worldClock);
        saveClockInfo(worldClock);
        sendWorldClock(convertCRPWorldClock);
    }

    public void deleteClock(WorldClock worldClock) {
        com.orhanobut.logger.f.d("deleteClock ：" + worldClock);
        this.bandSettingManager.deleteWorldClock(worldClock.getClockId().byteValue());
        this.daoProxy.delete(worldClock.getClockId().byteValue());
        this.clockList.remove(worldClock);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        disposeTimeScribe();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    public void getSavedClockList() {
        if (this.view == null) {
            return;
        }
        if (!com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            this.view.renderBandDisconnected();
            return;
        }
        if (this.clockList == null) {
            this.clockList = this.daoProxy.getAll();
            for (int i8 = 0; i8 < this.clockList.size(); i8++) {
                sendWorldClock(WorldClockConvert.convertCRPWorldClock(this.clockList.get(i8)));
            }
        }
        startTimer();
        this.view.renderClockList(this.clockList);
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        if (aVar.getState() != 2) {
            this.view.renderBandDisconnected();
        } else {
            this.view.renderBandConnected();
            getSavedClockList();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBluetoothStateChangeEvent(BluetoothStateChangeEvent bluetoothStateChangeEvent) {
        if (bluetoothStateChangeEvent.isEnable()) {
            return;
        }
        this.view.renderBandDisconnected();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
        disposeTimeScribe();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        getSavedClockList();
    }

    public void saveClockInfo(WorldClock worldClock) {
        this.daoProxy.insert(worldClock);
        Log.e("WorldClockLog", new Gson().toJson(worldClock));
    }

    public void sendWorldClock(CRPWorldClockInfo cRPWorldClockInfo) {
        com.orhanobut.logger.f.d("sendWorldClock ：" + cRPWorldClockInfo.getCity());
        this.bandSettingManager.sendWorldClock(cRPWorldClockInfo);
    }

    public void setView(f2.b bVar) {
        this.view = bVar;
    }

    public void startTimer() {
        List<WorldClock> list;
        if (this.timerSubscribe != null || (list = this.clockList) == null || list.isEmpty()) {
            return;
        }
        this.timerSubscribe = Observable.interval(0L, 1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: d2.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                e.this.lambda$startTimer$0((Long) obj);
            }
        });
    }

    public void updateClockList(List<WorldClock> list) {
        this.daoProxy.deleteAll();
        this.clockList.clear();
        this.clockList.addAll(list);
        byte[] bArr = new byte[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            WorldClock worldClock = list.get(i8);
            bArr[i8] = worldClock.getClockId().byteValue();
            worldClock.setId(Long.valueOf(i8));
            this.daoProxy.insert(worldClock);
        }
        i4.getInstance().resetWorldClockList(bArr);
    }
}
