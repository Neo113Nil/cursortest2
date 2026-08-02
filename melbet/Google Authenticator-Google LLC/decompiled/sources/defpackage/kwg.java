package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwg extends kwi {
    final /* synthetic */ kwk a;
    private final kuv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwg(kwk kwkVar, long j, kuv kuvVar) {
        super(j);
        this.a = kwkVar;
        this.c = kuvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a, kow.a);
    }

    @Override // defpackage.kwi
    public final String toString() {
        String kwiVar = super.toString();
        kuv kuvVar = this.c;
        Objects.toString(kuvVar);
        return kwiVar.concat(kuvVar.toString());
    }
}
