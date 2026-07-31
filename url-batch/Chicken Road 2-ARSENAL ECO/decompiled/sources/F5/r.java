package F5;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k5.C0477g;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f808g;

    public /* synthetic */ r(int i7, Object obj) {
        this.f807f = i7;
        this.f808g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // x5.InterfaceC0747p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        Object obj3;
        C0477g c0477g;
        Object obj4;
        switch (this.f807f) {
            case 0:
                List list = (List) this.f808g;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int R6 = j.R(DelimitedRangesSequence, str, intValue, false, 4);
                    if (R6 >= 0) {
                        c0477g = new C0477g(Integer.valueOf(R6), str);
                        if (c0477g == null) {
                            return new C0477g(c0477g.f5198f, Integer.valueOf(((String) c0477g.f5199g).length()));
                        }
                        return null;
                    }
                    c0477g = null;
                    if (c0477g == null) {
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    C5.c cVar = new C5.c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z5 = DelimitedRangesSequence instanceof String;
                    int i8 = cVar.f230h;
                    int i9 = cVar.f229g;
                    if (z5) {
                        if ((i8 > 0 && intValue <= i9) || (i8 < 0 && i9 <= intValue)) {
                            int i10 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (q.E(0, i10, str2.length(), str2, (String) DelimitedRangesSequence, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c0477g = new C0477g(Integer.valueOf(i10), str3);
                                } else if (i10 != i9) {
                                    i10 += i8;
                                }
                            }
                        }
                        c0477g = null;
                        if (c0477g == null) {
                        }
                    } else {
                        if ((i8 > 0 && intValue <= i9) || (i8 < 0 && i9 <= intValue)) {
                            int i11 = intValue;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        i7 = i9;
                                        if (!j.X(str4, 0, DelimitedRangesSequence, i11, str4.length(), false)) {
                                            i9 = i7;
                                        }
                                    } else {
                                        i7 = i9;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c0477g = new C0477g(Integer.valueOf(i11), str5);
                                } else if (i11 != i7) {
                                    i11 += i8;
                                    i9 = i7;
                                }
                            }
                        }
                        c0477g = null;
                        if (c0477g == null) {
                        }
                    }
                }
            default:
                char[] cArr = (char[]) this.f808g;
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.i.e(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                int S3 = j.S(DelimitedRangesSequence2, cArr, intValue2, false);
                if (S3 < 0) {
                    return null;
                }
                return new C0477g(Integer.valueOf(S3), 1);
        }
    }
}
