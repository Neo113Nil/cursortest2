package i1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, c1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f2463a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2464b;

    /* renamed from: c, reason: collision with root package name */
    public int f2465c;
    public f1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f2466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f2467f;

    public b(c cVar) {
        this.f2467f = cVar;
        int n2 = u1.l.n(cVar.f2469b, 0, cVar.f2468a.length());
        this.f2464b = n2;
        this.f2465c = n2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        S0.c cVar;
        int i;
        int i2;
        Object obj;
        S0.c cVar2;
        Object obj2;
        int i3 = this.f2465c;
        if (i3 < 0) {
            this.f2463a = 0;
            this.d = null;
            return;
        }
        c cVar3 = this.f2467f;
        int i4 = cVar3.f2470c;
        CharSequence charSequence = cVar3.f2468a;
        if (i4 > 0) {
            int i5 = this.f2466e + 1;
            this.f2466e = i5;
        }
        if (i3 <= charSequence.length()) {
            b1.e eVar = cVar3.d;
            Integer valueOf = Integer.valueOf(this.f2465c);
            m mVar = (m) eVar;
            switch (mVar.f2471b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    b1.d.e(charSequence2, "$this$$receiver");
                    int v02 = d.v0(charSequence2, (char[]) mVar.d, intValue, mVar.f2472c);
                    if (v02 >= 0) {
                        cVar = new S0.c(Integer.valueOf(v02), 1);
                        break;
                    } else {
                        cVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    b1.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    cVar = null;
                    boolean z2 = mVar.f2472c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        f1.c cVar4 = new f1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar4.f2256c;
                        int i7 = cVar4.f2255b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.l0(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        cVar2 = new S0.c(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (cVar2 != null) {
                                    cVar = new S0.c(cVar2.f752a, Integer.valueOf(((String) cVar2.f753b).length()));
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
                                            if (!d.y0(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        cVar2 = new S0.c(Integer.valueOf(intValue2), str4);
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
                        int u02 = d.u0(charSequence3, str5, intValue2, false, 4);
                        if (u02 >= 0) {
                            cVar2 = new S0.c(Integer.valueOf(u02), str5);
                            if (cVar2 != null) {
                            }
                        }
                        cVar2 = null;
                        if (cVar2 != null) {
                        }
                    }
                    this.f2463a = 1;
            }
            if (cVar == null) {
                this.d = new f1.c(this.f2464b, d.r0(charSequence), 1);
                this.f2465c = -1;
            } else {
                int intValue3 = ((Number) cVar.f752a).intValue();
                int intValue4 = ((Number) cVar.f753b).intValue();
                this.d = u1.l.h0(this.f2464b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f2464b = i8;
                this.f2465c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f2463a = 1;
        }
        this.d = new f1.c(this.f2464b, d.r0(charSequence), 1);
        this.f2465c = -1;
        this.f2463a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2463a == -1) {
            a();
        }
        return this.f2463a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2463a == -1) {
            a();
        }
        if (this.f2463a == 0) {
            throw new NoSuchElementException();
        }
        f1.c cVar = this.d;
        b1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f2463a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
