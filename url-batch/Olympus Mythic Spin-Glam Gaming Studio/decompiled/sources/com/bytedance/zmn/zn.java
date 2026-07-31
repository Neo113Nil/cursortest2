package com.bytedance.zmn;

import android.content.Context;
import com.bytedance.zmn.zmn.hhw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class zn {

    public interface fb {
        ExecutorService fs();

        ExecutorService zmn();
    }

    public interface fs<T extends com.bytedance.zmn.zmn> {
        void zmn(ArrayList<T> arrayList, boolean z);
    }

    public interface zmn {
        byte[] fs(byte[] bArr);

        byte[] zmn(byte[] bArr);
    }

    /* renamed from: com.bytedance.zmn.zn$zn, reason: collision with other inner class name */
    public interface InterfaceC0213zn {
        long zmn();

        void zmn(String str);
    }

    public static com.bytedance.zmn.fb zmn(Context context, btk btkVar) {
        hhw.zmn(context);
        return new com.bytedance.zmn.zmn.fs(context, btkVar);
    }

    public static void zmn(boolean z) {
        com.bytedance.zmn.zmn.zmn.zmn(z);
    }

    public static abstract class btk {
        private zmn btk;
        private boolean fb;
        private boolean hhw;
        private boolean klz;
        private fb nps;
        private boolean zg;
        private final String zn;
        private final HashMap<Class<? extends com.bytedance.zmn.zmn>, com.bytedance.zmn.fs<? extends com.bytedance.zmn.zmn>> zmn = new HashMap<>();
        private final HashSet<String> fs = new HashSet<>();
        private long bvs = 3000;
        private int iv = 2;
        private boolean rc = false;

        public abstract boolean zmn();

        public btk(String str) {
            this.zn = str;
        }

        public fb fs() {
            return this.nps;
        }

        public final btk zmn(fb fbVar) {
            if (this.fb) {
                return this;
            }
            this.nps = fbVar;
            return this;
        }

        public final String zn() {
            return this.zn;
        }

        public final zmn fb() {
            return this.btk;
        }

        public final btk zmn(zmn zmnVar) {
            if (this.fb) {
                return this;
            }
            this.btk = zmnVar;
            return this;
        }

        public final btk zmn(Class<? extends com.bytedance.zmn.zmn> cls, com.bytedance.zmn.fs<? extends com.bytedance.zmn.zmn> fsVar) {
            if (!this.fb && cls != null && fsVar != null) {
                String fb = fsVar.fb();
                if (this.fs.contains(fb)) {
                    return this;
                }
                this.fs.add(fb);
                this.zmn.put(cls, fsVar);
            }
            return this;
        }

        public final HashMap<Class<? extends com.bytedance.zmn.zmn>, com.bytedance.zmn.fs<? extends com.bytedance.zmn.zmn>> btk() {
            return this.zmn;
        }

        public final boolean hhw() {
            return this.hhw;
        }

        public final btk zmn(boolean z) {
            if (this.fb) {
                return this;
            }
            this.hhw = z;
            return this;
        }

        public final void fs(boolean z) {
            this.fb = z;
        }

        public final btk zn(boolean z) {
            if (this.fb) {
                return this;
            }
            this.zg = z;
            return this;
        }

        public long nps() {
            return this.bvs;
        }

        public btk zmn(long j) {
            if (this.fb) {
                return this;
            }
            this.bvs = j;
            return this;
        }

        public int zg() {
            return this.iv;
        }

        public btk zmn(int i) {
            if (this.fb) {
                return this;
            }
            this.iv = i;
            return this;
        }

        public boolean bvs() {
            return this.rc;
        }

        public void fb(boolean z) {
            if (this.fb) {
                return;
            }
            this.rc = z;
        }

        public boolean iv() {
            return this.klz;
        }

        public btk btk(boolean z) {
            if (this.fb) {
                return this;
            }
            this.klz = z;
            return this;
        }
    }
}
