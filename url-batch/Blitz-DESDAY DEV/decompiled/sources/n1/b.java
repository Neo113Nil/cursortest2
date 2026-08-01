package n1;

import h0.a0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, h1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3293a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3294b;

    /* renamed from: c, reason: collision with root package name */
    public int f3295c;
    public k1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3297f;

    public b(c cVar) {
        this.f3297f = cVar;
        int e2 = a0.e(cVar.f3299b, 0, cVar.f3298a.length());
        this.f3294b = e2;
        this.f3295c = e2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        W0.c cVar;
        int i;
        int i2;
        Object obj;
        W0.c cVar2;
        Object obj2;
        int i3 = this.f3295c;
        if (i3 < 0) {
            this.f3293a = 0;
            this.d = null;
            return;
        }
        c cVar3 = this.f3297f;
        int i4 = cVar3.f3300c;
        CharSequence charSequence = cVar3.f3298a;
        if (i4 > 0) {
            int i5 = this.f3296e + 1;
            this.f3296e = i5;
        }
        if (i3 <= charSequence.length()) {
            g1.e eVar = cVar3.d;
            Integer valueOf = Integer.valueOf(this.f3295c);
            m mVar = (m) eVar;
            switch (mVar.f3301b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    g1.d.e(charSequence2, "$this$$receiver");
                    int I2 = d.I(charSequence2, (char[]) mVar.d, intValue, mVar.f3302c);
                    if (I2 >= 0) {
                        cVar = new W0.c(Integer.valueOf(I2), 1);
                        break;
                    } else {
                        cVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    g1.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    cVar = null;
                    boolean z2 = mVar.f3302c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        k1.c cVar4 = new k1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar4.f2840c;
                        int i7 = cVar4.f2839b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.y(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        cVar2 = new W0.c(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (cVar2 != null) {
                                    cVar = new W0.c(cVar2.f950a, Integer.valueOf(((String) cVar2.f951b).length()));
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
                                            if (!d.L(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        cVar2 = new W0.c(Integer.valueOf(intValue2), str4);
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
                        int H = d.H(charSequence3, str5, intValue2, false, 4);
                        if (H >= 0) {
                            cVar2 = new W0.c(Integer.valueOf(H), str5);
                            if (cVar2 != null) {
                            }
                        }
                        cVar2 = null;
                        if (cVar2 != null) {
                        }
                    }
                    this.f3293a = 1;
            }
            if (cVar == null) {
                this.d = new k1.c(this.f3294b, d.E(charSequence), 1);
                this.f3295c = -1;
            } else {
                int intValue3 = ((Number) cVar.f950a).intValue();
                int intValue4 = ((Number) cVar.f951b).intValue();
                this.d = a0.v(this.f3294b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f3294b = i8;
                this.f3295c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f3293a = 1;
        }
        this.d = new k1.c(this.f3294b, d.E(charSequence), 1);
        this.f3295c = -1;
        this.f3293a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3293a == -1) {
            a();
        }
        return this.f3293a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3293a == -1) {
            a();
        }
        if (this.f3293a == 0) {
            throw new NoSuchElementException();
        }
        k1.c cVar = this.d;
        g1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3293a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
