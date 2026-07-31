package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzajo extends zzaix {
    private static final Logger zzb = Logger.getLogger(zzajo.class.getName());
    private static final boolean zzc = zzana.zzc();
    zzajq zza;

    private static class zza extends zzajo {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        zza(byte[] bArr, int i4, int i5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i5) | i5) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i5)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i5;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, boolean z4) {
            zzj(i4, 0);
            zza(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i4, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i4);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i4, long j4) {
            zzj(i4, 1);
            zzf(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i4, int i5) {
            zzj(i4, 5);
            zzi(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i4, int i5) {
            zzj(i4, 0);
            zzj(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i4) {
            int i5 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i5] = (byte) i4;
                bArr[i5 + 1] = (byte) (i4 >> 8);
                bArr[i5 + 2] = (byte) (i4 >> 16);
                bArr[i5 + 3] = i4 >> 24;
                this.zzd = i5 + 4;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzd(i5, this.zzc, 4, (Throwable) e4);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i4) {
            if (i4 >= 0) {
                zzl(i4);
            } else {
                zzh(i4);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i4, int i5) {
            zzj(i4, 0);
            zzl(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i4) {
            int i5;
            int i6 = this.zzd;
            while ((i4 & (-128)) != 0) {
                try {
                    i5 = i6 + 1;
                    try {
                        this.zzb[i6] = (byte) (i4 | UserVerificationMethods.USER_VERIFY_PATTERN);
                        i4 >>>= 7;
                        i6 = i5;
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        i6 = i5;
                        throw new zzd(i6, this.zzc, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    e = e5;
                    throw new zzd(i6, this.zzc, 1, (Throwable) e);
                }
            }
            i5 = i6 + 1;
            this.zzb[i6] = (byte) i4;
            this.zzd = i5;
        }

        private final void zzc(byte[] bArr, int i4, int i5) {
            try {
                System.arraycopy(bArr, i4, this.zzb, this.zzd, i5);
                this.zzd += i5;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzd(this.zzd, this.zzc, i5, (Throwable) e4);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zza(byte b4) {
            int i4 = this.zzd;
            try {
                int i5 = i4 + 1;
                try {
                    this.zzb[i4] = b4;
                    this.zzd = i5;
                } catch (IndexOutOfBoundsException e4) {
                    e = e4;
                    i4 = i5;
                    throw new zzd(i4, this.zzc, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e5) {
                e = e5;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i4, int i5) {
            zzl(i5);
            zzc(bArr, 0, i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(long j4) {
            int i4 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i4] = (byte) j4;
                bArr[i4 + 1] = (byte) (j4 >> 8);
                bArr[i4 + 2] = (byte) (j4 >> 16);
                bArr[i4 + 3] = (byte) (j4 >> 24);
                bArr[i4 + 4] = (byte) (j4 >> 32);
                bArr[i4 + 5] = (byte) (j4 >> 40);
                bArr[i4 + 6] = (byte) (j4 >> 48);
                bArr[i4 + 7] = (byte) (j4 >> 56);
                this.zzd = i4 + 8;
            } catch (IndexOutOfBoundsException e4) {
                throw new zzd(i4, this.zzc, 8, (Throwable) e4);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i4, long j4) {
            zzj(i4, 0);
            zzh(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i4, int i5) {
            zzl((i4 << 3) | i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i4, zzaiw zzaiwVar) {
            zzj(i4, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j4) {
            int i4;
            int i5;
            int i6 = this.zzd;
            if (zzajo.zzc && zza() >= 10) {
                while ((j4 & (-128)) != 0) {
                    zzana.zza(this.zzb, i6, (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j4 >>>= 7;
                    i6++;
                }
                i4 = i6 + 1;
                zzana.zza(this.zzb, i6, (byte) j4);
            } else {
                while ((j4 & (-128)) != 0) {
                    try {
                        i5 = i6 + 1;
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                    }
                    try {
                        this.zzb[i6] = (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j4 >>>= 7;
                        i6 = i5;
                    } catch (IndexOutOfBoundsException e5) {
                        e = e5;
                        i6 = i5;
                        throw new zzd(i6, this.zzc, 1, (Throwable) e);
                    }
                }
                i4 = i6 + 1;
                try {
                    this.zzb[i6] = (byte) j4;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i6 = i4;
                    throw new zzd(i6, this.zzc, 1, (Throwable) e);
                }
            }
            this.zzd = i4;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i4, int i5) {
            zzc(bArr, i4, i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        final void zzc(int i4, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i4, 2);
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i4);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, String str) {
            zzj(i4, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int i4 = this.zzd;
            try {
                int zzh = zzajo.zzh(str.length() * 3);
                int zzh2 = zzajo.zzh(str.length());
                if (zzh2 == zzh) {
                    int i5 = i4 + zzh2;
                    this.zzd = i5;
                    int zza = zzanb.zza(str, this.zzb, i5, zza());
                    this.zzd = i4;
                    zzl((zza - i4) - zzh2);
                    this.zzd = zza;
                    return;
                }
                zzl(zzanb.zza(str));
                this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza());
            } catch (zzane e4) {
                this.zzd = i4;
                zza(str, e4);
            } catch (IndexOutOfBoundsException e5) {
                throw new zzd(e5);
            }
        }
    }

    private static abstract class zzb extends zzajo {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        zzb(int i4) {
            super();
            if (i4 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i4, 20)];
            this.zzb = bArr;
            this.zzc = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void zzb(byte b4) {
            int i4 = this.zzd;
            this.zzb[i4] = b4;
            this.zzd = i4 + 1;
            this.zze++;
        }

        final void zzi(long j4) {
            int i4 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i4] = (byte) j4;
            bArr[i4 + 1] = (byte) (j4 >> 8);
            bArr[i4 + 2] = (byte) (j4 >> 16);
            bArr[i4 + 3] = (byte) (j4 >> 24);
            bArr[i4 + 4] = (byte) (j4 >> 32);
            bArr[i4 + 5] = (byte) (j4 >> 40);
            bArr[i4 + 6] = (byte) (j4 >> 48);
            bArr[i4 + 7] = (byte) (j4 >> 56);
            this.zzd = i4 + 8;
            this.zze += 8;
        }

        final void zzj(long j4) {
            if (!zzajo.zzc) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i4 = this.zzd;
                    this.zzd = i4 + 1;
                    bArr[i4] = (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.zze++;
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i5 = this.zzd;
                this.zzd = i5 + 1;
                bArr2[i5] = (byte) j4;
                this.zze++;
                return;
            }
            long j5 = this.zzd;
            while ((j4 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                zzana.zza(bArr3, i6, (byte) (((int) j4) | UserVerificationMethods.USER_VERIFY_PATTERN));
                j4 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i7 = this.zzd;
            this.zzd = i7 + 1;
            zzana.zza(bArr4, i7, (byte) j4);
            this.zze += (int) (this.zzd - j5);
        }

        final void zzl(int i4, int i5) {
            zzn((i4 << 3) | i5);
        }

        final void zzm(int i4) {
            int i5 = this.zzd;
            byte[] bArr = this.zzb;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = i4 >> 24;
            this.zzd = i5 + 4;
            this.zze += 4;
        }

        final void zzn(int i4) {
            if (!zzajo.zzc) {
                while ((i4 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i5 = this.zzd;
                    this.zzd = i5 + 1;
                    bArr[i5] = (byte) (i4 | UserVerificationMethods.USER_VERIFY_PATTERN);
                    this.zze++;
                    i4 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i6 = this.zzd;
                this.zzd = i6 + 1;
                bArr2[i6] = (byte) i4;
                this.zze++;
                return;
            }
            long j4 = this.zzd;
            while ((i4 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i7 = this.zzd;
                this.zzd = i7 + 1;
                zzana.zza(bArr3, i7, (byte) (i4 | UserVerificationMethods.USER_VERIFY_PATTERN));
                i4 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i8 = this.zzd;
            this.zzd = i8 + 1;
            zzana.zza(bArr4, i8, (byte) i4);
            this.zze += (int) (this.zzd - j4);
        }
    }

    public static class zzd extends IOException {
        zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzd(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        zzd(int i4, int i5, int i6, Throwable th) {
            this(i4, i5, i6, th);
        }

        private zzd(long j4, long j5, int i4, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i4)), th);
        }
    }

    public static int zza(double d4) {
        return 8;
    }

    public static int zzb(int i4) {
        return 4;
    }

    public static int zzc(long j4) {
        return 8;
    }

    static int zzd(int i4) {
        return i4 > 4096 ? Base64Utils.IO_BUFFER_SIZE : i4;
    }

    public static int zze(int i4) {
        return 4;
    }

    public static int zzf(int i4) {
        return zzh(zzm(i4));
    }

    public static int zzg(int i4) {
        return zzh(i4 << 3);
    }

    public static int zzh(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    private static long zzi(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    private static int zzm(int i4) {
        return (i4 >> 31) ^ (i4 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b4);

    public abstract void zzb(int i4, zzaln zzalnVar);

    public abstract void zzb(int i4, String str);

    public abstract void zzb(int i4, boolean z4);

    public abstract void zzb(zzaiw zzaiwVar);

    abstract void zzb(zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzb(String str);

    abstract void zzb(byte[] bArr, int i4, int i5);

    public abstract void zzc();

    public abstract void zzc(int i4, zzaiw zzaiwVar);

    abstract void zzc(int i4, zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzc(zzaln zzalnVar);

    public abstract void zzd(int i4, zzaiw zzaiwVar);

    public abstract void zzf(int i4, long j4);

    public abstract void zzf(long j4);

    public abstract void zzg(int i4, int i5);

    public abstract void zzh(int i4, int i5);

    public abstract void zzh(int i4, long j4);

    public abstract void zzh(long j4);

    public abstract void zzi(int i4);

    public abstract void zzj(int i4);

    public abstract void zzj(int i4, int i5);

    public final void zzk(int i4) {
        zzl(zzm(i4));
    }

    public abstract void zzk(int i4, int i5);

    public abstract void zzl(int i4);

    private static final class zzc extends zzb {
        private final OutputStream zzf;

        zzc(OutputStream outputStream, int i4) {
            super(i4);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzo(int i4) {
            if (this.zzc - this.zzd < i4) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zza(byte b4) {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, boolean z4) {
            zzo(11);
            zzl(i4, 0);
            zzb(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i4, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i4);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i4, long j4) {
            zzo(18);
            zzl(i4, 1);
            zzi(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i4, int i5) {
            zzo(14);
            zzl(i4, 5);
            zzm(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i4, int i5) {
            zzo(20);
            zzl(i4, 0);
            if (i5 >= 0) {
                zzn(i5);
            } else {
                zzj(i5);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i4) {
            zzo(4);
            zzm(i4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i4) {
            if (i4 >= 0) {
                zzl(i4);
            } else {
                zzh(i4);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i4, int i5) {
            zzo(20);
            zzl(i4, 0);
            zzn(i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i4) {
            zzo(5);
            zzn(i4);
        }

        private final void zzc(byte[] bArr, int i4, int i5) {
            int i6 = this.zzc;
            int i7 = this.zzd;
            if (i6 - i7 >= i5) {
                System.arraycopy(bArr, i4, this.zzb, i7, i5);
                this.zzd += i5;
            } else {
                int i8 = i6 - i7;
                System.arraycopy(bArr, i4, this.zzb, i7, i8);
                int i9 = i4 + i8;
                i5 -= i8;
                this.zzd = this.zzc;
                this.zze += i8;
                zze();
                if (i5 <= this.zzc) {
                    System.arraycopy(bArr, i9, this.zzb, 0, i5);
                    this.zzd = i5;
                } else {
                    this.zzf.write(bArr, i9, i5);
                }
            }
            this.zze += i5;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i4, int i5) {
            zzl((i4 << 3) | i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i4, int i5) {
            zzc(bArr, i4, i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i4, int i5) {
            zzl(i5);
            zzc(bArr, 0, i5);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(long j4) {
            zzo(8);
            zzi(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i4, long j4) {
            zzo(20);
            zzl(i4, 0);
            zzj(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j4) {
            zzo(10);
            zzj(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i4);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i4, String str) {
            zzj(i4, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i4, zzaiw zzaiwVar) {
            zzj(i4, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzh = zzajo.zzh(length);
                int i4 = zzh + length;
                int i5 = this.zzc;
                if (i4 > i5) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzanb.zza(str, bArr, 0, length);
                    zzl(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i4 > i5 - this.zzd) {
                    zze();
                }
                int zzh2 = zzajo.zzh(str.length());
                int i6 = this.zzd;
                try {
                    if (zzh2 == zzh) {
                        int i7 = i6 + zzh2;
                        this.zzd = i7;
                        int zza3 = zzanb.zza(str, this.zzb, i7, this.zzc - i7);
                        this.zzd = i6;
                        zza = (zza3 - i6) - zzh2;
                        zzn(zza);
                        this.zzd = zza3;
                    } else {
                        zza = zzanb.zza(str);
                        zzn(zza);
                        this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza);
                    }
                    this.zze += zza;
                } catch (zzane e4) {
                    this.zze -= this.zzd - i6;
                    this.zzd = i6;
                    throw e4;
                } catch (ArrayIndexOutOfBoundsException e5) {
                    throw new zzd(e5);
                }
            } catch (zzane e6) {
                zza(str, e6);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        final void zzc(int i4, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i4, 2);
            zzb(zzalnVar, zzamcVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }
    }

    private zzajo() {
    }

    public static int zza(float f4) {
        return 4;
    }

    public static int zzb(int i4, int i5) {
        return zzh(i4 << 3) + 4;
    }

    public static int zzc(int i4, int i5) {
        return zzh(i4 << 3) + zze(i5);
    }

    public static int zze(int i4, int i5) {
        return zzh(i4 << 3) + zzh(zzm(i5));
    }

    public static int zzf(int i4, int i5) {
        return zzh(i4 << 3) + zzh(i5);
    }

    public final void zzg(int i4, long j4) {
        zzh(i4, zzi(j4));
    }

    public final void zzi(int i4, int i5) {
        zzk(i4, zzm(i5));
    }

    public static int zza(long j4) {
        return 8;
    }

    public static int zzb(int i4, long j4) {
        return zzh(i4 << 3) + zze(j4);
    }

    public static int zzd(int i4, int i5) {
        return zzh(i4 << 3) + 4;
    }

    public final void zzg(long j4) {
        zzh(zzi(j4));
    }

    public static int zza(boolean z4) {
        return 1;
    }

    public static int zzc(int i4) {
        return zze(i4);
    }

    public static int zzd(int i4, long j4) {
        return zzh(i4 << 3) + zze(zzi(j4));
    }

    public static int zze(int i4, long j4) {
        return zzh(i4 << 3) + zze(j4);
    }

    public static int zza(int i4, boolean z4) {
        return zzh(i4 << 3) + 1;
    }

    public static int zzb(long j4) {
        return zze(j4);
    }

    public static int zzc(int i4, long j4) {
        return zzh(i4 << 3) + 8;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzh(length) + length;
    }

    public static int zzb(int i4, zzakv zzakvVar) {
        int zzh = zzh(i4 << 3);
        int zza2 = zzakvVar.zza();
        return zzh + zzh(zza2) + zza2;
    }

    public static int zzd(long j4) {
        return zze(zzi(j4));
    }

    public static int zze(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int zza(int i4, zzaiw zzaiwVar) {
        int zzh = zzh(i4 << 3);
        int zzb2 = zzaiwVar.zzb();
        return zzh + zzh(zzb2) + zzb2;
    }

    static int zzb(int i4, zzaln zzalnVar, zzamc zzamcVar) {
        return zzh(i4 << 3) + zza(zzalnVar, zzamcVar);
    }

    public static int zza(zzaiw zzaiwVar) {
        int zzb2 = zzaiwVar.zzb();
        return zzh(zzb2) + zzb2;
    }

    public static int zzb(zzaln zzalnVar) {
        int zzl = zzalnVar.zzl();
        return zzh(zzl) + zzl;
    }

    public static int zza(int i4, double d4) {
        return zzh(i4 << 3) + 8;
    }

    public static int zzb(int i4, zzaiw zzaiwVar) {
        return (zzh(8) << 1) + zzf(2, i4) + zza(3, zzaiwVar);
    }

    public static int zza(int i4, int i5) {
        return zzh(i4 << 3) + zze(i5);
    }

    public static int zza(int i4) {
        return zze(i4);
    }

    public static zzajo zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zza(int i4, long j4) {
        return zzh(i4 << 3) + 8;
    }

    public static int zza(int i4, float f4) {
        return zzh(i4 << 3) + 4;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    static int zza(int i4, zzaln zzalnVar, zzamc zzamcVar) {
        return (zzh(i4 << 3) << 1) + ((zzain) zzalnVar).zza(zzamcVar);
    }

    public final void zzb(boolean z4) {
        zza(z4 ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public static int zza(zzaln zzalnVar) {
        return zzalnVar.zzl();
    }

    public final void zzb(int i4, double d4) {
        zzf(i4, Double.doubleToRawLongBits(d4));
    }

    public static int zza(int i4, zzakv zzakvVar) {
        return (zzh(8) << 1) + zzf(2, i4) + zzb(3, zzakvVar);
    }

    public final void zzb(double d4) {
        zzf(Double.doubleToRawLongBits(d4));
    }

    public final void zzb(int i4, float f4) {
        zzg(i4, Float.floatToRawIntBits(f4));
    }

    public final void zzb(float f4) {
        zzi(Float.floatToRawIntBits(f4));
    }

    public static int zza(zzakv zzakvVar) {
        int zza2 = zzakvVar.zza();
        return zzh(zza2) + zza2;
    }

    public static int zza(int i4, zzaln zzalnVar) {
        return (zzh(8) << 1) + zzf(2, i4) + zzh(24) + zzb(zzalnVar);
    }

    static int zza(zzaln zzalnVar, zzamc zzamcVar) {
        int zza2 = ((zzain) zzalnVar).zza(zzamcVar);
        return zzh(zza2) + zza2;
    }

    public static int zza(int i4, String str) {
        return zzh(i4 << 3) + zza(str);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzanb.zza(str);
        } catch (zzane unused) {
            length = str.getBytes(zzaki.zza).length;
        }
        return zzh(length) + length;
    }

    public static zzajo zza(OutputStream outputStream, int i4) {
        return new zzc(outputStream, i4);
    }

    final void zza(String str, zzane zzaneVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaneVar);
        byte[] bytes = str.getBytes(zzaki.zza);
        try {
            zzl(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzd(e4);
        }
    }
}
