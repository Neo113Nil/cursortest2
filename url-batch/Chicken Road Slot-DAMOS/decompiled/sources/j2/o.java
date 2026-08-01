package j2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import c2.g0;
import kotlin.jvm.internal.Intrinsics;
import s.d0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f4988a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4989b;

    /* renamed from: c, reason: collision with root package name */
    public final s.k f4990c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f4991d = new d0(2);

    public o(g0 g0Var, d dVar, s.w wVar) {
        this.f4988a = g0Var;
        this.f4989b = dVar;
        this.f4990c = wVar;
    }

    public final m a() {
        return new m(this.f4989b, false, this.f4988a, new j());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(g0 g0Var, j jVar) {
        String str;
        String str2;
        l2.a aVar;
        l2.a aVar2;
        e1.e eVar;
        e1.e eVar2;
        boolean z10;
        boolean z11;
        AutofillValue forToggle;
        AutofillValue forText;
        d0 d0Var = this.f4991d;
        Object[] objArr = d0Var.f8284a;
        int i3 = d0Var.f8285b;
        for (int i10 = 0; i10 < i3; i10++) {
            e1.b bVar = (e1.b) objArr[i10];
            d9.c cVar = bVar.f3771d;
            d2.v vVar = bVar.f3773i;
            j u2 = g0Var.u();
            int i11 = g0Var.f1550e;
            if (jVar != null) {
                Object g = jVar.f4975d.g(q.D);
                if (g == null) {
                    g = null;
                }
                m2.e eVar3 = (m2.e) g;
                if (eVar3 != null) {
                    str = eVar3.f6454e;
                    if (u2 != null) {
                        Object g2 = u2.f4975d.g(q.D);
                        if (g2 == null) {
                            g2 = null;
                        }
                        m2.e eVar4 = (m2.e) g2;
                        if (eVar4 != null) {
                            str2 = eVar4.f6454e;
                            if (str != str2) {
                                if (str == null) {
                                    cVar.q(vVar, i11, true);
                                } else if (str2 == null) {
                                    cVar.q(vVar, i11, false);
                                } else if (Intrinsics.a((e1.c) p.f(u2, q.f5008r), e1.k.f3784a)) {
                                    if (str2.length() >= 5000) {
                                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? kotlin.text.r.m(4999, str2) : kotlin.text.r.m(5000, str2);
                                    }
                                    forText = AutofillValue.forText(str2);
                                    ((AutofillManager) cVar.f3701e).notifyValueChanged(vVar, i11, forText);
                                }
                            }
                            if (jVar != null) {
                                Object g10 = jVar.f4975d.g(q.H);
                                if (g10 == null) {
                                    g10 = null;
                                }
                                aVar = (l2.a) g10;
                            } else {
                                aVar = null;
                            }
                            if (u2 != null) {
                                Object g11 = u2.f4975d.g(q.H);
                                if (g11 == null) {
                                    g11 = null;
                                }
                                aVar2 = (l2.a) g11;
                            } else {
                                aVar2 = null;
                            }
                            if (aVar != aVar2) {
                                if (aVar == null) {
                                    cVar.q(vVar, i11, true);
                                } else if (aVar2 == null) {
                                    cVar.q(vVar, i11, false);
                                } else if (Intrinsics.a((e1.c) p.f(u2, q.f5008r), e1.k.f3785b)) {
                                    int ordinal = aVar2.ordinal();
                                    Boolean bool = ordinal != 0 ? ordinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                                    if (bool != null) {
                                        forToggle = AutofillValue.forToggle(bool.booleanValue());
                                        ((AutofillManager) cVar.f3701e).notifyValueChanged(vVar, i11, forToggle);
                                    }
                                }
                            }
                            if (jVar != null) {
                                Object g12 = jVar.f4975d.g(q.f5009s);
                                if (g12 == null) {
                                    g12 = null;
                                }
                                eVar = (e1.e) g12;
                            } else {
                                eVar = null;
                            }
                            if (u2 != null) {
                                Object g13 = u2.f4975d.g(q.f5009s);
                                if (g13 == null) {
                                    g13 = null;
                                }
                                eVar2 = (e1.e) g13;
                            } else {
                                eVar2 = null;
                            }
                            if (!Intrinsics.a(eVar, eVar2)) {
                                if (eVar == null) {
                                    cVar.q(vVar, i11, true);
                                } else if (eVar2 == null) {
                                    cVar.q(vVar, i11, false);
                                } else {
                                    ((AutofillManager) cVar.f3701e).notifyValueChanged(vVar, i11, eVar2.f3781a);
                                }
                            }
                            z10 = jVar == null && jVar.f4975d.b(q.f5007q);
                            z11 = u2 == null && u2.f4975d.b(q.f5007q);
                            if (z10 != z11) {
                                s.x xVar = bVar.f3777u;
                                if (z11) {
                                    xVar.a(i11);
                                } else {
                                    xVar.e(i11);
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (str != str2) {
                    }
                    if (jVar != null) {
                    }
                    if (u2 != null) {
                    }
                    if (aVar != aVar2) {
                    }
                    if (jVar != null) {
                    }
                    if (u2 != null) {
                    }
                    if (!Intrinsics.a(eVar, eVar2)) {
                    }
                    if (jVar == null) {
                    }
                    if (u2 == null) {
                    }
                    if (z10 != z11) {
                    }
                }
            }
            str = null;
            if (u2 != null) {
            }
            str2 = null;
            if (str != str2) {
            }
            if (jVar != null) {
            }
            if (u2 != null) {
            }
            if (aVar != aVar2) {
            }
            if (jVar != null) {
            }
            if (u2 != null) {
            }
            if (!Intrinsics.a(eVar, eVar2)) {
            }
            if (jVar == null) {
            }
            if (u2 == null) {
            }
            if (z10 != z11) {
            }
        }
    }
}
