package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqz extends kqy implements ksn, krx {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqz(View view, kqj kqjVar) {
        super(kqjVar);
        this.b = view;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kqz) c((ktw) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r1.b(r2.a(), r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        if (r1.a(r5, r4) != r0) goto L9;
     */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ktw ktwVar;
        kqp kqpVar = kqp.a;
        int i = this.a;
        if (i == 0) {
            ixc.Y(obj);
            ktwVar = (ktw) this.c;
            View view = this.b;
            this.c = ktwVar;
            this.a = 1;
        } else {
            if (i != 1) {
                ixc.Y(obj);
                return kow.a;
            }
            ktwVar = (ktw) this.c;
            ixc.Y(obj);
        }
        View view2 = this.b;
        if (view2 instanceof ViewGroup) {
            yt ytVar = new yt((ViewGroup) view2, 0);
            this.c = null;
            this.a = 2;
        }
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        kqz kqzVar = new kqz(this.b, kqjVar);
        kqzVar.c = obj;
        return kqzVar;
    }

    @Override // defpackage.ksn
    public final int i() {
        return 2;
    }

    @Override // defpackage.kqu
    public final String toString() {
        if (this.k != null) {
            return super.toString();
        }
        String a = ksx.a(this);
        a.getClass();
        return a;
    }
}
