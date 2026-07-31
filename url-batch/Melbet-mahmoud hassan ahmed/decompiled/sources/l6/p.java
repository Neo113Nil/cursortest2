package l6;

/* loaded from: classes.dex */
class p extends o {
    public static final String b0(String str, int i7) {
        int c7;
        kotlin.jvm.internal.i.d(str, "<this>");
        if (i7 >= 0) {
            c7 = i6.f.c(i7, str.length());
            String substring = str.substring(c7);
            kotlin.jvm.internal.i.c(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }
}
