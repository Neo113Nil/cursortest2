package com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model;

import android.accounts.NetworkErrorException;
import android.util.Log;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchface.model.BaseResponseBean;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.crrepa.band.my.model.db.proxy.SupportWatchFaceDaoProxy;
import com.crrepa.band.my.profile.b;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ClockPointerModel {
    private static final int CALORIES = 5;
    private static final int DATE = 1;
    private static final int DISTANCE = 6;
    private static final int HEART_RATE = 3;
    private static final int NONE = 0;
    private static final int SLEEP = 2;
    private static final int STEPS = 4;
    public static final int TIME = 7;
    private String tpls;

    public static int gePointerLabelResources(int i8) {
        switch (i8) {
            case 1:
                return R.drawable.watch_face_new_label_date;
            case 2:
                return R.drawable.watch_face_new_label_sleep;
            case 3:
                return R.drawable.watch_face_new_label_hr;
            case 4:
                return R.drawable.watch_face_new_label_steps;
            case 5:
                return R.drawable.watch_face_new_label_calorie;
            case 6:
                return R.drawable.watch_face_new_label_distance;
            case 7:
                return R.drawable.watch_face_new_label_time;
            default:
                return -1;
        }
    }

    private String getWatchFaceTpls() {
        if (x0.isNotEmpty(this.tpls)) {
            return this.tpls;
        }
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        SupportWatchFace supportWatchFace = new SupportWatchFaceDaoProxy().get(name);
        Log.d("ClockPointerModel", name);
        if (supportWatchFace == null) {
            Log.d("ClockPointerModel", "tpls is null");
            return null;
        }
        String tpls = supportWatchFace.getTpls();
        this.tpls = tpls;
        return tpls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List lambda$requestClockPointerList$0(BaseResponseBean baseResponseBean) {
        if (baseResponseBean == null || baseResponseBean.code != 0) {
            throw new NetworkErrorException("net error");
        }
        ClockPointerResp clockPointerResp = (ClockPointerResp) baseResponseBean.data;
        return (clockPointerResp == null || x0.isEmpty(clockPointerResp.faces)) ? new ArrayList() : ((ClockPointerResp) baseResponseBean.data).faces;
    }

    public Observable<List<ClockPointerBean>> requestClockPointerList() {
        String watchFaceTpls = getWatchFaceTpls();
        String firmwareVersion = BandInfoManager.getFirmwareVersion();
        com.crrepa.band.my.profile.a apiStores = b.getInstance().getApiStores();
        Log.d("requestClockPointerList", "4,tpls:" + watchFaceTpls + ",fv:" + firmwareVersion);
        return apiStores.requestClockPointerList(watchFaceTpls, firmwareVersion, "1", "50").map(new Function() { // from class: com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                List lambda$requestClockPointerList$0;
                lambda$requestClockPointerList$0 = ClockPointerModel.lambda$requestClockPointerList$0((BaseResponseBean) obj);
                return lambda$requestClockPointerList$0;
            }
        });
    }
}
