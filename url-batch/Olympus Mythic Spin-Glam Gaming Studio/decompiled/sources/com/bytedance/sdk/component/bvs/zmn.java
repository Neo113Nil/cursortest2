package com.bytedance.sdk.component.bvs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.am;
import com.bytedance.sdk.component.utils.bvs;
import com.bytedance.sdk.component.utils.kjb;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class zmn extends zn implements kjb.zmn {
    private final int btk;
    private boolean cyb;
    private final List<Integer> fb;
    private final int fs;
    private final Context hhw;
    private View.OnTouchListener iqz;
    private float kgc;
    private long klz;
    private String kw;
    private int mw;
    private volatile float nps;
    private float olo;
    private long rc;
    private volatile float zg;
    private final int zn;
    private float bvs = -1.0f;
    private float iv = -1.0f;
    private final Handler cn = new kjb(bvs.zmn().getLooper(), this);
    InterfaceC0128zmn zmn = new InterfaceC0128zmn() { // from class: com.bytedance.sdk.component.bvs.zmn.1
        @Override // com.bytedance.sdk.component.bvs.zmn.InterfaceC0128zmn
        public void zmn() {
            if (zmn.this.bvs == -1.0f && zmn.this.iv == -1.0f && zmn.this.klz == -1) {
                float unused = zmn.this.bvs;
                float unused2 = zmn.this.iv;
                zmn zmnVar = zmn.this;
                zmnVar.bvs = zmnVar.nps;
                zmn zmnVar2 = zmn.this;
                zmnVar2.iv = zmnVar2.zg;
                zmn zmnVar3 = zmn.this;
                zmnVar3.klz = zmnVar3.rc;
                zmn.this.cyb = true;
            }
            float unused3 = zmn.this.bvs;
            float unused4 = zmn.this.iv;
        }

        @Override // com.bytedance.sdk.component.bvs.zmn.InterfaceC0128zmn
        public void zmn(int i) {
            zmn.this.mw = i;
            zmn.this.fs();
        }
    };
    private int phc = -1;
    private final List<Integer> rt = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.bvs.zmn$zmn, reason: collision with other inner class name */
    public interface InterfaceC0128zmn {
        void zmn();

        void zmn(int i);
    }

    public zmn(Context context, int i, int i2, List<Integer> list, int i3) {
        this.hhw = context;
        if (i == -1) {
            this.fs = am.zmn(context);
        } else {
            this.fs = am.zmn(context, i);
        }
        this.zn = am.zmn(context, i2);
        this.fb = list;
        this.btk = i3;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.rc = SystemClock.elapsedRealtime();
        this.nps = x;
        this.zg = y;
        if (action == 0) {
            this.olo = x;
            this.kgc = y;
        } else if (action == 1 && zmn(x, y, this.olo, this.kgc, this.hhw)) {
            int zmn = zmn(this.nps, this.zg, this.rc);
            boolean contains = this.rt.contains(Integer.valueOf(this.mw));
            zmn(view, motionEvent, zmn, !contains);
            if (!contains) {
                this.rt.add(Integer.valueOf(this.mw));
            }
            if (zmn == 0) {
                motionEvent.setAction(3);
            }
        }
        View.OnTouchListener onTouchListener = this.iqz;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bvs.zn
    public void zmn(View.OnTouchListener onTouchListener) {
        this.iqz = onTouchListener;
    }

    public InterfaceC0128zmn zmn() {
        return this.zmn;
    }

    private void zmn(View view, MotionEvent motionEvent, int i, boolean z) {
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
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.mw);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.cn.sendMessageDelayed(obtain, 200L);
    }

    public void zmn(String str) {
        this.kw = str;
    }

    private int zmn(float f, float f2, long j) {
        if (this.bvs == -1.0f && this.iv == -1.0f && this.klz == -1) {
            return 1;
        }
        if (!this.fb.contains(Integer.valueOf(this.mw))) {
            return 2;
        }
        if (j - this.klz > this.btk) {
            fs();
            return 3;
        }
        float abs = Math.abs(f - this.bvs);
        float abs2 = Math.abs(f2 - this.iv);
        if (abs <= this.fs / 2.0f && abs2 <= this.zn / 2.0f) {
            return 0;
        }
        fs();
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs() {
        this.bvs = -1.0f;
        this.iv = -1.0f;
        this.klz = -1L;
    }

    @Override // com.bytedance.sdk.component.utils.kjb.zmn
    public void zmn(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.cyb ? 1 : 0);
                    this.cyb = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs() != null) {
                com.bytedance.sdk.component.bvs.zmn.zmn.zmn().fs().zmn(this.kw, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
