package j2;

import android.view.View;
import androidx.fragment.app.w0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;
import k0.i1;
import k0.m1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements a2.b, k0.m {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2399f;

    public /* synthetic */ z(Object obj) {
        this.f2399f = obj;
    }

    @Override // a2.b
    public void a() {
        CheckableImageButton checkableImageButton = ((a0) this.f2399f).f2288i;
        k3.d.k0(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // k0.m
    public m1 d(View view, m1 m1Var) {
        n0.d dVar = (n0.d) this.f2399f;
        ArrayList arrayList = dVar.f2943b;
        i1 i1Var = m1Var.f2760a;
        c0.c b2 = c0.c.b(i1Var.f(519), i1Var.f(64));
        c0.c b4 = c0.c.b(i1Var.g(519), i1Var.g(64));
        if (!b2.equals(dVar.c) || !b4.equals(dVar.f2944d)) {
            dVar.c = b2;
            dVar.f2944d = b4;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((n0.a) arrayList.get(size)).f2937a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw w0.d(arrayList2, size2);
                }
            }
        }
        return m1Var;
    }
}
