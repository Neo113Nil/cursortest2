package A1;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.EnumC1211b;
import z1.C1377c;

/* loaded from: classes.dex */
public final class L0 implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f497d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f498e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f499i;

    public L0(Function1 function1, C1377c c1377c) {
        this.f498e = function1;
        this.f499i = c1377c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EnumC1211b enumC1211b;
        Throwable th;
        switch (this.f497d) {
            case 0:
                ((Function1) this.f498e).invoke(((C1377c) this.f499i).f11851a);
                return Unit.f7487a;
            default:
                t3.p pVar = (t3.p) this.f499i;
                t3.t tVar = (t3.t) this.f498e;
                EnumC1211b enumC1211b2 = EnumC1211b.INTERNAL_ERROR;
                IOException e4 = null;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "handler");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e5) {
                    e4 = e5;
                    enumC1211b = enumC1211b2;
                }
                if (!tVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                do {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        enumC1211b = enumC1211b2;
                        pVar.a(enumC1211b, enumC1211b2, e4);
                        n3.b.c(tVar);
                        throw th;
                    }
                } while (tVar.a(false, this));
                enumC1211b = EnumC1211b.NO_ERROR;
                try {
                    try {
                        pVar.a(enumC1211b, EnumC1211b.CANCEL, null);
                    } catch (IOException e6) {
                        e4 = e6;
                        EnumC1211b enumC1211b3 = EnumC1211b.PROTOCOL_ERROR;
                        pVar.a(enumC1211b3, enumC1211b3, e4);
                        n3.b.c(tVar);
                        return Unit.f7487a;
                    }
                    n3.b.c(tVar);
                    return Unit.f7487a;
                } catch (Throwable th4) {
                    th = th4;
                    pVar.a(enumC1211b, enumC1211b2, e4);
                    n3.b.c(tVar);
                    throw th;
                }
        }
    }

    public L0(t3.p pVar, t3.t reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f499i = pVar;
        this.f498e = reader;
    }
}
