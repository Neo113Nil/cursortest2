package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.work.WorkRequest;
import com.bumptech.glide.load.Key;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
/* loaded from: classes2.dex */
public final class zzbe implements ConsentForm {
    private final Application zzb;
    private final zzae zzc;
    private final zzby zzd;
    private final zzas zze;
    private final zzbs zzf;
    private final zzdr zzg;
    private Dialog zzh;
    private zzbw zzi;
    private final AtomicBoolean zzj = new AtomicBoolean();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    private final AtomicReference zzm = new AtomicReference();
    boolean zza = false;

    public zzbe(Application application, zzae zzaeVar, zzby zzbyVar, zzas zzasVar, zzbs zzbsVar, zzdr zzdrVar) {
        this.zzb = application;
        this.zzc = zzaeVar;
        this.zzd = zzbyVar;
        this.zze = zzasVar;
        this.zzf = zzbsVar;
        this.zzg = zzdrVar;
    }

    private final void zzg() {
        Dialog dialog = this.zzh;
        if (dialog != null) {
            dialog.dismiss();
            this.zzh = null;
        }
        this.zzd.zza(null);
        zzbb zzbbVar = (zzbb) this.zzm.getAndSet(null);
        if (zzbbVar != null) {
            zzbbVar.zza.zzb.unregisterActivityLifecycleCallbacks(zzbbVar);
        }
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        zzct.zza();
        if (!this.zzj.compareAndSet(false, true)) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza());
            return;
        }
        zzbb zzbbVar = new zzbb(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzbbVar);
        this.zzm.set(zzbbVar);
        this.zzd.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzi);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            onConsentFormDismissedListener.onConsentFormDismissed(new zzi(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        this.zzl.set(onConsentFormDismissedListener);
        dialog.show();
        this.zzh = dialog;
        this.zzi.zzc("UMP_messagePresented", "");
    }

    final zzbw zza() {
        return this.zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void zzb(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        zzbw zzb = ((zzbx) this.zzg).zzb();
        this.zzi = zzb;
        zzb.setBackgroundColor(0);
        zzb.getSettings().setJavaScriptEnabled(true);
        zzb.setWebViewClient(new zzbv(zzb, null));
        this.zzk.set(new zzbd(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, 0 == true ? 1 : 0));
        this.zzi.loadDataWithBaseURL(this.zzf.zza(), this.zzf.zzb(), "text/html", Key.STRING_CHARSET_NAME, null);
        zzct.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbe.this.zzf(new zzi(4, "Web view timed out."));
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    final void zzc(int i) {
        zzg();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzl.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        this.zze.zzg(3);
        onConsentFormDismissedListener.onConsentFormDismissed(null);
    }

    final void zzd(zzi zziVar) {
        zzg();
        ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener = (ConsentForm.OnConsentFormDismissedListener) this.zzl.getAndSet(null);
        if (onConsentFormDismissedListener == null) {
            return;
        }
        onConsentFormDismissedListener.onConsentFormDismissed(zziVar.zza());
    }

    final void zze() {
        zzbd zzbdVar = (zzbd) this.zzk.getAndSet(null);
        if (zzbdVar == null) {
            return;
        }
        zzbdVar.onConsentFormLoadSuccess(this);
    }

    final void zzf(zzi zziVar) {
        zzbd zzbdVar = (zzbd) this.zzk.getAndSet(null);
        if (zzbdVar == null) {
            return;
        }
        zzbdVar.onConsentFormLoadFailure(zziVar.zza());
    }
}
