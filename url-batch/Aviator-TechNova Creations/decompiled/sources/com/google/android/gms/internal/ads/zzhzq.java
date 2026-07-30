package com.google.android.gms.internal.ads;

import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.internal.Buffer;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhzq implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhyq zzc = zzhyq.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzhyt.zza = new zzhzp();
    }

    public zzhzq(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        this.zzb = (Reader) Objects.requireNonNull(reader, "in == null");
    }

    private final boolean zzn(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case Opcodes.DUP_X2 /* 91 */:
                        case Opcodes.DUP2_X1 /* 93 */:
                            return false;
                        case Opcodes.DUP2 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r0 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0140, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x014c, code lost:
    
        r0.append(r4, r2, r3);
        r11.zze = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        throw zzv("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r11.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzo(char c) throws IOException {
        int i;
        StringBuilder sb = null;
        loop0: do {
            int i2 = this.zze;
            int i3 = this.zzf;
            int i4 = i2;
            while (true) {
                char[] cArr = this.zzd;
                if (i2 >= i3) {
                    break;
                }
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                zzhyq zzhyqVar = this.zzc;
                zzhyq zzhyqVar2 = zzhyq.STRICT;
                if (zzhyqVar == zzhyqVar2 && c2 < ' ') {
                    throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                }
                if (c2 == c) {
                    int i6 = (i5 - i4) - 1;
                    this.zze = i5;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = '\n';
                if (c2 == '\\') {
                    int i7 = i5 - i4;
                    int i8 = i7 - 1;
                    this.zze = i5;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i7 + i7, 16));
                    }
                    sb.append(cArr, i4, i8);
                    if (this.zze == this.zzf && !zzr(1)) {
                        throw zzv("Unterminated escape sequence");
                    }
                    int i9 = this.zze;
                    int i10 = i9 + 1;
                    this.zze = i10;
                    char c4 = cArr[i9];
                    if (c4 != '\n') {
                        if (c4 != '\"') {
                            if (c4 != '\'') {
                                if (c4 != '/' && c4 != '\\') {
                                    if (c4 == 'b') {
                                        c3 = '\b';
                                    } else if (c4 == 'f') {
                                        c3 = '\f';
                                    } else if (c4 != 'n') {
                                        if (c4 == 'r') {
                                            c3 = '\r';
                                        } else if (c4 == 't') {
                                            c3 = '\t';
                                        } else {
                                            if (c4 != 'u') {
                                                throw zzv("Invalid escape sequence");
                                            }
                                            if (i9 + 5 > this.zzf && !zzr(4)) {
                                                throw zzv("Unterminated escape sequence");
                                            }
                                            int i11 = this.zze;
                                            int i12 = i11 + 4;
                                            int i13 = 0;
                                            while (i11 < i12) {
                                                int i14 = i13 << 4;
                                                char c5 = cArr[i11];
                                                if (c5 >= '0' && c5 <= '9') {
                                                    i = c5 - '0';
                                                } else if (c5 >= 'a' && c5 <= 'f') {
                                                    i = c5 - 'W';
                                                } else {
                                                    if (c5 < 'A' || c5 > 'F') {
                                                        break loop0;
                                                    }
                                                    i = c5 - '7';
                                                }
                                                i13 = i14 + i;
                                                i11++;
                                            }
                                            this.zze += 4;
                                            c3 = (char) i13;
                                        }
                                    }
                                    sb.append(c3);
                                    i4 = this.zze;
                                    i3 = this.zzf;
                                    i2 = i4;
                                }
                            }
                        }
                        c3 = c4;
                        sb.append(c3);
                        i4 = this.zze;
                        i3 = this.zzf;
                        i2 = i4;
                    } else {
                        if (this.zzc == zzhyqVar2) {
                            throw zzv("Cannot escape a newline character in strict mode");
                        }
                        this.zzg++;
                        this.zzh = i10;
                    }
                    if (this.zzc == zzhyqVar2) {
                        throw zzv("Invalid escaped character \"'\" in strict mode");
                    }
                    c3 = c4;
                    sb.append(c3);
                    i4 = this.zze;
                    i3 = this.zzf;
                    i2 = i4;
                } else {
                    if (c2 == '\n') {
                        this.zzg++;
                        this.zzh = i5;
                    }
                    i2 = i5;
                }
            }
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0048, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzp() throws IOException {
        String sb;
        int i = 0;
        StringBuilder sb2 = null;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.zze + i2;
                if (i3 < this.zzf) {
                    char c = this.zzd[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Opcodes.DUP_X2 /* 91 */:
                                                case Opcodes.DUP2_X1 /* 93 */:
                                                    break;
                                                case Opcodes.DUP2 /* 92 */:
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= 1024) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(this.zzd, this.zze, i2);
                    this.zze += i2;
                } else if (zzr(i2 + 1)) {
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(this.zzd, this.zze, i);
            } else {
                sb2.append(this.zzd, this.zze, i);
                sb = sb2.toString();
            }
            this.zze += i;
            return sb;
        } while (zzr(1));
        if (sb2 != null) {
        }
        this.zze += i;
        return sb;
    }

    private final void zzq(int i) throws zzhzt {
        int i2 = this.zzl;
        if (i2 - 1 >= 1280) {
            String zzl = zzl();
            StringBuilder sb = new StringBuilder(zzl.length() + 26);
            sb.append("Nesting limit 1280 reached");
            sb.append(zzl);
            throw new zzhzt(sb.toString());
        }
        int[] iArr = this.zzk;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.zzk = Arrays.copyOf(iArr, i3);
            this.zzn = Arrays.copyOf(this.zzn, i3);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i3);
        }
        int[] iArr2 = this.zzk;
        int i4 = this.zzl;
        this.zzl = i4 + 1;
        iArr2[i4] = i;
    }

    private final boolean zzr(int i) throws IOException {
        int i2;
        int i3 = this.zzh;
        int i4 = this.zze;
        this.zzh = i3 - i4;
        char[] cArr = this.zzd;
        int i5 = this.zzf;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.zzf = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i7 = this.zzf;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.zzf + read;
            this.zzf = i2;
            if (this.zzg == 0 && this.zzh == 0 && i2 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final int zzs(boolean z) throws IOException {
        int i;
        int i2 = this.zze;
        int i3 = this.zzf;
        while (true) {
            if (i2 == i3) {
                this.zze = i2;
                if (!zzr(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i2 = this.zze;
                i3 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.zze = i4;
                    if (i4 == i3) {
                        this.zze = i2;
                        boolean zzr = zzr(2);
                        this.zze++;
                        if (!zzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i5 = this.zze;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.zze = i5 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i6 = this.zze;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.zze + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.zze + 2;
                                i3 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i6 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.zze = i5 + 1;
                        zzu();
                        i2 = this.zze;
                        i3 = this.zzf;
                    }
                } else {
                    if (c != '#') {
                        this.zze = i4;
                        return c;
                    }
                    this.zze = i4;
                    zzt();
                    zzu();
                    i2 = this.zze;
                    i3 = this.zzf;
                }
            }
            i2 = i4;
        }
    }

    private final void zzt() throws zzhzt {
        if (this.zzc != zzhyq.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i = this.zze;
            int i2 = i + 1;
            this.zze = i2;
            c = cArr[i];
            if (c == '\n') {
                this.zzg++;
                this.zzh = i2;
                return;
            }
        } while (c != '\r');
    }

    private final zzhzt zzv(String str) throws zzhzt {
        String zzl = zzl();
        StringBuilder sb = new StringBuilder(str.length() + zzl.length() + 79);
        sb.append(str);
        sb.append(zzl);
        sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
        throw new zzhzt(sb.toString());
    }

    private final IllegalStateException zzw(String str) throws IOException {
        int zzm = zzm();
        String zza = zzhzr.zza(zzm());
        String zzl = zzl();
        int length = str.length() + 18 + zza.length() + zzl.length();
        String concat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(zzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(length + 5 + concat.length());
        sb.append("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(zza);
        sb.append(zzl);
        sb.append("\nSee ");
        sb.append(concat);
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String zzl = zzl();
        String.valueOf(simpleName);
        return String.valueOf(simpleName).concat(zzl);
    }

    public final void zza(zzhyq zzhyqVar) {
        Objects.requireNonNull(zzhyqVar);
        this.zzc = zzhyqVar;
    }

    public final void zzb() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0224, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x022a, code lost:
    
        if (zzn(r1) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b0, code lost:
    
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022e, code lost:
    
        if (r15 != 2) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0230, code lost:
    
        if (r16 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0236, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0238, code lost:
    
        if (r17 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x023a, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0240, code lost:
    
        if (r11 != r20) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0242, code lost:
    
        if (r3 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0248, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0249, code lost:
    
        r24.zzi = r11;
        r24.zze += r10;
        r24.zza = 15;
        r3 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0245, code lost:
    
        if (r3 == 0) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023c, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0257, code lost:
    
        r8 = 2;
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0259, code lost:
    
        if (r15 == r8) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x025c, code lost:
    
        if (r15 == 4) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025e, code lost:
    
        if (r15 != 7) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0260, code lost:
    
        r24.zzj = r10;
        r3 = 16;
        r24.zza = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019f, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0296 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzg() throws IOException {
        int i;
        int i2;
        int zzs;
        int i3;
        int zzs2;
        int i4;
        String str;
        String str2;
        int i5;
        char c;
        long j;
        char[] cArr;
        int i6;
        int i7;
        int[] iArr = this.zzk;
        int i8 = this.zzl - 1;
        int i9 = iArr[i8];
        int i10 = 3;
        int i11 = 1;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i = 2;
                    i2 = 4;
                } else if (i9 == 5) {
                    i2 = 4;
                    i = 2;
                } else if (i9 == 4) {
                    iArr[i8] = 5;
                    int zzs3 = zzs(true);
                    if (zzs3 != 58) {
                        if (zzs3 != 61) {
                            throw zzv("Expected ':'");
                        }
                        zzt();
                        if (this.zze < this.zzf || zzr(1)) {
                            char[] cArr2 = this.zzd;
                            int i12 = this.zze;
                            if (cArr2[i12] == '>') {
                                this.zze = i12 + 1;
                            }
                        }
                    }
                } else if (i9 == 6) {
                    if (this.zzc == zzhyq.LENIENT) {
                        zzs(true);
                        int i13 = this.zze;
                        this.zze = i13 - 1;
                        if (i13 + 4 <= this.zzf || zzr(5)) {
                            int i14 = this.zze;
                            char[] cArr3 = this.zzd;
                            if (cArr3[i14] == ')' && cArr3[i14 + 1] == ']' && cArr3[i14 + 2] == '}' && cArr3[i14 + 3] == '\'' && cArr3[i14 + 4] == '\n') {
                                this.zze = i14 + 5;
                            }
                        }
                    }
                    this.zzk[this.zzl - 1] = 7;
                } else if (i9 == 7) {
                    i3 = 0;
                    if (zzs(false) == -1) {
                        i10 = 17;
                        this.zza = i10;
                        return i10;
                    }
                    zzt();
                    this.zze--;
                } else {
                    i3 = 0;
                    if (i9 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iArr[i8] = i2;
                if (i9 == 5 && (zzs = zzs(true)) != 44) {
                    if (zzs != 59) {
                        if (zzs != 125) {
                            throw zzv("Unterminated object");
                        }
                        i10 = i;
                        this.zza = i10;
                        return i10;
                    }
                    zzt();
                }
                int zzs4 = zzs(true);
                if (zzs4 == 34) {
                    i10 = 13;
                } else {
                    if (zzs4 == 39) {
                        zzt();
                        this.zza = 12;
                        return 12;
                    }
                    if (zzs4 != 125) {
                        zzt();
                        this.zze--;
                        if (!zzn((char) zzs4)) {
                            throw zzv("Expected name");
                        }
                        i10 = 14;
                    } else {
                        if (i9 == 5) {
                            throw zzv("Expected name");
                        }
                        i10 = i;
                    }
                }
                this.zza = i10;
                return i10;
            }
            int zzs5 = zzs(true);
            if (zzs5 != 44) {
                if (zzs5 != 59) {
                    if (zzs5 != 93) {
                        throw zzv("Unterminated array");
                    }
                    i10 = 4;
                    this.zza = i10;
                    return i10;
                }
                zzt();
            }
            zzs2 = zzs(true);
            if (zzs2 == 34) {
                if (zzs2 == 39) {
                    zzt();
                    this.zza = 8;
                    return 8;
                }
                if (zzs2 == 44 || zzs2 == 59) {
                    i4 = 1;
                } else if (zzs2 != 91) {
                    if (zzs2 == 93) {
                        i4 = 1;
                        if (i9 == 1) {
                            i10 = 4;
                        }
                    } else if (zzs2 != 123) {
                        int i15 = this.zze - 1;
                        this.zze = i15;
                        char[] cArr4 = this.zzd;
                        char c2 = cArr4[i15];
                        if (c2 == 't' || c2 == 'T') {
                            str = "TRUE";
                            str2 = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
                            i5 = 5;
                        } else if (c2 == 'f' || c2 == 'F') {
                            str = "FALSE";
                            str2 = "false";
                            i5 = 6;
                        } else {
                            if (c2 == 'n' || c2 == 'N') {
                                str = "NULL";
                                str2 = AbstractJsonLexerKt.NULL;
                                i5 = 7;
                            }
                            i5 = i3;
                            if (i5 == 0) {
                                return i5;
                            }
                            int i16 = this.zze;
                            int i17 = this.zzf;
                            int i18 = i3;
                            int i19 = i18;
                            int i20 = i19;
                            boolean z = true;
                            long j2 = 0;
                            while (true) {
                                if (i16 + i18 == i17) {
                                    if (i18 == 1024) {
                                        break;
                                    }
                                    if (!zzr(i18 + 1)) {
                                        cArr = cArr4;
                                        j = 0;
                                        break;
                                    }
                                    int i21 = this.zze;
                                    i17 = this.zzf;
                                    i16 = i21;
                                }
                                char c3 = cArr4[i16 + i18];
                                j = 0;
                                if (c3 != '+') {
                                    if (c3 == 'E' || c3 == 'e') {
                                        cArr = cArr4;
                                        if (i19 != 2 && i19 != 4) {
                                            break;
                                        }
                                        i19 = 5;
                                        i18++;
                                        cArr4 = cArr;
                                        i11 = 1;
                                    } else if (c3 == '-') {
                                        cArr = cArr4;
                                        i6 = 6;
                                        if (i19 == 0) {
                                            i19 = 1;
                                            i20 = 1;
                                            i18++;
                                            cArr4 = cArr;
                                            i11 = 1;
                                        } else {
                                            if (i19 != 5) {
                                                break;
                                            }
                                            i19 = i6;
                                            i18++;
                                            cArr4 = cArr;
                                            i11 = 1;
                                        }
                                    } else if (c3 == '.') {
                                        cArr = cArr4;
                                        if (i19 != 2) {
                                            break;
                                        }
                                        i19 = 3;
                                        i18++;
                                        cArr4 = cArr;
                                        i11 = 1;
                                    } else {
                                        if (c3 < '0' || c3 > '9') {
                                            break;
                                        }
                                        if (i19 == i11 || i19 == 0) {
                                            cArr = cArr4;
                                            j2 = -(c3 - '0');
                                            i19 = 2;
                                        } else if (i19 != 2) {
                                            cArr = cArr4;
                                            if (i19 == 3) {
                                                i19 = 4;
                                            } else if (i19 == 5 || i19 == 6) {
                                                i19 = 7;
                                            }
                                        } else {
                                            if (j2 == 0) {
                                                break;
                                            }
                                            cArr = cArr4;
                                            long j3 = (10 * j2) - (c3 - '0');
                                            z &= j2 > Buffer.OVERFLOW_ZONE || (j2 == Buffer.OVERFLOW_ZONE && j3 < j2);
                                            j2 = j3;
                                        }
                                        i18++;
                                        cArr4 = cArr;
                                        i11 = 1;
                                    }
                                    if (i7 == 0) {
                                        return i7;
                                    }
                                    if (!zzn(cArr[this.zze])) {
                                        throw zzv("Expected value");
                                    }
                                    zzt();
                                    this.zza = 10;
                                    return 10;
                                }
                                cArr = cArr4;
                                i6 = 6;
                                if (i19 != 5) {
                                    break;
                                }
                                i19 = i6;
                                i18++;
                                cArr4 = cArr;
                                i11 = 1;
                            }
                            i7 = 0;
                            if (i7 == 0) {
                            }
                        }
                        zzhyq zzhyqVar = this.zzc;
                        zzhyq zzhyqVar2 = zzhyq.STRICT;
                        int i22 = i3;
                        while (true) {
                            int length = str2.length();
                            if (i22 < length) {
                                if ((this.zze + i22 >= this.zzf && !zzr(i22 + 1)) || ((c = cArr4[this.zze + i22]) != str2.charAt(i22) && (zzhyqVar == zzhyqVar2 || c != str.charAt(i22)))) {
                                    break;
                                }
                                i22++;
                            } else if ((this.zze + length >= this.zzf && !zzr(length + 1)) || !zzn(cArr4[this.zze + length])) {
                                this.zze += length;
                                this.zza = i5;
                            }
                        }
                        if (i5 == 0) {
                        }
                    } else {
                        i10 = 1;
                    }
                }
                if (i9 != i4 && i9 != 2) {
                    throw zzv("Unexpected value");
                }
                zzt();
                this.zze--;
                this.zza = 7;
                return 7;
            }
            i10 = 9;
            this.zza = i10;
            return i10;
        }
        iArr[i8] = 2;
        i3 = 0;
        zzs2 = zzs(true);
        if (zzs2 == 34) {
        }
        this.zza = i10;
        return i10;
    }

    public final String zzh() throws IOException {
        String zzo;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 14) {
            zzo = zzp();
        } else if (i == 12) {
            zzo = zzo('\'');
        } else {
            if (i != 13) {
                throw zzw("a name");
            }
            zzo = zzo('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = zzo;
        return zzo;
    }

    public final String zzi() throws IOException {
        String str;
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 10) {
            str = zzp();
        } else if (i == 8) {
            str = zzo('\'');
        } else if (i == 9) {
            str = zzo('\"');
        } else if (i == 11) {
            str = null;
        } else if (i == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (i != 16) {
                throw zzw("a string");
            }
            String str2 = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            str = str2;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean zzj() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        if (i != 7) {
            throw zzw(AbstractJsonLexerKt.NULL);
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    final String zzl() {
        int i = this.zzg + 1;
        int i2 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < this.zzl; i3++) {
            int i4 = this.zzk[i3];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.zzn[i3];
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i5);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i3];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 21);
                    sb2.append("Unknown scope value: ");
                    sb2.append(i4);
                    throw new AssertionError(sb2.toString());
            }
        }
        int i6 = i2 + 1;
        String sb3 = sb.toString();
        StringBuilder sb4 = new StringBuilder(String.valueOf(i).length() + 17 + String.valueOf(i6).length() + 6 + sb3.length());
        sb4.append(" at line ");
        sb4.append(i);
        sb4.append(" column ");
        sb4.append(i6);
        sb4.append(" path ");
        sb4.append(sb3);
        return sb4.toString();
    }

    public final int zzm() throws IOException {
        int i = this.zza;
        if (i == 0) {
            i = zzg();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
