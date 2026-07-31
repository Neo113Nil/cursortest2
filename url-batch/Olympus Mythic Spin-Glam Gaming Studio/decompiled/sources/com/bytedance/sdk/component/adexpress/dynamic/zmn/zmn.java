package com.bytedance.sdk.component.adexpress.dynamic.zmn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt;
import com.bytedance.sdk.component.adexpress.dynamic.fb.hhw;
import com.bytedance.sdk.component.adexpress.fs.fb;
import com.bytedance.sdk.component.adexpress.fs.mw;
import com.bytedance.sdk.component.adexpress.fs.nps;
import com.bytedance.sdk.component.adexpress.fs.rc;
import com.bytedance.sdk.component.adexpress.fs.rt;
import com.bytedance.sdk.component.adexpress.fs.zg;
import com.bytedance.sdk.component.adexpress.zn;
import com.bytedance.sdk.component.utils.bvs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class zmn implements fb<DynamicRootView>, rc {
    private zg btk;
    private nps fb;
    private com.bytedance.sdk.component.adexpress.dynamic.btk.zg fs;
    private mw hhw;
    private ScheduledFuture<?> nps;
    private AtomicBoolean zg = new AtomicBoolean(false);
    private DynamicRootView zmn;
    private Context zn;

    public zmn(Context context, boolean z, com.bytedance.sdk.component.adexpress.dynamic.btk.zg zgVar, mw mwVar, com.bytedance.sdk.component.adexpress.dynamic.hhw.zmn zmnVar) {
        this.zn = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, z, mwVar, zmnVar);
        this.zmn = dynamicRootView;
        this.fs = zgVar;
        this.hhw = mwVar;
        dynamicRootView.setRenderListener(this);
        this.hhw = mwVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public void zmn(nps npsVar) {
        this.fb = npsVar;
        int hhw = this.hhw.hhw();
        if (hhw < 0) {
            this.zmn.callBackRenderFail(this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(hhw)));
            return;
        }
        this.nps = com.bytedance.sdk.component.adexpress.fb.fb.zmn(new RunnableC0120zmn(2), hhw, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.hhw.bvs() <= 0) {
            hhw();
        } else {
            bvs.fs().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    zmn.this.hhw();
                }
            }, this.hhw.bvs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw() {
        this.hhw.btk().fs(zn());
        JSONObject zn = this.hhw.zn();
        if (!com.bytedance.sdk.component.adexpress.zmn.fs.fs.zmn(zn)) {
            int i = this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 123 : 113;
            DynamicRootView dynamicRootView = this.zmn;
            StringBuilder sb = new StringBuilder("data null is ");
            sb.append(zn == null);
            dynamicRootView.callBackRenderFail(i, sb.toString());
            return;
        }
        this.fs.zmn(new com.bytedance.sdk.component.adexpress.dynamic.hhw.fs() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.hhw.fs
            public void zmn(final com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
                zmn.this.zg();
                zmn.this.hhw.btk().zn(zmn.this.zn());
                zmn.this.zmn(zgVar);
                zmn.this.fs(zgVar);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    zmn.this.zn(zgVar);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            zmn.this.zn(zgVar);
                        }
                    });
                }
                if (zmn.this.zmn == null || zgVar == null) {
                    return;
                }
                zmn.this.zmn.setBgColor(zgVar.zmn());
                zmn.this.zmn.setBgMaterialCenterCalcColor(zgVar.fs());
            }
        });
        this.fs.zmn(this.hhw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc;
        if (zgVar == null || (rc = zgVar.rc()) == null || rc.size() <= 0) {
            return;
        }
        Collections.sort(rc, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.fb.zg>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn.3
            @Override // java.util.Comparator
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2, com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar3) {
                hhw btk = zgVar2.iv().btk();
                hhw btk2 = zgVar3.iv().btk();
                if (btk == null || btk2 == null) {
                    return 0;
                }
                return btk.hsp() >= btk2.hsp() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 : rc) {
            if (zgVar2 != null) {
                zmn(zgVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        float f;
        float f2;
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc;
        if (zgVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.fb.zg> rc2 = zgVar.rc();
        if (rc2 == null || rc2.size() <= 0) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar2 : rc2) {
                if (zgVar2.nps() > zgVar.nps() - zgVar2.bvs() || (rc = zgVar2.rc()) == null || rc.size() <= 0) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar3 : rc) {
                        if (zgVar3.iv().fs().equals("logo-union")) {
                            f2 = zgVar3.iv().hhw();
                            f = (((-f2) + zgVar.nps()) - zgVar2.nps()) + zgVar2.iv().btk().eug();
                        }
                    }
                }
                fs(zgVar2);
                if (f2 <= -15.0f) {
                    zgVar2.hhw(zgVar2.bvs() - f2);
                    zgVar2.fb(zgVar2.nps() + f2);
                    for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar4 : zgVar2.rc()) {
                        zgVar4.fb(zgVar4.nps() - f2);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.fb.zg klz = zgVar.klz();
        if (klz == null) {
            return;
        }
        float hhw = zgVar.hhw() - klz.hhw();
        float nps = zgVar.nps() - klz.nps();
        zgVar.zn(hhw);
        zgVar.fb(nps);
        if (f > 0.0f) {
            zgVar.fb(zgVar.nps() - f);
            zgVar.hhw(zgVar.bvs() + f);
            for (com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar5 : zgVar.rc()) {
                zgVar5.fb(zgVar5.nps() + f);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public DynamicRootView btk() {
        return fb();
    }

    public void fs() {
        zmn(btk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void zmn(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                zmn(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof fkt) {
            ((fkt) view).fs();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.fb
    public int zn() {
        return this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(com.bytedance.sdk.component.adexpress.dynamic.fb.zg zgVar) {
        if (zgVar == null) {
            this.zmn.callBackRenderFail(this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.hhw.btk().fb(zn());
        try {
            this.zmn.render(zgVar, zn());
        } catch (Exception e) {
            int i = this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.zmn.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    public DynamicRootView fb() {
        return this.zmn;
    }

    public void zmn(zg zgVar) {
        this.btk = zgVar;
    }

    private boolean nps() {
        DynamicRootView dynamicRootView = this.zmn;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(rt rtVar) {
        if (this.zg.get()) {
            return;
        }
        this.zg.set(true);
        if (rtVar.fs() && nps()) {
            this.zmn.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.fb.zmn(btk(), rtVar);
            return;
        }
        this.fb.zmn(rtVar.iv(), rtVar.bvs());
    }

    @Override // com.bytedance.sdk.component.adexpress.fs.rc
    public void zmn(View view, int i, zn znVar) {
        zg zgVar = this.btk;
        if (zgVar != null) {
            zgVar.zmn(view, i, znVar);
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zmn.zmn$zmn, reason: collision with other inner class name */
    private class RunnableC0120zmn implements Runnable {
        private int fs;

        public RunnableC0120zmn(int i) {
            this.fs = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.fs == 2) {
                zmn.this.zmn.callBackRenderFail(zmn.this.fs instanceof com.bytedance.sdk.component.adexpress.dynamic.btk.nps ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zg() {
        try {
            ScheduledFuture<?> scheduledFuture = this.nps;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.nps.cancel(false);
            this.nps = null;
        } catch (Throwable unused) {
        }
    }
}
