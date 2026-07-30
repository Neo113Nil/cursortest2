package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ua implements a50 {
    public final View m;
    public final sv2 n;
    public final a50 o;
    public final AtomicReference p = new AtomicReference(null);

    public ua(View view, sv2 sv2Var, a50 a50Var) {
        this.m = view;
        this.n = sv2Var;
        this.o = a50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tc1 tc1Var, r30 r30Var) {
        ta taVar;
        int i;
        if (r30Var instanceof ta) {
            taVar = (ta) r30Var;
            int i2 = taVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taVar.o = i2 - Integer.MIN_VALUE;
                Object obj = taVar.m;
                b50 b50Var = b50.m;
                i = taVar.o;
                if (i != 0) {
                    ca2.b(obj);
                    p8 p8Var = new p8(2, tc1Var, this);
                    o30 o30Var = null;
                    v vVar = new v(5, o30Var, this);
                    taVar.o = 1;
                    if (j8.t(new j5(p8Var, this.p, vVar, o30Var, 10), taVar) == b50Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    ca2.b(obj);
                }
                throw new k81();
            }
        }
        taVar = new ta(this, r30Var);
        Object obj2 = taVar.m;
        b50 b50Var2 = b50.m;
        i = taVar.o;
        if (i != 0) {
        }
        throw new k81();
    }

    @Override // defpackage.a50
    public final CoroutineContext n() {
        return this.o.n();
    }
}
