package m0;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5100f;

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.f5098d = i;
        this.f5099e = obj;
        this.f5100f = obj2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        long j7;
        switch (this.f5098d) {
            case 0:
                a0.f1 f1Var = (a0.f1) this.f5099e;
                Object obj2 = f1Var.f79b;
                a7.h hVar = (a7.h) this.f5100f;
                synchronized (obj2) {
                    ((ArrayList) f1Var.f80c).remove(hVar);
                }
                return c6.m.f1757a;
            default:
                w0.k kVar = (w0.k) obj;
                synchronized (w0.m.f7537c) {
                    j7 = w0.m.f7539e;
                    w0.m.f7539e = 1 + j7;
                }
                return new w0.b(j7, kVar, (p6.c) this.f5099e, (p6.c) this.f5100f);
        }
    }
}
