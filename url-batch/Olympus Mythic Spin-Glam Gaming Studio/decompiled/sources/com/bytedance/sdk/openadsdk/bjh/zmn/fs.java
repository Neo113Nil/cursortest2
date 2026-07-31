package com.bytedance.sdk.openadsdk.bjh.zmn;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs {
    private final nqi fs;
    private int zmn = zn.fs;
    private final AtomicBoolean zn = new AtomicBoolean(false);
    private final AtomicBoolean fb = new AtomicBoolean(true);
    private final AtomicInteger btk = new AtomicInteger(0);
    private long hhw = 0;
    private long nps = 0;
    private final Runnable zg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.bjh.zmn.fs.3
        @Override // java.lang.Runnable
        public void run() {
            fs.this.fb();
        }
    };

    public fs(nqi nqiVar) {
        this.fs = nqiVar;
    }

    public void zmn() {
        if (this.btk.get() != 0) {
            return;
        }
        this.zmn = this.fs.zum() * 1000;
        this.btk.set(1);
        this.hhw = SystemClock.elapsedRealtime();
        Handler zmn = zmn.zmn();
        if (zmn != null) {
            zmn.postDelayed(this.zg, this.zmn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fb() {
        if (this.zn.compareAndSet(false, true)) {
            fs();
            final long elapsedRealtime = this.nps + (SystemClock.elapsedRealtime() - this.hhw);
            this.nps = elapsedRealtime;
            nu.fs(new com.bytedance.sdk.component.zg.fs.zn("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.bjh.zmn.fs.1
                @Override // java.lang.Runnable
                public void run() {
                    String zmn = oub.zmn(fs.this.fs);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", fs.this.fs.zum() * 1000);
                        jSONObject.put("ev_wait_time_client", elapsedRealtime);
                    } catch (JSONException e) {
                        iqz.zn("EvTracker", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.fb.zn.fs(fs.this.fs, zmn, fs.this.fs.aqk(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btk() {
        if (this.btk.get() == 2) {
            this.hhw = SystemClock.elapsedRealtime();
            Handler zmn = zmn.zmn();
            if (zmn != null) {
                zmn.postDelayed(this.zg, this.zmn - this.nps);
            }
            this.btk.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hhw() {
        if (this.btk.get() != 1 || this.hhw == 0) {
            return;
        }
        Handler zmn = zmn.zmn();
        if (zmn != null) {
            zmn.removeCallbacks(this.zg);
        }
        this.nps += SystemClock.elapsedRealtime() - this.hhw;
        this.hhw = 0L;
        this.btk.set(2);
    }

    public void fs() {
        this.btk.set(3);
        Handler zmn = zmn.zmn();
        if (zmn != null) {
            zmn.removeCallbacks(this.zg);
        }
    }

    public void zmn(final int i) {
        Handler zmn;
        if (this.btk.get() == 3 || (zmn = zmn.zmn()) == null) {
            return;
        }
        zmn.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bjh.zmn.fs.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && fs.this.fb.get()) {
                    fs.this.btk();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    fs.this.hhw();
                } else if (i2 == 5) {
                    fs.this.fb();
                }
            }
        });
    }

    public void zmn(boolean z) {
        this.fb.set(z);
    }

    public boolean zn() {
        return this.btk.get() == 3;
    }
}
