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
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbrv extends zzbsb {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcek zzj;
    private final Activity zzk;
    private zzcgt zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsc zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbrv(zzcek zzcekVar, zzbsc zzbscVar) {
        super(zzcekVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcekVar;
        this.zzk = zzcekVar.zzj();
        this.zzo = zzbscVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlF)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlG)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlH)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcek zzcekVar = this.zzj;
                    viewGroup2.addView((View) zzcekVar);
                    zzcekVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcek zzcekVar2 = this.zzj;
                viewGroup3.addView((View) zzcekVar2);
                zzcekVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk(Constants.COLLATION_DEFAULT);
            zzbsc zzbscVar = this.zzo;
            if (zzbscVar != null) {
                zzbscVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0237, code lost:
    
        zzg("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0417 A[Catch: all -> 0x042c, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x011e, B:62:0x012a, B:64:0x0237, B:65:0x023c, B:67:0x023e, B:69:0x025b, B:71:0x0267, B:72:0x029e, B:77:0x0310, B:78:0x0367, B:80:0x037f, B:81:0x039c, B:83:0x03a4, B:84:0x03ab, B:85:0x03d2, B:89:0x03d5, B:91:0x0403, B:92:0x0415, B:96:0x031f, B:99:0x032e, B:102:0x033d, B:105:0x034c, B:109:0x035d, B:110:0x0361, B:111:0x029b, B:112:0x0417, B:113:0x041c, B:115:0x0133, B:117:0x0137, B:121:0x014a, B:122:0x01a3, B:125:0x01cf, B:127:0x01d2, B:129:0x01d6, B:132:0x01dc, B:135:0x015e, B:136:0x017c, B:140:0x0172, B:143:0x0187, B:146:0x019c, B:149:0x01af, B:150:0x01c2, B:151:0x01eb, B:154:0x0211, B:157:0x0221, B:158:0x0217, B:160:0x021f, B:161:0x0209, B:163:0x020f, B:164:0x0226, B:165:0x022e, B:166:0x041e, B:167:0x0423, B:169:0x0425, B:170:0x042a), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025b A[Catch: all -> 0x042c, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x011e, B:62:0x012a, B:64:0x0237, B:65:0x023c, B:67:0x023e, B:69:0x025b, B:71:0x0267, B:72:0x029e, B:77:0x0310, B:78:0x0367, B:80:0x037f, B:81:0x039c, B:83:0x03a4, B:84:0x03ab, B:85:0x03d2, B:89:0x03d5, B:91:0x0403, B:92:0x0415, B:96:0x031f, B:99:0x032e, B:102:0x033d, B:105:0x034c, B:109:0x035d, B:110:0x0361, B:111:0x029b, B:112:0x0417, B:113:0x041c, B:115:0x0133, B:117:0x0137, B:121:0x014a, B:122:0x01a3, B:125:0x01cf, B:127:0x01d2, B:129:0x01d6, B:132:0x01dc, B:135:0x015e, B:136:0x017c, B:140:0x0172, B:143:0x0187, B:146:0x019c, B:149:0x01af, B:150:0x01c2, B:151:0x01eb, B:154:0x0211, B:157:0x0221, B:158:0x0217, B:160:0x021f, B:161:0x0209, B:163:0x020f, B:164:0x0226, B:165:0x022e, B:166:0x041e, B:167:0x0423, B:169:0x0425, B:170:0x042a), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        ViewParent parent;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcek zzcekVar = this.zzj;
            if (zzcekVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzcekVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzcekVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewProps.WIDTH))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzT((String) map.get(ViewProps.WIDTH));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewProps.HEIGHT))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzT((String) map.get(ViewProps.HEIGHT));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzT((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzT((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                int i5 = zzaa[0];
                int i6 = zzaa[1];
                int i7 = this.zzh;
                int[] iArr = null;
                if (i7 >= 50 && i7 <= i5) {
                    int i8 = this.zze;
                    if (i8 >= 50 && i8 <= i6) {
                        if (i8 == i6 && i7 == i5) {
                            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
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
                            if (i >= 0 && i + 50 <= i5 && i3 >= zzW[0] && i3 + 50 <= zzW[1]) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] zzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] zzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                            int i10 = zzaa2[0];
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
                            int i14 = zzW2[0];
                            if (i12 < i14) {
                                i12 = i14;
                            } else {
                                int i15 = this.zze;
                                int i16 = i12 + i15;
                                int i17 = zzW2[1];
                                if (i16 > i17) {
                                    i12 = i17 - i15;
                                }
                            }
                            iArr = new int[]{i11, i12};
                        }
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                        parent = ((View) zzcekVar).getParent();
                        if (!(parent instanceof ViewGroup)) {
                            zzg("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) zzcekVar);
                        PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            ((View) zzcekVar).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) zzcekVar).getDrawingCache());
                            ((View) zzcekVar).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = zzcekVar.zzN();
                            this.zzr.addView(this.zzm);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(activity);
                        this.zzq = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new ViewGroup.LayoutParams(zzC, zzC2));
                        com.google.android.gms.ads.internal.zzt.zzc();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, zzC, zzC2, false);
                        this.zzp = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        this.zzq.addView((View) zzcekVar, -1, -1);
                        this.zzn = new LinearLayout(activity);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
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
                        this.zzn.setOnClickListener(new zzbrt(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzp;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            int zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            popupWindow3.showAtLocation(decorView, 0, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                            int i18 = iArr[0];
                            int i19 = iArr[1];
                            zzbsc zzbscVar = this.zzo;
                            if (zzbscVar != null) {
                                zzbscVar.zza(i18, i19, this.zzh, this.zze);
                            }
                            this.zzj.zzaf(zzcgt.zzc(zzC, zzC2));
                            int i20 = iArr[0];
                            int i21 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzi(i20, i21 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                            zzk("resized");
                            return;
                        } catch (RuntimeException e) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Cannot show popup window: ");
                            sb.append(message);
                            zzg(sb.toString());
                            RelativeLayout relativeLayout2 = this.zzq;
                            zzcek zzcekVar2 = this.zzj;
                            relativeLayout2.removeView((View) zzcekVar2);
                            ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((View) zzcekVar2);
                                zzcekVar2.zzaf(this.zzl);
                            }
                            return;
                        }
                    }
                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC22 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    parent = ((View) zzcekVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                    }
                }
                int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int zzC52 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int zzC222 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                parent = ((View) zzcekVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlE)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z);
                } else {
                    zzbzh.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbru
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbrv.this.zzf(z);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }
}
