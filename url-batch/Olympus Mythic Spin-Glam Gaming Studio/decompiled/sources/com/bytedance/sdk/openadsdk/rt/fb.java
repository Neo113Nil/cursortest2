package com.bytedance.sdk.openadsdk.rt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.fb.mw;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class fb {
    private final HashSet<String> btk = new HashSet<>();
    private volatile long fb;
    private mw fs;
    private String zmn;
    private volatile boolean zn;

    public fb(mw mwVar) {
        this.fs = mwVar;
    }

    public void zmn(String str) {
        mw mwVar;
        if (fb() && !TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(this.zmn)) {
                this.zmn = str;
            }
            if (zn(str) && !this.btk.contains(str)) {
                this.btk.add(str);
                boolean fs = fs();
                boolean btk = btk();
                long currentTimeMillis = fs ? System.currentTimeMillis() - this.fb : -1L;
                if (btk || (mwVar = this.fs) == null) {
                    return;
                }
                mwVar.zmn(this.zmn, str, currentTimeMillis);
            }
        }
    }

    public void fs(String str) {
        mw mwVar;
        if (fb() && !TextUtils.isEmpty(str) && zn(str) && !this.btk.contains(str)) {
            this.btk.add(str);
            boolean fs = fs();
            boolean btk = btk();
            boolean fb = fb(str);
            long currentTimeMillis = fs ? System.currentTimeMillis() - this.fb : -1L;
            if (!fb || btk || (mwVar = this.fs) == null) {
                return;
            }
            mwVar.zmn(this.zmn, str, currentTimeMillis);
        }
    }

    public void zmn() {
        if (fb()) {
            this.fb = System.currentTimeMillis();
            this.zn = true;
        }
    }

    public boolean fs() {
        return this.zn;
    }

    public void zn() {
        this.zmn = null;
        this.fb = 0L;
        this.zn = false;
        this.btk.clear();
    }

    public boolean fb() {
        return com.bytedance.sdk.openadsdk.utils.fs.fb();
    }

    private boolean zn(String str) {
        if (str != null) {
            return str.startsWith("intent://") || str.startsWith("market://") || str.contains("play.google.com/store");
        }
        return false;
    }

    private boolean btk() {
        return this.zn && this.fb != 0 && System.currentTimeMillis() - this.fb <= 5000;
    }

    private boolean fb(String str) {
        return !TextUtils.equals(this.zmn, str);
    }
}
