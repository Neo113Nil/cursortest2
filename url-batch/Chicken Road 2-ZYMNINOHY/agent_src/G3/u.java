package G3;

import W.J;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import b1.C0256a;
import b1.C0258c;
import b1.C0261f;
import b3.InterfaceC0264a;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class u implements N1.b, V0.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f1007a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1008b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1009c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1010d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1011e;

    public u(C0258c c0258c, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f1007a = c0258c;
        this.f1010d = hashMap2;
        this.f1011e = hashMap3;
        this.f1009c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i4 = 0;
        c0258c.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        this.f1008b = jArr;
    }

    public v a() {
        Map unmodifiableMap;
        p pVar = (p) this.f1007a;
        if (pVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1008b;
        n g4 = ((m) this.f1009c).g();
        w wVar = (w) this.f1010d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f1011e;
        byte[] bArr = H3.b.f1103a;
        kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = d3.r.f8334a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            kotlin.jvm.internal.i.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new v(pVar, str, g4, wVar, unmodifiableMap);
    }

    @Override // V0.d
    public int b(long j4) {
        long[] jArr = (long[]) this.f1008b;
        int b4 = J.b(jArr, j4, false);
        if (b4 < jArr.length) {
            return b4;
        }
        return -1;
    }

    @Override // V0.d
    public long c(int i4) {
        return ((long[]) this.f1008b)[i4];
    }

    public void d(String str, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        m mVar = (m) this.f1009c;
        mVar.getClass();
        O3.l.c(str);
        O3.l.d(value, str);
        mVar.i(str);
        mVar.f(str, value);
    }

    @Override // V0.d
    public List e(long j4) {
        C0258c c0258c = (C0258c) this.f1007a;
        Map map = (Map) this.f1009c;
        HashMap hashMap = (HashMap) this.f1010d;
        HashMap hashMap2 = (HashMap) this.f1011e;
        ArrayList arrayList = new ArrayList();
        c0258c.g(j4, c0258c.f5336h, arrayList);
        TreeMap treeMap = new TreeMap();
        c0258c.i(j4, false, c0258c.f5336h, treeMap);
        c0258c.h(j4, map, hashMap, c0258c.f5336h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C0261f c0261f = (C0261f) hashMap.get(pair.first);
                c0261f.getClass();
                arrayList2.add(new V.b(null, null, null, decodeByteArray, c0261f.f5356c, 0, c0261f.f5358e, c0261f.f5355b, 0, Integer.MIN_VALUE, -3.4028235E38f, c0261f.f5359f, c0261f.f5360g, false, -16777216, c0261f.f5363j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C0261f c0261f2 = (C0261f) hashMap.get(entry.getKey());
            c0261f2.getClass();
            V.a aVar = (V.a) entry.getValue();
            CharSequence charSequence = aVar.f3115a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C0256a c0256a : (C0256a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0256a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c0256a), spannableStringBuilder.getSpanEnd(c0256a), (CharSequence) "");
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length(); i5++) {
                if (spannableStringBuilder.charAt(i5) == ' ') {
                    int i6 = i5 + 1;
                    int i7 = i6;
                    while (i7 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i7) == ' ') {
                        i7++;
                    }
                    int i8 = i7 - i6;
                    if (i8 > 0) {
                        spannableStringBuilder.delete(i5, i8 + i5);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i9 = 0; i9 < spannableStringBuilder.length() - 1; i9++) {
                if (spannableStringBuilder.charAt(i9) == '\n') {
                    int i10 = i9 + 1;
                    if (spannableStringBuilder.charAt(i10) == ' ') {
                        spannableStringBuilder.delete(i10, i9 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == '\n') {
                        spannableStringBuilder.delete(i11, i12);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f4 = c0261f2.f5356c;
            int i13 = c0261f2.f5357d;
            aVar.f3119e = f4;
            aVar.f3120f = i13;
            aVar.f3121g = c0261f2.f5358e;
            aVar.f3122h = c0261f2.f5355b;
            aVar.f3126l = c0261f2.f5359f;
            float f5 = c0261f2.f5362i;
            int i14 = c0261f2.f5361h;
            aVar.f3125k = f5;
            aVar.f3124j = i14;
            aVar.f3128p = c0261f2.f5363j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // V0.d
    public int f() {
        return ((long[]) this.f1008b).length;
    }

    public void g(String method, w wVar) {
        kotlin.jvm.internal.i.e(method, "method");
        if (method.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (wVar == null) {
            if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC1514c.a("method ", method, " must have a request body.").toString());
            }
        } else if (!AbstractC0457a.y(method)) {
            throw new IllegalArgumentException(AbstractC1514c.a("method ", method, " must not have a request body.").toString());
        }
        this.f1008b = method;
        this.f1010d = wVar;
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        return new Q1.c((Executor) ((InterfaceC0264a) this.f1007a).get(), (M1.e) ((InterfaceC0264a) this.f1008b).get(), (R1.d) ((B1.j) this.f1009c).get(), (S1.d) ((InterfaceC0264a) this.f1010d).get(), (T1.c) ((InterfaceC0264a) this.f1011e).get());
    }

    public u() {
        this.f1011e = new LinkedHashMap();
        this.f1008b = "GET";
        this.f1009c = new m(0);
    }
}
