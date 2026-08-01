package com.bytedance.sdk.component.NB.vG;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import androidx.core.view.PointerIconCompat;
import com.bytedance.sdk.component.NB.IP;
import com.bytedance.sdk.component.NB.Mxy;
import com.bytedance.sdk.component.NB.Wyp;
import com.bytedance.sdk.component.NB.mnm;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.NB.uc;
import com.facebook.ads.AdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ImageRequest.java */
/* loaded from: classes.dex */
public class vG implements Mxy {
    private int CvL;
    private boolean Gp;
    private boolean IP;
    private String Jd;
    private volatile boolean Ju;
    private int Mxy;
    private mnm NB;
    private int OT;
    private com.bytedance.sdk.component.NB.so Wyp;
    private com.bytedance.sdk.component.NB.vG.pvs ZhG;
    private ExecutorService ae;
    private boolean bNS;
    private Queue<com.bytedance.sdk.component.NB.Jd.Mxy> cR;
    private int dX;
    private com.bytedance.sdk.component.NB.icD dyT;
    private boolean gA;
    private String icD;
    private IP jlb;
    private WeakReference<ImageView> kj;
    private uc mnm;
    private sUS ny;
    Future<?> pvs;
    private int qh;
    private com.bytedance.sdk.component.NB.yiw rCZ;
    private ImageView.ScaleType sUS;
    private int so;
    private boolean uc;
    private int vA;
    private String vG;
    private Bitmap.Config yiw;
    private final Handler zM;

    private vG(icD icd) {
        this.cR = new LinkedBlockingQueue();
        this.zM = new Handler(Looper.getMainLooper());
        this.uc = true;
        this.icD = icd.Jd;
        this.NB = new pvs(icd.pvs);
        this.kj = new WeakReference<>(icd.icD);
        this.sUS = icd.NB;
        this.yiw = icd.sUS;
        this.so = icd.yiw;
        this.Mxy = icd.so;
        this.qh = icd.Mxy;
        this.vA = icd.Wyp;
        this.mnm = icd.qh;
        this.dyT = pvs(icd);
        if (!TextUtils.isEmpty(icd.vG)) {
            icD(icd.vG);
            pvs(icd.vG);
        }
        this.IP = icd.kj;
        this.bNS = icd.Ju;
        this.ny = icd.mnm;
        this.Wyp = icd.vA;
        this.CvL = icd.zM;
        this.dX = icd.cR;
        this.ae = icd.rCZ;
        this.Gp = icd.uc;
        this.gA = icd.OT;
        this.jlb = icd.ny;
        this.cR.add(new com.bytedance.sdk.component.NB.Jd.vG());
    }

    private com.bytedance.sdk.component.NB.icD pvs(icD icd) {
        if (icd.bNS != null) {
            return icd.bNS;
        }
        if (!TextUtils.isEmpty(icd.IP)) {
            return com.bytedance.sdk.component.NB.vG.pvs.pvs.pvs(new File(icd.IP));
        }
        return com.bytedance.sdk.component.NB.vG.pvs.pvs.yiw();
    }

    public int yiw() {
        return this.dX;
    }

    public int so() {
        return this.CvL;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public String pvs() {
        return this.icD;
    }

    public mnm Mxy() {
        return this.NB;
    }

    public String Wyp() {
        return this.Jd;
    }

    public void pvs(String str) {
        this.Jd = str;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public String NB() {
        return this.vG;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public Bitmap.Config sUS() {
        return this.yiw;
    }

    public void icD(String str) {
        WeakReference<ImageView> weakReference = this.kj;
        if (weakReference != null && weakReference.get() != null) {
            this.kj.get().setTag(1094453505, str);
        }
        this.vG = str;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public ImageView.ScaleType Jd() {
        return this.sUS;
    }

    public Bitmap.Config qh() {
        return this.yiw;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public int icD() {
        return this.so;
    }

    @Override // com.bytedance.sdk.component.NB.Mxy
    public int vG() {
        return this.Mxy;
    }

    public int kj() {
        return this.qh;
    }

    public boolean Ju() {
        return this.IP;
    }

    public boolean IP() {
        return this.bNS;
    }

    public void pvs(boolean z) {
        this.uc = z;
    }

    public boolean bNS() {
        return this.uc;
    }

    public com.bytedance.sdk.component.NB.yiw mnm() {
        return this.rCZ;
    }

    public void pvs(com.bytedance.sdk.component.NB.yiw yiwVar) {
        this.rCZ = yiwVar;
    }

    public int vA() {
        return this.OT;
    }

    public void pvs(int i) {
        this.OT = i;
    }

    public com.bytedance.sdk.component.NB.vG.pvs cR() {
        return this.ZhG;
    }

    public void pvs(com.bytedance.sdk.component.NB.vG.pvs pvsVar) {
        this.ZhG = pvsVar;
    }

    public sUS zM() {
        return this.ny;
    }

    public com.bytedance.sdk.component.NB.icD uc() {
        return this.dyT;
    }

    public boolean pvs(com.bytedance.sdk.component.NB.Jd.Mxy mxy) {
        if (this.Ju) {
            return false;
        }
        return this.cR.add(mxy);
    }

    public boolean rCZ() {
        return this.Gp;
    }

    public IP OT() {
        return this.jlb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mxy ZhG() {
        sUS sus;
        try {
            sus = this.ny;
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        if (sus == null) {
            mnm mnmVar = this.NB;
            if (mnmVar != null) {
                mnmVar.pvs(1005, "not init !", null);
            }
            return this;
        }
        ExecutorService sUS = this.ae == null ? sus.sUS() : null;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.NB.vG.vG.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.NB.Jd.Mxy mxy;
                while (!vG.this.Ju && (mxy = (com.bytedance.sdk.component.NB.Jd.Mxy) vG.this.cR.poll()) != null) {
                    try {
                        if (vG.this.mnm != null) {
                            vG.this.mnm.pvs(mxy.pvs(), vG.this);
                        }
                        mxy.pvs(vG.this);
                        if (vG.this.mnm != null) {
                            vG.this.mnm.icD(mxy.pvs(), vG.this);
                        }
                    } catch (Throwable th) {
                        vG.this.pvs(AdError.SERVER_ERROR_CODE, th.getMessage(), th);
                        if (vG.this.mnm != null) {
                            vG.this.mnm.icD("exception", vG.this);
                            return;
                        }
                        return;
                    }
                }
                if (vG.this.Ju) {
                    vG.this.pvs(PointerIconCompat.TYPE_HELP, "canceled", null);
                }
            }
        };
        if (this.gA) {
            runnable.run();
        } else {
            ExecutorService executorService = this.ae;
            if (executorService != null) {
                this.pvs = executorService.submit(runnable);
            } else if (sUS != null) {
                this.pvs = sUS.submit(runnable);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(int i, String str, Throwable th) {
        new com.bytedance.sdk.component.NB.Jd.so(i, str, th).pvs(this);
        this.cR.clear();
    }

    public String ny() {
        return NB() + kj();
    }

    /* compiled from: ImageRequest.java */
    public static class icD implements Wyp {
        private String IP;
        private String Jd;
        private boolean Ju;
        private ImageView.ScaleType NB;
        private boolean OT;
        private com.bytedance.sdk.component.NB.icD bNS;
        private int cR;
        private ImageView icD;
        private boolean kj;
        private sUS mnm;
        private IP ny;
        private mnm pvs;
        private uc qh;
        private ExecutorService rCZ;
        private Bitmap.Config sUS;
        private int so;
        private boolean uc;
        private com.bytedance.sdk.component.NB.so vA;
        private String vG;
        private int yiw;
        private int zM;
        private int Mxy = 1;
        private int Wyp = 5;

        public icD(sUS sus) {
            this.mnm = sus;
        }

        public Wyp vG(String str) {
            this.Jd = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(String str) {
            this.vG = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(ImageView.ScaleType scaleType) {
            this.NB = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(Bitmap.Config config) {
            this.sUS = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(int i) {
            this.yiw = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp icD(int i) {
            this.so = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp vG(int i) {
            this.Mxy = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(uc ucVar) {
            this.qh = ucVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(boolean z) {
            this.Ju = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp icD(String str) {
            this.IP = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Mxy pvs(mnm mnmVar, int i) {
            this.Wyp = i;
            return pvs(mnmVar);
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Mxy pvs(mnm mnmVar) {
            this.pvs = mnmVar;
            return new vG(this).ZhG();
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Mxy pvs(ImageView imageView) {
            this.icD = imageView;
            return new vG(this).ZhG();
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp pvs(com.bytedance.sdk.component.NB.so soVar) {
            this.vA = soVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp Jd(int i) {
            this.cR = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.NB.Wyp
        public Wyp NB(int i) {
            this.zM = i;
            return this;
        }
    }

    /* compiled from: ImageRequest.java */
    private class pvs implements mnm {
        private mnm icD;

        public pvs(mnm mnmVar) {
            this.icD = mnmVar;
        }

        @Override // com.bytedance.sdk.component.NB.mnm
        public void pvs(final qh qhVar) {
            final ImageView imageView = (ImageView) vG.this.kj.get();
            if (imageView != null && vG.this.qh != 3 && pvs(imageView) && (qhVar.icD() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) qhVar.icD();
                vG.this.zM.post(new Runnable() { // from class: com.bytedance.sdk.component.NB.vG.vG.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (vG.this.Wyp != null && (qhVar.icD() instanceof Bitmap)) {
                    com.bytedance.sdk.component.NB.so soVar = vG.this.Wyp;
                    Bitmap bitmap2 = (Bitmap) qhVar.icD();
                    Bitmap bitmap3 = bitmap2;
                    Bitmap pvs = soVar.pvs(bitmap2);
                    if (pvs != null) {
                        qhVar.pvs(pvs);
                    }
                }
            } catch (Throwable unused) {
            }
            if (vG.this.vA == 5) {
                vG.this.zM.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.NB.vG.vG.pvs.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.icD != null) {
                            pvs.this.icD.pvs(qhVar);
                        }
                    }
                });
                return;
            }
            mnm mnmVar = this.icD;
            if (mnmVar != null) {
                mnmVar.pvs(qhVar);
            }
        }

        private boolean pvs(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(vG.this.vG)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.NB.mnm
        public void pvs(final int i, final String str, final Throwable th) {
            if (vG.this.vA == 5) {
                vG.this.zM.post(new Runnable() { // from class: com.bytedance.sdk.component.NB.vG.vG.pvs.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.icD != null) {
                            pvs.this.icD.pvs(i, str, th);
                        }
                    }
                });
                return;
            }
            mnm mnmVar = this.icD;
            if (mnmVar != null) {
                mnmVar.pvs(i, str, th);
            }
        }
    }
}
