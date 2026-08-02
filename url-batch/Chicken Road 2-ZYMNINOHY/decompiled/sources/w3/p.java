package w3;

import c3.C0292d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t3.C1443c;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15952b;

    public /* synthetic */ p(int i4, Object obj) {
        this.f15951a = i4;
        this.f15952b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // o3.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i4;
        Object obj3;
        C0292d c0292d;
        Object obj4;
        switch (this.f15951a) {
            case 0:
                char[] cArr = (char[]) this.f15952b;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int i02 = AbstractC1510g.i0(DelimitedRangesSequence, cArr, intValue, false);
                if (i02 < 0) {
                    return null;
                }
                return new C0292d(Integer.valueOf(i02), 1);
            default:
                List list = (List) this.f15952b;
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.i.e(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int h02 = AbstractC1510g.h0(DelimitedRangesSequence2, str, intValue2, 4);
                    if (h02 >= 0) {
                        c0292d = new C0292d(Integer.valueOf(h02), str);
                        if (c0292d == null) {
                            return new C0292d(c0292d.f5724a, Integer.valueOf(((String) c0292d.f5725b).length()));
                        }
                        return null;
                    }
                    c0292d = null;
                    if (c0292d == null) {
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C1443c c1443c = new C1443c(intValue2, DelimitedRangesSequence2.length(), 1);
                    boolean z = DelimitedRangesSequence2 instanceof String;
                    int i5 = c1443c.f15426c;
                    int i6 = c1443c.f15425b;
                    if (z) {
                        if ((i5 > 0 && intValue2 <= i6) || (i5 < 0 && i6 <= intValue2)) {
                            int i7 = intValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (o.X(0, i7, str2.length(), str2, (String) DelimitedRangesSequence2, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c0292d = new C0292d(Integer.valueOf(i7), str3);
                                } else if (i7 != i6) {
                                    i7 += i5;
                                }
                            }
                            if (c0292d == null) {
                            }
                        }
                        c0292d = null;
                        if (c0292d == null) {
                        }
                    } else {
                        if ((i5 > 0 && intValue2 <= i6) || (i5 < 0 && i6 <= intValue2)) {
                            int i8 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        i4 = i6;
                                        if (!AbstractC1510g.l0(str4, 0, DelimitedRangesSequence2, i8, str4.length(), false)) {
                                            i6 = i4;
                                        }
                                    } else {
                                        i4 = i6;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c0292d = new C0292d(Integer.valueOf(i8), str5);
                                } else if (i8 != i4) {
                                    i8 += i5;
                                    i6 = i4;
                                }
                            }
                            if (c0292d == null) {
                            }
                        }
                        c0292d = null;
                        if (c0292d == null) {
                        }
                    }
                }
        }
    }
}
