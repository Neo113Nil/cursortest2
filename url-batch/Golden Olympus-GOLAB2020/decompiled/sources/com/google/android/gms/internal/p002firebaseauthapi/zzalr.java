package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C3139z9;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzalr<T> implements zzamc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzana.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaln zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalv zzn;
    private final zzakx zzo;
    private final zzamv<?, ?> zzp;
    private final zzajx<?> zzq;
    private final zzalg zzr;

    private zzalr(int[] iArr, Object[] objArr, int i4, int i5, zzaln zzalnVar, boolean z4, int[] iArr2, int i6, int i7, zzalv zzalvVar, zzakx zzakxVar, zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzalg zzalgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzi = zzalnVar instanceof zzakg;
        this.zzh = zzajxVar != null && zzajxVar.zza(zzalnVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i6;
        this.zzm = i7;
        this.zzn = zzalvVar;
        this.zzo = zzakxVar;
        this.zzp = zzamvVar;
        this.zzq = zzajxVar;
        this.zzg = zzalnVar;
        this.zzr = zzalgVar;
    }

    private static <T> double zza(T t4, long j4) {
        return ((Double) zzana.zze(t4, j4)).doubleValue();
    }

    private static <T> float zzb(T t4, long j4) {
        return ((Float) zzana.zze(t4, j4)).floatValue();
    }

    private static <T> int zzc(T t4, long j4) {
        return ((Integer) zzana.zze(t4, j4)).intValue();
    }

    private static <T> long zzd(T t4, long j4) {
        return ((Long) zzana.zze(t4, j4)).longValue();
    }

    private final zzamc zze(int i4) {
        int i5 = (i4 / 3) << 1;
        zzamc zzamcVar = (zzamc) this.zzd[i5];
        if (zzamcVar != null) {
            return zzamcVar;
        }
        zzamc<T> zza2 = zzaly.zza().zza((Class) this.zzd[i5 + 1]);
        this.zzd[i5] = zza2;
        return zza2;
    }

    private final Object zzf(int i4) {
        return this.zzd[(i4 / 3) << 1];
    }

    private static boolean zzg(int i4) {
        return (i4 & 536870912) != 0;
    }

    private static int zza(byte[] bArr, int i4, int i5, zzanh zzanhVar, Class<?> cls, zzaiv zzaivVar) {
        switch (zzalq.zza[zzanhVar.ordinal()]) {
            case 1:
                int zzd = zzais.zzd(bArr, i4, zzaivVar);
                zzaivVar.zzc = Boolean.valueOf(zzaivVar.zzb != 0);
                return zzd;
            case 2:
                return zzais.zza(bArr, i4, zzaivVar);
            case 3:
                zzaivVar.zzc = Double.valueOf(zzais.zza(bArr, i4));
                return i4 + 8;
            case 4:
            case 5:
                zzaivVar.zzc = Integer.valueOf(zzais.zzc(bArr, i4));
                return i4 + 4;
            case 6:
            case 7:
                zzaivVar.zzc = Long.valueOf(zzais.zzd(bArr, i4));
                return i4 + 8;
            case 8:
                zzaivVar.zzc = Float.valueOf(zzais.zzb(bArr, i4));
                return i4 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzais.zzc(bArr, i4, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaivVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzais.zzd(bArr, i4, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaivVar.zzb);
                return zzd2;
            case 14:
                return zzais.zza(zzaly.zza().zza((Class) cls), bArr, i4, i5, zzaivVar);
            case 15:
                int zzc2 = zzais.zzc(bArr, i4, zzaivVar);
                zzaivVar.zzc = Integer.valueOf(zzaji.zza(zzaivVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzais.zzd(bArr, i4, zzaivVar);
                zzaivVar.zzc = Long.valueOf(zzaji.zza(zzaivVar.zzb));
                return zzd3;
            case 17:
                return zzais.zzb(bArr, i4, zzaivVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i4) {
        return this.zzc[i4 + 1];
    }

    private final zzakk zzd(int i4) {
        return (zzakk) this.zzd[((i4 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzakg) {
            return ((zzakg) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zzb(T t4) {
        int i4;
        int zza2;
        int length = this.zzc.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int zzc = zzc(i6);
            int i7 = this.zzc[i6];
            long j4 = 1048575 & zzc;
            int i8 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(Double.doubleToLongBits(zzana.zza(t4, j4)));
                    i5 = i4 + zza2;
                    break;
                case 1:
                    i4 = i5 * 53;
                    zza2 = Float.floatToIntBits(zzana.zzb(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 2:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 3:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 4:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 5:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 6:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 7:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzh(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 8:
                    i4 = i5 * 53;
                    zza2 = ((String) zzana.zze(t4, j4)).hashCode();
                    i5 = i4 + zza2;
                    break;
                case 9:
                    Object zze = zzana.zze(t4, j4);
                    if (zze != null) {
                        i8 = zze.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 10:
                    i4 = i5 * 53;
                    zza2 = zzana.zze(t4, j4).hashCode();
                    i5 = i4 + zza2;
                    break;
                case 11:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 12:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 13:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 14:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 15:
                    i4 = i5 * 53;
                    zza2 = zzana.zzc(t4, j4);
                    i5 = i4 + zza2;
                    break;
                case 16:
                    i4 = i5 * 53;
                    zza2 = zzaki.zza(zzana.zzd(t4, j4));
                    i5 = i4 + zza2;
                    break;
                case 17:
                    Object zze2 = zzana.zze(t4, j4);
                    if (zze2 != null) {
                        i8 = zze2.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case C3139z9.f40333J /* 35 */:
                case 36:
                case 37:
                case C3139z9.f40334K /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    zza2 = zzana.zze(t4, j4).hashCode();
                    i5 = i4 + zza2;
                    break;
                case 50:
                    i4 = i5 * 53;
                    zza2 = zzana.zze(t4, j4).hashCode();
                    i5 = i4 + zza2;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(Double.doubleToLongBits(zza(t4, j4)));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = Float.floatToIntBits(zzb(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zzd(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zzd(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zzd(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zze(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = ((String) zzana.zze(t4, j4)).hashCode();
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzana.zze(t4, j4).hashCode();
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzana.zze(t4, j4).hashCode();
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zzd(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzc(t4, j4);
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzaki.zza(zzd(t4, j4));
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzalr<T>) t4, i7, i6)) {
                        i4 = i5 * 53;
                        zza2 = zzana.zze(t4, j4).hashCode();
                        i5 = i4 + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i5 * 53) + this.zzp.zzd(t4).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t4).hashCode() : hashCode;
    }

    static zzamy zzc(Object obj) {
        zzakg zzakgVar = (zzakg) obj;
        zzamy zzamyVar = zzakgVar.zzb;
        if (zzamyVar != zzamy.zzc()) {
            return zzamyVar;
        }
        zzamy zzd = zzamy.zzd();
        zzakgVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zzd(T t4) {
        if (zzg(t4)) {
            if (t4 instanceof zzakg) {
                zzakg zzakgVar = (zzakg) t4;
                zzakgVar.zzb(Integer.MAX_VALUE);
                zzakgVar.zza = 0;
                zzakgVar.zzu();
            }
            int length = this.zzc.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int zzc = zzc(i4);
                long j4 = 1048575 & zzc;
                int i5 = (zzc & 267386880) >>> 20;
                if (i5 != 9) {
                    if (i5 != 60 && i5 != 68) {
                        switch (i5) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case ConnectionResult.API_DISABLED /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            case 29:
                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case C3139z9.f40333J /* 35 */:
                            case 36:
                            case 37:
                            case C3139z9.f40334K /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(t4, j4);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t4, j4);
                                if (object != null) {
                                    unsafe.putObject(t4, j4, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzalr<T>) t4, this.zzc[i4], i4)) {
                        zze(i4).zzd(zzb.getObject(t4, j4));
                    }
                }
                if (zzc((zzalr<T>) t4, i4)) {
                    zze(i4).zzd(zzb.getObject(t4, j4));
                }
            }
            this.zzp.zzf(t4);
            if (this.zzh) {
                this.zzq.zzc(t4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzamc] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final boolean zze(T t4) {
        int i4;
        int i5;
        zzalr<T> zzalrVar;
        T t5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzl) {
            int i9 = this.zzk[i7];
            int i10 = this.zzc[i9];
            int zzc = zzc(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i8 = zzb.getInt(t4, i12);
                }
                i5 = i8;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i8;
            }
            if ((268435456 & zzc) != 0) {
                zzalrVar = this;
                t5 = t4;
                if (!zzalrVar.zza((zzalr<T>) t5, i9, i4, i5, i13)) {
                    return false;
                }
            } else {
                zzalrVar = this;
                t5 = t4;
            }
            int i14 = (267386880 & zzc) >>> 20;
            if (i14 != 9 && i14 != 17) {
                if (i14 != 27) {
                    if (i14 == 60 || i14 == 68) {
                        if (zzc((zzalr<T>) t5, i10, i9) && !zza((Object) t5, zzc, zze(i9))) {
                            return false;
                        }
                    } else if (i14 != 49) {
                        if (i14 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzalrVar.zzr.zzd(zzana.zze(t5, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzalrVar.zzr.zza(zzf(i9)).zzc.zzb() == zzank.MESSAGE) {
                                ?? r32 = 0;
                                for (Object obj : zzd.values()) {
                                    r32 = r32;
                                    if (r32 == 0) {
                                        r32 = zzaly.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r32.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzana.zze(t5, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i9);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!zze.zze(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (zzalrVar.zza((zzalr<T>) t5, i9, i4, i5, i13) && !zza((Object) t5, zzc, zze(i9))) {
                return false;
            }
            i7++;
            t4 = t5;
            i6 = i4;
            i8 = i5;
        }
        return !this.zzh || this.zzq.zza(t4).zzg();
    }

    private final boolean zzc(T t4, T t5, int i4) {
        return zzc((zzalr<T>) t4, i4) == zzc((zzalr<T>) t5, i4);
    }

    private final boolean zzc(T t4, int i4) {
        int zzb2 = zzb(i4);
        long j4 = zzb2 & 1048575;
        if (j4 != 1048575) {
            return (zzana.zzc(t4, j4) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i4);
        long j5 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzana.zza(t4, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzana.zzb(t4, j5)) != 0;
            case 2:
                return zzana.zzd(t4, j5) != 0;
            case 3:
                return zzana.zzd(t4, j5) != 0;
            case 4:
                return zzana.zzc(t4, j5) != 0;
            case 5:
                return zzana.zzd(t4, j5) != 0;
            case 6:
                return zzana.zzc(t4, j5) != 0;
            case 7:
                return zzana.zzh(t4, j5);
            case 8:
                Object zze = zzana.zze(t4, j5);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzaiw) {
                    return !zzaiw.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzana.zze(t4, j5) != null;
            case 10:
                return !zzaiw.zza.equals(zzana.zze(t4, j5));
            case 11:
                return zzana.zzc(t4, j5) != 0;
            case 12:
                return zzana.zzc(t4, j5) != 0;
            case 13:
                return zzana.zzc(t4, j5) != 0;
            case 14:
                return zzana.zzd(t4, j5) != 0;
            case 15:
                return zzana.zzc(t4, j5) != 0;
            case 16:
                return zzana.zzd(t4, j5) != 0;
            case 17:
                return zzana.zze(t4, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final int zza(T t4) {
        int i4;
        int zza2;
        int zza3;
        int zzb2;
        int zzd;
        int zzg;
        int zzh;
        zzalr<T> zzalrVar = this;
        T t5 = t4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < zzalrVar.zzc.length) {
            int zzc = zzalrVar.zzc(i6);
            int i10 = (267386880 & zzc) >>> 20;
            int[] iArr = zzalrVar.zzc;
            int i11 = iArr[i6];
            int i12 = iArr[i6 + 2];
            int i13 = i12 & i5;
            if (i10 <= 17) {
                if (i13 != i9) {
                    i7 = i13 == i5 ? 0 : unsafe.getInt(t5, i13);
                    i9 = i13;
                }
                i4 = 1 << (i12 >>> 20);
            } else {
                i4 = 0;
            }
            long j4 = zzc & i5;
            if (i10 >= zzakd.zza.zza()) {
                zzakd.zzb.zza();
            }
            int i14 = i8;
            switch (i10) {
                case 0:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza2 = zzajo.zza(i11, 0.0d);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 1:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zza(i11, 0.0f);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 2:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zzb(i11, unsafe.getLong(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 3:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zze(i11, unsafe.getLong(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 4:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zzc(i11, unsafe.getInt(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 5:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zza(i11, 0L);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 6:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zzb(i11, 0);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 7:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zza(i11, true);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 8:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        Object object = unsafe.getObject(t5, j4);
                        if (object instanceof zzaiw) {
                            zzb2 = zzajo.zza(i11, (zzaiw) object);
                        } else {
                            zzb2 = zzajo.zza(i11, (String) object);
                        }
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 9:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza2 = zzame.zza(i11, unsafe.getObject(t5, j4), (zzamc<?>) zzalrVar.zze(i6));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 10:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zza(i11, (zzaiw) unsafe.getObject(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 11:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zzf(i11, unsafe.getInt(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 12:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zza(i11, unsafe.getInt(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 13:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zzd(i11, 0);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 14:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza3 = zzajo.zzc(i11, 0L);
                        i8 = i14 + zza3;
                        zzalrVar = this;
                        t5 = t4;
                        break;
                    }
                    zzalrVar = this;
                    t5 = t4;
                    i8 = i14;
                    break;
                case 15:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zze(i11, unsafe.getInt(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 16:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zzb2 = zzajo.zzd(i11, unsafe.getLong(t5, j4));
                        i8 = i14 + zzb2;
                        zzalrVar = this;
                        break;
                    }
                    zzalrVar = this;
                    i8 = i14;
                    break;
                case 17:
                    if (zzalrVar.zza((zzalr<T>) t5, i6, i9, i7, i4)) {
                        zza2 = zzajo.zza(i11, (zzaln) unsafe.getObject(t5, j4), zzalrVar.zze(i6));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 18:
                    zza2 = zzame.zzd(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 19:
                    zza2 = zzame.zzc(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 20:
                    zza2 = zzame.zzf(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 21:
                    zza2 = zzame.zzj(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 22:
                    zza2 = zzame.zze(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    zza2 = zzame.zzd(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 24:
                    zza2 = zzame.zzc(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 25:
                    zza2 = zzame.zza(i11, (List<?>) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 26:
                    zza2 = zzame.zzb(i11, (List) unsafe.getObject(t5, j4));
                    i8 = i14 + zza2;
                    break;
                case 27:
                    zza2 = zzame.zzb(i11, (List<?>) unsafe.getObject(t5, j4), (zzamc<?>) zzalrVar.zze(i6));
                    i8 = i14 + zza2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    zza2 = zzame.zza(i11, (List<zzaiw>) unsafe.getObject(t5, j4));
                    i8 = i14 + zza2;
                    break;
                case 29:
                    zza2 = zzame.zzi(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    zza2 = zzame.zzb(i11, (List<Integer>) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    zza2 = zzame.zzc(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 32:
                    zza2 = zzame.zzd(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 33:
                    zza2 = zzame.zzg(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case 34:
                    zza2 = zzame.zzh(i11, (List) unsafe.getObject(t5, j4), false);
                    i8 = i14 + zza2;
                    break;
                case C3139z9.f40333J /* 35 */:
                    zzd = zzame.zzd((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 36:
                    zzd = zzame.zzc((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 37:
                    zzd = zzame.zzf((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case C3139z9.f40334K /* 38 */:
                    zzd = zzame.zzj((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 39:
                    zzd = zzame.zze((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 40:
                    zzd = zzame.zzd((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 41:
                    zzd = zzame.zzc((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 42:
                    zzd = zzame.zza((List<?>) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 43:
                    zzd = zzame.zzi((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    zzd = zzame.zzb((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    zzd = zzame.zzc((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 46:
                    zzd = zzame.zzd((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 47:
                    zzd = zzame.zzg((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 48:
                    zzd = zzame.zzh((List) unsafe.getObject(t5, j4));
                    if (zzd > 0) {
                        zzg = zzajo.zzg(i11);
                        zzh = zzajo.zzh(zzd);
                        i8 = i14 + zzg + zzh + zzd;
                        break;
                    }
                    i8 = i14;
                    break;
                case 49:
                    zza2 = zzame.zza(i11, (List<zzaln>) unsafe.getObject(t5, j4), (zzamc<?>) zzalrVar.zze(i6));
                    i8 = i14 + zza2;
                    break;
                case 50:
                    zza2 = zzalrVar.zzr.zza(i11, unsafe.getObject(t5, j4), zzalrVar.zzf(i6));
                    i8 = i14 + zza2;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, 0.0d);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, 0.0f);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzb(i11, zzd(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zze(i11, zzd(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzc(i11, zzc(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, 0L);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzb(i11, 0);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 58:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, true);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 59:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        Object object2 = unsafe.getObject(t5, j4);
                        if (object2 instanceof zzaiw) {
                            zza2 = zzajo.zza(i11, (zzaiw) object2);
                        } else {
                            zza2 = zzajo.zza(i11, (String) object2);
                        }
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 60:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzame.zza(i11, unsafe.getObject(t5, j4), (zzamc<?>) zzalrVar.zze(i6));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 61:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, (zzaiw) unsafe.getObject(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzf(i11, zzc(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 63:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, zzc(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzd(i11, 0);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzc(i11, 0L);
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 66:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zze(i11, zzc(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 67:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zzd(i11, zzd(t5, j4));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                case 68:
                    if (zzalrVar.zzc((zzalr<T>) t5, i11, i6)) {
                        zza2 = zzajo.zza(i11, (zzaln) unsafe.getObject(t5, j4), zzalrVar.zze(i6));
                        i8 = i14 + zza2;
                        break;
                    }
                    i8 = i14;
                    break;
                default:
                    i8 = i14;
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        zzamv<?, ?> zzamvVar = zzalrVar.zzp;
        int zza4 = i8 + zzamvVar.zza((zzamv<?, ?>) zzamvVar.zzd(t5));
        if (!zzalrVar.zzh) {
            return zza4;
        }
        zzajy<?> zza5 = zzalrVar.zzq.zza(t5);
        int zzb3 = zza5.zza.zzb();
        int i15 = 0;
        for (int i16 = 0; i16 < zzb3; i16++) {
            Map.Entry<?, Object> zza6 = zza5.zza.zza(i16);
            i15 += zzajy.zza((zzaka<?>) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzc()) {
            i15 += zzajy.zza((zzaka<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i15;
    }

    private static <T> boolean zze(T t4, long j4) {
        return ((Boolean) zzana.zze(t4, j4)).booleanValue();
    }

    private final boolean zzc(T t4, int i4, int i5) {
        return zzana.zzc(t4, (long) (zzb(i5) & 1048575)) == i4;
    }

    private final int zzb(int i4) {
        return this.zzc[i4 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t4, T t5, int i4) {
        int i5 = this.zzc[i4];
        if (zzc((zzalr<T>) t5, i5, i4)) {
            long zzc = zzc(i4) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, zzc);
            if (object != null) {
                zzamc zze = zze(i4);
                if (!zzc((zzalr<T>) t4, i5, i4)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t4, zzc, zza2);
                    }
                    zzb((zzalr<T>) t4, i5, i4);
                    return;
                }
                Object object2 = unsafe.getObject(t4, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t4, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i4] + " is present but null: " + String.valueOf(t5));
        }
    }

    private final void zzb(T t4, int i4) {
        int zzb2 = zzb(i4);
        long j4 = 1048575 & zzb2;
        if (j4 == 1048575) {
            return;
        }
        zzana.zza((Object) t4, j4, (1 << (zzb2 >>> 20)) | zzana.zzc(t4, j4));
    }

    private final void zzb(T t4, int i4, int i5) {
        zzana.zza((Object) t4, zzb(i5) & 1048575, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzana.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzana.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzame.zza(com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzana.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t4, T t5) {
        int length = this.zzc.length;
        int i4 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 < length) {
                int zzc = zzc(i4);
                long j4 = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 1:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 2:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 3:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 4:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 5:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 6:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 7:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 8:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 9:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 10:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 11:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 12:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 13:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 14:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 15:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 16:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 17:
                        if (zzc(t4, t5, i4)) {
                            break;
                        }
                        z4 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    case 29:
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case C3139z9.f40333J /* 35 */:
                    case 36:
                    case 37:
                    case C3139z9.f40334K /* 38 */:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z4 = zzame.zza(zzana.zze(t4, j4), zzana.zze(t5, j4));
                        break;
                    case 50:
                        z4 = zzame.zza(zzana.zze(t4, j4), zzana.zze(t5, j4));
                        break;
                    case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    case IronSourceConstants.SET_USER_ID /* 52 */:
                    case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    case 63:
                    case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 66:
                    case 67:
                    case 68:
                        long zzb2 = zzb(i4) & 1048575;
                        if (zzana.zzc(t4, zzb2) == zzana.zzc(t5, zzb2)) {
                            break;
                        }
                        z4 = false;
                        break;
                }
                if (!z4) {
                    return false;
                }
                i4 += 3;
            } else {
                if (!this.zzp.zzd(t4).equals(this.zzp.zzd(t5))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t4).equals(this.zzq.zza(t5));
                }
                return true;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaiv r35) {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalr.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaiv):int");
    }

    private final int zza(int i4) {
        if (i4 < this.zze || i4 > this.zzf) {
            return -1;
        }
        return zza(i4, 0);
    }

    private final int zza(int i4, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.zzc[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzalr<T> zza(Class<T> cls, zzall zzallVar, zzalv zzalvVar, zzakx zzakxVar, zzamv<?, ?> zzamvVar, zzajx<?> zzajxVar, zzalg zzalgVar) {
        int i4;
        int charAt;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        zzama zzamaVar;
        int i20;
        int[] iArr2;
        int i21;
        String str;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field zza2;
        int i28;
        char charAt10;
        int i29;
        int i30;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i31;
        char charAt11;
        int i32;
        char charAt12;
        int i33;
        char charAt13;
        int i34;
        char charAt14;
        if (zzallVar instanceof zzama) {
            zzama zzamaVar2 = (zzama) zzallVar;
            String zzd = zzamaVar2.zzd();
            int length = zzd.length();
            char c4 = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i35 = 1;
                while (true) {
                    i4 = i35 + 1;
                    if (zzd.charAt(i35) < 55296) {
                        break;
                    }
                    i35 = i4;
                }
            } else {
                i4 = 1;
            }
            int i36 = i4 + 1;
            int charAt15 = zzd.charAt(i4);
            if (charAt15 >= 55296) {
                int i37 = charAt15 & 8191;
                int i38 = 13;
                while (true) {
                    i34 = i36 + 1;
                    charAt14 = zzd.charAt(i36);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i37 |= (charAt14 & 8191) << i38;
                    i38 += 13;
                    i36 = i34;
                }
                charAt15 = i37 | (charAt14 << i38);
                i36 = i34;
            }
            if (charAt15 == 0) {
                i6 = 0;
                i8 = 0;
                charAt = 0;
                i5 = 0;
                i7 = 0;
                i10 = 0;
                iArr = zza;
                i9 = 0;
            } else {
                int i39 = i36 + 1;
                int charAt16 = zzd.charAt(i36);
                if (charAt16 >= 55296) {
                    int i40 = charAt16 & 8191;
                    int i41 = 13;
                    while (true) {
                        i18 = i39 + 1;
                        charAt9 = zzd.charAt(i39);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i40 |= (charAt9 & 8191) << i41;
                        i41 += 13;
                        i39 = i18;
                    }
                    charAt16 = i40 | (charAt9 << i41);
                    i39 = i18;
                }
                int i42 = i39 + 1;
                int charAt17 = zzd.charAt(i39);
                if (charAt17 >= 55296) {
                    int i43 = charAt17 & 8191;
                    int i44 = 13;
                    while (true) {
                        i17 = i42 + 1;
                        charAt8 = zzd.charAt(i42);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i43 |= (charAt8 & 8191) << i44;
                        i44 += 13;
                        i42 = i17;
                    }
                    charAt17 = i43 | (charAt8 << i44);
                    i42 = i17;
                }
                int i45 = i42 + 1;
                int charAt18 = zzd.charAt(i42);
                if (charAt18 >= 55296) {
                    int i46 = charAt18 & 8191;
                    int i47 = 13;
                    while (true) {
                        i16 = i45 + 1;
                        charAt7 = zzd.charAt(i45);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i46 |= (charAt7 & 8191) << i47;
                        i47 += 13;
                        i45 = i16;
                    }
                    charAt18 = i46 | (charAt7 << i47);
                    i45 = i16;
                }
                int i48 = i45 + 1;
                int charAt19 = zzd.charAt(i45);
                if (charAt19 >= 55296) {
                    int i49 = charAt19 & 8191;
                    int i50 = 13;
                    while (true) {
                        i15 = i48 + 1;
                        charAt6 = zzd.charAt(i48);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i49 |= (charAt6 & 8191) << i50;
                        i50 += 13;
                        i48 = i15;
                    }
                    charAt19 = i49 | (charAt6 << i50);
                    i48 = i15;
                }
                int i51 = i48 + 1;
                charAt = zzd.charAt(i48);
                if (charAt >= 55296) {
                    int i52 = charAt & 8191;
                    int i53 = 13;
                    while (true) {
                        i14 = i51 + 1;
                        charAt5 = zzd.charAt(i51);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i52 |= (charAt5 & 8191) << i53;
                        i53 += 13;
                        i51 = i14;
                    }
                    charAt = i52 | (charAt5 << i53);
                    i51 = i14;
                }
                int i54 = i51 + 1;
                int charAt20 = zzd.charAt(i51);
                if (charAt20 >= 55296) {
                    int i55 = charAt20 & 8191;
                    int i56 = 13;
                    while (true) {
                        i13 = i54 + 1;
                        charAt4 = zzd.charAt(i54);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i56;
                        i56 += 13;
                        i54 = i13;
                    }
                    charAt20 = i55 | (charAt4 << i56);
                    i54 = i13;
                }
                int i57 = i54 + 1;
                int charAt21 = zzd.charAt(i54);
                if (charAt21 >= 55296) {
                    int i58 = charAt21 & 8191;
                    int i59 = 13;
                    while (true) {
                        i12 = i57 + 1;
                        charAt3 = zzd.charAt(i57);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i58 |= (charAt3 & 8191) << i59;
                        i59 += 13;
                        i57 = i12;
                    }
                    charAt21 = i58 | (charAt3 << i59);
                    i57 = i12;
                }
                int i60 = i57 + 1;
                int charAt22 = zzd.charAt(i57);
                if (charAt22 >= 55296) {
                    int i61 = charAt22 & 8191;
                    int i62 = 13;
                    while (true) {
                        i11 = i60 + 1;
                        charAt2 = zzd.charAt(i60);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i61 |= (charAt2 & 8191) << i62;
                        i62 += 13;
                        i60 = i11;
                    }
                    charAt22 = i61 | (charAt2 << i62);
                    i60 = i11;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                int i63 = (charAt16 << 1) + charAt17;
                int i64 = charAt20;
                i5 = charAt18;
                i6 = i64;
                i7 = charAt19;
                i8 = i63;
                iArr = iArr3;
                i9 = charAt16;
                i10 = charAt22;
                i36 = i60;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzamaVar2.zze();
            Class<?> cls2 = zzamaVar2.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i65 = i10 + i6;
            int i66 = i10;
            int i67 = i65;
            int i68 = 0;
            int i69 = 0;
            while (i36 < length) {
                int i70 = i36 + 1;
                int charAt23 = zzd.charAt(i36);
                if (charAt23 >= c4) {
                    int i71 = charAt23 & 8191;
                    int i72 = i70;
                    int i73 = 13;
                    while (true) {
                        i33 = i72 + 1;
                        charAt13 = zzd.charAt(i72);
                        if (charAt13 < c4) {
                            break;
                        }
                        i71 |= (charAt13 & 8191) << i73;
                        i73 += 13;
                        i72 = i33;
                    }
                    charAt23 = i71 | (charAt13 << i73);
                    i19 = i33;
                } else {
                    i19 = i70;
                }
                int i74 = i19 + 1;
                int charAt24 = zzd.charAt(i19);
                if (charAt24 >= c4) {
                    int i75 = charAt24 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i32 = i76 + 1;
                        charAt12 = zzd.charAt(i76);
                        zzamaVar = zzamaVar2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i75 |= (charAt12 & 8191) << i77;
                        i77 += 13;
                        i76 = i32;
                        zzamaVar2 = zzamaVar;
                    }
                    charAt24 = i75 | (charAt12 << i77);
                    i20 = i32;
                } else {
                    zzamaVar = zzamaVar2;
                    i20 = i74;
                }
                int i78 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
                int i79 = length;
                if ((charAt24 & 1024) != 0) {
                    iArr[i69] = i68;
                    i69++;
                }
                int i80 = charAt23;
                if (i78 >= 51) {
                    i24 = i20 + 1;
                    int charAt25 = zzd.charAt(i20);
                    char c5 = 55296;
                    if (charAt25 >= 55296) {
                        int i81 = charAt25 & 8191;
                        int i82 = 13;
                        while (true) {
                            i31 = i24 + 1;
                            charAt11 = zzd.charAt(i24);
                            if (charAt11 < c5) {
                                break;
                            }
                            i81 |= (charAt11 & 8191) << i82;
                            i82 += 13;
                            i24 = i31;
                            c5 = 55296;
                        }
                        charAt25 = i81 | (charAt11 << i82);
                        i24 = i31;
                    }
                    int i83 = i78 - 51;
                    int i84 = charAt25;
                    if (i83 != 9 && i83 != 17) {
                        if (i83 == 12 && (zzamaVar.zzb().equals(zzalz.PROTO2) || (charAt24 & a.f17688n) != 0)) {
                            i30 = i8 + 1;
                            objArr[((i68 / 3) << 1) + 1] = zze[i8];
                        }
                        int i85 = i84 << 1;
                        obj = zze[i85];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i85] = zza3;
                        }
                        iArr2 = iArr4;
                        i21 = i9;
                        i25 = (int) unsafe.objectFieldOffset(zza3);
                        int i86 = i85 + 1;
                        obj2 = zze[i86];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i86] = zza4;
                        }
                        i26 = (int) unsafe.objectFieldOffset(zza4);
                        i27 = i8;
                        str = zzd;
                        i23 = 0;
                    } else {
                        i30 = i8 + 1;
                        objArr[((i68 / 3) << 1) + 1] = zze[i8];
                    }
                    i8 = i30;
                    int i852 = i84 << 1;
                    obj = zze[i852];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    i21 = i9;
                    i25 = (int) unsafe.objectFieldOffset(zza3);
                    int i862 = i852 + 1;
                    obj2 = zze[i862];
                    if (!(obj2 instanceof Field)) {
                    }
                    i26 = (int) unsafe.objectFieldOffset(zza4);
                    i27 = i8;
                    str = zzd;
                    i23 = 0;
                } else {
                    iArr2 = iArr4;
                    i21 = i9;
                    int i87 = i8 + 1;
                    Field zza5 = zza(cls2, (String) zze[i8]);
                    if (i78 == 9 || i78 == 17) {
                        objArr[((i68 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i78 == 27 || i78 == 49) {
                            i29 = i8 + 2;
                            objArr[((i68 / 3) << 1) + 1] = zze[i87];
                        } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                            if (zzamaVar.zzb() == zzalz.PROTO2 || (charAt24 & a.f17688n) != 0) {
                                i29 = i8 + 2;
                                objArr[((i68 / 3) << 1) + 1] = zze[i87];
                            }
                        } else if (i78 == 50) {
                            int i88 = i66 + 1;
                            iArr[i66] = i68;
                            int i89 = (i68 / 3) << 1;
                            int i90 = i8 + 2;
                            objArr[i89] = zze[i87];
                            if ((charAt24 & a.f17688n) != 0) {
                                i87 = i8 + 3;
                                objArr[i89 + 1] = zze[i90];
                                i66 = i88;
                            } else {
                                i66 = i88;
                                i87 = i90;
                            }
                        }
                        i87 = i29;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) == 0 || i78 > 17) {
                        str = zzd;
                        i22 = 1048575;
                        i23 = 0;
                    } else {
                        int i91 = i20 + 1;
                        int charAt26 = zzd.charAt(i20);
                        if (charAt26 >= 55296) {
                            int i92 = charAt26 & 8191;
                            int i93 = 13;
                            while (true) {
                                i28 = i91 + 1;
                                charAt10 = zzd.charAt(i91);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i92 |= (charAt10 & 8191) << i93;
                                i93 += 13;
                                i91 = i28;
                            }
                            charAt26 = i92 | (charAt10 << i93);
                            i91 = i28;
                        }
                        int i94 = (i21 << 1) + (charAt26 / 32);
                        Object obj3 = zze[i94];
                        int i95 = charAt26;
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls2, (String) obj3);
                            zze[i94] = zza2;
                        }
                        str = zzd;
                        i23 = i95 % 32;
                        int i96 = i91;
                        i22 = (int) unsafe.objectFieldOffset(zza2);
                        i20 = i96;
                    }
                    if (i78 < 18 || i78 > 49) {
                        int i97 = i87;
                        i24 = i20;
                        i25 = objectFieldOffset;
                        i26 = i22;
                        i27 = i97;
                    } else {
                        int i98 = i67 + 1;
                        iArr[i67] = objectFieldOffset;
                        int i99 = i87;
                        i24 = i20;
                        i25 = objectFieldOffset;
                        i26 = i22;
                        i27 = i99;
                        i67 = i98;
                    }
                }
                int i100 = i68 + 1;
                iArr2[i68] = i80;
                int i101 = i68 + 2;
                iArr2[i100] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((charAt24 & a.f17688n) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | i25;
                i68 += 3;
                iArr2[i101] = (i23 << 20) | i26;
                i36 = i24;
                zzd = str;
                length = i79;
                zzamaVar2 = zzamaVar;
                i9 = i21;
                c4 = 55296;
                i8 = i27;
                iArr4 = iArr2;
            }
            return new zzalr<>(iArr4, objArr, i5, i7, zzamaVar2.zza(), false, iArr, i10, i65, zzalvVar, zzakxVar, zzamvVar, zzajxVar, zzalgVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i4, UB ub, zzamv<UT, UB> zzamvVar, Object obj2) {
        zzakk zzd;
        int i5 = this.zzc[i4];
        Object zze = zzana.zze(obj, zzc(i4) & 1048575);
        return (zze == null || (zzd = zzd(i4)) == null) ? ub : (UB) zza(i4, i5, this.zzr.zze(zze), zzd, (zzakk) ub, (zzamv<UT, zzakk>) zzamvVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i4, int i5, Map<K, V> map, zzakk zzakkVar, UB ub, zzamv<UT, UB> zzamvVar, Object obj) {
        zzale<?, ?> zza2 = this.zzr.zza(zzf(i4));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakkVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzamvVar.zzc(obj);
                }
                zzajf zzc = zzaiw.zzc(zzalf.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzalf.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzamvVar.zza((zzamv<UT, UB>) ub, i5, zzc.zza());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i4) {
        zzamc zze = zze(i4);
        long zzc = zzc(i4) & 1048575;
        if (!zzc((zzalr<T>) t4, i4)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t4, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t4, int i4, int i5) {
        zzamc zze = zze(i5);
        if (!zzc((zzalr<T>) t4, i4, i5)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t4, zzc(i5) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t4, T t5) {
        zzf(t4);
        t5.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzc = zzc(i4);
            long j4 = 1048575 & zzc;
            int i5 = this.zzc[i4];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza(t4, j4, zzana.zza(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzb(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzd(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzd(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzd(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zzc(t4, j4, zzana.zzh(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza(t4, j4, zzana.zze(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t4, t5, i4);
                    break;
                case 10:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza(t4, j4, zzana.zze(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzd(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzc(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzalr<T>) t5, i4)) {
                        zzana.zza((Object) t4, j4, zzana.zzd(t5, j4));
                        zzb((zzalr<T>) t4, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t4, t5, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case C3139z9.f40333J /* 35 */:
                case 36:
                case 37:
                case C3139z9.f40334K /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t4, t5, j4);
                    break;
                case 50:
                    zzame.zza(this.zzr, t4, t5, j4);
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                case IronSourceConstants.SET_USER_ID /* 52 */:
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                case 58:
                case 59:
                    if (zzc((zzalr<T>) t5, i5, i4)) {
                        zzana.zza(t4, j4, zzana.zze(t5, j4));
                        zzb((zzalr<T>) t4, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t4, t5, i4);
                    break;
                case 61:
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzc((zzalr<T>) t5, i5, i4)) {
                        zzana.zza(t4, j4, zzana.zze(t5, j4));
                        zzb((zzalr<T>) t4, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t4, t5, i4);
                    break;
            }
        }
        zzame.zza(this.zzp, t4, t5);
        if (this.zzh) {
            zzame.zza(this.zzq, t4, t5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0775 A[Catch: all -> 0x0062, TryCatch #2 {all -> 0x0062, blocks: (B:37:0x0058, B:98:0x0770, B:100:0x0775, B:101:0x077a, B:134:0x013a, B:137:0x014c, B:138:0x0164, B:139:0x017c, B:140:0x0194, B:141:0x01ac, B:143:0x01bc, B:146:0x01c3, B:147:0x01c9, B:148:0x01d7, B:149:0x01ef, B:150:0x0203, B:151:0x021b, B:152:0x0229, B:153:0x0241, B:154:0x0259, B:155:0x0271, B:156:0x0289, B:157:0x02a1, B:158:0x02b9, B:159:0x02d1, B:160:0x02e9, B:162:0x02ff, B:163:0x0320, B:164:0x0309, B:166:0x0311, B:167:0x0331, B:168:0x0349, B:169:0x035d, B:170:0x0371, B:171:0x0385, B:172:0x0399, B:183:0x03cc, B:184:0x03da, B:185:0x03ee, B:186:0x0402, B:187:0x0416, B:188:0x042a, B:189:0x043e, B:190:0x0452, B:191:0x0466, B:192:0x047a, B:193:0x048e, B:194:0x04a2, B:195:0x04b6, B:196:0x04ca, B:201:0x04f1, B:202:0x04ff, B:203:0x0513, B:204:0x052b, B:206:0x0537, B:207:0x0545, B:208:0x0553, B:209:0x0567, B:210:0x057b, B:211:0x058f, B:212:0x05a3, B:213:0x05b7, B:214:0x05cb, B:215:0x05df, B:216:0x05f3, B:217:0x060b, B:218:0x0620, B:219:0x0634, B:220:0x0648, B:221:0x065c, B:223:0x066b, B:226:0x0672, B:227:0x0678, B:228:0x0682, B:229:0x0696, B:230:0x06aa, B:231:0x06c2, B:232:0x06d0, B:233:0x06e4, B:234:0x06f8, B:235:0x070c, B:236:0x0720, B:237:0x0734, B:238:0x0748, B:239:0x075c), top: B:36:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07ae A[LOOP:1: B:27:0x07aa->B:29:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07c1  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t4, zzamd zzamdVar, zzajv zzajvVar) {
        T t5;
        int i4;
        Object obj;
        int zzc;
        int zza2;
        zzajx<?> zzajxVar;
        zzajv zzajvVar2;
        zzamv zzamvVar;
        T t6;
        zzalr<T> zzalrVar;
        Object zza3;
        T t7;
        zzamv zzamvVar2;
        zzamv zzamvVar3;
        zzalr<T> zzalrVar2;
        zzalr<T> zzalrVar3 = this;
        zzajv zzajvVar3 = zzajvVar;
        zzajvVar3.getClass();
        zzf(t4);
        zzamv zzamvVar4 = zzalrVar3.zzp;
        zzajx<?> zzajxVar2 = zzalrVar3.zzq;
        Object obj2 = null;
        zzajy<?> zzajyVar = null;
        while (true) {
            try {
                zzc = zzamdVar.zzc();
                zza2 = zzalrVar3.zza(zzc);
            } catch (Throwable th) {
                th = th;
                t5 = t4;
            }
            if (zza2 >= 0) {
                zzajxVar = zzajxVar2;
                zzajvVar2 = zzajvVar3;
                zzamvVar = zzamvVar4;
                t6 = t4;
                try {
                    int zzc2 = zzalrVar3.zzc(zza2);
                    switch ((267386880 & zzc2) >>> 20) {
                        case 0:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, zzamdVar.zza());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 1:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzb());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 2:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzl());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 3:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzo());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 4:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzg());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 5:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzk());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 6:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzf());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 7:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zzc(t6, zzc2 & 1048575, zzamdVar.zzs());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 8:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzalrVar.zza((Object) t6, zzc2, zzamdVar);
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 9:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzaln zzalnVar = (zzaln) zzalrVar.zza((zzalr<T>) t6, zza2);
                            zzamdVar.zzb((zzamd) zzalnVar, (zzamc<zzamd>) zzalrVar.zze(zza2), zzajvVar2);
                            zzalrVar.zza((zzalr<T>) t6, zza2, zzalnVar);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 10:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, zzamdVar.zzp());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 11:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzj());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 12:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            int zze = zzamdVar.zze();
                            zzakk zzd = zzalrVar.zzd(zza2);
                            if (zzd != null && !zzd.zza(zze)) {
                                obj2 = zzame.zza(t6, zzc, zze, obj2, zzamvVar4);
                                zzalrVar3 = zzalrVar;
                                break;
                            }
                            zzana.zza((Object) t6, zzc2 & 1048575, zze);
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 13:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzh());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 14:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzm());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 15:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzi());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 16:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza((Object) t6, zzc2 & 1048575, zzamdVar.zzn());
                            zzalrVar.zzb((zzalr<T>) t6, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 17:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzaln zzalnVar2 = (zzaln) zzalrVar.zza((zzalr<T>) t6, zza2);
                            zzamdVar.zza((zzamd) zzalnVar2, (zzamc<zzamd>) zzalrVar.zze(zza2), zzajvVar2);
                            zzalrVar.zza((zzalr<T>) t6, zza2, zzalnVar2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 18:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzc(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 19:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzg(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 20:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzi(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 21:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzq(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 22:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzh(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzf(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 24:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zze(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 25:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zza(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 26:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            if (zzg(zzc2)) {
                                zzamdVar.zzo(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            } else {
                                zzamdVar.zzn(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            }
                            zzalrVar3 = zzalrVar;
                            break;
                        case 27:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzb((List) zzalrVar.zzo.zza(t6, zzc2 & 1048575), (zzamc) zzalrVar.zze(zza2), zzajvVar2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzb(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 29:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzp(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            zzalrVar = zzalrVar3;
                            List<Integer> zza4 = zzalrVar.zzo.zza(t6, zzc2 & 1048575);
                            zzamdVar.zzd(zza4);
                            zza3 = zzame.zza(t6, zzc, zza4, zzalrVar.zzd(zza2), obj2, zzamvVar);
                            zzamvVar4 = zzamvVar;
                            obj2 = zza3;
                            zzalrVar3 = zzalrVar;
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzj(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 32:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzk(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 33:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzl(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 34:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzm(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case C3139z9.f40333J /* 35 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzc(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 36:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzg(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 37:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzi(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case C3139z9.f40334K /* 38 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzq(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 39:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzh(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 40:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzf(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 41:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zze(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 42:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zza(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 43:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzp(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            zzalrVar = zzalrVar3;
                            t7 = t6;
                            List<Integer> zza5 = zzalrVar.zzo.zza(t7, zzc2 & 1048575);
                            zzamdVar.zzd(zza5);
                            zzakk zzd2 = zzalrVar.zzd(zza2);
                            Object obj3 = obj2;
                            try {
                                zza3 = zzame.zza(t7, zzc, zza5, zzd2, obj3, zzamvVar);
                                zzamvVar4 = zzamvVar;
                                obj2 = zza3;
                            } catch (zzakp unused) {
                                zzamvVar3 = zzamvVar;
                                obj2 = obj3;
                                zzamvVar4 = zzamvVar3;
                                zzamvVar4.zza(zzamdVar);
                                if (obj2 == null) {
                                }
                                if (!zzamvVar4.zza((zzamv) obj2, zzamdVar, 0)) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                zzamvVar2 = zzamvVar;
                                obj2 = obj3;
                                zzamvVar4 = zzamvVar2;
                                t5 = t7;
                                zzalrVar3 = zzalrVar;
                                i4 = zzalrVar3.zzl;
                                obj = obj2;
                                while (i4 < zzalrVar3.zzm) {
                                }
                                T t8 = t5;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzj(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 46:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzk(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 47:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzl(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 48:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zzm(zzalrVar.zzo.zza(t6, zzc2 & 1048575));
                            zzalrVar3 = zzalrVar;
                            break;
                        case 49:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzamdVar.zza((List) zzalrVar.zzo.zza(t6, zzc2 & 1048575), (zzamc) zzalrVar.zze(zza2), zzajvVar2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 50:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            Object zzf = zzalrVar.zzf(zza2);
                            long zzc3 = zzalrVar.zzc(zza2) & 1048575;
                            Object zze2 = zzana.zze(t6, zzc3);
                            if (zze2 == null) {
                                zze2 = zzalrVar.zzr.zzb(zzf);
                                zzana.zza(t6, zzc3, zze2);
                            } else if (zzalrVar.zzr.zzf(zze2)) {
                                Object zzb2 = zzalrVar.zzr.zzb(zzf);
                                zzalrVar.zzr.zza(zzb2, zze2);
                                zzana.zza(t6, zzc3, zzb2);
                                zze2 = zzb2;
                            }
                            zzamdVar.zza(zzalrVar.zzr.zze(zze2), zzalrVar.zzr.zza(zzf), zzajvVar2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Double.valueOf(zzamdVar.zza()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.SET_USER_ID /* 52 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Float.valueOf(zzamdVar.zzb()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Long.valueOf(zzamdVar.zzl()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Long.valueOf(zzamdVar.zzo()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zzamdVar.zzg()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Long.valueOf(zzamdVar.zzk()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zzamdVar.zzf()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 58:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Boolean.valueOf(zzamdVar.zzs()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 59:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzalrVar.zza((Object) t6, zzc2, zzamdVar);
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 60:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzaln zzalnVar3 = (zzaln) zzalrVar.zza((zzalr<T>) t6, zzc, zza2);
                            zzamdVar.zzb((zzamd) zzalnVar3, (zzamc<zzamd>) zzalrVar.zze(zza2), zzajvVar2);
                            zzalrVar.zza((zzalr<T>) t6, zzc, zza2, zzalnVar3);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 61:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, zzamdVar.zzp());
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zzamdVar.zzj()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 63:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            int zze3 = zzamdVar.zze();
                            zzakk zzd3 = zzalrVar.zzd(zza2);
                            if (zzd3 != null && !zzd3.zza(zze3)) {
                                obj2 = zzame.zza(t6, zzc, zze3, obj2, zzamvVar4);
                                zzalrVar3 = zzalrVar;
                                break;
                            }
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zze3));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zzamdVar.zzh()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Long.valueOf(zzamdVar.zzm()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 66:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Integer.valueOf(zzamdVar.zzi()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 67:
                            zzalrVar = zzalrVar3;
                            zzamvVar4 = zzamvVar;
                            zzana.zza(t6, zzc2 & 1048575, Long.valueOf(zzamdVar.zzn()));
                            zzalrVar.zzb((zzalr<T>) t6, zzc, zza2);
                            zzalrVar3 = zzalrVar;
                            break;
                        case 68:
                            zzalrVar = zzalrVar3;
                            t7 = t6;
                            zzamvVar4 = zzamvVar;
                            try {
                                zzaln zzalnVar4 = (zzaln) zzalrVar.zza((zzalr<T>) t7, zzc, zza2);
                                zzamdVar.zza((zzamd) zzalnVar4, (zzamc<zzamd>) zzalrVar.zze(zza2), zzajvVar2);
                                zzalrVar.zza((zzalr<T>) t7, zzc, zza2, zzalnVar4);
                            } catch (zzakp unused2) {
                                zzamvVar4.zza(zzamdVar);
                                if (obj2 == null) {
                                }
                                if (!zzamvVar4.zza((zzamv) obj2, zzamdVar, 0)) {
                                }
                            }
                            zzalrVar3 = zzalrVar;
                            break;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzamvVar.zzc(t6);
                                } catch (zzakp unused3) {
                                    zzamvVar3 = zzamvVar;
                                    zzalrVar = zzalrVar3;
                                    t7 = t6;
                                    zzamvVar4 = zzamvVar3;
                                    zzamvVar4.zza(zzamdVar);
                                    if (obj2 == null) {
                                        obj2 = zzamvVar4.zzc(t7);
                                    }
                                    if (!zzamvVar4.zza((zzamv) obj2, zzamdVar, 0)) {
                                        int i5 = zzalrVar.zzl;
                                        Object obj4 = obj2;
                                        while (i5 < zzalrVar.zzm) {
                                            T t9 = t7;
                                            obj4 = zzalrVar.zza((Object) t9, zzalrVar.zzk[i5], (int) obj4, (zzamv<UT, int>) zzamvVar4, (Object) t4);
                                            i5++;
                                            t7 = t9;
                                        }
                                        T t10 = t7;
                                        if (obj4 != null) {
                                            zzamvVar4.zzb((Object) t10, (T) obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    zzalrVar3 = zzalrVar;
                                    zzajvVar3 = zzajvVar2;
                                    zzajxVar2 = zzajxVar;
                                }
                            }
                            try {
                                if (!zzamvVar.zza((zzamv) obj2, zzamdVar, 0)) {
                                    int i6 = zzalrVar3.zzl;
                                    Object obj5 = obj2;
                                    while (i6 < zzalrVar3.zzm) {
                                        T t11 = t6;
                                        zzamv zzamvVar5 = zzamvVar;
                                        obj5 = zzalrVar3.zza((Object) t11, zzalrVar3.zzk[i6], (int) obj5, (zzamv<UT, int>) zzamvVar5, (Object) t4);
                                        i6++;
                                        t6 = t11;
                                        zzalrVar3 = zzalrVar3;
                                        zzamvVar = zzamvVar5;
                                    }
                                    zzamv zzamvVar6 = zzamvVar;
                                    zzalrVar2 = zzalrVar3;
                                    T t12 = t6;
                                    if (obj5 != null) {
                                        zzamvVar6.zzb((Object) t12, (T) obj5);
                                        break;
                                    }
                                } else {
                                    zzalrVar = zzalrVar3;
                                    zzamvVar4 = zzamvVar;
                                    zzalrVar3 = zzalrVar;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzamvVar2 = zzamvVar;
                                zzalrVar = zzalrVar3;
                                t7 = t6;
                                zzamvVar4 = zzamvVar2;
                                t5 = t7;
                                zzalrVar3 = zzalrVar;
                                i4 = zzalrVar3.zzl;
                                obj = obj2;
                                while (i4 < zzalrVar3.zzm) {
                                }
                                T t82 = t5;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    t5 = t6;
                    zzamvVar4 = zzamvVar;
                    i4 = zzalrVar3.zzl;
                    obj = obj2;
                    while (i4 < zzalrVar3.zzm) {
                    }
                    T t822 = t5;
                    if (obj != null) {
                    }
                    throw th;
                }
            } else if (zzc == Integer.MAX_VALUE) {
                int i7 = zzalrVar3.zzl;
                Object obj6 = obj2;
                while (i7 < zzalrVar3.zzm) {
                    obj6 = zzalrVar3.zza((Object) t4, zzalrVar3.zzk[i7], (int) obj6, (zzamv<UT, int>) zzamvVar4, (Object) t4);
                    i7++;
                    zzalrVar3 = zzalrVar3;
                }
                zzalrVar2 = zzalrVar3;
                if (obj6 != null) {
                    zzamvVar4.zzb((Object) t4, (T) obj6);
                }
            } else {
                zzalrVar = zzalrVar3;
                t7 = t4;
                try {
                    Object zza6 = !zzalrVar.zzh ? null : zzajxVar2.zza(zzajvVar3, zzalrVar.zzg, zzc);
                    if (zza6 != null) {
                        if (zzajyVar == null) {
                            try {
                                zzajyVar = zzajxVar2.zzb(t7);
                            } catch (Throwable th5) {
                                th = th5;
                                t5 = t7;
                                zzalrVar3 = zzalrVar;
                                i4 = zzalrVar3.zzl;
                                obj = obj2;
                                while (i4 < zzalrVar3.zzm) {
                                }
                                T t8222 = t5;
                                if (obj != null) {
                                }
                                throw th;
                            }
                        }
                        zzajy<?> zzajyVar2 = zzajyVar;
                        zzamv zzamvVar7 = zzamvVar4;
                        try {
                            obj2 = zzajxVar2.zza(t7, zzamdVar, zza6, zzajvVar3, zzajyVar2, obj2, zzamvVar7);
                            zzajyVar = zzajyVar2;
                            zzamvVar4 = zzamvVar7;
                            zzajxVar = zzajxVar2;
                            zzajvVar2 = zzajvVar3;
                            zzalrVar3 = zzalrVar;
                        } catch (Throwable th6) {
                            th = th6;
                            t5 = t7;
                            zzamvVar4 = zzamvVar7;
                        }
                    } else {
                        zzajxVar = zzajxVar2;
                        t5 = t7;
                        zzajvVar2 = zzajvVar3;
                        try {
                            zzamvVar4.zza(zzamdVar);
                            if (obj2 == null) {
                                try {
                                    obj2 = zzamvVar4.zzc(t5);
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                            if (!zzamvVar4.zza((zzamv) obj2, zzamdVar, 0)) {
                                int i8 = zzalrVar.zzl;
                                Object obj7 = obj2;
                                while (i8 < zzalrVar.zzm) {
                                    zzalr<T> zzalrVar4 = zzalrVar;
                                    obj7 = zzalrVar4.zza((Object) t5, zzalrVar.zzk[i8], (int) obj7, (zzamv<UT, int>) zzamvVar4, (Object) t4);
                                    i8++;
                                    zzamvVar4 = zzamvVar4;
                                    zzalrVar = zzalrVar4;
                                }
                                zzamv zzamvVar8 = zzamvVar4;
                                if (obj7 != null) {
                                    zzamvVar8.zzb((Object) t5, (T) obj7);
                                    return;
                                }
                                return;
                            }
                            zzalrVar3 = zzalrVar;
                            zzamvVar4 = zzamvVar4;
                        } catch (Throwable th8) {
                            th = th8;
                            zzalrVar3 = zzalrVar;
                            zzamvVar = zzamvVar4;
                            zzamvVar4 = zzamvVar;
                            i4 = zzalrVar3.zzl;
                            obj = obj2;
                            while (i4 < zzalrVar3.zzm) {
                            }
                            T t82222 = t5;
                            if (obj != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    zzamv zzamvVar9 = zzamvVar4;
                    t6 = t7;
                    zzalrVar3 = zzalrVar;
                    zzamvVar = zzamvVar9;
                    t5 = t6;
                    zzamvVar4 = zzamvVar;
                    i4 = zzalrVar3.zzl;
                    obj = obj2;
                    while (i4 < zzalrVar3.zzm) {
                    }
                    T t822222 = t5;
                    if (obj != null) {
                    }
                    throw th;
                }
                zzalrVar3 = zzalrVar;
                i4 = zzalrVar3.zzl;
                obj = obj2;
                while (i4 < zzalrVar3.zzm) {
                    obj = zzalrVar3.zza((Object) t5, zzalrVar3.zzk[i4], (int) obj, (zzamv<UT, int>) zzamvVar4, (Object) t4);
                    i4++;
                    zzalrVar3 = this;
                }
                T t8222222 = t5;
                if (obj != null) {
                    zzamvVar4.zzb((Object) t8222222, (T) obj);
                }
                throw th;
            }
            zzajvVar3 = zzajvVar2;
            zzajxVar2 = zzajxVar;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    public final void zza(T t4, byte[] bArr, int i4, int i5, zzaiv zzaivVar) {
        zza((zzalr<T>) t4, bArr, i4, i5, 0, zzaivVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t4, T t5, int i4) {
        if (zzc((zzalr<T>) t5, i4)) {
            long zzc = zzc(i4) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t5, zzc);
            if (object != null) {
                zzamc zze = zze(i4);
                if (!zzc((zzalr<T>) t4, i4)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t4, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t4, zzc, zza2);
                    }
                    zzb((zzalr<T>) t4, i4);
                    return;
                }
                Object object2 = unsafe.getObject(t4, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t4, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i4] + " is present but null: " + String.valueOf(t5));
        }
    }

    private final void zza(Object obj, int i4, zzamd zzamdVar) {
        if (zzg(i4)) {
            zzana.zza(obj, i4 & 1048575, zzamdVar.zzr());
        } else if (this.zzi) {
            zzana.zza(obj, i4 & 1048575, zzamdVar.zzq());
        } else {
            zzana.zza(obj, i4 & 1048575, zzamdVar.zzp());
        }
    }

    private final void zza(T t4, int i4, Object obj) {
        zzb.putObject(t4, zzc(i4) & 1048575, obj);
        zzb((zzalr<T>) t4, i4);
    }

    private final void zza(T t4, int i4, int i5, Object obj) {
        zzb.putObject(t4, zzc(i5) & 1048575, obj);
        zzb((zzalr<T>) t4, i4, i5);
    }

    private final <K, V> void zza(zzanm zzanmVar, int i4, Object obj, int i5) {
        if (obj != null) {
            zzanmVar.zza(i4, this.zzr.zza(zzf(i5)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i4, Object obj, zzanm zzanmVar) {
        if (obj instanceof String) {
            zzanmVar.zza(i4, (String) obj);
        } else {
            zzanmVar.zza(i4, (zzaiw) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a60  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t4, zzanm zzanmVar) {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i4;
        Map.Entry<?, ?> entry2;
        int i5;
        int i6;
        int i7;
        int i8;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzalr<T> zzalrVar = this;
        int i9 = 267386880;
        int i10 = 1;
        int i11 = 1048575;
        if (zzanmVar.zza() == 2) {
            zza(zzalrVar.zzp, t4, zzanmVar);
            if (zzalrVar.zzh) {
                zzajy<?> zza2 = zzalrVar.zzq.zza(t4);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzalrVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzalrVar.zzc(length2);
                        int i12 = zzalrVar.zzc[length2];
                        while (entry3 != null && zzalrVar.zzq.zza(entry3) > i12) {
                            zzalrVar.zzq.zza(zzanmVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zza(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zzb(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzb(i12, zzana.zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zze(i12, zzana.zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzc(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzb(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zzh(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zza(i12, zzana.zze(t4, zzc & 1048575), zzanmVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzb(i12, zzana.zze(t4, zzc & 1048575), zzalrVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, (zzaiw) zzana.zze(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzf(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzd(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzc(i12, zzana.zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zze(i12, zzana.zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zzd(i12, zzana.zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzalrVar.zzc((zzalr<T>) t4, length2)) {
                                    zzanmVar.zza(i12, zzana.zze(t4, zzc & 1048575), zzalrVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzame.zzb(zzalrVar.zzc[length2], (List<Double>) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 19:
                                zzame.zzf(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 20:
                                zzame.zzh(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 21:
                                zzame.zzn(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 22:
                                zzame.zzg(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                zzame.zze(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 24:
                                zzame.zzd(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 25:
                                zzame.zza(zzalrVar.zzc[length2], (List<Boolean>) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 26:
                                zzame.zzb(zzalrVar.zzc[length2], (List<String>) zzana.zze(t4, zzc & 1048575), zzanmVar);
                                break;
                            case 27:
                                zzame.zzb(zzalrVar.zzc[length2], (List<?>) zzana.zze(t4, zzc & 1048575), zzanmVar, (zzamc<?>) zzalrVar.zze(length2));
                                break;
                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                zzame.zza(zzalrVar.zzc[length2], (List<zzaiw>) zzana.zze(t4, zzc & 1048575), zzanmVar);
                                break;
                            case 29:
                                zzame.zzm(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                zzame.zzc(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                zzame.zzi(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 32:
                                zzame.zzj(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 33:
                                zzame.zzk(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case 34:
                                zzame.zzl(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, false);
                                break;
                            case C3139z9.f40333J /* 35 */:
                                zzame.zzb(zzalrVar.zzc[length2], (List<Double>) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 36:
                                zzame.zzf(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 37:
                                zzame.zzh(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case C3139z9.f40334K /* 38 */:
                                zzame.zzn(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 39:
                                zzame.zzg(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 40:
                                zzame.zze(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 41:
                                zzame.zzd(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 42:
                                zzame.zza(zzalrVar.zzc[length2], (List<Boolean>) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 43:
                                zzame.zzm(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                                zzame.zzc(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                                zzame.zzi(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 46:
                                zzame.zzj(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 47:
                                zzame.zzk(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 48:
                                zzame.zzl(zzalrVar.zzc[length2], (List) zzana.zze(t4, zzc & 1048575), zzanmVar, true);
                                break;
                            case 49:
                                zzame.zza(zzalrVar.zzc[length2], (List<?>) zzana.zze(t4, zzc & 1048575), zzanmVar, (zzamc<?>) zzalrVar.zze(length2));
                                break;
                            case 50:
                                zzalrVar.zza(zzanmVar, i12, zzana.zze(t4, zzc & 1048575), length2);
                                break;
                            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zza(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.SET_USER_ID /* 52 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zzb(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzb(i12, zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zze(i12, zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzc(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzb(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zze(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zza(i12, zzana.zze(t4, zzc & 1048575), zzanmVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzb(i12, zzana.zze(t4, zzc & 1048575), zzalrVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, (zzaiw) zzana.zze(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzf(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzd(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzc(i12, zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zze(i12, zzc(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zzd(i12, zzd(t4, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzalrVar.zzc((zzalr<T>) t4, i12, length2)) {
                                    zzanmVar.zza(i12, zzana.zze(t4, zzc & 1048575), zzalrVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzalrVar.zzq.zza(zzanmVar, entry3);
                        entry3 = it2.hasNext() ? it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (zzalrVar.zzh) {
            zzajy<?> zza3 = zzalrVar.zzq.zza(t4);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzalrVar.zzc.length;
                Unsafe unsafe = zzb;
                i4 = 0;
                int i13 = 0;
                int i14 = 1048575;
                while (i4 < length) {
                    int zzc2 = zzalrVar.zzc(i4);
                    int i15 = i9;
                    int[] iArr = zzalrVar.zzc;
                    int i16 = iArr[i4];
                    int i17 = (zzc2 & i15) >>> 20;
                    int i18 = i10;
                    if (i17 <= 17) {
                        int i19 = iArr[i4 + 2];
                        int i20 = i19 & i11;
                        if (i20 != i14) {
                            i13 = i20 == i11 ? 0 : unsafe.getInt(t4, i20);
                            i14 = i20;
                        }
                        int i21 = i18 << (i19 >>> 20);
                        entry2 = entry;
                        i5 = i14;
                        i6 = i13;
                        i7 = i21;
                    } else {
                        entry2 = entry;
                        i5 = i14;
                        i6 = i13;
                        i7 = 0;
                    }
                    while (entry2 != null && zzalrVar.zzq.zza(entry2) <= i16) {
                        zzalrVar.zzq.zza(zzanmVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j4 = zzc2 & i11;
                    switch (i17) {
                        case 0:
                            i8 = i18;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, zzana.zza(t4, j4));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i22 = i18;
                            i8 = i22;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, zzana.zzb(t4, j4));
                                i8 = i22;
                            }
                            zzalrVar = this;
                            break;
                        case 2:
                            int i23 = i18;
                            i8 = i23;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzb(i16, unsafe.getLong(t4, j4));
                                i8 = i23;
                            }
                            zzalrVar = this;
                            break;
                        case 3:
                            int i24 = i18;
                            i8 = i24;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zze(i16, unsafe.getLong(t4, j4));
                                i8 = i24;
                            }
                            zzalrVar = this;
                            break;
                        case 4:
                            int i25 = i18;
                            i8 = i25;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzc(i16, unsafe.getInt(t4, j4));
                                i8 = i25;
                            }
                            zzalrVar = this;
                            break;
                        case 5:
                            int i26 = i18;
                            i8 = i26;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, unsafe.getLong(t4, j4));
                                i8 = i26;
                            }
                            zzalrVar = this;
                            break;
                        case 6:
                            int i27 = i18;
                            i8 = i27;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzb(i16, unsafe.getInt(t4, j4));
                                i8 = i27;
                            }
                            zzalrVar = this;
                            break;
                        case 7:
                            int i28 = i18;
                            i8 = i28;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, zzana.zzh(t4, j4));
                                i8 = i28;
                            }
                            zzalrVar = this;
                            break;
                        case 8:
                            int i29 = i18;
                            i8 = i29;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zza(i16, unsafe.getObject(t4, j4), zzanmVar);
                                i8 = i29;
                            }
                            zzalrVar = this;
                            break;
                        case 9:
                            i8 = i18;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzb(i16, unsafe.getObject(t4, j4), zzalrVar.zze(i4));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i30 = i18;
                            i8 = i30;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, (zzaiw) unsafe.getObject(t4, j4));
                                i8 = i30;
                            }
                            zzalrVar = this;
                            break;
                        case 11:
                            int i31 = i18;
                            i8 = i31;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzf(i16, unsafe.getInt(t4, j4));
                                i8 = i31;
                            }
                            zzalrVar = this;
                            break;
                        case 12:
                            int i32 = i18;
                            i8 = i32;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, unsafe.getInt(t4, j4));
                                i8 = i32;
                            }
                            zzalrVar = this;
                            break;
                        case 13:
                            int i33 = i18;
                            i8 = i33;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzd(i16, unsafe.getInt(t4, j4));
                                i8 = i33;
                            }
                            zzalrVar = this;
                            break;
                        case 14:
                            int i34 = i18;
                            i8 = i34;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzc(i16, unsafe.getLong(t4, j4));
                                i8 = i34;
                            }
                            zzalrVar = this;
                            break;
                        case 15:
                            int i35 = i18;
                            i8 = i35;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zze(i16, unsafe.getInt(t4, j4));
                                i8 = i35;
                            }
                            zzalrVar = this;
                            break;
                        case 16:
                            int i36 = i18;
                            i8 = i36;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zzd(i16, unsafe.getLong(t4, j4));
                                i8 = i36;
                            }
                            zzalrVar = this;
                            break;
                        case 17:
                            i8 = i18;
                            if (zzalrVar.zza((zzalr<T>) t4, i4, i5, i6, i7)) {
                                zzanmVar.zza(i16, unsafe.getObject(t4, j4), zzalrVar.zze(i4));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i8 = i18;
                            zzame.zzb(zzalrVar.zzc[i4], (List<Double>) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 19:
                            i8 = i18;
                            zzame.zzf(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 20:
                            i8 = i18;
                            zzame.zzh(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 21:
                            i8 = i18;
                            zzame.zzn(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 22:
                            i8 = i18;
                            zzame.zzg(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            i8 = i18;
                            zzame.zze(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 24:
                            i8 = i18;
                            zzame.zzd(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 25:
                            i8 = i18;
                            zzame.zza(zzalrVar.zzc[i4], (List<Boolean>) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 26:
                            i8 = i18;
                            zzame.zzb(zzalrVar.zzc[i4], (List<String>) unsafe.getObject(t4, j4), zzanmVar);
                            break;
                        case 27:
                            i8 = i18;
                            zzame.zzb(zzalrVar.zzc[i4], (List<?>) unsafe.getObject(t4, j4), zzanmVar, (zzamc<?>) zzalrVar.zze(i4));
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            i8 = i18;
                            zzame.zza(zzalrVar.zzc[i4], (List<zzaiw>) unsafe.getObject(t4, j4), zzanmVar);
                            break;
                        case 29:
                            i8 = i18;
                            zzame.zzm(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            i8 = i18;
                            zzame.zzc(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            i8 = i18;
                            zzame.zzi(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 32:
                            i8 = i18;
                            zzame.zzj(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 33:
                            i8 = i18;
                            zzame.zzk(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case 34:
                            i8 = i18;
                            zzame.zzl(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, false);
                            break;
                        case C3139z9.f40333J /* 35 */:
                            boolean z4 = i18;
                            zzame.zzb(zzalrVar.zzc[i4], (List<Double>) unsafe.getObject(t4, j4), zzanmVar, z4);
                            i8 = z4;
                            break;
                        case 36:
                            boolean z5 = i18;
                            zzame.zzf(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z5);
                            i8 = z5;
                            break;
                        case 37:
                            boolean z6 = i18;
                            zzame.zzh(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z6);
                            i8 = z6;
                            break;
                        case C3139z9.f40334K /* 38 */:
                            boolean z7 = i18;
                            zzame.zzn(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z7);
                            i8 = z7;
                            break;
                        case 39:
                            boolean z8 = i18;
                            zzame.zzg(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z8);
                            i8 = z8;
                            break;
                        case 40:
                            boolean z9 = i18;
                            zzame.zze(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z9);
                            i8 = z9;
                            break;
                        case 41:
                            boolean z10 = i18;
                            zzame.zzd(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z10);
                            i8 = z10;
                            break;
                        case 42:
                            boolean z11 = i18;
                            zzame.zza(zzalrVar.zzc[i4], (List<Boolean>) unsafe.getObject(t4, j4), zzanmVar, z11);
                            i8 = z11;
                            break;
                        case 43:
                            boolean z12 = i18;
                            zzame.zzm(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z12);
                            i8 = z12;
                            break;
                        case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            boolean z13 = i18;
                            zzame.zzc(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z13);
                            i8 = z13;
                            break;
                        case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            boolean z14 = i18;
                            zzame.zzi(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z14);
                            i8 = z14;
                            break;
                        case 46:
                            boolean z15 = i18;
                            zzame.zzj(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z15);
                            i8 = z15;
                            break;
                        case 47:
                            boolean z16 = i18;
                            zzame.zzk(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z16);
                            i8 = z16;
                            break;
                        case 48:
                            boolean z17 = i18;
                            zzame.zzl(zzalrVar.zzc[i4], (List) unsafe.getObject(t4, j4), zzanmVar, z17);
                            i8 = z17;
                            break;
                        case 49:
                            zzame.zza(zzalrVar.zzc[i4], (List<?>) unsafe.getObject(t4, j4), zzanmVar, (zzamc<?>) zzalrVar.zze(i4));
                            i8 = i18;
                            break;
                        case 50:
                            zzalrVar.zza(zzanmVar, i16, unsafe.getObject(t4, j4), i4);
                            i8 = i18;
                            break;
                        case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, zza(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.SET_USER_ID /* 52 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, zzb(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzb(i16, zzd(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zze(i16, zzd(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzc(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, zzd(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzb(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 58:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, zze(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 59:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zza(i16, unsafe.getObject(t4, j4), zzanmVar);
                            }
                            i8 = i18;
                            break;
                        case 60:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzb(i16, unsafe.getObject(t4, j4), zzalrVar.zze(i4));
                            }
                            i8 = i18;
                            break;
                        case 61:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, (zzaiw) unsafe.getObject(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzf(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 63:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzd(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzc(i16, zzd(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 66:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zze(i16, zzc(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 67:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zzd(i16, zzd(t4, j4));
                            }
                            i8 = i18;
                            break;
                        case 68:
                            if (zzalrVar.zzc((zzalr<T>) t4, i16, i4)) {
                                zzanmVar.zza(i16, unsafe.getObject(t4, j4), zzalrVar.zze(i4));
                            }
                            i8 = i18;
                            break;
                        default:
                            i8 = i18;
                            break;
                    }
                    i4 += 3;
                    i13 = i6;
                    it = it3;
                    i11 = 1048575;
                    i14 = i5;
                    entry = entry2;
                    i9 = i15;
                    i10 = i8;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzalrVar.zzq.zza(zzanmVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzalrVar.zzp, t4, zzanmVar);
            }
        }
        entry = null;
        it = null;
        length = zzalrVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i4 = 0;
        int i132 = 0;
        int i142 = 1048575;
        while (i4 < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzalrVar.zzp, t4, zzanmVar);
    }

    private static <UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t4, zzanm zzanmVar) {
        zzamvVar.zzb((zzamv<UT, UB>) zzamvVar.zzd(t4), zzanmVar);
    }

    private final boolean zza(T t4, int i4, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return zzc((zzalr<T>) t4, i4);
        }
        return (i6 & i7) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i4, zzamc zzamcVar) {
        return zzamcVar.zze(zzana.zze(obj, i4 & 1048575));
    }
}
