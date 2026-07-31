package com.bytedance.sdk.component.nps.zn;

/* loaded from: classes11.dex */
public class fb {
    private fs fs;
    private zmn zmn;

    public interface fs {
    }

    public enum zmn {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    private fb() {
        this.zmn = zmn.OFF;
        this.fs = new com.bytedance.sdk.component.nps.zn.fs();
    }

    private static class zn {
        private static final fb zmn = new fb();
    }

    public static void zmn(zmn zmnVar) {
        synchronized (fb.class) {
            zn.zmn.zmn = zmnVar;
        }
    }
}
