package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tw implements ym0 {
    public final /* synthetic */ lq m;
    public final /* synthetic */ int n;

    public tw(lq lqVar, int i) {
        this.m = lqVar;
        this.n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (defpackage.th2.n(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5.m.a(r0, r7) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ym0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, o30 o30Var) {
        sw swVar;
        int i;
        if (o30Var instanceof sw) {
            swVar = (sw) o30Var;
            int i2 = swVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                swVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = swVar.m;
                b50 b50Var = b50.m;
                i = swVar.o;
                if (i != 0) {
                    ca2.b(obj2);
                    IndexedValue indexedValue = new IndexedValue(this.n, obj);
                    swVar.o = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj2);
                }
                swVar.o = 2;
            }
        }
        swVar = new sw(this, o30Var);
        Object obj22 = swVar.m;
        b50 b50Var2 = b50.m;
        i = swVar.o;
        if (i != 0) {
        }
        swVar.o = 2;
    }
}
