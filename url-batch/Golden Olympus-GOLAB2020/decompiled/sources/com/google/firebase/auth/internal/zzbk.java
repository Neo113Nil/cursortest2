package com.google.firebase.auth.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaia;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbk {
    public static MultiFactorInfo zza(zzagz zzagzVar) {
        if (zzagzVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagzVar.zze())) {
            return new PhoneMultiFactorInfo(zzagzVar.zzd(), zzagzVar.zzc(), zzagzVar.zza(), Preconditions.checkNotEmpty(zzagzVar.zze()));
        }
        if (zzagzVar.zzb() != null) {
            return new TotpMultiFactorInfo(zzagzVar.zzd(), zzagzVar.zzc(), zzagzVar.zza(), (zzaia) Preconditions.checkNotNull(zzagzVar.zzb(), "totpInfo cannot be null."));
        }
        return null;
    }

    public static List<MultiFactorInfo> zza(List<zzagz> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<zzagz> it = list.iterator();
            while (it.hasNext()) {
                MultiFactorInfo zza = zza(it.next());
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}
