package a0;

import android.util.Pair;
import q0.C1353B;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f4029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f4030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.g f4031d;

    public /* synthetic */ Y(c0 c0Var, Pair pair, n0.g gVar, int i4) {
        this.f4028a = i4;
        this.f4029b = c0Var;
        this.f4030c = pair;
        this.f4031d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4028a) {
            case 0:
                b0.d dVar = this.f4029b.f4079b.f4117h;
                Pair pair = this.f4030c;
                int intValue = ((Integer) pair.first).intValue();
                C1353B c1353b = (C1353B) pair.second;
                c1353b.getClass();
                dVar.a(intValue, c1353b, this.f4031d);
                break;
            default:
                b0.d dVar2 = this.f4029b.f4079b.f4117h;
                Pair pair2 = this.f4030c;
                dVar2.b(((Integer) pair2.first).intValue(), (C1353B) pair2.second, this.f4031d);
                break;
        }
    }
}
