package a2;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f434a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f435b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f436c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f437d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f438e;

    /* renamed from: f, reason: collision with root package name */
    public Object f439f;

    public q(s7.l lVar, String str, s7.k kVar, r4.a aVar, Map map) {
        r6.k.f(lVar, "url");
        r6.k.f(str, "method");
        this.f436c = lVar;
        this.f437d = str;
        this.f438e = kVar;
        this.f439f = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    @Override // a2.t
    public float a() {
        return ((Number) this.f438e.getValue()).floatValue();
    }

    @Override // a2.t
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f435b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((s) arrayList.get(i7)).f447a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.g, java.lang.Object] */
    @Override // a2.t
    public float c() {
        return ((Number) this.f439f.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi d(int i7) {
        Bidi bidi;
        Layout layout = (Layout) this.f436c;
        ArrayList arrayList = (ArrayList) this.f435b;
        ArrayList arrayList2 = (ArrayList) this.f437d;
        boolean[] zArr = (boolean[]) this.f438e;
        if (zArr[i7]) {
            return (Bidi) arrayList2.get(i7);
        }
        int intValue = i7 == 0 ? 0 : ((Number) arrayList.get(i7 - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i7)).intValue();
        int i8 = intValue2 - intValue;
        char[] cArr = (char[]) this.f439f;
        if (cArr == null || cArr.length < i8) {
            cArr = new char[i8];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i8)) {
            bidi = new Bidi(cArr2, 0, null, 0, i8, layout.getParagraphDirection(layout.getLineForOffset(h(i7))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i7, bidi);
        zArr[i7] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f439f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f439f = cArr2;
        return bidi;
    }

    public float e(int i7, boolean z8) {
        Layout layout = (Layout) this.f436c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        return z8 ? layout.getPrimaryHorizontal(i7) : layout.getSecondaryHorizontal(i7);
    }

    public float f(int i7, boolean z8, boolean z9) {
        int i8;
        int i9;
        int i10 = i7;
        Layout layout = (Layout) this.f436c;
        if (!z9) {
            return e(i7, z8);
        }
        int c4 = b2.y.c(layout, i10, z9);
        int lineStart = layout.getLineStart(c4);
        int lineEnd = layout.getLineEnd(c4);
        if (i10 != lineStart && i10 != lineEnd) {
            return e(i7, z8);
        }
        if (i10 == 0 || i10 == layout.getText().length()) {
            return e(i7, z8);
        }
        int g9 = g(i10, z9);
        boolean z10 = layout.getParagraphDirection(layout.getLineForOffset(h(g9))) == -1;
        int i11 = i(lineEnd, lineStart);
        int h3 = h(g9);
        int i12 = lineStart - h3;
        int i13 = i11 - h3;
        Bidi d8 = d(g9);
        Bidi createLineBidi = d8 != null ? d8.createLineBidi(i12, i13) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z8 || z10 == isRtlCharAt) {
                z10 = !z10;
            }
            return i10 == lineStart ? z10 : !z10 ? layout.getLineLeft(c4) : layout.getLineRight(c4);
        }
        int runCount = createLineBidi.getRunCount();
        b2.q[] qVarArr = new b2.q[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            qVarArr[i14] = new b2.q(createLineBidi.getRunStart(i14) + lineStart, createLineBidi.getRunLimit(i14) + lineStart, createLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) createLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, qVarArr, 0, runCount);
        if (i10 == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    i9 = -1;
                    break;
                }
                if (qVarArr[i16].f1293a == i10) {
                    i9 = i16;
                    break;
                }
                i16++;
            }
            boolean z11 = (z8 || z10 == qVarArr[i9].f1295c) ? !z10 : z10;
            return (i9 == 0 && z11) ? layout.getLineLeft(c4) : (i9 != runCount - 1 || z11) ? z11 ? layout.getPrimaryHorizontal(qVarArr[i9 - 1].f1293a) : layout.getPrimaryHorizontal(qVarArr[i9 + 1].f1293a) : layout.getLineRight(c4);
        }
        if (i10 > i11) {
            i10 = i(i10, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                i8 = -1;
                break;
            }
            if (qVarArr[i17].f1294b == i10) {
                i8 = i17;
                break;
            }
            i17++;
        }
        boolean z12 = (z8 || z10 == qVarArr[i8].f1295c) ? z10 : !z10;
        return (i8 == 0 && z12) ? layout.getLineLeft(c4) : (i8 != runCount - 1 || z12) ? z12 ? layout.getPrimaryHorizontal(qVarArr[i8 - 1].f1294b) : layout.getPrimaryHorizontal(qVarArr[i8 + 1].f1294b) : layout.getLineRight(c4);
    }

    public int g(int i7, boolean z8) {
        ArrayList arrayList = (ArrayList) this.f435b;
        int V = e6.m.V(arrayList, Integer.valueOf(i7));
        int i8 = V < 0 ? -(V + 1) : V + 1;
        if (z8 && i8 > 0) {
            int i9 = i8 - 1;
            if (i7 == ((Number) arrayList.get(i9)).intValue()) {
                return i9;
            }
        }
        return i8;
    }

    public int h(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f435b).get(i7 - 1)).intValue();
    }

    public int i(int i7, int i8) {
        while (i7 > i8) {
            char charAt = ((Layout) this.f436c).getText().charAt(i7 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((r6.k.g(charAt, 8192) < 0 || r6.k.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i7;
            }
            i7--;
        }
        return i7;
    }

    public g3.k j() {
        g3.k kVar = new g3.k(false);
        kVar.f4163j = new LinkedHashMap();
        kVar.f4160g = (s7.l) this.f436c;
        kVar.f4161h = (String) this.f437d;
        Map map = (Map) this.f439f;
        kVar.f4163j = map.isEmpty() ? new LinkedHashMap() : e6.c0.n0(map);
        kVar.f4162i = ((s7.k) this.f438e).m();
        return kVar;
    }

    public String toString() {
        switch (this.f434a) {
            case 2:
                Map map = (Map) this.f439f;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f437d);
                sb.append(", url=");
                sb.append((s7.l) this.f436c);
                s7.k kVar = (s7.k) this.f438e;
                if (kVar.size() != 0) {
                    sb.append(", headers=[");
                    int i7 = 0;
                    for (Object obj : kVar) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            e6.m.Z();
                            throw null;
                        }
                        d6.j jVar = (d6.j) obj;
                        String str = (String) jVar.f2618f;
                        String str2 = (String) jVar.f2619g;
                        if (i7 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i7 = i8;
                    }
                    sb.append(']');
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public q(Layout layout) {
        this.f436c = layout;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        do {
            int D = z6.h.D(((Layout) this.f436c).getText(), '\n', i7, 4);
            i7 = D < 0 ? ((Layout) this.f436c).getText().length() : D + 1;
            arrayList.add(Integer.valueOf(i7));
        } while (i7 < ((Layout) this.f436c).getText().length());
        this.f435b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(null);
        }
        this.f437d = arrayList2;
        this.f438e = new boolean[((ArrayList) this.f435b).size()];
        ((ArrayList) this.f435b).size();
    }

    public q(g gVar, k0 k0Var, List list, m2.b bVar, f2.d dVar) {
        String str;
        u uVar;
        g gVar2 = gVar;
        k0 k0Var2 = k0Var;
        this.f436c = gVar2;
        this.f437d = list;
        p pVar = new p(this, 1);
        d6.h hVar = d6.h.f2616g;
        this.f438e = d6.a.c(hVar, pVar);
        this.f439f = d6.a.c(hVar, new p(this, 0));
        u uVar2 = k0Var2.f413b;
        g gVar3 = h.f387a;
        int length = gVar2.f373f.length();
        List list2 = gVar2.f375h;
        list2 = list2 == null ? e6.u.f2826f : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            e eVar = (e) list2.get(i7);
            u uVar3 = (u) eVar.f363a;
            int i9 = eVar.f364b;
            int i10 = eVar.f365c;
            if (i9 != i8) {
                arrayList.add(new e(i8, i9, uVar2));
            }
            arrayList.add(new e(i9, i10, uVar2.a(uVar3)));
            i7++;
            i8 = i10;
        }
        if (i8 != length) {
            arrayList.add(new e(i8, length, uVar2));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new e(0, 0, uVar2));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            e eVar2 = (e) arrayList.get(i11);
            int i12 = eVar2.f364b;
            int i13 = eVar2.f365c;
            if (i12 != i13) {
                str = gVar2.f373f.substring(i12, i13);
                r6.k.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            String str2 = str;
            g gVar4 = new g(str2, h.b(gVar2, i12, i13), null, null);
            u uVar4 = (u) eVar2.f363a;
            if (uVar4.f451b == Integer.MIN_VALUE) {
                uVar = uVar2;
                uVar4 = new u(uVar4.f450a, uVar2.f451b, uVar4.f452c, uVar4.f453d, uVar4.f454e, uVar4.f455f, uVar4.f456g, uVar4.f457h, uVar4.f458i);
            } else {
                uVar = uVar2;
            }
            u uVar5 = uVar;
            k0 k0Var3 = new k0(k0Var2.f412a, uVar5.a(uVar4));
            List a3 = gVar4.a();
            List list3 = (List) this.f437d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj = list3.get(i14);
                k0 k0Var4 = k0Var3;
                e eVar3 = (e) obj;
                List list4 = list3;
                if (h.c(i12, i13, eVar3.f364b, eVar3.f365c)) {
                    arrayList3.add(obj);
                }
                i14++;
                list3 = list4;
                k0Var3 = k0Var4;
            }
            k0 k0Var5 = k0Var3;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size4 = arrayList3.size();
            int i15 = 0;
            while (i15 < size4) {
                e eVar4 = (e) arrayList3.get(i15);
                int i16 = eVar4.f364b;
                if (i12 <= i16) {
                    int i17 = size4;
                    int i18 = eVar4.f365c;
                    if (i18 <= i13) {
                        arrayList4.add(new e(i16 - i12, i18 - i12, eVar4.f363a));
                        i15++;
                        size4 = i17;
                    }
                }
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new s(new i2.d(str2, k0Var5, a3, arrayList4, dVar, bVar), i12, i13));
            i11++;
            gVar2 = gVar;
            k0Var2 = k0Var;
            uVar2 = uVar5;
        }
        this.f435b = arrayList2;
    }
}
