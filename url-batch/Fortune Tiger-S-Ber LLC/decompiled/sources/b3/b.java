package b3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b implements Iterator, v2.a {

    /* renamed from: f, reason: collision with root package name */
    public int f969f = -1;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public y2.c f970i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f971j;

    public b(c cVar) {
        this.f971j = cVar;
        int length = cVar.f972a.length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.g = length;
            this.h = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        m2.a aVar;
        int i4;
        Object obj;
        m2.a aVar2;
        int i5;
        Object obj2;
        c cVar = this.f971j;
        CharSequence charSequence = cVar.f972a;
        int i6 = this.h;
        if (i6 < 0) {
            this.f969f = 0;
            this.f970i = null;
            return;
        }
        if (i6 > charSequence.length()) {
            this.f970i = new y2.c(this.g, e.e0(charSequence), 1);
            this.h = -1;
        } else {
            u2.d dVar = cVar.f973b;
            Integer valueOf = Integer.valueOf(this.h);
            n nVar = (n) dVar;
            switch (nVar.f975f) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    u2.c.e(charSequence2, "$this$$receiver");
                    int i02 = e.i0(charSequence2, (char[]) nVar.g, intValue, false);
                    if (i02 >= 0) {
                        aVar = new m2.a(Integer.valueOf(i02), 1);
                        break;
                    } else {
                        aVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    u2.c.e(charSequence3, "$this$$receiver");
                    List list = (List) nVar.g;
                    aVar = null;
                    if (list.size() == 1) {
                        int size = list.size();
                        if (size == 0) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (size != 1) {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                        String str = (String) list.get(0);
                        int h02 = e.h0(charSequence3, str, intValue2, 4);
                        if (h02 >= 0) {
                            aVar2 = new m2.a(Integer.valueOf(h02), str);
                            if (aVar2 != null) {
                                aVar = new m2.a(aVar2.f2914f, Integer.valueOf(((String) aVar2.g).length()));
                                break;
                            }
                        }
                        aVar2 = null;
                        if (aVar2 != null) {
                        }
                    } else {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        y2.c cVar2 = new y2.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i7 = cVar2.h;
                        int i8 = cVar2.g;
                        if (z3) {
                            if ((i7 > 0 && intValue2 <= i8) || (i7 < 0 && i8 <= intValue2)) {
                                int i9 = intValue2;
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str2 = (String) obj2;
                                            i5 = i9;
                                            if (!m.Y(0, i9, str2.length(), str2, (String) charSequence3, false)) {
                                                i9 = i5;
                                            }
                                        } else {
                                            i5 = i9;
                                            obj2 = null;
                                        }
                                    }
                                    String str3 = (String) obj2;
                                    if (str3 != null) {
                                        aVar2 = new m2.a(Integer.valueOf(i5), str3);
                                    } else if (i5 != i8) {
                                        i9 = i5 + i7;
                                    }
                                }
                            }
                            aVar2 = null;
                            if (aVar2 != null) {
                            }
                        } else {
                            if ((i7 > 0 && intValue2 <= i8) || (i7 < 0 && i8 <= intValue2)) {
                                int i10 = intValue2;
                                while (true) {
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj = it2.next();
                                            String str4 = (String) obj;
                                            i4 = i7;
                                            if (!e.l0(str4, 0, charSequence3, i10, str4.length(), false)) {
                                                i7 = i4;
                                            }
                                        } else {
                                            i4 = i7;
                                            obj = null;
                                        }
                                    }
                                    String str5 = (String) obj;
                                    if (str5 != null) {
                                        aVar2 = new m2.a(Integer.valueOf(i10), str5);
                                    } else if (i10 != i8) {
                                        i10 += i4;
                                        i7 = i4;
                                    }
                                }
                                if (aVar2 != null) {
                                }
                            }
                            aVar2 = null;
                            if (aVar2 != null) {
                            }
                        }
                    }
                    break;
            }
            if (aVar == null) {
                this.f970i = new y2.c(this.g, e.e0(charSequence), 1);
                this.h = -1;
            } else {
                int intValue3 = ((Number) aVar.f2914f).intValue();
                int intValue4 = ((Number) aVar.g).intValue();
                this.f970i = l0.g.z(this.g, intValue3);
                int i11 = intValue3 + intValue4;
                this.g = i11;
                this.h = i11 + (intValue4 == 0 ? 1 : 0);
            }
        }
        this.f969f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f969f == -1) {
            a();
        }
        return this.f969f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f969f == -1) {
            a();
        }
        if (this.f969f == 0) {
            throw new NoSuchElementException();
        }
        y2.c cVar = this.f970i;
        u2.c.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f970i = null;
        this.f969f = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
