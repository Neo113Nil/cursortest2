package q1;

import i1.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class n extends j1.i implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f4009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4010d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, boolean z2, int i) {
        super(2);
        this.f4008b = i;
        this.f4010d = obj;
        this.f4009c = z2;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        int i;
        int i2;
        boolean z2;
        Object obj3;
        W0.d dVar;
        Object obj4;
        switch (this.f4008b) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                j1.h.e(charSequence, "$this$$receiver");
                int A02 = e.A0(charSequence, (char[]) this.f4010d, intValue, this.f4009c);
                if (A02 < 0) {
                    return null;
                }
                return new W0.d(Integer.valueOf(A02), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                j1.h.e(charSequence2, "$this$$receiver");
                List list = (List) this.f4010d;
                boolean z3 = this.f4009c;
                if (z3 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    n1.c cVar = new n1.c(intValue2, charSequence2.length(), 1);
                    boolean z4 = charSequence2 instanceof String;
                    int i3 = cVar.f3757c;
                    int i4 = cVar.f3756b;
                    if (z4) {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (m.p0(0, intValue2, str.length(), str, (String) charSequence2, z3)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    dVar = new W0.d(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != i4) {
                                    intValue2 += i3;
                                }
                            }
                        }
                        dVar = null;
                    } else {
                        if ((i3 > 0 && intValue2 <= i4) || (i3 < 0 && i4 <= intValue2)) {
                            int i5 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        i = i4;
                                        i2 = i3;
                                        z2 = z3;
                                        if (!e.E0(str3, 0, charSequence2, i5, str3.length(), z3)) {
                                            z3 = z2;
                                            i4 = i;
                                            i3 = i2;
                                        }
                                    } else {
                                        i = i4;
                                        i2 = i3;
                                        z2 = z3;
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    dVar = new W0.d(Integer.valueOf(i5), str4);
                                } else if (i5 != i) {
                                    i5 += i2;
                                    z3 = z2;
                                    i4 = i;
                                    i3 = i2;
                                }
                            }
                        }
                        dVar = null;
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
                    int z02 = e.z0(charSequence2, str5, intValue2, false, 4);
                    if (z02 >= 0) {
                        dVar = new W0.d(Integer.valueOf(z02), str5);
                    }
                    dVar = null;
                }
                if (dVar == null) {
                    return null;
                }
                return new W0.d(dVar.f1338a, Integer.valueOf(((String) dVar.f1339b).length()));
        }
    }
}
