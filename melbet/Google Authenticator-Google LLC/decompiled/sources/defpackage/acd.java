package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acd {
    public Object a;
    public final /* synthetic */ Object b;

    public acd(Object obj) {
        this.b = obj;
    }

    public final void a(int i, int i2, int i3, int i4) {
        pz pzVar = (pz) this.b;
        pzVar.d.set(i, i2, i3, i4);
        Rect rect = pzVar.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final boolean b() {
        return ((pz) this.b).b;
    }

    public final boolean c() {
        return ((pz) this.b).a;
    }
}
