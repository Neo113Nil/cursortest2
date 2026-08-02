package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzaun extends zzaum {
    protected zzaun(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzaun zzt(String str, Context context, boolean z) {
        zzr(context, false);
        return new zzaun(context, str, false);
    }

    @Deprecated
    public static zzaun zzu(String str, Context context, boolean z, int i) {
        zzr(context, z);
        return new zzaun(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaum
    protected final List zzp(zzavp zzavpVar, Context context, zzaro zzaroVar, zzarh zzarhVar) {
        if (zzavpVar.zzk() == null || !this.zzu) {
            return super.zzp(zzavpVar, context, zzaroVar, null);
        }
        int zza = zzavpVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzavpVar, context, zzaroVar, null));
        arrayList.add(new zzawh(zzavpVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzaroVar, zza, 24));
        return arrayList;
    }
}
