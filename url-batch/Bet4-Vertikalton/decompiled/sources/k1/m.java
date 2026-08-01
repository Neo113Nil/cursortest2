package k1;

import c1.p;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m extends d1.e implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2766c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, boolean z2, int i) {
        super(2);
        this.f2765b = i;
        this.d = obj;
        this.f2766c = z2;
    }

    @Override // c1.p
    public final Object c(Object obj, Serializable serializable) {
        int i;
        int i2;
        boolean z2;
        Object obj2;
        R0.c cVar;
        Object obj3;
        switch (this.f2765b) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) serializable).intValue();
                d1.d.e(charSequence, "$this$$receiver");
                int F = d.F(charSequence, (char[]) this.d, intValue, this.f2766c);
                if (F < 0) {
                    return null;
                }
                return new R0.c(Integer.valueOf(F), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) serializable).intValue();
                d1.d.e(charSequence2, "$this$$receiver");
                List list = (List) this.d;
                boolean z3 = this.f2766c;
                if (z3 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    h1.c cVar2 = new h1.c(intValue2, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = cVar2.f2519c;
                    int i4 = cVar2.f2518b;
                    if (z4) {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        String str = (String) obj3;
                                        if (l.v(0, intValue2, str.length(), str, (String) charSequence2, z3)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str2 = (String) obj3;
                                if (str2 != null) {
                                    cVar = new R0.c(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != i4) {
                                    intValue2 += i3;
                                }
                            }
                        }
                        cVar = null;
                    } else {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            int i5 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        String str3 = (String) obj2;
                                        i = i4;
                                        i2 = i3;
                                        z2 = z3;
                                        if (!d.I(str3, 0, charSequence2, i5, str3.length(), z3)) {
                                            z3 = z2;
                                            i4 = i;
                                            i3 = i2;
                                        }
                                    } else {
                                        i = i4;
                                        i2 = i3;
                                        z2 = z3;
                                        obj2 = null;
                                    }
                                }
                                String str4 = (String) obj2;
                                if (str4 != null) {
                                    cVar = new R0.c(Integer.valueOf(i5), str4);
                                } else if (i5 != i) {
                                    i5 += i2;
                                    z3 = z2;
                                    i4 = i;
                                    i3 = i2;
                                }
                            }
                        }
                        cVar = null;
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
                    int E2 = d.E(charSequence2, str5, intValue2, false, 4);
                    if (E2 >= 0) {
                        cVar = new R0.c(Integer.valueOf(E2), str5);
                    }
                    cVar = null;
                }
                if (cVar == null) {
                    return null;
                }
                return new R0.c(cVar.f773a, Integer.valueOf(((String) cVar.f774b).length()));
        }
    }
}
