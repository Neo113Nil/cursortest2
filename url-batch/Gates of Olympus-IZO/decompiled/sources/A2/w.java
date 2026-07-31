package A2;

import B0.AbstractC0008e;
import B0.C;
import B0.C0005b;
import B0.C0007d;
import android.text.Layout;
import android.text.TextUtils;
import e2.AbstractC0381e;
import h2.AbstractC0447i;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w implements B0.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f194c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f195d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f196e;

    /* renamed from: f, reason: collision with root package name */
    public Object f197f;

    public w(q qVar, String str, o oVar, M1.B b2, Map map) {
        Z1.i.f(qVar, "url");
        Z1.i.f(str, "method");
        this.f193b = qVar;
        this.f194c = str;
        this.f195d = oVar;
        this.f196e = map;
    }

    @Override // B0.n
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f197f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((B0.m) arrayList.get(i3)).f285a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.g, java.lang.Object] */
    @Override // B0.n
    public float b() {
        return ((Number) this.f196e.getValue()).floatValue();
    }

    public float c(int i3, boolean z3) {
        Layout layout = (Layout) this.f193b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i3));
        if (i3 > lineEnd) {
            i3 = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i3) : layout.getSecondaryHorizontal(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0149, code lost:
    
        if (r3.getRunCount() == 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0037, code lost:
    
        if (r30 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float d(int i3, boolean z3, boolean z4) {
        int lineForOffset;
        int i4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        Bidi bidi;
        int i7;
        boolean z7;
        boolean z8;
        int i8;
        int i9;
        boolean z9;
        boolean z10;
        int i10 = i3;
        if (!z4) {
            return c(i3, z3);
        }
        Layout layout = (Layout) this.f193b;
        if (i10 <= 0) {
            lineForOffset = 0;
        } else {
            if (i10 >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(i10);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == i10 || lineEnd == i10) {
                    if (lineStart != i10) {
                        if (!z4) {
                            lineForOffset++;
                        }
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i10 != lineStart2 && i10 != lineEnd2) {
            return c(i3, z3);
        }
        if (i10 == 0 || i10 == layout.getText().length()) {
            return c(i3, z3);
        }
        ArrayList arrayList = (ArrayList) this.f194c;
        int a02 = M1.m.a0(arrayList, Integer.valueOf(i3));
        int i11 = a02 < 0 ? -(a02 + 1) : a02 + 1;
        if (z4 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                i11 = i12;
            }
        }
        boolean z11 = layout.getParagraphDirection(layout.getLineForOffset(i11 == 0 ? 0 : ((Number) arrayList.get(i11 + (-1))).intValue())) == -1;
        int e3 = e(lineEnd2, lineStart2);
        int intValue = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
        int i13 = lineStart2 - intValue;
        int i14 = e3 - intValue;
        boolean[] zArr = (boolean[]) this.f196e;
        boolean z12 = zArr[i11];
        ArrayList arrayList2 = (ArrayList) this.f195d;
        if (z12) {
            i5 = lineForOffset;
            i4 = e3;
            bidi = (Bidi) arrayList2.get(i11);
            z5 = z11;
            i6 = -1;
        } else {
            int intValue2 = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i11)).intValue();
            int i15 = intValue3 - intValue2;
            i4 = e3;
            char[] cArr = (char[]) this.f197f;
            i5 = lineForOffset;
            if (cArr == null || cArr.length < i15) {
                cArr = new char[i15];
            }
            z5 = z11;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i15)) {
                int intValue4 = i11 == 0 ? 0 : ((Number) arrayList.get(i11 - 1)).intValue();
                i6 = -1;
                bidi = new Bidi(cArr, 0, null, 0, i15, layout.getParagraphDirection(layout.getLineForOffset(intValue4)) == -1 ? 1 : 0);
                z6 = true;
            } else {
                i6 = -1;
                z6 = true;
            }
            bidi = null;
            arrayList2.set(i11, bidi);
            zArr[i11] = z6;
            if (bidi != null) {
                char[] cArr2 = (char[]) this.f197f;
                cArr = cArr == cArr2 ? null : cArr2;
            }
            this.f197f = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i13, i14) : null;
        if (createLineBidi == null) {
            i7 = i5;
            z7 = z5;
            z8 = true;
        } else if (createLineBidi.getRunCount() == 1) {
            z8 = true;
            i7 = i5;
            z7 = z5;
        } else {
            int runCount = createLineBidi.getRunCount();
            C0.o[] oVarArr = new C0.o[runCount];
            for (int i16 = 0; i16 < runCount; i16++) {
                oVarArr[i16] = new C0.o(createLineBidi.getRunStart(i16) + lineStart2, createLineBidi.getRunLimit(i16) + lineStart2, createLineBidi.getRunLevel(i16) % 2 == 1);
            }
            int runCount2 = createLineBidi.getRunCount();
            byte[] bArr = new byte[runCount2];
            for (int i17 = 0; i17 < runCount2; i17++) {
                bArr[i17] = (byte) createLineBidi.getRunLevel(i17);
            }
            Bidi.reorderVisually(bArr, 0, oVarArr, 0, runCount);
            if (i10 != lineStart2) {
                int i18 = i5;
                boolean z13 = z5;
                if (i10 > i4) {
                    i10 = e(i10, lineStart2);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i8 = i6;
                        break;
                    }
                    if (oVarArr[i19].f452b == i10) {
                        i8 = i19;
                        break;
                    }
                    i19++;
                }
                boolean z14 = (z3 || z13 == oVarArr[i8].f453c) ? z13 : !z13;
                return (i8 == 0 && z14) ? layout.getLineLeft(i18) : (i8 != runCount - 1 || z14) ? z14 ? layout.getPrimaryHorizontal(oVarArr[i8 - 1].f452b) : layout.getPrimaryHorizontal(oVarArr[i8 + 1].f452b) : layout.getLineRight(i18);
            }
            int i20 = 0;
            while (true) {
                if (i20 >= runCount) {
                    i9 = i6;
                    break;
                }
                if (oVarArr[i20].f451a == i10) {
                    i9 = i20;
                    break;
                }
                i20++;
            }
            C0.o oVar = oVarArr[i9];
            if (z3) {
                z9 = z5;
            } else {
                z9 = z5;
                if (z9 != oVar.f453c) {
                    z10 = z9;
                    if (i9 == 0 || !z10) {
                        return (i9 == runCount - 1 || z10) ? !z10 ? layout.getPrimaryHorizontal(oVarArr[i9 - 1].f451a) : layout.getPrimaryHorizontal(oVarArr[i9 + 1].f451a) : layout.getLineRight(i5);
                    }
                    return layout.getLineLeft(i5);
                }
            }
            z10 = !z9;
            if (i9 == 0) {
            }
            if (i9 == runCount - 1) {
            }
        }
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z3 || z7 == isRtlCharAt) {
            z7 = !z7 ? z8 : false;
        }
        if (i10 != lineStart2) {
            z7 = !z7 ? z8 : false;
        }
        return z7 ? layout.getLineLeft(i7) : layout.getLineRight(i7);
    }

    public int e(int i3, int i4) {
        while (i3 > i4) {
            char charAt = ((Layout) this.f193b).getText().charAt(i3 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Z1.i.g(charAt, 8192) < 0 || Z1.i.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i3--;
        }
        return i3;
    }

    public k f() {
        k kVar = new k(false);
        kVar.f111e = new LinkedHashMap();
        kVar.f108b = (q) this.f193b;
        kVar.f109c = (String) this.f194c;
        Map map = (Map) this.f196e;
        kVar.f111e = map.isEmpty() ? new LinkedHashMap() : M1.B.R(map);
        kVar.f110d = ((o) this.f195d).d();
        return kVar;
    }

    public String toString() {
        switch (this.f192a) {
            case 0:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f194c);
                sb.append(", url=");
                sb.append((q) this.f193b);
                o oVar = (o) this.f195d;
                if (oVar.size() != 0) {
                    sb.append(", headers=[");
                    int i3 = 0;
                    for (Object obj : oVar) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            M1.m.f0();
                            throw null;
                        }
                        L1.j jVar = (L1.j) obj;
                        String str = (String) jVar.f2708d;
                        String str2 = (String) jVar.f2709e;
                        if (i3 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i3 = i4;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f196e;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public w(Layout layout) {
        this.f193b = layout;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        do {
            int q0 = AbstractC0447i.q0(((Layout) this.f193b).getText(), '\n', i3, false, 4);
            i3 = q0 < 0 ? ((Layout) this.f193b).getText().length() : q0 + 1;
            arrayList.add(Integer.valueOf(i3));
        } while (i3 < ((Layout) this.f193b).getText().length());
        this.f194c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(null);
        }
        this.f195d = arrayList2;
        this.f196e = new boolean[((ArrayList) this.f194c).size()];
        ((ArrayList) this.f194c).size();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public w(C0007d c0007d, C c3, List list, M0.b bVar, F0.e eVar) {
        B0.o oVar;
        int i3;
        String str;
        ?? r3;
        M1.u uVar;
        int i4;
        ArrayList arrayList;
        List list2;
        M1.u uVar2;
        ArrayList arrayList2;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        C0007d c0007d2 = c0007d;
        this.f193b = c0007d2;
        this.f194c = list;
        L1.h hVar = L1.h.f2706e;
        this.f195d = I2.d.E(hVar, new B0.k(this, 1));
        this.f196e = I2.d.E(hVar, new B0.k(this, 0));
        int i9 = AbstractC0008e.f255a;
        int length = c0007d2.f251a.length();
        M1.u uVar3 = M1.u.f2803d;
        List list3 = c0007d2.f253c;
        list3 = list3 == null ? uVar3 : list3;
        ArrayList arrayList3 = new ArrayList();
        int size = list3.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            oVar = c3.f236b;
            if (i10 >= size) {
                break;
            }
            C0005b c0005b = (C0005b) list3.get(i10);
            B0.o oVar2 = (B0.o) c0005b.f246a;
            int i12 = c0005b.f247b;
            if (i12 != i11) {
                arrayList3.add(new C0005b(oVar, i11, i12));
            }
            B0.o a3 = oVar.a(oVar2);
            int i13 = c0005b.f248c;
            arrayList3.add(new C0005b(a3, i12, i13));
            i10++;
            i11 = i13;
        }
        if (i11 != length) {
            arrayList3.add(new C0005b(oVar, i11, length));
        }
        if (arrayList3.isEmpty()) {
            i3 = 0;
            arrayList3.add(new C0005b(oVar, 0, 0));
        } else {
            i3 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i14 = i3;
        while (i14 < size2) {
            C0005b c0005b2 = (C0005b) arrayList3.get(i14);
            int i15 = c0005b2.f247b;
            String str3 = c0007d2.f251a;
            int i16 = c0005b2.f248c;
            if (i15 != i16) {
                str = str3.substring(i15, i16);
                Z1.i.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            if (i15 == i16 || (r3 = c0007d2.f252b) == 0) {
                uVar = uVar3;
                i4 = size2;
                arrayList = arrayList3;
                list2 = null;
                uVar2 = null;
            } else {
                if (i15 != 0 || i16 < str3.length()) {
                    ArrayList arrayList5 = new ArrayList(r3.size());
                    int size3 = r3.size();
                    uVar = uVar3;
                    int i17 = 0;
                    List list4 = r3;
                    while (i17 < size3) {
                        int i18 = size3;
                        Object obj = list4.get(i17);
                        List list5 = list4;
                        C0005b c0005b3 = (C0005b) obj;
                        int i19 = size2;
                        if (AbstractC0008e.b(i15, i16, c0005b3.f247b, c0005b3.f248c)) {
                            arrayList5.add(obj);
                        }
                        i17++;
                        size3 = i18;
                        list4 = list5;
                        size2 = i19;
                    }
                    i4 = size2;
                    r3 = new ArrayList(arrayList5.size());
                    int size4 = arrayList5.size();
                    int i20 = 0;
                    while (i20 < size4) {
                        C0005b c0005b4 = (C0005b) arrayList5.get(i20);
                        r3.add(new C0005b(c0005b4.f246a, AbstractC0381e.r(c0005b4.f247b, i15, i16) - i15, AbstractC0381e.r(c0005b4.f248c, i15, i16) - i15));
                        i20++;
                        size4 = size4;
                        arrayList5 = arrayList5;
                        arrayList3 = arrayList3;
                    }
                } else {
                    uVar = uVar3;
                    i4 = size2;
                }
                arrayList = arrayList3;
                list2 = null;
                uVar2 = r3;
            }
            new C0007d(str, uVar2, list2, list2);
            B0.o oVar3 = (B0.o) c0005b2.f246a;
            if (L0.h.a(oVar3.f289b, Integer.MIN_VALUE)) {
                arrayList2 = arrayList4;
                i5 = i14;
                str2 = str;
                i6 = i16;
                oVar3 = new B0.o(oVar3.f288a, oVar.f289b, oVar3.f290c, oVar3.f291d, oVar3.f292e, oVar3.f293f, oVar3.f294g, oVar3.f295h, oVar3.f296i);
            } else {
                arrayList2 = arrayList4;
                str2 = str;
                i5 = i14;
                i6 = i16;
            }
            C c4 = new C(c3.f235a, oVar.a(oVar3));
            M1.u uVar4 = uVar2 == null ? uVar : uVar2;
            List list6 = (List) this.f194c;
            ArrayList arrayList6 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i21 = 0;
            while (true) {
                i7 = c0005b2.f247b;
                if (i21 >= size5) {
                    break;
                }
                Object obj2 = list6.get(i21);
                C0005b c0005b5 = (C0005b) obj2;
                int i22 = i6;
                if (AbstractC0008e.b(i7, i22, c0005b5.f247b, c0005b5.f248c)) {
                    arrayList6.add(obj2);
                }
                i21++;
                i6 = i22;
            }
            int i23 = i6;
            ArrayList arrayList7 = new ArrayList(arrayList6.size());
            int size6 = arrayList6.size();
            for (int i24 = 0; i24 < size6; i24++) {
                C0005b c0005b6 = (C0005b) arrayList6.get(i24);
                int i25 = c0005b6.f247b;
                if (i7 <= i25 && (i8 = c0005b6.f248c) <= i23) {
                    arrayList7.add(new C0005b(c0005b6.f246a, i25 - i7, i8 - i7));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            B0.m mVar = new B0.m(new I0.d(str2, c4, uVar4, arrayList7, eVar, bVar), i7, i23);
            ArrayList arrayList8 = arrayList2;
            arrayList8.add(mVar);
            i14 = i5 + 1;
            arrayList4 = arrayList8;
            uVar3 = uVar;
            size2 = i4;
            arrayList3 = arrayList;
            c0007d2 = c0007d;
        }
        this.f197f = arrayList4;
    }
}
