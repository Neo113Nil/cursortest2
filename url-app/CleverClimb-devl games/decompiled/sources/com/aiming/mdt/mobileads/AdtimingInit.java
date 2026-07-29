package com.aiming.mdt.mobileads;

import android.app.Activity;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.mediation.InitListener;
import com.aiming.mdt.mediation.InitModel;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingInit extends InitModel {
    @Override // com.aiming.mdt.mediation.InitModel
    public void init(Activity activity, Map<String, Object> map, InitListener initListener) {
        super.init(activity, map, initListener);
        C0226.m820(activity);
        initListener.onSuccess(mediation());
    }

    @Override // com.aiming.mdt.mediation.InitModel
    public String mediation() {
        return "0";
    }
}
