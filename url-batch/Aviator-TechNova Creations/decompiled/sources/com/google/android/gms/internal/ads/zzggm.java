package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzggm extends zzghb {
    private final Context zza;

    zzggm(zzawg zzawgVar, zzgfx zzgfxVar, Context context, zzgoe zzgoeVar) {
        super("PH59Z8k3dpWxORUT8HU0o+g5WN12ilbJvwpqiSzw0bSm8ti3u+Yy1pYDsitXR/IS", "EBTPDqTGNNE4oafrCuyvamIcg1nistjqiNmDYn1J+fs=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.DREM));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzawgVar) {
            zzawgVar.zzO(((Integer) objArr2[0]).intValue());
            int i = 1;
            zzawgVar.zzd(((Integer) objArr2[1]).intValue());
            zzawgVar.zze(((Integer) objArr2[2]).intValue());
            zzawgVar.zzab(((Integer) objArr2[3]).intValue());
            Boolean bool = (Boolean) objArr2[4];
            if (bool == null) {
                zzawgVar.zzaf(3);
            } else {
                zzawgVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            Boolean bool2 = (Boolean) objArr2[5];
            if (bool2 == null) {
                zzawgVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzawgVar.zzae(i);
            }
        }
    }
}
