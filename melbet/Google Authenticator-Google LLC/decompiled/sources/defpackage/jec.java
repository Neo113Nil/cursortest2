package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jec implements ddd {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jec(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }

    @Override // defpackage.ddd
    public final void c(Exception exc) {
        int i = this.c;
        long j = this.a;
        if (i != 0) {
            ((AtomicLong) ((bvw) this.b).b).set(j);
        } else {
            ((AtomicLong) ((ikm) this.b).a).set(j);
        }
    }
}
