package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class klg extends kle {
    @Override // defpackage.kle
    public final boolean a(klh klhVar) {
        synchronized (klhVar) {
            if (klhVar.a != 0) {
                return false;
            }
            klhVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.kle
    public final void b(klh klhVar) {
        synchronized (klhVar) {
            klhVar.a = 0;
        }
    }
}
