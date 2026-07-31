package O2;

import N2.z;
import Z1.j;
import Z1.p;
import Z1.s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f3009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f3011g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f3012h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f3013i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f3014j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, long j3, s sVar, z zVar, s sVar2, s sVar3) {
        super(2);
        this.f3009e = pVar;
        this.f3010f = j3;
        this.f3011g = sVar;
        this.f3012h = zVar;
        this.f3013i = sVar2;
        this.f3014j = sVar3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            p pVar = this.f3009e;
            if (pVar.f3476d) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            pVar.f3476d = true;
            if (longValue < this.f3010f) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            s sVar = this.f3011g;
            long j3 = sVar.f3479d;
            z zVar = this.f3012h;
            if (j3 == 4294967295L) {
                j3 = zVar.m();
            }
            sVar.f3479d = j3;
            s sVar2 = this.f3013i;
            sVar2.f3479d = sVar2.f3479d == 4294967295L ? zVar.m() : 0L;
            s sVar3 = this.f3014j;
            sVar3.f3479d = sVar3.f3479d == 4294967295L ? zVar.m() : 0L;
        }
        return L1.z.f2729a;
    }
}
