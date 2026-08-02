package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class efj implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ efj(WorkDatabase workDatabase, String str, axt axtVar, axt axtVar2, Set set, boolean z, int i) {
        this.g = i;
        this.c = workDatabase;
        this.a = str;
        this.d = axtVar;
        this.e = axtVar2;
        this.f = set;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.c;
        if (i == 0) {
            ((fea) ((efn) ((fwm) obj).b.bB()).e.bB()).b(this.d, this.e, this.a, this.f, Boolean.valueOf(this.b));
            return;
        }
        WorkDatabase workDatabase = (WorkDatabase) obj;
        axu C = workDatabase.C();
        ayf D = workDatabase.D();
        axt axtVar = (axt) this.d;
        atb atbVar = axtVar.c;
        int i2 = axtVar.l;
        long j = axtVar.o;
        int i3 = axtVar.s;
        long j2 = axtVar.u;
        int i4 = axtVar.v;
        int i5 = axtVar.t;
        axt axtVar2 = (axt) this.e;
        axt e = axt.e(axtVar2, null, atbVar, null, null, i2, j, i3, i5 + 1, j2, i4, 29613053);
        if (axtVar2.v == 1) {
            e.u = axtVar2.u;
            e.v++;
        }
        boolean z = this.b;
        ?? r6 = this.f;
        String str = this.a;
        C.t(aei.f(e));
        D.b(str);
        D.c(str, r6);
        if (z) {
            return;
        }
        C.x(str, -1L);
        workDatabase.B().a(str);
    }

    public /* synthetic */ efj(fwm fwmVar, String str, String str2, String str3, String str4, boolean z, int i) {
        this.g = i;
        this.c = fwmVar;
        this.d = str;
        this.e = str2;
        this.a = str3;
        this.f = str4;
        this.b = z;
    }
}
