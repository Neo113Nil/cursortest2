package A0;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.EnumC1337l;
import z2.C1405I;
import z2.C1412P;
import z2.C1441y;

/* loaded from: classes.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f361b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f362c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f363d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f364e;

    /* renamed from: f, reason: collision with root package name */
    public Object f365f;

    public q(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f362c = class2ContextualFactory;
        this.f363d = polyBase2Serializers;
        this.f364e = polyBase2DefaultSerializerProvider;
        this.f365f = polyBase2NamedSerializers;
        this.f361b = polyBase2DefaultDeserializerProvider;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    @Override // A0.t
    public float a() {
        return ((Number) this.f364e.getValue()).floatValue();
    }

    @Override // A0.t
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f361b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((s) arrayList.get(i2)).f373a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    @Override // A0.t
    public float c() {
        return ((Number) this.f365f.getValue()).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r1.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi d(int i2) {
        Bidi bidi;
        boolean[] zArr = (boolean[]) this.f364e;
        boolean z4 = zArr[i2];
        ArrayList arrayList = (ArrayList) this.f363d;
        if (z4) {
            return (Bidi) arrayList.get(i2);
        }
        ArrayList arrayList2 = (ArrayList) this.f361b;
        int intValue = i2 == 0 ? 0 : ((Number) arrayList2.get(i2 - 1)).intValue();
        int intValue2 = ((Number) arrayList2.get(i2)).intValue();
        int i4 = intValue2 - intValue;
        char[] cArr = (char[]) this.f365f;
        if (cArr == null || cArr.length < i4) {
            cArr = new char[i4];
        }
        char[] cArr2 = cArr;
        Layout layout = (Layout) this.f362c;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i4)) {
            bidi = new Bidi(cArr2, 0, null, 0, i4, layout.getParagraphDirection(layout.getLineForOffset(h(i2))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList.set(i2, bidi);
        zArr[i2] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f365f;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f365f = cArr2;
        return bidi;
    }

    public float e(int i2, boolean z4) {
        Layout layout = (Layout) this.f362c;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        return z4 ? layout.getPrimaryHorizontal(i2) : layout.getSecondaryHorizontal(i2);
    }

    public float f(int i2, boolean z4, boolean z5) {
        int i4;
        int i5;
        int i6 = i2;
        if (!z5) {
            return e(i2, z4);
        }
        Layout layout = (Layout) this.f362c;
        int c4 = B0.A.c(layout, i6, z5);
        int lineStart = layout.getLineStart(c4);
        int lineEnd = layout.getLineEnd(c4);
        if (i6 != lineStart && i6 != lineEnd) {
            return e(i2, z4);
        }
        if (i6 == 0 || i6 == layout.getText().length()) {
            return e(i2, z4);
        }
        int g4 = g(i6, z5);
        boolean z6 = layout.getParagraphDirection(layout.getLineForOffset(h(g4))) == -1;
        int j4 = j(lineEnd, lineStart);
        int h4 = h(g4);
        int i7 = lineStart - h4;
        int i8 = j4 - h4;
        Bidi d4 = d(g4);
        Bidi createLineBidi = d4 != null ? d4.createLineBidi(i7, i8) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z4 || z6 == isRtlCharAt) {
                z6 = !z6;
            }
            return i6 == lineStart ? z6 : !z6 ? layout.getLineLeft(c4) : layout.getLineRight(c4);
        }
        int runCount = createLineBidi.getRunCount();
        B0.r[] rVarArr = new B0.r[runCount];
        for (int i9 = 0; i9 < runCount; i9++) {
            rVarArr[i9] = new B0.r(createLineBidi.getRunStart(i9) + lineStart, createLineBidi.getRunLimit(i9) + lineStart, createLineBidi.getRunLevel(i9) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i10 = 0; i10 < runCount2; i10++) {
            bArr[i10] = (byte) createLineBidi.getRunLevel(i10);
        }
        Bidi.reorderVisually(bArr, 0, rVarArr, 0, runCount);
        if (i6 == lineStart) {
            int i11 = 0;
            while (true) {
                if (i11 >= runCount) {
                    i5 = -1;
                    break;
                }
                if (rVarArr[i11].f933a == i6) {
                    i5 = i11;
                    break;
                }
                i11++;
            }
            boolean z7 = (z4 || z6 == rVarArr[i5].f935c) ? !z6 : z6;
            if (i5 == 0 && z7) {
                return layout.getLineLeft(c4);
            }
            Intrinsics.checkNotNullParameter(rVarArr, "<this>");
            return (i5 != runCount - 1 || z7) ? z7 ? layout.getPrimaryHorizontal(rVarArr[i5 - 1].f933a) : layout.getPrimaryHorizontal(rVarArr[i5 + 1].f933a) : layout.getLineRight(c4);
        }
        if (i6 > j4) {
            i6 = j(i6, lineStart);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= runCount) {
                i4 = -1;
                break;
            }
            if (rVarArr[i12].f934b == i6) {
                i4 = i12;
                break;
            }
            i12++;
        }
        boolean z8 = (z4 || z6 == rVarArr[i4].f935c) ? z6 : !z6;
        if (i4 == 0 && z8) {
            return layout.getLineLeft(c4);
        }
        Intrinsics.checkNotNullParameter(rVarArr, "<this>");
        return (i4 != runCount - 1 || z8) ? z8 ? layout.getPrimaryHorizontal(rVarArr[i4 - 1].f934b) : layout.getPrimaryHorizontal(rVarArr[i4 + 1].f934b) : layout.getLineRight(c4);
    }

    public int g(int i2, boolean z4) {
        ArrayList arrayList = (ArrayList) this.f361b;
        int c4 = C1441y.c(arrayList, Integer.valueOf(i2));
        int i4 = c4 < 0 ? -(c4 + 1) : c4 + 1;
        if (z4 && i4 > 0) {
            int i5 = i4 - 1;
            if (i2 == ((Number) arrayList.get(i5)).intValue()) {
                return i5;
            }
        }
        return i4;
    }

    public int h(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f361b).get(i2 - 1)).intValue();
    }

    public String i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((m3.l) this.f364e).e(name);
    }

    public int j(int i2, int i4) {
        while (i2 > i4) {
            char charAt = ((Layout) this.f362c).getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.e(charAt, 8192) < 0 || Intrinsics.e(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                break;
            }
            i2--;
        }
        return i2;
    }

    public Y0.b k() {
        Intrinsics.checkNotNullParameter(this, "request");
        Y0.b bVar = new Y0.b(false);
        bVar.f4389e = new LinkedHashMap();
        bVar.f4391j = (m3.m) this.f362c;
        bVar.f4390i = (String) this.f363d;
        Map map = (Map) this.f365f;
        bVar.f4389e = map.isEmpty() ? new LinkedHashMap() : C1412P.j(map);
        bVar.f4392k = ((m3.l) this.f364e).s();
        return bVar;
    }

    public String toString() {
        switch (this.f360a) {
            case 3:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f363d);
                sb.append(", url=");
                sb.append((m3.m) this.f362c);
                m3.l lVar = (m3.l) this.f364e;
                if (lVar.size() != 0) {
                    sb.append(", headers=[");
                    int i2 = 0;
                    for (Object obj : lVar) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            C1441y.g();
                            throw null;
                        }
                        Pair pair = (Pair) obj;
                        String str = (String) pair.f7485d;
                        String str2 = (String) pair.f7486e;
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i2 = i4;
                    }
                    sb.append(']');
                }
                Map map = (Map) this.f365f;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public q(m3.m url, String method, m3.l headers, m3.u uVar, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f362c = url;
        this.f363d = method;
        this.f364e = headers;
        this.f365f = tags;
    }

    public q(Layout layout) {
        this.f362c = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            int u4 = kotlin.text.y.u(((Layout) this.f362c).getText(), '\n', i2, false, 4);
            i2 = u4 < 0 ? ((Layout) this.f362c).getText().length() : u4 + 1;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < ((Layout) this.f362c).getText().length());
        this.f361b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(null);
        }
        this.f363d = arrayList2;
        this.f364e = new boolean[((ArrayList) this.f361b).size()];
        ((ArrayList) this.f361b).size();
    }

    public q(C0036g c0036g, L l4, List list, M0.b bVar, F0.d dVar) {
        u uVar;
        String str;
        int i2;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        String str2;
        int i5;
        int i6;
        int i7;
        C0036g c0036g2 = c0036g;
        this.f362c = c0036g2;
        this.f363d = list;
        EnumC1337l enumC1337l = EnumC1337l.f11671e;
        this.f364e = C1336k.b(enumC1337l, new p(this, 1));
        this.f365f = C1336k.b(enumC1337l, new p(this, 0));
        C0036g c0036g3 = AbstractC0037h.f332a;
        int length = c0036g2.f328a.length();
        List list2 = c0036g2.f330c;
        list2 = list2 == null ? C1405I.f11931d : list2;
        ArrayList arrayList3 = new ArrayList();
        int size = list2.size();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            uVar = l4.f304b;
            if (i8 >= size) {
                break;
            }
            C0034e c0034e = (C0034e) list2.get(i8);
            u uVar2 = (u) c0034e.f324a;
            int i10 = c0034e.f325b;
            if (i10 != i9) {
                arrayList3.add(new C0034e(i9, i10, uVar));
            }
            u a4 = uVar.a(uVar2);
            int i11 = c0034e.f326c;
            arrayList3.add(new C0034e(i10, i11, a4));
            i8++;
            i9 = i11;
        }
        if (i9 != length) {
            arrayList3.add(new C0034e(i9, length, uVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new C0034e(0, 0, uVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            C0034e c0034e2 = (C0034e) arrayList3.get(i12);
            int i13 = c0034e2.f325b;
            int i14 = c0034e2.f326c;
            if (i13 != i14) {
                str = c0036g2.f328a.substring(i13, i14);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            C0036g c0036g4 = new C0036g(str, AbstractC0037h.b(c0036g2, i13, i14), null, null);
            u uVar3 = (u) c0034e2.f324a;
            if (L0.k.a(uVar3.f377b, Integer.MIN_VALUE)) {
                i2 = size2;
                arrayList = arrayList3;
                i4 = i12;
                arrayList2 = arrayList4;
                str2 = str;
                i5 = i14;
                uVar3 = new u(uVar3.f376a, uVar.f377b, uVar3.f378c, uVar3.f379d, uVar3.f380e, uVar3.f381f, uVar3.f382g, uVar3.f383h, uVar3.f384i);
            } else {
                arrayList2 = arrayList4;
                i2 = size2;
                arrayList = arrayList3;
                i4 = i12;
                i5 = i14;
                str2 = str;
            }
            L l5 = new L(l4.f303a, uVar.a(uVar3));
            List a5 = c0036g4.a();
            List list3 = (List) this.f363d;
            ArrayList arrayList5 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i15 = 0;
            while (true) {
                i6 = c0034e2.f325b;
                if (i15 >= size3) {
                    break;
                }
                Object obj = list3.get(i15);
                C0034e c0034e3 = (C0034e) obj;
                int i16 = i5;
                if (AbstractC0037h.c(i6, i16, c0034e3.f325b, c0034e3.f326c)) {
                    arrayList5.add(obj);
                }
                i15++;
                i5 = i16;
            }
            int i17 = i5;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size4 = arrayList5.size();
            for (int i18 = 0; i18 < size4; i18++) {
                C0034e c0034e4 = (C0034e) arrayList5.get(i18);
                int i19 = c0034e4.f325b;
                if (i6 <= i19 && (i7 = c0034e4.f326c) <= i17) {
                    arrayList6.add(new C0034e(i19 - i6, i7 - i6, c0034e4.f324a));
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            s sVar = new s(new I0.c(str2, l5, a5, arrayList6, dVar, bVar), i6, i17);
            ArrayList arrayList7 = arrayList2;
            arrayList7.add(sVar);
            i12 = i4 + 1;
            size2 = i2;
            arrayList4 = arrayList7;
            arrayList3 = arrayList;
            c0036g2 = c0036g;
        }
        this.f361b = arrayList4;
    }
}
