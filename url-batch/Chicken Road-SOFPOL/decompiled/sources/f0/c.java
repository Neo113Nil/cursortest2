package f0;

import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2589a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f2590b;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
                i.b(str);
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i8 = 0; i8 < 10; i8++) {
                    cArr[i8] = charAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        f2589a = str;
        f2590b = str + '\n' + str;
    }
}
