package m6;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f19278a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.equals("") != false) goto L21;
     */
    static {
        boolean z6;
        String d7 = kotlinx.coroutines.internal.z.d("kotlinx.coroutines.scheduler");
        if (d7 != null) {
            int hashCode = d7.hashCode();
            if (hashCode != 0) {
                if (hashCode != 3551) {
                    z6 = (hashCode == 109935 && d7.equals("off")) ? false : true;
                }
                throw new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + ((Object) d7) + '\'').toString());
            }
            f19278a = z6;
        }
        f19278a = z6;
    }

    public static final f0 a() {
        return f19278a ? kotlinx.coroutines.scheduling.b.f18411m : v.f19334h;
    }

    public static final String b(y5.g gVar) {
        j0 j0Var;
        String P;
        if (!p0.c() || (j0Var = (j0) gVar.get(j0.f19293g)) == null) {
            return null;
        }
        k0 k0Var = (k0) gVar.get(k0.f19297g);
        String str = "coroutine";
        if (k0Var != null && (P = k0Var.P()) != null) {
            str = P;
        }
        return str + '#' + j0Var.P();
    }

    public static final y5.g c(l0 l0Var, y5.g gVar) {
        y5.g plus = l0Var.c().plus(gVar);
        y5.g plus2 = p0.c() ? plus.plus(new j0(p0.b().incrementAndGet())) : plus;
        return (plus == w0.a() || plus.get(y5.e.f23478e) != null) ? plus2 : plus2.plus(w0.a());
    }

    public static final h2<?> d(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof s0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof h2) {
                return (h2) eVar;
            }
        }
        return null;
    }

    public static final h2<?> e(y5.d<?> dVar, y5.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.get(i2.f19292f) != null)) {
            return null;
        }
        h2<?> d7 = d((kotlin.coroutines.jvm.internal.e) dVar);
        if (d7 != null) {
            d7.z0(gVar, obj);
        }
        return d7;
    }
}
