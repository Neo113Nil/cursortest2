package d2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import o.e0;
import w1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f2165a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2166b;

    /* renamed from: c, reason: collision with root package name */
    public final o.l f2167c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f2168d = new e0(2);

    public p(f0 f0Var, d dVar, o.x xVar) {
        this.f2165a = f0Var;
        this.f2166b = dVar;
        this.f2167c = xVar;
    }

    public final n a() {
        return new n(this.f2166b, false, this.f2165a, new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(f0 f0Var, j jVar) {
        String str;
        boolean z3;
        boolean z7;
        AutofillValue forText;
        e0 e0Var = this.f2168d;
        Object[] objArr = e0Var.f5442a;
        int i = e0Var.f5443b;
        for (int i8 = 0; i8 < i; i8++) {
            z0.b bVar = (z0.b) objArr[i8];
            o.y yVar = bVar.f9108g;
            x1.t tVar = bVar.f9104c;
            q3.k kVar = bVar.f9102a;
            j u7 = f0Var.u();
            int i9 = f0Var.f7640e;
            String str2 = null;
            if (jVar != null) {
                Object g3 = jVar.f2150d.g(s.C);
                if (g3 == null) {
                    g3 = null;
                }
                g2.e eVar = (g2.e) g3;
                if (eVar != null) {
                    str = eVar.f2928e;
                    if (u7 != null) {
                        Object g7 = u7.f2150d.g(s.C);
                        if (g7 == null) {
                            g7 = null;
                        }
                        g2.e eVar2 = (g2.e) g7;
                        if (eVar2 != null) {
                            str2 = eVar2.f2928e;
                        }
                    }
                    if (str != str2) {
                        if (str == null) {
                            kVar.n(tVar, i9, true);
                        } else if (str2 == null) {
                            kVar.n(tVar, i9, false);
                        } else if (q6.i.a((z0.c) q.d(u7, s.f2204r), z0.k.f9113a)) {
                            forText = AutofillValue.forText(str2.toString());
                            ((AutofillManager) kVar.f6119e).notifyValueChanged(tVar, i9, forText);
                        }
                    }
                    z3 = jVar == null && jVar.f2150d.b(s.f2203q);
                    z7 = u7 == null && u7.f2150d.b(s.f2203q);
                    if (z3 != z7) {
                        if (z7) {
                            yVar.a(i9);
                        } else {
                            yVar.e(i9);
                        }
                    }
                }
            }
            str = null;
            if (u7 != null) {
            }
            if (str != str2) {
            }
            if (jVar == null) {
            }
            if (u7 == null) {
            }
            if (z3 != z7) {
            }
        }
    }
}
