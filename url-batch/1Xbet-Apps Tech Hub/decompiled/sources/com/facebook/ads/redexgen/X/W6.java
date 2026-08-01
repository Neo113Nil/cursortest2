package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class W6 implements InterfaceC0426Co {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ W5 A04;
    public final C0540Hg A03 = new C0540Hg(new byte[5]);
    public final SparseArray<InterfaceC0432Cv> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Co
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A4O(C0541Hh c0541Hh) {
        int i;
        List list;
        C0553Ht c0553Ht;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int A04;
        int i7;
        SparseArray sparseArray;
        int i8;
        int i9;
        int i10;
        InterfaceC0401Bc interfaceC0401Bc;
        boolean z;
        InterfaceC0401Bc interfaceC0401Bc2;
        SparseBooleanArray sparseBooleanArray;
        InterfaceC0432Cv interfaceC0432Cv;
        SparseArray sparseArray2;
        InterfaceC0401Bc interfaceC0401Bc3;
        int i11;
        SparseBooleanArray sparseBooleanArray2;
        int i12;
        InterfaceC0430Ct interfaceC0430Ct;
        InterfaceC0432Cv A4f;
        int i13;
        InterfaceC0432Cv interfaceC0432Cv2;
        InterfaceC0430Ct interfaceC0430Ct2;
        InterfaceC0432Cv interfaceC0432Cv3;
        InterfaceC0401Bc interfaceC0401Bc4;
        int i14;
        int i15;
        List list2;
        List list3;
        if (c0541Hh.A0E() != 2) {
            return;
        }
        i = this.A04.A05;
        if (i != 1) {
            i14 = this.A04.A05;
            if (i14 != 2) {
                i15 = this.A04.A01;
                if (i15 != 1) {
                    list2 = this.A04.A0B;
                    c0553Ht = new C0553Ht(((C0553Ht) list2.get(0)).A03());
                    list3 = this.A04.A0B;
                    list3.add(c0553Ht);
                    c0541Hh.A0Z(2);
                    int A0I = c0541Hh.A0I();
                    i2 = 5;
                    c0541Hh.A0Z(5);
                    c0541Hh.A0a(this.A03, 2);
                    i3 = 4;
                    this.A03.A08(4);
                    i4 = 12;
                    c0541Hh.A0Z(this.A03.A04(12));
                    i5 = this.A04.A05;
                    i6 = 21;
                    if (i5 == 2) {
                        interfaceC0432Cv2 = this.A04.A03;
                        if (interfaceC0432Cv2 == null) {
                            C0429Cs c0429Cs = new C0429Cs(21, null, null, new byte[0]);
                            W5 w5 = this.A04;
                            interfaceC0430Ct2 = w5.A09;
                            w5.A03 = interfaceC0430Ct2.A4f(21, c0429Cs);
                            interfaceC0432Cv3 = this.A04.A03;
                            interfaceC0401Bc4 = this.A04.A02;
                            interfaceC0432Cv3.A8g(c0553Ht, interfaceC0401Bc4, new C0431Cu(A0I, 21, 8192));
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    A04 = c0541Hh.A04();
                    while (true) {
                        if (A04 > 0) {
                            int size = this.A02.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                int keyAt = this.A02.keyAt(i16);
                                sparseBooleanArray = this.A04.A07;
                                sparseBooleanArray.put(keyAt, true);
                                InterfaceC0432Cv valueAt = this.A01.valueAt(i16);
                                if (valueAt != null) {
                                    W5 w52 = this.A04;
                                    String[] strArr = A05;
                                    if (strArr[5].length() != strArr[4].length()) {
                                        A05[0] = "prZScD3eoAfWT6wNb9RUJeZXyBQ1ma5M";
                                        interfaceC0432Cv = w52.A03;
                                        if (valueAt != interfaceC0432Cv) {
                                            interfaceC0401Bc3 = this.A04.A02;
                                            valueAt.A8g(c0553Ht, interfaceC0401Bc3, new C0431Cu(A0I, keyAt, 8192));
                                        }
                                        sparseArray2 = this.A04.A06;
                                        sparseArray2.put(this.A02.valueAt(i16), valueAt);
                                    }
                                }
                            }
                            i7 = this.A04.A05;
                            if (i7 == 2) {
                                z = this.A04.A04;
                                if (z) {
                                    return;
                                }
                                interfaceC0401Bc2 = this.A04.A02;
                                interfaceC0401Bc2.A5T();
                                this.A04.A01 = 0;
                                this.A04.A04 = true;
                                return;
                            }
                            int i17 = 0;
                            sparseArray = this.A04.A06;
                            sparseArray.remove(this.A00);
                            W5 w53 = this.A04;
                            i8 = w53.A05;
                            if (i8 != 1) {
                                i9 = this.A04.A01;
                                i17 = i9 - 1;
                            }
                            w53.A01 = i17;
                            i10 = this.A04.A01;
                            if (i10 == 0) {
                                interfaceC0401Bc = this.A04.A02;
                                interfaceC0401Bc.A5T();
                                this.A04.A04 = true;
                                return;
                            }
                            return;
                        }
                        c0541Hh.A0a(this.A03, i2);
                        int A042 = this.A03.A04(8);
                        this.A03.A08(3);
                        int A043 = this.A03.A04(13);
                        this.A03.A08(i3);
                        int A044 = this.A03.A04(i4);
                        C0429Cs A00 = A00(c0541Hh, A044);
                        if (A042 == 6) {
                            A042 = A00.A00;
                        }
                        A04 -= A044 + 5;
                        i11 = this.A04.A05;
                        int i18 = i11 == 2 ? A042 : A043;
                        sparseBooleanArray2 = this.A04.A07;
                        if (!sparseBooleanArray2.get(i18)) {
                            i12 = this.A04.A05;
                            if (i12 == 2 && A042 == i6) {
                                W5 w54 = this.A04;
                                String[] strArr2 = A05;
                                if (strArr2[2].length() == strArr2[3].length()) {
                                    break;
                                }
                                A05[0] = "McoDKrxcl9g055s4tJZatQwjzcY0TxoH";
                                A4f = w54.A03;
                            } else {
                                interfaceC0430Ct = this.A04.A09;
                                A4f = interfaceC0430Ct.A4f(A042, A00);
                            }
                            i13 = this.A04.A05;
                            if (i13 != 2 || A043 < this.A02.get(i18, 8192)) {
                                this.A02.put(i18, A043);
                                this.A01.put(i18, A4f);
                            }
                        }
                        i2 = 5;
                        i3 = 4;
                        i4 = 12;
                        i6 = 21;
                    }
                    throw new RuntimeException();
                }
            }
        }
        list = this.A04.A0B;
        c0553Ht = (C0553Ht) list.get(0);
        c0541Hh.A0Z(2);
        int A0I2 = c0541Hh.A0I();
        i2 = 5;
        c0541Hh.A0Z(5);
        c0541Hh.A0a(this.A03, 2);
        i3 = 4;
        this.A03.A08(4);
        i4 = 12;
        c0541Hh.A0Z(this.A03.A04(12));
        i5 = this.A04.A05;
        i6 = 21;
        if (i5 == 2) {
        }
        this.A01.clear();
        this.A02.clear();
        A04 = c0541Hh.A04();
        while (true) {
            if (A04 > 0) {
            }
            i2 = 5;
            i3 = 4;
            i4 = 12;
            i6 = 21;
        }
        throw new RuntimeException();
    }

    public W6(W5 w5, int i) {
        this.A04 = w5;
        this.A00 = i;
    }

    private C0429Cs A00(C0541Hh c0541Hh, int i) {
        long j;
        long j2;
        long j3;
        int A06 = c0541Hh.A06();
        int i2 = A06 + i;
        int descriptorLength = -1;
        String str = null;
        List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos = null;
        while (c0541Hh.A06() < i2) {
            int descriptorsStartPosition = c0541Hh.A0E();
            int A062 = c0541Hh.A06() + c0541Hh.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c0541Hh.A0M();
                j = W5.A0F;
                if (A0M != j) {
                    j2 = W5.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != j2) {
                        j3 = W5.A0H;
                        if (A0M == j3) {
                            descriptorLength = 36;
                        }
                    } else {
                        descriptorLength = Opcodes.I2D;
                    }
                } else {
                    descriptorLength = Opcodes.LOR;
                }
            } else if (descriptorsStartPosition == 106) {
                descriptorLength = Opcodes.LOR;
            } else if (descriptorsStartPosition == 122) {
                descriptorLength = Opcodes.I2D;
            } else if (descriptorsStartPosition == 123) {
                descriptorLength = Opcodes.L2D;
            } else if (descriptorsStartPosition == 10) {
                str = c0541Hh.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                descriptorLength = 89;
                dvbSubtitleInfos = new ArrayList<>();
                while (c0541Hh.A06() < A062) {
                    String language = c0541Hh.A0S(3).trim();
                    int streamType = c0541Hh.A0E();
                    byte[] bArr = new byte[4];
                    c0541Hh.A0c(bArr, 0, 4);
                    dvbSubtitleInfos.add(new C0428Cr(language, streamType, bArr));
                }
            }
            c0541Hh.A0Z(A062 - c0541Hh.A06());
        }
        c0541Hh.A0Y(i2);
        return new C0429Cs(descriptorLength, str, dvbSubtitleInfos, Arrays.copyOfRange(c0541Hh.A00, A06, i2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0426Co
    public final void A8g(C0553Ht c0553Ht, InterfaceC0401Bc interfaceC0401Bc, C0431Cu c0431Cu) {
    }
}
