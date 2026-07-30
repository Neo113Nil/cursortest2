package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzcfs extends FrameLayout implements zzcfj {
    final zzcgg zza;
    private final zzcge zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbht zze;
    private final long zzf;
    private final zzcfk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcfs(Context context, zzcge zzcgeVar, int i, boolean z, zzbht zzbhtVar, zzcgd zzcgdVar, zzdxz zzdxzVar) {
        super(context);
        zzcfk zzcfiVar;
        zzbht zzbhtVar2;
        zzcfk zzcfkVar;
        this.zzb = zzcgeVar;
        this.zze = zzbhtVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcgeVar.zzk());
        zzcfl zzcflVar = zzcgeVar.zzk().zza;
        zzcgf zzcgfVar = new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi());
        if (i == 3) {
            zzcfkVar = new zzcja(context, zzcgfVar);
            zzbhtVar2 = zzbhtVar;
        } else {
            if (i == 2) {
                zzcfiVar = new zzcgw(context, zzcgfVar, zzcgeVar, z, zzcfw.zza(zzcgeVar), zzcgdVar, zzdxzVar);
                zzbhtVar2 = zzbhtVar;
            } else {
                zzbhtVar2 = zzbhtVar;
                zzcfiVar = new zzcfi(context, zzcgeVar, z, zzcfw.zza(zzcgeVar), zzcgdVar, new zzcgf(context, zzcgeVar.zzs(), zzcgeVar.zzm(), zzbhtVar, zzcgeVar.zzi()), zzdxzVar);
            }
            zzcfkVar = zzcfiVar;
        }
        this.zzg = zzcfkVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcfkVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzam)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzar)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzao)).booleanValue();
        this.zzk = booleanValue;
        if (zzbhtVar2 != null) {
            zzbhtVar2.zzd("spinner_used", true != booleanValue ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        this.zza = new zzcgg(this);
        zzcfkVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcgeVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcfk zzcfkVar = this.zzg;
            if (zzcfkVar != null) {
                zzgzy zzgzyVar = zzcei.zzf;
                Objects.requireNonNull(zzcfkVar);
                zzgzyVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfp
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcfk.this.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcfs.this.zzG(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfj
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfo(this, z));
    }

    public final void zzA(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzB(i);
    }

    public final void zzB(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        TextView textView = new TextView(zzcfkVar.getContext());
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        String string = zzf == null ? "AdMob - " : zzf.getString(R.string.watermark_label_prefix);
        String zza = zzcfkVar.zza();
        String.valueOf(string);
        textView.setText(String.valueOf(string).concat(zza));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        long zzh = zzcfkVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = zzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
            zzI("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzcfkVar.zzo()), "qoeCachedBytes", String.valueOf(zzcfkVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcfkVar.zzm()), "droppedFrames", String.valueOf(zzcfkVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zzh;
    }

    final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzb() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null && this.zzm == 0) {
            zzI("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzcfkVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcfkVar.zzk()), "videoHeight", String.valueOf(zzcfkVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zzb();
        }
        zzcge zzcgeVar = this.zzb;
        if (zzcgeVar.zzj() != null && !this.zzi) {
            boolean z = (zzcgeVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzcgeVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcy)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcfn(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcfkVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbht zzbhtVar = this.zze;
            if (zzbhtVar != null) {
                zzbhtVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbgv zzbgvVar = zzbhe.zzaq;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfj
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcfs.this.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            return zzcfkVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzap)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar != null) {
            zzcfkVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcfkVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzf();
    }

    public final void zzs() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zze();
    }

    public final void zzt(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzi(i);
    }

    public final void zzu() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(true);
        zzcfkVar.zzq();
    }

    public final void zzv() {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zza(false);
        zzcfkVar.zzq();
    }

    public final void zzw(float f) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzb.zzb(f);
        zzcfkVar.zzq();
    }

    public final void zzx(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzy(i);
    }

    public final void zzy(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzz(i);
    }

    public final void zzz(int i) {
        zzcfk zzcfkVar = this.zzg;
        if (zzcfkVar == null) {
            return;
        }
        zzcfkVar.zzA(i);
    }
}
