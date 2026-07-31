package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwb;
import com.google.android.gms.internal.p002firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbs {
    private final zzwl zza;
    private final List<zzbv> zzb;
    private final zznr zzc;

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzbv.<init>(com.google.android.gms.internal.firebase-auth-api.zzbo, com.google.android.gms.internal.firebase-auth-api.zzbq, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzby):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private static java.util.List<com.google.android.gms.internal.p002firebaseauthapi.zzbv> zzc(com.google.android.gms.internal.p002firebaseauthapi.zzwl r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.zza()
            r0.<init>(r1)
            java.util.List r1 = r9.zze()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r2 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza) r2
            int r6 = r2.zza()
            com.google.android.gms.internal.firebase-auth-api.zzbo r4 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzbv r3 = new com.google.android.gms.internal.firebase-auth-api.zzbv     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzwc r2 = r2.zzc()     // Catch: java.security.GeneralSecurityException -> L42
            com.google.android.gms.internal.firebase-auth-api.zzbq r5 = zza(r2)     // Catch: java.security.GeneralSecurityException -> L42
            int r2 = r9.zzb()     // Catch: java.security.GeneralSecurityException -> L42
            if (r6 != r2) goto L38
            r2 = 1
        L36:
            r7 = r2
            goto L3a
        L38:
            r2 = 0
            goto L36
        L3a:
            r8 = 0
            r3.<init>(r4, r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L42
            r0.add(r3)     // Catch: java.security.GeneralSecurityException -> L42
            goto L11
        L42:
            r2 = 0
            r0.add(r2)
            goto L11
        L47:
            java.util.List r9 = java.util.Collections.unmodifiableList(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbs.zzc(com.google.android.gms.internal.firebase-auth-api.zzwl):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzwl zzwlVar) {
        if (zzwlVar == null || zzwlVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzcn.zza(this.zza).toString();
    }

    private zzbs(zzwl zzwlVar, List<zzbv> list) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznr.zza;
    }

    private static zzbo zza(zzwl.zza zzaVar) {
        zzpn zza = zzpn.zza(zzaVar.zzb().zzf(), zzaVar.zzb().zze(), zzaVar.zzb().zzb(), zzaVar.zzf(), zzaVar.zzf() == zzxd.RAW ? null : Integer.valueOf(zzaVar.zza()));
        zzom zza2 = zzom.zza();
        zzcm zza3 = zzcm.zza();
        return !zza2.zzb(zza) ? new zznn(zza, zza3) : zza2.zza((zzom) zza, zza3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzwl.zza zzb(zzbo zzboVar, zzbq zzbqVar, int i4) {
        zzwc zzwcVar;
        zzpn zzpnVar = (zzpn) zzom.zza().zza(zzboVar, zzpn.class, zzcm.zza());
        Integer zze = zzpnVar.zze();
        if (zze != null && zze.intValue() != i4) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        if (zzbq.zza.equals(zzbqVar)) {
            zzwcVar = zzwc.ENABLED;
        } else if (zzbq.zzb.equals(zzbqVar)) {
            zzwcVar = zzwc.DISABLED;
        } else {
            if (!zzbq.zzc.equals(zzbqVar)) {
                throw new IllegalStateException("Unknown key status");
            }
            zzwcVar = zzwc.DESTROYED;
        }
        return (zzwl.zza) ((zzakg) zzwl.zza.zzd().zza(zzwb.zza().zza(zzpnVar.zzf()).zza(zzpnVar.zzd()).zza(zzpnVar.zza())).zza(zzwcVar).zza(i4).zza(zzpnVar.zzc()).zze());
    }

    private zzbs(zzwl zzwlVar, List<zzbv> list, zznr zznrVar) {
        this.zza = zzwlVar;
        this.zzb = list;
        this.zzc = zznrVar;
    }

    private static zzbq zza(zzwc zzwcVar) {
        int i4 = zzbr.zza[zzwcVar.ordinal()];
        if (i4 == 1) {
            return zzbq.zza;
        }
        if (i4 == 2) {
            return zzbq.zzb;
        }
        if (i4 == 3) {
            return zzbq.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    static final zzbs zza(zzwl zzwlVar) {
        zzd(zzwlVar);
        return new zzbs(zzwlVar, zzc(zzwlVar));
    }

    public static final zzbs zza(zzbp zzbpVar) {
        return new zzbu().zza(new zzbt(zzbpVar.zza()).zzb().zza()).zza();
    }

    final zzwl zzb() {
        return this.zza;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.firebase-auth-api.zzbv.<init>(com.google.android.gms.internal.firebase-auth-api.zzbo, com.google.android.gms.internal.firebase-auth-api.zzbq, int, boolean, com.google.android.gms.internal.firebase-auth-api.zzby):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:290)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:193)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzbs zza() {
        /*
            r13 = this;
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = r13.zza
            if (r0 == 0) goto Ld9
            com.google.android.gms.internal.firebase-auth-api.zzwl$zzb r0 = com.google.android.gms.internal.p002firebaseauthapi.zzwl.zzc()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbv> r2 = r13.zzb
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.List<com.google.android.gms.internal.firebase-auth-api.zzbv> r2 = r13.zzb
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L1b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lc0
            java.lang.Object r5 = r2.next()
            com.google.android.gms.internal.firebase-auth-api.zzbv r5 = (com.google.android.gms.internal.p002firebaseauthapi.zzbv) r5
            if (r5 == 0) goto L5a
            com.google.android.gms.internal.firebase-auth-api.zzbo r6 = r5.zzb()
            boolean r6 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzcf
            if (r6 == 0) goto L5a
            com.google.android.gms.internal.firebase-auth-api.zzbo r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzcf r6 = (com.google.android.gms.internal.p002firebaseauthapi.zzcf) r6
            com.google.android.gms.internal.firebase-auth-api.zzbo r8 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzbv r7 = new com.google.android.gms.internal.firebase-auth-api.zzbv
            com.google.android.gms.internal.firebase-auth-api.zzbq r9 = r5.zzc()
            int r10 = r5.zza()
            boolean r11 = r5.zzd()
            r12 = 0
            r7.<init>(r8, r9, r10, r11)
            com.google.android.gms.internal.firebase-auth-api.zzbq r6 = r5.zzc()
            int r5 = r5.zza()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = zzb(r8, r6, r5)
            goto Lae
        L5a:
            com.google.android.gms.internal.firebase-auth-api.zzwl r5 = r13.zza
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = r5.zza(r4)
            com.google.android.gms.internal.firebase-auth-api.zzwb r6 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r7 = r6.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzwb$zza r8 = com.google.android.gms.internal.firebase-auth-api.zzwb.zza.ASYMMETRIC_PRIVATE
            if (r7 != r8) goto Lb8
            java.lang.String r7 = r6.zzf()
            com.google.android.gms.internal.firebase-auth-api.zzaiw r6 = r6.zze()
            com.google.android.gms.internal.firebase-auth-api.zzwb r6 = com.google.android.gms.internal.p002firebaseauthapi.zzcj.zza(r7, r6)
            com.google.android.gms.internal.firebase-auth-api.zzakg$zzb r5 = r5.zzn()
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza$zza r5 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza.C0130zza) r5
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza$zza r5 = r5.zza(r6)
            com.google.android.gms.internal.firebase-auth-api.zzaln r5 = r5.zze()
            com.google.android.gms.internal.firebase-auth-api.zzakg r5 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg) r5
            com.google.android.gms.internal.firebase-auth-api.zzwl$zza r5 = (com.google.android.gms.internal.firebase-auth-api.zzwl.zza) r5
            com.google.android.gms.internal.firebase-auth-api.zzbo r7 = zza(r5)     // Catch: java.security.GeneralSecurityException -> Lad
            int r9 = r5.zza()     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzbv r6 = new com.google.android.gms.internal.firebase-auth-api.zzbv     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzwc r8 = r5.zzc()     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzbq r8 = zza(r8)     // Catch: java.security.GeneralSecurityException -> Lad
            com.google.android.gms.internal.firebase-auth-api.zzwl r10 = r13.zza     // Catch: java.security.GeneralSecurityException -> Lad
            int r10 = r10.zzb()     // Catch: java.security.GeneralSecurityException -> Lad
            if (r9 != r10) goto La6
            r10 = 1
            goto La7
        La6:
            r10 = r3
        La7:
            r11 = 0
            r6.<init>(r7, r8, r9, r10)     // Catch: java.security.GeneralSecurityException -> Lad
            r7 = r6
            goto Lae
        Lad:
            r7 = 0
        Lae:
            r0.zza(r5)
            r1.add(r7)
            int r4 = r4 + 1
            goto L1b
        Lb8:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "The keyset contains a non-private key"
            r0.<init>(r1)
            throw r0
        Lc0:
            com.google.android.gms.internal.firebase-auth-api.zzwl r2 = r13.zza
            int r2 = r2.zzb()
            r0.zza(r2)
            com.google.android.gms.internal.firebase-auth-api.zzbs r2 = new com.google.android.gms.internal.firebase-auth-api.zzbs
            com.google.android.gms.internal.firebase-auth-api.zzaln r0 = r0.zze()
            com.google.android.gms.internal.firebase-auth-api.zzakg r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzakg) r0
            com.google.android.gms.internal.firebase-auth-api.zzwl r0 = (com.google.android.gms.internal.p002firebaseauthapi.zzwl) r0
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = r13.zzc
            r2.<init>(r0, r1, r3)
            return r2
        Ld9:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cleartext keyset is not available"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbs.zza():com.google.android.gms.internal.firebase-auth-api.zzbs");
    }

    @Deprecated
    public static final zzbs zza(zzca zzcaVar, zzbe zzbeVar, byte[] bArr) {
        zzuz zza = zzcaVar.zza();
        if (zza != null && zza.zzc().zzb() != 0) {
            return zza(zza(zza, zzbeVar, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzwl zza(zzuz zzuzVar, zzbe zzbeVar, byte[] bArr) {
        try {
            zzwl zza = zzwl.zza(zzbeVar.zza(zzuzVar.zzc().zzd(), bArr), zzajv.zza());
            zzd(zza);
            return zza;
        } catch (zzakm unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbf zzbfVar, Class<P> cls) {
        if (zzbfVar instanceof zzmz) {
            zzmz zzmzVar = (zzmz) zzbfVar;
            Class<?> zza = zzmzVar.zza((Class<?>) cls);
            if (zza != null) {
                return (P) zza(zzmzVar, cls, zza);
            }
            throw new GeneralSecurityException("No wrapper found for " + cls.getName());
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <B, P> P zza(zzmz zzmzVar, Class<P> cls, Class<B> cls2) {
        zzcn.zzb(this.zza);
        zzpj zza = zzpg.zza(cls2);
        zza.zza(this.zzc);
        for (int i4 = 0; i4 < this.zzb.size(); i4++) {
            zzwl.zza zza2 = this.zza.zza(i4);
            if (zza2.zzc().equals(zzwc.ENABLED)) {
                zzbv zzbvVar = this.zzb.get(i4);
                if (zzbvVar != null) {
                    zzbo zzb = zzbvVar.zzb();
                    try {
                        Object zza3 = zzmzVar.zza(zzb, cls2);
                        if (zza2.zza() == this.zza.zzb()) {
                            zza.zzb(zza3, zzb, zza2);
                        } else {
                            zza.zza(zza3, zzb, zza2);
                        }
                    } catch (GeneralSecurityException e4) {
                        throw new GeneralSecurityException("Unable to get primitive " + String.valueOf(cls2) + " for key of type " + zza2.zzb().zzf() + ", see https://developers.google.com/tink/faq/registration_errors", e4);
                    }
                } else {
                    throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + zza2.zzb().zzf() + " failed, unable to get primitive");
                }
            }
        }
        return (P) zzmzVar.zza(zza.zza(), cls);
    }

    @Deprecated
    public final void zza(zzbz zzbzVar) {
        for (zzwl.zza zzaVar : this.zza.zze()) {
            if (zzaVar.zzb().zzb() == zzwb.zza.UNKNOWN_KEYMATERIAL || zzaVar.zzb().zzb() == zzwb.zza.SYMMETRIC || zzaVar.zzb().zzb() == zzwb.zza.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzaVar.zzb().zzb().name(), zzaVar.zzb().zzf()));
            }
        }
        zzbzVar.zza(this.zza);
    }

    @Deprecated
    public final void zza(zzbz zzbzVar, zzbe zzbeVar, byte[] bArr) {
        zzwl zzwlVar = this.zza;
        zzbzVar.zza((zzuz) ((zzakg) zzuz.zza().zza(zzaiw.zza(zzbeVar.zzb(zzwlVar.zzk(), bArr))).zza(zzcn.zza(zzwlVar)).zze()));
    }
}
