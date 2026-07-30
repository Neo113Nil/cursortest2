package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhvf implements zzhbs {
    static final zzhiu zza;
    static final zzhiu zzb;
    static final zzhiu zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhwx zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhit zza2 = zzhiu.zza();
        zza2.zza(zzhxn.SHA256, zzhsd.zza);
        zza2.zza(zzhxn.SHA384, zzhsd.zzb);
        zza2.zza(zzhxn.SHA512, zzhsd.zzc);
        zza = zza2.zzb();
        zzhit zza3 = zzhiu.zza();
        zza3.zza(zzhwx.IEEE_P1363, zzhse.zza);
        zza3.zza(zzhwx.DER, zzhse.zzb);
        zzb = zza3.zzb();
        zzhit zza4 = zzhiu.zza();
        zza4.zza(zzhww.NIST_P256, zzhsc.zza);
        zza4.zza(zzhww.NIST_P384, zzhsc.zzb);
        zza4.zza(zzhww.NIST_P521, zzhsc.zzc);
        zzc = zza4.zzb();
    }

    private zzhvf(ECPublicKey eCPublicKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzhyb.zza(zzhxnVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhwxVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhbs zzb(zzhsk zzhskVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhvf((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhxe.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhskVar.zzd(), zzhwy.zzb((zzhww) zzc.zzb(zzhskVar.zzf().zzd())))), (zzhxn) zza.zzb(zzhskVar.zzf().zze()), (zzhwx) zzb.zzb(zzhskVar.zzf().zzc()), zzhskVar.zze().zzc(), zzhskVar.zzf().zzf().equals(zzhsf.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6;
        byte b2;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zzhwx.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (zzhis.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzhwy.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i7 = bArr[1] & 255;
            if (i7 == 129) {
                i7 = bArr[2] & 255;
                if (i7 >= 128) {
                    i = 2;
                    if (i7 == (length2 - 1) - i && bArr[i + 1] == 2 && (i5 = (i4 = (i3 = i + 3) + (i2 = bArr[i + 2] & 255)) + 1) < length2 && i2 != 0) {
                        b = bArr[i3];
                        if ((b & 255) < 128 && ((i2 <= 1 || b != 0 || (bArr[i + 4] & 255) >= 128) && bArr[i4] == 2)) {
                            i6 = bArr[i5] & 255;
                            if (i4 + 2 + i6 == length2 && i6 != 0) {
                                b2 = bArr[i + 5 + i2];
                                if ((b2 & 255) < 128 && (i6 <= 1 || b2 != 0 || (bArr[i + 6 + i2] & 255) >= 128)) {
                                    String str = this.zzh;
                                    Provider provider = this.zzl;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) zzhxe.zzc.zzb(str);
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i7 != 128 && i7 <= 129) {
                i = 1;
                if (i7 == (length2 - 1) - i) {
                    b = bArr[i3];
                    if ((b & 255) < 128) {
                        i6 = bArr[i5] & 255;
                        if (i4 + 2 + i6 == length2) {
                            b2 = bArr[i + 5 + i2];
                            if ((b2 & 255) < 128) {
                                String str2 = this.zzh;
                                Provider provider2 = this.zzl;
                                if (provider2 == null) {
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                }
                                if (signature.verify(bArr)) {
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
