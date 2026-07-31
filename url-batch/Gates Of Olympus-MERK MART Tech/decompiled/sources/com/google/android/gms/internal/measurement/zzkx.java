package com.google.android.gms.internal.measurement;

import androidx.compose.ui.spatial.RectListKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzkx<T> implements zzll<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmg.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkt zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlb zzn;
    private final zzkd zzo;
    private final zzmf<?, ?> zzp;
    private final zziz<?> zzq;
    private final zzkm zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzmg.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & 536870912) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzmg.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzmn zzmnVar, Class<?> cls, zzhv zzhvVar) throws IOException {
        switch (zzkw.zza[zzmnVar.ordinal()]) {
            case 1:
                int zzd = zzhw.zzd(bArr, i, zzhvVar);
                zzhvVar.zzc = Boolean.valueOf(zzhvVar.zzb != 0);
                return zzd;
            case 2:
                return zzhw.zza(bArr, i, zzhvVar);
            case 3:
                zzhvVar.zzc = Double.valueOf(zzhw.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhvVar.zzc = Integer.valueOf(zzhw.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhvVar.zzc = Long.valueOf(zzhw.zzd(bArr, i));
                return i + 8;
            case 8:
                zzhvVar.zzc = Float.valueOf(zzhw.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzhw.zzc(bArr, i, zzhvVar);
                zzhvVar.zzc = Integer.valueOf(zzhvVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzhw.zzd(bArr, i, zzhvVar);
                zzhvVar.zzc = Long.valueOf(zzhvVar.zzb);
                return zzd2;
            case 14:
                return zzhw.zza(zzlh.zza().zza((Class) cls), bArr, i, i2, zzhvVar);
            case 15:
                int zzc2 = zzhw.zzc(bArr, i, zzhvVar);
                zzhvVar.zzc = Integer.valueOf(zzio.zze(zzhvVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzhw.zzd(bArr, i, zzhvVar);
                zzhvVar.zzc = Long.valueOf(zzio.zza(zzhvVar.zzb));
                return zzd3;
            case 17:
                return zzhw.zzb(bArr, i, zzhvVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zza(T t) {
        int i;
        int zza2;
        int zza3;
        int zzd;
        int zzd2;
        int zzi;
        int zzj;
        zzkx<T> zzkxVar = this;
        T t2 = t;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzkxVar.zzc.length) {
            int zzc = zzkxVar.zzc(i3);
            int i7 = (267386880 & zzc) >>> 20;
            int[] iArr = zzkxVar.zzc;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i6) {
                    i4 = i10 == i2 ? 0 : unsafe.getInt(t2, i10);
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = zzc & i2;
            if (i7 >= zzje.DOUBLE_LIST_PACKED.zza()) {
                zzje.SINT64_LIST_PACKED.zza();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzit.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zza(i8, 0.0f);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzd(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzg(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzg(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zzc(i8, 0L);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zzf(i8, 0);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zzb(i8, true);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zzia) {
                            zzd = zzit.zzc(i8, (zzia) object);
                        } else {
                            zzd = zzit.zzb(i8, (String) object);
                        }
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzln.zza(i8, unsafe.getObject(t2, j), zzkxVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzc(i8, (zzia) unsafe.getObject(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzj(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zze(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zzh(i8, 0);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzit.zze(i8, 0L);
                        i5 = i11 + zza3;
                        zzkxVar = this;
                        t2 = t;
                        break;
                    }
                    zzkxVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzi(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zzd = zzit.zzf(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzd;
                        zzkxVar = this;
                        break;
                    }
                    zzkxVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzkxVar.zza((zzkx<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzit.zzb(i8, (zzkt) unsafe.getObject(t2, j), zzkxVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    zza2 = zzln.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 19:
                    zza2 = zzln.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 20:
                    zza2 = zzln.zzf(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 21:
                    zza2 = zzln.zzj(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 22:
                    zza2 = zzln.zze(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 23:
                    zza2 = zzln.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 24:
                    zza2 = zzln.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 25:
                    zza2 = zzln.zza(i8, (List<?>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 26:
                    zza2 = zzln.zzb(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case 27:
                    zza2 = zzln.zzb(i8, (List<?>) unsafe.getObject(t2, j), zzkxVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 28:
                    zza2 = zzln.zza(i8, (List<zzia>) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zza2 = zzln.zzi(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 30:
                    zza2 = zzln.zzb(i8, (List<Integer>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 31:
                    zza2 = zzln.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 32:
                    zza2 = zzln.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 33:
                    zza2 = zzln.zzg(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 34:
                    zza2 = zzln.zzh(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 35:
                    zzd2 = zzln.zzd((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    zzd2 = zzln.zzc((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    zzd2 = zzln.zzf((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 38:
                    zzd2 = zzln.zzj((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    zzd2 = zzln.zze((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    zzd2 = zzln.zzd((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    zzd2 = zzln.zzc((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 42:
                    zzd2 = zzln.zza((List<?>) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 43:
                    zzd2 = zzln.zzi((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    zzd2 = zzln.zzb((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    zzd2 = zzln.zzc((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 46:
                    zzd2 = zzln.zzd((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 47:
                    zzd2 = zzln.zzg((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    zzd2 = zzln.zzh((List) unsafe.getObject(t2, j));
                    if (zzd2 > 0) {
                        zzi = zzit.zzi(i8);
                        zzj = zzit.zzj(zzd2);
                        i5 = i11 + zzi + zzj + zzd2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 49:
                    zza2 = zzln.zza(i8, (List<zzkt>) unsafe.getObject(t2, j), zzkxVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 50:
                    zza2 = zzkxVar.zzr.zza(i8, unsafe.getObject(t2, j), zzkxVar.zzf(i3));
                    i5 = i11 + zza2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zza(i8, 0.0f);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzd(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzg(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzg(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzc(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzf(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzb(i8, true);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zzia) {
                            zza2 = zzit.zzc(i8, (zzia) object2);
                        } else {
                            zza2 = zzit.zzb(i8, (String) object2);
                        }
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzln.zza(i8, unsafe.getObject(t2, j), zzkxVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 61:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzc(i8, (zzia) unsafe.getObject(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzj(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 63:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zze(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzh(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zze(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzi(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzf(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzkxVar.zzc((zzkx<T>) t2, i8, i3)) {
                        zza2 = zzit.zzb(i8, (zzkt) unsafe.getObject(t2, j), zzkxVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                default:
                    i5 = i11;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzmf<?, ?> zzmfVar = zzkxVar.zzp;
        int zza4 = i5 + zzmfVar.zza((zzmf<?, ?>) zzmfVar.zzd(t2));
        if (!zzkxVar.zzh) {
            return zza4;
        }
        zzjd<?> zza5 = zzkxVar.zzq.zza(t2);
        int i12 = 0;
        for (int i13 = 0; i13 < zza5.zza.zza(); i13++) {
            Map.Entry<?, Object> zza6 = zza5.zza.zza(i13);
            i12 += zzjd.zza((zzjf<?>) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i12 += zzjd.zza((zzjf<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzb(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzjm.zza(Double.doubleToLongBits(zzmg.zza(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzmg.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzh(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzmg.zze(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zzmg.zze(t, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzmg.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzmg.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zzmg.zze(t, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zza2 = zzmg.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzmg.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzmg.zze(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmg.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmg.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case RectListKt.BitOffsetForGesturable /* 62 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjm.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzkx<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmg.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t).hashCode() : hashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzmg.zze(t, j)).intValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zza(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzhv r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzhv):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzmg.zze(t, j)).longValue();
    }

    private final zzjo zzd(int i) {
        return (zzjo) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzkx<T> zza(Class<T> cls, zzkr zzkrVar, zzlb zzlbVar, zzkd zzkdVar, zzmf<?, ?> zzmfVar, zziz<?> zzizVar, zzkm zzkmVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        boolean z;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        Field zza2;
        char charAt10;
        int i23;
        int i24;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i25;
        char charAt11;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        if (zzkrVar instanceof zzlj) {
            zzlj zzljVar = (zzlj) zzkrVar;
            String zzd = zzljVar.zzd();
            int length = zzd.length();
            char c = 55296;
            boolean z2 = true;
            if (zzd.charAt(0) >= 55296) {
                int i29 = 1;
                while (true) {
                    i = i29 + 1;
                    if (zzd.charAt(i29) < 55296) {
                        break;
                    }
                    i29 = i;
                }
            } else {
                i = 1;
            }
            int i30 = i + 1;
            int charAt15 = zzd.charAt(i);
            if (charAt15 >= 55296) {
                int i31 = charAt15 & 8191;
                int i32 = 13;
                while (true) {
                    i28 = i30 + 1;
                    charAt14 = zzd.charAt(i30);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i31 |= (charAt14 & 8191) << i32;
                    i32 += 13;
                    i30 = i28;
                }
                charAt15 = i31 | (charAt14 << i32);
                i30 = i28;
            }
            if (charAt15 == 0) {
                i4 = 0;
                charAt = 0;
                i3 = 0;
                i7 = 0;
                i2 = 0;
                i6 = 0;
                iArr = zza;
                i5 = 0;
            } else {
                int i33 = i30 + 1;
                int charAt16 = zzd.charAt(i30);
                if (charAt16 >= 55296) {
                    int i34 = charAt16 & 8191;
                    int i35 = 13;
                    while (true) {
                        i15 = i33 + 1;
                        charAt9 = zzd.charAt(i33);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i34 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i33 = i15;
                    }
                    charAt16 = i34 | (charAt9 << i35);
                    i33 = i15;
                }
                int i36 = i33 + 1;
                int charAt17 = zzd.charAt(i33);
                if (charAt17 >= 55296) {
                    int i37 = charAt17 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt8 = zzd.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i37 |= (charAt8 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt17 = i37 | (charAt8 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt18 = zzd.charAt(i36);
                if (charAt18 >= 55296) {
                    int i40 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt7 = zzd.charAt(i39);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i40 |= (charAt7 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt18 = i40 | (charAt7 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                int charAt19 = zzd.charAt(i39);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt6 = zzd.charAt(i42);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i43 |= (charAt6 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt19 = i43 | (charAt6 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                charAt = zzd.charAt(i42);
                if (charAt >= 55296) {
                    int i46 = charAt & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt5 = zzd.charAt(i45);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i46 |= (charAt5 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt = i46 | (charAt5 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                int charAt20 = zzd.charAt(i45);
                if (charAt20 >= 55296) {
                    int i49 = charAt20 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt4 = zzd.charAt(i48);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i49 |= (charAt4 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt20 = i49 | (charAt4 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt21 = zzd.charAt(i48);
                if (charAt21 >= 55296) {
                    int i52 = charAt21 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt3 = zzd.charAt(i51);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i52 |= (charAt3 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt21 = i52 | (charAt3 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt22 = zzd.charAt(i51);
                if (charAt22 >= 55296) {
                    int i55 = charAt22 & 8191;
                    int i56 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        charAt2 = zzd.charAt(i54);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i55 |= (charAt2 & 8191) << i56;
                        i56 += 13;
                        i54 = i8;
                    }
                    charAt22 = i55 | (charAt2 << i56);
                    i54 = i8;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                i2 = (charAt16 << 1) + charAt17;
                int i57 = charAt20;
                i3 = charAt18;
                i4 = i57;
                i5 = charAt16;
                iArr = iArr3;
                i6 = charAt22;
                i30 = i54;
                i7 = charAt19;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzljVar.zze();
            Class<?> cls2 = zzljVar.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i58 = i6 + i4;
            int i59 = i6;
            int i60 = i58;
            int i61 = 0;
            int i62 = 0;
            while (i30 < length) {
                int i63 = i30 + 1;
                int charAt23 = zzd.charAt(i30);
                if (charAt23 >= c) {
                    int i64 = charAt23 & 8191;
                    z = z2;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i27 = i65 + 1;
                        charAt13 = zzd.charAt(i65);
                        if (charAt13 < c) {
                            break;
                        }
                        i64 |= (charAt13 & 8191) << i66;
                        i66 += 13;
                        i65 = i27;
                    }
                    charAt23 = i64 | (charAt13 << i66);
                    i16 = i27;
                } else {
                    z = z2;
                    i16 = i63;
                }
                int i67 = i16 + 1;
                int charAt24 = zzd.charAt(i16);
                if (charAt24 >= c) {
                    int i68 = charAt24 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i26 = i69 + 1;
                        charAt12 = zzd.charAt(i69);
                        if (charAt12 < c) {
                            break;
                        }
                        i68 |= (charAt12 & 8191) << i70;
                        i70 += 13;
                        i69 = i26;
                    }
                    charAt24 = i68 | (charAt12 << i70);
                    i17 = i26;
                } else {
                    i17 = i67;
                }
                int i71 = charAt24 & 255;
                zzlj zzljVar2 = zzljVar;
                if ((charAt24 & 1024) != 0) {
                    iArr[i62] = i61;
                    i62++;
                }
                int i72 = length;
                if (i71 >= 51) {
                    int i73 = i17 + 1;
                    int charAt25 = zzd.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i74 = charAt25 & 8191;
                        int i75 = 13;
                        while (true) {
                            i25 = i73 + 1;
                            charAt11 = zzd.charAt(i73);
                            if (charAt11 < c2) {
                                break;
                            }
                            i74 |= (charAt11 & 8191) << i75;
                            i75 += 13;
                            i73 = i25;
                            c2 = 55296;
                        }
                        charAt25 = i74 | (charAt11 << i75);
                        i73 = i25;
                    }
                    int i76 = i71 - 51;
                    int i77 = i73;
                    if (i76 == 9 || i76 == 17) {
                        i24 = i2 + 1;
                        objArr[((i61 / 3) << 1) + 1] = zze[i2];
                    } else {
                        if (i76 == 12 && (zzljVar2.zzb().equals(zzle.PROTO2) || (charAt24 & 2048) != 0)) {
                            i24 = i2 + 1;
                            objArr[((i61 / 3) << 1) + 1] = zze[i2];
                        }
                        int i78 = charAt25 << 1;
                        obj = zze[i78];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i78] = zza3;
                        }
                        iArr2 = iArr4;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                        int i79 = i78 + 1;
                        obj2 = zze[i79];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i79] = zza4;
                        }
                        objectFieldOffset = objectFieldOffset2;
                        i20 = (int) unsafe.objectFieldOffset(zza4);
                        str = zzd;
                        i21 = i77;
                        i22 = 0;
                    }
                    i2 = i24;
                    int i782 = charAt25 << 1;
                    obj = zze[i782];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                    int i792 = i782 + 1;
                    obj2 = zze[i792];
                    if (!(obj2 instanceof Field)) {
                    }
                    objectFieldOffset = objectFieldOffset22;
                    i20 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    i21 = i77;
                    i22 = 0;
                } else {
                    iArr2 = iArr4;
                    int i80 = i2 + 1;
                    Field zza5 = zza(cls2, (String) zze[i2]);
                    if (i71 == 9 || i71 == 17) {
                        i18 = i80;
                        objArr[((i61 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i71 == 27 || i71 == 49) {
                            i23 = i2 + 2;
                            objArr[((i61 / 3) << 1) + 1] = zze[i80];
                        } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                            i18 = i80;
                            if (zzljVar2.zzb() == zzle.PROTO2 || (charAt24 & 2048) != 0) {
                                i23 = i2 + 2;
                                objArr[((i61 / 3) << 1) + 1] = zze[i18];
                            }
                        } else if (i71 == 50) {
                            int i81 = i59 + 1;
                            iArr[i59] = i61;
                            int i82 = (i61 / 3) << 1;
                            i18 = i2 + 2;
                            objArr[i82] = zze[i80];
                            if ((charAt24 & 2048) != 0) {
                                i19 = i2 + 3;
                                objArr[i82 + 1] = zze[i18];
                                i59 = i81;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                                if ((charAt24 & 4096) != 0 || i71 > 17) {
                                    i2 = i19;
                                    str = zzd;
                                    i20 = 1048575;
                                    i21 = i17;
                                    i22 = 0;
                                } else {
                                    int i83 = i17 + 1;
                                    int charAt26 = zzd.charAt(i17);
                                    i2 = i19;
                                    if (charAt26 >= 55296) {
                                        int i84 = charAt26 & 8191;
                                        int i85 = 13;
                                        while (true) {
                                            i21 = i83 + 1;
                                            charAt10 = zzd.charAt(i83);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i84 |= (charAt10 & 8191) << i85;
                                            i85 += 13;
                                            i83 = i21;
                                        }
                                        charAt26 = i84 | (charAt10 << i85);
                                    } else {
                                        i21 = i83;
                                    }
                                    int i86 = (i5 << 1) + (charAt26 / 32);
                                    Object obj3 = zze[i86];
                                    str = zzd;
                                    if (obj3 instanceof Field) {
                                        zza2 = (Field) obj3;
                                    } else {
                                        zza2 = zza(cls2, (String) obj3);
                                        zze[i86] = zza2;
                                    }
                                    i20 = (int) unsafe.objectFieldOffset(zza2);
                                    i22 = charAt26 % 32;
                                }
                                if (i71 >= 18 && i71 <= 49) {
                                    iArr[i60] = objectFieldOffset;
                                    i60++;
                                }
                            } else {
                                i59 = i81;
                            }
                        } else {
                            i18 = i80;
                        }
                        i19 = i23;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) != 0) {
                        }
                        i2 = i19;
                        str = zzd;
                        i20 = 1048575;
                        i21 = i17;
                        i22 = 0;
                        if (i71 >= 18) {
                            iArr[i60] = objectFieldOffset;
                            i60++;
                        }
                    }
                    i19 = i18;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i2 = i19;
                    str = zzd;
                    i20 = 1048575;
                    i21 = i17;
                    i22 = 0;
                    if (i71 >= 18) {
                    }
                }
                int i87 = i61 + 1;
                iArr2[i61] = charAt23;
                int i88 = i61 + 2;
                int i89 = i20;
                iArr2[i87] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i71 << 20) | objectFieldOffset;
                i61 += 3;
                iArr2[i88] = (i22 << 20) | i89;
                z2 = z;
                zzljVar = zzljVar2;
                i30 = i21;
                zzd = str;
                length = i72;
                iArr4 = iArr2;
                c = 55296;
            }
            zzlj zzljVar3 = zzljVar;
            return new zzkx<>(iArr4, objArr, i3, i7, zzljVar3.zza(), zzljVar3.zzb(), false, iArr, i6, i58, zzlbVar, zzkdVar, zzmfVar, zzizVar, zzkmVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzll zze(int i) {
        int i2 = (i / 3) << 1;
        zzll zzllVar = (zzll) this.zzd[i2];
        if (zzllVar != null) {
            return zzllVar;
        }
        zzll<T> zza2 = zzlh.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private static zzme zze(Object obj) {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar != zzme.zzc()) {
            return zzmeVar;
        }
        zzme zzd = zzme.zzd();
        zzjkVar.zzb = zzd;
        return zzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmf<UT, UB> zzmfVar, Object obj2) {
        zzjo zzd;
        int i2 = this.zzc[i];
        Object zze = zzmg.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(zze), zzd, (zzjo) ub, (zzmf<UT, zzjo>) zzmfVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjo zzjoVar, UB ub, zzmf<UT, UB> zzmfVar, Object obj) {
        zzkk<?, ?> zza2 = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjoVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmfVar.zzc(obj);
                }
                zzif zzc = zzia.zzc(zzkl.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzkl.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmfVar.zza((zzmf<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzll zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzkx<T>) t, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
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
    private final Object zza(T t, int i, int i2) {
        zzll zze = zze(i2);
        if (!zzc((zzkx<T>) t, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
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

    private zzkx(int[] iArr, Object[] objArr, int i, int i2, zzkt zzktVar, zzle zzleVar, boolean z, int[] iArr2, int i3, int i4, zzlb zzlbVar, zzkd zzkdVar, zzmf<?, ?> zzmfVar, zziz<?> zzizVar, zzkm zzkmVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzktVar instanceof zzjk;
        this.zzh = zzizVar != null && zzizVar.zza(zzktVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzlbVar;
        this.zzo = zzkdVar;
        this.zzp = zzmfVar;
        this.zzq = zzizVar;
        this.zzg = zzktVar;
        this.zzr = zzkmVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(T t) {
        if (zzg(t)) {
            if (t instanceof zzjk) {
                zzjk zzjkVar = (zzjk) t;
                zzjkVar.zzc(Integer.MAX_VALUE);
                zzjkVar.zza = 0;
                zzjkVar.zzcl();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzkx<T>) t, this.zzc[i], i)) {
                            zze(i).zzc(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzc((zzkx<T>) t, i)) {
                    zze(i).zzc(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza(t, j, zzmg.zza(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzb(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzd(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzd(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzd(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zzc(t, j, zzmg.zzh(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza(t, j, zzmg.zze(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza(t, j, zzmg.zze(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzd(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzc(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzkx<T>) t2, i)) {
                        zzmg.zza((Object) t, j, zzmg.zzd(t2, j));
                        zzb((zzkx<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzln.zza(this.zzr, t, t2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzkx<T>) t2, i2, i)) {
                        zzmg.zza(t, j, zzmg.zze(t2, j));
                        zzb((zzkx<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case RectListKt.BitOffsetForGesturable /* 62 */:
                case 63:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzc((zzkx<T>) t2, i2, i)) {
                        zzmg.zza(t, j, zzmg.zze(t2, j));
                        zzb((zzkx<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzln.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzln.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x05d3 A[Catch: all -> 0x05fa, TryCatch #13 {all -> 0x05fa, blocks: (B:38:0x05ce, B:40:0x05d3, B:41:0x05d8), top: B:37:0x05ce }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x05de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x060b A[LOOP:2: B:59:0x0607->B:61:0x060b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzli zzliVar, zzix zzixVar) throws IOException {
        zzkx<T> zzkxVar;
        T t2;
        Throwable th;
        int i;
        Object obj;
        T t3;
        zzli zzliVar2;
        zzix zzixVar2;
        T t4;
        Object zza2;
        List<Integer> zza3;
        zzjo zzd;
        Object obj2;
        zzmf zzmfVar;
        zzixVar.getClass();
        zzf(t);
        zzmf zzmfVar2 = this.zzp;
        zziz<?> zzizVar = this.zzq;
        Object obj3 = null;
        zzjd<?> zzjdVar = null;
        while (true) {
            try {
                int zzc = zzliVar.zzc();
                int zza4 = this.zza(zzc);
                if (zza4 < 0) {
                    if (zzc == Integer.MAX_VALUE) {
                        int i2 = this.zzl;
                        Object obj4 = obj3;
                        while (i2 < this.zzm) {
                            T t5 = t;
                            obj4 = this.zza((Object) t5, this.zzk[i2], (int) obj4, (zzmf<UT, int>) zzmfVar2, (Object) t);
                            i2++;
                            t = t5;
                        }
                        T t6 = t;
                        if (obj4 != null) {
                            zzmfVar2.zzb((Object) t6, (T) obj4);
                            return;
                        }
                        return;
                    }
                    T t7 = t;
                    try {
                        Object zza5 = !this.zzh ? null : zzizVar.zza(zzixVar, this.zzg, zzc);
                        if (zza5 != null) {
                            if (zzjdVar == null) {
                                try {
                                    zzjdVar = zzizVar.zzb(t7);
                                } catch (Throwable th2) {
                                    th = th2;
                                    t2 = t7;
                                    zzkxVar = this;
                                    obj = obj3;
                                    while (i < zzkxVar.zzm) {
                                    }
                                    if (obj == null) {
                                    }
                                }
                            }
                            zzjd<?> zzjdVar2 = zzjdVar;
                            zzmf zzmfVar3 = zzmfVar2;
                            zzli zzliVar3 = zzliVar;
                            zzix zzixVar3 = zzixVar;
                            try {
                                obj3 = zzizVar.zza(t7, zzliVar3, zza5, zzixVar3, zzjdVar2, obj3, zzmfVar3);
                                zzjdVar = zzjdVar2;
                                zzmfVar2 = zzmfVar3;
                                zzliVar2 = zzliVar3;
                                zzixVar2 = zzixVar3;
                                t2 = t7;
                            } catch (Throwable th3) {
                                th = th3;
                                t2 = t7;
                                zzmfVar2 = zzmfVar3;
                                th = th;
                                zzkxVar = this;
                                obj = obj3;
                                while (i < zzkxVar.zzm) {
                                }
                                if (obj == null) {
                                }
                            }
                        } else {
                            zzliVar2 = zzliVar;
                            zzixVar2 = zzixVar;
                            t2 = t7;
                            try {
                                zzmfVar2.zza(zzliVar2);
                                if (obj3 == null) {
                                    try {
                                        obj3 = zzmfVar2.zzc(t2);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        zzkxVar = this;
                                        obj = obj3;
                                        while (i < zzkxVar.zzm) {
                                        }
                                        if (obj == null) {
                                        }
                                    }
                                }
                                if (!zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                    Object obj5 = obj3;
                                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                                        obj5 = this.zza((Object) t2, this.zzk[i3], (int) obj5, (zzmf<UT, int>) zzmfVar2, (Object) t2);
                                    }
                                    if (obj5 != null) {
                                        zzmfVar2.zzb((Object) t2, (T) obj5);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        t3 = t7;
                        th = th;
                        zzkxVar = this;
                        t2 = t3;
                        obj = obj3;
                        for (i = zzkxVar.zzl; i < zzkxVar.zzm; i++) {
                            obj = zzkxVar.zza((Object) t2, zzkxVar.zzk[i], (int) obj, (zzmf<UT, int>) zzmfVar2, (Object) t2);
                        }
                        if (obj == null) {
                            zzmfVar2.zzb((Object) t2, (T) obj);
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    zzix zzixVar4 = zzixVar;
                    t3 = t;
                    zzliVar2 = zzliVar;
                    zzixVar2 = zzixVar4;
                    try {
                        int zzc2 = this.zzc(zza4);
                        switch ((267386880 & zzc2) >>> 20) {
                            case 0:
                                t2 = t3;
                                zzmg.zza(t2, zzc2 & 1048575, zzliVar2.zza());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 1:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzb());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 2:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzl());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 3:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzo());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 4:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzg());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 5:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzk());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 6:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzf());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 7:
                                t2 = t3;
                                zzmg.zzc(t2, zzc2 & 1048575, zzliVar2.zzs());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 8:
                                t2 = t3;
                                this.zza((Object) t2, zzc2, zzliVar2);
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 9:
                                t2 = t3;
                                zzkt zzktVar = (zzkt) this.zza((zzkx<T>) t2, zza4);
                                zzliVar2.zzb((zzli) zzktVar, (zzll<zzli>) this.zze(zza4), zzixVar2);
                                this.zza((zzkx<T>) t2, zza4, zzktVar);
                                break;
                            case 10:
                                t2 = t3;
                                zzmg.zza(t2, zzc2 & 1048575, zzliVar2.zzp());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 11:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzj());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 12:
                                t2 = t3;
                                int zze = zzliVar2.zze();
                                zzjo zzd2 = this.zzd(zza4);
                                if (zzd2 != null && !zzd2.zza(zze)) {
                                    obj3 = zzln.zza(t2, zzc, zze, obj3, zzmfVar2);
                                    break;
                                }
                                zzmg.zza((Object) t2, zzc2 & 1048575, zze);
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 13:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzh());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 14:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzm());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 15:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzi());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 16:
                                t2 = t3;
                                zzmg.zza((Object) t2, zzc2 & 1048575, zzliVar2.zzn());
                                this.zzb((zzkx<T>) t2, zza4);
                                break;
                            case 17:
                                t2 = t3;
                                zzkt zzktVar2 = (zzkt) this.zza((zzkx<T>) t2, zza4);
                                zzliVar2.zza((zzli) zzktVar2, (zzll<zzli>) this.zze(zza4), zzixVar2);
                                this.zza((zzkx<T>) t2, zza4, zzktVar2);
                                break;
                            case 18:
                                t2 = t3;
                                zzliVar2.zzc(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 19:
                                t2 = t3;
                                zzliVar2.zzg(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 20:
                                t2 = t3;
                                zzliVar2.zzi(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 21:
                                t2 = t3;
                                zzliVar2.zzq(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 22:
                                t2 = t3;
                                zzliVar2.zzh(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 23:
                                t2 = t3;
                                zzliVar2.zzf(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 24:
                                t2 = t3;
                                zzliVar2.zze(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 25:
                                t2 = t3;
                                zzliVar2.zza(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 26:
                                t2 = t3;
                                if (zzg(zzc2)) {
                                    zzliVar2.zzo(this.zzo.zza(t2, zzc2 & 1048575));
                                    break;
                                } else {
                                    zzliVar2.zzn(this.zzo.zza(t2, zzc2 & 1048575));
                                    break;
                                }
                            case 27:
                                t2 = t3;
                                zzliVar2.zzb((List) this.zzo.zza(t2, zzc2 & 1048575), (zzll) this.zze(zza4), zzixVar2);
                                break;
                            case 28:
                                t2 = t3;
                                zzliVar2.zzb(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                t2 = t3;
                                zzliVar2.zzp(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 30:
                                List<Integer> zza6 = this.zzo.zza(t3, zzc2 & 1048575);
                                zzliVar2.zzd(zza6);
                                zzjo zzd3 = this.zzd(zza4);
                                Object obj6 = obj3;
                                zzmf zzmfVar4 = zzmfVar2;
                                t4 = t3;
                                try {
                                    zza2 = zzln.zza(t4, zzc, zza6, zzd3, obj6, zzmfVar4);
                                    t2 = t4;
                                    zzmfVar2 = zzmfVar4;
                                    obj3 = zza2;
                                    break;
                                } catch (zzjv unused) {
                                    obj3 = obj6;
                                    zzmfVar2 = zzmfVar4;
                                    t2 = t4;
                                    zzkxVar = this;
                                    try {
                                        zzmfVar2.zza(zzliVar2);
                                        if (obj3 == null) {
                                        }
                                        if (zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th = th;
                                        obj = obj3;
                                        while (i < zzkxVar.zzm) {
                                        }
                                        if (obj == null) {
                                        }
                                    }
                                }
                                break;
                            case 31:
                                t2 = t3;
                                zzliVar2.zzj(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 32:
                                t2 = t3;
                                zzliVar2.zzk(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 33:
                                t2 = t3;
                                zzliVar2.zzl(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 34:
                                t2 = t3;
                                zzliVar2.zzm(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 35:
                                t2 = t3;
                                zzliVar2.zzc(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 36:
                                t2 = t3;
                                zzliVar2.zzg(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 37:
                                t2 = t3;
                                zzliVar2.zzi(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 38:
                                t2 = t3;
                                zzliVar2.zzq(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 39:
                                t2 = t3;
                                zzliVar2.zzh(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 40:
                                t2 = t3;
                                zzliVar2.zzf(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 41:
                                t2 = t3;
                                zzliVar2.zze(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 42:
                                t2 = t3;
                                zzliVar2.zza(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 43:
                                t2 = t3;
                                zzliVar2.zzp(this.zzo.zza(t2, zzc2 & 1048575));
                                break;
                            case 44:
                                try {
                                    zza3 = this.zzo.zza(t3, zzc2 & 1048575);
                                    zzliVar2.zzd(zza3);
                                    zzd = this.zzd(zza4);
                                    obj2 = obj3;
                                    zzmfVar = zzmfVar2;
                                    t4 = t3;
                                } catch (Throwable th8) {
                                    th = th8;
                                    t2 = t3;
                                }
                                try {
                                    try {
                                        zza2 = zzln.zza(t4, zzc, zza3, zzd, obj2, zzmfVar);
                                        t2 = t4;
                                        zzmfVar2 = zzmfVar;
                                        obj3 = zza2;
                                        break;
                                    } catch (zzjv unused2) {
                                        obj3 = obj2;
                                        zzmfVar2 = zzmfVar;
                                        t2 = t4;
                                        zzkxVar = this;
                                        zzmfVar2.zza(zzliVar2);
                                        if (obj3 == null) {
                                            obj3 = zzmfVar2.zzc(t2);
                                        }
                                        if (zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                            Object obj7 = obj3;
                                            for (int i4 = zzkxVar.zzl; i4 < zzkxVar.zzm; i4++) {
                                                obj7 = zzkxVar.zza((Object) t2, zzkxVar.zzk[i4], (int) obj7, (zzmf<UT, int>) zzmfVar2, (Object) t2);
                                            }
                                            if (obj7 != null) {
                                                zzmfVar2.zzb((Object) t2, (T) obj7);
                                                return;
                                            }
                                            return;
                                        }
                                        zzixVar = zzixVar2;
                                        this = zzkxVar;
                                        zzliVar = zzliVar2;
                                        t = t2;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    obj3 = obj2;
                                    zzmfVar2 = zzmfVar;
                                    t2 = t4;
                                    th = th;
                                    zzkxVar = this;
                                    obj = obj3;
                                    while (i < zzkxVar.zzm) {
                                    }
                                    if (obj == null) {
                                    }
                                }
                                break;
                            case 45:
                                zzliVar2.zzj(this.zzo.zza(t3, zzc2 & 1048575));
                                t2 = t3;
                                break;
                            case 46:
                                zzliVar2.zzk(this.zzo.zza(t3, zzc2 & 1048575));
                                t2 = t3;
                                break;
                            case 47:
                                zzliVar2.zzl(this.zzo.zza(t3, zzc2 & 1048575));
                                t2 = t3;
                                break;
                            case 48:
                                zzliVar2.zzm(this.zzo.zza(t3, zzc2 & 1048575));
                                t2 = t3;
                                break;
                            case 49:
                                zzliVar2.zza((List) this.zzo.zza(t3, zzc2 & 1048575), (zzll) this.zze(zza4), zzixVar2);
                                t2 = t3;
                                break;
                            case 50:
                                Object zzf = this.zzf(zza4);
                                long zzc3 = this.zzc(zza4) & 1048575;
                                Object zze2 = zzmg.zze(t3, zzc3);
                                if (zze2 == null) {
                                    zze2 = this.zzr.zzb(zzf);
                                    zzmg.zza(t3, zzc3, zze2);
                                } else if (this.zzr.zzf(zze2)) {
                                    Object zzb2 = this.zzr.zzb(zzf);
                                    this.zzr.zza(zzb2, zze2);
                                    zzmg.zza(t3, zzc3, zzb2);
                                    zze2 = zzb2;
                                }
                                zzliVar2.zza(this.zzr.zze(zze2), this.zzr.zza(zzf), zzixVar2);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzmg.zza(t3, zzc2 & 1048575, Double.valueOf(zzliVar2.zza()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                zzmg.zza(t3, zzc2 & 1048575, Float.valueOf(zzliVar2.zzb()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                zzmg.zza(t3, zzc2 & 1048575, Long.valueOf(zzliVar2.zzl()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                zzmg.zza(t3, zzc2 & 1048575, Long.valueOf(zzliVar2.zzo()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zzliVar2.zzg()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 56:
                                zzmg.zza(t3, zzc2 & 1048575, Long.valueOf(zzliVar2.zzk()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 57:
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zzliVar2.zzf()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 58:
                                zzmg.zza(t3, zzc2 & 1048575, Boolean.valueOf(zzliVar2.zzs()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 59:
                                this.zza((Object) t3, zzc2, zzliVar2);
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 60:
                                zzkt zzktVar3 = (zzkt) this.zza((zzkx<T>) t3, zzc, zza4);
                                zzliVar2.zzb((zzli) zzktVar3, (zzll<zzli>) this.zze(zza4), zzixVar2);
                                this.zza((zzkx<T>) t3, zzc, zza4, zzktVar3);
                                t2 = t3;
                                break;
                            case 61:
                                zzmg.zza(t3, zzc2 & 1048575, zzliVar2.zzp());
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case RectListKt.BitOffsetForGesturable /* 62 */:
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zzliVar2.zzj()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 63:
                                int zze3 = zzliVar2.zze();
                                zzjo zzd4 = this.zzd(zza4);
                                if (zzd4 != null && !zzd4.zza(zze3)) {
                                    obj3 = zzln.zza(t3, zzc, zze3, obj3, zzmfVar2);
                                    zzliVar = zzliVar2;
                                    t = t3;
                                    zzixVar = zzixVar2;
                                }
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zze3));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 64:
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zzliVar2.zzh()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                zzmg.zza(t3, zzc2 & 1048575, Long.valueOf(zzliVar2.zzm()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                zzmg.zza(t3, zzc2 & 1048575, Integer.valueOf(zzliVar2.zzi()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                zzmg.zza(t3, zzc2 & 1048575, Long.valueOf(zzliVar2.zzn()));
                                this.zzb((zzkx<T>) t3, zzc, zza4);
                                t2 = t3;
                                break;
                            case 68:
                                try {
                                    try {
                                        zzkt zzktVar4 = (zzkt) this.zza((zzkx<T>) t3, zzc, zza4);
                                        zzliVar2.zza((zzli) zzktVar4, (zzll<zzli>) this.zze(zza4), zzixVar2);
                                        this.zza((zzkx<T>) t3, zzc, zza4, zzktVar4);
                                        t2 = t3;
                                        break;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th = th;
                                        zzkxVar = this;
                                        t2 = t3;
                                        obj = obj3;
                                        while (i < zzkxVar.zzm) {
                                        }
                                        if (obj == null) {
                                        }
                                    }
                                } catch (zzjv unused3) {
                                    t2 = t3;
                                    zzkxVar = this;
                                    zzmfVar2.zza(zzliVar2);
                                    if (obj3 == null) {
                                    }
                                    if (zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                    }
                                }
                                break;
                            default:
                                t2 = t3;
                                if (obj3 == null) {
                                    try {
                                        obj3 = zzmfVar2.zzc(t2);
                                    } catch (zzjv unused4) {
                                        zzkxVar = this;
                                        zzmfVar2.zza(zzliVar2);
                                        if (obj3 == null) {
                                        }
                                        if (zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                        }
                                    }
                                }
                                try {
                                    if (!zzmfVar2.zza((zzmf) obj3, zzliVar2)) {
                                        Object obj8 = obj3;
                                        for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                            obj8 = this.zza((Object) t2, this.zzk[i5], (int) obj8, (zzmf<UT, int>) zzmfVar2, (Object) t2);
                                        }
                                        if (obj8 != null) {
                                            zzmfVar2.zzb((Object) t2, (T) obj8);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    zzkxVar = this;
                                    th = th;
                                    obj = obj3;
                                    while (i < zzkxVar.zzm) {
                                    }
                                    if (obj == null) {
                                    }
                                }
                                break;
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        zzkxVar = this;
                        t2 = t3;
                    }
                }
                zzixVar = zzixVar2;
                zzliVar = zzliVar2;
                t = t2;
            } catch (Throwable th13) {
                th = th13;
                zzkxVar = this;
                t2 = t;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t, byte[] bArr, int i, int i2, zzhv zzhvVar) throws IOException {
        zza((zzkx<T>) t, bArr, i, i2, 0, zzhvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzkx<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzll zze = zze(i);
            if (!zzc((zzkx<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzkx<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzkx<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzll zze = zze(i);
            if (!zzc((zzkx<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzkx<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzli zzliVar) throws IOException {
        if (zzg(i)) {
            zzmg.zza(obj, i & 1048575, zzliVar.zzr());
        } else if (this.zzi) {
            zzmg.zza(obj, i & 1048575, zzliVar.zzq());
        } else {
            zzmg.zza(obj, i & 1048575, zzliVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzmg.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zzmg.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzmg.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzkx<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzkx<T>) t, i, i2);
    }

    private final <K, V> void zza(zzna zznaVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznaVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzna zznaVar) throws IOException {
        if (obj instanceof String) {
            zznaVar.zza(i, (String) obj);
        } else {
            zznaVar.zza(i, (zzia) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a5f  */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzna zznaVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzkx<T> zzkxVar = this;
        int i6 = 267386880;
        int i7 = 1;
        int i8 = 1048575;
        if (zznaVar.zza() == 2) {
            zza(zzkxVar.zzp, t, zznaVar);
            if (zzkxVar.zzh) {
                zzjd<?> zza2 = zzkxVar.zzq.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzkxVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzkxVar.zzc(length2);
                        int i9 = zzkxVar.zzc[length2];
                        while (entry3 != null && zzkxVar.zzq.zza(entry3) > i9) {
                            zzkxVar.zzq.zza(zznaVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzb(i9, zzmg.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zze(i9, zzmg.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzc(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzb(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zzh(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zza(i9, zzmg.zze(t, zzc & 1048575), zznaVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzb(i9, zzmg.zze(t, zzc & 1048575), zzkxVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, (zzia) zzmg.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzf(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzd(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzc(i9, zzmg.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zze(i9, zzmg.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zzd(i9, zzmg.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzkxVar.zzc((zzkx<T>) t, length2)) {
                                    zznaVar.zza(i9, zzmg.zze(t, zzc & 1048575), zzkxVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzln.zzb(zzkxVar.zzc[length2], (List<Double>) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 19:
                                zzln.zzf(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 20:
                                zzln.zzh(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 21:
                                zzln.zzn(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 22:
                                zzln.zzg(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 23:
                                zzln.zze(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 24:
                                zzln.zzd(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 25:
                                zzln.zza(zzkxVar.zzc[length2], (List<Boolean>) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 26:
                                zzln.zzb(zzkxVar.zzc[length2], (List<String>) zzmg.zze(t, zzc & 1048575), zznaVar);
                                break;
                            case 27:
                                zzln.zzb(zzkxVar.zzc[length2], (List<?>) zzmg.zze(t, zzc & 1048575), zznaVar, zzkxVar.zze(length2));
                                break;
                            case 28:
                                zzln.zza(zzkxVar.zzc[length2], (List<zzia>) zzmg.zze(t, zzc & 1048575), zznaVar);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                zzln.zzm(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 30:
                                zzln.zzc(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 31:
                                zzln.zzi(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 32:
                                zzln.zzj(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 33:
                                zzln.zzk(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 34:
                                zzln.zzl(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, false);
                                break;
                            case 35:
                                zzln.zzb(zzkxVar.zzc[length2], (List<Double>) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 36:
                                zzln.zzf(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 37:
                                zzln.zzh(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 38:
                                zzln.zzn(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 39:
                                zzln.zzg(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 40:
                                zzln.zze(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 41:
                                zzln.zzd(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 42:
                                zzln.zza(zzkxVar.zzc[length2], (List<Boolean>) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 43:
                                zzln.zzm(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 44:
                                zzln.zzc(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 45:
                                zzln.zzi(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 46:
                                zzln.zzj(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 47:
                                zzln.zzk(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 48:
                                zzln.zzl(zzkxVar.zzc[length2], (List) zzmg.zze(t, zzc & 1048575), zznaVar, true);
                                break;
                            case 49:
                                zzln.zza(zzkxVar.zzc[length2], (List<?>) zzmg.zze(t, zzc & 1048575), zznaVar, zzkxVar.zze(length2));
                                break;
                            case 50:
                                zzkxVar.zza(zznaVar, i9, zzmg.zze(t, zzc & 1048575), length2);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzb(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zze(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzc(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzb(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zza(i9, zzmg.zze(t, zzc & 1048575), zznaVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzb(i9, zzmg.zze(t, zzc & 1048575), zzkxVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, (zzia) zzmg.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case RectListKt.BitOffsetForGesturable /* 62 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzf(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzd(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzc(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zze(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zzd(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzkxVar.zzc((zzkx<T>) t, i9, length2)) {
                                    zznaVar.zza(i9, zzmg.zze(t, zzc & 1048575), zzkxVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzkxVar.zzq.zza(zznaVar, entry3);
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
        if (zzkxVar.zzh) {
            zzjd<?> zza3 = zzkxVar.zzq.zza(t);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzkxVar.zzc.length;
                Unsafe unsafe = zzb;
                i = 0;
                int i10 = 0;
                int i11 = 1048575;
                while (i < length) {
                    int zzc2 = zzkxVar.zzc(i);
                    int i12 = i6;
                    int[] iArr = zzkxVar.zzc;
                    int i13 = iArr[i];
                    int i14 = (zzc2 & i12) >>> 20;
                    int i15 = i7;
                    if (i14 <= 17) {
                        int i16 = iArr[i + 2];
                        int i17 = i16 & i8;
                        if (i17 != i11) {
                            i10 = i17 == i8 ? 0 : unsafe.getInt(t, i17);
                            i11 = i17;
                        }
                        int i18 = i15 << (i16 >>> 20);
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = i18;
                    } else {
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = 0;
                    }
                    while (entry2 != null && zzkxVar.zzq.zza(entry2) <= i13) {
                        zzkxVar.zzq.zza(zznaVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j = zzc2 & i8;
                    switch (i14) {
                        case 0:
                            i5 = i15;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, zzmg.zza(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i19 = i15;
                            i5 = i19;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, zzmg.zzb(t, j));
                                i5 = i19;
                            }
                            zzkxVar = this;
                            break;
                        case 2:
                            int i20 = i15;
                            i5 = i20;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzb(i13, unsafe.getLong(t, j));
                                i5 = i20;
                            }
                            zzkxVar = this;
                            break;
                        case 3:
                            int i21 = i15;
                            i5 = i21;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zze(i13, unsafe.getLong(t, j));
                                i5 = i21;
                            }
                            zzkxVar = this;
                            break;
                        case 4:
                            int i22 = i15;
                            i5 = i22;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzc(i13, unsafe.getInt(t, j));
                                i5 = i22;
                            }
                            zzkxVar = this;
                            break;
                        case 5:
                            int i23 = i15;
                            i5 = i23;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, unsafe.getLong(t, j));
                                i5 = i23;
                            }
                            zzkxVar = this;
                            break;
                        case 6:
                            int i24 = i15;
                            i5 = i24;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzb(i13, unsafe.getInt(t, j));
                                i5 = i24;
                            }
                            zzkxVar = this;
                            break;
                        case 7:
                            int i25 = i15;
                            i5 = i25;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, zzmg.zzh(t, j));
                                i5 = i25;
                            }
                            zzkxVar = this;
                            break;
                        case 8:
                            int i26 = i15;
                            i5 = i26;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zza(i13, unsafe.getObject(t, j), zznaVar);
                                i5 = i26;
                            }
                            zzkxVar = this;
                            break;
                        case 9:
                            i5 = i15;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzb(i13, unsafe.getObject(t, j), zzkxVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i27 = i15;
                            i5 = i27;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, (zzia) unsafe.getObject(t, j));
                                i5 = i27;
                            }
                            zzkxVar = this;
                            break;
                        case 11:
                            int i28 = i15;
                            i5 = i28;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzf(i13, unsafe.getInt(t, j));
                                i5 = i28;
                            }
                            zzkxVar = this;
                            break;
                        case 12:
                            int i29 = i15;
                            i5 = i29;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, unsafe.getInt(t, j));
                                i5 = i29;
                            }
                            zzkxVar = this;
                            break;
                        case 13:
                            int i30 = i15;
                            i5 = i30;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzd(i13, unsafe.getInt(t, j));
                                i5 = i30;
                            }
                            zzkxVar = this;
                            break;
                        case 14:
                            int i31 = i15;
                            i5 = i31;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzc(i13, unsafe.getLong(t, j));
                                i5 = i31;
                            }
                            zzkxVar = this;
                            break;
                        case 15:
                            int i32 = i15;
                            i5 = i32;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zze(i13, unsafe.getInt(t, j));
                                i5 = i32;
                            }
                            zzkxVar = this;
                            break;
                        case 16:
                            int i33 = i15;
                            i5 = i33;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zzd(i13, unsafe.getLong(t, j));
                                i5 = i33;
                            }
                            zzkxVar = this;
                            break;
                        case 17:
                            i5 = i15;
                            if (zzkxVar.zza((zzkx<T>) t, i, i2, i3, i4)) {
                                zznaVar.zza(i13, unsafe.getObject(t, j), zzkxVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i5 = i15;
                            zzln.zzb(zzkxVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 19:
                            i5 = i15;
                            zzln.zzf(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 20:
                            i5 = i15;
                            zzln.zzh(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 21:
                            i5 = i15;
                            zzln.zzn(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 22:
                            i5 = i15;
                            zzln.zzg(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 23:
                            i5 = i15;
                            zzln.zze(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 24:
                            i5 = i15;
                            zzln.zzd(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 25:
                            i5 = i15;
                            zzln.zza(zzkxVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 26:
                            i5 = i15;
                            zzln.zzb(zzkxVar.zzc[i], (List<String>) unsafe.getObject(t, j), zznaVar);
                            break;
                        case 27:
                            i5 = i15;
                            zzln.zzb(zzkxVar.zzc[i], (List<?>) unsafe.getObject(t, j), zznaVar, zzkxVar.zze(i));
                            break;
                        case 28:
                            i5 = i15;
                            zzln.zza(zzkxVar.zzc[i], (List<zzia>) unsafe.getObject(t, j), zznaVar);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            i5 = i15;
                            zzln.zzm(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 30:
                            i5 = i15;
                            zzln.zzc(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 31:
                            i5 = i15;
                            zzln.zzi(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 32:
                            i5 = i15;
                            zzln.zzj(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 33:
                            i5 = i15;
                            zzln.zzk(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 34:
                            i5 = i15;
                            zzln.zzl(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, false);
                            break;
                        case 35:
                            boolean z = i15;
                            zzln.zzb(zzkxVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zznaVar, z);
                            i5 = z;
                            break;
                        case 36:
                            boolean z2 = i15;
                            zzln.zzf(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z2);
                            i5 = z2;
                            break;
                        case 37:
                            boolean z3 = i15;
                            zzln.zzh(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z3);
                            i5 = z3;
                            break;
                        case 38:
                            boolean z4 = i15;
                            zzln.zzn(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z4);
                            i5 = z4;
                            break;
                        case 39:
                            boolean z5 = i15;
                            zzln.zzg(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z5);
                            i5 = z5;
                            break;
                        case 40:
                            boolean z6 = i15;
                            zzln.zze(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z6);
                            i5 = z6;
                            break;
                        case 41:
                            boolean z7 = i15;
                            zzln.zzd(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z7);
                            i5 = z7;
                            break;
                        case 42:
                            boolean z8 = i15;
                            zzln.zza(zzkxVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zznaVar, z8);
                            i5 = z8;
                            break;
                        case 43:
                            boolean z9 = i15;
                            zzln.zzm(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z9);
                            i5 = z9;
                            break;
                        case 44:
                            boolean z10 = i15;
                            zzln.zzc(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z10);
                            i5 = z10;
                            break;
                        case 45:
                            boolean z11 = i15;
                            zzln.zzi(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z11);
                            i5 = z11;
                            break;
                        case 46:
                            boolean z12 = i15;
                            zzln.zzj(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z12);
                            i5 = z12;
                            break;
                        case 47:
                            boolean z13 = i15;
                            zzln.zzk(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z13);
                            i5 = z13;
                            break;
                        case 48:
                            boolean z14 = i15;
                            zzln.zzl(zzkxVar.zzc[i], (List) unsafe.getObject(t, j), zznaVar, z14);
                            i5 = z14;
                            break;
                        case 49:
                            zzln.zza(zzkxVar.zzc[i], (List<?>) unsafe.getObject(t, j), zznaVar, zzkxVar.zze(i));
                            i5 = i15;
                            break;
                        case 50:
                            zzkxVar.zza(zznaVar, i13, unsafe.getObject(t, j), i);
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, zza(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, zzb(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzb(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zze(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzc(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 56:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 57:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzb(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 58:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, zze(t, j));
                            }
                            i5 = i15;
                            break;
                        case 59:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zza(i13, unsafe.getObject(t, j), zznaVar);
                            }
                            i5 = i15;
                            break;
                        case 60:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzb(i13, unsafe.getObject(t, j), zzkxVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        case 61:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, (zzia) unsafe.getObject(t, j));
                            }
                            i5 = i15;
                            break;
                        case RectListKt.BitOffsetForGesturable /* 62 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzf(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 63:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 64:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzd(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzc(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zze(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zzd(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 68:
                            if (zzkxVar.zzc((zzkx<T>) t, i13, i)) {
                                zznaVar.zza(i13, unsafe.getObject(t, j), zzkxVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        default:
                            i5 = i15;
                            break;
                    }
                    i += 3;
                    i10 = i3;
                    it = it3;
                    i8 = 1048575;
                    i11 = i2;
                    entry = entry2;
                    i6 = i12;
                    i7 = i5;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzkxVar.zzq.zza(zznaVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzkxVar.zzp, t, zznaVar);
            }
        }
        entry = null;
        it = null;
        length = zzkxVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i102 = 0;
        int i112 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzkxVar.zzp, t, zznaVar);
    }

    private static <UT, UB> void zza(zzmf<UT, UB> zzmfVar, T t, zzna zznaVar) throws IOException {
        zzmfVar.zzb((zzmf<UT, UB>) zzmfVar.zzd(t), zznaVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzkx<T>) t, i) == zzc((zzkx<T>) t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzc = zzc(i);
                long j = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z = zzln.zza(zzmg.zze(t, j), zzmg.zze(t2, j));
                        break;
                    case 50:
                        z = zzln.zza(zzmg.zze(t, j), zzmg.zze(t2, j));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case RectListKt.BitOffsetForGesturable /* 62 */:
                    case 63:
                    case 64:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    case 68:
                        long zzb2 = zzb(i) & 1048575;
                        if (zzmg.zzc(t, zzb2) == zzmg.zzc(t2, zzb2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzp.zzd(t).equals(this.zzp.zzd(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t).equals(this.zzq.zza(t2));
                }
                return true;
            }
        }
    }

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return ((1 << (zzb2 >>> 20)) & zzmg.zzc(t, j)) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmg.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmg.zzb(t, j2)) != 0;
            case 2:
                return zzmg.zzd(t, j2) != 0;
            case 3:
                return zzmg.zzd(t, j2) != 0;
            case 4:
                return zzmg.zzc(t, j2) != 0;
            case 5:
                return zzmg.zzd(t, j2) != 0;
            case 6:
                return zzmg.zzc(t, j2) != 0;
            case 7:
                return zzmg.zzh(t, j2);
            case 8:
                Object zze = zzmg.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzia) {
                    return !zzia.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmg.zze(t, j2) != null;
            case 10:
                return !zzia.zza.equals(zzmg.zze(t, j2));
            case 11:
                return zzmg.zzc(t, j2) != 0;
            case 12:
                return zzmg.zzc(t, j2) != 0;
            case 13:
                return zzmg.zzc(t, j2) != 0;
            case 14:
                return zzmg.zzd(t, j2) != 0;
            case 15:
                return zzmg.zzc(t, j2) != 0;
            case 16:
                return zzmg.zzd(t, j2) != 0;
            case 17:
                return zzmg.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzkx<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [com.google.android.gms.internal.measurement.zzll] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.google.android.gms.internal.measurement.zzll] */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final boolean zzd(T t) {
        int i;
        int i2;
        zzkx<T> zzkxVar;
        T t2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzc = this.zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(t, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & zzc) != 0) {
                zzkxVar = this;
                t2 = t;
                if (!zzkxVar.zza((zzkx<T>) t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzkxVar = this;
                t2 = t;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zzkxVar.zza((zzkx<T>) t2, i6, i, i2, i10) && !zza((Object) t2, zzc, zzkxVar.zze(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzkxVar.zzc((zzkx<T>) t2, i7, i6) && !zza((Object) t2, zzc, zzkxVar.zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzkxVar.zzr.zzd(zzmg.zze(t2, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzkxVar.zzr.zza(zzkxVar.zzf(i6)).zzc.zzb() == zzmx.MESSAGE) {
                                ?? r15 = 0;
                                for (Object obj : zzd.values()) {
                                    r15 = r15;
                                    if (r15 == 0) {
                                        r15 = zzlh.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r15.zzd(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzmg.zze(t2, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zzkxVar.zze(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zze.zzd(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i4++;
            this = zzkxVar;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        zzkx<T> zzkxVar2 = this;
        return !zzkxVar2.zzh || zzkxVar2.zzq.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzll zzllVar) {
        return zzllVar.zzd(zzmg.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjk) {
            return ((zzjk) obj).zzcn();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzmg.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzmg.zze(t, j)).booleanValue();
    }
}
