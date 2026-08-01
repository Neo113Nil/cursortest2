package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1108ba {
    public InterfaceC1111bd A00;
    public InterfaceC1109bb A01;
    public C1096bO A02;
    public final InterfaceC1118bk A04;
    public final InterfaceC1110bc A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC1109bb A03 = new C0507Fx(this);

    public C1108ba(InterfaceC1118bk interfaceC1118bk, InterfaceC1110bc interfaceC1110bc) {
        this.A04 = interfaceC1118bk;
        this.A05 = interfaceC1110bc;
    }

    public static C1108ba A01() {
        return new C1108ba(new G1(), null);
    }

    private void A03(AbstractC1112be abstractC1112be, InterfaceC1116bi interfaceC1116bi, InterfaceC0506Fw interfaceC0506Fw) {
        C1096bO A00 = C1096bO.A00(abstractC1112be, interfaceC1116bi, interfaceC0506Fw);
        this.A02 = A00;
        InterfaceC1111bd interfaceC1111bd = this.A00;
        if (interfaceC1111bd != null) {
            A00.A03(interfaceC1111bd);
        }
        this.A02.A04(this.A03);
    }

    public final void A04(View view) {
        C1096bO c1096bO = this.A02;
        if (c1096bO != null && view != null) {
            c1096bO.A01(view);
        }
    }

    public final void A05(View view, C1114bg c1114bg) {
        C1096bO c1096bO = this.A02;
        if (c1096bO != null && view != null && c1114bg != null) {
            c1096bO.A02(view, c1114bg);
        }
    }

    public final void A06(AbstractC1112be abstractC1112be, View view) {
        if (abstractC1112be != null && view != null) {
            C0508Fy c0508Fy = new C0508Fy(view, this.A04);
            final InterfaceC1110bc interfaceC1110bc = this.A05;
            A03(abstractC1112be, c0508Fy, new InterfaceC0506Fw(interfaceC1110bc) { // from class: com.facebook.ads.redexgen.X.3f
                public static byte[] A09;
                public static String[] A0A = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", ExifInterface.LONGITUDE_EAST, "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
                public static final String A0B;
                public long A00;
                public InterfaceC1111bd A01;
                public final InterfaceC1110bc A02;
                public final Map<String, C1100bS> A06 = new HashMap();
                public final C1101bT A04 = new C1101bT();
                public final C1101bT A03 = new C1101bT();
                public final List<Rect> A05 = new ArrayList(1);
                public final boolean A08 = false;
                public final boolean A07 = false;

                public static String A02(int i, int i2, int i3) {
                    byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                        copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
                    }
                    return new String(copyOfRange);
                }

                public static void A03() {
                    A09 = new byte[]{41, Ascii.NAK, Ascii.DC4, Ascii.SO, 93, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.CR, Ascii.DC2, Ascii.DC4, 19, 9, 93, Ascii.NAK, Ascii.FS, Ascii.SO, 93, 19, Ascii.DC2, 9, 93, Ascii.US, Ascii.CAN, Ascii.CAN, 19, 93, 16, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.EM, 93, Ascii.DC2, Ascii.SI, 93, Ascii.DC4, Ascii.SO, 93, Ascii.FS, 93, Ascii.SUB, Ascii.SI, Ascii.DC2, 8, Ascii.CR, 93, 10, Ascii.NAK, Ascii.DC4, Ascii.RS, Ascii.NAK, 93, 10, Ascii.DC4, 17, 17, 93, 19, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.SI, 93, Ascii.SI, Ascii.CAN, 9, 8, Ascii.SI, 19, 93, Ascii.FS, 93, 16, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, 16, Ascii.CAN, 19, 9, 93, Ascii.SO, Ascii.DC4, 19, Ascii.RS, Ascii.CAN, 93, Ascii.DC4, 9, 90, Ascii.SO, 93, 16, Ascii.FS, Ascii.EM, Ascii.CAN, 93, 8, Ascii.CR, 93, Ascii.DC2, Ascii.ESC, 93, Ascii.SO, 8, Ascii.US, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.SO, 93, 9, Ascii.NAK, Ascii.FS, 9, 93, Ascii.RS, Ascii.DC2, 8, 17, Ascii.EM, 93, Ascii.US, Ascii.CAN, 93, Ascii.DC2, Ascii.ESC, Ascii.ESC, Ascii.SO, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CAN, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, Base64.padSymbol, Base64.padSymbol, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
                }

                static {
                    A03();
                    A0B = C02113f.class.getSimpleName();
                }

                {
                    this.A02 = interfaceC1110bc;
                }

                public static Rect A00(C1100bS c1100bS) {
                    Rect rect;
                    Rect rect2;
                    Rect rect3;
                    Rect rect4;
                    Rect rect5;
                    if (c1100bS != null) {
                        rect = c1100bS.A02;
                        if (rect.top != Integer.MIN_VALUE) {
                            rect2 = c1100bS.A02;
                            if (rect2.left != Integer.MIN_VALUE) {
                                rect3 = c1100bS.A02;
                                String[] strArr = A0A;
                                if (strArr[1].length() == strArr[6].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[1] = "p";
                                strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                                if (rect3.right != Integer.MIN_VALUE) {
                                    rect4 = c1100bS.A02;
                                    if (rect4.bottom != Integer.MIN_VALUE) {
                                        rect5 = c1100bS.A02;
                                        return rect5;
                                    }
                                }
                            }
                        }
                    }
                    throw new IllegalStateException(A02(0, Opcodes.D2L, 38));
                }

                private C1100bS A01(C1114bg c1114bg, Rect rect, Rect rect2) {
                    boolean A06;
                    Rect rect3;
                    List list;
                    C1100bS c1100bS = this.A06.get(c1114bg.A04);
                    A06 = this.A04.A06(c1114bg);
                    if (A06) {
                        if (c1100bS != null) {
                            c1100bS.A01 = EnumC1104bW.A04;
                        } else {
                            c1100bS = C1100bS.A03(this.A00);
                            this.A06.put(c1114bg.A04, c1100bS);
                        }
                    }
                    rect3 = c1100bS.A02;
                    rect3.set(rect2);
                    list = c1100bS.A03;
                    list.add(new Rect(rect));
                    return c1100bS;
                }

                private void A04(C1101bT c1101bT) {
                    Collection<C1114bg> A01;
                    List list;
                    A01 = c1101bT.A01();
                    for (C1114bg c1114bg : A01) {
                        C1100bS c1100bS = this.A06.get(c1114bg.A04);
                        if (c1100bS == null) {
                            if (this.A02 != null) {
                                String str = A02(Opcodes.FCMPG, 36, 10) + c1114bg.A04;
                                throw new NullPointerException(A02(Opcodes.INVOKEDYNAMIC, 10, 85));
                            }
                        } else {
                            c1100bS.A01 = EnumC1104bW.A03;
                            list = c1100bS.A03;
                            list.clear();
                            c1114bg.A03(this);
                            if (this.A08) {
                                Map<String, C1100bS> map = this.A06;
                                String[] strArr = A0A;
                                if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0A;
                                strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                                strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                                map.remove(c1100bS);
                            } else {
                                continue;
                            }
                        }
                    }
                }

                private void A05(C1101bT c1101bT) {
                    Collection A00;
                    A00 = c1101bT.A00();
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        ((C1114bg) it.next()).A03(this);
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0506Fw
                public final void A3R(C1114bg c1114bg, Rect rect, Rect rect2) {
                    boolean A06;
                    List list;
                    Rect rect3;
                    List list2;
                    A01(c1114bg, rect, rect2);
                    C1114bg c1114bg2 = c1114bg.A01;
                    C1114bg parentViewpointData = C1114bg.A08;
                    if (c1114bg2 == parentViewpointData) {
                        return;
                    }
                    A06 = this.A03.A06(c1114bg2);
                    C1100bS parentViewProperties = this.A06.get(c1114bg2.A04);
                    if (A06) {
                        if (parentViewProperties == null) {
                            parentViewProperties = C1100bS.A03(this.A00);
                            rect3 = parentViewProperties.A02;
                            rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            this.A06.put(c1114bg2.A04, parentViewProperties);
                        } else {
                            list2 = parentViewProperties.A03;
                            list2.clear();
                            if (!this.A07 || c1114bg2.A04()) {
                                parentViewProperties.A01 = EnumC1104bW.A04;
                            }
                        }
                    }
                    list = parentViewProperties.A03;
                    list.add(new Rect(rect));
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0506Fw
                public final void A3x(long j, List<Rect> viewportRects) {
                    Collection A01;
                    Collection A012;
                    List list;
                    this.A00 = j;
                    this.A05.clear();
                    Iterator<Rect> it = viewportRects.iterator();
                    while (it.hasNext()) {
                        this.A05.add(new Rect(it.next()));
                    }
                    A01 = this.A04.A01();
                    Iterator it2 = A01.iterator();
                    while (it2.hasNext()) {
                        this.A06.remove(((C1114bg) it2.next()).A04);
                    }
                    A012 = this.A03.A01();
                    Iterator it3 = A012.iterator();
                    while (it3.hasNext()) {
                        this.A06.remove(((C1114bg) it3.next()).A04);
                    }
                    Iterator<C1100bS> it4 = this.A06.values().iterator();
                    while (it4.hasNext()) {
                        list = it4.next().A03;
                        list.clear();
                    }
                    this.A04.A04();
                    this.A03.A04();
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0506Fw
                public final void A5U() {
                    Collection A00;
                    Collection A002;
                    A05(this.A04);
                    A04(this.A04);
                    A05(this.A03);
                    A04(this.A03);
                    if (this.A01 != null) {
                        String obj = toString();
                        List<Rect> list = this.A05;
                        A00 = this.A04.A00();
                        A002 = this.A03.A00();
                        new C1099bR(obj, this, list, A00, A002);
                        throw new NullPointerException(A02(Opcodes.D2L, 7, 67));
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC1103bV
                public final void A71(C1114bg c1114bg, Rect rect) {
                    List list;
                    rect.setEmpty();
                    list = this.A06.get(c1114bg.A04).A03;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        rect.union((Rect) it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC1103bV
                public final EnumC1104bW A8A(C1114bg c1114bg) {
                    EnumC1104bW enumC1104bW;
                    enumC1104bW = this.A06.get(c1114bg.A04).A01;
                    return enumC1104bW;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC1103bV
                public final void A8C(Rect rect) {
                    rect.setEmpty();
                    Iterator<Rect> it = this.A05.iterator();
                    while (it.hasNext()) {
                        rect.union(it.next());
                    }
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC1103bV
                public final float A8D(C1114bg c1114bg) {
                    List<Rect> list;
                    C1100bS c1100bS = this.A06.get(c1114bg.A04);
                    if (c1100bS != null) {
                        Rect A00 = A00(c1100bS);
                        int height = A00.height() * A00.width();
                        int totalVisibleArea = 0;
                        list = c1100bS.A03;
                        for (Rect rect : list) {
                            totalVisibleArea += rect.height() * rect.width();
                        }
                        return totalVisibleArea / height;
                    }
                    return 0.0f;
                }

                @Override // com.facebook.ads.redexgen.X.InterfaceC0506Fw
                public final void AFW(InterfaceC1111bd interfaceC1111bd) {
                    this.A01 = interfaceC1111bd;
                }
            });
        }
    }
}
