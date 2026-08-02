package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baj implements Callable {
    final /* synthetic */ ban a;

    public baj(ban banVar) {
        this.a = banVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ban banVar = this.a;
        synchronized (banVar) {
            if (banVar.g == null) {
                return null;
            }
            banVar.g();
            if (banVar.h()) {
                banVar.e();
                banVar.i = 0;
            }
            return null;
        }
    }
}
