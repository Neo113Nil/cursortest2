package com.bytedance.sdk.openadsdk.core.widget.pvs;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.Wyp.pvs.pvs;
import com.bytedance.sdk.openadsdk.core.Ju;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: WebArbitrageBehavior.java */
/* loaded from: classes2.dex */
public class sUS implements dyT.pvs {
    float IP;
    WebView Jd;
    float Ju;
    String Mxy;
    int Wyp;
    private long ae;
    float bNS;
    boolean cR;
    private boolean gA;
    cR icD;
    float kj;
    long mnm;
    Context pvs;
    float qh;
    boolean so;
    boolean vA;
    boolean yiw;
    long zM;
    private final Handler dX = new dyT(Ju.icD().getLooper(), this);
    String vG = "landingpage";
    int sUS = 0;
    private final String CvL = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String Gp = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    pvs ZhG = new pvs() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.sUS.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.pvs.sUS.pvs
        public void pvs() {
            sUS.this.so = true;
            sUS.this.sUS();
            sUS sus = sUS.this;
            sus.pvs(2, sus.Mxy, sUS.this.Wyp);
        }
    };
    GestureDetector dyT = new GestureDetector(mnm.pvs(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.sUS.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            sUS.this.vA = true;
            return false;
        }
    });
    int NB = mnm.Jd().yhq();
    Map<Integer, Long> uc = new HashMap();
    Map<Integer, Float> rCZ = new HashMap();
    Map<Integer, Long> OT = new HashMap();
    List<Integer> ny = new ArrayList();

    /* compiled from: WebArbitrageBehavior.java */
    public interface pvs {
        void pvs();
    }

    public sUS(WebView webView, cR cRVar, Context context) {
        this.icD = cRVar;
        this.Jd = webView;
        this.pvs = context;
    }

    public void pvs(String str) {
        this.vG = str;
    }

    public void icD(String str) {
        this.Mxy = str;
        so();
        this.uc.put(Integer.valueOf(this.Wyp), Long.valueOf(SystemClock.elapsedRealtime()));
        this.OT.put(Integer.valueOf(this.Wyp), Long.valueOf(SystemClock.elapsedRealtime()));
        this.gA = NB();
    }

    public void pvs() {
        icD(this.Wyp);
    }

    public void pvs(int i) {
        float height = (i + this.Jd.getHeight()) / Pj.icD(this.pvs, this.Jd.getContentHeight());
        Float f = this.rCZ.get(Integer.valueOf(this.Wyp));
        float floatValue = f == null ? 0.0f : f.floatValue();
        Object[] objArr = new Object[6];
        Float.valueOf(floatValue);
        Float.valueOf(height);
        Integer.valueOf(this.Wyp);
        if (height > floatValue) {
            this.rCZ.put(Integer.valueOf(this.Wyp), Float.valueOf(height));
        }
    }

    public void icD() {
        this.Jd.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pvs.sUS.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                Object[] objArr = new Object[2];
                Boolean.valueOf(z);
                if (!z) {
                    if (!sUS.this.so) {
                        sUS.this.sUS();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - sUS.this.ae >= 50) {
                            sUS sus = sUS.this;
                            sus.pvs(3, sus.Mxy, sUS.this.Wyp);
                            sUS.this.ae = elapsedRealtime;
                            return;
                        }
                        return;
                    }
                    sUS.this.so = false;
                }
                if (z) {
                    sUS.this.so();
                    sUS.this.uc.put(Integer.valueOf(sUS.this.Wyp), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    public void vG(String str) {
        if (this.yiw) {
            this.cR = true;
        }
        if (this.Wyp == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int indexOf = str.indexOf("query=") + 6;
            Jd(str.substring(indexOf, str.indexOf("&", indexOf)));
        }
    }

    public void pvs(MotionEvent motionEvent) {
        this.dyT.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.qh = motionEvent.getX();
            this.kj = motionEvent.getY();
            this.mnm = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            vG(2);
        } else {
            this.zM = SystemClock.elapsedRealtime() - this.mnm;
            if (icD(motionEvent)) {
                Jd();
            } else {
                vG(1);
            }
        }
    }

    public pvs vG() {
        return this.ZhG;
    }

    private void Jd(String str) {
        if (yiw()) {
            return;
        }
        com.bytedance.sdk.openadsdk.icD.vG.pvs(this.icD, new pvs.C0062pvs().pvs(this.Mxy).icD(Uri.decode(str)).pvs(), this.vG);
    }

    private void icD(int i) {
        if (yiw() || this.ny.contains(Integer.valueOf(i))) {
            return;
        }
        this.ny.add(Integer.valueOf(i));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.icD.vG.icD(this.icD, new pvs.C0062pvs().pvs(this.Mxy).pvs(this.Wyp).Wyp(elapsedRealtime - (this.OT.get(Integer.valueOf(i)) != null ? r6.longValue() : elapsedRealtime)).pvs(), this.vG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i, String str, int i2) {
        if (yiw()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.uc.get(Integer.valueOf(i2));
        long longValue = l != null ? l.longValue() : elapsedRealtime;
        Float f = this.rCZ.get(Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.icD.vG.vG(this.icD, new pvs.C0062pvs().pvs(str).pvs(i2).so(elapsedRealtime - longValue).Mxy(f == null ? 0.0f : f.floatValue()).icD(i).pvs(), this.vG);
    }

    private void Jd() {
        if (yiw()) {
            return;
        }
        com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvs2 = new pvs.C0062pvs().pvs(this.Mxy).pvs(this.Wyp).Jd(this.qh).NB(this.kj).sUS(this.bNS).yiw(this.zM).pvs();
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = pvs2;
        this.dX.sendMessageDelayed(obtain, 20L);
    }

    private void vG(int i) {
        if (yiw()) {
            return;
        }
        sUS();
        this.yiw = true;
        com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvs2 = new pvs.C0062pvs().pvs(this.Mxy).pvs(this.Wyp).pvs(this.qh).icD(this.kj).vG(this.zM).vG(i).pvs();
        try {
            if (this.gA) {
                WebView.HitTestResult hitTestResult = this.Jd.getHitTestResult();
                pvs2.pvs(hitTestResult.getExtra());
                pvs2.pvs(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = 200;
        obtain.obj = pvs2;
        this.dX.sendMessageDelayed(obtain, 100L);
    }

    private boolean NB() {
        try {
            int i = this.Wyp;
            if (i != 2 && i != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.Mxy)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.Mxy);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sUS() {
        if (this.rCZ.get(Integer.valueOf(this.Wyp)) != null) {
            return;
        }
        float height = this.Jd.getHeight() / Pj.icD(this.pvs, this.Jd.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        Object[] objArr = new Object[4];
        Float.valueOf(height);
        Integer.valueOf(this.Wyp);
        this.rCZ.put(Integer.valueOf(this.Wyp), Float.valueOf(height));
    }

    private boolean yiw() {
        int i = this.sUS + 1;
        this.sUS = i;
        if (i > this.NB) {
            return true;
        }
        return ("landingpage".equals(this.vG) || "landingpage_endcard".equals(this.vG) || "landingpage_split_screen".equals(this.vG) || "landingpage_direct".equals(this.vG)) ? false : true;
    }

    private boolean icD(MotionEvent motionEvent) {
        this.Ju = motionEvent.getX();
        float y = motionEvent.getY();
        this.IP = y;
        float f = this.kj;
        if (y - f == 0.0f) {
            return false;
        }
        this.bNS = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void so() {
        WebBackForwardList copyBackForwardList = this.Jd.copyBackForwardList();
        if (copyBackForwardList != null) {
            this.Wyp = copyBackForwardList.getCurrentIndex() + 1;
        }
        Object[] objArr = new Object[2];
        Integer.valueOf(this.Wyp);
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.Wyp.pvs.pvs pvsVar = (com.bytedance.sdk.openadsdk.Wyp.pvs.pvs) message.obj;
        if (i == 100) {
            pvsVar.Jd(this.vA ? 2 : 1);
            com.bytedance.sdk.openadsdk.icD.vG.Jd(this.icD, pvsVar, this.vG);
            this.vA = false;
        } else if (i == 200) {
            if (this.cR) {
                pvs(1, pvsVar.vG(), pvsVar.Jd());
            }
            pvsVar.vG(this.cR ? 1 : 0);
            com.bytedance.sdk.openadsdk.icD.vG.NB(this.icD, pvsVar, this.vG);
            this.yiw = false;
            this.cR = false;
        }
    }
}
