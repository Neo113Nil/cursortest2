package com.bytedance.sdk.component.btk.fs.zn;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.btk.iqz;
import com.bytedance.sdk.component.btk.kgc;
import com.bytedance.sdk.component.btk.mw;
import com.bytedance.sdk.component.btk.olo;
import com.bytedance.sdk.component.btk.phc;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public class hhw {
    private Context bvs;
    private volatile kgc fb;
    private final mw fs;
    private com.bytedance.sdk.component.btk.fb hhw;
    private ExecutorService nps;
    private ExecutorService zg;
    private volatile olo zn;
    private Map<String, List<zn>> zmn = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.btk.zn> btk = new ConcurrentHashMap();

    public hhw(Context context, mw mwVar) {
        this.fs = (mw) nps.zmn(mwVar);
        this.bvs = context;
        com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zmn(context, mwVar.btk());
    }

    public Context zmn() {
        return this.bvs;
    }

    public boolean fs() {
        return this.fs.nps();
    }

    public kgc zn() {
        return this.fb;
    }

    public Collection<com.bytedance.sdk.component.btk.zn> fb() {
        return this.btk.values();
    }

    public olo zmn(com.bytedance.sdk.component.btk.fs fsVar) {
        if (fsVar == null) {
            fsVar = com.bytedance.sdk.component.btk.fs.zn.zmn.fs.bvs();
        }
        if (this.zn == null) {
            synchronized (com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zn.class) {
                try {
                    if (this.zn == null) {
                        this.zn = new com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zn(new com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zmn(fsVar.fs(), fsVar.zn()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zn;
    }

    public kgc fs(com.bytedance.sdk.component.btk.fs fsVar) {
        if (fsVar == null) {
            fsVar = com.bytedance.sdk.component.btk.fs.zn.zmn.fs.bvs();
        }
        if (this.fb == null) {
            synchronized (com.bytedance.sdk.component.btk.fs.zn.zmn.fs.fs.class) {
                try {
                    if (this.fb == null) {
                        this.fb = new com.bytedance.sdk.component.btk.fs.zn.zmn.fs.fs(fsVar.fs(), fsVar.fb());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.fb;
    }

    public com.bytedance.sdk.component.btk.zn zn(com.bytedance.sdk.component.btk.fs fsVar) {
        if (fsVar == null) {
            fsVar = com.bytedance.sdk.component.btk.fs.zn.zmn.fs.bvs();
        }
        String file = fsVar.zg().toString();
        com.bytedance.sdk.component.btk.zn znVar = this.btk.get(file);
        if (znVar != null) {
            return znVar;
        }
        com.bytedance.sdk.component.btk.zn fb = fb(fsVar);
        this.btk.put(file, fb);
        return fb;
    }

    public com.bytedance.sdk.component.btk.zn zmn(String str) {
        return zn(com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zmn(new File(str)));
    }

    private com.bytedance.sdk.component.btk.zn fb(com.bytedance.sdk.component.btk.fs fsVar) {
        com.bytedance.sdk.component.btk.zn fb = this.fs.fb();
        return fb != null ? fb : new com.bytedance.sdk.component.btk.fs.zn.zmn.zmn.fs(fsVar.zg(), fsVar.zmn());
    }

    public com.bytedance.sdk.component.btk.fb btk() {
        if (this.hhw == null) {
            this.hhw = iv();
        }
        return this.hhw;
    }

    private com.bytedance.sdk.component.btk.fb iv() {
        com.bytedance.sdk.component.btk.fb zn = this.fs.zn();
        return zn == null ? new com.bytedance.sdk.component.btk.zmn.zmn() : zn;
    }

    public ExecutorService hhw() {
        ExecutorService zmn;
        iqz fs = this.fs.fs();
        if (fs != null && (zmn = fs.zmn()) != null) {
            return zmn;
        }
        if (this.nps == null) {
            this.nps = rc();
        }
        return this.nps;
    }

    public phc nps() {
        mw mwVar = this.fs;
        if (mwVar != null) {
            return mwVar.hhw();
        }
        return null;
    }

    public ExecutorService zg() {
        ExecutorService fs;
        iqz fs2 = this.fs.fs();
        if (fs2 != null && (fs = fs2.fs()) != null) {
            return fs;
        }
        if (this.zg == null) {
            this.zg = com.bytedance.sdk.component.btk.fs.zmn.fs.zmn();
        }
        return this.zg;
    }

    private ExecutorService rc() {
        ExecutorService zmn = this.fs.zmn();
        return zmn != null ? zmn : com.bytedance.sdk.component.btk.fs.zmn.fs.zmn();
    }

    public Map<String, List<zn>> bvs() {
        return this.zmn;
    }

    public com.bytedance.sdk.component.btk.fs.zn.fs.fs zmn(zn znVar) {
        ImageView.ScaleType bvs = znVar.bvs();
        if (bvs == null) {
            bvs = com.bytedance.sdk.component.btk.fs.zn.fs.fs.zmn;
        }
        ImageView.ScaleType scaleType = bvs;
        Bitmap.Config iv = znVar.iv();
        if (iv == null) {
            iv = com.bytedance.sdk.component.btk.fs.zn.fs.fs.fs;
        }
        return new com.bytedance.sdk.component.btk.fs.zn.fs.fs(znVar.fs(), znVar.zn(), scaleType, iv, znVar.fb(), znVar.btk());
    }
}
