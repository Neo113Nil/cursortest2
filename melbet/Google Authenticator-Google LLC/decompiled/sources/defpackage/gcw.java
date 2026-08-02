package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gcw implements gzf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ gcw(Object obj, hvi hviVar, Object obj2, Object obj3, int i) {
        this.e = i;
        this.a = obj;
        this.b = hviVar;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [hvi, java.lang.Object] */
    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = this.e;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                Object obj2 = this.d;
                Object obj3 = this.c;
                ((gka) this.a).d(this.b, (WorkerParameters) obj3, (Duration) obj2);
            }
            return null;
        }
        if (i == 1) {
            return hoq.au(this.b, new bpp((ccg) obj, this.c, this.d, 3, null), ((ccd) this.a).d);
        }
        if (((Boolean) obj).booleanValue()) {
            Object obj4 = this.d;
            Object obj5 = this.b;
            ((ldt) this.c).f(this.a, (Duration) obj5, (String) obj4);
        }
        return null;
    }

    public /* synthetic */ gcw(ldt ldtVar, hvi hviVar, Duration duration, String str, int i) {
        this.e = i;
        this.c = ldtVar;
        this.a = hviVar;
        this.b = duration;
        this.d = str;
    }
}
