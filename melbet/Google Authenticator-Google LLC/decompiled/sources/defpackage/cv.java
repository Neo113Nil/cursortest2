package defpackage;

import android.content.Context;
import android.support.v7.widget.Toolbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cv implements ct {
    final Toolbar a;
    final CharSequence b;

    public cv(Toolbar toolbar) {
        this.a = toolbar;
        toolbar.e();
        this.b = toolbar.h();
    }

    @Override // defpackage.ct
    public final Context a() {
        return this.a.getContext();
    }

    @Override // defpackage.ct
    public final void b(int i) {
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.p(this.b);
        } else {
            toolbar.o(i);
        }
    }

    @Override // defpackage.ct
    public final void c() {
    }
}
