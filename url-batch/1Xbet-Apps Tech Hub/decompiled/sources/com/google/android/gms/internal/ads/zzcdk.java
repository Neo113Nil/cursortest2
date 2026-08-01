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
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzcdk extends FrameLayout implements zzcdb {
    final zzcdy zza;
    private final zzcdw zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdu zze;
    private final long zzf;
    private final zzcdc zzg;
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

    public zzcdk(Context context, zzcdw zzcdwVar, int i, boolean z, zzbdu zzbduVar, zzcdv zzcdvVar) {
        super(context);
        this.zzb = zzcdwVar;
        this.zze = zzbduVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcdwVar.zzj());
        zzcdd zzcddVar = zzcdwVar.zzj().zza;
        zzcdc zzceoVar = i == 2 ? new zzceo(context, new zzcdx(context, zzcdwVar.zzn(), zzcdwVar.zzbn(), zzbduVar, zzcdwVar.zzk()), zzcdwVar, z, zzcdo.zza(zzcdwVar), zzcdvVar) : new zzcda(context, zzcdwVar, z, zzcdo.zza(zzcdwVar), zzcdvVar, new zzcdx(context, zzcdwVar.zzn(), zzcdwVar.zzbn(), zzbduVar, zzcdwVar.zzk()));
        this.zzg = zzceoVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzceoVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzI)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbduVar != null) {
            zzbduVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcdy(this);
        zzceoVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
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
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcdc zzcdcVar = this.zzg;
            if (zzcdcVar != null) {
                zzcca.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcde
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcdc.this.zzt();
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
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdg
            @Override // java.lang.Runnable
            public final void run() {
                zzcdk.this.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcdb
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
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdj(this, z));
    }

    public final void zzA(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzb.zze(f);
        zzcdcVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar != null) {
            zzcdcVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzb.zzd(false);
        zzcdcVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbQ)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzb(String str, String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbQ)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzf() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar != null && this.zzm == 0) {
            float zzc = zzcdcVar.zzc();
            zzcdc zzcdcVar2 = this.zzg;
            zzK("canplaythrough", TypedValues.TransitionType.S_DURATION, String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcdcVar2.zze()), "videoHeight", String.valueOf(zzcdcVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdf
            @Override // java.lang.Runnable
            public final void run() {
                zzcdk.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzH)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzH)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdb
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            zzcbn.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbdu zzbduVar = this.zze;
            if (zzbduVar != null) {
                zzbduVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar != null) {
            return zzcdcVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        TextView textView = new TextView(zzcdcVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzt.zzo().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar != null) {
            zzcdcVar.zzt();
        }
        zzJ();
    }

    final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzb.zzd(true);
        zzcdcVar.zzn();
    }

    final void zzt() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        long zza = zzcdcVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f = zza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzbO)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzo();
    }

    public final void zzv() {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzp();
    }

    public final void zzw(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcdc zzcdcVar = this.zzg;
        if (zzcdcVar == null) {
            return;
        }
        zzcdcVar.zzy(i);
    }
}
