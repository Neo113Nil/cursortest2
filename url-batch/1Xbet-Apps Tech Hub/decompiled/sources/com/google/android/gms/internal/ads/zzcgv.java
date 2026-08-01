package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public interface zzcgv extends com.google.android.gms.ads.internal.client.zza, zzdge, zzcgm, zzbmx, zzchs, zzchw, zzbnk, zzavq, zzcia, com.google.android.gms.ads.internal.zzl, zzcid, zzcie, zzcdw, zzcif {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcdw
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcdw
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcdw
    void zzC(zzchr zzchrVar);

    @Override // com.google.android.gms.internal.ads.zzcgm
    zzfdu zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcif
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcid
    zzasi zzI();

    zzaxd zzJ();

    zzbfv zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcii zzN();

    @Override // com.google.android.gms.internal.ads.zzcic
    zzcik zzO();

    @Override // com.google.android.gms.internal.ads.zzchs
    zzfdy zzP();

    zzflf zzQ();

    ListenableFuture zzR();

    String zzS();

    void zzT(zzfdu zzfduVar, zzfdy zzfdyVar);

    void zzU();

    void zzV();

    void zzW(int i);

    void zzX();

    void zzY();

    void zzZ(boolean z);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbkd zzbkdVar);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzag(zzcik zzcikVar);

    void zzah(zzaxd zzaxdVar);

    void zzai(boolean z);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z);

    void zzam(zzbft zzbftVar);

    void zzan(boolean z);

    void zzao(zzbfv zzbfvVar);

    void zzap(zzflf zzflfVar);

    void zzaq(int i);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzas(boolean z);

    void zzat(boolean z);

    void zzau(String str, zzbkd zzbkdVar);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z, int i);

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzchw, com.google.android.gms.internal.ads.zzcdw
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzcdw
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzcdw
    zzbds zzm();

    @Override // com.google.android.gms.internal.ads.zzcie, com.google.android.gms.internal.ads.zzcdw
    zzcbt zzn();

    @Override // com.google.android.gms.internal.ads.zzcdw
    zzchr zzq();

    @Override // com.google.android.gms.internal.ads.zzcdw
    void zzt(String str, zzcfh zzcfhVar);
}
