package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayx extends kqw {
    public /* synthetic */ Object a;
    final /* synthetic */ ConstraintTrackingWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayx(ConstraintTrackingWorker constraintTrackingWorker, kqj kqjVar) {
        super(kqjVar);
        this.b = constraintTrackingWorker;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.k(null, null, null, this);
    }
}
