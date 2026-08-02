package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsc extends hnu {
    public static final char[] a = {'+'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean c;
    public final boolean[] d;

    public hsc(String str, boolean z) {
        super(null, null);
        hoq.y(!str.matches(".*[0-9A-Za-z].*"), "Alphanumeric characters are always 'safe' and should not be explicitly specified");
        String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z && concat.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.c = z;
        char[] charArray = concat.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        this.d = zArr;
    }
}
