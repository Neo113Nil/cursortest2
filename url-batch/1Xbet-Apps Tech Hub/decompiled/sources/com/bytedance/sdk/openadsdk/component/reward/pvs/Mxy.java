package com.bytedance.sdk.openadsdk.component.reward.pvs;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* compiled from: RewardFullScreenManager.java */
/* loaded from: classes2.dex */
public class Mxy {
    private pvs Jd;
    private final com.bytedance.sdk.openadsdk.component.reward.pvs.pvs icD;
    protected int pvs;
    private boolean vG = true;

    public Mxy(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        this.pvs = 0;
        this.icD = pvsVar;
        vG();
        if (pvsVar.pvs == 2) {
            return;
        }
        try {
            this.pvs = Pj.vG(pvsVar.od, Pj.pvs());
            if (!pvsVar.od.getWindow().hasFeature(1)) {
                pvsVar.od.requestWindowFeature(1);
            }
            pvsVar.od.getWindow().addFlags(16777344);
            if (pvsVar.cnN == 2 || !Pj.vG(pvsVar.od)) {
                pvsVar.od.getWindow().addFlags(1024);
            }
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    public void pvs(dyT dyt) {
        if (dyt == null) {
            return;
        }
        dyt.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Mxy.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = Mxy.this.icD.od.getWindow().getDecorView();
                    if (decorView == null || (findViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    findViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private void vG() {
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar = this.icD;
        pvsVar.OyE = pvsVar.icD.UYh();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.icD.od.getResources().getConfiguration().orientation == 1) {
                this.icD.cnN = 1;
                return;
            } else {
                this.icD.cnN = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar2 = this.icD;
        pvsVar2.cnN = pvsVar2.icD.rcB();
    }

    public void pvs(boolean z) {
        float min;
        float max;
        int max2;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Jd();
                } catch (Throwable unused) {
                }
            } else {
                Jd();
            }
        }
        float NB = NB();
        float sUS = sUS();
        if (this.icD.cnN == 2) {
            min = Math.max(NB, sUS);
            max = Math.min(NB, sUS);
        } else {
            min = Math.min(NB, sUS);
            max = Math.max(NB, sUS);
        }
        Activity activity = this.icD.od;
        int vG = Pj.vG(activity, Pj.pvs());
        if (this.icD.cnN != 2) {
            if (Pj.vG(activity)) {
                max -= vG;
            }
        } else if (Pj.vG(activity)) {
            min -= vG;
        }
        if (z) {
            this.icD.joF = (int) min;
            this.icD.thO = (int) max;
            return;
        }
        int i3 = 20;
        if (this.icD.cnN != 2) {
            if (this.icD.OyE != 0.0f && this.icD.OyE != 100.0f) {
                i = (int) Math.max((max - (((min - 20.0f) - 20.0f) / this.icD.OyE)) / 2.0f, 0.0f);
                i2 = i;
                max2 = 20;
            }
            i3 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        } else {
            if (this.icD.OyE != 0.0f && this.icD.OyE != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * this.icD.OyE)) / 2.0f, 0.0f);
                i = 20;
                i2 = 20;
                i3 = max2;
            }
            i3 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        }
        float f = i3;
        float f2 = max2;
        this.icD.joF = (int) ((min - f) - f2);
        float f3 = i;
        float f4 = i2;
        this.icD.thO = (int) ((max - f3) - f4);
        activity.getWindow().getDecorView().setPadding(Pj.icD(activity, f), Pj.icD(activity, f3), Pj.icD(activity, f2), Pj.icD(activity, f4));
    }

    public void icD(dyT dyt) {
        try {
            final boolean z = true;
            final boolean z2 = this.vG && com.bytedance.sdk.openadsdk.core.mnm.Jd().qD() == 1;
            if (!this.vG || !Pj.vG(this.icD.od)) {
                z = false;
            }
            if (z || z2) {
                if (this.Jd == null) {
                    this.Jd = new pvs() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Mxy.2
                        boolean pvs;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:7:0x006a, B:9:0x0088, B:11:0x0097, B:13:0x00ab, B:14:0x00af, B:15:0x00e3, B:17:0x00e9, B:18:0x00ee, B:20:0x00fc, B:24:0x00b2, B:26:0x00bc, B:28:0x00d0, B:30:0x00d4, B:31:0x00da, B:33:0x00de, B:34:0x0102, B:36:0x0106, B:39:0x0045), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                        @Override // com.bytedance.sdk.openadsdk.component.reward.pvs.Mxy.pvs
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        void pvs(int i, int i2) {
                            int abs;
                            float pvs2;
                            try {
                                if (Mxy.this.icD.cnN != 2 || Mxy.this.icD.od.getResources().getConfiguration().orientation != 2) {
                                    abs = Math.abs(Pj.Mxy(Mxy.this.icD.od) - Mxy.this.icD.od.getWindow().getDecorView().getHeight());
                                } else {
                                    abs = Math.abs(Pj.Wyp(Mxy.this.icD.od) - Mxy.this.icD.od.getWindow().getDecorView().getWidth());
                                }
                                View decorView = Mxy.this.icD.od.getWindow().getDecorView();
                                int paddingLeft = decorView.getPaddingLeft();
                                int paddingRight = decorView.getPaddingRight();
                                int paddingBottom = decorView.getPaddingBottom();
                                if (abs == 0) {
                                    int paddingTop = decorView.getPaddingTop();
                                    if (Mxy.this.icD.cnN != 1 || Mxy.this.icD.od.getResources().getConfiguration().orientation != 1) {
                                        if (Mxy.this.icD.cnN == 2 && Mxy.this.icD.od.getResources().getConfiguration().orientation == 2) {
                                            if (z) {
                                                paddingLeft += (int) Pj.pvs();
                                            }
                                            if (z2) {
                                                pvs2 = Pj.pvs();
                                            }
                                        }
                                        if (decorView.isAttachedToWindow()) {
                                            decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                            this.pvs = true;
                                        }
                                        if (Mxy.this.icD.OyE != 100.0f) {
                                            decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                            return;
                                        }
                                        return;
                                    }
                                    pvs2 = Pj.pvs();
                                    paddingTop += (int) pvs2;
                                    if (decorView.isAttachedToWindow()) {
                                    }
                                    if (Mxy.this.icD.OyE != 100.0f) {
                                    }
                                } else if (this.pvs) {
                                    decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                    this.pvs = false;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    };
                }
                this.icD.od.getWindow().getDecorView().addOnLayoutChangeListener(this.Jd);
            }
            this.vG = false;
        } catch (Exception unused) {
        }
    }

    public float[] pvs(int i) {
        Activity activity = this.icD.od;
        View decorView = activity.getWindow().getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = Pj.vG(activity, fArr[0]);
        float vG = Pj.vG(activity, fArr[1]);
        fArr[1] = vG;
        if (fArr[0] < 10.0f || vG < 10.0f) {
            fArr = icD(this.pvs);
        }
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                if (i == 2) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    if (f < f2) {
                        fArr[1] = f;
                        fArr[0] = f2;
                    }
                } else {
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    if (f3 > f4) {
                        fArr[1] = f3;
                        fArr[0] = f4;
                    }
                }
            }
        }
        return fArr;
    }

    public void pvs() {
        Pj.pvs(this.icD.od);
        this.icD.od.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Mxy.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (Mxy.this.icD.od.isFinishing()) {
                            return;
                        }
                        Mxy.this.icD.od.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pvs.Mxy.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Pj.pvs(Mxy.this.icD.od);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.Ju.pvs("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private float[] icD(int i) {
        float sUS = sUS();
        float NB = NB();
        if ((this.icD.cnN == 1) != (sUS > NB)) {
            float f = sUS + NB;
            NB = f - NB;
            sUS = f - NB;
        }
        if (this.icD.cnN == 1) {
            sUS -= i;
        } else {
            NB -= i;
        }
        return new float[]{NB, sUS};
    }

    private void Jd() {
        if (this.icD.cnN == 2) {
            if (this.icD.qd) {
                this.icD.od.setRequestedOrientation(8);
                return;
            } else {
                this.icD.od.setRequestedOrientation(0);
                return;
            }
        }
        this.icD.od.setRequestedOrientation(1);
    }

    private float NB() {
        return Pj.vG(this.icD.od, Pj.Wyp(this.icD.od));
    }

    private float sUS() {
        return Pj.vG(this.icD.od, Pj.Mxy(this.icD.od));
    }

    public void icD() {
        if (this.Jd != null) {
            this.icD.od.getWindow().getDecorView().removeOnLayoutChangeListener(this.Jd);
            this.Jd = null;
        }
    }

    /* compiled from: RewardFullScreenManager.java */
    private static abstract class pvs implements View.OnLayoutChangeListener {
        private int icD;
        private int pvs;

        abstract void pvs(int i, int i2);

        private pvs() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.pvs && i10 == this.icD) {
                return;
            }
            this.pvs = i9;
            this.icD = i10;
            pvs(i9, i10);
        }
    }
}
