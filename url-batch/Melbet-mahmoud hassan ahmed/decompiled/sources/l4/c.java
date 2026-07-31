package l4;

/* loaded from: classes.dex */
public abstract class c implements k<Character> {

    static abstract class a extends c {
        a() {
        }

        @Override // l4.k
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    private static final class b extends a {

        /* renamed from: f, reason: collision with root package name */
        private final char f18609f;

        b(char c7) {
            this.f18609f = c7;
        }

        @Override // l4.c
        public boolean e(char c7) {
            return c7 == this.f18609f;
        }

        public String toString() {
            String g7 = c.g(this.f18609f);
            StringBuilder sb = new StringBuilder(String.valueOf(g7).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(g7);
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: l4.c$c, reason: collision with other inner class name */
    static abstract class AbstractC0092c extends a {

        /* renamed from: f, reason: collision with root package name */
        private final String f18610f;

        AbstractC0092c(String str) {
            this.f18610f = (String) j.i(str);
        }

        public final String toString() {
            return this.f18610f;
        }
    }

    private static final class d extends AbstractC0092c {

        /* renamed from: g, reason: collision with root package name */
        static final d f18611g = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override // l4.c
        public int c(CharSequence charSequence, int i7) {
            j.k(i7, charSequence.length());
            return -1;
        }

        @Override // l4.c
        public boolean e(char c7) {
            return false;
        }
    }

    protected c() {
    }

    public static c d(char c7) {
        return new b(c7);
    }

    public static c f() {
        return d.f18611g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c7) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c7 & 15);
            c7 = (char) (c7 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        j.k(i7, length);
        while (i7 < length) {
            if (e(charSequence.charAt(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public abstract boolean e(char c7);
}
