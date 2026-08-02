package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fpe implements xq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fpe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xq
    public final zz a(View view, zz zzVar) {
        if (this.b == 0) {
            int a = zzVar.a();
            fpk fpkVar = (fpk) this.a;
            fpkVar.m = a;
            fpkVar.n = zzVar.b();
            fpkVar.o = zzVar.c();
            fpkVar.i();
            return zzVar;
        }
        fjp fjpVar = (fjp) this.a;
        if (fjpVar.b == null) {
            fjpVar.b = new Rect();
        }
        fjpVar.b.set(zzVar.b(), zzVar.d(), zzVar.c(), zzVar.a());
        fjpVar.a(zzVar);
        boolean z = true;
        if (!zzVar.b.d().equals(vb.a) && fjpVar.a != null) {
            z = false;
        }
        fjpVar.setWillNotDraw(z);
        fjpVar.postInvalidateOnAnimation();
        return zzVar.n();
    }
}
