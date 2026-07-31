package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.utils.kjb;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes11.dex */
public class klz {
    private int btk;
    private nqi fb;
    private boolean fs;
    private boolean hhw;
    protected int zmn;
    private Activity zn;

    private static boolean zmn(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    public klz(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this(fsVar.nu, fsVar.fs, fsVar.kra, fsVar.es, fsVar.tet, fsVar);
    }

    public klz(Activity activity, nqi nqiVar, int i, boolean z, boolean z2, com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        this.zmn = 0;
        this.zn = activity;
        this.fb = nqiVar;
        this.fs = z;
        this.hhw = z2;
        if (fsVar != null) {
            zmn(fsVar);
            i = fsVar.kra;
        }
        this.btk = i;
        try {
            this.zmn = jy.zn(activity, jy.zmn());
            if (!activity.getWindow().hasFeature(1)) {
                activity.requestWindowFeature(1);
            }
            activity.getWindow().addFlags(16777344);
            if (this.btk == 2 || !jy.zn(activity)) {
                activity.getWindow().addFlags(1024);
            }
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    public void zmn(kjb kjbVar) {
        if (kjbVar == null) {
            return;
        }
        kjbVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.klz.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = klz.this.zn.getWindow().getDecorView();
                    if (decorView == null || (findViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    findViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar) {
        fsVar.na = fsVar.fs.fu();
        fsVar.kra = zmn(fsVar.nu, fsVar.fs);
    }

    public static int zmn(Activity activity, nqi nqiVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return nqiVar.ol();
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zmn.fs fsVar, boolean z) {
        float min;
        float max;
        int max2;
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 26) {
            if (i3 == 27) {
                try {
                    fs();
                } catch (Throwable unused) {
                }
            } else {
                fs();
            }
        }
        float zn = zn();
        float fb = fb();
        if (this.btk == 2) {
            min = Math.max(zn, fb);
            max = Math.min(zn, fb);
        } else {
            min = Math.min(zn, fb);
            max = Math.max(zn, fb);
        }
        int zn2 = jy.zn(this.zn, jy.zmn());
        if (this.btk != 2) {
            if (jy.zn(this.zn)) {
                max -= zn2;
            }
        } else if (jy.zn(this.zn)) {
            min -= zn2;
        }
        if (z) {
            fsVar.mhu = (int) min;
            fsVar.bxw = (int) max;
            return;
        }
        int i4 = 20;
        if (this.btk != 2) {
            float f = fsVar.na;
            if (f != 0.0f && f != 100.0f) {
                i = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                i2 = i;
                max2 = 20;
            }
            i4 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        } else {
            float f2 = fsVar.na;
            if (f2 != 0.0f && f2 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f2)) / 2.0f, 0.0f);
                i = 20;
                i2 = 20;
                i4 = max2;
            }
            i4 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        }
        float f3 = i4;
        float f4 = max2;
        fsVar.mhu = (int) ((min - f3) - f4);
        float f5 = i;
        float f6 = i2;
        fsVar.bxw = (int) ((max - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.single.zg zgVar = fsVar.tdm;
        if (zgVar == null || zgVar.iv == 0) {
            this.zn.getWindow().getDecorView().setPadding(jy.fs(this.zn, f3), jy.fs(this.zn, f5), jy.fs(this.zn, f4), jy.fs(this.zn, f6));
        }
    }

    public void zmn(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    fs();
                } catch (Throwable unused) {
                }
            } else {
                fs();
            }
        }
    }

    public float[] zmn(int i) {
        return zmn(i, this.zn, this.fb);
    }

    public float[] zmn(int i, Activity activity, nqi nqiVar) {
        float[] fArr = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.fs && paddingLeft == 0 && paddingTop == 0 && zn(activity, i) == 0) {
            int[] fs2 = fs(activity, decorView, i, jy.zn(activity), com.bytedance.sdk.openadsdk.core.kgc.fb().yof() == 1);
            int i2 = fs2[0];
            paddingTop = fs2[1];
            paddingLeft = i2;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35 && nqiVar.fu() == 100.0f) {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArr[0] = jy.zn(activity, fArr[0]);
        float zn = jy.zn(activity, fArr[1]);
        fArr[1] = zn;
        if (fArr[0] < 10.0f || zn < 10.0f) {
            fArr = fs(this.zmn);
        }
        if (i3 != 26 && i3 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
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
            float f5 = fArr[0];
            float f6 = fArr[1];
        }
        return fArr;
    }

    public static float[] zmn(int i, Activity activity, nqi nqiVar, boolean z) {
        float[] fArr = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (z && paddingLeft == 0 && paddingTop == 0 && zn(activity, i) == 0) {
            int[] fs2 = fs(activity, decorView, i, jy.zn(activity), com.bytedance.sdk.openadsdk.core.kgc.fb().yof() == 1);
            paddingLeft = fs2[0];
            paddingTop = fs2[1];
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 && nqiVar.fu() == 100.0f) {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArr[0] = jy.zn(activity, fArr[0]);
        fArr[1] = jy.zn(activity, fArr[1]);
        if (i2 != 26 && i2 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
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

    public void zmn() {
        jy.zmn(this.zn);
        this.zn.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.klz.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (klz.this.zn.isFinishing()) {
                            return;
                        }
                        klz.this.zn.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.klz.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jy.zmn(klz.this.zn);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        iqz.zn("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private float[] fs(int i) {
        float fb = fb();
        float zn = zn();
        int i2 = this.btk;
        if ((i2 == 1) != (fb > zn)) {
            float f = fb + zn;
            zn = f - zn;
            fb = f - zn;
        }
        if (i2 == 1) {
            fb -= i;
        } else {
            zn -= i;
        }
        return new float[]{zn, fb};
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void fs() {
        if (this.btk == 2) {
            if (this.hhw) {
                fs(this.zn, 8);
                return;
            } else {
                fs(this.zn, 0);
                return;
            }
        }
        fs(this.zn, 1);
    }

    private static void fs(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        int i2 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i);
    }

    private float zn() {
        return jy.zn(this.zn, jy.mw(this.zn));
    }

    private float fb() {
        return jy.zn(this.zn, jy.klz(this.zn));
    }

    private static abstract class zmn implements View.OnLayoutChangeListener {
        private int fs;
        private int zmn;

        private zmn() {
        }

        abstract void zmn(int i, int i2);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.zmn && i10 == this.fs) {
                return;
            }
            this.zmn = i9;
            this.fs = i10;
            zmn(i9, i10);
        }
    }

    public static class fs {
        private zmn zmn;

        public void zmn(Activity activity) {
            Window window;
            if (this.zmn == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.zmn);
            this.zmn = null;
        }

        public void zmn(final Activity activity, final int i, final float f, final boolean z) {
            if (this.zmn != null) {
                return;
            }
            try {
                final boolean z2 = com.bytedance.sdk.openadsdk.core.kgc.fb().yof() == 1;
                final boolean zn = jy.zn(activity);
                if (zn || z2) {
                    this.zmn = new zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.klz.fs.1
                        boolean zmn;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // com.bytedance.sdk.openadsdk.component.reward.zmn.klz.zmn
                        void zmn(int i2, int i3) {
                            if (z) {
                                fs();
                            } else {
                                zmn();
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:7:0x0046, B:9:0x005e, B:11:0x0067, B:13:0x0075, B:14:0x0079, B:15:0x00a1, B:17:0x00a7, B:18:0x00ac, B:20:0x00b4, B:24:0x007c, B:26:0x0080, B:28:0x008e, B:30:0x0092, B:31:0x0098, B:33:0x009c, B:34:0x00ba, B:36:0x00be, B:39:0x002d), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:7:0x0046, B:9:0x005e, B:11:0x0067, B:13:0x0075, B:14:0x0079, B:15:0x00a1, B:17:0x00a7, B:18:0x00ac, B:20:0x00b4, B:24:0x007c, B:26:0x0080, B:28:0x008e, B:30:0x0092, B:31:0x0098, B:33:0x009c, B:34:0x00ba, B:36:0x00be, B:39:0x002d), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private void zmn() {
                            int abs;
                            float zmn;
                            try {
                                if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                    abs = Math.abs(jy.mw(activity) - activity.getWindow().getDecorView().getWidth());
                                } else {
                                    abs = Math.abs(jy.klz(activity) - activity.getWindow().getDecorView().getHeight());
                                }
                                View decorView = activity.getWindow().getDecorView();
                                int paddingLeft = decorView.getPaddingLeft();
                                int paddingRight = decorView.getPaddingRight();
                                int paddingBottom = decorView.getPaddingBottom();
                                if (abs == 0) {
                                    int paddingTop = decorView.getPaddingTop();
                                    if (i == 1 && activity.getResources().getConfiguration().orientation == 1) {
                                        zmn = jy.zmn();
                                    } else {
                                        if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                            if (zn) {
                                                paddingLeft += (int) jy.zmn();
                                            }
                                            if (z2) {
                                                zmn = jy.zmn();
                                            }
                                        }
                                        if (decorView.isAttachedToWindow()) {
                                            decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                            this.zmn = true;
                                        }
                                        if (f != 100.0f) {
                                            decorView.setBackgroundColor(-16777216);
                                            return;
                                        }
                                        return;
                                    }
                                    paddingTop += (int) zmn;
                                    if (decorView.isAttachedToWindow()) {
                                    }
                                    if (f != 100.0f) {
                                    }
                                } else if (this.zmn) {
                                    decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                    this.zmn = false;
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        private void fs() {
                            try {
                                int zn2 = klz.zn(activity, i);
                                View decorView = activity.getWindow().getDecorView();
                                if (zn2 == 0) {
                                    int[] fs = klz.fs(activity, decorView, i, zn, z2);
                                    if (fs[4] == 1) {
                                        this.zmn = klz.fs(decorView, fs[0], fs[1], fs[2], fs[3], f);
                                    }
                                } else if (this.zmn) {
                                    decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                    this.zmn = false;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    };
                    activity.getWindow().getDecorView().addOnLayoutChangeListener(this.zmn);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zn(Activity activity, int i) {
        int i2 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (zmn(i, i2)) {
            return Math.abs(jy.mw(activity) - decorView.getWidth());
        }
        return Math.abs(jy.klz(activity) - decorView.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean fs(View view, int i, int i2, int i3, int i4, float f) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i, i2, i3, i4);
        if (f != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] fs(Activity activity, View view, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        float zmn2;
        int i6 = 0;
        if (activity == null || view == null) {
            if (view != null) {
                i2 = view.getPaddingLeft();
                i4 = view.getPaddingTop();
                i5 = view.getPaddingRight();
                i3 = view.getPaddingBottom();
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            return new int[]{i2, i4, i5, i3, 0};
        }
        int i7 = activity.getResources().getConfiguration().orientation;
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        if (i == 1) {
            if (i7 == 1) {
                zmn2 = jy.zmn();
                paddingTop += (int) zmn2;
                i6 = 1;
                return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
            }
            paddingLeft += (int) jy.zmn();
            return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
        }
        if (i == 2) {
            if (i7 == 2) {
                if (z) {
                    paddingLeft += (int) jy.zmn();
                    i6 = 1;
                }
                if (z2) {
                    zmn2 = jy.zmn();
                    paddingTop += (int) zmn2;
                    i6 = 1;
                }
            } else {
                paddingTop += (int) jy.zmn();
            }
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
    }
}
