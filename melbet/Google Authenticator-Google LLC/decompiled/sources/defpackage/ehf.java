package defpackage;

import android.graphics.Bitmap;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehf implements hut {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ gva d;
    private final String e;
    private final String f;

    public ehf(gva gvaVar, int i, boolean z, long j) {
        this.c = i;
        this.a = z;
        this.b = j;
        this.d = gvaVar;
        this.e = dih.N(gvaVar.a);
        this.f = i != 32 ? i != 48 ? i != 64 ? i != 120 ? i != 240 ? "null" : "X_LARGE" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        String str = this.f;
        String aj = dih.aj(th);
        gva gvaVar = this.d;
        fwm fwmVar = (fwm) gvaVar.c;
        String str2 = (String) gvaVar.d;
        String str3 = this.e;
        boolean z = this.a;
        fwmVar.w(str3, str, aj, str2, z);
        fwmVar.z(Instant.now().toEpochMilli() - this.b, str3, str, aj, str2, z);
    }

    @Override // defpackage.hut
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        boolean z = this.a;
        gva gvaVar = this.d;
        String str2 = this.f;
        String str3 = this.e;
        fwm fwmVar = (fwm) gvaVar.c;
        String str4 = (String) gvaVar.d;
        fwmVar.w(str3, str2, str, str4, z);
        fwmVar.z(Instant.now().toEpochMilli() - this.b, str3, str2, str, str4, z);
    }
}
