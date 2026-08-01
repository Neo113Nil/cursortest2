package i1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2502a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2503b;

    /* renamed from: c, reason: collision with root package name */
    public int f2504c;
    public f1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f2505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2506f;

    public b(c cVar) {
        this.f2506f = cVar;
        int m2 = u1.l.m(cVar.f2508b, cVar.f2507a.length());
        this.f2503b = m2;
        this.f2504c = m2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        S0.b bVar;
        int i;
        int i2;
        Object obj;
        S0.b bVar2;
        Object obj2;
        int i3 = this.f2504c;
        if (i3 < 0) {
            this.f2502a = 0;
            this.d = null;
            return;
        }
        c cVar = this.f2506f;
        int i4 = cVar.f2509c;
        CharSequence charSequence = cVar.f2507a;
        if (i4 > 0) {
            int i5 = this.f2505e + 1;
            this.f2505e = i5;
        }
        if (i3 <= charSequence.length()) {
            b1.e eVar = cVar.d;
            Integer valueOf = Integer.valueOf(this.f2504c);
            m mVar = (m) eVar;
            switch (mVar.f2510b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    b1.d.e(charSequence2, "$this$$receiver");
                    int D02 = d.D0(charSequence2, (char[]) mVar.d, intValue, mVar.f2511c);
                    if (D02 >= 0) {
                        bVar = new S0.b(Integer.valueOf(D02), 1);
                        break;
                    } else {
                        bVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    b1.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    bVar = null;
                    boolean z2 = mVar.f2511c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        f1.c cVar2 = new f1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar2.f2298c;
                        int i7 = cVar2.f2297b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.t0(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        bVar2 = new S0.b(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (bVar2 != null) {
                                    bVar = new S0.b(bVar2.f768a, Integer.valueOf(((String) bVar2.f769b).length()));
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
                                            if (!d.G0(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        bVar2 = new S0.b(Integer.valueOf(intValue2), str4);
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
                        int C0 = d.C0(charSequence3, str5, intValue2, false, 4);
                        if (C0 >= 0) {
                            bVar2 = new S0.b(Integer.valueOf(C0), str5);
                            if (bVar2 != null) {
                            }
                        }
                        bVar2 = null;
                        if (bVar2 != null) {
                        }
                    }
                    this.f2502a = 1;
            }
            if (bVar == null) {
                this.d = new f1.c(this.f2503b, d.z0(charSequence), 1);
                this.f2504c = -1;
            } else {
                int intValue3 = ((Number) bVar.f768a).intValue();
                int intValue4 = ((Number) bVar.f769b).intValue();
                this.d = u1.l.p0(this.f2503b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f2503b = i8;
                this.f2504c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f2502a = 1;
        }
        this.d = new f1.c(this.f2503b, d.z0(charSequence), 1);
        this.f2504c = -1;
        this.f2502a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2502a == -1) {
            a();
        }
        return this.f2502a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2502a == -1) {
            a();
        }
        if (this.f2502a == 0) {
            throw new NoSuchElementException();
        }
        f1.c cVar = this.d;
        b1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f2502a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
