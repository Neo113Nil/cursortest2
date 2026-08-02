package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aos extends apf {
    boolean a = false;
    final ViewGroup b;

    public aos(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.apf, defpackage.apb
    public final void a(ape apeVar) {
        apn.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.apf, defpackage.apb
    public final void b(ape apeVar) {
        if (!this.a) {
            apn.a(this.b, false);
        }
        apeVar.y(this);
    }

    @Override // defpackage.apf, defpackage.apb
    public final void c() {
        apn.a(this.b, false);
    }

    @Override // defpackage.apf, defpackage.apb
    public final void d() {
        apn.a(this.b, true);
    }
}
