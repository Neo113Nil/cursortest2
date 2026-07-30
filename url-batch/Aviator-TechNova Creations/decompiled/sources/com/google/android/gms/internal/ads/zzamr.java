package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzamr implements zzamf {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzamk zzg;
    private final zzamj zzh;
    private final zzamq zzi;
    private Bitmap zzj;

    public zzamr(List list) {
        zzer zzerVar = new zzer((byte[]) list.get(0));
        int zzt = zzerVar.zzt();
        int zzt2 = zzerVar.zzt();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzamk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzamj(0, zzd(), zze(), zzf());
        this.zzi = new zzamq(zzt, zzt2);
    }

    private static zzamj zzb(zzeq zzeqVar, int i) {
        int zzj;
        int zzj2;
        int i2;
        int i3;
        int i4 = 8;
        int zzj3 = zzeqVar.zzj(8);
        zzeqVar.zzh(8);
        int[] zzd = zzd();
        int[] zze = zze();
        int[] zzf = zzf();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzj4 = zzeqVar.zzj(i4);
            int zzj5 = zzeqVar.zzj(i4);
            int[] iArr = (zzj5 & 128) != 0 ? zzd : (zzj5 & 64) != 0 ? zze : zzf;
            if ((zzj5 & 1) != 0) {
                i2 = zzeqVar.zzj(i4);
                i3 = zzeqVar.zzj(i4);
                zzj = zzeqVar.zzj(i4);
                zzj2 = zzeqVar.zzj(i4);
                i5 -= 6;
            } else {
                int zzj6 = zzeqVar.zzj(6) << 2;
                int zzj7 = zzeqVar.zzj(4) << 4;
                i5 -= 4;
                zzj = zzeqVar.zzj(4) << 4;
                zzj2 = zzeqVar.zzj(2) << 6;
                i2 = zzj6;
                i3 = zzj7;
            }
            if (i2 == 0) {
                zzj2 = 255;
            }
            if (i2 == 0) {
                zzj = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            double d = i2;
            String str = zzfj.zza;
            double d2 = i3 - 128;
            double d3 = zzj - 128;
            iArr[zzj4] = zzg((byte) (255 - (zzj2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzj3 = zzj3;
            i4 = 8;
        }
        return new zzamj(zzj3, zzd, zze, zzf);
    }

    private static zzaml zzc(zzeq zzeqVar) {
        byte[] bArr;
        int zzj = zzeqVar.zzj(16);
        zzeqVar.zzh(4);
        int zzj2 = zzeqVar.zzj(2);
        boolean zzi = zzeqVar.zzi();
        zzeqVar.zzh(1);
        byte[] bArr2 = zzfj.zzb;
        if (zzj2 == 1) {
            zzeqVar.zzh(zzeqVar.zzj(8) * 16);
        } else if (zzj2 == 0) {
            int zzj3 = zzeqVar.zzj(16);
            int zzj4 = zzeqVar.zzj(16);
            if (zzj3 > 0) {
                bArr2 = new byte[zzj3];
                zzeqVar.zzn(bArr2, 0, zzj3);
            }
            if (zzj4 > 0) {
                bArr = new byte[zzj4];
                zzeqVar.zzn(bArr, 0, zzj4);
                return new zzaml(zzj, zzi, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new zzaml(zzj, zzi, bArr2, bArr);
    }

    private static int[] zzd() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zze() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = zzg(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] zzf() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = zzg(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Opcodes.L2I;
                int i4 = Opcodes.TABLESWITCH;
                if (i3 == 0) {
                    int i5 = i2 & 16;
                    int i6 = i2 & 32;
                    int i7 = i2 & 2;
                    int i8 = i2 & 64;
                    int i9 = i2 & 4;
                    int i10 = 1 != (i2 & 1) ? 0 : 85;
                    int i11 = i5 != 0 ? 170 : 0;
                    int i12 = i7 != 0 ? 85 : 0;
                    int i13 = i6 != 0 ? 170 : 0;
                    i = i9 == 0 ? 0 : 85;
                    if (i8 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzg(255, i10 + i11, i12 + i13, i + i4);
                } else if (i3 == 8) {
                    int i14 = i2 & 16;
                    int i15 = i2 & 32;
                    int i16 = i2 & 2;
                    int i17 = i2 & 64;
                    int i18 = i2 & 4;
                    int i19 = 1 != (i2 & 1) ? 0 : 85;
                    int i20 = i14 != 0 ? 170 : 0;
                    int i21 = i16 != 0 ? 85 : 0;
                    int i22 = i15 != 0 ? 170 : 0;
                    i = i18 == 0 ? 0 : 85;
                    if (i17 == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = zzg(127, i19 + i20, i21 + i22, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = zzg(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int zzg(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[LOOP:3: B:85:0x0163->B:98:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzh(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        int zzj;
        char c;
        int i5;
        int i6;
        int i7;
        int zzj2;
        int i8;
        int i9;
        boolean z;
        int zzj3;
        int zzj4;
        int i10;
        int i11;
        int i12;
        int zzj5;
        int i13;
        Paint paint2 = paint;
        zzeq zzeqVar = new zzeq(bArr, bArr.length);
        int i14 = i2;
        int i15 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzeqVar.zzc() != 0) {
            int zzj6 = zzeqVar.zzj(8);
            if (zzj6 != 240) {
                int i16 = 4;
                int i17 = 1;
                int i18 = 2;
                switch (zzj6) {
                    case 16:
                        int i19 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i4 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                                paint2 = paint;
                                i4 = i5;
                                i19 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i4 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                    i7 = i19;
                                    i6 = zzj;
                                } else {
                                    if (zzeqVar.zzi()) {
                                        zzj2 = zzeqVar.zzj(3) + 3;
                                        i6 = zzeqVar.zzj(2);
                                    } else {
                                        if (zzeqVar.zzi()) {
                                            i7 = i19;
                                            i5 = i4;
                                            i6 = 0;
                                        } else {
                                            int zzj7 = zzeqVar.zzj(2);
                                            if (zzj7 == 0) {
                                                c = 4;
                                                i5 = i19;
                                                i6 = 0;
                                                i7 = 0;
                                            } else if (zzj7 == i19) {
                                                c = 4;
                                                i5 = i4;
                                                i7 = 2;
                                                i6 = 0;
                                            } else if (zzj7 == 2) {
                                                c = 4;
                                                i5 = i4;
                                                i7 = zzeqVar.zzj(4) + 12;
                                                i6 = zzeqVar.zzj(2);
                                            } else if (zzj7 != 3) {
                                                i5 = i4;
                                                i6 = 0;
                                                i7 = 0;
                                            } else {
                                                zzj2 = zzeqVar.zzj(8) + 29;
                                                i6 = zzeqVar.zzj(2);
                                            }
                                            if (i7 != 0 || paint2 == null) {
                                                i8 = i14;
                                            } else {
                                                int i20 = i15 + 1;
                                                float f = i15;
                                                if (bArr2 != 0) {
                                                    i6 = bArr2[i6];
                                                }
                                                paint2.setColor(iArr[i6]);
                                                i8 = i14;
                                                canvas.drawRect(i14, f, i14 + i7, i20, paint2);
                                            }
                                            i14 = i8 + i7;
                                            if (i5 != 0) {
                                                zzeqVar.zzm();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                i4 = i5;
                                                i19 = 1;
                                            }
                                        }
                                        c = 4;
                                        if (i7 != 0) {
                                        }
                                        i8 = i14;
                                        i14 = i8 + i7;
                                        if (i5 != 0) {
                                        }
                                    }
                                    i7 = zzj2;
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i4 = 0;
                            while (true) {
                                zzj = zzeqVar.zzj(2);
                                if (zzj != 0) {
                                }
                                i5 = i4;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i8 = i14;
                                i14 = i8 + i7;
                                if (i5 != 0) {
                                }
                                paint2 = paint;
                                i4 = i5;
                                i19 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        boolean z2 = false;
                        while (true) {
                            int zzj8 = zzeqVar.zzj(i16);
                            if (zzj8 != 0) {
                                i9 = 1;
                                z = z2;
                            } else if (zzeqVar.zzi()) {
                                if (zzeqVar.zzi()) {
                                    int zzj9 = zzeqVar.zzj(i18);
                                    if (zzj9 == 0) {
                                        i9 = 1;
                                        z = z2;
                                        zzj8 = 0;
                                    } else if (zzj9 == 1) {
                                        z = z2;
                                        i9 = i18;
                                        zzj8 = 0;
                                    } else if (zzj9 == i18) {
                                        zzj3 = zzeqVar.zzj(i16) + 9;
                                        zzj4 = zzeqVar.zzj(i16);
                                    } else if (zzj9 != 3) {
                                        z = z2;
                                        zzj8 = 0;
                                        i9 = 0;
                                    } else {
                                        zzj3 = zzeqVar.zzj(8) + 25;
                                        zzj4 = zzeqVar.zzj(i16);
                                    }
                                } else {
                                    zzj3 = zzeqVar.zzj(i18) + i16;
                                    zzj4 = zzeqVar.zzj(i16);
                                }
                                i9 = zzj3;
                                z = z2;
                                zzj8 = zzj4;
                            } else {
                                int zzj10 = zzeqVar.zzj(3);
                                if (zzj10 != 0) {
                                    i9 = zzj10 + 2;
                                    z = z2;
                                    zzj8 = 0;
                                } else {
                                    z = true;
                                    zzj8 = 0;
                                    i9 = 0;
                                }
                            }
                            if (i9 == 0 || paint2 == null) {
                                i10 = i14;
                                i11 = i18;
                            } else {
                                int i21 = i15 + 1;
                                float f2 = i15;
                                if (bArr7 != 0) {
                                    zzj8 = bArr7[zzj8];
                                }
                                paint2.setColor(iArr[zzj8]);
                                i10 = i14;
                                i11 = 2;
                                canvas.drawRect(i14, f2, i14 + i9, i21, paint2);
                            }
                            i14 = i10 + i9;
                            if (z) {
                                zzeqVar.zzm();
                                continue;
                            } else {
                                i18 = i11;
                                z2 = z;
                                i16 = 4;
                            }
                        }
                    case 18:
                        int i22 = i14;
                        int i23 = 0;
                        while (true) {
                            int zzj11 = zzeqVar.zzj(8);
                            if (zzj11 != 0) {
                                i12 = i23;
                                zzj5 = i17;
                            } else if (zzeqVar.zzi()) {
                                i12 = i23;
                                zzj5 = zzeqVar.zzj(7);
                                zzj11 = zzeqVar.zzj(8);
                            } else {
                                int zzj12 = zzeqVar.zzj(7);
                                if (zzj12 != 0) {
                                    i12 = i23;
                                    zzj5 = zzj12;
                                    zzj11 = 0;
                                } else {
                                    i12 = i17;
                                    zzj11 = 0;
                                    zzj5 = 0;
                                }
                            }
                            if (zzj5 == 0 || paint2 == null) {
                                i13 = i17;
                            } else {
                                paint2.setColor(iArr[zzj11]);
                                i13 = i17;
                                canvas.drawRect(i22, i15, i22 + zzj5, i15 + 1, paint2);
                            }
                            i22 += zzj5;
                            if (i12 == 0) {
                                i17 = i13;
                                i23 = i12;
                            } else {
                                i14 = i22;
                                continue;
                            }
                        }
                    default:
                        switch (zzj6) {
                            case 32:
                                bArr6 = zzi(4, 4, zzeqVar);
                                break;
                            case 33:
                                bArr4 = zzi(4, 8, zzeqVar);
                                break;
                            case 34:
                                bArr5 = zzi(16, 8, zzeqVar);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i15 += 2;
                i14 = i2;
            }
            paint2 = paint;
        }
    }

    private static byte[] zzi(int i, int i2, zzeq zzeqVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzeqVar.zzj(i2);
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        boolean z;
        zzalx zzalxVar;
        Canvas canvas;
        char c;
        char c2;
        char c3;
        int i3;
        zzamq zzamqVar;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        zzamo zzamoVar;
        int zzj;
        int zzj2;
        int i7;
        int i8;
        int i9;
        int i10;
        zzeq zzeqVar = new zzeq(bArr, i + i2);
        zzeqVar.zzf(i);
        while (true) {
            z = true;
            if (zzeqVar.zzc() >= 48 && zzeqVar.zzj(8) == 15) {
                zzamq zzamqVar2 = this.zzi;
                int zzj3 = zzeqVar.zzj(8);
                int zzj4 = zzeqVar.zzj(16);
                int zzj5 = zzeqVar.zzj(16);
                int zze = zzeqVar.zze() + zzj5;
                if (zzj5 * 8 > zzeqVar.zzc()) {
                    zzee.zzc("DvbParser", "Data field length exceeds limit");
                    zzeqVar.zzh(zzeqVar.zzc());
                } else {
                    switch (zzj3) {
                        case 16:
                            if (zzj4 == zzamqVar2.zza) {
                                zzamm zzammVar = zzamqVar2.zzi;
                                int zzj6 = zzeqVar.zzj(8);
                                int zzj7 = zzeqVar.zzj(4);
                                int zzj8 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                SparseArray sparseArray = new SparseArray();
                                for (int i11 = zzj5 - 2; i11 > 0; i11 -= 6) {
                                    int zzj9 = zzeqVar.zzj(8);
                                    zzeqVar.zzh(8);
                                    sparseArray.put(zzj9, new zzamn(zzeqVar.zzj(16), zzeqVar.zzj(16)));
                                }
                                zzamm zzammVar2 = new zzamm(zzj6, zzj7, zzj8, sparseArray);
                                if (zzammVar2.zzb != 0) {
                                    zzamqVar2.zzi = zzammVar2;
                                    zzamqVar2.zzc.clear();
                                    zzamqVar2.zzd.clear();
                                    zzamqVar2.zze.clear();
                                    break;
                                } else if (zzammVar != null) {
                                    if (zzammVar.zza != zzammVar2.zza) {
                                        zzamqVar2.zzi = zzammVar2;
                                        break;
                                    }
                                }
                            }
                            break;
                        case 17:
                            zzamm zzammVar3 = zzamqVar2.zzi;
                            if (zzj4 == zzamqVar2.zza && zzammVar3 != null) {
                                int zzj10 = zzeqVar.zzj(8);
                                zzeqVar.zzh(4);
                                boolean zzi = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int zzj11 = zzeqVar.zzj(16);
                                int zzj12 = zzeqVar.zzj(16);
                                int zzj13 = zzeqVar.zzj(3);
                                int zzj14 = zzeqVar.zzj(3);
                                zzeqVar.zzh(2);
                                int zzj15 = zzeqVar.zzj(8);
                                int zzj16 = zzeqVar.zzj(8);
                                int zzj17 = zzeqVar.zzj(4);
                                int zzj18 = zzeqVar.zzj(2);
                                zzeqVar.zzh(2);
                                int i12 = zzj5 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i12 > 0) {
                                    int zzj19 = zzeqVar.zzj(16);
                                    int zzj20 = zzeqVar.zzj(2);
                                    int zzj21 = zzeqVar.zzj(2);
                                    int zzj22 = zzeqVar.zzj(12);
                                    zzeqVar.zzh(4);
                                    int zzj23 = zzeqVar.zzj(12);
                                    int i13 = i12 - 6;
                                    if (zzj20 != 1) {
                                        if (zzj20 == 2) {
                                            zzj20 = 2;
                                        } else {
                                            i12 = i13;
                                            zzj = 0;
                                            zzj2 = 0;
                                            sparseArray2.put(zzj19, new zzamp(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                        }
                                    }
                                    i12 -= 8;
                                    zzj = zzeqVar.zzj(8);
                                    zzj2 = zzeqVar.zzj(8);
                                    sparseArray2.put(zzj19, new zzamp(zzj20, zzj21, zzj22, zzj23, zzj, zzj2));
                                }
                                zzamo zzamoVar2 = new zzamo(zzj10, zzi, zzj11, zzj12, zzj13, zzj14, zzj15, zzj16, zzj17, zzj18, sparseArray2);
                                if (zzammVar3.zzb == 0 && (zzamoVar = (zzamo) zzamqVar2.zzc.get(zzamoVar2.zza)) != null) {
                                    int i14 = 0;
                                    while (true) {
                                        SparseArray sparseArray3 = zzamoVar.zzj;
                                        if (i14 < sparseArray3.size()) {
                                            zzamoVar2.zzj.put(sparseArray3.keyAt(i14), (zzamp) sparseArray3.valueAt(i14));
                                            i14++;
                                        }
                                    }
                                }
                                zzamqVar2.zzc.put(zzamoVar2.zza, zzamoVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (zzj4 == zzamqVar2.zza) {
                                zzamj zzb2 = zzb(zzeqVar, zzj5);
                                zzamqVar2.zzd.put(zzb2.zza, zzb2);
                                break;
                            } else if (zzj4 == zzamqVar2.zzb) {
                                zzamj zzb3 = zzb(zzeqVar, zzj5);
                                zzamqVar2.zzf.put(zzb3.zza, zzb3);
                                break;
                            }
                            break;
                        case 19:
                            if (zzj4 == zzamqVar2.zza) {
                                zzaml zzc2 = zzc(zzeqVar);
                                zzamqVar2.zze.put(zzc2.zza, zzc2);
                                break;
                            } else if (zzj4 == zzamqVar2.zzb) {
                                zzaml zzc3 = zzc(zzeqVar);
                                zzamqVar2.zzg.put(zzc3.zza, zzc3);
                                break;
                            }
                            break;
                        case 20:
                            if (zzj4 == zzamqVar2.zza) {
                                zzeqVar.zzh(4);
                                boolean zzi2 = zzeqVar.zzi();
                                zzeqVar.zzh(3);
                                int zzj24 = zzeqVar.zzj(16);
                                int zzj25 = zzeqVar.zzj(16);
                                if (zzi2) {
                                    int zzj26 = zzeqVar.zzj(16);
                                    i7 = zzeqVar.zzj(16);
                                    i10 = zzeqVar.zzj(16);
                                    i8 = zzeqVar.zzj(16);
                                    i9 = zzj26;
                                } else {
                                    i7 = zzj24;
                                    i8 = zzj25;
                                    i9 = 0;
                                    i10 = 0;
                                }
                                zzamqVar2.zzh = new zzamk(zzj24, zzj25, i9, i7, i10, i8);
                                break;
                            }
                            break;
                    }
                    zzeqVar.zzo(zze - zzeqVar.zze());
                }
            }
        }
        zzamq zzamqVar3 = this.zzi;
        zzamm zzammVar4 = zzamqVar3.zzi;
        if (zzammVar4 == null) {
            zzalxVar = new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzamk zzamkVar = zzamqVar3.zzh;
            if (zzamkVar == null) {
                zzamkVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzamkVar.zza + 1 != bitmap.getWidth() || zzamkVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzamkVar.zza + 1, zzamkVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzammVar4.zzc;
            int i15 = 0;
            while (i15 < sparseArray4.size()) {
                Canvas canvas3 = this.zzf;
                canvas3.save();
                zzamn zzamnVar = (zzamn) sparseArray4.valueAt(i15);
                zzamo zzamoVar3 = (zzamo) zzamqVar3.zzc.get(sparseArray4.keyAt(i15));
                int i16 = zzamnVar.zza + zzamkVar.zzc;
                int i17 = zzamnVar.zzb + zzamkVar.zze;
                int i18 = zzamoVar3.zzc;
                int i19 = i16 + i18;
                boolean z2 = z;
                int min = Math.min(i19, zzamkVar.zzd);
                int i20 = zzamoVar3.zzd;
                int i21 = i17 + i20;
                canvas3.clipRect(i16, i17, min, Math.min(i21, zzamkVar.zzf));
                int i22 = zzamoVar3.zzf;
                zzamj zzamjVar = (zzamj) zzamqVar3.zzd.get(i22);
                if (zzamjVar == null && (zzamjVar = (zzamj) zzamqVar3.zzf.get(i22)) == null) {
                    zzamjVar = this.zzh;
                }
                SparseArray sparseArray5 = zzamoVar3.zzj;
                SparseArray sparseArray6 = sparseArray4;
                int i23 = i15;
                int i24 = 0;
                while (i24 < sparseArray5.size()) {
                    int keyAt = sparseArray5.keyAt(i24);
                    int i25 = i24;
                    zzamp zzampVar = (zzamp) sparseArray5.valueAt(i24);
                    SparseArray sparseArray7 = sparseArray5;
                    zzaml zzamlVar = (zzaml) zzamqVar3.zze.get(keyAt);
                    if (zzamlVar == null) {
                        zzamlVar = (zzaml) zzamqVar3.zzg.get(keyAt);
                    }
                    if (zzamlVar != null) {
                        Paint paint = zzamlVar.zzb ? null : this.zzd;
                        i5 = i18;
                        int i26 = zzamoVar3.zze;
                        zzamqVar = zzamqVar3;
                        int i27 = zzampVar.zza + i16;
                        int i28 = i17 + zzampVar.zzb;
                        canvas2 = canvas3;
                        i4 = i16;
                        int[] iArr = i26 == 3 ? zzamjVar.zzd : i26 == 2 ? zzamjVar.zzc : zzamjVar.zzb;
                        i6 = i19;
                        zzh(zzamlVar.zzc, iArr, i26, i27, i28, paint, canvas2);
                        zzh(zzamlVar.zzd, iArr, i26, i27, i28 + 1, paint, canvas2);
                    } else {
                        zzamqVar = zzamqVar3;
                        canvas2 = canvas3;
                        i4 = i16;
                        i5 = i18;
                        i6 = i19;
                    }
                    i16 = i4;
                    i19 = i6;
                    i24 = i25 + 1;
                    i18 = i5;
                    canvas3 = canvas2;
                    sparseArray5 = sparseArray7;
                    zzamqVar3 = zzamqVar;
                }
                zzamq zzamqVar4 = zzamqVar3;
                Canvas canvas4 = canvas3;
                int i29 = i16;
                int i30 = i18;
                int i31 = i19;
                float f = i17;
                float f2 = i29;
                if (zzamoVar3.zzb) {
                    int i32 = zzamoVar3.zze;
                    if (i32 == 3) {
                        i3 = zzamjVar.zzd[zzamoVar3.zzg];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i32 == 2 ? zzamjVar.zzc[zzamoVar3.zzh] : zzamjVar.zzb[zzamoVar3.zzi];
                    }
                    Paint paint2 = this.zze;
                    paint2.setColor(i3);
                    float f3 = i31;
                    c2 = c3;
                    c = 3;
                    canvas = canvas4;
                    canvas.drawRect(f2, f, f3, i21, paint2);
                } else {
                    canvas = canvas4;
                    c = 3;
                    c2 = 2;
                }
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(Bitmap.createBitmap(this.zzj, i29, i17, i30, i20));
                float f4 = zzamkVar.zza;
                zzcwVar.zzi(f2 / f4);
                zzcwVar.zzj(0);
                float f5 = zzamkVar.zzb;
                zzcwVar.zzf(f / f5, 0);
                zzcwVar.zzg(0);
                zzcwVar.zzm(i30 / f4);
                zzcwVar.zzn(i20 / f5);
                arrayList.add(zzcwVar.zzr());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i15 = i23 + 1;
                z = z2;
                zzamqVar3 = zzamqVar4;
                sparseArray4 = sparseArray6;
            }
            zzalxVar = new zzalx(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdrVar.zza(zzalxVar);
    }
}
