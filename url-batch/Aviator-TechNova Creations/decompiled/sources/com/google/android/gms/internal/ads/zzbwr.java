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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0272, code lost:
    
        zzg("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0278, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x046a A[Catch: all -> 0x047f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x0124, B:62:0x0130, B:64:0x0272, B:65:0x0277, B:67:0x0279, B:69:0x0296, B:71:0x02a2, B:72:0x02db, B:102:0x038d, B:103:0x03bc, B:105:0x03d4, B:106:0x03f0, B:108:0x03f8, B:109:0x03ff, B:110:0x0425, B:114:0x0428, B:116:0x0456, B:117:0x0468, B:119:0x0394, B:120:0x039b, B:121:0x03a2, B:122:0x03a9, B:123:0x03af, B:124:0x03b6, B:125:0x02d8, B:126:0x046a, B:127:0x046f, B:129:0x013b, B:131:0x013f, B:142:0x01a2, B:143:0x01f2, B:144:0x01fd, B:146:0x0200, B:148:0x0204, B:150:0x0208, B:153:0x020f, B:154:0x01ad, B:155:0x01c3, B:156:0x01ce, B:157:0x01b8, B:158:0x01c6, B:159:0x01d3, B:160:0x01e7, B:161:0x01f5, B:180:0x021e, B:183:0x0248, B:186:0x0258, B:187:0x024e, B:189:0x0256, B:190:0x023f, B:192:0x0245, B:194:0x025d, B:195:0x0267, B:196:0x0471, B:197:0x0476, B:199:0x0478, B:200:0x047d), top: B:3:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0296 A[Catch: all -> 0x047f, TryCatch #1 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003a, B:23:0x003f, B:25:0x0041, B:27:0x004f, B:28:0x0060, B:30:0x006e, B:31:0x007f, B:33:0x008d, B:34:0x009e, B:36:0x00ac, B:37:0x00bd, B:39:0x00cb, B:40:0x00d9, B:42:0x00e7, B:43:0x00e9, B:45:0x00ed, B:47:0x00f1, B:49:0x00f7, B:52:0x00ff, B:56:0x0124, B:62:0x0130, B:64:0x0272, B:65:0x0277, B:67:0x0279, B:69:0x0296, B:71:0x02a2, B:72:0x02db, B:102:0x038d, B:103:0x03bc, B:105:0x03d4, B:106:0x03f0, B:108:0x03f8, B:109:0x03ff, B:110:0x0425, B:114:0x0428, B:116:0x0456, B:117:0x0468, B:119:0x0394, B:120:0x039b, B:121:0x03a2, B:122:0x03a9, B:123:0x03af, B:124:0x03b6, B:125:0x02d8, B:126:0x046a, B:127:0x046f, B:129:0x013b, B:131:0x013f, B:142:0x01a2, B:143:0x01f2, B:144:0x01fd, B:146:0x0200, B:148:0x0204, B:150:0x0208, B:153:0x020f, B:154:0x01ad, B:155:0x01c3, B:156:0x01ce, B:157:0x01b8, B:158:0x01c6, B:159:0x01d3, B:160:0x01e7, B:161:0x01f5, B:180:0x021e, B:183:0x0248, B:186:0x0258, B:187:0x024e, B:189:0x0256, B:190:0x023f, B:192:0x0245, B:194:0x025d, B:195:0x0267, B:196:0x0471, B:197:0x0476, B:199:0x0478, B:200:0x047d), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Map map) {
        int i;
        ViewParent parent;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcjl zzcjlVar = this.zzj;
            if (zzcjlVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzcjlVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzcjlVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetY"));
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
                int[] zzac = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzY = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                int i7 = zzac[0];
                int i8 = zzac[1];
                int i9 = this.zzh;
                int[] iArr = null;
                if (i9 >= 50 && i9 <= i7) {
                    int i10 = this.zze;
                    if (i10 >= 50 && i10 <= i8) {
                        if (i10 == i8 && i9 == i7) {
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                            i = 50;
                        } else if (this.zzb) {
                            String str2 = this.zza;
                            switch (str2.hashCode()) {
                                case -1364013995:
                                    i = 50;
                                    if (str2.equals("center")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1012429441:
                                    i = 50;
                                    if (str2.equals("top-left")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -655373719:
                                    i = 50;
                                    if (str2.equals("bottom-left")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1163912186:
                                    i = 50;
                                    if (str2.equals("bottom-right")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1288627767:
                                    i = 50;
                                    if (str2.equals("bottom-center")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1755462605:
                                    i = 50;
                                    if (str2.equals("top-center")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    i = 50;
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                i3 = this.zzc + this.zzf;
                                i4 = this.zzd;
                            } else if (c != 1) {
                                if (c != 2) {
                                    if (c == 3) {
                                        i3 = this.zzc + this.zzf;
                                        i6 = this.zzd;
                                    } else if (c == 4) {
                                        i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                        i6 = this.zzd;
                                    } else if (c != 5) {
                                        i3 = ((this.zzc + this.zzf) + i9) - 50;
                                        i4 = this.zzd;
                                    } else {
                                        i3 = ((this.zzc + this.zzf) + i9) - 50;
                                        i6 = this.zzd;
                                    }
                                    i5 = ((i6 + this.zzg) + i10) - 50;
                                } else {
                                    i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                    i5 = ((this.zzd + this.zzg) + (i10 >> 1)) - 25;
                                }
                                if (i3 >= 0 && i3 + 50 <= i7 && i5 >= zzY[0] && i5 + 50 <= zzY[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i3 = ((this.zzc + this.zzf) + (i9 >> 1)) - 25;
                                i4 = this.zzd;
                            }
                            i5 = i4 + this.zzg;
                            if (i3 >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            i = 50;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] zzac2 = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                            com.google.android.gms.ads.internal.zzt.zzc();
                            int[] zzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                            int i12 = zzac2[0];
                            int i13 = this.zzc + this.zzf;
                            int i14 = this.zzd + this.zzg;
                            if (i13 < 0) {
                                i2 = 0;
                            } else {
                                int i15 = this.zzh;
                                i2 = i13 + i15 > i12 ? i12 - i15 : i13;
                            }
                            int i16 = zzY2[0];
                            if (i14 < i16) {
                                i14 = i16;
                            } else {
                                int i17 = this.zze;
                                int i18 = i14 + i17;
                                int i19 = zzY2[1];
                                if (i18 > i19) {
                                    i14 = i19 - i17;
                                }
                            }
                            iArr = new int[]{i2, i14};
                        }
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                        parent = ((View) zzcjlVar).getParent();
                        if (!(parent instanceof ViewGroup)) {
                            zzg("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) zzcjlVar);
                        PopupWindow popupWindow = this.zzp;
                        if (popupWindow == null) {
                            this.zzr = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzc();
                            ((View) zzcjlVar).setDrawingCacheEnabled(true);
                            Bitmap createBitmap = Bitmap.createBitmap(((View) zzcjlVar).getDrawingCache());
                            ((View) zzcjlVar).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(activity);
                            this.zzm = imageView;
                            imageView.setImageBitmap(createBitmap);
                            this.zzl = zzcjlVar.zzN();
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
                        char c2 = 65535;
                        this.zzq.addView((View) zzcjlVar, -1, -1);
                        this.zzn = new LinearLayout(activity);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        int i20 = i;
                        int zzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i20);
                        com.google.android.gms.ads.internal.client.zzbb.zza();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, i20));
                        String str3 = this.zza;
                        switch (str3.hashCode()) {
                            case -1364013995:
                                if (str3.equals("center")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -1012429441:
                                if (str3.equals("top-left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -655373719:
                                if (str3.equals("bottom-left")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1163912186:
                                if (str3.equals("bottom-right")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 1288627767:
                                if (str3.equals("bottom-center")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 1755462605:
                                if (str3.equals("top-center")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(9);
                        } else if (c2 == 1) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(14);
                        } else if (c2 == 2) {
                            layoutParams.addRule(13);
                        } else if (c2 == 3) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(9);
                        } else if (c2 == 4) {
                            layoutParams.addRule(12);
                            layoutParams.addRule(14);
                        } else if (c2 != 5) {
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                        } else {
                            layoutParams.addRule(12);
                            layoutParams.addRule(11);
                        }
                        this.zzn.setOnClickListener(new zzbwp(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, layoutParams);
                        try {
                            PopupWindow popupWindow3 = this.zzp;
                            View decorView = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            int zzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzbb.zza();
                            popupWindow3.showAtLocation(decorView, 0, zzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                            int i21 = iArr[0];
                            int i22 = iArr[1];
                            zzbwy zzbwyVar = this.zzo;
                            if (zzbwyVar != null) {
                                zzbwyVar.zza(i21, i22, this.zzh, this.zze);
                            }
                            this.zzj.zzaf(zzclv.zzc(zzC, zzC2));
                            int i23 = iArr[0];
                            int i24 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzi(i23, i24 - com.google.android.gms.ads.internal.util.zzs.zzY(this.zzk)[0], this.zzh, this.zze);
                            zzk("resized");
                            return;
                        } catch (RuntimeException e) {
                            String message = e.getMessage();
                            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                            sb.append("Cannot show popup window: ");
                            sb.append(message);
                            zzg(sb.toString());
                            RelativeLayout relativeLayout2 = this.zzq;
                            zzcjl zzcjlVar2 = this.zzj;
                            relativeLayout2.removeView((View) zzcjlVar2);
                            ViewGroup viewGroup2 = this.zzr;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzm);
                                this.zzr.addView((View) zzcjlVar2);
                                zzcjlVar2.zzaf(this.zzl);
                            }
                            return;
                        }
                    }
                    i = 50;
                    int i25 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC5 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int zzC22 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                    parent = ((View) zzcjlVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                    }
                }
                i = 50;
                int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int zzC52 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int zzC222 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                parent = ((View) zzcjlVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z);
                } else {
                    zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbwr.this.zzf(z);
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
