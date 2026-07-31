package u;

import android.widget.EdgeEffect;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements p6.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0 f7098e;

    public /* synthetic */ u(x0 x0Var, int i) {
        this.f7097d = i;
        this.f7098e = x0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? t.m.b(r1) : 0.0f) == 0.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? t.m.b(r1) : 0.0f) == 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? t.m.b(r1) : 0.0f) == 0.0f) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 31 ? t.m.b(r0) : 0.0f) == 0.0f) goto L43;
     */
    @Override // p6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        boolean z3;
        boolean z7;
        switch (this.f7097d) {
            case 0:
                c7.c cVar = this.f7098e.f7124x;
                if (cVar != null) {
                    cVar.t(k.f7033a);
                }
                return c6.m.f1757a;
            case 1:
                e1 e1Var = this.f7098e.H;
                if (!e1Var.f6962a.b()) {
                    t.j jVar = e1Var.f6963b;
                    if (jVar != null) {
                        t.a0 a0Var = jVar.f6788c;
                        EdgeEffect edgeEffect = a0Var.f6740d;
                        if (edgeEffect != null) {
                            break;
                        }
                        EdgeEffect edgeEffect2 = a0Var.f6741e;
                        if (edgeEffect2 != null) {
                            break;
                        }
                        EdgeEffect edgeEffect3 = a0Var.f6742f;
                        if (edgeEffect3 != null) {
                            break;
                        }
                        EdgeEffect edgeEffect4 = a0Var.f6743g;
                        if (edgeEffect4 != null) {
                            break;
                        }
                    }
                    z3 = false;
                    z7 = !z3;
                    break;
                }
                z3 = true;
                z7 = !z3;
            default:
                z7 = this.f7098e.f8718q;
                break;
        }
        return Boolean.valueOf(z7);
    }
}
