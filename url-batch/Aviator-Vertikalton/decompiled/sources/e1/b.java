package e1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2374a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2375b;

    /* renamed from: c, reason: collision with root package name */
    public int f2376c;

    /* renamed from: d, reason: collision with root package name */
    public b1.c f2377d;

    /* renamed from: e, reason: collision with root package name */
    public int f2378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2379f;

    public b(c cVar) {
        this.f2379f = cVar;
        int i = cVar.f2381b;
        int length = cVar.f2380a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f2375b = i;
        this.f2376c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        N0.c cVar;
        int i;
        int i2;
        Object obj;
        N0.c cVar2;
        Object obj2;
        int i3 = this.f2376c;
        if (i3 < 0) {
            this.f2374a = 0;
            this.f2377d = null;
            return;
        }
        c cVar3 = this.f2379f;
        int i4 = cVar3.f2382c;
        CharSequence charSequence = cVar3.f2380a;
        if (i4 > 0) {
            int i5 = this.f2378e + 1;
            this.f2378e = i5;
        }
        if (i3 <= charSequence.length()) {
            X0.g gVar = cVar3.f2383d;
            Integer valueOf = Integer.valueOf(this.f2376c);
            m mVar = (m) gVar;
            switch (mVar.f2384b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    X0.f.e(charSequence2, "$this$$receiver");
                    int G02 = d.G0(charSequence2, (char[]) mVar.f2386d, intValue, mVar.f2385c);
                    if (G02 >= 0) {
                        cVar = new N0.c(Integer.valueOf(G02), 1);
                        break;
                    } else {
                        cVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    X0.f.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.f2386d;
                    cVar = null;
                    boolean z2 = mVar.f2385c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        b1.c cVar4 = new b1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar4.f1639c;
                        int i7 = cVar4.f1638b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.w0(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        cVar2 = new N0.c(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (cVar2 != null) {
                                    cVar = new N0.c(cVar2.f670a, Integer.valueOf(((String) cVar2.f671b).length()));
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
                                            if (!d.J0(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        cVar2 = new N0.c(Integer.valueOf(intValue2), str4);
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
                        int F02 = d.F0(charSequence3, str5, intValue2, false, 4);
                        if (F02 >= 0) {
                            cVar2 = new N0.c(Integer.valueOf(F02), str5);
                            if (cVar2 != null) {
                            }
                        }
                        cVar2 = null;
                        if (cVar2 != null) {
                        }
                    }
                    this.f2374a = 1;
            }
            if (cVar == null) {
                this.f2377d = new b1.c(this.f2375b, d.C0(charSequence), 1);
                this.f2376c = -1;
            } else {
                int intValue3 = ((Number) cVar.f670a).intValue();
                int intValue4 = ((Number) cVar.f671b).intValue();
                this.f2377d = q1.d.a0(this.f2375b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f2375b = i8;
                this.f2376c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f2374a = 1;
        }
        this.f2377d = new b1.c(this.f2375b, d.C0(charSequence), 1);
        this.f2376c = -1;
        this.f2374a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2374a == -1) {
            a();
        }
        return this.f2374a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2374a == -1) {
            a();
        }
        if (this.f2374a == 0) {
            throw new NoSuchElementException();
        }
        b1.c cVar = this.f2377d;
        X0.f.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2377d = null;
        this.f2374a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
