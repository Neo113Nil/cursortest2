package com.bytedance.sdk.component.nps;

import android.os.Bundle;
import com.bytedance.sdk.component.fs.zmn.rc;
import com.bytedance.sdk.component.fs.zmn.zg;
import com.bytedance.sdk.component.fs.zmn.zmn.zmn.btk;
import com.bytedance.sdk.component.nps.zn.fb;
import com.bytedance.sdk.openadsdk.kgc.fb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class zmn {
    private static zn fs;
    private static btk zmn;
    private rc zn;

    public interface fs {
        void fs(fb fbVar);

        void zmn(fb fbVar);

        void zn(fb fbVar);
    }

    public interface zn {
        boolean fs();

        void zmn(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3);

        boolean zmn();
    }

    private zmn(C0134zmn c0134zmn) {
        rc.zmn zmnVar = new rc.zmn();
        long j = c0134zmn.zmn;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rc.zmn fs2 = zmnVar.zmn(j, timeUnit).zn(c0134zmn.zn, timeUnit).fs(c0134zmn.fs, timeUnit);
        List<zg> list = c0134zmn.btk;
        if (list != null && list.size() > 0) {
            Iterator<zg> it = c0134zmn.btk.iterator();
            while (it.hasNext()) {
                fs2.zmn(it.next());
            }
        }
        if (c0134zmn.nps != null) {
            Bundle unused = c0134zmn.nps;
        }
        Set unused2 = c0134zmn.hhw;
        fs2.zmn(c0134zmn.fb);
        this.zn = fs2.zmn();
    }

    public static void zmn() {
        com.bytedance.sdk.component.nps.zn.fb.zmn(fb.zmn.DEBUG);
    }

    public com.bytedance.sdk.component.nps.fs.fb fs() {
        return new com.bytedance.sdk.component.nps.fs.fb(this.zn);
    }

    public com.bytedance.sdk.component.nps.fs.fs zn() {
        return new com.bytedance.sdk.component.nps.fs.fs(this.zn);
    }

    public com.bytedance.sdk.component.nps.fs.zmn fb() {
        return new com.bytedance.sdk.component.nps.fs.zmn(this.zn);
    }

    public static boolean btk() {
        btk btkVar = zmn;
        if (btkVar == null) {
            return false;
        }
        return btkVar.zmn();
    }

    public static void zmn(btk btkVar) {
        zmn = btkVar;
    }

    public static boolean hhw() {
        zn znVar = fs;
        if (znVar == null) {
            return false;
        }
        return znVar.zmn();
    }

    public static void zmn(String str, String str2, String str3, int i, String str4, boolean z, int i2, int i3) {
        zn znVar = fs;
        if (znVar == null) {
            return;
        }
        znVar.zmn(str, str2, str3, i, str4, z, i2, i3);
    }

    public static boolean nps() {
        zn znVar = fs;
        if (znVar == null) {
            return false;
        }
        return znVar.fs();
    }

    public static void zmn(zn znVar) {
        fs = znVar;
    }

    public rc zg() {
        return this.zn;
    }

    /* renamed from: com.bytedance.sdk.component.nps.zmn$zmn, reason: collision with other inner class name */
    public static final class C0134zmn {
        fs fb;
        private Set<String> hhw;
        private Bundle nps;
        final List<zg> btk = new ArrayList();
        int zmn = 10000;
        int fs = 10000;
        int zn = 10000;

        public C0134zmn zmn(boolean z) {
            return this;
        }

        public C0134zmn zmn(long j, TimeUnit timeUnit) {
            this.zmn = zmn("timeout", j, timeUnit);
            return this;
        }

        public C0134zmn fs(long j, TimeUnit timeUnit) {
            this.fs = zmn("timeout", j, timeUnit);
            return this;
        }

        public C0134zmn zn(long j, TimeUnit timeUnit) {
            this.zn = zmn("timeout", j, timeUnit);
            return this;
        }

        public C0134zmn zmn(zg zgVar) {
            this.btk.add(zgVar);
            return this;
        }

        public C0134zmn zmn(fs fsVar) {
            this.fb = fsVar;
            return this;
        }

        private static int zmn(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public zmn zmn() {
            return new zmn(this);
        }
    }
}
