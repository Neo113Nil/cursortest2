package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dX;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.so;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ArbitrageOnTouchListener.java */
/* loaded from: classes.dex */
public class pvs implements View.OnTouchListener, dyT.pvs {
    private final List<Integer> Jd;
    private int Ju;
    private final int NB;
    private float cR;
    private final int icD;
    private long kj;
    private boolean mnm;
    private long qh;
    private ViewConfiguration rCZ;
    private final Context sUS;
    private volatile float so;
    private View.OnTouchListener uc;
    private float vA;
    private final int vG;
    private volatile float yiw;
    private String zM;
    private float Mxy = -1.0f;
    private float Wyp = -1.0f;
    private final Handler bNS = new dyT(so.pvs().getLooper(), this);
    InterfaceC0058pvs pvs = new InterfaceC0058pvs() { // from class: com.bytedance.sdk.component.widget.pvs.1
        @Override // com.bytedance.sdk.component.widget.pvs.InterfaceC0058pvs
        public void pvs() {
            if (pvs.this.Mxy == -1.0f && pvs.this.Wyp == -1.0f && pvs.this.kj == -1) {
                Object[] objArr = new Object[5];
                Float.valueOf(pvs.this.Mxy);
                Float.valueOf(pvs.this.Wyp);
                pvs pvsVar = pvs.this;
                pvsVar.Mxy = pvsVar.yiw;
                pvs pvsVar2 = pvs.this;
                pvsVar2.Wyp = pvsVar2.so;
                pvs pvsVar3 = pvs.this;
                pvsVar3.kj = pvsVar3.qh;
                pvs.this.mnm = true;
            }
            Object[] objArr2 = new Object[5];
            Float.valueOf(pvs.this.Mxy);
            Float.valueOf(pvs.this.Wyp);
        }

        @Override // com.bytedance.sdk.component.widget.pvs.InterfaceC0058pvs
        public void pvs(int i) {
            pvs.this.Ju = i;
            pvs.this.icD();
        }
    };
    private int OT = -1;
    private final List<Integer> IP = new ArrayList();

    /* compiled from: ArbitrageOnTouchListener.java */
    /* renamed from: com.bytedance.sdk.component.widget.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0058pvs {
        void pvs();

        void pvs(int i);
    }

    public pvs(Context context, int i, int i2, List<Integer> list, int i3) {
        this.sUS = context;
        if (i == -1) {
            this.icD = dX.pvs(context);
        } else {
            this.icD = dX.pvs(context, i);
        }
        this.vG = dX.pvs(context, i2);
        this.Jd = list;
        this.NB = i3;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Object[] objArr = new Object[6];
        Integer.valueOf(action);
        Float.valueOf(motionEvent.getX());
        Float.valueOf(motionEvent.getY());
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.qh = SystemClock.elapsedRealtime();
        this.yiw = x;
        this.so = y;
        if (action == 0) {
            this.vA = x;
            this.cR = y;
            Object[] objArr2 = new Object[5];
            Float.valueOf(x);
            Float.valueOf(this.cR);
        } else if (action == 1) {
            Object[] objArr3 = new Object[5];
            Float.valueOf(x);
            Float.valueOf(y);
            if (pvs(x, y)) {
                int pvs = pvs(this.yiw, this.so, this.qh);
                boolean z = !this.IP.contains(Integer.valueOf(this.Ju));
                pvs(view, motionEvent, pvs, z);
                if (z) {
                    this.IP.add(Integer.valueOf(this.Ju));
                }
                if (pvs == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = this.uc;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    public void pvs(View.OnTouchListener onTouchListener) {
        this.uc = onTouchListener;
    }

    public InterfaceC0058pvs pvs() {
        return this.pvs;
    }

    private void pvs(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        if (!z) {
            i2 = 0;
        }
        jSONObject.put("is_first_click", i2);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.Ju);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.bNS.sendMessageDelayed(obtain, 200L);
    }

    private boolean pvs(float f, float f2) {
        if (this.rCZ == null) {
            this.rCZ = ViewConfiguration.get(this.sUS);
        }
        if (this.OT == -1) {
            this.OT = this.rCZ.getScaledTouchSlop();
        }
        Object[] objArr = new Object[2];
        Integer.valueOf(this.OT);
        if (Math.abs(f - this.vA) <= this.OT && Math.abs(f2 - this.cR) <= this.OT) {
            Object[] objArr2 = new Object[9];
            Float.valueOf(f);
            Float.valueOf(this.vA);
            Float.valueOf(f2);
            Float.valueOf(this.cR);
            return true;
        }
        Object[] objArr3 = new Object[9];
        Float.valueOf(f);
        Float.valueOf(this.vA);
        Float.valueOf(f2);
        Float.valueOf(this.cR);
        return false;
    }

    public void pvs(String str) {
        this.zM = str;
    }

    private int pvs(float f, float f2, long j) {
        if (this.Mxy == -1.0f && this.Wyp == -1.0f && this.kj == -1) {
            return 1;
        }
        Object[] objArr = new Object[4];
        Integer.valueOf(this.Ju);
        if (!this.Jd.contains(Integer.valueOf(this.Ju))) {
            return 2;
        }
        if (j - this.kj > this.NB) {
            icD();
            return 3;
        }
        float abs = Math.abs(f - this.Mxy);
        float abs2 = Math.abs(f2 - this.Wyp);
        Object[] objArr2 = new Object[6];
        Float.valueOf(f);
        Float.valueOf(this.Mxy);
        Float.valueOf(abs);
        Object[] objArr3 = new Object[6];
        Float.valueOf(f2);
        Float.valueOf(this.Wyp);
        Float.valueOf(abs2);
        Object[] objArr4 = new Object[4];
        Integer.valueOf(this.icD);
        Integer.valueOf(this.vG);
        if (abs <= this.icD / 2.0f && abs2 <= this.vG / 2.0f) {
            return 0;
        }
        icD();
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD() {
        this.Mxy = -1.0f;
        this.Wyp = -1.0f;
        this.kj = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.dyT.pvs
    public void pvs(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.mnm ? 1 : 0);
                    this.mnm = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.widget.pvs.pvs.pvs().icD() != null) {
                com.bytedance.sdk.component.widget.pvs.pvs.pvs().icD().pvs(this.zM, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
