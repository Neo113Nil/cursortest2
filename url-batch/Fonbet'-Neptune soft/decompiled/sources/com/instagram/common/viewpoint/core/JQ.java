package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class JQ {
    public static byte[] A07;
    public static String[] A08 = {"kwH2IgvZBGVpLaminurwcFHn", "J6e0tkh1Ff6tZSOwzR7AwbvIu8fVWeGQ", "bmiWbLOqDwiyYFUNe9As1QTlUgH4xYog", "dMXPCdyZdj7A6mfCnV5k3qiAvM2EcvhL", "upBvpVjUbbd4tW9uVknw3ChYtDg3XaKB", "lx9xVZ51GyjZV5dkAVxa", "4OpeXOwoxJhsdURDQeyl4TBKgN5cofiY", "16zjJfNWedSO35u1fMpvBODfGSUbEH9B"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final JI A04;
    public final JJ A05;
    public final JP A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JI A04(C4I c4i, int i) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i2 = 8;
        int A045 = c4i.A04(8);
        c4i.A09(8);
        int i3 = i - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i3 > 0) {
            int A046 = c4i.A04(i2);
            int A047 = c4i.A04(i2);
            int i4 = i3 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            int i5 = A047 & 1;
            String[] strArr = A08;
            if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A08[3] = "yhDNrhcDigDR24Kxe5BS389mQBs2ZM2v";
            if (i5 != 0) {
                A04 = c4i.A04(i2);
                A042 = c4i.A04(i2);
                A043 = c4i.A04(i2);
                A044 = c4i.A04(i2);
                i3 = i4 - 4;
            } else {
                A04 = c4i.A04(6) << 2;
                A042 = c4i.A04(4) << 4;
                A043 = c4i.A04(4) << 4;
                A044 = c4i.A04(2) << 6;
                i3 = i4 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[7] = "NRFOfVblegIP33K9RsgAL0VferudmJOb";
                A043 = 0;
                A044 = 255;
            }
            iArr[A046] = A00(255 - (A044 & 255), AbstractC01424a.A07((int) (A04 + ((A042 - 128) * 1.402d)), 0, 255), AbstractC01424a.A07((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, 255), AbstractC01424a.A07((int) (A04 + ((A043 - 128) * 1.772d)), 0, 255));
            i2 = 8;
        }
        return new JI(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JJ A05(C4I c4i) {
        int i;
        int i2;
        int i3;
        int i4;
        c4i.A09(4);
        boolean A0H = c4i.A0H();
        c4i.A09(3);
        int A04 = c4i.A04(16);
        int A042 = c4i.A04(16);
        if (A0H) {
            i = c4i.A04(16);
            i4 = c4i.A04(16);
            i2 = c4i.A04(16);
            i3 = c4i.A04(16);
        } else {
            i = 0;
            i2 = 0;
            i3 = A042;
            i4 = A04;
        }
        return new JJ(A04, A042, i, i4, i2, i3);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JN A08(C4I c4i, int i) {
        int i2 = 8;
        int A04 = c4i.A04(8);
        c4i.A09(4);
        boolean A0H = c4i.A0H();
        c4i.A09(3);
        int A042 = c4i.A04(16);
        int A043 = c4i.A04(16);
        int A044 = c4i.A04(3);
        int A045 = c4i.A04(3);
        c4i.A09(2);
        int A046 = c4i.A04(8);
        int A047 = c4i.A04(8);
        int A048 = c4i.A04(4);
        int A049 = c4i.A04(2);
        c4i.A09(2);
        int i3 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int A0410 = c4i.A04(16);
            int A0411 = c4i.A04(2);
            int A0412 = c4i.A04(2);
            int A0413 = c4i.A04(12);
            c4i.A09(4);
            int A0414 = c4i.A04(12);
            i3 -= 6;
            int i4 = 0;
            int i5 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i4 = c4i.A04(i2);
                i5 = c4i.A04(i2);
                i3 -= 2;
            }
            sparseArray.put(A0410, new JO(A0411, A0412, A0413, A0414, i4, i5));
            i2 = 8;
        }
        return new JN(A04, A0H, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{Utf8.REPLACEMENT_BYTE, Ascii.SUB, Ascii.SI, Ascii.SUB, 91, Ascii.GS, Ascii.DC2, Ascii.RS, Ascii.ETB, Ascii.US, 91, Ascii.ETB, Ascii.RS, Ascii.NAK, Ascii.FS, Ascii.SI, 19, 91, Ascii.RS, 3, Ascii.CAN, Ascii.RS, Ascii.RS, Ascii.US, 8, 91, Ascii.ETB, Ascii.DC2, Ascii.SYN, Ascii.DC2, Ascii.SI, 98, 80, 68, 118, 71, 84, 85, 67, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final List<C1781o2> A0I(byte[] bArr, int i) {
        C4I c4i = new C4I(bArr, i);
        while (c4i.A01() >= 48 && c4i.A04(8) == 15) {
            A0B(c4i, this.A06);
        }
        JL jl = this.A06.A01;
        if (jl == null) {
            return Collections.emptyList();
        }
        JJ jj = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || jj.A05 + 1 != this.A00.getWidth() || jj.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(jj.A05 + 1, jj.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<JM> sparseArray = jl.A03;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            this.A01.save();
            JM valueAt = sparseArray.valueAt(i2);
            JN jn = this.A06.A08.get(sparseArray.keyAt(i2));
            int i3 = valueAt.A00 + jj.A02;
            int i4 = valueAt.A01 + jj.A04;
            this.A01.clipRect(i3, i4, Math.min(jn.A08 + i3, jj.A01), Math.min(jn.A02 + i4, jj.A03));
            JI ji = this.A06.A06.get(jn.A00);
            if (ji == null && (ji = this.A06.A04.get(jn.A00)) == null) {
                ji = this.A04;
            }
            SparseArray<JO> sparseArray2 = jn.A09;
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                int keyAt = sparseArray2.keyAt(i5);
                JO valueAt2 = sparseArray2.valueAt(i5);
                JK jk = this.A06.A07.get(keyAt);
                if (jk == null) {
                    jk = this.A06.A05.get(keyAt);
                }
                if (jk != null) {
                    A0C(jk, ji, jn.A01, i3 + valueAt2.A02, i4 + valueAt2.A05, jk.A01 ? null : this.A02, this.A01);
                }
            }
            if (A08[4].charAt(14) != '9') {
                throw new RuntimeException();
            }
            A08[0] = "Y9Cu9eZ8R7HUBmBBCZ1DilUT";
            if (jn.A0A) {
                this.A03.setColor(jn.A01 == 3 ? ji.A03[jn.A07] : jn.A01 == 2 ? ji.A02[jn.A06] : ji.A01[jn.A05]);
                this.A01.drawRect(i3, i4, jn.A08 + i3, jn.A02 + i4, this.A03);
            }
            arrayList.add(new C3C().A0D(Bitmap.createBitmap(this.A00, i3, i4, jn.A08, jn.A02)).A04(i3 / jj.A05).A0A(0).A07(i4 / jj.A00, 0).A09(0).A06(jn.A08 / jj.A05).A03(jn.A02 / jj.A00).A0H());
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
            this.A01.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, Ascii.SI};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public JQ(int i, int i2) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new JJ(719, 575, 0, 719, 0, 575);
        this.A04 = new JI(0, A0F(), A0G(), A0H());
        this.A06 = new JP(i, i2);
    }

    public static int A00(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static int A01(C4I c4i, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z = false;
        do {
            int i3 = 0;
            int A04 = c4i.A04(2);
            if (A04 != 0) {
                i3 = 1;
            } else if (c4i.A0H()) {
                i3 = c4i.A04(3) + 3;
                A04 = c4i.A04(2);
            } else if (c4i.A0H()) {
                i3 = 1;
                A04 = 0;
            } else {
                switch (c4i.A04(2)) {
                    case 0:
                        z = true;
                        A04 = 0;
                        break;
                    case 1:
                        i3 = 2;
                        A04 = 0;
                        break;
                    case 2:
                        int A042 = c4i.A04(4);
                        if (A08[7].charAt(9) != 'e') {
                            A08[7] = "PWQusWjmzTX1R8w37TeIuijcGSqhz46U";
                            i3 = A042 + 12;
                            A04 = c4i.A04(2);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    case 3:
                        i3 = c4i.A04(8) + 29;
                        A04 = c4i.A04(2);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                canvas.drawRect(i, i2, i + i3, i2 + 1, paint);
            }
            i += i3;
        } while (!z);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r0 != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        r6 = r0 + 2;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        r7 = true;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r0 != 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A02(C4I c4i, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int A04;
        int i3 = i;
        boolean z = false;
        do {
            int peek = 0;
            int A042 = c4i.A04(4);
            if (A042 != 0) {
                peek = 1;
            } else if (c4i.A0H()) {
                if (!c4i.A0H()) {
                    peek = c4i.A04(2) + 4;
                    A042 = c4i.A04(4);
                } else {
                    switch (c4i.A04(2)) {
                        case 0:
                            peek = 1;
                            A042 = 0;
                            break;
                        case 1:
                            peek = 2;
                            A042 = 0;
                            break;
                        case 2:
                            peek = c4i.A04(4) + 9;
                            A042 = c4i.A04(4);
                            break;
                        case 3:
                            peek = c4i.A04(8) + 25;
                            A042 = c4i.A04(4);
                            break;
                        default:
                            A042 = 0;
                            break;
                    }
                }
            } else if (A08[0].length() != 24) {
                A08[1] = "Jb849HVzYsbrcyVvorQRSzDXgxwzOwbS";
                A04 = c4i.A04(3);
            } else {
                A08[3] = "lCytI93sja9tcovqvw8Z3JcTVPPUQzad";
                A04 = c4i.A04(3);
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                float f = i3;
                float f2 = i2;
                String[] strArr = A08;
                if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[2] = "7zyAW2neZYMKALasLQ64ygc21beBnsUa";
                strArr2[6] = "CykdyJVKnOvIvZ1RH2gJr9pO2NNGsRyJ";
                canvas.drawRect(f, f2, i3 + peek, i2 + 1, paint);
            }
            i3 += peek;
        } while (!z);
        return i3;
    }

    public static int A03(C4I c4i, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        int runLength;
        int i3 = i;
        boolean z = false;
        do {
            int A04 = c4i.A04(8);
            if (A04 != 0) {
                runLength = 1;
            } else if (!c4i.A0H()) {
                runLength = c4i.A04(7);
                if (runLength != 0) {
                    A04 = 0;
                } else {
                    z = true;
                    runLength = 0;
                    A04 = 0;
                }
            } else {
                runLength = c4i.A04(7);
                A04 = c4i.A04(8);
            }
            if (runLength != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                paint.setColor(iArr[A04]);
                if (A08[3].charAt(20) != '3') {
                    throw new RuntimeException();
                }
                A08[3] = "mqxvpcZRbZaRJOXRSA703vBu0XWYN9Vd";
                canvas.drawRect(i3, i2, i3 + runLength, i2 + 1, paint);
            }
            i3 += runLength;
        } while (!z);
        return i3;
    }

    public static JK A06(C4I c4i) {
        int A04 = c4i.A04(16);
        c4i.A09(4);
        int objectCodingMethod = c4i.A04(2);
        boolean A0H = c4i.A0H();
        c4i.A09(1);
        byte[] bottomFieldData = AbstractC01424a.A07;
        byte[] bArr = AbstractC01424a.A07;
        if (objectCodingMethod == 1) {
            int numberOfCodes = c4i.A04(8);
            c4i.A09(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int A042 = c4i.A04(16);
            int topFieldDataLength = c4i.A04(16);
            int objectId = A08[4].charAt(14);
            if (objectId != 57) {
                throw new RuntimeException();
            }
            A08[7] = "H05iJqDXaQUoFjCcOPsdhLa69PYGJoEl";
            if (A042 > 0) {
                bottomFieldData = new byte[A042];
                c4i.A0G(bottomFieldData, 0, A042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                c4i.A0G(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new JK(A04, A0H, bottomFieldData, bArr);
    }

    public static JL A07(C4I c4i, int i) {
        int A04 = c4i.A04(8);
        int A042 = c4i.A04(4);
        int A043 = c4i.A04(2);
        c4i.A09(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int remainingLength = c4i.A04(8);
            c4i.A09(8);
            int version = c4i.A04(16);
            int timeoutSecs = c4i.A04(16);
            i2 -= 6;
            sparseArray.put(remainingLength, new JM(version, timeoutSecs));
        }
        return new JL(A04, A042, A043, sparseArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r5 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        r1 = r8.A08;
        r0 = r4.A03;
        r0 = r1.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        r4.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r1 = r8.A08;
        r0 = r4.A03;
        r1.put(r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r5 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        if (r6 == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0111, code lost:
    
        r1 = r8.A01;
        r2 = A07(r7, r5);
        r0 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0119, code lost:
    
        if (r0 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r8.A01 = r2;
        r8.A08.clear();
        r8.A06.clear();
        r8.A07.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013d, code lost:
    
        if (r1 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013f, code lost:
    
        r1 = r1.A02;
        r0 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0143, code lost:
    
        if (r1 == r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        r8.A01 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        if (r6 == r4) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0B(C4I c4i, JP jp) {
        int pageId = c4i.A04(8);
        int A04 = c4i.A04(16);
        int A042 = c4i.A04(16);
        int dataFieldLimit = c4i.A02() + A042;
        int dataFieldLength = A042 * 8;
        int segmentType = c4i.A01();
        if (dataFieldLength > segmentType) {
            AnonymousClass44.A07(A09(31, 9, 48), A09(0, 31, 109));
            int segmentType2 = c4i.A01();
            c4i.A09(segmentType2);
            return;
        }
        switch (pageId) {
            case 16:
                int i = jp.A03;
                int dataFieldLength2 = A08[0].length();
                if (dataFieldLength2 == 24) {
                    String[] strArr = A08;
                    strArr[2] = "8IE5rQcmaz5UZt5DB4HgynTP0JDS9G2L";
                    strArr[6] = "0jBafq8KrrfMTCoyXHA3EFrvXh6eCdvZ";
                    break;
                } else {
                    A08[0] = "Hq1l6D9egrnTUyhluyir9I8C";
                    break;
                }
            case 17:
                JL jl = jp.A01;
                int segmentType3 = jp.A03;
                if (A04 == segmentType3 && jl != null) {
                    JN A082 = A08(c4i, A042);
                    int i2 = jl.A00;
                    int dataFieldLength3 = A08[4].charAt(14);
                    if (dataFieldLength3 == 57) {
                        A08[0] = "ijH7h91dhg9QFNoxZPsrwXGu";
                        break;
                    } else {
                        String[] strArr2 = A08;
                        strArr2[2] = "Zbq5EbbYoVc51AepmzNMcu8RWeX9tFKS";
                        strArr2[6] = "SzpXTRUgh7e1fMrIr1mTDXGfSUuiig9T";
                        break;
                    }
                }
                break;
            case 18:
                int segmentType4 = jp.A03;
                if (A04 == segmentType4) {
                    JI A043 = A04(c4i, A042);
                    SparseArray<JI> sparseArray = jp.A06;
                    int segmentType5 = A043.A00;
                    sparseArray.put(segmentType5, A043);
                    break;
                } else {
                    int segmentType6 = jp.A02;
                    if (A04 == segmentType6) {
                        JI A044 = A04(c4i, A042);
                        SparseArray<JI> sparseArray2 = jp.A04;
                        int segmentType7 = A044.A00;
                        sparseArray2.put(segmentType7, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType8 = jp.A03;
                if (A04 == segmentType8) {
                    JK A06 = A06(c4i);
                    SparseArray<JK> sparseArray3 = jp.A07;
                    int segmentType9 = A06.A00;
                    sparseArray3.put(segmentType9, A06);
                    break;
                } else {
                    int segmentType10 = jp.A02;
                    if (A04 == segmentType10) {
                        JK A062 = A06(c4i);
                        SparseArray<JK> sparseArray4 = jp.A05;
                        int i3 = A062.A00;
                        int dataFieldLength4 = A08[0].length();
                        if (dataFieldLength4 == 24) {
                            A08[3] = "cNAVN6CCWtYeoU1m0uPi3L7jVIjjgAwx";
                            sparseArray4.put(i3, A062);
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
                break;
            case 20:
                int segmentType11 = jp.A03;
                if (A04 == segmentType11) {
                    jp.A00 = A05(c4i);
                    break;
                }
                break;
        }
        int segmentType12 = c4i.A02();
        c4i.A0A(dataFieldLimit - segmentType12);
    }

    public static void A0C(JK jk, JI ji, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = ji.A03;
        } else if (i == 2) {
            iArr = ji.A02;
        } else {
            iArr = ji.A01;
        }
        A0D(jk.A03, iArr, i, i2, i3, paint, canvas);
        A0D(jk.A02, iArr, i, i2, i3 + 1, paint, canvas);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4 = i3;
        C4I c4i = new C4I(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        byte[] bArr4 = null;
        int line = i2;
        while (c4i.A01() != 0) {
            switch (c4i.A04(8)) {
                case 16:
                    if (i == 3) {
                        bArr2 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i == 2) {
                        bArr2 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        bArr2 = null;
                    }
                    line = A01(c4i, iArr, bArr2, line, i4, paint, canvas);
                    c4i.A06();
                    break;
                case 17:
                    if (i == 3) {
                        bArr3 = bArr4 == null ? A0B : bArr4;
                    } else {
                        bArr3 = null;
                    }
                    line = A02(c4i, iArr, bArr3, line, i4, paint, canvas);
                    c4i.A06();
                    break;
                case 18:
                    line = A03(c4i, iArr, null, line, i4, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, c4i);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, c4i);
                    break;
                case 34:
                    bArr4 = A0E(16, 8, c4i);
                    break;
                case 240:
                    i4 += 2;
                    line = i2;
                    break;
            }
        }
    }

    public static byte[] A0E(int i, int i2, C4I c4i) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c4i.A04(i2);
        }
        return bArr;
    }

    public static int[] A0F() {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = -1;
        iArr[2] = -16777216;
        String[] strArr = A08;
        if (strArr[2].charAt(19) == strArr[6].charAt(19)) {
            throw new RuntimeException();
        }
        A08[1] = "Jw8cEdbjQQjFC79Gk6sPH9AUdvvWBQg4";
        iArr[3] = -8421505;
        return iArr;
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                int i2 = (i & 1) != 0 ? 255 : 0;
                iArr[i] = A00(255, i2, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                int i5 = i & 4;
                if (A08[4].charAt(14) != '9') {
                    throw new RuntimeException();
                }
                A08[3] = "UrHD9QQTZDyJKzMppguU3aPtXoZ0irSR";
                iArr[i] = A00(255, i3, i4, i5 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x010d, code lost:
    
        if (r8 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0029, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e4, code lost:
    
        if (r8 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e6, code lost:
    
        r1 = 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0110, code lost:
    
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] A0H() {
        int i;
        int i2;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 < 8) {
                int i4 = (i3 & 1) != 0 ? 255 : 0;
                iArr[i3] = A00(63, i4, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i5 = i3 & Opcodes.L2I;
                int i6 = Opcodes.TABLESWITCH;
                switch (i5) {
                    case 0:
                        int i7 = (i3 & 1) != 0 ? 85 : 0;
                        int i8 = i7 + ((i3 & 16) != 0 ? Opcodes.TABLESWITCH : 0);
                        int i9 = ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? Opcodes.TABLESWITCH : 0);
                        i = (i3 & 4) == 0 ? 0 : 85;
                        if ((i3 & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i3] = A00(255, i8, i9, i + i6);
                        break;
                    case 8:
                        int i10 = ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? Opcodes.TABLESWITCH : 0);
                        int i11 = i3 & 2;
                        if (A08[4].charAt(14) == '9') {
                            A08[0] = "s2RCWxPvpwpJ3GpvuxZigl51";
                            break;
                        }
                        int i12 = i2 + ((i3 & 32) != 0 ? Opcodes.TABLESWITCH : 0);
                        i = (i3 & 4) == 0 ? 0 : 85;
                        if ((i3 & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i3] = A00(127, i10, i12, i + i6);
                        break;
                    case 128:
                        int i13 = ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0);
                        int i14 = ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0);
                        int i15 = ((i3 & 4) == 0 ? 0 : 43) + 127;
                        int i16 = i3 & 64;
                        if (A08[7].charAt(9) != 'e') {
                            A08[3] = "e63e4cS46GPtzp0vrxC333RpnvVdNaZZ";
                            iArr[i3] = A00(255, i13, i14, i15 + (i16 == 0 ? 0 : 85));
                            break;
                        } else {
                            throw new RuntimeException();
                        }
                    case Opcodes.L2I /* 136 */:
                        int i17 = (i3 & 1) != 0 ? 43 : 0;
                        iArr[i3] = A00(255, i17 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                        break;
                }
            }
        }
        return iArr;
    }

    public final void A0J() {
        this.A06.A00();
    }
}
