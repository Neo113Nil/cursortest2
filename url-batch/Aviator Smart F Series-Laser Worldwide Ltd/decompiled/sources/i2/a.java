package i2;

import com.crrepa.band.my.health.bloodpressure.model.BandBloodPressureChangeEvent;
import com.crrepa.band.my.model.db.BloodPressure;
import com.crrepa.band.my.model.db.proxy.BloodPressureDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private k2.a view;

    public a() {
        c.getDefault().register(this);
    }

    private void showBloodPressureDetail(BloodPressure bloodPressure) {
        if (bloodPressure == null) {
            return;
        }
        Date date = bloodPressure.getDate();
        this.view.renderStatisticsDate(date);
        this.view.renderBloodPressure(bloodPressure.getSbp().intValue(), bloodPressure.getDbp().intValue());
        showLast7TimesBloodPressure(new BloodPressureDaoProxy().getLastTimesBloodPressure(date, 7));
    }

    private void showLast7TimesBloodPressure(List<BloodPressure> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        float[] fArr = new float[7];
        float[] fArr2 = new float[7];
        Date[] dateArr = new Date[7];
        for (int i8 = 0; i8 < list.size(); i8++) {
            BloodPressure bloodPressure = list.get(i8);
            int i9 = 6 - i8;
            fArr[i9] = bloodPressure.getDbp().intValue();
            fArr2[i9] = bloodPressure.getSbp().intValue();
            dateArr[i9] = bloodPressure.getDate();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < 7; i10++) {
            float f8 = fArr2[i10];
            float f9 = fArr[i10];
            arrayList2.add(Float.valueOf(f9));
            arrayList.add(Float.valueOf(f8 - f9));
        }
        this.view.renderLast7TimesBloodPressure(arrayList, arrayList2, dateArr);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        c.getDefault().unregister(this);
    }

    public void getBloodPressure(long j8) {
        BloodPressureDaoProxy bloodPressureDaoProxy = new BloodPressureDaoProxy();
        showBloodPressureDetail(j8 == -1 ? bloodPressureDaoProxy.getLastTimeBloodPressure() : bloodPressureDaoProxy.getBloodPressure(j8));
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBloodPressureChangeEvent(BandBloodPressureChangeEvent bandBloodPressureChangeEvent) {
        this.view.measureComplete();
        showBloodPressureDetail(bandBloodPressureChangeEvent.getBloodPressure());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(k2.a aVar) {
        this.view = aVar;
    }
}
