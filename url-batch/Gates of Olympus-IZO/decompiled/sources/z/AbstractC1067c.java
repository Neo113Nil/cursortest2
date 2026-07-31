package z;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1067c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8875a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f8876b;

    static {
        String str = "";
        int i3 = 1;
        int length = "H".length();
        if (length != 0) {
            if (length != 1) {
                StringBuilder sb = new StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((CharSequence) "H");
                    if (i3 == 10) {
                        break;
                    } else {
                        i3++;
                    }
                }
                str = sb.toString();
                Z1.i.c(str);
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i4 = 0; i4 < 10; i4++) {
                    cArr[i4] = charAt;
                }
                str = new String(cArr);
            }
        }
        f8875a = str;
        f8876b = str + '\n' + str;
    }
}
