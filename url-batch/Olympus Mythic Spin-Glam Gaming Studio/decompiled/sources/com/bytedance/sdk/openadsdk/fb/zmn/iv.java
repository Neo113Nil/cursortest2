package com.bytedance.sdk.openadsdk.fb.zmn;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class iv {
    public static iv zmn = new iv();
    private volatile boolean fb;
    private zmn fs;
    private final Map<String, zmn> zn = new HashMap();

    private int fs() {
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.zmn();
        }
        return 3;
    }

    private int zn() {
        zmn zmnVar = this.fs;
        if (zmnVar != null) {
            return zmnVar.fs();
        }
        return 30;
    }

    public void zmn(zmn zmnVar) {
        this.fs = zmnVar;
    }

    public void zmn(String str, zmn zmnVar) {
        if (TextUtils.isEmpty(str) || zmnVar == null) {
            return;
        }
        this.zn.put(str, zmnVar);
    }

    public int zmn(String str) {
        if (!zmn()) {
            return 4;
        }
        zmn zmnVar = this.zn.get(str);
        if (zmnVar == null) {
            return fs();
        }
        return zmnVar.zmn();
    }

    public int fs(String str) {
        zmn zmnVar = this.zn.get(str);
        if (zmnVar == null) {
            return zn();
        }
        return zmnVar.fs();
    }

    public boolean zmn() {
        return this.fb;
    }

    public void zmn(boolean z) {
        this.fb = z;
    }

    public static class zmn {
        private final int fs;
        private final int zmn;

        public zmn(int i, int i2) {
            this.zmn = (i < 0 || i > 5) ? 3 : i;
            this.fs = i2 < 10 ? 30 : i2;
        }

        public int zmn() {
            return this.zmn;
        }

        public int fs() {
            return this.fs;
        }
    }
}
