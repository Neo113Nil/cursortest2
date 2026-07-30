package K6;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final v f1552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1553e;

    public q(r rVar, v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f1553e = rVar;
        this.f1552d = reader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EnumC0131b enumC0131b;
        Throwable th;
        r rVar = this.f1553e;
        v vVar = this.f1552d;
        EnumC0131b enumC0131b2 = EnumC0131b.f1493m;
        IOException e7 = null;
        try {
            try {
                Intrinsics.checkNotNullParameter(this, "handler");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e7 = e8;
            enumC0131b = enumC0131b2;
        }
        if (!vVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        do {
            try {
            } catch (Throwable th3) {
                th = th3;
                enumC0131b = enumC0131b2;
                rVar.a(enumC0131b, enumC0131b2, e7);
                E6.c.a(vVar);
                throw th;
            }
        } while (vVar.a(false, this));
        enumC0131b = EnumC0131b.f1491i;
        try {
            try {
                rVar.a(enumC0131b, EnumC0131b.f1496p, null);
            } catch (IOException e9) {
                e7 = e9;
                EnumC0131b enumC0131b3 = EnumC0131b.f1492l;
                rVar.a(enumC0131b3, enumC0131b3, e7);
                E6.c.a(vVar);
                return Unit.f6114a;
            }
            E6.c.a(vVar);
            return Unit.f6114a;
        } catch (Throwable th4) {
            th = th4;
            rVar.a(enumC0131b, enumC0131b2, e7);
            E6.c.a(vVar);
            throw th;
        }
    }
}
