package U2;

import R1.y;
import T2.z;
import e2.InterfaceC0426e;
import f2.k;
import f2.q;
import f2.t;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f4534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f4535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f4536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f4537h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f4538i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f4539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q qVar, long j3, t tVar, z zVar, t tVar2, t tVar3) {
        super(2);
        this.f4534e = qVar;
        this.f4535f = j3;
        this.f4536g = tVar;
        this.f4537h = zVar;
        this.f4538i = tVar2;
        this.f4539j = tVar3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            q qVar = this.f4534e;
            if (qVar.f5828d) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            qVar.f5828d = true;
            if (longValue < this.f4535f) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            t tVar = this.f4536g;
            long j3 = tVar.f5831d;
            z zVar = this.f4537h;
            if (j3 == 4294967295L) {
                j3 = zVar.n();
            }
            tVar.f5831d = j3;
            t tVar2 = this.f4538i;
            tVar2.f5831d = tVar2.f5831d == 4294967295L ? zVar.n() : 0L;
            t tVar3 = this.f4539j;
            tVar3.f5831d = tVar3.f5831d == 4294967295L ? zVar.n() : 0L;
        }
        return y.f4171a;
    }
}
