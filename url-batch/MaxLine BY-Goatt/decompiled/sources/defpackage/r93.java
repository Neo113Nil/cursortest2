package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r93 extends o81 implements Function2 {
    public final /* synthetic */ y72 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ b82 o;
    public final /* synthetic */ p62 p;
    public final /* synthetic */ b82 q;
    public final /* synthetic */ b82 r;
    public final /* synthetic */ c82 s;
    public final /* synthetic */ c82 t;
    public final /* synthetic */ c82 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(y72 y72Var, long j, b82 b82Var, p62 p62Var, b82 b82Var2, b82 b82Var3, c82 c82Var, c82 c82Var2, c82 c82Var3) {
        super(2);
        this.m = y72Var;
        this.n = j;
        this.o = b82Var;
        this.p = p62Var;
        this.q = b82Var2;
        this.r = b82Var3;
        this.s = c82Var;
        this.t = c82Var2;
        this.u = c82Var3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        p62 p62Var = this.p;
        if (intValue == 1) {
            y72 y72Var = this.m;
            if (y72Var.m) {
                dm0.j("bad zip: zip64 extra repeated");
                return null;
            }
            y72Var.m = true;
            if (longValue < this.n) {
                dm0.j("bad zip: zip64 extra too short");
                return null;
            }
            b82 b82Var = this.o;
            long j = b82Var.m;
            if (j == 4294967295L) {
                j = p62Var.n();
            }
            b82Var.m = j;
            b82 b82Var2 = this.q;
            b82Var2.m = b82Var2.m == 4294967295L ? p62Var.n() : 0L;
            b82 b82Var3 = this.r;
            b82Var3.m = b82Var3.m == 4294967295L ? p62Var.n() : 0L;
        } else if (intValue == 10) {
            if (longValue < 4) {
                dm0.j("bad zip: NTFS extra too short");
                return null;
            }
            p62Var.skip(4L);
            yh2.o(p62Var, (int) (longValue - 4), new q93(this.s, p62Var, this.t, this.u));
        }
        return Unit.a;
    }
}
