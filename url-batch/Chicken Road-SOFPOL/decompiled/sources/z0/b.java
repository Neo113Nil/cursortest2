package z0;

import a0.q;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import d2.p;
import o.y;
import r2.o;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final q3.k f9102a;

    /* renamed from: b, reason: collision with root package name */
    public final p f9103b;

    /* renamed from: c, reason: collision with root package name */
    public final t f9104c;

    /* renamed from: d, reason: collision with root package name */
    public final e2.a f9105d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9106e;

    /* renamed from: f, reason: collision with root package name */
    public final AutofillId f9107f;

    /* renamed from: g, reason: collision with root package name */
    public final y f9108g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9109h;

    public b(q3.k kVar, p pVar, t tVar, e2.a aVar, String str) {
        this.f9102a = kVar;
        this.f9103b = pVar;
        this.f9104c = tVar;
        this.f9105d = aVar;
        this.f9106e = str;
        new Rect();
        tVar.setImportantForAutofill(1);
        q0.e A = o.A(tVar);
        AutofillId a8 = A != null ? f.a(A.f5938a) : null;
        if (a8 == null) {
            throw q.f("Required value was null.");
        }
        this.f9107f = a8;
        this.f9108g = new y();
    }
}
