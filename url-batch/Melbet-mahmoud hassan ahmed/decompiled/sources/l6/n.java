package l6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w5.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends m {

    static final class a extends kotlin.jvm.internal.j implements f6.p<CharSequence, Integer, v5.j<? extends Integer, ? extends Integer>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<String> f18820f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f18821g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z6) {
            super(2);
            this.f18820f = list;
            this.f18821g = z6;
        }

        public final v5.j<Integer, Integer> a(CharSequence charSequence, int i7) {
            kotlin.jvm.internal.i.d(charSequence, "$this$$receiver");
            v5.j s7 = n.s(charSequence, this.f18820f, i7, this.f18821g, false);
            if (s7 != null) {
                return v5.n.a(s7.c(), Integer.valueOf(((String) s7.d()).length()));
            }
            return null;
        }

        @Override // f6.p
        public /* bridge */ /* synthetic */ v5.j<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.j implements f6.l<i6.c, String> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CharSequence f18822f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f18822f = charSequence;
        }

        @Override // f6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(i6.c cVar) {
            kotlin.jvm.internal.i.d(cVar, "it");
            return n.P(this.f18822f, cVar);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return w(charSequence, str, i7, z6);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int i7, boolean z6) {
        int a7;
        boolean z7;
        char g7;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            g7 = w5.e.g(cArr);
            return ((String) charSequence).indexOf(g7, i7);
        }
        a7 = i6.f.a(i7, 0);
        int u6 = u(charSequence);
        if (a7 > u6) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a7);
            int length = cArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    z7 = false;
                    break;
                }
                if (l6.b.d(cArr[i8], charAt, z6)) {
                    z7 = true;
                    break;
                }
                i8++;
            }
            if (z7) {
                return a7;
            }
            if (a7 == u6) {
                return -1;
            }
            a7++;
        }
    }

    public static final int C(CharSequence charSequence, char c7, int i7, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? G(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    public static final int D(CharSequence charSequence, String str, int i7, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(str, "string");
        return (z6 || !(charSequence instanceof String)) ? x(charSequence, str, i7, 0, z6, true) : ((String) charSequence).lastIndexOf(str, i7);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = u(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return C(charSequence, c7, i7, z6);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = u(charSequence);
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return D(charSequence, str, i7, z6);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int i7, boolean z6) {
        int c7;
        char g7;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cArr, "chars");
        if (!z6 && cArr.length == 1 && (charSequence instanceof String)) {
            g7 = w5.e.g(cArr);
            return ((String) charSequence).lastIndexOf(g7, i7);
        }
        for (c7 = i6.f.c(i7, u(charSequence)); -1 < c7; c7--) {
            char charAt = charSequence.charAt(c7);
            int length = cArr.length;
            boolean z7 = false;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                if (l6.b.d(cArr[i8], charAt, z6)) {
                    z7 = true;
                    break;
                }
                i8++;
            }
            if (z7) {
                return c7;
            }
        }
        return -1;
    }

    public static final k6.b<String> H(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return O(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> I(CharSequence charSequence) {
        List<String> e7;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        e7 = k6.h.e(H(charSequence));
        return e7;
    }

    private static final k6.b<i6.c> J(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8) {
        List a7;
        M(i8);
        a7 = w5.d.a(strArr);
        return new c(charSequence, i7, i8, new a(a7, z6));
    }

    static /* synthetic */ k6.b K(CharSequence charSequence, String[] strArr, int i7, boolean z6, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z6 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return J(charSequence, strArr, i7, z6, i8);
    }

    public static final boolean L(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!l6.b.d(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z6)) {
                return false;
            }
        }
        return true;
    }

    public static final void M(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    public static final k6.b<String> N(CharSequence charSequence, String[] strArr, boolean z6, int i7) {
        k6.b<String> c7;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(strArr, "delimiters");
        c7 = k6.h.c(K(charSequence, strArr, 0, z6, i7, 2, null), new b(charSequence));
        return c7;
    }

    public static /* synthetic */ k6.b O(CharSequence charSequence, String[] strArr, boolean z6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z6 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return N(charSequence, strArr, z6, i7);
    }

    public static final String P(CharSequence charSequence, i6.c cVar) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cVar, "range");
        return charSequence.subSequence(cVar.o().intValue(), cVar.n().intValue() + 1).toString();
    }

    public static final String Q(String str, char c7, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int z6 = z(str, c7, 0, false, 6, null);
        if (z6 == -1) {
            return str2;
        }
        String substring = str.substring(z6 + 1, str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String R(String str, String str2, String str3) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "delimiter");
        kotlin.jvm.internal.i.d(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(A + str2.length(), str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String S(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return Q(str, c7, str2);
    }

    public static /* synthetic */ String T(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return R(str, str2, str3);
    }

    public static final String U(String str, char c7, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int E = E(str, c7, 0, false, 6, null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String V(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return U(str, c7, str2);
    }

    public static final String W(String str, char c7, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int z6 = z(str, c7, 0, false, 6, null);
        if (z6 == -1) {
            return str2;
        }
        String substring = str.substring(0, z6);
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String X(String str, String str2, String str3) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "delimiter");
        kotlin.jvm.internal.i.d(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(0, A);
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Y(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return W(str, c7, str2);
    }

    public static /* synthetic */ String Z(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return X(str, str2, str3);
    }

    public static CharSequence a0(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z6 = false;
        while (i7 <= length) {
            boolean c7 = l6.a.c(charSequence.charAt(!z6 ? i7 : length));
            if (z6) {
                if (!c7) {
                    break;
                }
                length--;
            } else if (c7) {
                i7++;
            } else {
                z6 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static final boolean q(CharSequence charSequence, CharSequence charSequence2, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (A(charSequence, (String) charSequence2, 0, z6, 2, null) >= 0) {
                return true;
            }
        } else if (y(charSequence, charSequence2, 0, charSequence.length(), z6, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean r(CharSequence charSequence, CharSequence charSequence2, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return q(charSequence, charSequence2, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        return v5.n.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final v5.j<Integer, String> s(CharSequence charSequence, Collection<String> collection, int i7, boolean z6, boolean z7) {
        int c7;
        i6.a f7;
        int i8;
        Object obj;
        String str;
        Object obj2;
        int a7;
        Object n7;
        if (!z6 && collection.size() == 1) {
            n7 = q.n(collection);
            String str2 = (String) n7;
            int A = !z7 ? A(charSequence, str2, i7, false, 4, null) : F(charSequence, str2, i7, false, 4, null);
            if (A < 0) {
                return null;
            }
            return v5.n.a(Integer.valueOf(A), str2);
        }
        if (z7) {
            c7 = i6.f.c(i7, u(charSequence));
            f7 = i6.f.f(c7, 0);
        } else {
            a7 = i6.f.a(i7, 0);
            f7 = new i6.c(a7, charSequence.length());
        }
        if (charSequence instanceof String) {
            i8 = f7.i();
            int j7 = f7.j();
            int k7 = f7.k();
            if ((k7 > 0 && i8 <= j7) || (k7 < 0 && j7 <= i8)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str3 = (String) obj2;
                        if (m.m(str3, 0, (String) charSequence, i8, str3.length(), z6)) {
                            break;
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        if (i8 == j7) {
                            break;
                        }
                        i8 += k7;
                    } else {
                        break;
                    }
                }
            }
            return null;
        }
        i8 = f7.i();
        int j8 = f7.j();
        int k8 = f7.k();
        if ((k8 > 0 && i8 <= j8) || (k8 < 0 && j8 <= i8)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String str4 = (String) obj;
                    if (L(str4, 0, charSequence, i8, str4.length(), z6)) {
                        break;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    if (i8 == j8) {
                        break;
                    }
                    i8 += k8;
                } else {
                    break;
                }
            }
        }
        return null;
    }

    public static final i6.c t(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return new i6.c(0, charSequence.length() - 1);
    }

    public static final int u(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c7, int i7, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return (z6 || !(charSequence instanceof String)) ? B(charSequence, new char[]{c7}, i7, z6) : ((String) charSequence).indexOf(c7, i7);
    }

    public static final int w(CharSequence charSequence, String str, int i7, boolean z6) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(str, "string");
        return (z6 || !(charSequence instanceof String)) ? y(charSequence, str, i7, charSequence.length(), z6, false, 16, null) : ((String) charSequence).indexOf(str, i7);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7) {
        int c7;
        int a7;
        i6.a f7;
        int a8;
        int c8;
        if (z7) {
            c7 = i6.f.c(i7, u(charSequence));
            a7 = i6.f.a(i8, 0);
            f7 = i6.f.f(c7, a7);
        } else {
            a8 = i6.f.a(i7, 0);
            c8 = i6.f.c(i8, charSequence.length());
            f7 = new i6.c(a8, c8);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i9 = f7.i();
            int j7 = f7.j();
            int k7 = f7.k();
            if ((k7 <= 0 || i9 > j7) && (k7 >= 0 || j7 > i9)) {
                return -1;
            }
            while (!m.m((String) charSequence2, 0, (String) charSequence, i9, charSequence2.length(), z6)) {
                if (i9 == j7) {
                    return -1;
                }
                i9 += k7;
            }
            return i9;
        }
        int i10 = f7.i();
        int j8 = f7.j();
        int k8 = f7.k();
        if ((k8 <= 0 || i10 > j8) && (k8 >= 0 || j8 > i10)) {
            return -1;
        }
        while (!L(charSequence2, 0, charSequence, i10, charSequence2.length(), z6)) {
            if (i10 == j8) {
                return -1;
            }
            i10 += k8;
        }
        return i10;
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z6, boolean z7, int i9, Object obj) {
        return x(charSequence, charSequence2, i7, i8, z6, (i9 & 16) != 0 ? false : z7);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c7, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z6 = false;
        }
        return v(charSequence, c7, i7, z6);
    }
}
