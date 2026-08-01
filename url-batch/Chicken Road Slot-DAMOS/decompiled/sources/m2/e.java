package m2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: d, reason: collision with root package name */
    public final List f6453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6454e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6455i;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f6456r;

    static {
        c6.c cVar = y.f6520a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r10.a(r2.f6441c);
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f6453d = list;
        this.f6454e = str;
        int i3 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) list.get(i10);
                Object obj = cVar.f6439a;
                if (obj instanceof a0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (obj instanceof p) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f6455i = arrayList;
        this.f6456r = arrayList2;
        List L = arrayList2 != null ? CollectionsKt.L(arrayList2, new d(i3)) : null;
        if (L == null || L.isEmpty()) {
            return;
        }
        int i11 = ((c) CollectionsKt.x(L)).f6441c;
        int i12 = s.j.f8324a;
        int i13 = 1;
        s.v vVar = new s.v(1);
        vVar.a(i11);
        int size2 = L.size();
        while (i13 < size2) {
            c cVar2 = (c) L.get(i13);
            while (true) {
                int i14 = vVar.f8390b;
                if (i14 == 0) {
                    break;
                }
                if (i14 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                int i15 = vVar.f8389a[i14 - 1];
                int i16 = cVar2.f6440b;
                int i17 = cVar2.f6441c;
                if (i16 >= i15) {
                    vVar.c(i14 - 1);
                } else if (i17 > i15) {
                    r2.a.a("Paragraph overlap not allowed, end " + i17 + " should be less than or equal to " + i15);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f6454e.charAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f6454e, eVar.f6454e) && Intrinsics.a(this.f6453d, eVar.f6453d);
    }

    public final int hashCode() {
        int hashCode = this.f6454e.hashCode() * 31;
        List list = this.f6453d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6454e.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r1.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i3, int i10) {
        ArrayList arrayList;
        if (i3 > i10) {
            r2.a.a("start (" + i3 + ") should be less or equal to end (" + i10 + ')');
        }
        String str = this.f6454e;
        if (i3 == 0 && i10 == str.length()) {
            return this;
        }
        String substring = str.substring(i3, i10);
        int i11 = f.f6463a;
        if (i3 > i10) {
            r2.a.a("start (" + i3 + ") should be less than or equal to end (" + i10 + ')');
        }
        List list = this.f6453d;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = (c) list.get(i12);
                int i13 = cVar.f6440b;
                int i14 = cVar.f6441c;
                if (f.a(i3, i10, i13, i14)) {
                    arrayList.add(new c(Math.max(i3, cVar.f6440b) - i3, Math.min(i10, i14) - i3, cVar.f6439a, cVar.f6442d));
                }
            }
        }
        arrayList = null;
        return new e(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6454e;
    }

    public e(String str) {
        this(str, kotlin.collections.j0.f5574d);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
