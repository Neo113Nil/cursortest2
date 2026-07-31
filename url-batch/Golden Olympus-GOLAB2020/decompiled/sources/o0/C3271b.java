package o0;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.ironsource.b9;
import com.ironsource.cc;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o0.C3276g;
import o0.C3305k;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3271b {

    /* renamed from: a, reason: collision with root package name */
    private f f41406a;

    /* renamed from: b, reason: collision with root package name */
    private u f41407b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41408c = false;

    /* renamed from: o0.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41409a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41410b;

        static {
            int[] iArr = new int[j.values().length];
            f41410b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41410b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41410b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41410b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41410b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41410b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41410b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41410b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41410b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41410b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41410b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41410b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41410b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41410b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41410b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41410b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41410b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41410b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f41410b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41410b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41410b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41410b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41410b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41410b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f41409a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41409a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f41409a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: o0.b$b, reason: collision with other inner class name */
    private static class C0237b {

        /* renamed from: a, reason: collision with root package name */
        public final String f41411a;

        /* renamed from: b, reason: collision with root package name */
        final c f41412b;

        /* renamed from: c, reason: collision with root package name */
        public final String f41413c;

        C0237b(String str, c cVar, String str2) {
            this.f41411a = str;
            this.f41412b = cVar;
            this.f41413c = str2;
        }
    }

    /* renamed from: o0.b$c */
    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* renamed from: o0.b$d */
    private static class d extends C3305k.i {

        /* renamed from: o0.b$d$a */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f41419a;

            /* renamed from: b, reason: collision with root package name */
            public int f41420b;

            a(int i4, int i5) {
                this.f41419a = i4;
                this.f41420b = i5;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i4) {
            if (i4 >= 48 && i4 <= 57) {
                return i4 - 48;
            }
            if (i4 >= 65 && i4 <= 70) {
                return i4 - 55;
            }
            if (i4 < 97 || i4 > 102) {
                return -1;
            }
            return i4 - 87;
        }

        private a D() {
            C3272c c3272c;
            a aVar;
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            if (!f('(')) {
                return null;
            }
            A();
            int i5 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i6 = (!f('+') && f('-')) ? -1 : 1;
                    C3272c c4 = C3272c.c(this.f41947a, this.f41948b, this.f41949c, false);
                    if (c4 != null) {
                        this.f41948b = c4.a();
                    }
                    if (f('n') || f('N')) {
                        if (c4 == null) {
                            c4 = new C3272c(1L, this.f41948b);
                        }
                        A();
                        boolean f4 = f('+');
                        if (!f4 && (f4 = f('-'))) {
                            i5 = -1;
                        }
                        if (f4) {
                            A();
                            c3272c = C3272c.c(this.f41947a, this.f41948b, this.f41949c, false);
                            if (c3272c == null) {
                                this.f41948b = i4;
                                return null;
                            }
                            this.f41948b = c3272c.a();
                            int i7 = i5;
                            i5 = i6;
                            i6 = i7;
                        } else {
                            int i8 = i5;
                            i5 = i6;
                            i6 = i8;
                            c3272c = null;
                        }
                    } else {
                        c3272c = c4;
                        c4 = null;
                    }
                    aVar = new a(c4 == null ? 0 : i5 * c4.d(), c3272c != null ? i6 * c3272c.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f41948b = i4;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String q4 = q();
            return q4 != null ? q4 : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String H3 = H();
                if (H3 == null) {
                    this.f41948b = i4;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(H3);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f41948b = i4;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            if (!f('(')) {
                return null;
            }
            A();
            List L3 = L();
            if (L3 == null) {
                this.f41948b = i4;
                return null;
            }
            if (!f(')')) {
                this.f41948b = i4;
                return null;
            }
            Iterator it = L3.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f41478a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f41483d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return L3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void O(s sVar, t tVar) {
            g gVar;
            h hVar;
            h hVar2;
            String H3 = H();
            if (H3 == null) {
                throw new C3270a("Invalid pseudo class");
            }
            j a4 = j.a(H3);
            a aVar = null;
            switch (a.f41410b[a4.ordinal()]) {
                case 1:
                    h hVar3 = new h(0, 1, true, false, null);
                    sVar.b();
                    hVar2 = hVar3;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    h hVar4 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 3:
                    gVar = new m(false, null);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f41481b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    h hVar5 = new h(0, 1, false, true, tVar.f41481b);
                    sVar.b();
                    gVar = hVar5;
                    tVar.b(gVar);
                    return;
                case 6:
                    gVar = new m(true, tVar.f41481b);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 7:
                    gVar = new n(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 8:
                    gVar = new i(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z4 = a4 == j.nth_child || a4 == j.nth_of_type;
                    boolean z5 = a4 == j.nth_of_type || a4 == j.nth_last_of_type;
                    a D4 = D();
                    if (D4 == null) {
                        throw new C3270a("Invalid or missing parameter section for pseudo class: " + H3);
                    }
                    hVar = new h(D4.f41419a, D4.f41420b, z4, z5, tVar.f41481b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List K3 = K();
                    if (K3 == null) {
                        throw new C3270a("Invalid or missing parameter section for pseudo class: " + H3);
                    }
                    k kVar = new k(K3);
                    sVar.f41479b = kVar.b();
                    hVar2 = kVar;
                    gVar = hVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    gVar = new o(aVar);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    gVar = new l(H3);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                    gVar = new l(H3);
                    sVar.b();
                    tVar.b(gVar);
                    return;
                default:
                    throw new C3270a("Unsupported pseudo class: " + H3);
            }
        }

        private int P() {
            int i4;
            if (h()) {
                return this.f41948b;
            }
            int i5 = this.f41948b;
            int charAt = this.f41947a.charAt(i5);
            if (charAt == 45) {
                charAt = a();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i4 = i5;
            } else {
                int a4 = a();
                while (true) {
                    if ((a4 < 65 || a4 > 90) && ((a4 < 97 || a4 > 122) && !((a4 >= 48 && a4 <= 57) || a4 == 45 || a4 == 95))) {
                        break;
                    }
                    a4 = a();
                }
                i4 = this.f41948b;
            }
            this.f41948b = i5;
            return i4;
        }

        String F() {
            int C4;
            if (h()) {
                return null;
            }
            char charAt = this.f41947a.charAt(this.f41948b);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f41948b++;
            int intValue = l().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = l().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = l().intValue();
                        } else {
                            int C5 = C(intValue);
                            if (C5 != -1) {
                                for (int i4 = 1; i4 <= 5 && (C4 = C((intValue = l().intValue()))) != -1; i4++) {
                                    C5 = (C5 * 16) + C4;
                                }
                                sb.append((char) C5);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = l().intValue();
            }
            return sb.toString();
        }

        String H() {
            int P3 = P();
            int i4 = this.f41948b;
            if (P3 == i4) {
                return null;
            }
            String substring = this.f41947a.substring(i4, P3);
            this.f41948b = P3;
            return substring;
        }

        String I() {
            char charAt;
            int C4;
            StringBuilder sb = new StringBuilder();
            while (!h() && (charAt = this.f41947a.charAt(this.f41948b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !k(charAt) && !Character.isISOControl((int) charAt)) {
                this.f41948b++;
                if (charAt == '\\') {
                    if (!h()) {
                        String str = this.f41947a;
                        int i4 = this.f41948b;
                        this.f41948b = i4 + 1;
                        charAt = str.charAt(i4);
                        if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                            int C5 = C(charAt);
                            if (C5 != -1) {
                                for (int i5 = 1; i5 <= 5 && !h() && (C4 = C(this.f41947a.charAt(this.f41948b))) != -1; i5++) {
                                    this.f41948b++;
                                    C5 = (C5 * 16) + C4;
                                }
                                sb.append((char) C5);
                            }
                        }
                    }
                }
                sb.append(charAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            int charAt = this.f41947a.charAt(i4);
            int i5 = i4;
            while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && !j(charAt)) {
                if (!k(charAt)) {
                    i5 = this.f41948b + 1;
                }
                charAt = a();
            }
            if (this.f41948b > i4) {
                return this.f41947a.substring(i4, i5);
            }
            this.f41948b = i4;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x003c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean M(s sVar) {
            e eVar;
            t tVar;
            String str;
            if (h()) {
                return false;
            }
            int i4 = this.f41948b;
            if (!sVar.f()) {
                if (f('>')) {
                    eVar = e.CHILD;
                    A();
                } else if (f('+')) {
                    eVar = e.FOLLOWS;
                    A();
                }
                if (f('*')) {
                    String H3 = H();
                    if (H3 != null) {
                        t tVar2 = new t(eVar, H3);
                        sVar.c();
                        tVar = tVar2;
                    } else {
                        tVar = null;
                    }
                } else {
                    tVar = new t(eVar, null);
                }
                while (!h()) {
                    if (!f(JwtParser.SEPARATOR_CHAR)) {
                        if (!f('#')) {
                            if (!f('[')) {
                                if (!f(':')) {
                                    break;
                                }
                                if (tVar == null) {
                                    tVar = new t(eVar, null);
                                }
                                O(sVar, tVar);
                            } else {
                                if (tVar == null) {
                                    tVar = new t(eVar, null);
                                }
                                A();
                                String H4 = H();
                                if (H4 == null) {
                                    throw new C3270a("Invalid attribute simpleSelectors");
                                }
                                A();
                                c cVar = f(cc.f15727T) ? c.EQUALS : g("~=") ? c.INCLUDES : g("|=") ? c.DASHMATCH : null;
                                if (cVar != null) {
                                    A();
                                    str = E();
                                    if (str == null) {
                                        throw new C3270a("Invalid attribute simpleSelectors");
                                    }
                                    A();
                                } else {
                                    str = null;
                                }
                                if (!f(']')) {
                                    throw new C3270a("Invalid attribute simpleSelectors");
                                }
                                if (cVar == null) {
                                    cVar = c.EXISTS;
                                }
                                tVar.a(H4, cVar, str);
                                sVar.b();
                            }
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            String H5 = H();
                            if (H5 == null) {
                                throw new C3270a("Invalid \"#id\" simpleSelectors");
                            }
                            tVar.a("id", c.EQUALS, H5);
                            sVar.d();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String H6 = H();
                        if (H6 == null) {
                            throw new C3270a("Invalid \".class\" simpleSelectors");
                        }
                        tVar.a("class", c.EQUALS, H6);
                        sVar.b();
                    }
                }
                if (tVar == null) {
                    sVar.a(tVar);
                    return true;
                }
                this.f41948b = i4;
                return false;
            }
            eVar = null;
            if (f('*')) {
            }
            while (!h()) {
            }
            if (tVar == null) {
            }
        }

        String N() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            if (!g("url(")) {
                return null;
            }
            A();
            String F4 = F();
            if (F4 == null) {
                F4 = I();
            }
            if (F4 == null) {
                this.f41948b = i4;
                return null;
            }
            A();
            if (h() || g(")")) {
                return F4;
            }
            this.f41948b = i4;
            return null;
        }
    }

    /* renamed from: o0.b$e */
    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* renamed from: o0.b$f */
    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* renamed from: o0.b$g */
    private interface g {
        boolean a(q qVar, C3276g.L l4);
    }

    /* renamed from: o0.b$h */
    private static class h implements g {

        /* renamed from: a, reason: collision with root package name */
        private int f41437a;

        /* renamed from: b, reason: collision with root package name */
        private int f41438b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f41439c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f41440d;

        /* renamed from: e, reason: collision with root package name */
        private String f41441e;

        h(int i4, int i5, boolean z4, boolean z5, String str) {
            this.f41437a = i4;
            this.f41438b = i5;
            this.f41439c = z4;
            this.f41440d = z5;
            this.f41441e = str;
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            int i4;
            int i5;
            String m4 = (this.f41440d && this.f41441e == null) ? l4.m() : this.f41441e;
            C3276g.J j4 = l4.f41638b;
            if (j4 != null) {
                Iterator it = j4.getChildren().iterator();
                i4 = 0;
                i5 = 0;
                while (it.hasNext()) {
                    C3276g.L l5 = (C3276g.L) ((C3276g.N) it.next());
                    if (l5 == l4) {
                        i4 = i5;
                    }
                    if (m4 == null || l5.m().equals(m4)) {
                        i5++;
                    }
                }
            } else {
                i4 = 0;
                i5 = 1;
            }
            int i6 = this.f41439c ? i4 + 1 : i5 - i4;
            int i7 = this.f41437a;
            if (i7 == 0) {
                return i6 == this.f41438b;
            }
            int i8 = this.f41438b;
            return (i6 - i8) % i7 == 0 && (Integer.signum(i6 - i8) == 0 || Integer.signum(i6 - this.f41438b) == Integer.signum(this.f41437a));
        }

        public String toString() {
            String str = this.f41439c ? "" : "last-";
            return this.f41440d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f41437a), Integer.valueOf(this.f41438b), this.f41441e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f41437a), Integer.valueOf(this.f41438b));
        }
    }

    /* renamed from: o0.b$i */
    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            return !(l4 instanceof C3276g.J) || ((C3276g.J) l4).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* renamed from: o0.b$j */
    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* renamed from: A, reason: collision with root package name */
        private static final Map f41442A = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f41442A.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = (j) f41442A.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* renamed from: o0.b$k */
    private static class k implements g {

        /* renamed from: a, reason: collision with root package name */
        private List f41469a;

        k(List list) {
            this.f41469a = list;
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            Iterator it = this.f41469a.iterator();
            while (it.hasNext()) {
                if (C3271b.l(qVar, (s) it.next(), l4)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f41469a.iterator();
            int i4 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i5 = ((s) it.next()).f41479b;
                if (i5 > i4) {
                    i4 = i5;
                }
            }
            return i4;
        }

        public String toString() {
            return "not(" + this.f41469a + ")";
        }
    }

    /* renamed from: o0.b$l */
    private static class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private String f41470a;

        l(String str) {
            this.f41470a = str;
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            return false;
        }

        public String toString() {
            return this.f41470a;
        }
    }

    /* renamed from: o0.b$m */
    private static class m implements g {

        /* renamed from: a, reason: collision with root package name */
        private boolean f41471a;

        /* renamed from: b, reason: collision with root package name */
        private String f41472b;

        public m(boolean z4, String str) {
            this.f41471a = z4;
            this.f41472b = str;
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            int i4;
            String m4 = (this.f41471a && this.f41472b == null) ? l4.m() : this.f41472b;
            C3276g.J j4 = l4.f41638b;
            if (j4 != null) {
                Iterator it = j4.getChildren().iterator();
                i4 = 0;
                while (it.hasNext()) {
                    C3276g.L l5 = (C3276g.L) ((C3276g.N) it.next());
                    if (m4 == null || l5.m().equals(m4)) {
                        i4++;
                    }
                }
            } else {
                i4 = 1;
            }
            return i4 == 1;
        }

        public String toString() {
            return this.f41471a ? String.format("only-of-type <%s>", this.f41472b) : String.format("only-child", new Object[0]);
        }
    }

    /* renamed from: o0.b$n */
    private static class n implements g {
        private n() {
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            return l4.f41638b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* renamed from: o0.b$o */
    private static class o implements g {
        private o() {
        }

        @Override // o0.C3271b.g
        public boolean a(q qVar, C3276g.L l4) {
            return qVar != null && l4 == qVar.f41476a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* renamed from: o0.b$p */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        s f41473a;

        /* renamed from: b, reason: collision with root package name */
        C3276g.E f41474b;

        /* renamed from: c, reason: collision with root package name */
        u f41475c;

        p(s sVar, C3276g.E e4, u uVar) {
            this.f41473a = sVar;
            this.f41474b = e4;
            this.f41475c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f41473a) + " {...} (src=" + this.f41475c + ")";
        }
    }

    /* renamed from: o0.b$q */
    static class q {

        /* renamed from: a, reason: collision with root package name */
        C3276g.L f41476a;

        q() {
        }

        public String toString() {
            C3276g.L l4 = this.f41476a;
            return l4 != null ? String.format("<%s id=\"%s\">", l4.m(), this.f41476a.f41628c) : "";
        }
    }

    /* renamed from: o0.b$r */
    static class r {

        /* renamed from: a, reason: collision with root package name */
        private List f41477a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f41477a == null) {
                this.f41477a = new ArrayList();
            }
            for (int i4 = 0; i4 < this.f41477a.size(); i4++) {
                if (((p) this.f41477a.get(i4)).f41473a.f41479b > pVar.f41473a.f41479b) {
                    this.f41477a.add(i4, pVar);
                    return;
                }
            }
            this.f41477a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f41477a == null) {
                return;
            }
            if (this.f41477a == null) {
                this.f41477a = new ArrayList(rVar.f41477a.size());
            }
            Iterator it = rVar.f41477a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f41477a;
        }

        boolean d() {
            List list = this.f41477a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f41477a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f41475c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f41477a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f41477a == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f41477a.iterator();
            while (it.hasNext()) {
                sb.append(((p) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* renamed from: o0.b$t */
    private static class t {

        /* renamed from: a, reason: collision with root package name */
        e f41480a;

        /* renamed from: b, reason: collision with root package name */
        String f41481b;

        /* renamed from: c, reason: collision with root package name */
        List f41482c = null;

        /* renamed from: d, reason: collision with root package name */
        List f41483d = null;

        t(e eVar, String str) {
            this.f41480a = null;
            this.f41481b = null;
            this.f41480a = eVar == null ? e.DESCENDANT : eVar;
            this.f41481b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f41482c == null) {
                this.f41482c = new ArrayList();
            }
            this.f41482c.add(new C0237b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f41483d == null) {
                this.f41483d = new ArrayList();
            }
            this.f41483d.add(gVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = this.f41480a;
            if (eVar == e.CHILD) {
                sb.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f41481b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C0237b> list = this.f41482c;
            if (list != null) {
                for (C0237b c0237b : list) {
                    sb.append('[');
                    sb.append(c0237b.f41411a);
                    int i4 = a.f41409a[c0237b.f41412b.ordinal()];
                    if (i4 == 1) {
                        sb.append(cc.f15727T);
                        sb.append(c0237b.f41413c);
                    } else if (i4 == 2) {
                        sb.append("~=");
                        sb.append(c0237b.f41413c);
                    } else if (i4 == 3) {
                        sb.append("|=");
                        sb.append(c0237b.f41413c);
                    }
                    sb.append(']');
                }
            }
            List<g> list2 = this.f41483d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: o0.b$u */
    enum u {
        Document,
        RenderOptions
    }

    C3271b(f fVar, u uVar) {
        this.f41406a = fVar;
        this.f41407b = uVar;
    }

    private static int a(List list, int i4, C3276g.L l4) {
        int i5 = 0;
        if (i4 < 0) {
            return 0;
        }
        Object obj = list.get(i4);
        C3276g.J j4 = l4.f41638b;
        if (obj != j4) {
            return -1;
        }
        Iterator it = j4.getChildren().iterator();
        while (it.hasNext()) {
            if (((C3276g.N) it.next()) == l4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) {
        String H3 = dVar.H();
        dVar.A();
        if (H3 == null) {
            throw new C3270a("Invalid '@' rule");
        }
        if (!this.f41408c && H3.equals(b9.h.f15446I0)) {
            List h4 = h(dVar);
            if (!dVar.f('{')) {
                throw new C3270a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(h4, this.f41406a)) {
                this.f41408c = true;
                rVar.b(j(dVar));
                this.f41408c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new C3270a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f41408c || !H3.equals("import")) {
            p("Ignoring @%s rule", H3);
            o(dVar);
        } else {
            String N3 = dVar.N();
            if (N3 == null) {
                N3 = dVar.F();
            }
            if (N3 == null) {
                throw new C3270a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new C3270a("Invalid @media rule: expected '}' at end of rule set");
            }
            C3276g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String r4 = dVar.r();
            if (r4 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r4);
                dVar.A();
            }
        }
        return arrayList;
    }

    private C3276g.E g(d dVar) {
        C3276g.E e4 = new C3276g.E();
        do {
            String H3 = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new C3270a("Expected ':'");
            }
            dVar.A();
            String J3 = dVar.J();
            if (J3 == null) {
                throw new C3270a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new C3270a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            C3305k.S0(e4, H3, J3);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e4;
    }

    private static List h(d dVar) {
        String w4;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (w4 = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(w4));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) {
        List L3 = dVar.L();
        if (L3 == null || L3.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new C3270a("Malformed rule block: expected '{'");
        }
        dVar.A();
        C3276g.E g4 = g(dVar);
        dVar.A();
        Iterator it = L3.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), g4, this.f41407b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (C3270a e4) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e4.getMessage());
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i4, List list, int i5, C3276g.L l4) {
        t e4 = sVar.e(i4);
        if (!n(qVar, e4, list, i5, l4)) {
            return false;
        }
        e eVar = e4.f41480a;
        if (eVar == e.DESCENDANT) {
            if (i4 == 0) {
                return true;
            }
            while (i5 >= 0) {
                if (m(qVar, sVar, i4 - 1, list, i5)) {
                    return true;
                }
                i5--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i4 - 1, list, i5);
        }
        int a4 = a(list, i5, l4);
        if (a4 <= 0) {
            return false;
        }
        return k(qVar, sVar, i4 - 1, list, i5, (C3276g.L) l4.f41638b.getChildren().get(a4 - 1));
    }

    static boolean l(q qVar, s sVar, C3276g.L l4) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l4.f41638b; obj != null; obj = ((C3276g.N) obj).f41638b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l4) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l4);
    }

    private static boolean m(q qVar, s sVar, int i4, List list, int i5) {
        t e4 = sVar.e(i4);
        C3276g.L l4 = (C3276g.L) list.get(i5);
        if (!n(qVar, e4, list, i5, l4)) {
            return false;
        }
        e eVar = e4.f41480a;
        if (eVar == e.DESCENDANT) {
            if (i4 == 0) {
                return true;
            }
            while (i5 > 0) {
                i5--;
                if (m(qVar, sVar, i4 - 1, list, i5)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i4 - 1, list, i5 - 1);
        }
        int a4 = a(list, i5, l4);
        if (a4 <= 0) {
            return false;
        }
        return k(qVar, sVar, i4 - 1, list, i5, (C3276g.L) l4.f41638b.getChildren().get(a4 - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i4, C3276g.L l4) {
        List list2;
        String str = tVar.f41481b;
        if (str != null && !str.equals(l4.m().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0237b> list3 = tVar.f41482c;
        if (list3 != null) {
            for (C0237b c0237b : list3) {
                String str2 = c0237b.f41411a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0237b.f41413c.equals(l4.f41628c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l4.f41632g) == null || !list2.contains(c0237b.f41413c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f41483d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l4)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i4 = 0;
        while (!dVar.h()) {
            int intValue = dVar.l().intValue();
            if (intValue == 59 && i4 == 0) {
                return;
            }
            if (intValue == 123) {
                i4++;
            } else if (intValue == 125 && i4 > 0 && i4 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0.b$s */
    static class s {

        /* renamed from: a, reason: collision with root package name */
        List f41478a;

        /* renamed from: b, reason: collision with root package name */
        int f41479b;

        private s() {
            this.f41478a = null;
            this.f41479b = 0;
        }

        void a(t tVar) {
            if (this.f41478a == null) {
                this.f41478a = new ArrayList();
            }
            this.f41478a.add(tVar);
        }

        void b() {
            this.f41479b += 1000;
        }

        void c() {
            this.f41479b++;
        }

        void d() {
            this.f41479b += 1000000;
        }

        t e(int i4) {
            return (t) this.f41478a.get(i4);
        }

        boolean f() {
            List list = this.f41478a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f41478a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f41478a.iterator();
            while (it.hasNext()) {
                sb.append((t) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f41479b);
            sb.append(']');
            return sb.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
