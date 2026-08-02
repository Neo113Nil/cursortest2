package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
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

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzbso extends zzbsu {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfg zzj;
    private final Activity zzk;
    private zzchd zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsv zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbso(zzcfg zzcfgVar, zzbsv zzbsvVar) {
        super(zzcfgVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfgVar;
        this.zzk = zzcfgVar.zzi();
        this.zzo = zzbsvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzm(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlm)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzln)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlo)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcfg zzcfgVar = this.zzj;
                    viewGroup2.addView((View) zzcfgVar);
                    zzcfgVar.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcfg zzcfgVar2 = this.zzj;
                viewGroup3.addView((View) zzcfgVar2);
                zzcfgVar2.zzaj(this.zzl);
            }
        }
        if (z) {
            zzl("default");
            zzbsv zzbsvVar = this.zzo;
            if (zzbsvVar != null) {
                zzbsvVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzll)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzm(z);
                } else {
                    zzcaf.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbso.this.zzm(z);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0237, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x040a A[Catch: all -> 0x041f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x011e, B:62:0x012a, B:64:0x0237, B:65:0x023c, B:67:0x023e, B:69:0x025b, B:71:0x0267, B:72:0x029e, B:77:0x0310, B:78:0x0367, B:80:0x037f, B:81:0x039c, B:83:0x03a4, B:84:0x03ab, B:85:0x03d2, B:89:0x03d5, B:91:0x03f6, B:92:0x0408, B:96:0x031f, B:99:0x032e, B:102:0x033d, B:105:0x034c, B:109:0x035d, B:110:0x0361, B:111:0x029b, B:112:0x040a, B:113:0x040f, B:115:0x0133, B:117:0x0137, B:121:0x014a, B:122:0x01a3, B:125:0x01cf, B:127:0x01d2, B:129:0x01d6, B:132:0x01dc, B:135:0x015e, B:136:0x017c, B:140:0x0172, B:143:0x0187, B:146:0x019c, B:149:0x01af, B:150:0x01c2, B:151:0x01eb, B:154:0x0211, B:157:0x0221, B:158:0x0217, B:160:0x021f, B:161:0x0209, B:163:0x020f, B:164:0x0226, B:165:0x022e, B:166:0x0411, B:167:0x0416, B:169:0x0418, B:170:0x041d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b A[Catch: all -> 0x041f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x011e, B:62:0x012a, B:64:0x0237, B:65:0x023c, B:67:0x023e, B:69:0x025b, B:71:0x0267, B:72:0x029e, B:77:0x0310, B:78:0x0367, B:80:0x037f, B:81:0x039c, B:83:0x03a4, B:84:0x03ab, B:85:0x03d2, B:89:0x03d5, B:91:0x03f6, B:92:0x0408, B:96:0x031f, B:99:0x032e, B:102:0x033d, B:105:0x034c, B:109:0x035d, B:110:0x0361, B:111:0x029b, B:112:0x040a, B:113:0x040f, B:115:0x0133, B:117:0x0137, B:121:0x014a, B:122:0x01a3, B:125:0x01cf, B:127:0x01d2, B:129:0x01d6, B:132:0x01dc, B:135:0x015e, B:136:0x017c, B:140:0x0172, B:143:0x0187, B:146:0x019c, B:149:0x01af, B:150:0x01c2, B:151:0x01eb, B:154:0x0211, B:157:0x0221, B:158:0x0217, B:160:0x021f, B:161:0x0209, B:163:0x020f, B:164:0x0226, B:165:0x022e, B:166:0x0411, B:167:0x0416, B:169:0x0418, B:170:0x041d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(Map map) {
        ViewParent parent;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzh("Not an activity context. Cannot resize.");
                return;
            }
            zzcfg zzcfgVar = this.zzj;
            if (zzcfgVar.zzO() == null) {
                zzh("Webview is not yet available, size is not set.");
                return;
            }
            if (zzcfgVar.zzO().zzi()) {
                zzh("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzcfgVar.zzaF()) {
                zzh("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzv.zzr();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzP((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzv.zzr();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzP((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzv.zzr();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzP((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzv.zzr();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzP((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzh("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzv.zzr();
                int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                com.google.android.gms.ads.internal.zzv.zzr();
                int[] zzS = com.google.android.gms.ads.internal.util.zzs.zzS(activity);
                int i5 = zzW[0];
                int i6 = zzW[1];
                int i7 = this.zzh;
                int[] iArr = null;
                if (i7 >= 50 && i7 <= i5) {
                    int i8 = this.zze;
                    if (i8 >= 50 && i8 <= i6) {
                        if (i8 == i6 && i7 == i5) {
                            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot resize to a full-screen ad.");
                        } else if (this.zzb) {
                            String str2 = this.zza;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    if (str2.equals("center")) {
                                        i = ((this.zzc + this.zzf) + (i7 >> 1)) - 25;
                                        i3 = ((this.zzd + this.zzg) + (i8 >> 1)) - 25;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                    break;
                                case -1012429441:
                                    if (str2.equals("top-left")) {
                                        i = this.zzc + this.zzf;
                                        i2 = this.zzd;
                                        i3 = i2 + this.zzg;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                case -655373719:
                                    if (str2.equals("bottom-left")) {
                                        i = this.zzc + this.zzf;
                                        i4 = this.zzd;
                                        i3 = ((i4 + this.zzg) + i8) - 50;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                    break;
                                case 1163912186:
                                    if (str2.equals("bottom-right")) {
                                        i = ((this.zzc + this.zzf) + i7) - 50;
                                        i4 = this.zzd;
                                        i3 = ((i4 + this.zzg) + i8) - 50;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                    break;
                                case 1288627767:
                                    if (str2.equals("bottom-center")) {
                                        i = ((this.zzc + this.zzf) + (i7 >> 1)) - 25;
                                        i4 = this.zzd;
                                        i3 = ((i4 + this.zzg) + i8) - 50;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                    break;
                                case 1755462605:
                                    if (str2.equals("top-center")) {
                                        i = ((this.zzc + this.zzf) + (i7 >> 1)) - 25;
                                        i2 = this.zzd;
                                        i3 = i2 + this.zzg;
                                        break;
                                    }
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                default:
                                    i = ((this.zzc + this.zzf) + i7) - 50;
                                    i2 = this.zzd;
                                    i3 = i2 + this.zzg;
                                    break;
                            }
                            if (i >= 0 && i + 50 <= i5 && i3 >= zzS[0] && i3 + 50 <= zzS[1]) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzv.zzr();
                            int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                            com.google.android.gms.ads.internal.zzv.zzr();
                            int[] zzS2 = com.google.android.gms.ads.internal.util.zzs.zzS(activity);
                            int i10 = zzW2[0];
                            int i11 = this.zzc + this.zzf;
                            int i12 = this.zzd + this.zzg;
                            if (i11 < 0) {
                                i11 = 0;
                            } else {
                                int i13 = this.zzh;
                                if (i11 + i13 > i10) {
                                    i11 = i10 - i13;
                                }
                            }
                            int i14 = zzS2[0];
                            if (i12 < i14) {
                                i12 = i14;
                            } else {
                                int i15 = this.zze;
                                int i16 = i12 + i15;
                                int i17 = zzS2[1];
                                if (i16 > i17) {
                                    i12 = i17 - i15;
                                }
                            }
                            iArr = new int[]{i11, i12};
                        }
                        com.google.android.gms.ads.internal.client.zzbb.zzb();
                        int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzbb.zzb();
                        int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                        parent = ((View) zzcfgVar).getParent();
                        if (!(parent instanceof ViewGroup)) {
                            zzh("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) zzcfgVar);
                        PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzv.zzr();
                            ((View) zzcfgVar).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) zzcfgVar).getDrawingCache());
                            ((View) zzcfgVar).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = zzcfgVar.zzO();
                            this.zzr.addView(this.zzm);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                        this.zzq = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzC, zzC2));
                        com.google.android.gms.ads.internal.zzv.zzr();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzC, zzC2, false);
                        this.zzp = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        this.zzq.addView((View) zzcfgVar, -1, -1);
                        this.zzn = new LinearLayout(activity);
                        com.google.android.gms.ads.internal.client.zzbb.zzb();
                        int zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50);
                        com.google.android.gms.ads.internal.client.zzbb.zzb();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50));
                        String str3 = this.zza;
                        switch (str3.hashCode()) {
                            case -1364013995:
                                if (str3.equals("center")) {
                                    layoutParams.addRule(13);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            case -1012429441:
                                if (str3.equals("top-left")) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(9);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            case -655373719:
                                if (str3.equals("bottom-left")) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(9);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            case 1163912186:
                                if (str3.equals("bottom-right")) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(11);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            case 1288627767:
                                if (str3.equals("bottom-center")) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(14);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            case 1755462605:
                                if (str3.equals("top-center")) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(14);
                                    break;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                            default:
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                                break;
                        }
                        this.zzn.setOnClickListener(new zzbsn(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzp;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzbb.zzb();
                            int zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzbb.zzb();
                            popupWindow3.showAtLocation(decorView, 0, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                            int i18 = iArr[0];
                            int i19 = iArr[1];
                            zzbsv zzbsvVar = this.zzo;
                            if (zzbsvVar != null) {
                                zzbsvVar.zza(i18, i19, this.zzh, this.zze);
                            }
                            this.zzj.zzaj(zzchd.zzb(zzC, zzC2));
                            int i20 = iArr[0];
                            int i21 = iArr[1];
                            com.google.android.gms.ads.internal.zzv.zzr();
                            zzk(i20, i21 - com.google.android.gms.ads.internal.util.zzs.zzS(this.zzk)[0], this.zzh, this.zze);
                            zzl("resized");
                            return;
                        } catch (RuntimeException e) {
                            zzh("Cannot show popup window: " + e.getMessage());
                            RelativeLayout relativeLayout2 = this.zzq;
                            zzcfg zzcfgVar2 = this.zzj;
                            relativeLayout2.removeView((View) zzcfgVar2);
                            ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((View) zzcfgVar2);
                                zzcfgVar2.zzaj(this.zzl);
                            }
                            return;
                        }
                    }
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Height is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzbb.zzb();
                    int zzC5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zzb();
                    int zzC22 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    parent = ((View) zzcfgVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                    }
                }
                int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Width is too small or too large.");
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                int zzC52 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzbb.zzb();
                int zzC222 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                parent = ((View) zzcfgVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                }
            }
            zzh("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }
}
