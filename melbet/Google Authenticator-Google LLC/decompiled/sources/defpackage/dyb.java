package defpackage;

import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dyb implements abi {
    private boolean a;
    private final hrz b;

    public dyb(hrz hrzVar) {
        this.b = hrzVar;
    }

    @Override // defpackage.abi
    public final void a(NestedScrollView nestedScrollView, int i) {
        nestedScrollView.getClass();
        boolean z = i > 0;
        if (this.a != z) {
            this.a = z;
            this.b.f(new jfz(z));
        }
    }
}
