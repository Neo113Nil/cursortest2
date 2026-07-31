package h2;

import e2.C0380d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: h2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455q extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0455q(int i3, Object obj, boolean z3) {
        super(2);
        this.f5079e = i3;
        this.f5081g = obj;
        this.f5080f = z3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int i3;
        int i4;
        boolean z3;
        Object obj3;
        L1.j jVar;
        Object obj4;
        switch (this.f5079e) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Number) obj2).intValue();
                Z1.i.f(charSequence, "$this$$receiver");
                int s02 = AbstractC0447i.s0(charSequence, (char[]) this.f5081g, intValue, this.f5080f);
                if (s02 < 0) {
                    return null;
                }
                return new L1.j(Integer.valueOf(s02), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int intValue2 = ((Number) obj2).intValue();
                Z1.i.f(charSequence2, "$this$$receiver");
                List list = (List) this.f5081g;
                boolean z4 = this.f5080f;
                if (z4 || list.size() != 1) {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C0380d c0380d = new C0380d(intValue2, charSequence2.length(), 1);
                    boolean z5 = charSequence2 instanceof String;
                    int i5 = c0380d.f4770f;
                    int i6 = c0380d.f4769e;
                    if (z5) {
                        if ((i5 > 0 && intValue2 <= i6) || (i5 < 0 && i6 <= intValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (AbstractC0454p.f0(str, 0, (String) charSequence2, intValue2, str.length(), z4)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    jVar = new L1.j(Integer.valueOf(intValue2), str2);
                                } else if (intValue2 != i6) {
                                    intValue2 += i5;
                                }
                            }
                        }
                        jVar = null;
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
                                        if (!AbstractC0447i.y0(str3, 0, charSequence2, i7, str3.length(), z4)) {
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
                                    jVar = new L1.j(Integer.valueOf(i7), str4);
                                } else if (i7 != i3) {
                                    i7 += i4;
                                    z4 = z3;
                                    i6 = i3;
                                    i5 = i4;
                                }
                            }
                        }
                        jVar = null;
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
                    int r02 = AbstractC0447i.r0(charSequence2, str5, intValue2, false, 4);
                    if (r02 >= 0) {
                        jVar = new L1.j(Integer.valueOf(r02), str5);
                    }
                    jVar = null;
                }
                if (jVar == null) {
                    return null;
                }
                return new L1.j(jVar.f2708d, Integer.valueOf(((String) jVar.f2709e).length()));
        }
    }
}
