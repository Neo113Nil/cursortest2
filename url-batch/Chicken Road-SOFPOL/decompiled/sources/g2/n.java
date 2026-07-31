package g2;

import android.text.Layout;
import android.text.TextUtils;
import d7.n0;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2979b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2980c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2981d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2982e;

    public n(Map map) {
        q6.i.e(map, "initialState");
        this.f2979b = new LinkedHashMap(map);
        this.f2980c = new LinkedHashMap();
        this.f2981d = new LinkedHashMap();
        this.f2982e = new LinkedHashMap();
        this.f2978a = new b.g(1, this);
    }

    @Override // g2.q
    public boolean a() {
        ArrayList arrayList = (ArrayList) this.f2978a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((p) arrayList.get(i)).f2990a.a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c6.d, java.lang.Object] */
    @Override // g2.q
    public float b() {
        return ((Number) this.f2982e.getValue()).floatValue();
    }

    public float c(int i, boolean z3) {
        Layout layout = (Layout) this.f2979b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z3 ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x003b, code lost:
    
        if (r31 != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float d(int i, boolean z3, boolean z7) {
        int lineForOffset;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        Bidi bidi;
        boolean z9;
        int i12 = i;
        ArrayList arrayList = (ArrayList) this.f2978a;
        Layout layout = (Layout) this.f2979b;
        if (!z7) {
            return c(i, z3);
        }
        if (i12 <= 0) {
            lineForOffset = 0;
        } else {
            if (i12 >= layout.getText().length()) {
                lineForOffset = layout.getLineCount();
            } else {
                lineForOffset = layout.getLineForOffset(i12);
                int lineStart = layout.getLineStart(lineForOffset);
                int lineEnd = layout.getLineEnd(lineForOffset);
                if (lineStart == i12 || lineEnd == i12) {
                    if (lineStart != i12) {
                        if (!z7) {
                            lineForOffset++;
                        }
                    }
                }
            }
            lineForOffset--;
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i12 != lineStart2 && i12 != lineEnd2) {
            return c(i, z3);
        }
        if (i12 == 0 || i12 == layout.getText().length()) {
            return c(i, z3);
        }
        Integer valueOf = Integer.valueOf(i12);
        int size = arrayList.size();
        q6.i.e(arrayList, "<this>");
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i13 = size - 1;
        int i14 = 0;
        while (true) {
            if (i14 > i13) {
                i8 = -(i14 + 1);
                break;
            }
            i8 = (i14 + i13) >>> 1;
            int g3 = a.a.g((Comparable) arrayList.get(i8), valueOf);
            if (g3 >= 0) {
                if (g3 <= 0) {
                    break;
                }
                i13 = i8 - 1;
            } else {
                i14 = i8 + 1;
            }
        }
        int i15 = i8 < 0 ? -(i8 + 1) : i8 + 1;
        if (z7 && i15 > 0) {
            int i16 = i15 - 1;
            if (i12 == ((Number) arrayList.get(i16)).intValue()) {
                i15 = i16;
            }
        }
        boolean z10 = layout.getParagraphDirection(layout.getLineForOffset(i15 == 0 ? 0 : ((Number) arrayList.get(i15 + (-1))).intValue())) == -1;
        int e8 = e(lineEnd2, lineStart2);
        int intValue = i15 == 0 ? 0 : ((Number) arrayList.get(i15 - 1)).intValue();
        int i17 = lineStart2 - intValue;
        int i18 = e8 - intValue;
        ArrayList arrayList2 = (ArrayList) this.f2980c;
        boolean[] zArr = (boolean[]) this.f2981d;
        if (zArr[i15]) {
            bidi = (Bidi) arrayList2.get(i15);
            i10 = lineForOffset;
            i9 = e8;
            i11 = -1;
        } else {
            int intValue2 = i15 == 0 ? 0 : ((Number) arrayList.get(i15 - 1)).intValue();
            int intValue3 = ((Number) arrayList.get(i15)).intValue();
            int i19 = intValue3 - intValue2;
            char[] cArr = (char[]) this.f2982e;
            i9 = e8;
            if (cArr == null || cArr.length < i19) {
                cArr = new char[i19];
            }
            i10 = lineForOffset;
            TextUtils.getChars(layout.getText(), intValue2, intValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i19)) {
                i11 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i19, layout.getParagraphDirection(layout.getLineForOffset(i15 == 0 ? 0 : ((Number) arrayList.get(i15 + (-1))).intValue())) == -1 ? 1 : 0);
                z8 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                    arrayList2.set(i15, bidi);
                    zArr[i15] = z8;
                    if (bidi != null) {
                        char[] cArr2 = (char[]) this.f2982e;
                        cArr = cArr == cArr2 ? null : cArr2;
                    }
                    this.f2982e = cArr;
                }
            } else {
                i11 = -1;
                z8 = true;
            }
            bidi = null;
            arrayList2.set(i15, bidi);
            zArr[i15] = z8;
            if (bidi != null) {
            }
            this.f2982e = cArr;
        }
        Bidi createLineBidi = bidi != null ? bidi.createLineBidi(i17, i18) : null;
        if (createLineBidi == null) {
            z9 = true;
        } else {
            if (createLineBidi.getRunCount() != 1) {
                int runCount = createLineBidi.getRunCount();
                h2.d[] dVarArr = new h2.d[runCount];
                for (int i20 = 0; i20 < runCount; i20++) {
                    dVarArr[i20] = new h2.d(createLineBidi.getRunStart(i20) + lineStart2, createLineBidi.getRunLimit(i20) + lineStart2, createLineBidi.getRunLevel(i20) % 2 == 1);
                }
                int runCount2 = createLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i21 = 0; i21 < runCount2; i21++) {
                    bArr[i21] = (byte) createLineBidi.getRunLevel(i21);
                }
                Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
                if (i12 == lineStart2) {
                    int i22 = 0;
                    while (true) {
                        if (i22 >= runCount) {
                            i22 = i11;
                            break;
                        }
                        if (dVarArr[i22].f3089a == i12) {
                            break;
                        }
                        i22++;
                    }
                    boolean z11 = (z3 || z10 == dVarArr[i22].f3091c) ? !z10 : z10;
                    if (i22 == 0 && z11) {
                        return layout.getLineLeft(i10);
                    }
                    return (i22 != runCount + (-1) || z11) ? z11 ? layout.getPrimaryHorizontal(dVarArr[i22 - 1].f3089a) : layout.getPrimaryHorizontal(dVarArr[i22 + 1].f3089a) : layout.getLineRight(i10);
                }
                int i23 = i10;
                if (i12 > i9) {
                    i12 = e(i12, lineStart2);
                }
                int i24 = 0;
                while (true) {
                    if (i24 >= runCount) {
                        i24 = i11;
                        break;
                    }
                    if (dVarArr[i24].f3090b == i12) {
                        break;
                    }
                    i24++;
                }
                boolean z12 = (z3 || z10 == dVarArr[i24].f3091c) ? z10 : !z10;
                return (i24 == 0 && z12) ? layout.getLineLeft(i23) : (i24 != runCount + (-1) || z12) ? z12 ? layout.getPrimaryHorizontal(dVarArr[i24 - 1].f3090b) : layout.getPrimaryHorizontal(dVarArr[i24 + 1].f3090b) : layout.getLineRight(i23);
            }
            z9 = true;
        }
        int i25 = i10;
        boolean isRtlCharAt = layout.isRtlCharAt(lineStart2);
        if (z3 || z10 == isRtlCharAt) {
            z10 = !z10 ? z9 : false;
        }
        if (i12 == lineStart2) {
            z9 = z10;
        } else if (z10) {
            z9 = false;
        }
        return z9 ? layout.getLineLeft(i25) : layout.getLineRight(i25);
    }

    public int e(int i, int i8) {
        while (i > i8) {
            char charAt = ((Layout) this.f2979b).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((q6.i.f(charAt, 8192) < 0 || q6.i.f(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void f(Object obj, String str) {
        q6.i.e(str, "key");
        ((LinkedHashMap) this.f2979b).put(str, obj);
        d7.w wVar = (d7.w) ((LinkedHashMap) this.f2981d).get(str);
        if (wVar != null) {
            ((n0) wVar).i(obj);
        }
        d7.w wVar2 = (d7.w) ((LinkedHashMap) this.f2982e).get(str);
        if (wVar2 != null) {
            ((n0) wVar2).i(obj);
        }
    }

    public n(Layout layout) {
        this.f2979b = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int d02 = y6.j.d0(((Layout) this.f2979b).getText(), '\n', i, 4);
            i = d02 < 0 ? ((Layout) this.f2979b).getText().length() : d02 + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.f2979b).getText().length());
        this.f2978a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList2.add(null);
        }
        this.f2980c = arrayList2;
        this.f2981d = new boolean[((ArrayList) this.f2978a).size()];
        ((ArrayList) this.f2978a).size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    public n(e eVar, i0 i0Var, List list, r2.c cVar, j2.d dVar) {
        int i;
        String str;
        List list2;
        ArrayList arrayList;
        int i8;
        e eVar2 = eVar;
        i0 i0Var2 = i0Var;
        this.f2979b = eVar2;
        this.f2980c = list;
        final int i9 = 0;
        p6.a aVar = new p6.a(this) { // from class: g2.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ n f2977e;

            {
                this.f2977e = this;
            }

            @Override // p6.a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i9) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f2977e.f2978a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float c8 = ((p) obj3).f2990a.c();
                            int t3 = s6.a.t(arrayList2);
                            int i10 = 1;
                            if (1 <= t3) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i10);
                                    float c9 = ((p) obj4).f2990a.c();
                                    if (Float.compare(c8, c9) < 0) {
                                        obj3 = obj4;
                                        c8 = c9;
                                    }
                                    if (i10 != t3) {
                                        i10++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        p pVar = (p) obj;
                        return Float.valueOf(pVar != null ? pVar.f2990a.c() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f2977e.f2978a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c10 = ((p) obj5).f2990a.i.c();
                            int t7 = s6.a.t(arrayList3);
                            int i11 = 1;
                            if (1 <= t7) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i11);
                                    float c11 = ((p) obj6).f2990a.i.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj5 = obj6;
                                        c10 = c11;
                                    }
                                    if (i11 != t7) {
                                        i11++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        p pVar2 = (p) obj2;
                        return Float.valueOf(pVar2 != null ? pVar2.f2990a.i.c() : 0.0f);
                }
            }
        };
        c6.e eVar3 = c6.e.f1745d;
        this.f2981d = a.a.q(eVar3, aVar);
        final int i10 = 1;
        this.f2982e = a.a.q(eVar3, new p6.a(this) { // from class: g2.m

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ n f2977e;

            {
                this.f2977e = this;
            }

            @Override // p6.a
            public final Object b() {
                Object obj;
                Object obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f2977e.f2978a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float c8 = ((p) obj3).f2990a.c();
                            int t3 = s6.a.t(arrayList2);
                            int i102 = 1;
                            if (1 <= t3) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i102);
                                    float c9 = ((p) obj4).f2990a.c();
                                    if (Float.compare(c8, c9) < 0) {
                                        obj3 = obj4;
                                        c8 = c9;
                                    }
                                    if (i102 != t3) {
                                        i102++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        p pVar = (p) obj;
                        return Float.valueOf(pVar != null ? pVar.f2990a.c() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f2977e.f2978a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c10 = ((p) obj5).f2990a.i.c();
                            int t7 = s6.a.t(arrayList3);
                            int i11 = 1;
                            if (1 <= t7) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i11);
                                    float c11 = ((p) obj6).f2990a.i.c();
                                    if (Float.compare(c10, c11) < 0) {
                                        obj5 = obj6;
                                        c10 = c11;
                                    }
                                    if (i11 != t7) {
                                        i11++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        p pVar2 = (p) obj2;
                        return Float.valueOf(pVar2 != null ? pVar2.f2990a.i.c() : 0.0f);
                }
            }
        });
        r rVar = i0Var2.f2965b;
        int i11 = f.f2940a;
        ArrayList arrayList2 = eVar2.f2930g;
        String str2 = eVar2.f2928e;
        d6.u uVar = d6.u.f2326d;
        List d02 = arrayList2 != null ? d6.m.d0(arrayList2, new d(i10)) : uVar;
        ArrayList arrayList3 = new ArrayList();
        d6.k kVar = new d6.k();
        int size = d02.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            c cVar2 = (c) d02.get(i12);
            r a8 = rVar.a((r) cVar2.f2917a);
            int i14 = cVar2.f2918b;
            int i15 = cVar2.f2919c;
            if (i14 > i15) {
                l2.a.a("Reversed range is not supported");
            }
            while (i13 < i14 && !kVar.isEmpty()) {
                c cVar3 = (c) kVar.last();
                List list3 = d02;
                int i16 = cVar3.f2919c;
                d6.u uVar2 = uVar;
                Object obj = cVar3.f2917a;
                if (i14 < i16) {
                    arrayList3.add(new c(i13, i14, obj));
                    i13 = i14;
                    d02 = list3;
                    uVar = uVar2;
                } else {
                    int i17 = size;
                    arrayList3.add(new c(i13, i16, obj));
                    i13 = cVar3.f2919c;
                    while (!kVar.isEmpty() && i13 == ((c) kVar.last()).f2919c) {
                        kVar.removeLast();
                    }
                    d02 = list3;
                    uVar = uVar2;
                    size = i17;
                }
            }
            List list4 = d02;
            d6.u uVar3 = uVar;
            int i18 = size;
            if (i13 < i14) {
                arrayList3.add(new c(i13, i14, rVar));
                i13 = i14;
            }
            c cVar4 = (c) kVar.h();
            if (cVar4 != null) {
                int i19 = cVar4.f2919c;
                Object obj2 = cVar4.f2917a;
                int i20 = cVar4.f2918b;
                if (i20 == i14 && i19 == i15) {
                    kVar.removeLast();
                    kVar.addLast(new c(i14, i15, ((r) obj2).a(a8)));
                } else if (i20 == i19) {
                    arrayList3.add(new c(i20, i19, obj2));
                    kVar.removeLast();
                    kVar.addLast(new c(i14, i15, a8));
                } else if (i19 >= i15) {
                    kVar.addLast(new c(i14, i15, ((r) obj2).a(a8)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                kVar.addLast(new c(i14, i15, a8));
            }
            i12++;
            d02 = list4;
            uVar = uVar3;
            size = i18;
        }
        d6.u uVar4 = uVar;
        while (i13 <= str2.length() && !kVar.isEmpty()) {
            c cVar5 = (c) kVar.last();
            Object obj3 = cVar5.f2917a;
            int i21 = cVar5.f2919c;
            arrayList3.add(new c(i13, i21, obj3));
            while (!kVar.isEmpty() && i21 == ((c) kVar.last()).f2919c) {
                kVar.removeLast();
            }
            i13 = i21;
        }
        if (i13 < str2.length()) {
            arrayList3.add(new c(i13, str2.length(), rVar));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new c(0, 0, rVar));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i22 = i;
        while (i22 < size2) {
            c cVar6 = (c) arrayList3.get(i22);
            int i23 = cVar6.f2918b;
            int i24 = cVar6.f2919c;
            if (i23 != i24) {
                str = str2.substring(i23, i24);
                q6.i.d(str, "substring(...)");
            } else {
                str = "";
            }
            d6.u uVar5 = 0;
            if (i23 == i24 || (list2 = eVar2.f2927d) == null) {
                arrayList = arrayList3;
            } else if (i23 == 0 && i24 >= str2.length()) {
                uVar5 = new ArrayList(list2.size());
                int size3 = list2.size();
                arrayList = arrayList3;
                int i25 = 0;
                while (i25 < size3) {
                    int i26 = size3;
                    Object obj4 = list2.get(i25);
                    int i27 = i25;
                    if (!(((b) ((c) obj4).f2917a) instanceof r)) {
                        uVar5.add(obj4);
                    }
                    i25 = i27 + 1;
                    size3 = i26;
                }
            } else {
                arrayList = arrayList3;
                uVar5 = new ArrayList(list2.size());
                int size4 = list2.size();
                int i28 = 0;
                while (i28 < size4) {
                    int i29 = size4;
                    c cVar7 = (c) list2.get(i28);
                    List list5 = list2;
                    Object obj5 = cVar7.f2917a;
                    int i30 = cVar7.f2919c;
                    int i31 = i28;
                    int i32 = cVar7.f2918b;
                    String str3 = str2;
                    if ((((b) obj5) instanceof r) || !f.a(i23, i24, i32, i30)) {
                        i8 = size2;
                    } else {
                        i8 = size2;
                        uVar5.add(new c((b) cVar7.f2917a, r2.o.t(i32, i23, i24) - i23, r2.o.t(i30, i23, i24) - i23, cVar7.f2920d));
                    }
                    i28 = i31 + 1;
                    list2 = list5;
                    size4 = i29;
                    str2 = str3;
                    size2 = i8;
                }
            }
            String str4 = str2;
            int i33 = size2;
            e eVar4 = new e(str, uVar5 == 0 ? uVar4 : uVar5);
            r rVar2 = (r) cVar6.f2917a;
            i0 i0Var3 = new i0(i0Var2.f2964a, rVar.a(rVar2.f2994b == Integer.MIN_VALUE ? new r(rVar2.f2993a, rVar.f2994b, rVar2.f2995c, rVar2.f2996d, rVar2.f2997e, rVar2.f2998f, rVar2.f2999g, rVar2.f3000h, rVar2.i) : rVar2));
            ?? r12 = eVar4.f2927d;
            d6.u uVar6 = r12 == 0 ? uVar4 : r12;
            List list6 = (List) this.f2980c;
            ArrayList arrayList5 = new ArrayList(list6.size());
            int size5 = list6.size();
            int i34 = 0;
            while (i34 < size5) {
                c cVar8 = (c) list6.get(i34);
                int i35 = cVar8.f2918b;
                List list7 = list6;
                int i36 = cVar8.f2919c;
                if (f.a(i23, i24, i35, i36)) {
                    if (i23 > i35 || i36 > i24) {
                        l2.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList5.add(new c(i35 - i23, i36 - i23, cVar8.f2917a));
                }
                i34++;
                list6 = list7;
            }
            arrayList4.add(new p(new n2.c(str, i0Var3, uVar6, arrayList5, dVar, cVar), i23, i24));
            i22++;
            eVar2 = eVar;
            i0Var2 = i0Var;
            arrayList3 = arrayList;
            str2 = str4;
            size2 = i33;
        }
        this.f2978a = arrayList4;
    }
}
