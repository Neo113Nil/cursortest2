package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gux {
    public gtt a;
    public boolean b;
    final /* synthetic */ gva c;

    public gux(gva gvaVar) {
        this.c = gvaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(bd bdVar, boolean z) {
        bdVar.getClass();
        if (z && this.a == null && !gta.u()) {
            boolean v = gta.v();
            this.b = v;
            if (!v) {
                this.a = this.c.f("FragmentTransaction Popped", 257);
            }
        }
        if (Build.VERSION.SDK_INT >= 34 && z && (bdVar instanceof guo)) {
            ((guo) bdVar).aK(gvz.b());
        }
    }
}
