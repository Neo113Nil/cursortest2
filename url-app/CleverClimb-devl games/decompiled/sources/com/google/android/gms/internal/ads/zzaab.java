package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

@zzadh
/* loaded from: classes2.dex */
public final class zzaab extends zzaal {
    private static final Set<String> zzbvy = CollectionUtils.setOf((Object[]) new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    private final Object mLock;
    private zzaam zzbmy;
    private final zzaqw zzbnd;
    private final Activity zzbvp;
    private String zzbvz;
    private boolean zzbwa;
    private int zzbwb;
    private int zzbwc;
    private int zzbwd;
    private int zzbwe;
    private zzasi zzbwf;
    private ImageView zzbwg;
    private LinearLayout zzbwh;
    private PopupWindow zzbwi;
    private RelativeLayout zzbwj;
    private ViewGroup zzbwk;
    private int zzuq;
    private int zzur;

    public zzaab(zzaqw zzaqwVar, zzaam zzaamVar) {
        super(zzaqwVar, "resize");
        this.zzbvz = "top-right";
        this.zzbwa = true;
        this.zzbwb = 0;
        this.zzbwc = 0;
        this.zzur = -1;
        this.zzbwd = 0;
        this.zzbwe = 0;
        this.zzuq = -1;
        this.mLock = new Object();
        this.zzbnd = zzaqwVar;
        this.zzbvp = zzaqwVar.zzto();
        this.zzbmy = zzaamVar;
    }

    private final void zza(int i, int i2) {
        zzb(i, i2 - com.google.android.gms.ads.internal.zzbv.zzek().zzh(this.zzbvp)[0], this.zzuq, this.zzur);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if ((r5 + 50) <= r1[1]) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int[] zzne() {
        String str;
        boolean z;
        char c2;
        int i;
        int i2;
        int[] zzg = com.google.android.gms.ads.internal.zzbv.zzek().zzg(this.zzbvp);
        int[] zzh = com.google.android.gms.ads.internal.zzbv.zzek().zzh(this.zzbvp);
        int i3 = zzg[0];
        int i4 = zzg[1];
        if (this.zzuq < 50 || this.zzuq > i3) {
            str = "Width is too small or too large.";
        } else if (this.zzur < 50 || this.zzur > i4) {
            str = "Height is too small or too large.";
        } else if (this.zzur == i4 && this.zzuq == i3) {
            str = "Cannot resize to a full-screen ad.";
        } else {
            if (this.zzbwa) {
                String str2 = this.zzbvz;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1012429441:
                        if (str2.equals("top-left")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -655373719:
                        if (str2.equals("bottom-left")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1163912186:
                        if (str2.equals("bottom-right")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i = this.zzbwb + this.zzbwd;
                        i2 = this.zzbwc + this.zzbwe;
                        break;
                    case 1:
                        i = ((this.zzbwb + this.zzbwd) + (this.zzuq / 2)) - 25;
                        i2 = this.zzbwc + this.zzbwe;
                        break;
                    case 2:
                        i = ((this.zzbwb + this.zzbwd) + (this.zzuq / 2)) - 25;
                        i2 = ((this.zzbwc + this.zzbwe) + (this.zzur / 2)) - 25;
                        break;
                    case 3:
                        i = this.zzbwb + this.zzbwd;
                        i2 = ((this.zzbwc + this.zzbwe) + this.zzur) - 50;
                        break;
                    case 4:
                        i = ((this.zzbwb + this.zzbwd) + (this.zzuq / 2)) - 25;
                        i2 = ((this.zzbwc + this.zzbwe) + this.zzur) - 50;
                        break;
                    case 5:
                        i = ((this.zzbwb + this.zzbwd) + this.zzuq) - 50;
                        i2 = ((this.zzbwc + this.zzbwe) + this.zzur) - 50;
                        break;
                    default:
                        i = ((this.zzbwb + this.zzbwd) + this.zzuq) - 50;
                        i2 = this.zzbwc + this.zzbwe;
                        break;
                }
                if (i >= 0) {
                    if (i + 50 <= i3) {
                        if (i2 >= zzh[0]) {
                        }
                    }
                }
                z = false;
                if (!z) {
                    return null;
                }
                if (this.zzbwa) {
                    return new int[]{this.zzbwb + this.zzbwd, this.zzbwc + this.zzbwe};
                }
                int[] zzg2 = com.google.android.gms.ads.internal.zzbv.zzek().zzg(this.zzbvp);
                int[] zzh2 = com.google.android.gms.ads.internal.zzbv.zzek().zzh(this.zzbvp);
                int i5 = zzg2[0];
                int i6 = this.zzbwb + this.zzbwd;
                int i7 = this.zzbwc + this.zzbwe;
                int i8 = i6 < 0 ? 0 : this.zzuq + i6 > i5 ? i5 - this.zzuq : i6;
                if (i7 < zzh2[0]) {
                    i7 = zzh2[0];
                } else if (this.zzur + i7 > zzh2[1]) {
                    i7 = zzh2[1] - this.zzur;
                }
                return new int[]{i8, i7};
            }
            z = true;
            if (!z) {
            }
        }
        zzakb.zzdk(str);
        z = false;
        if (!z) {
        }
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.mLock) {
            this.zzbwb = i;
            this.zzbwc = i2;
            if (this.zzbwi != null && z) {
                int[] zzne = zzne();
                if (zzne != null) {
                    PopupWindow popupWindow = this.zzbwi;
                    zzkb.zzif();
                    int zza = zzamu.zza(this.zzbvp, zzne[0]);
                    zzkb.zzif();
                    popupWindow.update(zza, zzamu.zza(this.zzbvp, zzne[1]), this.zzbwi.getWidth(), this.zzbwi.getHeight());
                    zza(zzne[0], zzne[1]);
                } else {
                    zzm(true);
                }
            }
        }
    }

    public final void zzb(int i, int i2) {
        this.zzbwb = i;
        this.zzbwc = i2;
    }

    public final void zzk(Map<String, String> map) {
        char c2;
        synchronized (this.mLock) {
            if (this.zzbvp == null) {
                zzbw("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzbnd.zzud() == null) {
                zzbw("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzbnd.zzud().zzvs()) {
                zzbw("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzbnd.zzuj()) {
                zzbw("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                this.zzuq = zzakk.zzcv(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                this.zzur = zzakk.zzcv(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                this.zzbwd = zzakk.zzcv(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzbv.zzek();
                this.zzbwe = zzakk.zzcv(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.zzbwa = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzbvz = str;
            }
            if (!(this.zzuq >= 0 && this.zzur >= 0)) {
                zzbw("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzbvp.getWindow();
            if (window != null && window.getDecorView() != null) {
                int[] zzne = zzne();
                if (zzne == null) {
                    zzbw("Resize location out of screen or close button is not visible.");
                    return;
                }
                zzkb.zzif();
                int zza = zzamu.zza(this.zzbvp, this.zzuq);
                zzkb.zzif();
                int zza2 = zzamu.zza(this.zzbvp, this.zzur);
                ViewParent parent = this.zzbnd.getView().getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    zzbw("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ((ViewGroup) parent).removeView(this.zzbnd.getView());
                if (this.zzbwi == null) {
                    this.zzbwk = (ViewGroup) parent;
                    com.google.android.gms.ads.internal.zzbv.zzek();
                    Bitmap zzs = zzakk.zzs(this.zzbnd.getView());
                    this.zzbwg = new ImageView(this.zzbvp);
                    this.zzbwg.setImageBitmap(zzs);
                    this.zzbwf = this.zzbnd.zzud();
                    this.zzbwk.addView(this.zzbwg);
                } else {
                    this.zzbwi.dismiss();
                }
                this.zzbwj = new RelativeLayout(this.zzbvp);
                this.zzbwj.setBackgroundColor(0);
                this.zzbwj.setLayoutParams(new ViewGroup.LayoutParams(zza, zza2));
                com.google.android.gms.ads.internal.zzbv.zzek();
                this.zzbwi = zzakk.zza((View) this.zzbwj, zza, zza2, false);
                this.zzbwi.setOutsideTouchable(true);
                this.zzbwi.setTouchable(true);
                this.zzbwi.setClippingEnabled(!this.zzbwa);
                this.zzbwj.addView(this.zzbnd.getView(), -1, -1);
                this.zzbwh = new LinearLayout(this.zzbvp);
                zzkb.zzif();
                int zza3 = zzamu.zza(this.zzbvp, 50);
                zzkb.zzif();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zza3, zzamu.zza(this.zzbvp, 50));
                String str2 = this.zzbvz;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1012429441:
                        if (str2.equals("top-left")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -655373719:
                        if (str2.equals("bottom-left")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1163912186:
                        if (str2.equals("bottom-right")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                        break;
                    case 1:
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                        break;
                    case 2:
                        layoutParams.addRule(13);
                        break;
                    case 3:
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                        break;
                    case 4:
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                        break;
                    case 5:
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                        break;
                    default:
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                        break;
                }
                this.zzbwh.setOnClickListener(new zzaac(this));
                this.zzbwh.setContentDescription("Close button");
                this.zzbwj.addView(this.zzbwh, layoutParams);
                try {
                    PopupWindow popupWindow = this.zzbwi;
                    View decorView = window.getDecorView();
                    zzkb.zzif();
                    int zza4 = zzamu.zza(this.zzbvp, zzne[0]);
                    zzkb.zzif();
                    popupWindow.showAtLocation(decorView, 0, zza4, zzamu.zza(this.zzbvp, zzne[1]));
                    int i = zzne[0];
                    int i2 = zzne[1];
                    if (this.zzbmy != null) {
                        this.zzbmy.zza(i, i2, this.zzuq, this.zzur);
                    }
                    this.zzbnd.zza(zzasi.zzi(zza, zza2));
                    zza(zzne[0], zzne[1]);
                    zzby("resized");
                    return;
                } catch (RuntimeException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzbw(valueOf.length() != 0 ? "Cannot show popup window: ".concat(valueOf) : new String("Cannot show popup window: "));
                    this.zzbwj.removeView(this.zzbnd.getView());
                    if (this.zzbwk != null) {
                        this.zzbwk.removeView(this.zzbwg);
                        this.zzbwk.addView(this.zzbnd.getView());
                        this.zzbnd.zza(this.zzbwf);
                    }
                    return;
                }
            }
            zzbw("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzm(boolean z) {
        synchronized (this.mLock) {
            if (this.zzbwi != null) {
                this.zzbwi.dismiss();
                this.zzbwj.removeView(this.zzbnd.getView());
                if (this.zzbwk != null) {
                    this.zzbwk.removeView(this.zzbwg);
                    this.zzbwk.addView(this.zzbnd.getView());
                    this.zzbnd.zza(this.zzbwf);
                }
                if (z) {
                    zzby("default");
                    if (this.zzbmy != null) {
                        this.zzbmy.zzcq();
                    }
                }
                this.zzbwi = null;
                this.zzbwj = null;
                this.zzbwk = null;
                this.zzbwh = null;
            }
        }
    }

    public final boolean zznf() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbwi != null;
        }
        return z;
    }
}
