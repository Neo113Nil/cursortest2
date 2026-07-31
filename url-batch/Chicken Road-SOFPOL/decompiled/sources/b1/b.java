package b1;

import a0.g1;
import android.content.ClipData;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d4.l;
import f1.a0;
import f1.q;
import j0.m0;
import j0.v1;
import j0.w1;
import j0.x1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i;
import k.j;
import k.n;
import k.s;
import l.g0;
import l.k1;
import m0.h1;
import m0.t2;
import m0.v;
import n2.k;
import q.q0;
import q.u0;
import q1.m;
import q3.i1;
import q3.k0;
import q3.l1;
import q3.p;
import x.v0;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b implements y3.f, p, r3.p, k1, n, g0, l5.b, q3.c, q3.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1049d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1050e;

    public /* synthetic */ b(int i, Object obj) {
        this.f1049d = i;
        this.f1050e = obj;
    }

    @Override // k.n
    public void a(i iVar, boolean z3) {
        if (iVar instanceof s) {
            ((s) iVar).f4144v.j().c(false);
        }
        n nVar = ((l.i) this.f1050e).f4259h;
        if (nVar != null) {
            nVar.a(iVar, z3);
        }
    }

    @Override // l.k1
    public void b(i iVar, j jVar) {
        k.f fVar = (k.f) this.f1050e;
        Handler handler = fVar.i;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f4047k;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((k.e) arrayList.get(i)).f4040b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i8 = i + 1;
        handler.postAtTime(new k.d(this, i8 < arrayList.size() ? (k.e) arrayList.get(i8) : null, jVar, iVar), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // q3.c
    public q3.g build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f1050e).build();
        return new q3.g(new b(build));
    }

    @Override // q3.f
    public ClipData c() {
        ClipData clip;
        clip = ((ContentInfo) this.f1050e).getClip();
        return clip;
    }

    @Override // r3.p
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f1050e;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z3 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f1836d;
        int width = (!(i == 0 && z3) && (i != 1 || z3)) ? view.getWidth() : -view.getWidth();
        Field field = k0.f6120a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // l.k1
    public void e(i iVar, MenuItem menuItem) {
        ((k.f) this.f1050e).i.removeCallbacksAndMessages(iVar);
    }

    @Override // k.n
    public boolean g(i iVar) {
        l.i iVar2 = (l.i) this.f1050e;
        if (iVar == iVar2.f4257f) {
            return false;
        }
        ((s) iVar).f4145w.getClass();
        iVar2.getClass();
        n nVar = iVar2.f4259h;
        if (nVar != null) {
            return nVar.g(iVar);
        }
        return false;
    }

    @Override // y3.f
    public Object h(p6.e eVar, i6.i iVar) {
        return ((y3.f) this.f1050e).h(new b4.b(eVar, null, 0), iVar);
    }

    @Override // q3.f
    public int i() {
        int flags;
        flags = ((ContentInfo) this.f1050e).getFlags();
        return flags;
    }

    @Override // q3.f
    public ContentInfo j() {
        return (ContentInfo) this.f1050e;
    }

    @Override // q3.p
    public l1 k(View view, l1 l1Var) {
        i1 i1Var = l1Var.f6127a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f1050e;
        if (!Objects.equals(coordinatorLayout.f601q, l1Var)) {
            coordinatorLayout.f601q = l1Var;
            boolean z3 = l1Var.a() > 0;
            coordinatorLayout.f602r = z3;
            coordinatorLayout.setWillNotDraw(!z3 && coordinatorLayout.getBackground() == null);
            if (!i1Var.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    Field field = k0.f6120a;
                    if (childAt.getFitsSystemWindows() && ((d3.d) childAt.getLayoutParams()).f2226a != null && i1Var.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return l1Var;
    }

    @Override // q3.c
    public void m(Uri uri) {
        ((ContentInfo.Builder) this.f1050e).setLinkUri(uri);
    }

    @Override // q3.f
    public int n() {
        int source;
        source = ((ContentInfo) this.f1050e).getSource();
        return source;
    }

    @Override // y3.f
    public d7.f p() {
        return ((y3.f) this.f1050e).p();
    }

    @Override // q3.c
    public void q(int i) {
        ((ContentInfo.Builder) this.f1050e).setFlags(i);
    }

    public void r() {
        ((v) this.f1050e).getClass();
    }

    public t2 s() {
        l a8 = l.a();
        if (a8.b() == 1) {
            return new k(true);
        }
        h1 q4 = m0.b.q(Boolean.FALSE);
        a8.g(new n2.g(q4, this));
        return q4;
    }

    @Override // q3.c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f1050e).setExtras(bundle);
    }

    public void t(float f6, float f8, float f9, float f10) {
        g1 g1Var = (g1) this.f1050e;
        q m7 = g1Var.m();
        float intBitsToFloat = Float.intBitsToFloat((int) (g1Var.u() >> 32)) - (f9 + f6);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (g1Var.u() & 4294967295L)) - (f10 + f8)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) >= 0.0f)) {
            a0.a("Width and height must be greater than or equal to zero");
        }
        g1Var.M(floatToRawIntBits);
        m7.d(f6, f8);
    }

    public String toString() {
        switch (this.f1049d) {
            case 29:
                return "ContentInfoCompat{" + ((ContentInfo) this.f1050e) + "}";
            default:
                return super.toString();
        }
    }

    public long u() {
        switch (this.f1049d) {
            case v0.f8308f /* 15 */:
                m0 m0Var = (m0) this.f1050e;
                long u7 = m0Var.f3771w.u();
                if (u7 != 16) {
                    return u7;
                }
                v1 v1Var = (v1) w1.f.i(m0Var, w1.f3934a);
                if (v1Var != null) {
                    long j7 = v1Var.f3928a;
                    if (j7 != 16) {
                        return j7;
                    }
                }
                return ((f1.s) w1.f.i(m0Var, j0.g0.f3652a)).f2705a;
            default:
                return ((x1) this.f1050e).f3946b;
        }
    }

    public a0.a0 v(a0.a0 a0Var, t tVar) {
        int i;
        long E;
        long j7;
        boolean z3;
        o.q qVar = (o.q) this.f1050e;
        List list = (List) a0Var.f11e;
        o.q qVar2 = new o.q(list.size());
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            m mVar = (m) list.get(i8);
            long j8 = mVar.f6011a;
            q1.l lVar = (q1.l) qVar.b(j8);
            if (lVar == null) {
                i = i8;
                j7 = mVar.f6012b;
                E = mVar.f6014d;
                z3 = false;
            } else {
                long j9 = lVar.f6008a;
                boolean z7 = lVar.f6010c;
                i = i8;
                E = tVar.E(lVar.f6009b);
                j7 = j9;
                z3 = z7;
            }
            long j10 = mVar.f6011a;
            List list2 = list;
            int i9 = size;
            qVar2.e(j10, new q1.k(j10, mVar.f6012b, mVar.f6014d, mVar.f6015e, mVar.f6016f, j7, E, z3, mVar.f6017g, mVar.i, mVar.f6019j, mVar.f6020k));
            boolean z8 = mVar.f6015e;
            if (z8) {
                qVar.e(j8, new q1.l(mVar.f6012b, mVar.f6013c, z8));
            } else {
                qVar.f(j8);
            }
            i8 = i + 1;
            list = list2;
            size = i9;
        }
        return new a0.a0(15, qVar2, a0Var);
    }

    public void w(float f6, float f8, long j7) {
        q m7 = ((g1) this.f1050e).m();
        int i = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        m7.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i8));
        m7.b(f6, f8);
        m7.d(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i8));
    }

    public void x(float f6, float f8) {
        ((g1) this.f1050e).m().d(f6, f8);
    }

    public /* synthetic */ b(int i, boolean z3) {
        this.f1049d = i;
    }

    public b(int i) {
        w5.f fVar;
        this.f1049d = i;
        switch (i) {
            case 17:
                if (Build.VERSION.SDK_INT >= 28) {
                    fVar = new w5.f(24);
                } else {
                    fVar = new w5.f(25);
                }
                this.f1050e = fVar;
                break;
            case 27:
                this.f1050e = new o.q((Object) null);
                break;
            default:
                this.f1050e = new Region();
                break;
        }
    }

    public b(r2.c cVar) {
        this.f1049d = 26;
        float f6 = u0.f5917a;
        c4.e eVar = new c4.e();
        eVar.f1624a = f6;
        float b8 = cVar.b();
        float f8 = q0.f5895a;
        eVar.f1625b = b8 * 386.0878f * 160.0f * 0.84f;
        this.f1050e = eVar;
    }

    public b(boolean z3) {
        this.f1049d = 1;
        this.f1050e = new AtomicBoolean(z3);
    }

    public b(TextView textView) {
        this.f1049d = 9;
        this.f1050e = new f4.g(textView);
    }

    public b(EditText editText) {
        this.f1049d = 8;
        this.f1050e = new a0.a0(editText, 7);
    }

    public b(ContentInfo contentInfo) {
        this.f1049d = 29;
        contentInfo.getClass();
        this.f1050e = a1.c.j(contentInfo);
    }

    public b(ClipData clipData, int i) {
        this.f1049d = 28;
        this.f1050e = a1.c.h(clipData, i);
    }

    @Override // l.g0
    public void f(int i) {
    }

    @Override // l.g0
    public void l(int i) {
    }

    @Override // l.g0
    public void o(int i, float f6) {
    }
}
