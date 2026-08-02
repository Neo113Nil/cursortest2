package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfw implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kfw(hvi hviVar, long j, TimeUnit timeUnit, int i) {
        this.d = i;
        this.c = hviVar;
        this.a = j;
        this.b = timeUnit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [hvi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d != 0) {
            ?? r0 = this.c;
            if (r0.isDone()) {
                return;
            }
            ((hkf) ((hkf) ((hkf) gaj.a.f()).h(gwd.c())).i("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 382, "AndroidFutures.java")).x("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(this.a), this.b, r0);
            return;
        }
        long j = this.a;
        long abs = Math.abs(j);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j2 = abs / 1000000000;
        long abs2 = Math.abs(j);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long j3 = abs2 % 1000000000;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append("ClientCall started after ");
            sb.append((String) this.b);
            sb.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb.append("Deadline ");
            sb.append((String) this.b);
            sb.append(" was exceeded after ");
        }
        sb.append(j2);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j3)));
        sb.append("s waiting for ");
        kgc kgcVar = (kgc) this.c;
        sb.append(kgcVar.b);
        kgcVar.g(kbq.e.e(sb.toString()), true);
    }

    public kfw(kgc kgcVar, long j, String str, int i) {
        this.d = i;
        this.a = j;
        this.b = str;
        this.c = kgcVar;
    }
}
