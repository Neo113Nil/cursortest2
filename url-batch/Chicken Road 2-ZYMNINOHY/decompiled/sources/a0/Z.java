package a0;

import android.util.Pair;
import q0.C1353B;
import q0.C1377t;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f4033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f4034c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1377t f4035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.g f4036e;

    public /* synthetic */ Z(c0 c0Var, Pair pair, C1377t c1377t, n0.g gVar, int i4) {
        this.f4032a = i4;
        this.f4033b = c0Var;
        this.f4034c = pair;
        this.f4035d = c1377t;
        this.f4036e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4032a) {
            case 0:
                b0.d dVar = this.f4033b.f4079b.f4117h;
                Pair pair = this.f4034c;
                dVar.d(((Integer) pair.first).intValue(), (C1353B) pair.second, this.f4035d, this.f4036e);
                break;
            default:
                b0.d dVar2 = this.f4033b.f4079b.f4117h;
                Pair pair2 = this.f4034c;
                dVar2.f(((Integer) pair2.first).intValue(), (C1353B) pair2.second, this.f4035d, this.f4036e);
                break;
        }
    }
}
