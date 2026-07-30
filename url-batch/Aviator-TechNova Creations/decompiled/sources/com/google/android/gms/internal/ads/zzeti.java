package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return zzgzo.zzk(this.zza.zza(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzeti.this.zzc((zzfbg) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 com.google.android.gms.internal.ads.zzetj, still in use, count: 4, list:
          (r4v1 com.google.android.gms.internal.ads.zzetj) from 0x02d3: MOVE (r20v0 com.google.android.gms.internal.ads.zzetj) = (r4v1 com.google.android.gms.internal.ads.zzetj)
          (r4v1 com.google.android.gms.internal.ads.zzetj) from 0x0212: MOVE (r20v3 com.google.android.gms.internal.ads.zzetj) = (r4v1 com.google.android.gms.internal.ads.zzetj)
          (r4v1 com.google.android.gms.internal.ads.zzetj) from 0x0260: MOVE (r20v5 com.google.android.gms.internal.ads.zzetj) = (r4v1 com.google.android.gms.internal.ads.zzetj)
          (r4v1 com.google.android.gms.internal.ads.zzetj) from 0x017f: MOVE (r20v6 com.google.android.gms.internal.ads.zzetj) = (r4v1 com.google.android.gms.internal.ads.zzetj)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    final /* synthetic */ com.google.android.gms.internal.ads.zzetj zzc(com.google.android.gms.internal.ads.zzfbg r22) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc(com.google.android.gms.internal.ads.zzfbg):com.google.android.gms.internal.ads.zzetj");
    }
}
