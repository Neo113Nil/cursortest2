package com.bytedance.sdk.component.btk.fs.zn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import com.bytedance.sdk.component.btk.bvs;
import com.bytedance.sdk.component.btk.cyb;
import com.bytedance.sdk.component.btk.iv;
import com.bytedance.sdk.component.btk.kw;
import com.bytedance.sdk.component.btk.phc;
import com.bytedance.sdk.component.btk.rc;
import com.bytedance.sdk.component.btk.rt;
import com.bytedance.sdk.component.btk.zg;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public class zn implements bvs {
    private byte[] am;
    private int bjh;
    private cyb btk;
    private int bvs;
    private boolean cn;
    private kw cyb;
    private hhw doe;
    private String fb;
    private String fs;
    private ImageView.ScaleType hhw;
    private com.bytedance.sdk.component.btk.nps iqz;
    private zg iv;
    private final Handler kgc;
    private boolean kjb;
    private WeakReference<ImageView> klz;
    private boolean kw;
    private volatile boolean mw;
    private Bitmap.Config nps;
    private com.bytedance.sdk.component.btk.fs nqi;
    private int olo;
    private int phc;
    private int rc;
    private ExecutorService rp;
    private boolean rt;
    private int uqh;
    private rt zak;
    private int zg;
    Future<?> zmn;
    private String zn;

    private zn(fs fsVar) {
        this.kgc = new Handler(Looper.getMainLooper());
        this.kw = true;
        this.am = null;
        this.fs = fsVar.fb;
        this.btk = new zmn(fsVar.zmn);
        this.klz = new WeakReference<>(fsVar.fs);
        this.hhw = fsVar.btk;
        this.nps = fsVar.hhw;
        this.zg = fsVar.nps;
        this.bvs = fsVar.zg;
        this.rc = fsVar.bvs;
        this.olo = fsVar.iv;
        this.cyb = fsVar.rc;
        this.nqi = zmn(fsVar);
        if (!TextUtils.isEmpty(fsVar.zn)) {
            fs(fsVar.zn);
            zmn(fsVar.zn);
        }
        this.rt = fsVar.klz;
        this.cn = fsVar.mw;
        this.doe = fsVar.cyb;
        this.iv = fsVar.olo;
        this.bjh = fsVar.kw;
        this.uqh = fsVar.kgc;
        this.rp = fsVar.iqz;
        this.kjb = fsVar.phc;
        this.zak = fsVar.doe;
    }

    private com.bytedance.sdk.component.btk.fs zmn(fs fsVar) {
        if (fsVar.cn != null) {
            return fsVar.cn;
        }
        if (!TextUtils.isEmpty(fsVar.rt)) {
            return com.bytedance.sdk.component.btk.fs.zn.zmn.fs.zmn(new File(fsVar.rt));
        }
        return com.bytedance.sdk.component.btk.fs.zn.zmn.fs.bvs();
    }

    public int fb() {
        return this.uqh;
    }

    public int btk() {
        return this.bjh;
    }

    @Override // com.bytedance.sdk.component.btk.bvs
    public String zmn() {
        return this.fs;
    }

    public cyb hhw() {
        return this.btk;
    }

    public String nps() {
        return this.fb;
    }

    public void zmn(String str) {
        this.fb = str;
    }

    public String zg() {
        return this.zn;
    }

    public void fs(String str) {
        WeakReference<ImageView> weakReference = this.klz;
        if (weakReference != null && weakReference.get() != null) {
            this.klz.get().setTag(1094453505, str);
        }
        this.zn = str;
    }

    public ImageView.ScaleType bvs() {
        return this.hhw;
    }

    public Bitmap.Config iv() {
        return this.nps;
    }

    @Override // com.bytedance.sdk.component.btk.bvs
    public int fs() {
        return this.zg;
    }

    @Override // com.bytedance.sdk.component.btk.bvs
    public int zn() {
        return this.bvs;
    }

    public int rc() {
        return this.rc;
    }

    public void zmn(boolean z) {
        this.kw = z;
    }

    public boolean klz() {
        return this.kw;
    }

    public void zmn(byte[] bArr) {
        this.am = bArr;
    }

    public byte[] mw() {
        return this.am;
    }

    public com.bytedance.sdk.component.btk.nps rt() {
        return this.iqz;
    }

    public int cn() {
        return this.phc;
    }

    public void zmn(int i) {
        this.phc = i;
    }

    public hhw cyb() {
        return this.doe;
    }

    public com.bytedance.sdk.component.btk.fs olo() {
        return this.nqi;
    }

    public rt kgc() {
        return this.zak;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bvs iqz() {
        try {
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        if (this.doe == null) {
            cyb cybVar = this.btk;
            if (cybVar != null) {
                cybVar.zmn(1005, "not init !", null);
            }
            return this;
        }
        String zmn2 = zmn();
        if (TextUtils.isEmpty(zmn2)) {
            this.btk.zmn(2000, "url is empty", null);
            return this;
        }
        phc nps = this.doe.nps();
        if (!zmn2.startsWith(d.v) && !zmn2.startsWith(d.u) && nps != null) {
            nps.zmn(1006, "url is not validate ".concat(zmn2));
        }
        ExecutorService hhw = this.rp == null ? this.doe.hhw() : null;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.zn.1
            @Override // java.lang.Runnable
            public void run() {
                zn znVar = zn.this;
                com.bytedance.sdk.component.btk.fs.zn.zmn zmnVar = new com.bytedance.sdk.component.btk.fs.zn.zmn(znVar, znVar.cyb);
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.bytedance.sdk.component.btk.fs.fs.fs());
                    arrayList.add(new com.bytedance.sdk.component.btk.fs.fs.btk());
                    arrayList.add(new com.bytedance.sdk.component.btk.fs.fs.zmn());
                    arrayList.add(new com.bytedance.sdk.component.btk.fs.fs.zn());
                    arrayList.add(new com.bytedance.sdk.component.btk.fs.fs.fb());
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (zn.this.mw) {
                            zmnVar.zmn(1003, "canceled", null);
                            return;
                        }
                        com.bytedance.sdk.component.btk.fs.fs.hhw hhwVar = (com.bytedance.sdk.component.btk.fs.fs.hhw) arrayList.get(i);
                        if (zn.this.cyb != null && hhwVar != null && !"data_intercept".equals(hhwVar.zmn())) {
                            zn.this.cyb.zmn(hhwVar.zmn(), zn.this);
                        }
                        zn znVar2 = zn.this;
                        boolean zmn3 = hhwVar.zmn(znVar2, znVar2.cyb, zmnVar);
                        if (zn.this.cyb != null && !"data_intercept".equals(hhwVar.zmn())) {
                            zn.this.cyb.fs(hhwVar.zmn(), zn.this);
                        }
                        if (!zmn3) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    zmnVar.zmn(2000, th.getMessage(), th);
                }
            }
        };
        if (this.kjb) {
            runnable.run();
        } else {
            ExecutorService executorService = this.rp;
            if (executorService != null) {
                this.zmn = executorService.submit(runnable);
            } else if (hhw != null) {
                this.zmn = hhw.submit(runnable);
            }
        }
        return this;
    }

    public String kw() {
        return zg() + rc();
    }

    public static class fs implements iv {
        private ImageView.ScaleType btk;
        private com.bytedance.sdk.component.btk.fs cn;
        private hhw cyb;
        private rt doe;
        private String fb;
        private ImageView fs;
        private Bitmap.Config hhw;
        private ExecutorService iqz;
        private int kgc;
        private boolean klz;
        private int kw;
        private boolean mw;
        private int nps;
        private zg olo;
        private boolean phc;
        private kw rc;
        private String rt;
        private int zg;
        private cyb zmn;
        private String zn;
        private int bvs = 1;
        private int iv = 5;

        public fs(hhw hhwVar) {
            this.cyb = hhwVar;
        }

        public iv zn(String str) {
            this.fb = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(String str) {
            this.zn = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(ImageView.ScaleType scaleType) {
            this.btk = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(Bitmap.Config config) {
            this.hhw = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(int i) {
            this.nps = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv fs(int i) {
            this.zg = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zn(int i) {
            this.bvs = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(kw kwVar) {
            this.rc = kwVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(boolean z) {
            this.mw = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv fs(String str) {
            this.rt = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public bvs zmn(cyb cybVar, int i) {
            this.iv = i;
            return zmn(cybVar);
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public bvs zmn(cyb cybVar) {
            this.zmn = cybVar;
            return new zn(this).iqz();
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public bvs zmn(ImageView imageView) {
            this.fs = imageView;
            return new zn(this).iqz();
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv zmn(zg zgVar) {
            this.olo = zgVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv fb(int i) {
            this.kgc = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.btk.iv
        public iv btk(int i) {
            this.kw = i;
            return this;
        }
    }

    private class zmn implements cyb {
        private cyb fs;

        public zmn(cyb cybVar) {
            this.fs = cybVar;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(final rc rcVar) {
            Bitmap zmn;
            final ImageView imageView = (ImageView) zn.this.klz.get();
            if (imageView != null && zn.this.rc != 3 && zmn(imageView)) {
                Object fs = rcVar.fs();
                if (fs instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) rcVar.fs();
                    zn.this.kgc.post(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.zn.zmn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (fs instanceof Drawable) {
                    final Drawable drawable = (Drawable) rcVar.fs();
                    zn.this.kgc.post(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.zn.zmn.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && fs$$ExternalSyntheticApiModelOutline0.m(drawable)) {
                                zn$$ExternalSyntheticApiModelOutline0.m(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (zn.this.iv != null && (rcVar.fs() instanceof Bitmap) && (zmn = zn.this.iv.zmn((Bitmap) rcVar.fs())) != null) {
                    rcVar.zmn(zmn);
                }
            } catch (Throwable unused) {
            }
            if (zn.this.olo == 5) {
                zn.this.kgc.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.zn.zmn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zmn.this.fs != null) {
                            zmn.this.fs.zmn(rcVar);
                        }
                    }
                });
                return;
            }
            cyb cybVar = this.fs;
            if (cybVar != null) {
                cybVar.zmn(rcVar);
            }
        }

        private boolean zmn(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(zn.this.zn)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.btk.cyb
        public void zmn(final int i, final String str, final Throwable th) {
            if (zn.this.olo == 5) {
                zn.this.kgc.post(new Runnable() { // from class: com.bytedance.sdk.component.btk.fs.zn.zn.zmn.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zmn.this.fs != null) {
                            zmn.this.fs.zmn(i, str, th);
                        }
                    }
                });
                return;
            }
            cyb cybVar = this.fs;
            if (cybVar != null) {
                cybVar.zmn(i, str, th);
            }
        }
    }
}
