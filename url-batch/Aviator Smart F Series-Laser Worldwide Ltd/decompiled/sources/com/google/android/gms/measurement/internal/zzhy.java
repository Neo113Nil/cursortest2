package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
final class zzhy implements zzln {
    final /* synthetic */ zzij zza;

    zzhy(zzij zzijVar) {
        this.zza = zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzln
    public final void zza(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzD(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle);
        } else {
            this.zza.zzF(TtmlNode.TEXT_EMPHASIS_AUTO, "_err", bundle, str);
        }
    }
}
