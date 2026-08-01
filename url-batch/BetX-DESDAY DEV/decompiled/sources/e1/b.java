package e1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2378a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2379b;

    /* renamed from: c, reason: collision with root package name */
    public int f2380c;

    /* renamed from: d, reason: collision with root package name */
    public b1.c f2381d;

    /* renamed from: e, reason: collision with root package name */
    public int f2382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2383f;

    public b(c cVar) {
        this.f2383f = cVar;
        int m2 = q1.d.m(cVar.f2385b, 0, cVar.f2384a.length());
        this.f2379b = m2;
        this.f2380c = m2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        N0.d dVar;
        int i;
        int i2;
        Object obj;
        N0.d dVar2;
        Object obj2;
        int i3 = this.f2380c;
        if (i3 < 0) {
            this.f2378a = 0;
            this.f2381d = null;
            return;
        }
        c cVar = this.f2383f;
        int i4 = cVar.f2386c;
        CharSequence charSequence = cVar.f2384a;
        if (i4 > 0) {
            int i5 = this.f2382e + 1;
            this.f2382e = i5;
        }
        if (i3 <= charSequence.length()) {
            X0.g gVar = cVar.f2387d;
            Integer valueOf = Integer.valueOf(this.f2380c);
            m mVar = (m) gVar;
            switch (mVar.f2388b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    X0.f.e(charSequence2, "$this$$receiver");
                    int G02 = d.G0(charSequence2, (char[]) mVar.f2390d, intValue, mVar.f2389c);
                    if (G02 >= 0) {
                        dVar = new N0.d(Integer.valueOf(G02), 1);
                        break;
                    } else {
                        dVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    X0.f.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.f2390d;
                    dVar = null;
                    boolean z2 = mVar.f2389c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        b1.c cVar2 = new b1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar2.f1640c;
                        int i7 = cVar2.f1639b;
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
                                        dVar2 = new N0.d(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (dVar2 != null) {
                                    dVar = new N0.d(dVar2.f671a, Integer.valueOf(((String) dVar2.f672b).length()));
                                    break;
                                }
                            }
                            dVar2 = null;
                            if (dVar2 != null) {
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
                                        dVar2 = new N0.d(Integer.valueOf(intValue2), str4);
                                    } else if (intValue2 != i) {
                                        intValue2 += i2;
                                        i7 = i;
                                        i6 = i2;
                                    }
                                }
                            }
                            dVar2 = null;
                            if (dVar2 != null) {
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
                            dVar2 = new N0.d(Integer.valueOf(F02), str5);
                            if (dVar2 != null) {
                            }
                        }
                        dVar2 = null;
                        if (dVar2 != null) {
                        }
                    }
                    this.f2378a = 1;
            }
            if (dVar == null) {
                this.f2381d = new b1.c(this.f2379b, d.C0(charSequence), 1);
                this.f2380c = -1;
            } else {
                int intValue3 = ((Number) dVar.f671a).intValue();
                int intValue4 = ((Number) dVar.f672b).intValue();
                this.f2381d = q1.d.a0(this.f2379b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f2379b = i8;
                this.f2380c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f2378a = 1;
        }
        this.f2381d = new b1.c(this.f2379b, d.C0(charSequence), 1);
        this.f2380c = -1;
        this.f2378a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2378a == -1) {
            a();
        }
        return this.f2378a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2378a == -1) {
            a();
        }
        if (this.f2378a == 0) {
            throw new NoSuchElementException();
        }
        b1.c cVar = this.f2381d;
        X0.f.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f2381d = null;
        this.f2378a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
