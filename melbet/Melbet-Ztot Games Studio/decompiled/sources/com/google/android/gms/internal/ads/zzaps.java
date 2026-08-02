package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzaps {
    public static final boolean zza = zzapt.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzaps() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzapt.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzapr(str, j, SystemClock.elapsedRealtime()));
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final synchronized void zzb(java.lang.String r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 1
            r10.zzc = r0     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r10.zzb     // Catch: java.lang.Throwable -> L7f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L7f
            r2 = 0
            r4 = 0
            if (r1 != 0) goto L11
            r7 = r2
            goto L2c
        L11:
            java.util.List r1 = r10.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzapr r1 = (com.google.android.gms.internal.ads.zzapr) r1     // Catch: java.lang.Throwable -> L7f
            long r5 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            java.util.List r1 = r10.zzb     // Catch: java.lang.Throwable -> L7f
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L7f
            int r7 = r7 + (-1)
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzapr r1 = (com.google.android.gms.internal.ads.zzapr) r1     // Catch: java.lang.Throwable -> L7f
            long r7 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            long r7 = r7 - r5
        L2c:
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 > 0) goto L31
            goto L7d
        L31:
            java.util.List r1 = r10.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzapr r1 = (com.google.android.gms.internal.ads.zzapr) r1     // Catch: java.lang.Throwable -> L7f
            long r1 = r1.zzc     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L7f
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7f
            r6[r4] = r3     // Catch: java.lang.Throwable -> L7f
            r6[r0] = r11     // Catch: java.lang.Throwable -> L7f
            java.lang.String r11 = "(%-4d ms) %s"
            com.google.android.gms.internal.ads.zzapt.zza(r11, r6)     // Catch: java.lang.Throwable -> L7f
            java.util.List r11 = r10.zzb     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L7f
        L51:
            boolean r3 = r11.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r11.next()     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzapr r3 = (com.google.android.gms.internal.ads.zzapr) r3     // Catch: java.lang.Throwable -> L7f
            long r6 = r3.zzc     // Catch: java.lang.Throwable -> L7f
            long r1 = r6 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L7f
            long r8 = r3.zzb     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r3 = r3.zza     // Catch: java.lang.Throwable -> L7f
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L7f
            r8[r4] = r1     // Catch: java.lang.Throwable -> L7f
            r8[r0] = r2     // Catch: java.lang.Throwable -> L7f
            r8[r5] = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = "(+%-4d) [%2d] %s"
            com.google.android.gms.internal.ads.zzapt.zza(r1, r8)     // Catch: java.lang.Throwable -> L7f
            r1 = r6
            goto L51
        L7d:
            monitor-exit(r10)
            return
        L7f:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaps.zzb(java.lang.String):void");
    }
}
