package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class pl implements v60 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public pl(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.v60
    public final void a(y60 y60Var) {
        y60Var.y(this);
        y60Var.a(this);
    }

    @Override // defpackage.v60
    public final void d(y60 y60Var) {
        y60Var.y(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.v60
    public final void f(y60 y60Var) {
    }

    @Override // defpackage.v60
    public final void b() {
    }

    @Override // defpackage.v60
    public final void c() {
    }
}
