package g1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, a1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2441a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2442b;

    /* renamed from: c, reason: collision with root package name */
    public int f2443c;
    public d1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f2444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2445f;

    public b(c cVar) {
        this.f2445f = cVar;
        int o2 = s1.l.o(cVar.f2447b, 0, cVar.f2446a.length());
        this.f2442b = o2;
        this.f2443c = o2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Q0.c cVar;
        int i;
        int i2;
        Object obj;
        Q0.c cVar2;
        Object obj2;
        int i3 = this.f2443c;
        if (i3 < 0) {
            this.f2441a = 0;
            this.d = null;
            return;
        }
        c cVar3 = this.f2445f;
        int i4 = cVar3.f2448c;
        CharSequence charSequence = cVar3.f2446a;
        if (i4 > 0) {
            int i5 = this.f2444e + 1;
            this.f2444e = i5;
        }
        if (i3 <= charSequence.length()) {
            Z0.e eVar = cVar3.d;
            Integer valueOf = Integer.valueOf(this.f2443c);
            m mVar = (m) eVar;
            switch (mVar.f2449b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    Z0.d.e(charSequence2, "$this$$receiver");
                    int z02 = d.z0(charSequence2, (char[]) mVar.d, intValue, mVar.f2450c);
                    if (z02 >= 0) {
                        cVar = new Q0.c(Integer.valueOf(z02), 1);
                        break;
                    } else {
                        cVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    Z0.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    cVar = null;
                    boolean z2 = mVar.f2450c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        d1.c cVar4 = new d1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar4.f1984c;
                        int i7 = cVar4.f1983b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.p0(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        cVar2 = new Q0.c(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (cVar2 != null) {
                                    cVar = new Q0.c(cVar2.f688a, Integer.valueOf(((String) cVar2.f689b).length()));
                                    break;
                                }
                            }
                            cVar2 = null;
                            if (cVar2 != null) {
                            }
                        } else {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = it2.next();
                                            String str3 = (String) obj;
                                            i = i7;
                                            i2 = i6;
                                            if (!d.C0(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
                                                i7 = i;
                                                i6 = i2;
                                            }
                                        } else {
                                            i = i7;
                                            i2 = i6;
                                            obj = null;
                                        }
                                    }
                                    String str4 = (String) obj;
                                    if (str4 != null) {
                                        cVar2 = new Q0.c(Integer.valueOf(intValue2), str4);
                                    } else if (intValue2 != i) {
                                        intValue2 += i2;
                                        i7 = i;
                                        i6 = i2;
                                    }
                                }
                            }
                            cVar2 = null;
                            if (cVar2 != null) {
                            }
                        }
                    } else {
                        int size = list.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                        String str5 = (String) list.get(0);
                        int y0 = d.y0(charSequence3, str5, intValue2, false, 4);
                        if (y0 >= 0) {
                            cVar2 = new Q0.c(Integer.valueOf(y0), str5);
                            if (cVar2 != null) {
                            }
                        }
                        cVar2 = null;
                        if (cVar2 != null) {
                        }
                    }
                    this.f2441a = 1;
            }
            if (cVar == null) {
                this.d = new d1.c(this.f2442b, d.v0(charSequence), 1);
                this.f2443c = -1;
            } else {
                int intValue3 = ((Number) cVar.f688a).intValue();
                int intValue4 = ((Number) cVar.f689b).intValue();
                this.d = s1.l.i0(this.f2442b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f2442b = i8;
                this.f2443c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f2441a = 1;
        }
        this.d = new d1.c(this.f2442b, d.v0(charSequence), 1);
        this.f2443c = -1;
        this.f2441a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2441a == -1) {
            a();
        }
        return this.f2441a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2441a == -1) {
            a();
        }
        if (this.f2441a == 0) {
            throw new NoSuchElementException();
        }
        d1.c cVar = this.d;
        Z0.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f2441a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
