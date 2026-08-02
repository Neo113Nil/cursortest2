package defpackage;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aza extends kqw {
    public Object a;
    public /* synthetic */ Object b;
    final /* synthetic */ ConstraintTrackingWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aza(ConstraintTrackingWorker constraintTrackingWorker, kqj kqjVar) {
        super(kqjVar);
        this.c = constraintTrackingWorker;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
