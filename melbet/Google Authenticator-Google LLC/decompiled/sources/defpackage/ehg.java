package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehg implements hut {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ gva c;
    private final String d;

    public ehg(gva gvaVar, boolean z, long j) {
        this.a = z;
        this.b = j;
        this.c = gvaVar;
        this.d = dih.N(gvaVar.a);
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        String str = this.d;
        String aj = dih.aj(th);
        gva gvaVar = this.c;
        fwm fwmVar = (fwm) gvaVar.c;
        String str2 = (String) gvaVar.d;
        boolean z = this.a;
        fwmVar.x(str, aj, -1, str2, z);
        fwmVar.A(Instant.now().toEpochMilli() - this.b, str, aj, -1, str2, z);
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int min = Math.min(((hel) obj).size(), 10);
        gva gvaVar = this.c;
        fwm fwmVar = (fwm) gvaVar.c;
        String str = (String) gvaVar.d;
        String str2 = this.d;
        boolean z = this.a;
        fwmVar.x(str2, "OK", min, str, z);
        fwmVar.A(Instant.now().toEpochMilli() - this.b, str2, "OK", min, str, z);
    }
}
