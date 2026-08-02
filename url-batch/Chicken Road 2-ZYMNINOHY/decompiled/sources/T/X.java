package T;

import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    public int f2713a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public int f2714b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f2715c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f2716d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f2717e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f2718f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2719g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2720h = true;

    /* renamed from: i, reason: collision with root package name */
    public v2.I f2721i;

    /* renamed from: j, reason: collision with root package name */
    public v2.I f2722j;

    /* renamed from: k, reason: collision with root package name */
    public v2.I f2723k;

    /* renamed from: l, reason: collision with root package name */
    public v2.I f2724l;

    /* renamed from: m, reason: collision with root package name */
    public v2.I f2725m;
    public int n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public v2.I f2726p;

    /* renamed from: q, reason: collision with root package name */
    public W f2727q;

    /* renamed from: r, reason: collision with root package name */
    public v2.I f2728r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2729s;

    /* renamed from: t, reason: collision with root package name */
    public v2.I f2730t;

    /* renamed from: u, reason: collision with root package name */
    public HashMap f2731u;
    public HashSet v;

    public X() {
        v2.G g4 = v2.I.f15571b;
        v2.a0 a0Var = v2.a0.f15605e;
        this.f2721i = a0Var;
        this.f2722j = a0Var;
        this.f2723k = a0Var;
        this.f2724l = a0Var;
        this.f2725m = a0Var;
        this.n = Integer.MAX_VALUE;
        this.o = Integer.MAX_VALUE;
        this.f2726p = a0Var;
        this.f2727q = W.f2712a;
        this.f2728r = a0Var;
        this.f2729s = true;
        this.f2730t = a0Var;
        this.f2731u = new HashMap();
        this.v = new HashSet();
    }

    public final void a(Y y4) {
        this.f2713a = y4.f2732a;
        this.f2714b = y4.f2733b;
        this.f2715c = y4.f2734c;
        this.f2716d = y4.f2735d;
        this.f2717e = y4.f2736e;
        this.f2718f = y4.f2737f;
        this.f2719g = y4.f2738g;
        this.f2720h = y4.f2739h;
        this.f2722j = y4.f2741j;
        this.f2721i = y4.f2740i;
        this.f2723k = y4.f2742k;
        this.f2724l = y4.f2743l;
        this.f2725m = y4.f2744m;
        this.n = y4.n;
        this.o = y4.o;
        this.f2726p = y4.f2745p;
        this.f2727q = y4.f2746q;
        this.f2728r = y4.f2747r;
        this.f2729s = y4.f2749t;
        this.f2730t = y4.f2748s;
        this.v = new HashSet(y4.v);
        this.f2731u = new HashMap(y4.f2750u);
    }
}
