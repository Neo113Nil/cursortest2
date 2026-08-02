package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hnz extends AbstractMap {
    public static final Comparator a = new alu(8);
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        if (r8 < 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hnz, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [hnz] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hnz(hnz hnzVar, hnz hnzVar2) {
        int i;
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.d = new hny(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = hnzVar.size() + hnzVar2.size();
        int b = hnzVar.b() + hnzVar2.b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[b];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry c = hnzVar.c(0);
        Map.Entry c2 = hnzVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int i6 = size;
        Map.Entry entry = c;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (entry == null && c2 == null) {
                break;
            }
            int i9 = i7 + 1;
            if (entry != null) {
                if (c2 != null) {
                    int compareTo = ((String) entry.getKey()).compareTo((String) c2.getKey());
                    if (compareTo == 0) {
                        int i10 = i4 + 1;
                        int i11 = i5 + 1;
                        objArr2[i7] = abstractMap.d((String) entry.getKey(), i7);
                        hny hnyVar = (hny) entry.getValue();
                        hny hnyVar2 = (hny) c2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i12 >= hnyVar.size() && i13 >= hnyVar2.size()) {
                                break;
                            }
                            int i14 = i12 == hnyVar.size() ? i8 : i13 == hnyVar2.size() ? -1 : 0;
                            i14 = i14 == 0 ? hob.a.compare(hnyVar.c(i12), hnyVar2.c(i13)) : i14;
                            if (i14 < 0) {
                                i = i12 + 1;
                                obj = hnyVar.c(i12);
                            } else {
                                int i15 = i13 + 1;
                                Object c3 = hnyVar2.c(i13);
                                i13 = i15;
                                i = i14 == 0 ? i12 + 1 : i12;
                                obj = c3;
                            }
                            objArr2[i6] = obj;
                            i12 = i;
                            i6++;
                            i8 = 1;
                            abstractMap = this;
                        }
                        iArr[i9] = i6;
                        entry = hnzVar.c(i10);
                        c2 = hnzVar2.c(i11);
                        i5 = i11;
                        i4 = i10;
                        i7 = i9;
                        i3 = 0;
                    }
                }
                i4++;
                i6 = a(entry, i7, i6, objArr2, iArr);
                entry = hnzVar.c(i4);
                i7 = i9;
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry2 = entry;
            i5++;
            int a2 = a(c2, i7, i6, objArr2, iArr);
            c2 = hnzVar2.c(i5);
            i6 = a2;
            entry = entry2;
            i7 = i9;
            i3 = 0;
            abstractMap = this;
        }
        int i16 = iArr[i3];
        int i17 = i16 - i7;
        if (i17 != 0) {
            for (int i18 = i3; i18 <= i7; i18++) {
                iArr[i18] = iArr[i18] - i17;
            }
            int i19 = iArr[i7];
            int i20 = i19 - i7;
            if (e(b, i19)) {
                objArr = new Object[i19];
                System.arraycopy(objArr2, i3, objArr, i3, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i16, objArr, i7, i20);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i21 = iArr[i3] + 1;
        abstractMap.c = e(i2, i21) ? Arrays.copyOf(iArr, i21) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        hny hnyVar = (hny) entry.getValue();
        int a2 = hnyVar.a() - hnyVar.b();
        System.arraycopy(hnyVar.b.b, hnyVar.b(), objArr, i2, a2);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + a2;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new hny(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer num = this.e;
        if (num == null) {
            num = Integer.valueOf(super.hashCode());
            this.e = num;
        }
        return num.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String abstractMap = super.toString();
        this.f = abstractMap;
        return abstractMap;
    }

    public hnz(List list) {
        this.d = new hny(this, -1);
        this.e = null;
        this.f = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            Object obj = ((bry) it2.next()).a;
            throw null;
        }
        Object obj2 = ((bry) it.next()).a;
        throw null;
    }
}
