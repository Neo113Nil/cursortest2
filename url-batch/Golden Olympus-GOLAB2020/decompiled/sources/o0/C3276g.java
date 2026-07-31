package o0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0.C3271b;

/* renamed from: o0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3276g {

    /* renamed from: g, reason: collision with root package name */
    private static boolean f41523g = true;

    /* renamed from: a, reason: collision with root package name */
    private F f41524a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f41525b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f41526c = "";

    /* renamed from: d, reason: collision with root package name */
    private float f41527d = 96.0f;

    /* renamed from: e, reason: collision with root package name */
    private C3271b.r f41528e = new C3271b.r();

    /* renamed from: f, reason: collision with root package name */
    private Map f41529f = new HashMap();

    /* renamed from: o0.g$A */
    static class A extends C3301z {
        A() {
        }

        @Override // o0.C3276g.C3301z, o0.C3276g.N
        String m() {
            return "polygon";
        }
    }

    /* renamed from: o0.g$B */
    static class B extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        C3291p f41530o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41531p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41532q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41533r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41534s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41535t;

        B() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "rect";
        }
    }

    /* renamed from: o0.g$E */
    static class E implements Cloneable {

        /* renamed from: A, reason: collision with root package name */
        String f41537A;

        /* renamed from: B, reason: collision with root package name */
        Boolean f41538B;

        /* renamed from: C, reason: collision with root package name */
        Boolean f41539C;

        /* renamed from: D, reason: collision with root package name */
        O f41540D;

        /* renamed from: E, reason: collision with root package name */
        Float f41541E;

        /* renamed from: F, reason: collision with root package name */
        String f41542F;

        /* renamed from: G, reason: collision with root package name */
        a f41543G;

        /* renamed from: H, reason: collision with root package name */
        String f41544H;

        /* renamed from: I, reason: collision with root package name */
        O f41545I;

        /* renamed from: J, reason: collision with root package name */
        Float f41546J;

        /* renamed from: K, reason: collision with root package name */
        O f41547K;

        /* renamed from: L, reason: collision with root package name */
        Float f41548L;

        /* renamed from: M, reason: collision with root package name */
        i f41549M;

        /* renamed from: N, reason: collision with root package name */
        e f41550N;

        /* renamed from: b, reason: collision with root package name */
        long f41551b = 0;

        /* renamed from: c, reason: collision with root package name */
        O f41552c;

        /* renamed from: d, reason: collision with root package name */
        a f41553d;

        /* renamed from: e, reason: collision with root package name */
        Float f41554e;

        /* renamed from: f, reason: collision with root package name */
        O f41555f;

        /* renamed from: g, reason: collision with root package name */
        Float f41556g;

        /* renamed from: h, reason: collision with root package name */
        C3291p f41557h;

        /* renamed from: i, reason: collision with root package name */
        c f41558i;

        /* renamed from: j, reason: collision with root package name */
        d f41559j;

        /* renamed from: k, reason: collision with root package name */
        Float f41560k;

        /* renamed from: l, reason: collision with root package name */
        C3291p[] f41561l;

        /* renamed from: m, reason: collision with root package name */
        C3291p f41562m;

        /* renamed from: n, reason: collision with root package name */
        Float f41563n;

        /* renamed from: o, reason: collision with root package name */
        C3282f f41564o;

        /* renamed from: p, reason: collision with root package name */
        List f41565p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41566q;

        /* renamed from: r, reason: collision with root package name */
        Integer f41567r;

        /* renamed from: s, reason: collision with root package name */
        b f41568s;

        /* renamed from: t, reason: collision with root package name */
        EnumC0238g f41569t;

        /* renamed from: u, reason: collision with root package name */
        h f41570u;

        /* renamed from: v, reason: collision with root package name */
        f f41571v;

        /* renamed from: w, reason: collision with root package name */
        Boolean f41572w;

        /* renamed from: x, reason: collision with root package name */
        C3279c f41573x;

        /* renamed from: y, reason: collision with root package name */
        String f41574y;

        /* renamed from: z, reason: collision with root package name */
        String f41575z;

        /* renamed from: o0.g$E$a */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* renamed from: o0.g$E$b */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* renamed from: o0.g$E$c */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* renamed from: o0.g$E$d */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* renamed from: o0.g$E$e */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* renamed from: o0.g$E$f */
        public enum f {
            Start,
            Middle,
            End
        }

        /* renamed from: o0.g$E$g, reason: collision with other inner class name */
        public enum EnumC0238g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* renamed from: o0.g$E$h */
        public enum h {
            LTR,
            RTL
        }

        /* renamed from: o0.g$E$i */
        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E a() {
            E e4 = new E();
            e4.f41551b = -1L;
            C3282f c3282f = C3282f.f41687c;
            e4.f41552c = c3282f;
            a aVar = a.NonZero;
            e4.f41553d = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e4.f41554e = valueOf;
            e4.f41555f = null;
            e4.f41556g = valueOf;
            e4.f41557h = new C3291p(1.0f);
            e4.f41558i = c.Butt;
            e4.f41559j = d.Miter;
            e4.f41560k = Float.valueOf(4.0f);
            e4.f41561l = null;
            e4.f41562m = new C3291p(0.0f);
            e4.f41563n = valueOf;
            e4.f41564o = c3282f;
            e4.f41565p = null;
            e4.f41566q = new C3291p(12.0f, d0.pt);
            e4.f41567r = 400;
            e4.f41568s = b.Normal;
            e4.f41569t = EnumC0238g.None;
            e4.f41570u = h.LTR;
            e4.f41571v = f.Start;
            Boolean bool = Boolean.TRUE;
            e4.f41572w = bool;
            e4.f41573x = null;
            e4.f41574y = null;
            e4.f41575z = null;
            e4.f41537A = null;
            e4.f41538B = bool;
            e4.f41539C = bool;
            e4.f41540D = c3282f;
            e4.f41541E = valueOf;
            e4.f41542F = null;
            e4.f41543G = aVar;
            e4.f41544H = null;
            e4.f41545I = null;
            e4.f41546J = valueOf;
            e4.f41547K = null;
            e4.f41548L = valueOf;
            e4.f41549M = i.None;
            e4.f41550N = e.auto;
            return e4;
        }

        void b(boolean z4) {
            Boolean bool = Boolean.TRUE;
            this.f41538B = bool;
            if (!z4) {
                bool = Boolean.FALSE;
            }
            this.f41572w = bool;
            this.f41573x = null;
            this.f41542F = null;
            this.f41563n = Float.valueOf(1.0f);
            this.f41540D = C3282f.f41687c;
            this.f41541E = Float.valueOf(1.0f);
            this.f41544H = null;
            this.f41545I = null;
            this.f41546J = Float.valueOf(1.0f);
            this.f41547K = null;
            this.f41548L = Float.valueOf(1.0f);
            this.f41549M = i.None;
        }

        protected Object clone() {
            E e4 = (E) super.clone();
            C3291p[] c3291pArr = this.f41561l;
            if (c3291pArr != null) {
                e4.f41561l = (C3291p[]) c3291pArr.clone();
            }
            return e4;
        }
    }

    /* renamed from: o0.g$F */
    static class F extends R {

        /* renamed from: q, reason: collision with root package name */
        C3291p f41611q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41612r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41613s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41614t;

        /* renamed from: u, reason: collision with root package name */
        public String f41615u;

        F() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "svg";
        }
    }

    /* renamed from: o0.g$G */
    interface G {
        Set a();

        void b(Set set);

        String c();

        void d(Set set);

        void f(Set set);

        void g(String str);

        Set getRequiredFeatures();

        void j(Set set);

        Set k();

        Set l();
    }

    /* renamed from: o0.g$H */
    static abstract class H extends K implements J, G {

        /* renamed from: i, reason: collision with root package name */
        List f41616i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        Set f41617j = null;

        /* renamed from: k, reason: collision with root package name */
        String f41618k = null;

        /* renamed from: l, reason: collision with root package name */
        Set f41619l = null;

        /* renamed from: m, reason: collision with root package name */
        Set f41620m = null;

        /* renamed from: n, reason: collision with root package name */
        Set f41621n = null;

        H() {
        }

        @Override // o0.C3276g.G
        public Set a() {
            return null;
        }

        @Override // o0.C3276g.G
        public void b(Set set) {
            this.f41620m = set;
        }

        @Override // o0.C3276g.G
        public String c() {
            return this.f41618k;
        }

        @Override // o0.C3276g.G
        public void d(Set set) {
            this.f41621n = set;
        }

        @Override // o0.C3276g.G
        public void f(Set set) {
            this.f41617j = set;
        }

        @Override // o0.C3276g.G
        public void g(String str) {
            this.f41618k = str;
        }

        @Override // o0.C3276g.J
        public List getChildren() {
            return this.f41616i;
        }

        @Override // o0.C3276g.G
        public Set getRequiredFeatures() {
            return this.f41617j;
        }

        @Override // o0.C3276g.J
        public void h(N n4) {
            this.f41616i.add(n4);
        }

        @Override // o0.C3276g.G
        public void j(Set set) {
            this.f41619l = set;
        }

        @Override // o0.C3276g.G
        public Set k() {
            return this.f41620m;
        }

        @Override // o0.C3276g.G
        public Set l() {
            return this.f41621n;
        }
    }

    /* renamed from: o0.g$I */
    static abstract class I extends K implements G {

        /* renamed from: i, reason: collision with root package name */
        Set f41622i = null;

        /* renamed from: j, reason: collision with root package name */
        String f41623j = null;

        /* renamed from: k, reason: collision with root package name */
        Set f41624k = null;

        /* renamed from: l, reason: collision with root package name */
        Set f41625l = null;

        /* renamed from: m, reason: collision with root package name */
        Set f41626m = null;

        I() {
        }

        @Override // o0.C3276g.G
        public Set a() {
            return this.f41624k;
        }

        @Override // o0.C3276g.G
        public void b(Set set) {
            this.f41625l = set;
        }

        @Override // o0.C3276g.G
        public String c() {
            return this.f41623j;
        }

        @Override // o0.C3276g.G
        public void d(Set set) {
            this.f41626m = set;
        }

        @Override // o0.C3276g.G
        public void f(Set set) {
            this.f41622i = set;
        }

        @Override // o0.C3276g.G
        public void g(String str) {
            this.f41623j = str;
        }

        @Override // o0.C3276g.G
        public Set getRequiredFeatures() {
            return this.f41622i;
        }

        @Override // o0.C3276g.G
        public void j(Set set) {
            this.f41624k = set;
        }

        @Override // o0.C3276g.G
        public Set k() {
            return this.f41625l;
        }

        @Override // o0.C3276g.G
        public Set l() {
            return this.f41626m;
        }
    }

    /* renamed from: o0.g$J */
    interface J {
        List getChildren();

        void h(N n4);
    }

    /* renamed from: o0.g$K */
    static abstract class K extends L {

        /* renamed from: h, reason: collision with root package name */
        C3278b f41627h = null;

        K() {
        }
    }

    /* renamed from: o0.g$L */
    static abstract class L extends N {

        /* renamed from: c, reason: collision with root package name */
        String f41628c = null;

        /* renamed from: d, reason: collision with root package name */
        Boolean f41629d = null;

        /* renamed from: e, reason: collision with root package name */
        E f41630e = null;

        /* renamed from: f, reason: collision with root package name */
        E f41631f = null;

        /* renamed from: g, reason: collision with root package name */
        List f41632g = null;

        L() {
        }

        public String toString() {
            return m();
        }
    }

    /* renamed from: o0.g$M */
    static class M extends AbstractC3285j {

        /* renamed from: m, reason: collision with root package name */
        C3291p f41633m;

        /* renamed from: n, reason: collision with root package name */
        C3291p f41634n;

        /* renamed from: o, reason: collision with root package name */
        C3291p f41635o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41636p;

        M() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "linearGradient";
        }
    }

    /* renamed from: o0.g$N */
    static class N {

        /* renamed from: a, reason: collision with root package name */
        C3276g f41637a;

        /* renamed from: b, reason: collision with root package name */
        J f41638b;

        N() {
        }

        abstract String m();
    }

    /* renamed from: o0.g$O */
    static abstract class O implements Cloneable {
        O() {
        }
    }

    /* renamed from: o0.g$P */
    static abstract class P extends H {

        /* renamed from: o, reason: collision with root package name */
        C3274e f41639o = null;

        P() {
        }
    }

    /* renamed from: o0.g$Q */
    static class Q extends AbstractC3285j {

        /* renamed from: m, reason: collision with root package name */
        C3291p f41640m;

        /* renamed from: n, reason: collision with root package name */
        C3291p f41641n;

        /* renamed from: o, reason: collision with root package name */
        C3291p f41642o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41643p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41644q;

        Q() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "radialGradient";
        }
    }

    /* renamed from: o0.g$R */
    static abstract class R extends P {

        /* renamed from: p, reason: collision with root package name */
        C3278b f41645p;

        R() {
        }
    }

    /* renamed from: o0.g$S */
    static class S extends C3288m {
        S() {
        }

        @Override // o0.C3276g.C3288m, o0.C3276g.N
        String m() {
            return "switch";
        }
    }

    /* renamed from: o0.g$T */
    static class T extends R implements InterfaceC3295t {
        T() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "symbol";
        }
    }

    /* renamed from: o0.g$U */
    static class U extends Y implements X {

        /* renamed from: o, reason: collision with root package name */
        String f41646o;

        /* renamed from: p, reason: collision with root package name */
        private b0 f41647p;

        U() {
        }

        @Override // o0.C3276g.X
        public b0 e() {
            return this.f41647p;
        }

        @Override // o0.C3276g.N
        String m() {
            return "tref";
        }

        public void n(b0 b0Var) {
            this.f41647p = b0Var;
        }
    }

    /* renamed from: o0.g$V */
    static class V extends a0 implements X {

        /* renamed from: s, reason: collision with root package name */
        private b0 f41648s;

        V() {
        }

        @Override // o0.C3276g.X
        public b0 e() {
            return this.f41648s;
        }

        @Override // o0.C3276g.N
        String m() {
            return "tspan";
        }

        public void n(b0 b0Var) {
            this.f41648s = b0Var;
        }
    }

    /* renamed from: o0.g$W */
    static class W extends a0 implements b0, InterfaceC3289n {

        /* renamed from: s, reason: collision with root package name */
        Matrix f41649s;

        W() {
        }

        @Override // o0.C3276g.InterfaceC3289n
        public void i(Matrix matrix) {
            this.f41649s = matrix;
        }

        @Override // o0.C3276g.N
        String m() {
            return b9.h.f15450K0;
        }
    }

    /* renamed from: o0.g$X */
    interface X {
        b0 e();
    }

    /* renamed from: o0.g$Y */
    static abstract class Y extends H {
        Y() {
        }

        @Override // o0.C3276g.H, o0.C3276g.J
        public void h(N n4) {
            if (n4 instanceof X) {
                this.f41616i.add(n4);
                return;
            }
            throw new C3304j("Text content elements cannot contain " + n4 + " elements.");
        }
    }

    /* renamed from: o0.g$Z */
    static class Z extends Y implements X {

        /* renamed from: o, reason: collision with root package name */
        String f41650o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41651p;

        /* renamed from: q, reason: collision with root package name */
        private b0 f41652q;

        Z() {
        }

        @Override // o0.C3276g.X
        public b0 e() {
            return this.f41652q;
        }

        @Override // o0.C3276g.N
        String m() {
            return "textPath";
        }

        public void n(b0 b0Var) {
            this.f41652q = b0Var;
        }
    }

    /* renamed from: o0.g$a, reason: case insensitive filesystem */
    static /* synthetic */ class C3277a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41653a;

        static {
            int[] iArr = new int[d0.values().length];
            f41653a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41653a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41653a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41653a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41653a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41653a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41653a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41653a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41653a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: o0.g$a0 */
    static abstract class a0 extends Y {

        /* renamed from: o, reason: collision with root package name */
        List f41654o;

        /* renamed from: p, reason: collision with root package name */
        List f41655p;

        /* renamed from: q, reason: collision with root package name */
        List f41656q;

        /* renamed from: r, reason: collision with root package name */
        List f41657r;

        a0() {
        }
    }

    /* renamed from: o0.g$b0 */
    interface b0 {
    }

    /* renamed from: o0.g$c, reason: case insensitive filesystem */
    static class C3279c {

        /* renamed from: a, reason: collision with root package name */
        C3291p f41662a;

        /* renamed from: b, reason: collision with root package name */
        C3291p f41663b;

        /* renamed from: c, reason: collision with root package name */
        C3291p f41664c;

        /* renamed from: d, reason: collision with root package name */
        C3291p f41665d;

        C3279c(C3291p c3291p, C3291p c3291p2, C3291p c3291p3, C3291p c3291p4) {
            this.f41662a = c3291p;
            this.f41663b = c3291p2;
            this.f41664c = c3291p3;
            this.f41665d = c3291p4;
        }
    }

    /* renamed from: o0.g$c0 */
    static class c0 extends N implements X {

        /* renamed from: c, reason: collision with root package name */
        String f41666c;

        /* renamed from: d, reason: collision with root package name */
        private b0 f41667d;

        c0(String str) {
            this.f41666c = str;
        }

        @Override // o0.C3276g.X
        public b0 e() {
            return this.f41667d;
        }

        public String toString() {
            return "TextChild: '" + this.f41666c + "'";
        }
    }

    /* renamed from: o0.g$d, reason: case insensitive filesystem */
    static class C3280d extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        C3291p f41668o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41669p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41670q;

        C3280d() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "circle";
        }
    }

    /* renamed from: o0.g$d0 */
    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: o0.g$e, reason: case insensitive filesystem */
    static class C3281e extends C3288m implements InterfaceC3295t {

        /* renamed from: p, reason: collision with root package name */
        Boolean f41681p;

        C3281e() {
        }

        @Override // o0.C3276g.C3288m, o0.C3276g.N
        String m() {
            return "clipPath";
        }
    }

    /* renamed from: o0.g$e0 */
    static class e0 extends C3288m {

        /* renamed from: p, reason: collision with root package name */
        String f41682p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41683q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41684r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41685s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41686t;

        e0() {
        }

        @Override // o0.C3276g.C3288m, o0.C3276g.N
        String m() {
            return "use";
        }
    }

    /* renamed from: o0.g$f, reason: case insensitive filesystem */
    static class C3282f extends O {

        /* renamed from: c, reason: collision with root package name */
        static final C3282f f41687c = new C3282f(-16777216);

        /* renamed from: d, reason: collision with root package name */
        static final C3282f f41688d = new C3282f(0);

        /* renamed from: b, reason: collision with root package name */
        int f41689b;

        C3282f(int i4) {
            this.f41689b = i4;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.f41689b));
        }
    }

    /* renamed from: o0.g$f0 */
    static class f0 extends R implements InterfaceC3295t {
        f0() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "view";
        }
    }

    /* renamed from: o0.g$g, reason: collision with other inner class name */
    static class C0239g extends O {

        /* renamed from: b, reason: collision with root package name */
        private static C0239g f41690b = new C0239g();

        private C0239g() {
        }

        static C0239g a() {
            return f41690b;
        }
    }

    /* renamed from: o0.g$h, reason: case insensitive filesystem */
    static class C3283h extends C3288m implements InterfaceC3295t {
        C3283h() {
        }

        @Override // o0.C3276g.C3288m, o0.C3276g.N
        String m() {
            return "defs";
        }
    }

    /* renamed from: o0.g$i, reason: case insensitive filesystem */
    static class C3284i extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        C3291p f41691o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41692p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41693q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41694r;

        C3284i() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "ellipse";
        }
    }

    /* renamed from: o0.g$j, reason: case insensitive filesystem */
    static abstract class AbstractC3285j extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        List f41695h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        Boolean f41696i;

        /* renamed from: j, reason: collision with root package name */
        Matrix f41697j;

        /* renamed from: k, reason: collision with root package name */
        EnumC3286k f41698k;

        /* renamed from: l, reason: collision with root package name */
        String f41699l;

        AbstractC3285j() {
        }

        @Override // o0.C3276g.J
        public List getChildren() {
            return this.f41695h;
        }

        @Override // o0.C3276g.J
        public void h(N n4) {
            if (n4 instanceof D) {
                this.f41695h.add(n4);
                return;
            }
            throw new C3304j("Gradient elements cannot contain " + n4 + " elements.");
        }
    }

    /* renamed from: o0.g$k, reason: case insensitive filesystem */
    enum EnumC3286k {
        pad,
        reflect,
        repeat
    }

    /* renamed from: o0.g$l, reason: case insensitive filesystem */
    static abstract class AbstractC3287l extends I implements InterfaceC3289n {

        /* renamed from: n, reason: collision with root package name */
        Matrix f41704n;

        AbstractC3287l() {
        }

        @Override // o0.C3276g.InterfaceC3289n
        public void i(Matrix matrix) {
            this.f41704n = matrix;
        }
    }

    /* renamed from: o0.g$m, reason: case insensitive filesystem */
    static class C3288m extends H implements InterfaceC3289n {

        /* renamed from: o, reason: collision with root package name */
        Matrix f41705o;

        C3288m() {
        }

        @Override // o0.C3276g.InterfaceC3289n
        public void i(Matrix matrix) {
            this.f41705o = matrix;
        }

        @Override // o0.C3276g.N
        String m() {
            return "group";
        }
    }

    /* renamed from: o0.g$n, reason: case insensitive filesystem */
    interface InterfaceC3289n {
        void i(Matrix matrix);
    }

    /* renamed from: o0.g$o, reason: case insensitive filesystem */
    static class C3290o extends P implements InterfaceC3289n {

        /* renamed from: p, reason: collision with root package name */
        String f41706p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41707q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41708r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41709s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41710t;

        /* renamed from: u, reason: collision with root package name */
        Matrix f41711u;

        C3290o() {
        }

        @Override // o0.C3276g.InterfaceC3289n
        public void i(Matrix matrix) {
            this.f41711u = matrix;
        }

        @Override // o0.C3276g.N
        String m() {
            return "image";
        }
    }

    /* renamed from: o0.g$q, reason: case insensitive filesystem */
    static class C3292q extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        C3291p f41714o;

        /* renamed from: p, reason: collision with root package name */
        C3291p f41715p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41716q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41717r;

        C3292q() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "line";
        }
    }

    /* renamed from: o0.g$r, reason: case insensitive filesystem */
    static class C3293r extends R implements InterfaceC3295t {

        /* renamed from: q, reason: collision with root package name */
        boolean f41718q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41719r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41720s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41721t;

        /* renamed from: u, reason: collision with root package name */
        C3291p f41722u;

        /* renamed from: v, reason: collision with root package name */
        Float f41723v;

        C3293r() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "marker";
        }
    }

    /* renamed from: o0.g$s, reason: case insensitive filesystem */
    static class C3294s extends H implements InterfaceC3295t {

        /* renamed from: o, reason: collision with root package name */
        Boolean f41724o;

        /* renamed from: p, reason: collision with root package name */
        Boolean f41725p;

        /* renamed from: q, reason: collision with root package name */
        C3291p f41726q;

        /* renamed from: r, reason: collision with root package name */
        C3291p f41727r;

        /* renamed from: s, reason: collision with root package name */
        C3291p f41728s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41729t;

        C3294s() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "mask";
        }
    }

    /* renamed from: o0.g$t, reason: case insensitive filesystem */
    interface InterfaceC3295t {
    }

    /* renamed from: o0.g$u, reason: case insensitive filesystem */
    static class C3296u extends O {

        /* renamed from: b, reason: collision with root package name */
        String f41730b;

        /* renamed from: c, reason: collision with root package name */
        O f41731c;

        C3296u(String str, O o4) {
            this.f41730b = str;
            this.f41731c = o4;
        }

        public String toString() {
            return this.f41730b + " " + this.f41731c;
        }
    }

    /* renamed from: o0.g$v, reason: case insensitive filesystem */
    static class C3297v extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        C3298w f41732o;

        /* renamed from: p, reason: collision with root package name */
        Float f41733p;

        C3297v() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "path";
        }
    }

    /* renamed from: o0.g$w, reason: case insensitive filesystem */
    static class C3298w implements InterfaceC3299x {

        /* renamed from: b, reason: collision with root package name */
        private int f41735b = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f41737d = 0;

        /* renamed from: a, reason: collision with root package name */
        private byte[] f41734a = new byte[8];

        /* renamed from: c, reason: collision with root package name */
        private float[] f41736c = new float[16];

        C3298w() {
        }

        private void f(byte b4) {
            int i4 = this.f41735b;
            byte[] bArr = this.f41734a;
            if (i4 == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f41734a = bArr2;
            }
            byte[] bArr3 = this.f41734a;
            int i5 = this.f41735b;
            this.f41735b = i5 + 1;
            bArr3[i5] = b4;
        }

        private void g(int i4) {
            float[] fArr = this.f41736c;
            if (fArr.length < this.f41737d + i4) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f41736c = fArr2;
            }
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void a(float f4, float f5, float f6, float f7) {
            f((byte) 3);
            g(4);
            float[] fArr = this.f41736c;
            int i4 = this.f41737d;
            int i5 = i4 + 1;
            this.f41737d = i5;
            fArr[i4] = f4;
            int i6 = i4 + 2;
            this.f41737d = i6;
            fArr[i5] = f5;
            int i7 = i4 + 3;
            this.f41737d = i7;
            fArr[i6] = f6;
            this.f41737d = i4 + 4;
            fArr[i7] = f7;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void b(float f4, float f5) {
            f((byte) 0);
            g(2);
            float[] fArr = this.f41736c;
            int i4 = this.f41737d;
            int i5 = i4 + 1;
            this.f41737d = i5;
            fArr[i4] = f4;
            this.f41737d = i4 + 2;
            fArr[i5] = f5;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void c(float f4, float f5, float f6, float f7, float f8, float f9) {
            f((byte) 2);
            g(6);
            float[] fArr = this.f41736c;
            int i4 = this.f41737d;
            int i5 = i4 + 1;
            this.f41737d = i5;
            fArr[i4] = f4;
            int i6 = i4 + 2;
            this.f41737d = i6;
            fArr[i5] = f5;
            int i7 = i4 + 3;
            this.f41737d = i7;
            fArr[i6] = f6;
            int i8 = i4 + 4;
            this.f41737d = i8;
            fArr[i7] = f7;
            int i9 = i4 + 5;
            this.f41737d = i9;
            fArr[i8] = f8;
            this.f41737d = i4 + 6;
            fArr[i9] = f9;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void close() {
            f((byte) 8);
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void d(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8) {
            f((byte) ((z4 ? 2 : 0) | 4 | (z5 ? 1 : 0)));
            g(5);
            float[] fArr = this.f41736c;
            int i4 = this.f41737d;
            int i5 = i4 + 1;
            this.f41737d = i5;
            fArr[i4] = f4;
            int i6 = i4 + 2;
            this.f41737d = i6;
            fArr[i5] = f5;
            int i7 = i4 + 3;
            this.f41737d = i7;
            fArr[i6] = f6;
            int i8 = i4 + 4;
            this.f41737d = i8;
            fArr[i7] = f7;
            this.f41737d = i4 + 5;
            fArr[i8] = f8;
        }

        @Override // o0.C3276g.InterfaceC3299x
        public void e(float f4, float f5) {
            f((byte) 1);
            g(2);
            float[] fArr = this.f41736c;
            int i4 = this.f41737d;
            int i5 = i4 + 1;
            this.f41737d = i5;
            fArr[i4] = f4;
            this.f41737d = i4 + 2;
            fArr[i5] = f5;
        }

        void h(InterfaceC3299x interfaceC3299x) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.f41735b; i5++) {
                byte b4 = this.f41734a[i5];
                if (b4 == 0) {
                    float[] fArr = this.f41736c;
                    int i6 = i4 + 1;
                    float f4 = fArr[i4];
                    i4 += 2;
                    interfaceC3299x.b(f4, fArr[i6]);
                } else if (b4 == 1) {
                    float[] fArr2 = this.f41736c;
                    int i7 = i4 + 1;
                    float f5 = fArr2[i4];
                    i4 += 2;
                    interfaceC3299x.e(f5, fArr2[i7]);
                } else if (b4 == 2) {
                    float[] fArr3 = this.f41736c;
                    interfaceC3299x.c(fArr3[i4], fArr3[i4 + 1], fArr3[i4 + 2], fArr3[i4 + 3], fArr3[i4 + 4], fArr3[i4 + 5]);
                    i4 += 6;
                } else if (b4 == 3) {
                    float[] fArr4 = this.f41736c;
                    float f6 = fArr4[i4];
                    float f7 = fArr4[i4 + 1];
                    int i8 = i4 + 3;
                    float f8 = fArr4[i4 + 2];
                    i4 += 4;
                    interfaceC3299x.a(f6, f7, f8, fArr4[i8]);
                } else if (b4 != 8) {
                    boolean z4 = (b4 & 2) != 0;
                    boolean z5 = (b4 & 1) != 0;
                    float[] fArr5 = this.f41736c;
                    interfaceC3299x.d(fArr5[i4], fArr5[i4 + 1], fArr5[i4 + 2], z4, z5, fArr5[i4 + 3], fArr5[i4 + 4]);
                    i4 += 5;
                } else {
                    interfaceC3299x.close();
                }
            }
        }

        boolean i() {
            return this.f41735b == 0;
        }
    }

    /* renamed from: o0.g$x, reason: case insensitive filesystem */
    interface InterfaceC3299x {
        void a(float f4, float f5, float f6, float f7);

        void b(float f4, float f5);

        void c(float f4, float f5, float f6, float f7, float f8, float f9);

        void close();

        void d(float f4, float f5, float f6, boolean z4, boolean z5, float f7, float f8);

        void e(float f4, float f5);
    }

    /* renamed from: o0.g$y, reason: case insensitive filesystem */
    static class C3300y extends R implements InterfaceC3295t {

        /* renamed from: q, reason: collision with root package name */
        Boolean f41738q;

        /* renamed from: r, reason: collision with root package name */
        Boolean f41739r;

        /* renamed from: s, reason: collision with root package name */
        Matrix f41740s;

        /* renamed from: t, reason: collision with root package name */
        C3291p f41741t;

        /* renamed from: u, reason: collision with root package name */
        C3291p f41742u;

        /* renamed from: v, reason: collision with root package name */
        C3291p f41743v;

        /* renamed from: w, reason: collision with root package name */
        C3291p f41744w;

        /* renamed from: x, reason: collision with root package name */
        String f41745x;

        C3300y() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "pattern";
        }
    }

    /* renamed from: o0.g$z, reason: case insensitive filesystem */
    static class C3301z extends AbstractC3287l {

        /* renamed from: o, reason: collision with root package name */
        float[] f41746o;

        C3301z() {
        }

        @Override // o0.C3276g.N
        String m() {
            return "polyline";
        }
    }

    C3276g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    private C3278b e(float f4) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float f5;
        d0 d0Var5;
        F f6 = this.f41524a;
        C3291p c3291p = f6.f41613s;
        C3291p c3291p2 = f6.f41614t;
        if (c3291p == null || c3291p.i() || (d0Var = c3291p.f41713c) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C3278b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float b4 = c3291p.b(f4);
        if (c3291p2 == null) {
            C3278b c3278b = this.f41524a.f41645p;
            f5 = c3278b != null ? (c3278b.f41661d * b4) / c3278b.f41660c : b4;
        } else {
            if (c3291p2.i() || (d0Var5 = c3291p2.f41713c) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C3278b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f5 = c3291p2.b(f4);
        }
        return new C3278b(0.0f, 0.0f, b4, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L j(J j4, String str) {
        L j5;
        L l4 = (L) j4;
        if (str.equals(l4.f41628c)) {
            return l4;
        }
        for (Object obj : j4.getChildren()) {
            if (obj instanceof L) {
                L l5 = (L) obj;
                if (str.equals(l5.f41628c)) {
                    return l5;
                }
                if ((obj instanceof J) && (j5 = j((J) obj, str)) != null) {
                    return j5;
                }
            }
        }
        return null;
    }

    static AbstractC3303i k() {
        return null;
    }

    public static C3276g l(InputStream inputStream) {
        return new C3305k().z(inputStream, f41523g);
    }

    void a(C3271b.r rVar) {
        this.f41528e.b(rVar);
    }

    void b() {
        this.f41528e.e(C3271b.u.RenderOptions);
    }

    List d() {
        return this.f41528e.c();
    }

    public float f() {
        if (this.f41524a != null) {
            return e(this.f41527d).f41661d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f4 = this.f41524a;
        if (f4 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C3278b c3278b = f4.f41645p;
        if (c3278b == null) {
            return null;
        }
        return c3278b.d();
    }

    public float h() {
        if (this.f41524a != null) {
            return e(this.f41527d).f41660c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.f41524a.f41628c)) {
            return this.f41524a;
        }
        if (this.f41529f.containsKey(str)) {
            return (L) this.f41529f.get(str);
        }
        L j4 = j(this.f41524a, str);
        this.f41529f.put(str, j4);
        return j4;
    }

    F m() {
        return this.f41524a;
    }

    boolean n() {
        return !this.f41528e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i4, int i5, C3275f c3275f) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i4, i5);
        if (c3275f == null || c3275f.f41522f == null) {
            c3275f = c3275f == null ? new C3275f() : new C3275f(c3275f);
            c3275f.g(0.0f, 0.0f, i4, i5);
        }
        new C3302h(beginRecording, this.f41527d).G0(this, c3275f);
        picture.endRecording();
        return picture;
    }

    public Picture q(C3275f c3275f) {
        C3291p c3291p;
        C3278b c3278b = (c3275f == null || !c3275f.e()) ? this.f41524a.f41645p : c3275f.f41520d;
        if (c3275f != null && c3275f.f()) {
            return p((int) Math.ceil(c3275f.f41522f.b()), (int) Math.ceil(c3275f.f41522f.c()), c3275f);
        }
        F f4 = this.f41524a;
        C3291p c3291p2 = f4.f41613s;
        if (c3291p2 != null) {
            d0 d0Var = c3291p2.f41713c;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c3291p = f4.f41614t) != null && c3291p.f41713c != d0Var2) {
                return p((int) Math.ceil(c3291p2.b(this.f41527d)), (int) Math.ceil(this.f41524a.f41614t.b(this.f41527d)), c3275f);
            }
        }
        if (c3291p2 != null && c3278b != null) {
            return p((int) Math.ceil(c3291p2.b(this.f41527d)), (int) Math.ceil((c3278b.f41661d * r1) / c3278b.f41660c), c3275f);
        }
        C3291p c3291p3 = f4.f41614t;
        if (c3291p3 == null || c3278b == null) {
            return p(UserVerificationMethods.USER_VERIFY_NONE, UserVerificationMethods.USER_VERIFY_NONE, c3275f);
        }
        return p((int) Math.ceil((c3278b.f41660c * r1) / c3278b.f41661d), (int) Math.ceil(c3291p3.b(this.f41527d)), c3275f);
    }

    N r(String str) {
        if (str == null) {
            return null;
        }
        String c4 = c(str);
        if (c4.length() <= 1 || !c4.startsWith("#")) {
            return null;
        }
        return i(c4.substring(1));
    }

    void s(String str) {
        this.f41526c = str;
    }

    public void t(float f4, float f5, float f6, float f7) {
        F f8 = this.f41524a;
        if (f8 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        f8.f41645p = new C3278b(f4, f5, f6, f7);
    }

    void u(F f4) {
        this.f41524a = f4;
    }

    void v(String str) {
        this.f41525b = str;
    }

    /* renamed from: o0.g$p, reason: case insensitive filesystem */
    static class C3291p implements Cloneable {

        /* renamed from: b, reason: collision with root package name */
        float f41712b;

        /* renamed from: c, reason: collision with root package name */
        d0 f41713c;

        C3291p(float f4, d0 d0Var) {
            this.f41712b = f4;
            this.f41713c = d0Var;
        }

        float a() {
            return this.f41712b;
        }

        float b(float f4) {
            int i4 = C3277a.f41653a[this.f41713c.ordinal()];
            if (i4 == 1) {
                return this.f41712b;
            }
            switch (i4) {
                case 4:
                    return this.f41712b * f4;
                case 5:
                    return (this.f41712b * f4) / 2.54f;
                case 6:
                    return (this.f41712b * f4) / 25.4f;
                case 7:
                    return (this.f41712b * f4) / 72.0f;
                case 8:
                    return (this.f41712b * f4) / 6.0f;
                default:
                    return this.f41712b;
            }
        }

        float c(C3302h c3302h) {
            if (this.f41713c != d0.percent) {
                return e(c3302h);
            }
            C3278b S3 = c3302h.S();
            if (S3 == null) {
                return this.f41712b;
            }
            float f4 = S3.f41660c;
            if (f4 == S3.f41661d) {
                return (this.f41712b * f4) / 100.0f;
            }
            return (this.f41712b * ((float) (Math.sqrt((f4 * f4) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        float d(C3302h c3302h, float f4) {
            return this.f41713c == d0.percent ? (this.f41712b * f4) / 100.0f : e(c3302h);
        }

        float e(C3302h c3302h) {
            switch (C3277a.f41653a[this.f41713c.ordinal()]) {
                case 9:
                    C3278b S3 = c3302h.S();
                    if (S3 != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.f41712b;
        }

        float f(C3302h c3302h) {
            if (this.f41713c != d0.percent) {
                return e(c3302h);
            }
            C3278b S3 = c3302h.S();
            return S3 == null ? this.f41712b : (this.f41712b * S3.f41661d) / 100.0f;
        }

        boolean h() {
            return this.f41712b < 0.0f;
        }

        boolean i() {
            return this.f41712b == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.f41712b) + this.f41713c;
        }

        C3291p(float f4) {
            this.f41712b = f4;
            this.f41713c = d0.px;
        }
    }

    /* renamed from: o0.g$b, reason: case insensitive filesystem */
    static class C3278b {

        /* renamed from: a, reason: collision with root package name */
        float f41658a;

        /* renamed from: b, reason: collision with root package name */
        float f41659b;

        /* renamed from: c, reason: collision with root package name */
        float f41660c;

        /* renamed from: d, reason: collision with root package name */
        float f41661d;

        C3278b(float f4, float f5, float f6, float f7) {
            this.f41658a = f4;
            this.f41659b = f5;
            this.f41660c = f6;
            this.f41661d = f7;
        }

        static C3278b a(float f4, float f5, float f6, float f7) {
            return new C3278b(f4, f5, f6 - f4, f7 - f5);
        }

        float b() {
            return this.f41658a + this.f41660c;
        }

        float c() {
            return this.f41659b + this.f41661d;
        }

        RectF d() {
            return new RectF(this.f41658a, this.f41659b, b(), c());
        }

        void e(C3278b c3278b) {
            float f4 = c3278b.f41658a;
            if (f4 < this.f41658a) {
                this.f41658a = f4;
            }
            float f5 = c3278b.f41659b;
            if (f5 < this.f41659b) {
                this.f41659b = f5;
            }
            if (c3278b.b() > b()) {
                this.f41660c = c3278b.b() - this.f41658a;
            }
            if (c3278b.c() > c()) {
                this.f41661d = c3278b.c() - this.f41659b;
            }
        }

        public String toString() {
            return b9.i.f15550d + this.f41658a + " " + this.f41659b + " " + this.f41660c + " " + this.f41661d + b9.i.f15552e;
        }

        C3278b(C3278b c3278b) {
            this.f41658a = c3278b.f41658a;
            this.f41659b = c3278b.f41659b;
            this.f41660c = c3278b.f41660c;
            this.f41661d = c3278b.f41661d;
        }
    }

    /* renamed from: o0.g$C */
    static class C extends L implements J {
        C() {
        }

        @Override // o0.C3276g.J
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // o0.C3276g.N
        String m() {
            return "solidColor";
        }

        @Override // o0.C3276g.J
        public void h(N n4) {
        }
    }

    /* renamed from: o0.g$D */
    static class D extends L implements J {

        /* renamed from: h, reason: collision with root package name */
        Float f41536h;

        D() {
        }

        @Override // o0.C3276g.J
        public List getChildren() {
            return Collections.EMPTY_LIST;
        }

        @Override // o0.C3276g.N
        String m() {
            return "stop";
        }

        @Override // o0.C3276g.J
        public void h(N n4) {
        }
    }
}
