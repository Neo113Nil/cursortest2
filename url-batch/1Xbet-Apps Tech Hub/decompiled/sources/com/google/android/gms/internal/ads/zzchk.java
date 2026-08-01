package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bumptech.glide.load.Key;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzchk extends FrameLayout implements zzcgv {
    private final zzcgv zza;
    private final zzcdl zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzchk(zzcgv zzcgvVar) {
        super(zzcgvVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcgvVar;
        this.zzb = new zzcdl(zzcgvVar.zzE(), this, this);
        addView((View) zzcgvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void destroy() {
        final zzflf zzQ = zzQ();
        if (zzQ == null) {
            this.zza.destroy();
            return;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchi
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzt.zzA().zzg(zzflf.this);
            }
        });
        final zzcgv zzcgvVar = this.zza;
        zzfqv zzfqvVar = com.google.android.gms.ads.internal.util.zzt.zza;
        zzcgvVar.getClass();
        zzfqvVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchj
            @Override // java.lang.Runnable
            public final void run() {
                zzcgv.this.destroy();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzeU)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", Key.STRING_CHARSET_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgv
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final void zzC(zzchr zzchrVar) {
        this.zza.zzC(zzchrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcgm
    public final zzfdu zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcif
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcid
    public final zzasi zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final zzaxd zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final zzbfv zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final zzcii zzN() {
        return ((zzcho) this.zza).zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcic
    public final zzcik zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzchs
    public final zzfdy zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final zzflf zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final ListenableFuture zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzT(zzfdu zzfduVar, zzfdy zzfdyVar) {
        this.zza.zzT(zzfduVar, zzfdyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzV() {
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzW(int i) {
        this.zza.zzW(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzY() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcho zzchoVar = (zzcho) this.zza;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzac.zzb(zzchoVar.getContext())));
        zzchoVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzZ(boolean z) {
        this.zza.zzZ(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zza(String str) {
        ((zzcho) this.zza).zzaO(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaD(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaE(String str, String str2, int i) {
        this.zza.zzaE(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaF(boolean z, int i, boolean z2) {
        this.zza.zzaF(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaG(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaG(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcia
    public final void zzaH(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaH(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzad(String str, zzbkd zzbkdVar) {
        this.zza.zzad(str, zzbkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzt.zzx());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzaf(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzag(zzcik zzcikVar) {
        this.zza.zzag(zzcikVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzah(zzaxd zzaxdVar) {
        this.zza.zzah(zzaxdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzai(boolean z) {
        this.zza.zzai(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzam(zzbft zzbftVar) {
        this.zza.zzam(zzbftVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzao(zzbfv zzbfvVar) {
        this.zza.zzao(zzbfvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzap(zzflf zzflfVar) {
        this.zza.zzap(zzflfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzaq(int i) {
        this.zza.zzaq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzar(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzas(boolean z) {
        this.zza.zzas(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzat(boolean z) {
        this.zza.zzat(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzau(String str, zzbkd zzbkdVar) {
        this.zza.zzau(str, zzbkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzay(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzaK)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzbL() {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.zzbL();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbl() {
        this.zza.zzbl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final String zzbn() {
        return this.zza.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzbu(zzavp zzavpVar) {
        this.zza.zzbu(zzavpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmx
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdI)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzdI)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcdw
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final zzbdr zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbnk
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcho) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final zzbds zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcie, com.google.android.gms.internal.ads.zzcdw
    public final zzcbt zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final zzcdl zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final zzcfh zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final zzchr zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzdge
    public final void zzs() {
        zzcgv zzcgvVar = this.zza;
        if (zzcgvVar != null) {
            zzcgvVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv, com.google.android.gms.internal.ads.zzcdw
    public final void zzt(String str, zzcfh zzcfhVar) {
        this.zza.zzt(str, zzcfhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
