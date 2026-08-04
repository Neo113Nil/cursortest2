package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbqc extends zzbpl {
    private final NativeAdMapper zza;

    public zzbqc(NativeAdMapper nativeAdMapper) {
        this.zza = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzA() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzB() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzC() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zze() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzf() {
        List<NativeAd.Image> images = this.zza.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbfh(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzg() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfw zzh() {
        NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new zzbfh(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzi() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzj() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zzk() {
        NativeAdMapper nativeAdMapper = this.zza;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzl() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzm() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfp zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzp() {
        View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzq() {
        View zza = this.zza.zza();
        if (zza == null) {
            return null;
        }
        return ObjectWrapper.wrap(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final IObjectWrapper zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzs() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzt() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzu() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        HashMap hashMap = (HashMap) ObjectWrapper.unwrap(iObjectWrapper2);
        HashMap hashMap2 = (HashMap) ObjectWrapper.unwrap(iObjectWrapper3);
        this.zza.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzz() {
        return this.zza.getMediaContentAspectRatio();
    }
}
