package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0399Ba {
    public static byte[] A0C;
    public static String[] A0D = {"1uxTk9uu8NGqb4bRD7SiE7", "Ssi3SEW4IwUGp9bqpG4lGM81x4BmU482", "xmiG4gye91jMk16VeYAf2JsNYB9ZLAXn", "P3M63oXZ4RlItM7d6tCP0FhU4UJB0VVm", "pvrI0I2hPgkxZ7mKqcVNCE", "IViSy7bNMMRqTObQqgQHZJ03ioQVAxI3", "AKSfxMAYbymYkKmkIHXjHayRWnu0Srjs", "XaZNcJans0E3GSdApjoK7oUba6xaED3H"};
    public static final InterfaceC0402Bd A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC0401Bc A02;
    public InterfaceC0432Cv A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0432Cv> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0430Ct A09;
    public final C0541Hh A0A;
    public final List<C0553Ht> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-64, -62, -84, -78, -106, -76, -63, -63, -62, -57, 115, -71, -68, -63, -73, 115, -58, -52, -63, -74, 115, -75, -52, -57, -72, -127, 115, -96, -62, -58, -57, 115, -65, -68, -66, -72, -65, -52, 115, -63, -62, -57, 115, -76, 115, -89, -59, -76, -63, -58, -61, -62, -59, -57, 115, -90, -57, -59, -72, -76, -64, -127, 115, 111, 113, 97, -53, -56, -39, -58};
    }

    static {
        A0G();
        A0E = new W8();
        A0F = C0557Hx.A08(A0D(0, 4, 102));
        A0G = C0557Hx.A08(A0D(62, 4, 21));
        A0H = C0557Hx.A08(A0D(66, 4, 106));
    }

    public W5() {
        this(0);
    }

    public W5(int i) {
        this(1, i);
    }

    public W5(int i, int i2) {
        this(i, new C0553Ht(0L), new WM(i2));
    }

    public W5(int i, C0553Ht c0553Ht, InterfaceC0430Ct interfaceC0430Ct) {
        this.A09 = (InterfaceC0430Ct) HI.A01(interfaceC0430Ct);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0553Ht);
        } else {
            ArrayList arrayList = new ArrayList();
            this.A0B = arrayList;
            arrayList.add(c0553Ht);
        }
        this.A0A = new C0541Hh(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(W5 w5) {
        int i = w5.A01;
        w5.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0432Cv> A4a = this.A09.A4a();
        int size = A4a.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC0432Cv> sparseArray = this.A06;
            int initialPayloadReadersSize = A4a.keyAt(i);
            sparseArray.put(initialPayloadReadersSize, A4a.valueAt(i));
        }
        this.A06.put(0, new WA(new W7(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void A8e(InterfaceC0401Bc interfaceC0401Bc) {
        this.A02 = interfaceC0401Bc;
        interfaceC0401Bc.AEx(new X0(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if ((r12 & 32) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:
    
        if ((r12 & 32) != 0) goto L54;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AE9(InterfaceC0400Bb interfaceC0400Bb, C0404Bh c0404Bh) throws IOException, InterruptedException {
        int continuityCounter;
        boolean payloadUnitStartIndicator;
        InterfaceC0432Cv interfaceC0432Cv;
        int read;
        int i;
        byte[] bArr = this.A0A.A00;
        if (9400 - this.A0A.A06() < 188) {
            C0541Hh c0541Hh = this.A0A;
            String[] strArr = A0D;
            if (strArr[6].charAt(6) != strArr[5].charAt(6)) {
                A0D[2] = "ymaFHNFZf9gck8KWGcKKw0IXvc03QQI3";
                int A04 = c0541Hh.A04();
                if (A04 > 0) {
                    System.arraycopy(bArr, this.A0A.A06(), bArr, 0, A04);
                }
                this.A0A.A0b(bArr, A04);
            }
            throw new RuntimeException();
        }
        while (true) {
            int A042 = this.A0A.A04();
            if (A0D[3].charAt(10) != 'l') {
                break;
            }
            String[] strArr2 = A0D;
            strArr2[7] = "MGe5GBh04RQe2KloppfecB6ZEIGbEoYE";
            strArr2[1] = "8AA3i6ilZVOjG9C6pEzYz1yKwgxBoNn5";
            if (A042 < 188) {
                int A07 = this.A0A.A07();
                String[] strArr3 = A0D;
                if (strArr3[6].charAt(6) != strArr3[5].charAt(6)) {
                    A0D[2] = "eAgKulLwfpKF0SfrtEP0OqsbKpe9pzNg";
                    read = interfaceC0400Bb.read(bArr, A07, 9400 - A07);
                    i = -1;
                    if (read == -1) {
                        break;
                    }
                    this.A0A.A0X(A07 + read);
                } else {
                    A0D[2] = "ccJ4V0ZamX9fhOj5uoAuEbTRuDAY2nBM";
                    read = interfaceC0400Bb.read(bArr, A07, 9400 - A07);
                    i = -1;
                    if (read == -1) {
                        break;
                    }
                    this.A0A.A0X(A07 + read);
                }
            } else {
                int position = this.A0A.A07();
                int limit = this.A0A.A06();
                while (limit < position && bArr[limit] != 71) {
                    limit++;
                }
                this.A0A.A0Y(limit);
                int previousCounter = limit + Opcodes.NEWARRAY;
                if (previousCounter > position) {
                    int i2 = this.A00 + (limit - limit);
                    this.A00 = i2;
                    if (this.A05 != 2 || i2 <= 376) {
                        return 0;
                    }
                    throw new C03519d(A0D(4, 58, 58));
                }
                this.A00 = 0;
                int pid = this.A0A.A08();
                if ((8388608 & pid) != 0) {
                    C0541Hh c0541Hh2 = this.A0A;
                    if (A0D[2].charAt(24) == 'y') {
                        throw new RuntimeException();
                    }
                    A0D[2] = "qLJ3C4wpvTds0ZGN514bh2BsPTU2CCIl";
                    c0541Hh2.A0Y(previousCounter);
                    return 0;
                }
                boolean z = (4194304 & pid) != 0;
                int i3 = 2096896 & pid;
                if (A0D[3].charAt(10) != 'l') {
                    continuityCounter = i3 >> 8;
                } else {
                    String[] strArr4 = A0D;
                    strArr4[6] = "UZBxTRohCkbmbL8TgZyccBrw6EXqioJ8";
                    strArr4[5] = "skRCCiBSOhxOXswyaciW8E5zJph5e4sW";
                    continuityCounter = i3 >> 8;
                }
                boolean payloadExists = (pid & 16) != 0;
                if (payloadExists) {
                    interfaceC0432Cv = this.A06.get(continuityCounter);
                } else {
                    interfaceC0432Cv = null;
                }
                if (interfaceC0432Cv != null) {
                    if (this.A05 != 2) {
                        int endOfPacket = pid & 15;
                        int i4 = this.A08.get(continuityCounter, endOfPacket - 1);
                        this.A08.put(continuityCounter, endOfPacket);
                        if (i4 == endOfPacket) {
                            this.A0A.A0Y(previousCounter);
                            return 0;
                        }
                        if (endOfPacket != ((i4 + 1) & 15)) {
                            interfaceC0432Cv.AEv();
                        }
                    }
                    if (payloadUnitStartIndicator) {
                        this.A0A.A0Z(this.A0A.A0E());
                    }
                    this.A0A.A0X(previousCounter);
                    interfaceC0432Cv.A4P(this.A0A, z);
                    this.A0A.A0X(position);
                    this.A0A.A0Y(previousCounter);
                    return 0;
                }
                this.A0A.A0Y(previousCounter);
                return 0;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    public final void AEw(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0399Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AFg(InterfaceC0400Bb interfaceC0400Bb) throws IOException, InterruptedException {
        byte[] bArr = this.A0A.A00;
        interfaceC0400Bb.ADl(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 != 5; i2++) {
                int j = bArr[(i2 * Opcodes.NEWARRAY) + i];
                if (j != 71) {
                    break;
                }
            }
            interfaceC0400Bb.AFe(i);
            return true;
        }
        return false;
    }
}
