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
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzakn implements zzaka {
    private static final byte[] zza = {0, 7, 8, Ascii.SI};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakg zzg;
    private final zzakf zzh;
    private final zzakm zzi;
    private Bitmap zzj;

    public zzakn(List list) {
        zzek zzekVar = new zzek((byte[]) list.get(0));
        int zzq = zzekVar.zzq();
        int zzq2 = zzekVar.zzq();
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
        this.zzg = new zzakg(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakf(0, zzh(), zzi(), zzj());
        this.zzi = new zzakm(zzq, zzq2);
    }

    private static int zzc(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzakf zzd(zzej zzejVar, int i) {
        int zzd;
        int zzd2;
        int i2;
        int i3;
        int i4 = 8;
        int zzd3 = zzejVar.zzd(8);
        zzejVar.zzn(8);
        int[] zzh = zzh();
        int[] zzi = zzi();
        int[] zzj = zzj();
        int i5 = i - 2;
        while (i5 > 0) {
            int zzd4 = zzejVar.zzd(i4);
            int zzd5 = zzejVar.zzd(i4);
            int[] iArr = (zzd5 & 128) != 0 ? zzh : (zzd5 & 64) != 0 ? zzi : zzj;
            if ((zzd5 & 1) != 0) {
                i2 = zzejVar.zzd(i4);
                i3 = zzejVar.zzd(i4);
                zzd = zzejVar.zzd(i4);
                zzd2 = zzejVar.zzd(i4);
                i5 -= 6;
            } else {
                int zzd6 = zzejVar.zzd(6) << 2;
                int zzd7 = zzejVar.zzd(4) << 4;
                i5 -= 4;
                zzd = zzejVar.zzd(4) << 4;
                zzd2 = zzejVar.zzd(2) << 6;
                i2 = zzd6;
                i3 = zzd7;
            }
            if (i2 == 0) {
                zzd2 = 255;
            }
            if (i2 == 0) {
                zzd = 0;
            }
            if (i2 == 0) {
                i3 = 0;
            }
            double d = i2;
            double d2 = i3 - 128;
            double d3 = zzd - 128;
            iArr[zzd4] = zzc((byte) (255 - (zzd2 & 255)), Math.max(0, Math.min((int) (d + (1.402d * d2)), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)));
            zzd3 = zzd3;
            i4 = 8;
        }
        return new zzakf(zzd3, zzh, zzi, zzj);
    }

    private static zzakh zze(zzej zzejVar) {
        int zzd = zzejVar.zzd(16);
        zzejVar.zzn(4);
        int zzd2 = zzejVar.zzd(2);
        boolean zzp = zzejVar.zzp();
        zzejVar.zzn(1);
        byte[] bArr = zzet.zzf;
        byte[] bArr2 = zzet.zzf;
        if (zzd2 == 1) {
            zzejVar.zzn(zzejVar.zzd(8) * 16);
        } else if (zzd2 == 0) {
            int zzd3 = zzejVar.zzd(16);
            int zzd4 = zzejVar.zzd(16);
            if (zzd3 > 0) {
                bArr = new byte[zzd3];
                zzejVar.zzi(bArr, 0, zzd3);
            }
            if (zzd4 > 0) {
                bArr2 = new byte[zzd4];
                zzejVar.zzi(bArr2, 0, zzd4);
            } else {
                bArr2 = bArr;
            }
        }
        return new zzakh(zzd, zzp, bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224 A[LOOP:3: B:88:0x016c->B:100:0x0224, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148 A[LOOP:2: B:41:0x00ac->B:53:0x0148, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzf(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int zzd;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        int zzd2;
        int zzd3;
        int i8;
        boolean z4;
        int zzd4;
        zzej zzejVar = new zzej(bArr, bArr.length);
        int i9 = i2;
        int i10 = i3;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzejVar.zza() != 0) {
            int i11 = 8;
            int zzd5 = zzejVar.zzd(8);
            if (zzd5 != 240) {
                int i12 = 4;
                int i13 = 2;
                switch (zzd5) {
                    case 16:
                        int i14 = 1;
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = zza;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzd = zzejVar.zzd(2);
                                if (zzd != 0) {
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                                z = z2;
                                i14 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = zzb;
                            bArr2 = bArr3;
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzd = zzejVar.zzd(2);
                                if (zzd != 0) {
                                    z2 = z;
                                } else {
                                    if (zzejVar.zzp()) {
                                        i5 = zzejVar.zzd(3) + 3;
                                        zzd = zzejVar.zzd(2);
                                        z2 = z;
                                    } else if (zzejVar.zzp()) {
                                        z2 = z;
                                        zzd = 0;
                                    } else {
                                        int zzd6 = zzejVar.zzd(2);
                                        if (zzd6 == 0) {
                                            zzd = 0;
                                            i5 = 0;
                                            z2 = true;
                                        } else if (zzd6 == i14) {
                                            z2 = z;
                                            zzd = 0;
                                            i5 = 2;
                                        } else if (zzd6 == 2) {
                                            i5 = zzejVar.zzd(4) + 12;
                                            zzd = zzejVar.zzd(2);
                                            z2 = z;
                                        } else if (zzd6 != 3) {
                                            z2 = z;
                                            zzd = 0;
                                            i5 = 0;
                                        } else {
                                            i5 = zzejVar.zzd(8) + 29;
                                            zzd = zzejVar.zzd(2);
                                            z2 = z;
                                        }
                                    }
                                    if (i5 != 0 || paint == null) {
                                        i6 = i4;
                                    } else {
                                        int i15 = i10 + 1;
                                        float f = i10;
                                        if (bArr2 != 0) {
                                            zzd = bArr2[zzd];
                                        }
                                        paint.setColor(iArr[zzd]);
                                        i6 = i4;
                                        canvas.drawRect(i4, f, i4 + i5, i15, paint);
                                    }
                                    i4 = i6 + i5;
                                    if (!z2) {
                                        zzejVar.zzf();
                                        i9 = i4;
                                        break;
                                    } else {
                                        z = z2;
                                        i14 = 1;
                                    }
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i4 = i9;
                            z = false;
                            while (true) {
                                zzd = zzejVar.zzd(2);
                                if (zzd != 0) {
                                }
                                i5 = 1;
                                if (i5 != 0) {
                                }
                                i6 = i4;
                                i4 = i6 + i5;
                                if (!z2) {
                                }
                                z = z2;
                                i14 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i == 3 ? bArr5 == null ? zzc : bArr5 : null;
                        int i16 = i9;
                        boolean z5 = false;
                        while (true) {
                            int zzd7 = zzejVar.zzd(i12);
                            if (zzd7 != 0) {
                                z3 = z5;
                            } else if (zzejVar.zzp()) {
                                if (zzejVar.zzp()) {
                                    int zzd8 = zzejVar.zzd(i13);
                                    if (zzd8 == 0) {
                                        z3 = z5;
                                        zzd7 = 0;
                                    } else if (zzd8 == 1) {
                                        z3 = z5;
                                        zzd7 = 0;
                                        i7 = 2;
                                        if (i7 != 0) {
                                        }
                                        i8 = i16;
                                        i16 = i8 + i7;
                                        if (!z3) {
                                        }
                                    } else if (zzd8 == i13) {
                                        zzd2 = zzejVar.zzd(i12) + 9;
                                        zzd3 = zzejVar.zzd(i12);
                                    } else if (zzd8 != 3) {
                                        z3 = z5;
                                        zzd7 = 0;
                                        i7 = 0;
                                        if (i7 != 0) {
                                        }
                                        i8 = i16;
                                        i16 = i8 + i7;
                                        if (!z3) {
                                        }
                                    } else {
                                        zzd2 = zzejVar.zzd(i11) + 25;
                                        zzd3 = zzejVar.zzd(i12);
                                    }
                                } else {
                                    zzd2 = zzejVar.zzd(i13) + i12;
                                    zzd3 = zzejVar.zzd(i12);
                                }
                                z3 = z5;
                                i7 = zzd2;
                                zzd7 = zzd3;
                                if (i7 != 0) {
                                }
                                i8 = i16;
                                i16 = i8 + i7;
                                if (!z3) {
                                }
                            } else {
                                int zzd9 = zzejVar.zzd(3);
                                if (zzd9 != 0) {
                                    z3 = z5;
                                    i7 = zzd9 + 2;
                                    zzd7 = 0;
                                    if (i7 != 0 || paint == null) {
                                        i8 = i16;
                                    } else {
                                        int i17 = i10 + 1;
                                        float f2 = i10;
                                        if (bArr7 != 0) {
                                            zzd7 = bArr7[zzd7];
                                        }
                                        paint.setColor(iArr[zzd7]);
                                        i8 = i16;
                                        canvas.drawRect(i16, f2, i16 + i7, i17, paint);
                                    }
                                    i16 = i8 + i7;
                                    if (!z3) {
                                        zzejVar.zzf();
                                        i9 = i16;
                                        break;
                                    } else {
                                        z5 = z3;
                                        i13 = 2;
                                        i12 = 4;
                                        i11 = 8;
                                    }
                                } else {
                                    zzd7 = 0;
                                    z3 = true;
                                    i7 = 0;
                                    if (i7 != 0) {
                                    }
                                    i8 = i16;
                                    i16 = i8 + i7;
                                    if (!z3) {
                                    }
                                }
                            }
                            i7 = 1;
                            if (i7 != 0) {
                            }
                            i8 = i16;
                            i16 = i8 + i7;
                            if (!z3) {
                            }
                        }
                    case 18:
                        int i18 = i9;
                        boolean z6 = false;
                        while (true) {
                            int zzd10 = zzejVar.zzd(8);
                            if (zzd10 != 0) {
                                z4 = z6;
                                zzd4 = 1;
                            } else if (zzejVar.zzp()) {
                                z4 = z6;
                                zzd4 = zzejVar.zzd(7);
                                zzd10 = zzejVar.zzd(8);
                            } else {
                                int zzd11 = zzejVar.zzd(7);
                                if (zzd11 != 0) {
                                    z4 = z6;
                                    zzd4 = zzd11;
                                    zzd10 = 0;
                                } else {
                                    zzd10 = 0;
                                    z4 = true;
                                    zzd4 = 0;
                                }
                            }
                            if (zzd4 != 0 && paint != null) {
                                paint.setColor(iArr[zzd10]);
                                canvas.drawRect(i18, i10, i18 + zzd4, i10 + 1, paint);
                            }
                            i18 += zzd4;
                            if (z4) {
                                i9 = i18;
                                break;
                            } else {
                                z6 = z4;
                            }
                        }
                    default:
                        switch (zzd5) {
                            case 32:
                                bArr6 = zzg(4, 4, zzejVar);
                                break;
                            case 33:
                                bArr4 = zzg(4, 8, zzejVar);
                                break;
                            case 34:
                                bArr5 = zzg(16, 8, zzejVar);
                                break;
                        }
                }
            } else {
                i10 += 2;
                i9 = i2;
            }
        }
    }

    private static byte[] zzg(int i, int i2, zzej zzejVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzejVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzh() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzi() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzc(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = WorkQueueKt.MASK;
                int i6 = 1 != i4 ? 0 : WorkQueueKt.MASK;
                int i7 = i3 != 0 ? WorkQueueKt.MASK : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzc(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzj() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzc(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzc(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzc(WorkQueueKt.MASK, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzc(255, (1 != (i & 1) ? 0 : 43) + WorkQueueKt.MASK + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + WorkQueueKt.MASK + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + WorkQueueKt.MASK + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzc(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i, int i2, zzajz zzajzVar, zzdn zzdnVar) {
        zzajs zzajsVar;
        SparseArray sparseArray;
        int i3;
        SparseArray sparseArray2;
        zzakk zzakkVar;
        int i4;
        int zzd;
        int zzd2;
        int i5;
        int i6;
        int i7;
        int i8;
        zzej zzejVar = new zzej(bArr, i + i2);
        zzejVar.zzl(i);
        while (zzejVar.zza() >= 48 && zzejVar.zzd(8) == 15) {
            zzakm zzakmVar = this.zzi;
            int zzd3 = zzejVar.zzd(8);
            int zzd4 = zzejVar.zzd(16);
            int zzd5 = zzejVar.zzd(16);
            int zzb2 = zzejVar.zzb() + zzd5;
            if (zzd5 * 8 > zzejVar.zza()) {
                zzea.zzf("DvbParser", "Data field length exceeds limit");
                zzejVar.zzn(zzejVar.zza());
            } else {
                switch (zzd3) {
                    case 16:
                        if (zzd4 == zzakmVar.zza) {
                            zzaki zzakiVar = zzakmVar.zzi;
                            int zzd6 = zzejVar.zzd(8);
                            int zzd7 = zzejVar.zzd(4);
                            int zzd8 = zzejVar.zzd(2);
                            zzejVar.zzn(2);
                            SparseArray sparseArray3 = new SparseArray();
                            for (int i9 = zzd5 - 2; i9 > 0; i9 -= 6) {
                                int zzd9 = zzejVar.zzd(8);
                                zzejVar.zzn(8);
                                sparseArray3.put(zzd9, new zzakj(zzejVar.zzd(16), zzejVar.zzd(16)));
                            }
                            zzaki zzakiVar2 = new zzaki(zzd6, zzd7, zzd8, sparseArray3);
                            if (zzakiVar2.zzb != 0) {
                                zzakmVar.zzi = zzakiVar2;
                                zzakmVar.zzc.clear();
                                zzakmVar.zzd.clear();
                                zzakmVar.zze.clear();
                                break;
                            } else if (zzakiVar != null) {
                                if (zzakiVar.zza != zzakiVar2.zza) {
                                    zzakmVar.zzi = zzakiVar2;
                                    break;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzaki zzakiVar3 = zzakmVar.zzi;
                        if (zzd4 == zzakmVar.zza && zzakiVar3 != null) {
                            int zzd10 = zzejVar.zzd(8);
                            zzejVar.zzn(4);
                            boolean zzp = zzejVar.zzp();
                            zzejVar.zzn(3);
                            int zzd11 = zzejVar.zzd(16);
                            int zzd12 = zzejVar.zzd(16);
                            int zzd13 = zzejVar.zzd(3);
                            int zzd14 = zzejVar.zzd(3);
                            zzejVar.zzn(2);
                            int zzd15 = zzejVar.zzd(8);
                            int zzd16 = zzejVar.zzd(8);
                            int zzd17 = zzejVar.zzd(4);
                            int zzd18 = zzejVar.zzd(2);
                            zzejVar.zzn(2);
                            int i10 = zzd5 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i10 > 0) {
                                int zzd19 = zzejVar.zzd(16);
                                int zzd20 = zzejVar.zzd(2);
                                int zzd21 = zzejVar.zzd(2);
                                int zzd22 = zzejVar.zzd(12);
                                zzejVar.zzn(4);
                                int zzd23 = zzejVar.zzd(12);
                                int i11 = i10 - 6;
                                if (zzd20 != 1) {
                                    if (zzd20 == 2) {
                                        zzd20 = 2;
                                    } else {
                                        i4 = zzd20;
                                        i10 = i11;
                                        zzd = 0;
                                        zzd2 = 0;
                                        sparseArray4.put(zzd19, new zzakl(i4, zzd21, zzd22, zzd23, zzd, zzd2));
                                    }
                                }
                                i10 -= 8;
                                i4 = zzd20;
                                zzd = zzejVar.zzd(8);
                                zzd2 = zzejVar.zzd(8);
                                sparseArray4.put(zzd19, new zzakl(i4, zzd21, zzd22, zzd23, zzd, zzd2));
                            }
                            zzakk zzakkVar2 = new zzakk(zzd10, zzp, zzd11, zzd12, zzd13, zzd14, zzd15, zzd16, zzd17, zzd18, sparseArray4);
                            if (zzakiVar3.zzb == 0 && (zzakkVar = (zzakk) zzakmVar.zzc.get(zzakkVar2.zza)) != null) {
                                int i12 = 0;
                                while (true) {
                                    SparseArray sparseArray5 = zzakkVar.zzj;
                                    if (i12 < sparseArray5.size()) {
                                        zzakkVar2.zzj.put(sparseArray5.keyAt(i12), (zzakl) sparseArray5.valueAt(i12));
                                        i12++;
                                    }
                                }
                            }
                            zzakmVar.zzc.put(zzakkVar2.zza, zzakkVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (zzd4 == zzakmVar.zza) {
                            zzakf zzd24 = zzd(zzejVar, zzd5);
                            zzakmVar.zzd.put(zzd24.zza, zzd24);
                            break;
                        } else if (zzd4 == zzakmVar.zzb) {
                            zzakf zzd25 = zzd(zzejVar, zzd5);
                            zzakmVar.zzf.put(zzd25.zza, zzd25);
                            break;
                        }
                        break;
                    case 19:
                        if (zzd4 == zzakmVar.zza) {
                            zzakh zze = zze(zzejVar);
                            zzakmVar.zze.put(zze.zza, zze);
                            break;
                        } else if (zzd4 == zzakmVar.zzb) {
                            zzakh zze2 = zze(zzejVar);
                            zzakmVar.zzg.put(zze2.zza, zze2);
                            break;
                        }
                        break;
                    case 20:
                        if (zzd4 == zzakmVar.zza) {
                            zzejVar.zzn(4);
                            boolean zzp2 = zzejVar.zzp();
                            zzejVar.zzn(3);
                            int zzd26 = zzejVar.zzd(16);
                            int zzd27 = zzejVar.zzd(16);
                            if (zzp2) {
                                int zzd28 = zzejVar.zzd(16);
                                i5 = zzejVar.zzd(16);
                                i8 = zzejVar.zzd(16);
                                i6 = zzejVar.zzd(16);
                                i7 = zzd28;
                            } else {
                                i5 = zzd26;
                                i6 = zzd27;
                                i7 = 0;
                                i8 = 0;
                            }
                            zzakmVar.zzh = new zzakg(zzd26, zzd27, i7, i5, i8, i6);
                            break;
                        }
                        break;
                }
                zzejVar.zzo(zzb2 - zzejVar.zzb());
            }
        }
        zzakm zzakmVar2 = this.zzi;
        zzaki zzakiVar4 = zzakmVar2.zzi;
        if (zzakiVar4 == null) {
            zzajsVar = new zzajs(zzfxr.zzm(), -9223372036854775807L, -9223372036854775807L);
        } else {
            zzakg zzakgVar = zzakmVar2.zzh;
            if (zzakgVar == null) {
                zzakgVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakgVar.zza + 1 != bitmap.getWidth() || zzakgVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(zzakgVar.zza + 1, zzakgVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = createBitmap;
                this.zzf.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = zzakiVar4.zzc;
            int i13 = 0;
            while (i13 < sparseArray6.size()) {
                this.zzf.save();
                zzakj zzakjVar = (zzakj) sparseArray6.valueAt(i13);
                zzakk zzakkVar3 = (zzakk) this.zzi.zzc.get(sparseArray6.keyAt(i13));
                int i14 = zzakjVar.zza + zzakgVar.zzc;
                int i15 = zzakjVar.zzb + zzakgVar.zze;
                this.zzf.clipRect(i14, i15, Math.min(zzakkVar3.zzc + i14, zzakgVar.zzd), Math.min(zzakkVar3.zzd + i15, zzakgVar.zzf));
                zzakf zzakfVar = (zzakf) this.zzi.zzd.get(zzakkVar3.zzf);
                if (zzakfVar == null) {
                    zzakfVar = (zzakf) this.zzi.zzf.get(zzakkVar3.zzf);
                    if (zzakfVar == null) {
                        zzakfVar = this.zzh;
                    }
                }
                SparseArray sparseArray7 = zzakkVar3.zzj;
                int i16 = 0;
                while (i16 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i16);
                    zzakl zzaklVar = (zzakl) sparseArray7.valueAt(i16);
                    zzakh zzakhVar = (zzakh) this.zzi.zze.get(keyAt);
                    if (zzakhVar == null) {
                        zzakhVar = (zzakh) this.zzi.zzg.get(keyAt);
                    }
                    if (zzakhVar != null) {
                        Paint paint = zzakhVar.zzb ? null : this.zzd;
                        int i17 = zzakkVar3.zze;
                        int i18 = zzaklVar.zza + i14;
                        int i19 = zzaklVar.zzb + i15;
                        sparseArray = sparseArray6;
                        Canvas canvas = this.zzf;
                        sparseArray2 = sparseArray7;
                        i3 = i13;
                        int[] iArr = i17 == 3 ? zzakfVar.zzd : i17 == 2 ? zzakfVar.zzc : zzakfVar.zzb;
                        Paint paint2 = paint;
                        zzf(zzakhVar.zzc, iArr, i17, i18, i19, paint2, canvas);
                        zzf(zzakhVar.zzd, iArr, i17, i18, i19 + 1, paint2, canvas);
                    } else {
                        sparseArray = sparseArray6;
                        i3 = i13;
                        sparseArray2 = sparseArray7;
                    }
                    i16++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    i13 = i3;
                }
                SparseArray sparseArray8 = sparseArray6;
                int i20 = i13;
                float f = i15;
                float f2 = i14;
                if (zzakkVar3.zzb) {
                    int i21 = zzakkVar3.zze;
                    this.zze.setColor(i21 == 3 ? zzakfVar.zzd[zzakkVar3.zzg] : i21 == 2 ? zzakfVar.zzc[zzakkVar3.zzh] : zzakfVar.zzb[zzakkVar3.zzi]);
                    this.zzf.drawRect(f2, f, zzakkVar3.zzc + i14, zzakkVar3.zzd + i15, this.zze);
                }
                zzcz zzczVar = new zzcz();
                zzczVar.zzc(Bitmap.createBitmap(this.zzj, i14, i15, zzakkVar3.zzc, zzakkVar3.zzd));
                zzczVar.zzh(f2 / zzakgVar.zza);
                zzczVar.zzi(0);
                zzczVar.zze(f / zzakgVar.zzb, 0);
                zzczVar.zzf(0);
                zzczVar.zzk(zzakkVar3.zzc / zzakgVar.zza);
                zzczVar.zzd(zzakkVar3.zzd / zzakgVar.zzb);
                arrayList.add(zzczVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i13 = i20 + 1;
                sparseArray6 = sparseArray8;
            }
            zzajsVar = new zzajs(arrayList, -9223372036854775807L, -9223372036854775807L);
        }
        zzdnVar.zza(zzajsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzb() {
        zzakm zzakmVar = this.zzi;
        zzakmVar.zzc.clear();
        zzakmVar.zzd.clear();
        zzakmVar.zze.clear();
        zzakmVar.zzf.clear();
        zzakmVar.zzg.clear();
        zzakmVar.zzh = null;
        zzakmVar.zzi = null;
    }
}
