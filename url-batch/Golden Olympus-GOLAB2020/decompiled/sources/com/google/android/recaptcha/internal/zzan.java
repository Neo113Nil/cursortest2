package com.google.android.recaptcha.internal;

import a2.AbstractC1241b;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.AbstractC3364y;
import o2.InterfaceC3316J;
import o2.InterfaceC3360w;
import o2.Q;
import x2.AbstractC3517c;
import x2.InterfaceC3515a;

/* loaded from: classes.dex */
public final class zzan {
    public InterfaceC3360w zza;
    private final InterfaceC3316J zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final InterfaceC3515a zzg = AbstractC3517c.b(false, 1, null);

    public zzan(Context context, InterfaceC3316J interfaceC3316J, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j4) {
        this.zzb = interfaceC3316J;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(d dVar) {
        zzag zzagVar;
        int i4;
        if (dVar instanceof zzag) {
            zzagVar = (zzag) dVar;
            int i5 = zzagVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzagVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzagVar.zzc;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                    return obj;
                }
                ResultKt.a(obj);
                Q zza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                zzagVar.zzc = 1;
                Object await = zza.await(zzagVar);
                return await == f4 ? f4 : await;
            }
        }
        zzagVar = new zzag(this, dVar);
        Object obj2 = zzagVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzagVar.zzc;
        if (i4 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, d dVar) {
        zzah zzahVar;
        int i4;
        if (dVar instanceof zzah) {
            zzahVar = (zzah) dVar;
            int i5 = zzahVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzahVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    InterfaceC3360w zzf = zzf();
                    zzahVar.zzd = str;
                    zzahVar.zzc = 1;
                    obj = zzf.await(zzahVar);
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzahVar.zzd;
                    ResultKt.a(obj);
                }
                Q zza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzahVar.zzd = null;
                zzahVar.zzc = 2;
                obj = zza.await(zzahVar);
            }
        }
        zzahVar = new zzah(this, dVar);
        Object obj2 = zzahVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzahVar.zzc;
        if (i4 != 0) {
        }
        Q zza2 = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        obj2 = zza2.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r2.zze(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, d dVar) {
        zzaf zzafVar;
        int i4;
        zzan zzanVar;
        if (dVar instanceof zzaf) {
            zzafVar = (zzaf) dVar;
            int i5 = zzafVar.zzc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i5 - Integer.MIN_VALUE;
                Object obj = zzafVar.zza;
                Object f4 = AbstractC1241b.f();
                i4 = zzafVar.zzc;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    try {
                        zzafVar.zzd = this;
                        zzafVar.zze = str;
                        zzafVar.zzc = 1;
                        obj = zzj(str, zzafVar);
                        if (obj != f4) {
                            zzanVar = this;
                        }
                    } catch (Exception unused) {
                        zzanVar = this;
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                    return f4;
                }
                if (i4 == 1) {
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    try {
                        ResultKt.a(obj);
                    } catch (Exception unused2) {
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                } else {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return (String) obj;
                    }
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    ResultKt.a(obj);
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    obj = zzanVar.zzj(str, zzafVar);
                }
                return (String) obj;
            }
        }
        zzafVar = new zzaf(this, dVar);
        Object obj2 = zzafVar.zza;
        Object f42 = AbstractC1241b.f();
        i4 = zzafVar.zzc;
        if (i4 != 0) {
        }
        return (String) obj2;
    }

    public final Object zzd(long j4, d dVar) {
        this.zzf = j4;
        return Unit.f41027a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (kotlin.Unit.f41027a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:18:0x0052, B:20:0x005c, B:23:0x0065), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:18:0x0052, B:20:0x005c, B:23:0x0065), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(d dVar) {
        zzak zzakVar;
        int i4;
        InterfaceC3515a interfaceC3515a;
        zzan zzanVar;
        try {
            if (dVar instanceof zzak) {
                zzakVar = (zzak) dVar;
                int i5 = zzakVar.zzd;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    zzakVar.zzd = i5 - Integer.MIN_VALUE;
                    Object obj = zzakVar.zzb;
                    Object f4 = AbstractC1241b.f();
                    i4 = zzakVar.zzd;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        interfaceC3515a = this.zzg;
                        zzakVar.zze = this;
                        zzakVar.zza = interfaceC3515a;
                        zzakVar.zzd = 1;
                        if (interfaceC3515a.b(null, zzakVar) != f4) {
                            zzanVar = this;
                        }
                        return f4;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.a(obj);
                        return Unit.f41027a;
                    }
                    interfaceC3515a = (InterfaceC3515a) zzakVar.zza;
                    zzanVar = zzakVar.zze;
                    ResultKt.a(obj);
                    if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
                        Unit unit = Unit.f41027a;
                        interfaceC3515a.c(null);
                        return unit;
                    }
                    zzanVar.zze = zzao.zzb;
                    Unit unit2 = Unit.f41027a;
                    interfaceC3515a.c(null);
                    zzek zzekVar = zzanVar.zzc;
                    zzekVar.zzc(zzekVar.zzd());
                    zzekVar.zzb(2);
                    zzen zzf = zzekVar.zzf(38);
                    zzanVar.zza = AbstractC3364y.c(null, 1, null);
                    AbstractC3337k.d(zzanVar.zzb, null, null, new zzam(zzanVar, zzf, null), 3, null);
                    zzakVar.zze = null;
                    zzakVar.zza = null;
                    zzakVar.zzd = 2;
                    if (!zzanVar.zzh) {
                        new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                        zzanVar.zzh = true;
                    }
                }
            }
            if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
            }
        } catch (Throwable th) {
            interfaceC3515a.c(null);
            throw th;
        }
        zzakVar = new zzak(this, dVar);
        Object obj2 = zzakVar.zzb;
        Object f42 = AbstractC1241b.f();
        i4 = zzakVar.zzd;
        if (i4 != 0) {
        }
    }

    public final InterfaceC3360w zzf() {
        InterfaceC3360w interfaceC3360w = this.zza;
        if (interfaceC3360w != null) {
            return interfaceC3360w;
        }
        return null;
    }
}
