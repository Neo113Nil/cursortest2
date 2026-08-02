package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcv implements hut {
    final /* synthetic */ hvi a;
    final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public kcv(gva gvaVar, String str, hvi hviVar, int i) {
        this.d = i;
        this.b = str;
        this.a = hviVar;
        this.c = gvaVar;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        if (this.d != 0) {
            Log.e("ClientLoggingBackend", "Error while logging.", th);
            return;
        }
        hvi hviVar = this.a;
        ((ConcurrentHashMap) ((gva) this.c).d).remove(this.b, hviVar);
    }

    @Override // defpackage.hut
    public final /* synthetic */ void b(Object obj) {
        if (this.d == 0) {
        } else if (((Boolean) obj).booleanValue()) {
            hnu.aS(this.a, gvx.f(new ecu(this, this.b, 4)), ((igs) this.c).a);
        }
    }

    public kcv(igs igsVar, hvi hviVar, ihj ihjVar, int i) {
        this.d = i;
        this.a = hviVar;
        this.b = ihjVar;
        this.c = igsVar;
    }
}
