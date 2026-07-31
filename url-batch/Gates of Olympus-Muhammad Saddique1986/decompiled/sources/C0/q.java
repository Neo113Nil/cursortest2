package C0;

import a.AbstractC0235a;
import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0730j;

/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f628a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f630c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f631d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f632e;

    /* renamed from: f, reason: collision with root package name */
    public Object f633f;

    public q(G2.n nVar, String str, G2.l lVar, AbstractC0235a abstractC0235a, Map map) {
        f2.j.f(nVar, "url");
        f2.j.f(str, "method");
        this.f630c = nVar;
        this.f631d = str;
        this.f632e = lVar;
        this.f633f = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    @Override // C0.t
    public float a() {
        return ((Number) this.f632e.getValue()).floatValue();
    }

    @Override // C0.t
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f629b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((s) arrayList.get(i3)).f641a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R1.f, java.lang.Object] */
    @Override // C0.t
    public float c() {
        return ((Number) this.f633f.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r1.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi d(int i3) {
        Bidi bidi;
        boolean[] zArr = (boolean[]) this.f632e;
        boolean z3 = zArr[i3];
        ArrayList arrayList = (ArrayList) this.f631d;
        if (z3) {
            return (Bidi) arrayList.get(i3);
        }
        ArrayList arrayList2 = (ArrayList) this.f629b;
        int intValue = i3 == 0 ? 0 : ((Number) arrayList2.get(i3 - 1)).intValue();
        int intValue2 = ((Number) arrayList2.get(i3)).intValue();
        int i4 = intValue2 - intValue;
        char[] cArr = (char[]) this.f633f;
        if (cArr == null || cArr.length < i4) {
            cArr = new char[i4];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.f630c;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i4)) {
            bidi = new Bidi(cArr2, 0, null, 0, i4, layout.getParagraphDirection(layout.getLineForOffset(h(i3))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList.set(i3, bidi);
        zArr[i3] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f633f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f633f = cArr2;
        return bidi;
    }

    public float e(int i3, boolean z3) {
        Layout layout = (Layout) this.f630c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i3));
        if (i3 > lineEnd) {
            i3 = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i3) : layout.getSecondaryHorizontal(i3);
    }

    public float f(int i3, boolean z3, boolean z4) {
        int i4;
        int i5;
        int i6 = i3;
        if (!z4) {
            return e(i3, z3);
        }
        Layout layout = (Layout) this.f630c;
        int c2 = D0.B.c(layout, i6, z4);
        int lineStart = layout.getLineStart(c2);
        int lineEnd = layout.getLineEnd(c2);
        if (i6 != lineStart && i6 != lineEnd) {
            return e(i3, z3);
        }
        if (i6 == 0 || i6 == layout.getText().length()) {
            return e(i3, z3);
        }
        int g3 = g(i6, z4);
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(h(g3))) == -1;
        int i7 = i(lineEnd, lineStart);
        int h3 = h(g3);
        int i8 = lineStart - h3;
        int i9 = i7 - h3;
        Bidi d3 = d(g3);
        Bidi createLineBidi = d3 != null ? d3.createLineBidi(i8, i9) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z3 || z5 == isRtlCharAt) {
                z5 = !z5;
            }
            return i6 == lineStart ? z5 : !z5 ? layout.getLineLeft(c2) : layout.getLineRight(c2);
        }
        int runCount = createLineBidi.getRunCount();
        D0.s[] sVarArr = new D0.s[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            sVarArr[i10] = new D0.s(createLineBidi.getRunStart(i10) + lineStart, createLineBidi.getRunLimit(i10) + lineStart, createLineBidi.getRunLevel(i10) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i11 = 0; i11 < runCount2; i11++) {
            bArr[i11] = (byte) createLineBidi.getRunLevel(i11);
        }
        Bidi.reorderVisually(bArr, 0, sVarArr, 0, runCount);
        if (i6 == lineStart) {
            int i12 = 0;
            while (true) {
                if (i12 >= runCount) {
                    i5 = -1;
                    break;
                }
                if (sVarArr[i12].f855a == i6) {
                    i5 = i12;
                    break;
                }
                i12++;
            }
            boolean z6 = (z3 || z5 == sVarArr[i5].f857c) ? !z5 : z5;
            return (i5 == 0 && z6) ? layout.getLineLeft(c2) : (i5 != runCount - 1 || z6) ? z6 ? layout.getPrimaryHorizontal(sVarArr[i5 - 1].f855a) : layout.getPrimaryHorizontal(sVarArr[i5 + 1].f855a) : layout.getLineRight(c2);
        }
        if (i6 > i7) {
            i6 = i(i6, lineStart);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= runCount) {
                i4 = -1;
                break;
            }
            if (sVarArr[i13].f856b == i6) {
                i4 = i13;
                break;
            }
            i13++;
        }
        boolean z7 = (z3 || z5 == sVarArr[i4].f857c) ? z5 : !z5;
        return (i4 == 0 && z7) ? layout.getLineLeft(c2) : (i4 != runCount - 1 || z7) ? z7 ? layout.getPrimaryHorizontal(sVarArr[i4 - 1].f856b) : layout.getPrimaryHorizontal(sVarArr[i4 + 1].f856b) : layout.getLineRight(c2);
    }

    public int g(int i3, boolean z3) {
        ArrayList arrayList = (ArrayList) this.f629b;
        int y02 = S1.m.y0(arrayList, Integer.valueOf(i3));
        int i4 = y02 < 0 ? -(y02 + 1) : y02 + 1;
        if (z3 && i4 > 0) {
            int i5 = i4 - 1;
            if (i3 == ((Number) arrayList.get(i5)).intValue()) {
                return i5;
            }
        }
        return i4;
    }

    public int h(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f629b).get(i3 - 1)).intValue();
    }

    public int i(int i3, int i4) {
        while (i3 > i4) {
            char charAt = ((Layout) this.f630c).getText().charAt(i3 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((f2.j.g(charAt, 8192) < 0 || f2.j.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i3--;
        }
        return i3;
    }

    public G1.g j() {
        G1.g gVar = new G1.g(false);
        gVar.f2096h = new LinkedHashMap();
        gVar.f2093e = (G2.n) this.f630c;
        gVar.f2094f = (String) this.f631d;
        Map map = (Map) this.f633f;
        gVar.f2096h = map.isEmpty() ? new LinkedHashMap() : S1.B.N(map);
        gVar.f2095g = ((G2.l) this.f632e).d();
        return gVar;
    }

    public String toString() {
        switch (this.f628a) {
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f631d);
                sb.append(", url=");
                sb.append((G2.n) this.f630c);
                G2.l lVar = (G2.l) this.f632e;
                if (lVar.size() != 0) {
                    sb.append(", headers=[");
                    int i3 = 0;
                    for (Object obj : lVar) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            S1.m.D0();
                            throw null;
                        }
                        R1.i iVar = (R1.i) obj;
                        String str = (String) iVar.f4150d;
                        String str2 = (String) iVar.f4151e;
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
                Map map = (Map) this.f633f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public q(Layout layout) {
        this.f630c = layout;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        do {
            int H3 = AbstractC0730j.H(((Layout) this.f630c).getText(), '\n', i3, false, 4);
            i3 = H3 < 0 ? ((Layout) this.f630c).getText().length() : H3 + 1;
            arrayList.add(Integer.valueOf(i3));
        } while (i3 < ((Layout) this.f630c).getText().length());
        this.f629b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(null);
        }
        this.f631d = arrayList2;
        this.f632e = new boolean[((ArrayList) this.f629b).size()];
        ((ArrayList) this.f629b).size();
    }

    public q(C0031g c0031g, K k3, List list, O0.b bVar, H0.d dVar) {
        u uVar;
        String str;
        int i3;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        String str2;
        int i5;
        int i6;
        int i7;
        C0031g c0031g2 = c0031g;
        this.f630c = c0031g2;
        this.f631d = list;
        R1.g gVar = R1.g.f4148e;
        this.f632e = R1.a.c(gVar, new p(this, 1));
        this.f633f = R1.a.c(gVar, new p(this, 0));
        C0031g c0031g3 = AbstractC0032h.f600a;
        int length = c0031g2.f596a.length();
        List list2 = c0031g2.f598c;
        list2 = list2 == null ? S1.u.f4320d : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            uVar = k3.f572b;
            if (i8 >= size) {
                break;
            }
            C0029e c0029e = (C0029e) list2.get(i8);
            u uVar2 = (u) c0029e.f592a;
            int i10 = c0029e.f593b;
            if (i10 != i9) {
                arrayList3.add(new C0029e(i9, i10, uVar));
            }
            u a3 = uVar.a(uVar2);
            int i11 = c0029e.f594c;
            arrayList3.add(new C0029e(i10, i11, a3));
            i8++;
            i9 = i11;
        }
        if (i9 != length) {
            arrayList3.add(new C0029e(i9, length, uVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new C0029e(0, 0, uVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            C0029e c0029e2 = (C0029e) arrayList3.get(i12);
            int i13 = c0029e2.f593b;
            int i14 = c0029e2.f594c;
            if (i13 != i14) {
                str = c0031g2.f596a.substring(i13, i14);
                f2.j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            C0031g c0031g4 = new C0031g(str, AbstractC0032h.b(c0031g2, i13, i14), null, null);
            u uVar3 = (u) c0029e2.f592a;
            if (N0.k.a(uVar3.f645b, Integer.MIN_VALUE)) {
                i3 = size2;
                arrayList = arrayList3;
                i4 = i12;
                arrayList2 = arrayList4;
                str2 = str;
                i5 = i14;
                uVar3 = new u(uVar3.f644a, uVar.f645b, uVar3.f646c, uVar3.f647d, uVar3.f648e, uVar3.f649f, uVar3.f650g, uVar3.f651h, uVar3.f652i);
            } else {
                arrayList2 = arrayList4;
                i3 = size2;
                arrayList = arrayList3;
                i4 = i12;
                i5 = i14;
                str2 = str;
            }
            K k4 = new K(k3.f571a, uVar.a(uVar3));
            List a4 = c0031g4.a();
            List list3 = (List) this.f631d;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i15 = 0;
            while (true) {
                i6 = c0029e2.f593b;
                if (i15 >= size3) {
                    break;
                }
                Object obj = list3.get(i15);
                C0029e c0029e3 = (C0029e) obj;
                int i16 = i5;
                if (AbstractC0032h.c(i6, i16, c0029e3.f593b, c0029e3.f594c)) {
                    arrayList5.add(obj);
                }
                i15++;
                i5 = i16;
            }
            int i17 = i5;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                C0029e c0029e4 = (C0029e) arrayList5.get(i18);
                int i19 = c0029e4.f593b;
                if (i6 <= i19 && (i7 = c0029e4.f594c) <= i17) {
                    arrayList6.add(new C0029e(i19 - i6, i7 - i6, c0029e4.f592a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            s sVar = new s(new K0.c(str2, k4, a4, arrayList6, dVar, bVar), i6, i17);
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(sVar);
            i12 = i4 + 1;
            size2 = i3;
            arrayList4 = arrayList7;
            arrayList3 = arrayList;
            c0031g2 = c0031g;
        }
        this.f629b = arrayList4;
    }
}
