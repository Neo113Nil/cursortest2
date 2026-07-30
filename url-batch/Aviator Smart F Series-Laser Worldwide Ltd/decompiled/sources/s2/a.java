package s2;

import com.crrepa.band.my.health.hrv.model.BandHrvChangeEvent;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.proxy.HrvDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import m3.g;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private HrvDaoProxy hrvDaoProxy = new HrvDaoProxy();
    private u2.a view;

    public a() {
        c.getDefault().register(this);
    }

    private void showHistoryHrv(Date date) {
        List<Hrv> historyList = this.hrvDaoProxy.getHistoryList(date, 7);
        if (historyList == null || historyList.isEmpty()) {
            return;
        }
        float[] fArr = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < historyList.size(); i8++) {
            int i9 = 6 - i8;
            Hrv hrv = historyList.get(i8);
            fArr[i9] = hrv.getHrv().intValue();
            dateArr[i9] = hrv.getDate();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            float f8 = fArr[i11];
            if (i10 < f8) {
                i10 = (int) f8;
            }
            arrayList.add(Float.valueOf(f8));
        }
        this.view.renderHistoryHrv(g.getMaxHrv(i10), arrayList, dateArr);
    }

    private void showHrv(Hrv hrv) {
        this.view.renderHrv(hrv);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        c.getDefault().unregister(this);
        this.view = null;
    }

    public void getHrvDetail(long j8) {
        Hrv lastHrv = j8 == -1 ? this.hrvDaoProxy.getLastHrv() : this.hrvDaoProxy.get(j8);
        showHrv(lastHrv);
        if (lastHrv != null) {
            showHistoryHrv(lastHrv.getDate());
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandHrvChangeEvent(BandHrvChangeEvent bandHrvChangeEvent) {
        this.view.measureComplete();
        Hrv hrv = bandHrvChangeEvent.getHrv();
        if (hrv != null) {
            showHrv(hrv);
            showHistoryHrv(hrv.getDate());
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(u2.a aVar) {
        this.view = aVar;
    }
}
