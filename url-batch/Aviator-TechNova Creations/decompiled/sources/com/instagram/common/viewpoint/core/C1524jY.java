package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.jY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1524jY implements KW {
    public static String[] A05 = {"ueDbV1wfakHSWIQF7BEzGoLlZXsjLXAz", "DUk", "o0l", "JXBQRCbHgV51hCMTPiBs95yrGLtJ9vRB", "UUCtZFjpq77XJSMaCIYouODFHgisrwF4", "OUp13aafPcRzH6W84Z44X0AbLYnCU3jN", "RRsP4MaHzu2rfmisltpPpgYoVzHnYDNm", "WbSPhlBTq3Mh8neaDCFEdYJRI0JZWypJ"};
    public final int A00;
    public final /* synthetic */ C1523jX A04;
    public final C4I A03 = new C4I(new byte[5]);
    public final SparseArray<InterfaceC0552Kf> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // com.instagram.common.viewpoint.core.KW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A52(C4J c4j) {
        int i;
        List list;
        C4R c4r;
        int i2;
        int i3;
        SparseArray sparseArray;
        int i4;
        int i5;
        int i6;
        GY gy;
        boolean z;
        GY gy2;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        InterfaceC0552Kf interfaceC0552Kf;
        SparseArray sparseArray2;
        GY gy3;
        int i7;
        SparseBooleanArray sparseBooleanArray3;
        int i8;
        InterfaceC0549Kc interfaceC0549Kc;
        InterfaceC0552Kf A5N;
        int i9;
        InterfaceC0552Kf interfaceC0552Kf2;
        InterfaceC0549Kc interfaceC0549Kc2;
        InterfaceC0552Kf interfaceC0552Kf3;
        InterfaceC0552Kf interfaceC0552Kf4;
        GY gy4;
        int i10;
        int i11;
        List list2;
        List list3;
        if (c4j.A0I() != 2) {
            return;
        }
        i = this.A04.A09;
        if (i != 1) {
            i10 = this.A04.A09;
            if (i10 != 2) {
                i11 = this.A04.A02;
                if (i11 != 1) {
                    list2 = this.A04.A0I;
                    c4r = new C4R(((C4R) list2.get(0)).A02());
                    list3 = this.A04.A0I;
                    list3.add(c4r);
                    if ((c4j.A0I() & 128) != 0) {
                        return;
                    }
                    c4j.A0g(1);
                    int A0M = c4j.A0M();
                    int i12 = 3;
                    c4j.A0g(3);
                    c4j.A0h(this.A03, 2);
                    this.A03.A09(3);
                    int i13 = 13;
                    this.A04.A01 = this.A03.A04(13);
                    c4j.A0h(this.A03, 2);
                    int i14 = 4;
                    this.A03.A09(4);
                    c4j.A0g(this.A03.A04(12));
                    i2 = this.A04.A09;
                    int i15 = 21;
                    if (i2 == 2) {
                        interfaceC0552Kf2 = this.A04.A05;
                        if (interfaceC0552Kf2 == null) {
                            C0548Kb c0548Kb = new C0548Kb(21, null, null, AbstractC01484a.A07);
                            C1523jX c1523jX = this.A04;
                            interfaceC0549Kc2 = this.A04.A0H;
                            c1523jX.A05 = interfaceC0549Kc2.A5N(21, c0548Kb);
                            interfaceC0552Kf3 = this.A04.A05;
                            if (interfaceC0552Kf3 != null) {
                                interfaceC0552Kf4 = this.A04.A05;
                                gy4 = this.A04.A03;
                                interfaceC0552Kf4.AA2(c4r, gy4, new C0551Ke(A0M, 21, 8192));
                            }
                        }
                    }
                    this.A01.clear();
                    this.A02.clear();
                    int A07 = c4j.A07();
                    while (A07 > 0) {
                        c4j.A0h(this.A03, 5);
                        int A04 = this.A03.A04(8);
                        this.A03.A09(i12);
                        int A042 = this.A03.A04(i13);
                        this.A03.A09(i14);
                        int A043 = this.A03.A04(12);
                        C0548Kb A00 = A00(c4j, A043);
                        if (A04 == 6 || A04 == 5) {
                            A04 = A00.A00;
                        }
                        A07 -= A043 + 5;
                        i7 = this.A04.A09;
                        int i16 = i7 == 2 ? A04 : A042;
                        sparseBooleanArray3 = this.A04.A0C;
                        if (!sparseBooleanArray3.get(i16)) {
                            i8 = this.A04.A09;
                            if (i8 == 2 && A04 == i15) {
                                A5N = this.A04.A05;
                            } else {
                                interfaceC0549Kc = this.A04.A0H;
                                A5N = interfaceC0549Kc.A5N(A04, A00);
                            }
                            i9 = this.A04.A09;
                            if (i9 == 2) {
                                SparseIntArray sparseIntArray = this.A02;
                                String[] strArr = A05;
                                if (strArr[0].charAt(21) == strArr[3].charAt(21)) {
                                    throw new RuntimeException();
                                }
                                A05[7] = "JJxGvbQzsWrYD5XHKTSp80Ux1McJryio";
                                if (A042 >= sparseIntArray.get(i16, 8192)) {
                                }
                            }
                            this.A02.put(i16, A042);
                            this.A01.put(i16, A5N);
                        }
                        i15 = 21;
                        i12 = 3;
                        i14 = 4;
                        i13 = 13;
                    }
                    int size = this.A02.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        int keyAt = this.A02.keyAt(i17);
                        int valueAt = this.A02.valueAt(i17);
                        sparseBooleanArray = this.A04.A0C;
                        sparseBooleanArray.put(keyAt, true);
                        sparseBooleanArray2 = this.A04.A0D;
                        sparseBooleanArray2.put(valueAt, true);
                        InterfaceC0552Kf valueAt2 = this.A01.valueAt(i17);
                        if (valueAt2 != null) {
                            interfaceC0552Kf = this.A04.A05;
                            if (valueAt2 != interfaceC0552Kf) {
                                gy3 = this.A04.A03;
                                valueAt2.AA2(c4r, gy3, new C0551Ke(A0M, keyAt, 8192));
                            }
                            sparseArray2 = this.A04.A0B;
                            sparseArray2.put(valueAt, valueAt2);
                        }
                    }
                    i3 = this.A04.A09;
                    if (i3 == 2) {
                        z = this.A04.A08;
                        if (z) {
                            return;
                        }
                        gy2 = this.A04.A03;
                        String[] strArr2 = A05;
                        if (strArr2[1].length() != strArr2[2].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A05;
                        strArr3[0] = "hBvWu7G0FYrLQDeafFD7KKlceKy2jgRX";
                        strArr3[3] = "VoSHbxg0JUdlXnrGoiizfFeUaWFRK7d9";
                        gy2.A6G();
                        this.A04.A02 = 0;
                        this.A04.A08 = true;
                        return;
                    }
                    int i18 = 0;
                    sparseArray = this.A04.A0B;
                    sparseArray.remove(this.A00);
                    C1523jX c1523jX2 = this.A04;
                    i4 = this.A04.A09;
                    if (i4 != 1) {
                        i5 = this.A04.A02;
                        i18 = i5 - 1;
                    }
                    c1523jX2.A02 = i18;
                    i6 = this.A04.A02;
                    if (i6 == 0) {
                        gy = this.A04.A03;
                        gy.A6G();
                        this.A04.A08 = true;
                        return;
                    }
                    return;
                }
            }
        }
        list = this.A04.A0I;
        c4r = (C4R) list.get(0);
        if ((c4j.A0I() & 128) != 0) {
        }
    }

    public C1524jY(C1523jX c1523jX, int i) {
        this.A04 = c1523jX;
        this.A00 = i;
    }

    private C0548Kb A00(C4J c4j, int i) {
        int descriptorTag = c4j.A09();
        int descriptorLength = descriptorTag + i;
        int i2 = -1;
        String str = null;
        ArrayList arrayList = null;
        while (c4j.A09() < descriptorLength) {
            int positionOfNextDescriptor = c4j.A0I();
            int A09 = c4j.A09() + c4j.A0I();
            if (A09 > descriptorLength) {
                break;
            }
            if (positionOfNextDescriptor == 5) {
                long A0Q = c4j.A0Q();
                if (A0Q == 1094921523) {
                    i2 = Opcodes.LOR;
                } else if (A0Q == 1161904947) {
                    i2 = Opcodes.I2D;
                } else if (A0Q == 1094921524) {
                    i2 = Opcodes.IRETURN;
                } else if (A0Q == 1212503619) {
                    i2 = 36;
                }
            } else if (positionOfNextDescriptor == 106) {
                i2 = Opcodes.LOR;
            } else if (positionOfNextDescriptor == 122) {
                i2 = Opcodes.I2D;
            } else {
                String[] strArr = A05;
                String str2 = strArr[1];
                String str3 = strArr[2];
                int descriptorsStartPosition = str2.length();
                if (descriptorsStartPosition != str3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "GzIOqzBb8TAh93bRV2CN08O62ZCaAqRX";
                strArr2[3] = "fp9XAk3ifz38aVsym619EhTf04al4HEa";
                if (positionOfNextDescriptor == 127) {
                    int descriptorsStartPosition2 = c4j.A0I();
                    if (descriptorsStartPosition2 == 21) {
                        i2 = Opcodes.IRETURN;
                    }
                } else if (positionOfNextDescriptor == 123) {
                    i2 = Opcodes.L2D;
                } else {
                    String[] strArr3 = A05;
                    String str4 = strArr3[1];
                    String str5 = strArr3[2];
                    int descriptorsStartPosition3 = str4.length();
                    if (descriptorsStartPosition3 != str5.length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A05;
                    strArr4[5] = "wqYpRyaK4cDMDpt9hZQKwXCqV01Ydwf6";
                    strArr4[4] = "1qKbohas3rI7JmruTyrxsTuTEMq9fdbm";
                    if (positionOfNextDescriptor == 10) {
                        String A0W = c4j.A0W(3);
                        String[] strArr5 = A05;
                        String str6 = strArr5[1];
                        String str7 = strArr5[2];
                        int descriptorsStartPosition4 = str6.length();
                        if (descriptorsStartPosition4 != str7.length()) {
                            str = A0W.trim();
                        } else {
                            A05[6] = "aW10g0SpfKclE3j5mqsPv8AasgcB3Ji3";
                            str = A0W.trim();
                        }
                    } else if (positionOfNextDescriptor == 89) {
                        i2 = 89;
                        arrayList = new ArrayList();
                        while (c4j.A09() < A09) {
                            String trim = c4j.A0W(3).trim();
                            int A0I = c4j.A0I();
                            byte[] bArr = new byte[4];
                            c4j.A0k(bArr, 0, 4);
                            arrayList.add(new C0547Ka(trim, A0I, bArr));
                        }
                    } else if (positionOfNextDescriptor == 111) {
                        i2 = 257;
                    }
                }
            }
            c4j.A0g(A09 - c4j.A09());
        }
        c4j.A0f(descriptorLength);
        return new C0548Kb(i2, str, arrayList, Arrays.copyOfRange(c4j.A0l(), descriptorTag, descriptorLength));
    }

    @Override // com.instagram.common.viewpoint.core.KW
    public final void AA2(C4R c4r, GY gy, C0551Ke c0551Ke) {
    }
}
