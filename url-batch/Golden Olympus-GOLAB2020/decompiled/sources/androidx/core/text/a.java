package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final r f11850d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f11851e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f11852f;

    /* renamed from: g, reason: collision with root package name */
    static final a f11853g;

    /* renamed from: h, reason: collision with root package name */
    static final a f11854h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f11855a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11856b;

    /* renamed from: c, reason: collision with root package name */
    private final r f11857c;

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0097a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11858a;

        /* renamed from: b, reason: collision with root package name */
        private int f11859b;

        /* renamed from: c, reason: collision with root package name */
        private r f11860c;

        public C0097a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z4) {
            return z4 ? a.f11854h : a.f11853g;
        }

        private void c(boolean z4) {
            this.f11858a = z4;
            this.f11860c = a.f11850d;
            this.f11859b = 2;
        }

        public a a() {
            return (this.f11859b == 2 && this.f11860c == a.f11850d) ? b(this.f11858a) : new a(this.f11858a, this.f11859b, this.f11860c);
        }
    }

    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f11861f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f11862a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11863b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11864c;

        /* renamed from: d, reason: collision with root package name */
        private int f11865d;

        /* renamed from: e, reason: collision with root package name */
        private char f11866e;

        static {
            for (int i4 = 0; i4 < 1792; i4++) {
                f11861f[i4] = Character.getDirectionality(i4);
            }
        }

        b(CharSequence charSequence, boolean z4) {
            this.f11862a = charSequence;
            this.f11863b = z4;
            this.f11864c = charSequence.length();
        }

        private static byte c(char c4) {
            return c4 < 1792 ? f11861f[c4] : Character.getDirectionality(c4);
        }

        private byte f() {
            char charAt;
            int i4 = this.f11865d;
            do {
                int i5 = this.f11865d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11862a;
                int i6 = i5 - 1;
                this.f11865d = i6;
                charAt = charSequence.charAt(i6);
                this.f11866e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f11865d = i4;
            this.f11866e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i4 = this.f11865d;
                if (i4 >= this.f11864c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f11862a;
                this.f11865d = i4 + 1;
                charAt = charSequence.charAt(i4);
                this.f11866e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i4 = this.f11865d;
            while (true) {
                int i5 = this.f11865d;
                if (i5 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f11862a;
                int i6 = i5 - 1;
                this.f11865d = i6;
                char charAt2 = charSequence.charAt(i6);
                this.f11866e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i7 = this.f11865d;
                        if (i7 > 0) {
                            CharSequence charSequence2 = this.f11862a;
                            int i8 = i7 - 1;
                            this.f11865d = i8;
                            charAt = charSequence2.charAt(i8);
                            this.f11866e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f11865d = i4;
            this.f11866e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i4 = this.f11865d;
            while (true) {
                int i5 = this.f11865d;
                if (i5 >= this.f11864c) {
                    this.f11865d = i4;
                    this.f11866e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f11862a;
                this.f11865d = i5 + 1;
                char charAt2 = charSequence.charAt(i5);
                this.f11866e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i6 = this.f11865d;
                        if (i6 < this.f11864c) {
                            CharSequence charSequence2 = this.f11862a;
                            this.f11865d = i6 + 1;
                            charAt = charSequence2.charAt(i6);
                            this.f11866e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        byte a() {
            char charAt = this.f11862a.charAt(this.f11865d - 1);
            this.f11866e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f11862a, this.f11865d);
                this.f11865d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f11865d--;
            byte c4 = c(this.f11866e);
            if (!this.f11863b) {
                return c4;
            }
            char c5 = this.f11866e;
            return c5 == '>' ? h() : c5 == ';' ? f() : c4;
        }

        byte b() {
            char charAt = this.f11862a.charAt(this.f11865d);
            this.f11866e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f11862a, this.f11865d);
                this.f11865d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f11865d++;
            byte c4 = c(this.f11866e);
            if (!this.f11863b) {
                return c4;
            }
            char c5 = this.f11866e;
            return c5 == '<' ? i() : c5 == '&' ? g() : c4;
        }

        int d() {
            this.f11865d = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (this.f11865d < this.f11864c && i4 == 0) {
                byte b4 = b();
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (b4 != 9) {
                        switch (b4) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case 18:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
            if (i4 == 0) {
                return 0;
            }
            if (i5 != 0) {
                return i5;
            }
            while (this.f11865d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i4 == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i4 == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        int e() {
            this.f11865d = this.f11864c;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                while (this.f11865d > 0) {
                    byte a4 = a();
                    if (a4 != 0) {
                        if (a4 == 1 || a4 == 2) {
                            if (i4 == 0) {
                                return 1;
                            }
                            if (i5 == 0) {
                                break;
                            }
                        } else if (a4 != 9) {
                            switch (a4) {
                                case 14:
                                case 15:
                                    if (i5 == i4) {
                                        return -1;
                                    }
                                    i4--;
                                    break;
                                case 16:
                                case 17:
                                    if (i5 == i4) {
                                        return 1;
                                    }
                                    i4--;
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i4 == 0) {
                            return -1;
                        }
                        if (i5 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        r rVar = s.f11869c;
        f11850d = rVar;
        f11851e = Character.toString((char) 8206);
        f11852f = Character.toString((char) 8207);
        f11853g = new a(false, 2, rVar);
        f11854h = new a(true, 2, rVar);
    }

    a(boolean z4, int i4, r rVar) {
        this.f11855a = z4;
        this.f11856b = i4;
        this.f11857c = rVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0097a().a();
    }

    static boolean e(Locale locale) {
        return t.a(locale) == 1;
    }

    private String f(CharSequence charSequence, r rVar) {
        boolean a4 = rVar.a(charSequence, 0, charSequence.length());
        return (this.f11855a || !(a4 || b(charSequence) == 1)) ? this.f11855a ? (!a4 || b(charSequence) == -1) ? f11852f : "" : "" : f11851e;
    }

    private String g(CharSequence charSequence, r rVar) {
        boolean a4 = rVar.a(charSequence, 0, charSequence.length());
        return (this.f11855a || !(a4 || a(charSequence) == 1)) ? this.f11855a ? (!a4 || a(charSequence) == -1) ? f11852f : "" : "" : f11851e;
    }

    public boolean d() {
        return (this.f11856b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f11857c, true);
    }

    public CharSequence i(CharSequence charSequence, r rVar, boolean z4) {
        if (charSequence == null) {
            return null;
        }
        boolean a4 = rVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z4) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a4 ? s.f11868b : s.f11867a));
        }
        if (a4 != this.f11855a) {
            spannableStringBuilder.append(a4 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z4) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a4 ? s.f11868b : s.f11867a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f11857c, true);
    }

    public String k(String str, r rVar, boolean z4) {
        if (str == null) {
            return null;
        }
        return i(str, rVar, z4).toString();
    }
}
