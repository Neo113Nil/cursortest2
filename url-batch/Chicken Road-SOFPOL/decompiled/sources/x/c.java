package x;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8203a;

    public /* synthetic */ c(int i) {
        this.f8203a = i;
    }

    public static final a b(String str, int i) {
        WeakHashMap weakHashMap = s0.f8273u;
        return new a(str, i);
    }

    public static final q0 d(String str, int i) {
        WeakHashMap weakHashMap = s0.f8273u;
        return new q0(new b0(0, 0, 0, 0), str);
    }

    public static s0 e(m0.s sVar) {
        s0 s0Var;
        View view = (View) sVar.j(x1.k0.f8491e);
        WeakHashMap weakHashMap = s0.f8273u;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new s0(view);
                    weakHashMap.put(view, obj);
                }
                s0Var = (s0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean h8 = sVar.h(s0Var) | sVar.h(view);
        Object K = sVar.K();
        if (h8 || K == m0.n.f5019a) {
            K = new a0.v0(22, s0Var, view);
            sVar.f0(K);
        }
        m0.b.d(s0Var, (p6.c) K, sVar);
        return s0Var;
    }

    @Override // x.d
    public void c(u1.g0 g0Var, int i, int[] iArr, r2.l lVar, int[] iArr2) {
        switch (this.f8203a) {
            case 0:
                if (lVar != r2.l.f6529d) {
                    i.b(iArr, iArr2, true);
                    break;
                } else {
                    i.c(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (lVar != r2.l.f6529d) {
                    i.c(i, iArr, iArr2, true);
                    break;
                } else {
                    i.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f8203a) {
            case 0:
                return "Arrangement#End";
            case 1:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
