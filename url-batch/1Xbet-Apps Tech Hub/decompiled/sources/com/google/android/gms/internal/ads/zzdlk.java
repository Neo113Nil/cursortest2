package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzdlk {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfeq zzc;
    private final zzdkp zzd;
    private final zzdkk zze;
    private final zzdlw zzf;
    private final zzdme zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfw zzj;
    private final zzdkh zzk;

    public zzdlk(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfeq zzfeqVar, zzdkp zzdkpVar, zzdkk zzdkkVar, zzdlw zzdlwVar, zzdme zzdmeVar, Executor executor, Executor executor2, zzdkh zzdkhVar) {
        this.zzb = zzgVar;
        this.zzc = zzfeqVar;
        this.zzj = zzfeqVar.zzi;
        this.zzd = zzdkpVar;
        this.zze = zzdkkVar;
        this.zzf = zzdlwVar;
        this.zzg = zzdmeVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdkhVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzf = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdH)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdkk zzdkkVar = this.zze;
        if (zzdkkVar.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdkkVar.zzc() == 2 || zzdkkVar.zzc() == 1) {
                this.zzb.zzJ(this.zzc.zzf, String.valueOf(zzdkkVar.zzc()), z);
            } else if (zzdkkVar.zzc() == 6) {
                this.zzb.zzJ(this.zzc.zzf, ExifInterface.GPS_MEASUREMENT_2D, z);
                this.zzb.zzJ(this.zzc.zzf, "1", z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzb(zzdmg zzdmgVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbgf zza2;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzg = zzdmgVar.zzg(strArr[i]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdmgVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdkk zzdkkVar = this.zze;
        if (zzdkkVar.zze() != null) {
            zzbfw zzbfwVar = this.zzj;
            view = zzdkkVar.zze();
            if (zzbfwVar != null && viewGroup == null) {
                zzh(layoutParams, zzbfwVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdkkVar.zzl() instanceof zzbfr) {
            zzbfr zzbfrVar = (zzbfr) zzdkkVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfrVar.zzc());
                viewGroup = null;
            }
            View zzbfsVar = new zzbfs(context, zzbfrVar, layoutParams);
            zzbfsVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdF));
            view = zzbfsVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdmgVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdmgVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdmgVar.zzq(zzdmgVar.zzk(), view, true);
        }
        zzfwu zzfwuVar = zzdlg.zza;
        int size = zzfwuVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdmgVar.zzg((String) zzfwuVar.get(i2));
            i2++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // java.lang.Runnable
            public final void run() {
                zzdlk.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdkk zzdkkVar2 = this.zze;
            if (zzdkkVar2.zzs() != null) {
                zzdkkVar2.zzs().zzao(new zzdlj(zzdmgVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjA)).booleanValue() && zzi(viewGroup2, false)) {
            zzdkk zzdkkVar3 = this.zze;
            if (zzdkkVar3.zzq() != null) {
                zzdkkVar3.zzq().zzao(new zzdlj(zzdmgVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdmgVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzi = zza2.zzi();
            if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzj = zzdmgVar.zzj();
            if (zzj != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzgh)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            zzcbn.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(zzdmg zzdmgVar) {
        if (zzdmgVar == null || this.zzf == null || zzdmgVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdmgVar.zzh().addView(this.zzf.zza());
        } catch (zzchg e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(zzdmg zzdmgVar) {
        if (zzdmgVar == null) {
            return;
        }
        Context context = zzdmgVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                zzcbn.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdmgVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdmgVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
            } catch (zzchg e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdmg zzdmgVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // java.lang.Runnable
            public final void run() {
                zzdlk.this.zzb(zzdmgVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
