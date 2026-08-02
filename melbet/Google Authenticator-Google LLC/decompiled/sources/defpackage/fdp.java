package defpackage;

import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fdp {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public fdp() {
        this.c = gyf.a;
        int i = hel.d;
        this.a = new heg(4);
        this.b = new heg(4);
    }

    public final void a(String str) {
        ((heg) this.a).h(new bst(str));
    }

    public final iwq b() {
        if (this.d == null) {
            this.d = new bsh();
        }
        Object obj = this.c;
        return new iwq((gzp) obj, ((heg) this.a).g(), ((heg) this.b).g(), (bsh) this.d);
    }

    public fdp(FrameLayout frameLayout, hac hacVar, hac hacVar2) {
        this.c = frameLayout;
        this.b = hacVar;
        this.a = hacVar2;
    }
}
