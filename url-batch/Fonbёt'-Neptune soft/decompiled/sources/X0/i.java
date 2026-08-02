package X0;

import P0.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends Q0.i implements p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f1153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, boolean z2) {
        super(2);
        this.f1153f = list;
        this.f1154g = z2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        Object obj3;
        F0.c cVar;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        Q0.h.e(charSequence, "$this$$receiver");
        List list = this.f1153f;
        boolean z2 = this.f1154g;
        if (z2 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z3 = charSequence instanceof String;
            int i2 = new U0.c(intValue, charSequence.length(), 1).f1088f;
            if (z3) {
                if (intValue <= i2) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            if (j.S(str, (String) charSequence, intValue, str.length(), z2)) {
                                break;
                            }
                        }
                        String str2 = (String) obj4;
                        if (str2 == null) {
                            if (intValue == i2) {
                                break;
                            }
                            intValue++;
                        } else {
                            cVar = new F0.c(Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                }
                cVar = null;
            } else {
                if (intValue <= i2) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str3 = (String) obj3;
                            if (j.T(intValue, str3.length(), charSequence, str3, z2)) {
                                break;
                            }
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (intValue == i2) {
                                break;
                            }
                            intValue++;
                        } else {
                            cVar = new F0.c(Integer.valueOf(intValue), str4);
                            break;
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
            int Q2 = j.Q(intValue, 4, charSequence, str5, false);
            if (Q2 >= 0) {
                cVar = new F0.c(Integer.valueOf(Q2), str5);
            }
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        return new F0.c(cVar.f461e, Integer.valueOf(((String) cVar.f462f).length()));
    }
}
