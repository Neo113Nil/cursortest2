package s2;

import b2.C0190d;
import java.util.NoSuchElementException;
import l2.p;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ char[] f10331a;

    public /* synthetic */ m(char[] cArr) {
        this.f10331a = cArr;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        int i3;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        kotlin.jvm.internal.j.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        char[] cArr = this.f10331a;
        kotlin.jvm.internal.j.e(DelimitedRangesSequence, "<this>");
        if (cArr.length == 1 && (DelimitedRangesSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            i3 = ((String) DelimitedRangesSequence).indexOf(cArr[0], intValue);
        } else {
            if (intValue < 0) {
                intValue = 0;
            }
            int S2 = n.S(DelimitedRangesSequence);
            if (intValue <= S2) {
                loop0: while (true) {
                    char charAt = DelimitedRangesSequence.charAt(intValue);
                    for (char c3 : cArr) {
                        if (c3 == charAt) {
                            i3 = intValue;
                            break loop0;
                        }
                    }
                    if (intValue == S2) {
                        break;
                    }
                    intValue++;
                }
            }
            i3 = -1;
        }
        if (i3 < 0) {
            return null;
        }
        return new C0190d(Integer.valueOf(i3), 1);
    }
}
