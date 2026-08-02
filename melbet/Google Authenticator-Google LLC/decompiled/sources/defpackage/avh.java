package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class avh extends kqw {
    /* synthetic */ Object a;
    final /* synthetic */ avi b;
    int c;
    WorkerParameters d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avh(avi aviVar, kqj kqjVar) {
        super(kqjVar);
        this.b = aviVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
