package l1;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, f1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f3162a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f3163b;

    /* renamed from: c, reason: collision with root package name */
    public int f3164c;
    public i1.c d;

    /* renamed from: e, reason: collision with root package name */
    public int f3165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f3166f;

    public b(c cVar) {
        this.f3166f = cVar;
        int i = cVar.f3168b;
        int length = cVar.f3167a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i < 0) {
            i = 0;
        } else if (i > length) {
            i = length;
        }
        this.f3163b = i;
        this.f3164c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r4) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        V0.c cVar;
        int i;
        int i2;
        Object obj;
        V0.c cVar2;
        Object obj2;
        int i3 = this.f3164c;
        if (i3 < 0) {
            this.f3162a = 0;
            this.d = null;
            return;
        }
        c cVar3 = this.f3166f;
        int i4 = cVar3.f3169c;
        CharSequence charSequence = cVar3.f3167a;
        if (i4 > 0) {
            int i5 = this.f3165e + 1;
            this.f3165e = i5;
        }
        if (i3 <= charSequence.length()) {
            e1.e eVar = cVar3.d;
            Integer valueOf = Integer.valueOf(this.f3164c);
            m mVar = (m) eVar;
            switch (mVar.f3170b) {
                case 0:
                    CharSequence charSequence2 = charSequence;
                    int intValue = valueOf.intValue();
                    e1.d.e(charSequence2, "$this$$receiver");
                    int B2 = d.B(charSequence2, (char[]) mVar.d, intValue, mVar.f3171c);
                    if (B2 >= 0) {
                        cVar = new V0.c(Integer.valueOf(B2), 1);
                        break;
                    } else {
                        cVar = null;
                        break;
                    }
                default:
                    CharSequence charSequence3 = charSequence;
                    int intValue2 = valueOf.intValue();
                    e1.d.e(charSequence3, "$this$$receiver");
                    List list = (List) mVar.d;
                    cVar = null;
                    boolean z2 = mVar.f3171c;
                    if (z2 || list.size() != 1) {
                        if (intValue2 < 0) {
                            intValue2 = 0;
                        }
                        i1.c cVar4 = new i1.c(intValue2, charSequence3.length(), 1);
                        boolean z3 = charSequence3 instanceof String;
                        int i6 = cVar4.f2520c;
                        int i7 = cVar4.f2519b;
                        if (z3) {
                            if ((i6 > 0 && intValue2 <= i7) || (i6 < 0 && i7 <= intValue2)) {
                                while (true) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            String str = (String) obj2;
                                            if (l.r(0, intValue2, str.length(), str, (String) charSequence3, z2)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    String str2 = (String) obj2;
                                    if (str2 != null) {
                                        cVar2 = new V0.c(Integer.valueOf(intValue2), str2);
                                    } else if (intValue2 != i7) {
                                        intValue2 += i6;
                                    }
                                }
                                if (cVar2 != null) {
                                    cVar = new V0.c(cVar2.f872a, Integer.valueOf(((String) cVar2.f873b).length()));
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
                                            if (!d.E(str3, 0, charSequence3, intValue2, str3.length(), z2)) {
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
                                        cVar2 = new V0.c(Integer.valueOf(intValue2), str4);
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
                        int A2 = d.A(charSequence3, str5, intValue2, false, 4);
                        if (A2 >= 0) {
                            cVar2 = new V0.c(Integer.valueOf(A2), str5);
                            if (cVar2 != null) {
                            }
                        }
                        cVar2 = null;
                        if (cVar2 != null) {
                        }
                    }
                    this.f3162a = 1;
            }
            if (cVar == null) {
                this.d = new i1.c(this.f3163b, d.x(charSequence), 1);
                this.f3164c = -1;
            } else {
                int intValue3 = ((Number) cVar.f872a).intValue();
                int intValue4 = ((Number) cVar.f873b).intValue();
                this.d = x1.l.j0(this.f3163b, intValue3);
                int i8 = intValue3 + intValue4;
                this.f3163b = i8;
                this.f3164c = i8 + (intValue4 == 0 ? 1 : 0);
            }
            this.f3162a = 1;
        }
        this.d = new i1.c(this.f3163b, d.x(charSequence), 1);
        this.f3164c = -1;
        this.f3162a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3162a == -1) {
            a();
        }
        return this.f3162a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3162a == -1) {
            a();
        }
        if (this.f3162a == 0) {
            throw new NoSuchElementException();
        }
        i1.c cVar = this.d;
        e1.d.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.f3162a = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
