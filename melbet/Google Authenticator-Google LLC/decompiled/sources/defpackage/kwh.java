package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwh extends kwi {
    private final Runnable a;

    public kwh(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.kwi
    public final String toString() {
        String kwiVar = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return kwiVar.concat(runnable.toString());
    }
}
