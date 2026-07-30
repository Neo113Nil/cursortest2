package kotlin.text;

import defpackage.dd0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ d(List list, boolean z) {
        this.d = list;
        this.e = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb A[RETURN] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object obj3;
        Pair pair;
        Pair pair2;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        charSequence.getClass();
        List list = this.d;
        boolean z = this.e;
        if (z || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z2 = charSequence instanceof String;
            int i = new IntRange(intValue, charSequence.length(), 1).e;
            if (z2) {
                if (intValue <= i) {
                    int i2 = intValue;
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            String str2 = (String) charSequence;
                            int length = str.length();
                            if (!z ? str.regionMatches(0, str2, i2, length) : str.regionMatches(z, 0, str2, i2, length)) {
                                break;
                            }
                        }
                        String str3 = (String) obj4;
                        if (str3 == null) {
                            if (i2 == i) {
                                break;
                            }
                            i2++;
                        } else {
                            pair = new Pair(Integer.valueOf(i2), str3);
                            break;
                        }
                    }
                }
                pair2 = null;
            } else {
                if (intValue <= i) {
                    int i3 = intValue;
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str4 = (String) obj3;
                            boolean z3 = z;
                            z = z3;
                            if (StringsKt__StringsKt.i(str4, 0, charSequence, i3, str4.length(), z3)) {
                                break;
                            }
                        }
                        String str5 = (String) obj3;
                        if (str5 == null) {
                            if (i3 == i) {
                                break;
                            }
                            i3++;
                        } else {
                            pair = new Pair(Integer.valueOf(i3), str5);
                            break;
                        }
                    }
                }
                pair2 = null;
            }
            if (pair2 != null) {
                return new Pair(pair2.d, Integer.valueOf(((String) pair2.e).length()));
            }
            return null;
        }
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size != 1) {
            dd0.e("List has more than one element.");
            return null;
        }
        String str6 = (String) list.get(0);
        int g = StringsKt__StringsKt.g(charSequence, str6, intValue, false, 4);
        if (g >= 0) {
            pair2 = new Pair(Integer.valueOf(g), str6);
            if (pair2 != null) {
            }
        }
        pair2 = null;
        if (pair2 != null) {
        }
    }
}
