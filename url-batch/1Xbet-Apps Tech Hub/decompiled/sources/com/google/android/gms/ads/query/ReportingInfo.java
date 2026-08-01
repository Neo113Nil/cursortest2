package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
public final class ReportingInfo {
    private final zzbum zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
    public static final class Builder {
        private final zzbul zza;

        public Builder(View view) {
            zzbul zzbulVar = new zzbul();
            this.zza = zzbulVar;
            zzbulVar.zzb(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbum(builder.zza);
    }

    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
