package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gw {
    public final hw a;
    public boolean b;
    public iv c;
    public final qk d;
    public boolean e;

    public gw(qk qkVar, hw hwVar) {
        qkVar.getClass();
        boolean z = qkVar.b;
        this.a = hwVar;
        this.b = z;
        this.d = qkVar;
        this.e = true;
    }

    public final void a() {
        iv ivVar = this.c;
        if (ivVar == null || !ivVar.c.remove(this)) {
            return;
        }
        lv lvVar = ivVar.b;
        lvVar.getClass();
        if (this == lvVar.f) {
            if (lvVar.g == -1) {
                this.d.getClass();
            }
            lvVar.f = null;
            lvVar.g = 0;
            lvVar.h = null;
        }
        lvVar.d.remove(this);
        lvVar.e.remove(this);
        this.c = null;
        lvVar.b();
    }

    public final void b(boolean z) {
        lv lvVar;
        this.e = z;
        boolean z2 = z && this.d.b;
        if (this.b == z2) {
            return;
        }
        this.b = z2;
        iv ivVar = this.c;
        if (ivVar == null || (lvVar = ivVar.b) == null) {
            return;
        }
        lvVar.b();
    }
}
