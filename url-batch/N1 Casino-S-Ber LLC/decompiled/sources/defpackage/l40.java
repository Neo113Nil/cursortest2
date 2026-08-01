package defpackage;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class l40 implements xl, aa, wv {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ l40(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.xl
    public Object a(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 1:
                return obj == ((k) obj2) ? "(this Collection)" : String.valueOf(obj);
            default:
                obj.getClass();
                return ((u1) obj2).a();
        }
    }

    @Override // defpackage.aa
    public void b() {
        CheckableImageButton checkableImageButton = ((u30) this.g).i;
        jw.e0(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.wv
    public rb0 m(View view, rb0 rb0Var) {
        a50 a50Var = (a50) this.g;
        ArrayList arrayList = a50Var.b;
        ob0 ob0Var = rb0Var.a;
        to b = to.b(ob0Var.h(519), ob0Var.h(64));
        to b2 = to.b(ob0Var.i(519), ob0Var.i(64));
        if (!b.equals(a50Var.c) || !b2.equals(a50Var.d)) {
            a50Var.c = b;
            a50Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                mx mxVar = (mx) arrayList.get(size);
                mxVar.c = b;
                mxVar.d = b2;
                mxVar.c();
            }
        }
        return rb0Var;
    }
}
