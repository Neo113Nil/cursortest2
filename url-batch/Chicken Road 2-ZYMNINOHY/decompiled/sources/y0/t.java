package y0;

import W.J;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.I;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16196c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f16197a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f16198b = -1;

    public final boolean a(String str) {
        Matcher matcher = f16196c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = J.f3263a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f16197a = parseInt;
            this.f16198b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r7.f1723b.equals("com.apple.iTunes") && r7.f1724c.equals("iTunSMPB")) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(T.E e4) {
        T.D d4;
        e4.getClass();
        v2.F j4 = I.j();
        T.D[] dArr = e4.f2655a;
        int length = dArr.length;
        int i4 = 0;
        while (true) {
            T.D d5 = null;
            if (i4 >= length) {
                break;
            }
            T.D d6 = dArr[i4];
            if (M0.e.class.isAssignableFrom(d6.getClass())) {
                T.D d7 = (T.D) M0.e.class.cast(d6);
                if (((M0.e) d7).f1710c.equals("iTunSMPB")) {
                    d5 = d7;
                }
            }
            if (d5 != null) {
                j4.b(d5);
            }
            i4++;
        }
        v2.G listIterator = j4.f().listIterator(0);
        while (listIterator.hasNext()) {
            if (a(((M0.e) listIterator.next()).f1711d)) {
                return;
            }
        }
        v2.F j5 = I.j();
        for (T.D d8 : dArr) {
            if (M0.k.class.isAssignableFrom(d8.getClass())) {
                d4 = (T.D) M0.k.class.cast(d8);
                M0.k kVar = (M0.k) d4;
            }
            d4 = null;
            if (d4 != null) {
                j5.b(d4);
            }
        }
        v2.G listIterator2 = j5.f().listIterator(0);
        while (listIterator2.hasNext() && !a(((M0.k) listIterator2.next()).f1725d)) {
        }
    }
}
