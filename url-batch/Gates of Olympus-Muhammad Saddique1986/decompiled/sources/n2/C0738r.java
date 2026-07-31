package n2;

import e2.InterfaceC0426e;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k2.C0572d;

/* renamed from: n2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738r extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f7372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7373g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0738r(int i3, Object obj, boolean z3) {
        super(2);
        this.f7371e = i3;
        this.f7373g = obj;
        this.f7372f = z3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3;
        int i4;
        boolean z3;
        Object obj3;
        R1.i iVar;
        Object obj4;
        switch (this.f7371e) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                f2.j.f(charSequence, "$this$$receiver");
                int J3 = AbstractC0730j.J(charSequence, (char[]) this.f7373g, intValue, this.f7372f);
                if (J3 < 0) {
                    return null;
                }
                return new R1.i(Integer.valueOf(J3), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                f2.j.f(charSequence2, "$this$$receiver");
                List list = (List) this.f7373g;
                boolean z4 = this.f7372f;
                if (z4 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C0572d c0572d = new C0572d(intValue2, charSequence2.length(), 1);
                    boolean z5 = charSequence2 instanceof String;
                    int i5 = c0572d.f6421f;
                    int i6 = c0572d.f6420e;
                    if (z5) {
                        if ((i5 > 0 && intValue2 <= i6) || (i5 < 0 && i6 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (AbstractC0737q.u(str, 0, (String) charSequence2, intValue2, str.length(), z4)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    iVar = new R1.i(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != i6) {
                                    intValue2 += i5;
                                }
                            }
                        }
                        iVar = null;
                    } else {
                        if ((i5 > 0 && intValue2 <= i6) || (i5 < 0 && i6 <= intValue2)) {
                            int i7 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        i3 = i6;
                                        i4 = i5;
                                        z3 = z4;
                                        if (!AbstractC0730j.P(str3, 0, charSequence2, i7, str3.length(), z4)) {
                                            z4 = z3;
                                            i6 = i3;
                                            i5 = i4;
                                        }
                                    } else {
                                        i3 = i6;
                                        i4 = i5;
                                        z3 = z4;
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    iVar = new R1.i(Integer.valueOf(i7), str4);
                                } else if (i7 != i3) {
                                    i7 += i4;
                                    z4 = z3;
                                    i6 = i3;
                                    i5 = i4;
                                }
                            }
                        }
                        iVar = null;
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
                    int I3 = AbstractC0730j.I(charSequence2, str5, intValue2, false, 4);
                    if (I3 >= 0) {
                        iVar = new R1.i(Integer.valueOf(I3), str5);
                    }
                    iVar = null;
                }
                if (iVar == null) {
                    return null;
                }
                return new R1.i(iVar.f4150d, Integer.valueOf(((String) iVar.f4151e).length()));
        }
    }
}
