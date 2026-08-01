package e1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, Y0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f1916a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f1917b;

    /* renamed from: c, reason: collision with root package name */
    public int f1918c;
    public b1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f1919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f1920f;

    public b(c cVar) {
        this.f1920f = cVar;
        int i = cVar.f1922b;
        int length = cVar.f1921a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f1917b = i;
        this.f1918c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        P0.b bVar;
        int i;
        int i2;
        Object obj;
        P0.b bVar2;
        Object obj2;
        int i3 = this.f1918c;
        if (i3 < 0) {
            this.f1916a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f1920f;
        int i4 = cVar.f1923c;
        CharSequence charSequence = cVar.f1921a;
        if (i4 > 0) {
            int i5 = this.f1919e + 1;
            this.f1919e = i5;
        }
        if (i3 <= charSequence.length()) {
            X0.e eVar = cVar.d;
            Integer valueOf = Integer.valueOf(this.f1918c);
            m mVar = (m) eVar;
            switch (mVar.f1924b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    X0.d.e(charSequence2, "$this$$receiver");
                    int p02 = d.p0(charSequence2, (char[]) mVar.d, intValue, mVar.f1925c);
                    if (p02 >= 0) {
                        bVar = new P0.b(Integer.valueOf(p02), 1);
                        break;
                    } else {
                        bVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    X0.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    bVar = null;
                    boolean z2 = mVar.f1925c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        b1.c cVar2 = new b1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar2.f1509c;
                        int i7 = cVar2.f1508b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.f0(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        bVar2 = new P0.b(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (bVar2 != null) {
                                    bVar = new P0.b(bVar2.f620a, Integer.valueOf(((String) bVar2.f621b).length()));
                                    break;
                                }
                            }
                            bVar2 = null;
                            if (bVar2 != null) {
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
                                            if (!d.s0(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        bVar2 = new P0.b(Integer.valueOf(intValue2), str4);
                                    } else if (intValue2 != i) {
                                        intValue2 += i2;
                                        i7 = i;
                                        i6 = i2;
                                    }
                                }
                            }
                            bVar2 = null;
                            if (bVar2 != null) {
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
                        int o02 = d.o0(charSequence3, str5, intValue2, false, 4);
                        if (o02 >= 0) {
                            bVar2 = new P0.b(Integer.valueOf(o02), str5);
                            if (bVar2 != null) {
                            }
                        }
                        bVar2 = null;
                        if (bVar2 != null) {
                        }
                    }
                    this.f1916a = 1;
            }
            if (bVar == null) {
                this.d = new b1.c(this.f1917b, d.l0(charSequence), 1);
                this.f1918c = -1;
            } else {
                int intValue3 = ((Number) bVar.f620a).intValue();
                int intValue4 = ((Number) bVar.f621b).intValue();
                this.d = q1.d.u0(this.f1917b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f1917b = i8;
                this.f1918c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f1916a = 1;
        }
        this.d = new b1.c(this.f1917b, d.l0(charSequence), 1);
        this.f1918c = -1;
        this.f1916a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1916a == -1) {
            a();
        }
        return this.f1916a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1916a == -1) {
            a();
        }
        if (this.f1916a == 0) {
            throw new NoSuchElementException();
        }
        b1.c cVar = this.d;
        X0.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f1916a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
