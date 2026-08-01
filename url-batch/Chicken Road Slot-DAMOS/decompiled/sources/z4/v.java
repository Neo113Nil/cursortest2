package z4;

import com.google.android.gms.internal.measurement.cf;
import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class v {
    public static final Object a(u uVar, Function1 function1, ld.a aVar) {
        d6.l lVar;
        if (uVar.p() && uVar.s() && uVar.q()) {
            return function1.invoke(aVar);
        }
        if (aVar.getContext().m(x.f10843d) == null) {
            return function1.invoke(aVar);
        }
        a3.t tVar = new a3.t(function1, (ld.a) null, 27);
        c0 c0Var = (c0) aVar.getContext().m(c0.f10729e);
        kotlin.coroutines.d dVar = c0Var != null ? c0Var.f10730d : null;
        if (dVar != null) {
            return ge.a0.B(dVar, tVar, aVar);
        }
        ge.h hVar = new ge.h(1, md.f.b(aVar));
        hVar.s();
        try {
            lVar = uVar.f10837d;
        } catch (RejectedExecutionException e2) {
            hVar.n(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (lVar == null) {
            Intrinsics.f("internalTransactionExecutor");
            throw null;
        }
        lVar.execute(new cf(hVar, uVar, tVar, 16));
        Object r9 = hVar.r();
        md.a aVar2 = md.a.f6622d;
        return r9;
    }

    public static final long b(double d10) {
        return d(4294967296L, (float) d10);
    }

    public static final long c(int i3) {
        return d(4294967296L, i3);
    }

    public static final long d(long j, float f3) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f3) & 4294967295L);
        x2.o[] oVarArr = x2.n.f10334b;
        return floatToRawIntBits;
    }
}
