package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzfbq implements zzgyw {
    static final /* synthetic */ zzfbq zza = new zzfbq();

    private /* synthetic */ zzfbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgzo.zza(new zzfbs("", 1, null));
        }
        zzifk zzc = zzifl.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzifi zzc2 = zzifj.zzc();
            zzc2.zza(topic.getTopicId());
            zzc2.zzb(topic.getModelVersion());
            zzc2.zzc(topic.getTaxonomyVersion());
            zzc.zza((zzifj) zzc2.zzbu());
        }
        return zzgzo.zza(new zzfbs(Base64.encodeToString(((zzifl) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
