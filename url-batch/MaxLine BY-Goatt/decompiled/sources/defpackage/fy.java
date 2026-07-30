package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fy implements ek0, cz1 {
    public final /* synthetic */ int m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public Object r;

    public fy(yd ydVar, pw2 pw2Var, List list, ca0 ca0Var, hp0 hp0Var) {
        int i;
        String str;
        pw2 pw2Var2;
        yd ydVar2 = ydVar;
        pw2 pw2Var3 = pw2Var;
        this.m = 3;
        this.o = ydVar2;
        this.p = list;
        kc1 kc1Var = kc1.m;
        final int i2 = 0;
        this.q = ya1.a(kc1Var, new Function0(this) { // from class: tm1
            public final /* synthetic */ fy n;

            {
                this.n = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                bz1 bz1Var = null;
                int i4 = 1;
                fy fyVar = this.n;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) fyVar.n;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float a = ((bz1) r0).a.a();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i4);
                                    float a2 = ((bz1) obj).a.a();
                                    r0 = z;
                                    if (Float.compare(a, a2) < 0) {
                                        r0 = obj;
                                        a = a2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        z = r0;
                                    }
                                }
                            }
                            bz1Var = r0;
                        }
                        bz1 bz1Var2 = bz1Var;
                        return Float.valueOf(bz1Var2 != null ? bz1Var2.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) fyVar.n;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((bz1) r02).a.u.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i4);
                                    float c2 = ((bz1) obj2).a.u.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        z2 = r02;
                                    }
                                }
                            }
                            bz1Var = r02;
                        }
                        bz1 bz1Var3 = bz1Var;
                        return Float.valueOf(bz1Var3 != null ? bz1Var3.a.u.c() : 0.0f);
                }
            }
        });
        final int i3 = 1;
        this.r = ya1.a(kc1Var, new Function0(this) { // from class: tm1
            public final /* synthetic */ fy n;

            {
                this.n = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11 */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v18 */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                bz1 bz1Var = null;
                int i4 = 1;
                fy fyVar = this.n;
                switch (i32) {
                    case 0:
                        ArrayList arrayList = (ArrayList) fyVar.n;
                        if (!arrayList.isEmpty()) {
                            ?? r0 = arrayList.get(0);
                            float a = ((bz1) r0).a.a();
                            int size = arrayList.size() - 1;
                            boolean z = r0;
                            if (1 <= size) {
                                while (true) {
                                    Object obj = arrayList.get(i4);
                                    float a2 = ((bz1) obj).a.a();
                                    r0 = z;
                                    if (Float.compare(a, a2) < 0) {
                                        r0 = obj;
                                        a = a2;
                                    }
                                    if (i4 != size) {
                                        i4++;
                                        z = r0;
                                    }
                                }
                            }
                            bz1Var = r0;
                        }
                        bz1 bz1Var2 = bz1Var;
                        return Float.valueOf(bz1Var2 != null ? bz1Var2.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) fyVar.n;
                        if (!arrayList2.isEmpty()) {
                            ?? r02 = arrayList2.get(0);
                            float c = ((bz1) r02).a.u.c();
                            int size2 = arrayList2.size() - 1;
                            boolean z2 = r02;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj2 = arrayList2.get(i4);
                                    float c2 = ((bz1) obj2).a.u.c();
                                    r02 = z2;
                                    if (Float.compare(c, c2) < 0) {
                                        r02 = obj2;
                                        c = c2;
                                    }
                                    if (i4 != size2) {
                                        i4++;
                                        z2 = r02;
                                    }
                                }
                            }
                            bz1Var = r02;
                        }
                        bz1 bz1Var3 = bz1Var;
                        return Float.valueOf(bz1Var3 != null ? bz1Var3.a.u.c() : 0.0f);
                }
            }
        });
        ez1 ez1Var = pw2Var3.b;
        yd ydVar3 = ae.a;
        ArrayList arrayList = ydVar2.p;
        String str2 = ydVar2.n;
        List list2 = (arrayList == null || (list2 = zv.I(arrayList, new zo0(6))) == null) ? ah0.m : list2;
        ArrayList arrayList2 = new ArrayList();
        bi biVar = new bi();
        int size = list2.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            xd xdVar = (xd) list2.get(i4);
            ez1 a = ez1Var.a((ez1) xdVar.a);
            int i6 = xdVar.b;
            int i7 = xdVar.c;
            if (i6 > i7) {
                i21.a("Reversed range is not supported");
            }
            while (i5 < i6 && !biVar.isEmpty()) {
                xd xdVar2 = (xd) biVar.last();
                int i8 = xdVar2.c;
                List list3 = list2;
                Object obj = xdVar2.a;
                if (i6 < i8) {
                    arrayList2.add(new xd(i5, i6, obj));
                    i5 = i6;
                    list2 = list3;
                } else {
                    int i9 = size;
                    arrayList2.add(new xd(i5, i8, obj));
                    i5 = xdVar2.c;
                    while (!biVar.isEmpty() && i5 == ((xd) biVar.last()).c) {
                        biVar.removeLast();
                    }
                    list2 = list3;
                    size = i9;
                }
            }
            List list4 = list2;
            int i10 = size;
            if (i5 < i6) {
                arrayList2.add(new xd(i5, i6, ez1Var));
                i5 = i6;
            }
            xd xdVar3 = (xd) biVar.f();
            if (xdVar3 != null) {
                int i11 = xdVar3.c;
                Object obj2 = xdVar3.a;
                int i12 = xdVar3.b;
                if (i12 == i6 && i11 == i7) {
                    biVar.removeLast();
                    biVar.addLast(new xd(i6, i7, ((ez1) obj2).a(a)));
                } else if (i12 == i11) {
                    arrayList2.add(new xd(i12, i11, obj2));
                    biVar.removeLast();
                    biVar.addLast(new xd(i6, i7, a));
                } else {
                    if (i11 < i7) {
                        b71.t();
                        throw null;
                    }
                    biVar.addLast(new xd(i6, i7, ((ez1) obj2).a(a)));
                }
            } else {
                biVar.addLast(new xd(i6, i7, a));
            }
            i4++;
            list2 = list4;
            size = i10;
        }
        while (i5 <= str2.length() && !biVar.isEmpty()) {
            xd xdVar4 = (xd) biVar.last();
            Object obj3 = xdVar4.a;
            int i13 = xdVar4.c;
            arrayList2.add(new xd(i5, i13, obj3));
            while (!biVar.isEmpty() && i13 == ((xd) biVar.last()).c) {
                biVar.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str2.length()) {
            arrayList2.add(new xd(i5, str2.length(), ez1Var));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xd(0, 0, ez1Var));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = 0;
        while (i14 < size2) {
            xd xdVar5 = (xd) arrayList2.get(i14);
            int i15 = xdVar5.b;
            int i16 = xdVar5.c;
            String substring = i15 != i16 ? str2.substring(i15, i16) : BuildConfig.FLAVOR;
            List a2 = ae.a(ydVar2, i15, i16, new zd(0));
            yd ydVar4 = new yd(substring, a2 == null ? ah0.m : a2);
            ez1 ez1Var2 = (ez1) xdVar5.a;
            if (ez1Var2.b == Integer.MIN_VALUE) {
                i = size2;
                str = str2;
                ez1Var2 = new ez1(ez1Var2.a, ez1Var.b, ez1Var2.c, ez1Var2.d, ez1Var2.e, ez1Var2.f, ez1Var2.g, ez1Var2.h, ez1Var2.i);
            } else {
                i = size2;
                str = str2;
            }
            pw2 pw2Var4 = new pw2(pw2Var3.a, ez1Var.a(ez1Var2));
            List list5 = ydVar4.m;
            List list6 = list5 == null ? ah0.m : list5;
            List list7 = (List) this.p;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i17 = 0;
            while (i17 < size3) {
                xd xdVar6 = (xd) list7.get(i17);
                int i18 = xdVar6.b;
                ez1 ez1Var3 = ez1Var;
                int i19 = xdVar6.c;
                if (ae.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        i21.a("placeholder can not overlap with paragraph.");
                    }
                    pw2Var2 = pw2Var4;
                    arrayList4.add(new xd(i18 - i15, i19 - i15, xdVar6.a));
                } else {
                    pw2Var2 = pw2Var4;
                }
                i17++;
                pw2Var4 = pw2Var2;
                ez1Var = ez1Var3;
            }
            arrayList3.add(new bz1(new na(substring, pw2Var4, list6, arrayList4, hp0Var, ca0Var), i15, i16));
            i14++;
            ydVar2 = ydVar;
            pw2Var3 = pw2Var;
            str2 = str;
            size2 = i;
        }
        this.n = arrayList3;
    }

    @Override // defpackage.cz1
    public float a() {
        return ((Number) ((y91) this.q).getValue()).floatValue();
    }

    @Override // defpackage.cz1
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((bz1) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cz1
    public float c() {
        return ((Number) ((y91) this.r).getValue()).floatValue();
    }

    public void d(xq xqVar, Class cls) {
        ((ArrayList) this.o).add(new Pair(xqVar, cls));
    }

    public void e(pk0 pk0Var, Class cls) {
        ((ArrayList) this.q).add(new Pair(pk0Var, cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi f(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.p;
        ArrayList arrayList = (ArrayList) this.n;
        ArrayList arrayList2 = (ArrayList) this.o;
        boolean[] zArr = (boolean[]) this.q;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int intValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = (char[]) this.r;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(k(i))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.r;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.r = cArr2;
        return bidi;
    }

    public gr g() {
        gr grVar = (gr) this.r;
        if (grVar != null) {
            return grVar;
        }
        gr grVar2 = gr.n;
        gr W = tk3.W((mx0) this.p);
        this.r = W;
        return W;
    }

    @Override // defpackage.w52
    public Object get() {
        return new u80((Executor) ((w52) this.n).get(), (jl1) ((w52) this.o).get(), (mh) ((mh) this.p).get(), (tc2) ((w52) this.q).get(), (tc2) ((w52) this.r).get());
    }

    public float h(int i, boolean z) {
        Layout layout = (Layout) this.p;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float i(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.p;
        if (!z2) {
            return h(i, z);
        }
        int P = tk3.P(layout, i, z2);
        int lineStart = layout.getLineStart(P);
        int lineEnd = layout.getLineEnd(P);
        if (i != lineStart && i != lineEnd) {
            return h(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return h(i, z);
        }
        int j = j(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(k(j))) == -1;
        int l = l(lineEnd, lineStart);
        int k = k(j);
        int i4 = lineStart - k;
        int i5 = l - k;
        Bidi f = f(j);
        Bidi createLineBidi = f != null ? f.createLineBidi(i4, i5) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(P) : layout.getLineRight(P);
        }
        int runCount = createLineBidi.getRunCount();
        v81[] v81VarArr = new v81[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            v81VarArr[i6] = new v81(createLineBidi.getRunStart(i6) + lineStart, createLineBidi.getRunLimit(i6) + lineStart, createLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) createLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, v81VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (v81VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == v81VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(P) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(v81VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(v81VarArr[i3 + 1].a) : layout.getLineRight(P);
        }
        int l2 = i > l ? l(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (v81VarArr[i9].b == l2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == v81VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(P) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(v81VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(v81VarArr[i2 + 1].b) : layout.getLineRight(P);
    }

    public int j(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.n;
        int e = qv.e(arrayList, Integer.valueOf(i));
        int i2 = e < 0 ? -(e + 1) : e + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int k(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.n).get(i - 1)).intValue();
    }

    public int l(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.p).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.c(charAt, Utility.DEFAULT_STREAM_BUFFER_SIZE) < 0 || Intrinsics.c(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public js0 m() {
        js0 js0Var = new js0();
        js0Var.p = new LinkedHashMap();
        js0Var.m = (kz0) this.n;
        js0Var.n = (String) this.o;
        Map map = (Map) this.q;
        js0Var.p = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        js0Var.o = ((mx0) this.p).c();
        return js0Var;
    }

    public void n(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.n).put(str, obj);
        vo2 vo2Var = (vo2) ((LinkedHashMap) this.p).get(str);
        if (vo2Var != null) {
            vo2Var.i(obj);
        }
        vo2 vo2Var2 = (vo2) ((LinkedHashMap) this.q).get(str);
        if (vo2Var2 != null) {
            vo2Var2.i(obj);
        }
    }

    public String toString() {
        switch (this.m) {
            case 4:
                Map map = (Map) this.q;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.o);
                sb.append(", url=");
                sb.append((kz0) this.n);
                mx0 mx0Var = (mx0) this.p;
                if (mx0Var.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = mx0Var.iterator();
                    int i = 0;
                    while (true) {
                        i0 i0Var = (i0) it;
                        if (i0Var.hasNext()) {
                            Object next = i0Var.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                qv.k();
                                throw null;
                            }
                            Pair pair = (Pair) next;
                            String str = (String) pair.m;
                            String str2 = (String) pair.n;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public fy(kz0 kz0Var, String str, mx0 mx0Var, zm3 zm3Var, Map map) {
        this.m = 4;
        kz0Var.getClass();
        str.getClass();
        this.n = kz0Var;
        this.o = str;
        this.p = mx0Var;
        this.q = map;
    }

    public fy(w52 w52Var, w52 w52Var2, mh mhVar, w52 w52Var3, w52 w52Var4) {
        this.m = 1;
        this.n = w52Var;
        this.o = w52Var2;
        this.p = mhVar;
        this.q = w52Var3;
        this.r = w52Var4;
    }

    public fy(Layout layout) {
        this.m = 2;
        this.p = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int v = up2.v(((Layout) this.p).getText(), '\n', i, 4);
            i = v < 0 ? ((Layout) this.p).getText().length() : v + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.p).getText().length());
        this.n = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.o = arrayList2;
        this.q = new boolean[((ArrayList) this.n).size()];
        ((ArrayList) this.n).size();
    }

    public fy(Map map) {
        this.m = 5;
        this.n = new LinkedHashMap(map);
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.r = new gc0(2, this);
    }

    public fy(gy gyVar) {
        this.m = 0;
        this.n = zv.N(gyVar.a);
        this.o = zv.N(gyVar.b);
        this.p = zv.N(gyVar.c);
        this.q = zv.N(gyVar.d);
        this.r = zv.N(gyVar.e);
    }
}
