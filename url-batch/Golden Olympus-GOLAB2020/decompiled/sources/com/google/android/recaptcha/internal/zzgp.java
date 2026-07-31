package com.google.android.recaptcha.internal;

import com.ironsource.b9;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Objects;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i4, zzgd zzgdVar, zzue... zzueVarArr) {
        String joinToString$default;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            joinToString$default = AbstractC3219i.l0((int[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, Charsets.UTF_8);
            } else if (zza2 instanceof long[]) {
                joinToString$default = AbstractC3219i.m0((long[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            } else if (zza2 instanceof short[]) {
                joinToString$default = AbstractC3219i.o0((short[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            } else if (zza2 instanceof float[]) {
                joinToString$default = AbstractC3219i.k0((float[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            } else if (zza2 instanceof double[]) {
                joinToString$default = AbstractC3219i.j0((double[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                joinToString$default = AbstractC3219i.n0((Object[]) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                joinToString$default = CollectionsKt.joinToString$default((Iterable) zza2, StringUtils.COMMA, b9.i.f15550d, b9.i.f15552e, 0, null, null, 56, null);
            }
            joinToString$default = str;
        }
        zzgdVar.zzc().zze(i4, joinToString$default);
    }
}
