package com.bytedance.sdk.openadsdk.core.widget.zmn;

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
import androidx.annotation.MainThread;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.cn;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.cyb.zmn.zmn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class nps implements kjb.zmn {
    String bvs;
    float cn;
    long cyb;
    WebView fb;
    nqi fs;
    int iv;
    boolean kgc;
    private final boolean kjb;
    float klz;
    long kw;
    float mw;
    boolean nps;
    boolean olo;
    float rc;
    float rt;
    private boolean so;
    private long yj;
    boolean zg;
    Context zmn;
    private final Handler rp = new kjb(cn.fs().getLooper(), this);
    String zn = "landingpage";
    int hhw = 0;
    private final String zak = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String am = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    zmn uqh = new zmn() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.nps.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.zmn.nps.zmn
        public void zmn() {
            nps npsVar = nps.this;
            npsVar.zg = true;
            npsVar.hhw();
            nps npsVar2 = nps.this;
            npsVar2.zmn(2, npsVar2.bvs, npsVar2.iv);
        }
    };
    GestureDetector bjh = new GestureDetector(kgc.zmn(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.nps.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            nps.this.olo = true;
            return false;
        }
    });
    int btk = kgc.fb().iqz();
    Map<Integer, Long> iqz = new HashMap();
    Map<Integer, Float> phc = new HashMap();
    Map<Integer, Long> doe = new HashMap();
    List<Integer> nqi = new ArrayList();

    public interface zmn {
        void zmn();
    }

    public nps(WebView webView, nqi nqiVar, Context context, boolean z) {
        this.fs = nqiVar;
        this.fb = webView;
        this.zmn = context;
        this.kjb = z;
    }

    public void zmn(String str) {
        this.zn = str;
    }

    public void fs(String str) {
        this.bvs = str;
        zg();
        this.iqz.put(Integer.valueOf(this.iv), Long.valueOf(SystemClock.elapsedRealtime()));
        this.doe.put(Integer.valueOf(this.iv), Long.valueOf(SystemClock.elapsedRealtime()));
        this.so = btk();
    }

    public void zmn() {
        fs(this.iv);
    }

    public void zmn(int i) {
        float height = (i + this.fb.getHeight()) / jy.fs(this.zmn, this.fb.getContentHeight());
        Float f = this.phc.get(Integer.valueOf(this.iv));
        if (height > (f == null ? 0.0f : f.floatValue())) {
            this.phc.put(Integer.valueOf(this.iv), Float.valueOf(height));
        }
    }

    public void fs() {
        this.fb.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.zmn.nps.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if (!z) {
                    nps npsVar = nps.this;
                    if (!npsVar.zg) {
                        npsVar.hhw();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - nps.this.yj >= 50) {
                            nps npsVar2 = nps.this;
                            npsVar2.zmn(3, npsVar2.bvs, npsVar2.iv);
                            nps.this.yj = elapsedRealtime;
                            return;
                        }
                        return;
                    }
                    npsVar.zg = false;
                }
                if (z) {
                    nps.this.zg();
                    nps npsVar3 = nps.this;
                    npsVar3.iqz.put(Integer.valueOf(npsVar3.iv), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    public void zn(String str) {
        if (this.nps) {
            this.kgc = true;
        }
        if (this.iv == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int indexOf = str.indexOf("query=") + 6;
            int indexOf2 = str.indexOf(X3.j.c, indexOf);
            if (indexOf < 0 || indexOf2 >= str.length() || indexOf2 <= indexOf) {
                return;
            }
            fb(str.substring(indexOf, indexOf2));
        }
    }

    public void zmn(MotionEvent motionEvent) {
        this.bjh.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rc = motionEvent.getX();
            this.klz = motionEvent.getY();
            this.cyb = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            zn(2);
        } else {
            this.kw = SystemClock.elapsedRealtime() - this.cyb;
            if (fs(motionEvent)) {
                fb();
            } else {
                zn(1);
            }
        }
    }

    public zmn zn() {
        return this.uqh;
    }

    private void fb(String str) {
        if (nps()) {
            return;
        }
        com.bytedance.sdk.openadsdk.fb.zn.zmn(this.fs, new zmn.C0186zmn().zmn(this.bvs).fs(Uri.decode(str)).zmn(), this.zn);
    }

    private void fs(int i) {
        if (nps() || this.nqi.contains(Integer.valueOf(i))) {
            return;
        }
        this.nqi.add(Integer.valueOf(i));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.fb.zn.fs(this.fs, new zmn.C0186zmn().zmn(this.bvs).zmn(this.iv).iv(elapsedRealtime - (this.doe.get(Integer.valueOf(i)) != null ? r6.longValue() : elapsedRealtime)).zmn(), this.zn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zmn(int i, String str, int i2) {
        if (nps()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.iqz.get(Integer.valueOf(i2));
        long longValue = l != null ? l.longValue() : elapsedRealtime;
        Float f = this.phc.get(Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.fb.zn.zn(this.fs, new zmn.C0186zmn().zmn(str).zmn(i2).zg(elapsedRealtime - longValue).bvs(f == null ? 0.0f : f.floatValue()).fs(i).zmn(), this.zn);
    }

    private void fb() {
        if (nps()) {
            return;
        }
        com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmn2 = new zmn.C0186zmn().zmn(this.bvs).zmn(this.iv).fb(this.rc).btk(this.klz).hhw(this.cn).nps(this.kw).zmn();
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = zmn2;
        this.rp.sendMessageDelayed(obtain, 20L);
    }

    private void zn(int i) {
        if (nps()) {
            return;
        }
        hhw();
        this.nps = true;
        com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmn2 = new zmn.C0186zmn().zmn(this.bvs).zmn(this.iv).zmn(this.rc).fs(this.klz).zn(this.kw).zn(i).zmn();
        try {
            if (this.so) {
                WebView.HitTestResult hitTestResult = this.fb.getHitTestResult();
                zmn2.zmn(hitTestResult.getExtra());
                zmn2.zmn(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = 200;
        obtain.obj = zmn2;
        this.rp.sendMessageDelayed(obtain, 100L);
    }

    private boolean btk() {
        try {
            int i = this.iv;
            if (i != 2 && i != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.bvs)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.bvs);
        } catch (Throwable th) {
            iqz.zn("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void hhw() {
        if (this.phc.get(Integer.valueOf(this.iv)) != null) {
            return;
        }
        float height = this.fb.getHeight() / jy.fs(this.zmn, this.fb.getContentHeight());
        if (height < 0.0f || height > 1.0f) {
            height = 0.0f;
        }
        this.phc.put(Integer.valueOf(this.iv), Float.valueOf(height));
    }

    private boolean nps() {
        int i = this.hhw + 1;
        this.hhw = i;
        if (i > this.btk) {
            return true;
        }
        return ("landingpage".equals(this.zn) || "landingpage_endcard".equals(this.zn) || "landingpage_split_screen".equals(this.zn) || "landingpage_direct".equals(this.zn) || "landingpage_split_ceiling".equals(this.zn)) ? false : true;
    }

    private boolean fs(MotionEvent motionEvent) {
        this.mw = motionEvent.getX();
        float y = motionEvent.getY();
        this.rt = y;
        float f = this.klz;
        if (y - f == 0.0f) {
            return false;
        }
        this.cn = y - f;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zg() {
        WebBackForwardList copyBackForwardList = this.fb.copyBackForwardList();
        if (copyBackForwardList != null) {
            int currentIndex = copyBackForwardList.getCurrentIndex();
            this.iv = currentIndex + 1;
            if (this.kjb) {
                this.iv = currentIndex + 2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.cyb.zmn.zmn zmnVar = (com.bytedance.sdk.openadsdk.cyb.zmn.zmn) message.obj;
        if (i == 100) {
            zmnVar.fb(this.olo ? 2 : 1);
            com.bytedance.sdk.openadsdk.fb.zn.fb(this.fs, zmnVar, this.zn);
            this.olo = false;
        } else if (i == 200) {
            if (this.kgc) {
                zmn(1, zmnVar.zn(), zmnVar.fb());
            }
            zmnVar.zn(this.kgc ? 1 : 0);
            com.bytedance.sdk.openadsdk.fb.zn.btk(this.fs, zmnVar, this.zn);
            this.nps = false;
            this.kgc = false;
        }
    }
}
