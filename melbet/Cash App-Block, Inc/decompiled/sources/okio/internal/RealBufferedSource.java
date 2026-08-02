package okio.internal;

import android.os.Bundle;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.investing.viewmodels.InvestmentEntityContentModel;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.LinkedHashSet;
import kotlin.time.DurationKt;
import okio.Buffer;
import okio.ByteString;

/* renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* loaded from: classes9.dex */
public abstract class RealBufferedSource {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonIndexOf(okio.RealBufferedSource realBufferedSource, ByteString byteString, int i, long j, long j2) {
        long j3;
        ByteString byteString2;
        byteString.getClass();
        int i2 = i;
        long j4 = i2;
        DurationKt.checkOffsetAndCount(byteString.getSize$okio(), 0L, j4);
        boolean z = realBufferedSource.closed;
        Buffer buffer = realBufferedSource.bufferField;
        if (!z) {
            ByteString byteString3 = byteString;
            long j5 = j;
            while (true) {
                long commonIndexOf = Buffer.commonIndexOf(buffer, byteString3, j5, j2, i2);
                long j6 = j5;
                long j7 = -1;
                if (commonIndexOf == -1) {
                    long j8 = buffer.size;
                    long j9 = (j8 - j4) + 1;
                    if (j9 >= j2) {
                        break;
                    }
                    if (j8 >= j2) {
                        int max = (int) Math.max(1L, (j8 - j2) + 1);
                        int min = ((int) Math.min(j4, (buffer.size - j6) + 1)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j3 = j7;
                            byteString2 = byteString;
                            if (buffer.rangeEquals(min, buffer.size - min, byteString2)) {
                                break;
                            }
                            if (min == max) {
                                return j3;
                            }
                            min--;
                            j7 = j3;
                        }
                    } else {
                        j3 = -1;
                        byteString2 = byteString;
                    }
                    if (realBufferedSource.source.read(buffer, 8192L) == j3) {
                        return j3;
                    }
                    long max2 = Math.max(j6, j9);
                    byteString3 = byteString2;
                    j5 = max2;
                    i2 = i;
                } else {
                    return commonIndexOf;
                }
            }
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
    }

    public static final LinkedHashSet getSortOrder(boolean z, boolean z2) {
        if (z && z2) {
            InvestmentEntityContentModel.Component.Companion.getClass();
            return InvestmentEntityContentModel.Component.OWNED_ETF_GROUP;
        }
        if (z && !z2) {
            InvestmentEntityContentModel.Component.Companion.getClass();
            return InvestmentEntityContentModel.Component.UNOWNED_ETF_GROUP;
        }
        if (z || !z2) {
            InvestmentEntityContentModel.Component.Companion.getClass();
            return InvestmentEntityContentModel.Component.UNOWNED_STOCK_GROUP;
        }
        InvestmentEntityContentModel.Component.Companion.getClass();
        return InvestmentEntityContentModel.Component.OWNED_STOCK_GROUP;
    }

    public static boolean isPointOnCurve(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p).equals(bigInteger.pow(3).add(a.multiply(bigInteger)).add(b).mod(p));
    }

    public static Parcelable zza(Bundle bundle, String str) {
        ClassLoader classLoader = RealBufferedSource.class.getClassLoader();
        zzae.checkNotNull(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void zzb(Bundle bundle, Bundle bundle2) {
        Parcelable zza = zza(bundle, "MapOptions");
        if (zza != null) {
            zzc(bundle2, "MapOptions", zza);
        }
        Parcelable zza2 = zza(bundle, "StreetViewPanoramaOptions");
        if (zza2 != null) {
            zzc(bundle2, "StreetViewPanoramaOptions", zza2);
        }
        Parcelable zza3 = zza(bundle, "camera");
        if (zza3 != null) {
            zzc(bundle2, "camera", zza3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void zzc(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = RealBufferedSource.class.getClassLoader();
        zzae.checkNotNull(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
