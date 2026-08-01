package q1;

import a2.s;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import k0.m1;
import k0.o0;
import k0.w0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public final View f3132b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3133d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3134e = new int[2];

    public b(View view) {
        this.f3132b = view;
    }

    @Override // k0.o0
    public final void a(w0 w0Var) {
        this.f3132b.setTranslationY(0.0f);
    }

    @Override // k0.o0
    public final void b(w0 w0Var) {
        View view = this.f3132b;
        int[] iArr = this.f3134e;
        view.getLocationOnScreen(iArr);
        this.c = iArr[1];
    }

    @Override // k0.o0
    public final m1 c(m1 m1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((w0) it.next()).f2788a.d() & 8) != 0) {
                this.f3132b.setTranslationY(m1.a.c(this.f3133d, 0, r0.f2788a.c()));
                break;
            }
        }
        return m1Var;
    }

    @Override // k0.o0
    public final s d(w0 w0Var, s sVar) {
        View view = this.f3132b;
        int[] iArr = this.f3134e;
        view.getLocationOnScreen(iArr);
        int i4 = this.c - iArr[1];
        this.f3133d = i4;
        view.setTranslationY(i4);
        return sVar;
    }
}
