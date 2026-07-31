package com.bytedance.adsdk.ugeno.core.fs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.mw;
import com.bytedance.adsdk.ugeno.nps.bvs;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class hhw implements bvs.zmn {
    private mw btk;
    private Context fb;
    private int fs;
    private com.bytedance.adsdk.ugeno.fs.zn hhw;
    private Handler nps = new bvs(Looper.getMainLooper(), this);
    private boolean zmn;
    private cn zn;

    public hhw(Context context, mw mwVar, com.bytedance.adsdk.ugeno.fs.zn znVar) {
        this.fb = context;
        this.btk = mwVar;
        this.hhw = znVar;
    }

    public void zmn(cn cnVar) {
        this.zn = cnVar;
    }

    public void zmn() {
        mw mwVar = this.btk;
        if (mwVar == null) {
            return;
        }
        JSONObject zn = mwVar.zn();
        try {
            this.fs = Integer.parseInt(com.bytedance.adsdk.ugeno.zn.fs.zmn(zn.optString("interval", "8000"), this.hhw.klz()));
            this.zmn = zn.optBoolean("repeat");
            this.nps.sendEmptyMessageDelayed(1001, this.fs);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.nps.bvs.zmn
    public void zmn(Message message) {
        if (message.what != 1001) {
            return;
        }
        cn cnVar = this.zn;
        if (cnVar != null) {
            mw mwVar = this.btk;
            com.bytedance.adsdk.ugeno.fs.zn znVar = this.hhw;
            cnVar.zmn(mwVar, znVar, znVar);
        }
        if (this.zmn) {
            this.nps.sendEmptyMessageDelayed(1001, this.fs);
        } else {
            this.nps.removeMessages(1001);
        }
    }
}
