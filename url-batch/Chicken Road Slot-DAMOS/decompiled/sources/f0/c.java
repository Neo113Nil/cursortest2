package f0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4008a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f4009b;

    static {
        String str;
        int length = "H".length();
        if (length != 0) {
            int i3 = 1;
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder("H".length() * 10);
                while (true) {
                    sb2.append((CharSequence) "H");
                    if (i3 == 10) {
                        break;
                    } else {
                        i3++;
                    }
                }
                str = sb2.toString();
            } else {
                char charAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i10 = 0; i10 < 10; i10++) {
                    cArr[i10] = charAt;
                }
                str = new String(cArr);
            }
        } else {
            str = "";
        }
        f4008a = str;
        f4009b = str + '\n' + str;
    }
}
