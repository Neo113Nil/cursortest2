package B4;

import f4.C0430g;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t4.InterfaceC1445p;
import y4.C1574c;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f317c;

    public /* synthetic */ s(Object obj, boolean z, int i2) {
        this.f315a = i2;
        this.f317c = obj;
        this.f316b = z;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        C0430g c0430g;
        Object obj4;
        int i2 = this.f315a;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int Y5 = k.Y(DelimitedRangesSequence, (char[]) this.f317c, intValue, this.f316b);
                if (Y5 < 0) {
                    return null;
                }
                return new C0430g(Integer.valueOf(Y5), 1);
            default:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.f317c;
                boolean z = this.f316b;
                if (z || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    C1574c c1574c = new C1574c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z5 = DelimitedRangesSequence instanceof String;
                    int i3 = c1574c.f12441c;
                    int i6 = c1574c.f12440b;
                    if (z5) {
                        if ((i3 > 0 && intValue <= i6) || (i3 < 0 && i6 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (r.K(0, intValue, str.length(), str, (String) DelimitedRangesSequence, z)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    c0430g = new C0430g(Integer.valueOf(intValue), str2);
                                } else if (intValue != i6) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0430g = null;
                    } else {
                        if ((i3 > 0 && intValue <= i6) || (i3 < 0 && i6 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        if (k.d0(str3, 0, DelimitedRangesSequence, intValue, str3.length(), z)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    c0430g = new C0430g(Integer.valueOf(intValue), str4);
                                } else if (intValue != i6) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0430g = null;
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
                    int X5 = k.X(DelimitedRangesSequence, str5, intValue, false, 4);
                    if (X5 >= 0) {
                        c0430g = new C0430g(Integer.valueOf(X5), str5);
                    }
                    c0430g = null;
                }
                if (c0430g == null) {
                    return null;
                }
                return new C0430g(c0430g.f5668a, Integer.valueOf(((String) c0430g.f5669b).length()));
        }
    }
}
