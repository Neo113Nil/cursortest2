package g8;

import d6.z;
import f8.a0;
import java.io.IOException;
import r6.l;
import r6.r;
import r6.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f4561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f4562h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f4563i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f4564j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f4565k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f4566l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, long j8, u uVar, a0 a0Var, u uVar2, u uVar3) {
        super(2);
        this.f4561g = rVar;
        this.f4562h = j8;
        this.f4563i = uVar;
        this.f4564j = a0Var;
        this.f4565k = uVar2;
        this.f4566l = uVar3;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            r rVar = this.f4561g;
            if (rVar.f7964f) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            rVar.f7964f = true;
            if (longValue < this.f4562h) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            u uVar = this.f4563i;
            long j8 = uVar.f7967f;
            a0 a0Var = this.f4564j;
            if (j8 == 4294967295L) {
                j8 = a0Var.n();
            }
            uVar.f7967f = j8;
            u uVar2 = this.f4565k;
            uVar2.f7967f = uVar2.f7967f == 4294967295L ? a0Var.n() : 0L;
            u uVar3 = this.f4566l;
            uVar3.f7967f = uVar3.f7967f == 4294967295L ? a0Var.n() : 0L;
        }
        return z.f2639a;
    }
}
