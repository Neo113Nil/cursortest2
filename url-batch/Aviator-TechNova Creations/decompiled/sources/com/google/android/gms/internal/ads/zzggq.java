package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzggq extends zzghb {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzggq(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", zzawgVar, zzgfxVar, zzgoeVar.zza(Opcodes.LNEG));
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    protected final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    Long l = (Long) method.invoke("", new Object[0]);
                    if (l == null) {
                        throw null;
                    }
                    Long l2 = l;
                    zza = l;
                }
            }
        }
        synchronized (zzawgVar) {
            if (zza != null) {
                zzawgVar.zzm(zza.longValue());
            }
        }
    }
}
