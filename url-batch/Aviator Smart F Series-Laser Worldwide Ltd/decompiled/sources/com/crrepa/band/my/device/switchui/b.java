package com.crrepa.band.my.device.switchui;

import android.text.TextUtils;
import com.crrepa.band.my.model.db.BandFunction;
import com.crrepa.band.my.model.db.proxy.BandFunctionDaoProxy;
import com.crrepa.ble.conn.bean.CRPFunctionInfo;
import com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback;
import com.moyoung.dafit.module.common.utils.s;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class b implements CRPDeviceFunctionCallback {
    private BandFunctionDaoProxy bandFunctionDaoProxy = new BandFunctionDaoProxy();

    @Override // com.crrepa.ble.conn.callback.CRPDeviceFunctionCallback
    public void onFunctionChenge(CRPFunctionInfo cRPFunctionInfo) {
        if (cRPFunctionInfo.isDisplayFunction()) {
            return;
        }
        String name = com.crrepa.band.my.ble.band.utils.a.getInstance().getName();
        if (TextUtils.isEmpty(name)) {
            return;
        }
        BandFunction bandFunction = this.bandFunctionDaoProxy.get(name);
        if (bandFunction == null) {
            bandFunction = new BandFunction();
            bandFunction.setName(name);
        }
        String bean2Json = s.bean2Json(cRPFunctionInfo.getFunctionList());
        f.d("support function: " + bean2Json);
        bandFunction.setSupportFunctions(bean2Json);
        this.bandFunctionDaoProxy.save(bandFunction);
    }
}
