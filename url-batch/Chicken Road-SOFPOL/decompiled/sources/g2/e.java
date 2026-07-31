package g2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: d, reason: collision with root package name */
    public final List f2927d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2928e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2929f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2930g;

    static {
        a0.a0 a0Var = z.f3010a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r1.a(r3.f2919c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f2927d = list;
        this.f2928e = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i8 = 0; i8 < size; i8++) {
                c cVar = (c) list.get(i8);
                Object obj = cVar.f2917a;
                if (obj instanceof b0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (obj instanceof r) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f2929f = arrayList;
        this.f2930g = arrayList2;
        List d02 = arrayList2 != null ? d6.m.d0(arrayList2, new d(i)) : null;
        if (d02 == null || d02.isEmpty()) {
            return;
        }
        int i9 = ((c) d6.m.R(d02)).f2919c;
        o.w wVar = o.k.f5488a;
        int i10 = 1;
        o.w wVar2 = new o.w(1);
        wVar2.a(i9);
        int size2 = d02.size();
        while (i10 < size2) {
            c cVar2 = (c) d02.get(i10);
            while (true) {
                int i11 = wVar2.f5560b;
                if (i11 == 0) {
                    break;
                }
                if (i11 == 0) {
                    p.a.e("IntList is empty.");
                    throw null;
                }
                int i12 = wVar2.f5559a[i11 - 1];
                int i13 = cVar2.f2918b;
                int i14 = cVar2.f2919c;
                if (i13 >= i12) {
                    wVar2.c(i11 - 1);
                } else if (i14 > i12) {
                    l2.a.a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + i12);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f2928e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return q6.i.a(this.f2928e, eVar.f2928e) && q6.i.a(this.f2927d, eVar.f2927d);
    }

    public final int hashCode() {
        int hashCode = this.f2928e.hashCode() * 31;
        List list = this.f2927d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2928e.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r1.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i, int i8) {
        ArrayList arrayList;
        if (i > i8) {
            l2.a.a("start (" + i + ") should be less or equal to end (" + i8 + ')');
        }
        String str = this.f2928e;
        if (i == 0 && i8 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i8);
        q6.i.d(substring, "substring(...)");
        int i9 = f.f2940a;
        if (i > i8) {
            l2.a.a("start (" + i + ") should be less than or equal to end (" + i8 + ')');
        }
        List list = this.f2927d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) list.get(i10);
                int i11 = cVar.f2918b;
                int i12 = cVar.f2919c;
                if (f.a(i, i8, i11, i12)) {
                    arrayList.add(new c(cVar.f2917a, Math.max(i, cVar.f2918b) - i, Math.min(i8, i12) - i, cVar.f2920d));
                }
            }
        }
        arrayList = null;
        return new e(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2928e;
    }

    public /* synthetic */ e(String str) {
        this(str, d6.u.f2326d);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
