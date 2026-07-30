package u3;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Process;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import d0.b0;
import d0.x1;
import g0.n1;
import g0.p1;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p1.s0;
import r1.a1;
import r1.d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q {
    public q() {
        new ConcurrentHashMap();
    }

    public static final void a(t3.h hVar, p0.c cVar, o0.a aVar, g0.p pVar, int i7) {
        pVar.S(-1579360880);
        if ((((pVar.h(hVar) ? 4 : 2) | i7 | (pVar.h(cVar) ? 32 : 16)) & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            g0.d.b(new n1[]{r3.b.f7934a.a(hVar), p3.b.f7197a.a(hVar), AndroidCompositionLocals_androidKt.f742e.a(hVar)}, o0.f.b(-52928304, new b0(cVar, 19, aVar), pVar), pVar, 56);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new x1(hVar, cVar, aVar, i7, 5);
        }
    }

    public static final y1.m b(d0 d0Var, boolean z8) {
        s0.n nVar = (s0.n) d0Var.A.f3895f;
        r1.l lVar = null;
        if ((nVar.f8107i & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f8106h & 8) != 0) {
                    s0.n nVar2 = nVar;
                    i0.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof r1.n1) {
                            lVar = nVar2;
                            break loop0;
                        }
                        if ((nVar2.f8106h & 8) != 0 && (nVar2 instanceof r1.m)) {
                            int i7 = 0;
                            for (s0.n nVar3 = ((r1.m) nVar2).f7853t; nVar3 != null; nVar3 = nVar3.f8109k) {
                                if ((nVar3.f8106h & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new i0.d(new s0.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        nVar2 = r1.f.f(dVar);
                    }
                }
                if ((nVar.f8107i & 8) == 0) {
                    break;
                }
                nVar = nVar.f8109k;
            }
        }
        r6.k.c(lVar);
        s0.n nVar4 = ((s0.n) ((r1.n1) lVar)).f8104f;
        y1.i o2 = d0Var.o();
        r6.k.c(o2);
        return new y1.m(nVar4, z8, d0Var, o2);
    }

    public static final void c(p0.c cVar, o0.a aVar, g0.p pVar, int i7) {
        int i8;
        pVar.S(1211832233);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(cVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            pVar.R(1729797275);
            c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 Q = a.a.Q(r6.w.a(a.class), a3, null, a3 instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) a3).d() : q3.a.f7511b, pVar);
            pVar.p(false);
            a aVar2 = (a) Q;
            aVar2.f8988d = new WeakReference(cVar);
            cVar.e(aVar2.f8987c, aVar, pVar, ((i8 << 6) & 896) | (i8 & 112));
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g0.v(i7, 5, cVar, aVar);
        }
    }

    public static final boolean d(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (r6.k.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static final r1.n1 h(d0 d0Var) {
        s0.n nVar = (s0.n) d0Var.A.f3895f;
        Object obj = null;
        if ((nVar.f8107i & 8) != 0) {
            loop0: while (true) {
                if (nVar == null) {
                    break;
                }
                if ((nVar.f8106h & 8) != 0) {
                    s0.n nVar2 = nVar;
                    i0.d dVar = null;
                    while (nVar2 != null) {
                        if (nVar2 instanceof r1.n1) {
                            if (((r1.n1) nVar2).e0()) {
                                obj = nVar2;
                                break loop0;
                            }
                        } else if ((nVar2.f8106h & 8) != 0 && (nVar2 instanceof r1.m)) {
                            int i7 = 0;
                            for (s0.n nVar3 = ((r1.m) nVar2).f7853t; nVar3 != null; nVar3 = nVar3.f8109k) {
                                if ((nVar3.f8106h & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        nVar2 = nVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new i0.d(new s0.n[16]);
                                        }
                                        if (nVar2 != null) {
                                            dVar.b(nVar2);
                                            nVar2 = null;
                                        }
                                        dVar.b(nVar3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        nVar2 = r1.f.f(dVar);
                    }
                }
                if ((nVar.f8107i & 8) == 0) {
                    break;
                }
                nVar = nVar.f8109k;
            }
        }
        return (r1.n1) obj;
    }

    public static final boolean i(String str) {
        r6.k.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final String j(int i7, g0.p pVar) {
        pVar.k(AndroidCompositionLocals_androidKt.f738a);
        return ((Context) pVar.k(AndroidCompositionLocals_androidKt.f739b)).getResources().getString(i7);
    }

    public static final String k(float f9) {
        if (Float.isNaN(f9)) {
            return "NaN";
        }
        if (Float.isInfinite(f9)) {
            return f9 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f9 * pow;
        int i7 = (int) f10;
        if (f10 - i7 >= 0.5f) {
            i7++;
        }
        float f11 = i7 / pow;
        return max > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [q6.a, r6.l] */
    public static final void l(y1.m mVar, int i7, x1.i iVar) {
        i0.d dVar = new i0.d(new y1.m[16]);
        List g9 = mVar.g(false, false);
        while (true) {
            dVar.d(dVar.f4842h, g9);
            while (dVar.m()) {
                y1.m mVar2 = (y1.m) dVar.o(dVar.f4842h - 1);
                a1 c4 = mVar2.c();
                y1.i iVar2 = mVar2.f9840d;
                boolean T0 = c4 != null ? c4.T0() : false;
                LinkedHashMap linkedHashMap = iVar2.f9832f;
                if (!T0 && !linkedHashMap.containsKey(y1.p.f9871m) && !linkedHashMap.containsKey(y1.p.f9867i)) {
                    a1 c6 = mVar2.c();
                    if (c6 == null) {
                        a.a.N("Expected semantics node to have a coordinator.");
                        throw null;
                    }
                    y0.d e9 = s0.e(c6);
                    int round = Math.round(e9.f9780a);
                    int round2 = Math.round(e9.f9781b);
                    int round3 = Math.round(e9.f9782c);
                    int round4 = Math.round(e9.f9783d);
                    m2.i iVar3 = new m2.i(round, round2, round3, round4);
                    if (round < round3 && round2 < round4) {
                        Object obj = iVar2.f9832f.get(y1.h.f9810e);
                        if (obj == null) {
                            obj = null;
                        }
                        q6.e eVar = (q6.e) obj;
                        Object obj2 = linkedHashMap.get(y1.p.f9874p);
                        y1.g gVar = (y1.g) (obj2 != null ? obj2 : null);
                        if (eVar == null || gVar == null || ((Number) gVar.f9805b.a()).floatValue() <= 0.0f) {
                            g9 = mVar2.g(false, false);
                        } else {
                            int i8 = i7 + 1;
                            iVar.f(new x1.k(mVar2, i8, iVar3, c6));
                            l(mVar2, i8, iVar);
                        }
                    }
                }
            }
            return;
        }
    }

    public abstract Typeface e(Context context, y2.b[] bVarArr);

    public Typeface f(Context context, InputStream inputStream) {
        File file;
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
            for (int i7 = 0; i7 < 100; i7++) {
                file = new File(cacheDir, str + i7);
                if (file.createNewFile()) {
                    break;
                }
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        try {
            if (r.e(file, inputStream)) {
                return Typeface.createFromFile(file.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            file.delete();
        }
    }

    public y2.b g(y2.b[] bVarArr) {
        y2.b bVar = null;
        int i7 = Integer.MAX_VALUE;
        for (y2.b bVar2 : bVarArr) {
            int abs = (bVar2.f9894d ? 1 : 0) + (Math.abs(bVar2.f9893c - 400) * 2);
            if (bVar == null || i7 > abs) {
                bVar = bVar2;
                i7 = abs;
            }
        }
        return bVar;
    }
}
