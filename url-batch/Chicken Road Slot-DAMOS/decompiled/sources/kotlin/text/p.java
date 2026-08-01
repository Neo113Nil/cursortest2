package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f5627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5628e;

    public /* synthetic */ p(List list, boolean z10) {
        this.f5627d = list;
        this.f5628e = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec A[RETURN] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Pair pair;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        charSequence.getClass();
        List list = this.f5627d;
        boolean z10 = this.f5628e;
        if (z10 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z11 = charSequence instanceof String;
            int i3 = new IntRange(intValue, charSequence.length(), 1).f5600e;
            if (z11) {
                if (intValue <= i3) {
                    int i10 = intValue;
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
                            if (!z10 ? str.regionMatches(0, str2, i10, length) : str.regionMatches(z10, 0, str2, i10, length)) {
                                break;
                            }
                        }
                        String str3 = (String) obj4;
                        if (str3 == null) {
                            if (i10 == i3) {
                                break;
                            }
                            i10++;
                        } else {
                            pair = new Pair(Integer.valueOf(i10), str3);
                            break;
                        }
                    }
                }
                pair = null;
                if (pair == null) {
                    return new Pair(pair.f5552d, Integer.valueOf(((String) pair.f5553e).length()));
                }
                return null;
            }
            if (intValue <= i3) {
                int i11 = intValue;
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        String str4 = (String) obj3;
                        boolean z12 = z10;
                        z10 = z12;
                        if (StringsKt__StringsKt.k(str4, 0, charSequence, i11, str4.length(), z12)) {
                            break;
                        }
                    }
                    String str5 = (String) obj3;
                    if (str5 == null) {
                        if (i11 == i3) {
                            break;
                        }
                        i11++;
                    } else {
                        pair = new Pair(Integer.valueOf(i11), str5);
                        break;
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                a1.e("List has more than one element.");
                return null;
            }
            String str6 = (String) list.get(0);
            int j = StringsKt__StringsKt.j(charSequence, str6, intValue, 4);
            if (j >= 0) {
                pair = new Pair(Integer.valueOf(j), str6);
                if (pair == null) {
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
    }
}
