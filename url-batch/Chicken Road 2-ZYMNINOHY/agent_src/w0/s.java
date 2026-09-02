package w0;

import T.C0096n;
import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import j1.ExecutorC1174c;
import java.util.concurrent.CopyOnWriteArraySet;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: r, reason: collision with root package name */
    public static final ExecutorC1174c f15880r = new ExecutorC1174c(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f15881a;

    /* renamed from: b, reason: collision with root package name */
    public final q f15882b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f15883c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15884d;

    /* renamed from: e, reason: collision with root package name */
    public final C1496c f15885e;

    /* renamed from: f, reason: collision with root package name */
    public final W.D f15886f;

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f15887g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15888h;

    /* renamed from: i, reason: collision with root package name */
    public final v f15889i;

    /* renamed from: j, reason: collision with root package name */
    public S0.g f15890j = new S0.g();

    /* renamed from: k, reason: collision with root package name */
    public W.F f15891k;

    /* renamed from: l, reason: collision with root package name */
    public Pair f15892l;

    /* renamed from: m, reason: collision with root package name */
    public int f15893m;
    public int n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15894p;

    /* renamed from: q, reason: collision with root package name */
    public int f15895q;

    public s(n nVar) {
        this.f15881a = nVar.f15864a;
        q qVar = nVar.f15866c;
        qVar.getClass();
        this.f15882b = qVar;
        this.f15883c = new SparseArray();
        v2.G g4 = I.f15571b;
        a0 a0Var = a0.f15605e;
        this.f15884d = nVar.f15867d;
        W.D d4 = nVar.f15868e;
        this.f15886f = d4;
        long j4 = nVar.f15870g;
        this.f15888h = j4 != -9223372036854775807L ? -j4 : -9223372036854775807L;
        v vVar = nVar.f15871h;
        this.f15889i = vVar;
        this.f15885e = new C1496c(nVar.f15865b, vVar, d4);
        this.f15887g = new CopyOnWriteArraySet();
        new C0096n().a();
        this.o = -9223372036854775807L;
        this.f15895q = -1;
        this.n = 0;
    }
}
