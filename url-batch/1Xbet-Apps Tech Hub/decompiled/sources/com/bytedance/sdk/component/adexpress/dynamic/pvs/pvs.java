package com.bytedance.sdk.component.adexpress.dynamic.pvs;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Jd.vG;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB;
import com.bytedance.sdk.component.adexpress.dynamic.vG.sUS;
import com.bytedance.sdk.component.adexpress.icD.IP;
import com.bytedance.sdk.component.adexpress.icD.Jd;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import com.bytedance.sdk.component.adexpress.icD.qh;
import com.bytedance.sdk.component.adexpress.icD.so;
import com.bytedance.sdk.component.adexpress.icD.yiw;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: DynamicRender.java */
/* loaded from: classes.dex */
public class pvs implements Jd<DynamicRootView>, qh {
    private yiw Jd;
    private so NB;
    private com.bytedance.sdk.component.adexpress.dynamic.Jd.so icD;
    private DynamicRootView pvs;
    private Ju sUS;
    private AtomicBoolean so = new AtomicBoolean(false);
    private Context vG;
    private ScheduledFuture<?> yiw;

    public pvs(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Jd.so soVar, Ju ju, com.bytedance.sdk.component.adexpress.dynamic.NB.pvs pvsVar) {
        this.vG = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, ju, pvsVar);
        this.pvs = dynamicRootView;
        this.icD = soVar;
        this.sUS = ju;
        dynamicRootView.setRenderListener(this);
        this.sUS = ju;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public void pvs(yiw yiwVar) {
        this.Jd = yiwVar;
        int sUS = this.sUS.sUS();
        if (sUS < 0) {
            this.pvs.pvs(this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 127 : 117, "time is ".concat(String.valueOf(sUS)));
            return;
        }
        this.yiw = vG.pvs(new RunnableC0041pvs(2), sUS, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.sUS.Mxy() <= 0) {
            sUS();
        } else {
            com.bytedance.sdk.component.utils.so.icD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs.1
                @Override // java.lang.Runnable
                public void run() {
                    pvs.this.sUS();
                }
            }, this.sUS.Mxy());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        this.sUS.NB().icD(vG());
        JSONObject vG = this.sUS.vG();
        if (!com.bytedance.sdk.component.adexpress.pvs.icD.icD.pvs(vG)) {
            this.pvs.pvs(this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 123 : 113, "data null is " + (vG == null));
        } else {
            this.icD.pvs(new com.bytedance.sdk.component.adexpress.dynamic.NB.icD() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.NB.icD
                public void pvs(final com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
                    pvs.this.so();
                    pvs.this.sUS.NB().vG(pvs.this.vG());
                    pvs.this.pvs(soVar);
                    pvs.this.icD(soVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        pvs.this.vG(soVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                pvs.this.vG(soVar);
                            }
                        });
                    }
                    if (pvs.this.pvs == null || soVar == null) {
                        return;
                    }
                    pvs.this.pvs.setBgColor(soVar.pvs());
                    pvs.this.pvs.setBgMaterialCenterCalcColor(soVar.icD());
                }
            });
            this.icD.pvs(this.sUS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> qh;
        if (soVar == null || (qh = soVar.qh()) == null || qh.size() <= 0) {
            return;
        }
        Collections.sort(qh, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.vG.so>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs.3
            @Override // java.util.Comparator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2, com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar3) {
                sUS NB = soVar2.Wyp().NB();
                sUS NB2 = soVar3.Wyp().NB();
                if (NB == null || NB2 == null) {
                    return 0;
                }
                return NB.yhq() >= NB2.yhq() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2 : qh) {
            if (soVar2 != null) {
                pvs(soVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        float f;
        float f2;
        List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> qh;
        if (soVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.vG.so> qh2 = soVar.qh();
        if (qh2 == null || qh2.size() <= 0) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar2 : qh2) {
                if (soVar2.yiw() > soVar.yiw() - soVar2.Mxy() || (qh = soVar2.qh()) == null || qh.size() <= 0) {
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar3 : qh) {
                        if (soVar3.Wyp().icD().equals("logo-union")) {
                            f2 = soVar3.Wyp().sUS();
                            f = (((-f2) + soVar.yiw()) - soVar2.yiw()) + soVar2.Wyp().NB().RKd();
                        }
                    }
                }
                icD(soVar2);
                if (f2 <= -15.0f) {
                    soVar2.sUS(soVar2.Mxy() - f2);
                    soVar2.Jd(soVar2.yiw() + f2);
                    for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar4 : soVar2.qh()) {
                        soVar4.Jd(soVar4.yiw() - f2);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.vG.so kj = soVar.kj();
        if (kj == null) {
            return;
        }
        float sUS = soVar.sUS() - kj.sUS();
        float yiw = soVar.yiw() - kj.yiw();
        soVar.vG(sUS);
        soVar.Jd(yiw);
        if (f > 0.0f) {
            soVar.Jd(soVar.yiw() - f);
            soVar.sUS(soVar.Mxy() + f);
            for (com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar5 : soVar.qh()) {
                soVar5.Jd(soVar5.yiw() + f);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public DynamicRootView NB() {
        return Jd();
    }

    public void icD() {
        pvs(NB());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void pvs(View view) {
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
                pvs(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof NB) {
            ((NB) view).icD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.Jd
    public int vG() {
        return this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(com.bytedance.sdk.component.adexpress.dynamic.vG.so soVar) {
        if (soVar == null) {
            this.pvs.pvs(this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.sUS.NB().Jd(vG());
        try {
            this.pvs.pvs(soVar, vG());
        } catch (Exception e) {
            this.pvs.pvs(this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 128 : 118, "exception is " + e.getMessage());
        }
    }

    public DynamicRootView Jd() {
        return this.pvs;
    }

    public void pvs(so soVar) {
        this.NB = soVar;
    }

    private boolean yiw() {
        DynamicRootView dynamicRootView = this.pvs;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.qh
    public void pvs(IP ip) {
        if (this.so.get()) {
            return;
        }
        this.so.set(true);
        if (ip.vG() && yiw()) {
            this.pvs.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.Jd.pvs(NB(), ip);
            return;
        }
        this.Jd.pvs(ip.qh(), ip.Wyp());
    }

    @Override // com.bytedance.sdk.component.adexpress.icD.qh
    public void pvs(View view, int i, com.bytedance.sdk.component.adexpress.vG vGVar) {
        so soVar = this.NB;
        if (soVar != null) {
            soVar.pvs(view, i, vGVar);
        }
    }

    /* compiled from: DynamicRender.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.pvs.pvs$pvs, reason: collision with other inner class name */
    private class RunnableC0041pvs implements Runnable {
        private int icD;

        public RunnableC0041pvs(int i) {
            this.icD = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.icD == 2) {
                pvs.this.pvs.pvs(pvs.this.icD instanceof com.bytedance.sdk.component.adexpress.dynamic.Jd.yiw ? 127 : 117, (String) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void so() {
        try {
            ScheduledFuture<?> scheduledFuture = this.yiw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.yiw.cancel(false);
            this.yiw = null;
        } catch (Throwable unused) {
        }
    }
}
