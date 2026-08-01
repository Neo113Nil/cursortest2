package v1;

import android.view.View;
import androidx.emoji2.text.q;
import java.util.Iterator;
import java.util.List;
import n0.b1;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends b1.b {

    /* renamed from: b, reason: collision with root package name */
    public final View f3727b;

    /* renamed from: c, reason: collision with root package name */
    public int f3728c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3729e = new int[2];

    public b(View view) {
        this.f3727b = view;
    }

    @Override // b1.b
    public final void a(b1 b1Var) {
        this.f3727b.setTranslationY(0.0f);
    }

    @Override // b1.b
    public final void b(b1 b1Var) {
        View view = this.f3727b;
        int[] iArr = this.f3729e;
        view.getLocationOnScreen(iArr);
        this.f3728c = iArr[1];
    }

    @Override // b1.b
    public final v1 c(v1 v1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((b1) it.next()).f2759a.d() & 8) != 0) {
                this.f3727b.setTranslationY(r1.a.c(this.d, 0, r0.f2759a.c()));
                break;
            }
        }
        return v1Var;
    }

    @Override // b1.b
    public final q d(b1 b1Var, q qVar) {
        View view = this.f3727b;
        int[] iArr = this.f3729e;
        view.getLocationOnScreen(iArr);
        int i = this.f3728c - iArr[1];
        this.d = i;
        view.setTranslationY(i);
        return qVar;
    }
}
