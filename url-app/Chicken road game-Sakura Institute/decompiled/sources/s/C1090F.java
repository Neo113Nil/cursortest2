package s;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* renamed from: s.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090F extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P.k f9892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1090F(P.k kVar, int i2) {
        super(1);
        this.f9891d = i2;
        this.f9892e = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9891d) {
            case 0:
                P.k kVar = this.f9892e;
                return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
            default:
                return new C1092H(this.f9892e, (Map) obj);
        }
    }
}
