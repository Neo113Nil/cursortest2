package io.ktor.util.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/ktor/util/internal/AtomicOp;", "T", "Lio/ktor/util/internal/OpDescriptor;", "affected", "", "failure", "", "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decision", "decide", "(Ljava/lang/Object;)Ljava/lang/Object;", "perform", "prepare", "", "tryDecide", "(Ljava/lang/Object;)Z", "isDecided", "()Z", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AtomicOp<T> extends OpDescriptor {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _consensus$FU = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus;

    public abstract void complete(T affected, Object failure);

    public abstract Object prepare(T affected);

    public AtomicOp() {
        Object obj;
        obj = LockFreeLinkedListKt.NO_DECISION;
        this._consensus = obj;
    }

    public final boolean isDecided() {
        Object obj;
        Object obj2 = this._consensus;
        obj = LockFreeLinkedListKt.NO_DECISION;
        return obj2 != obj;
    }

    public final boolean tryDecide(Object decision) {
        Object obj;
        Object obj2;
        obj = LockFreeLinkedListKt.NO_DECISION;
        if (!(decision != obj)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        obj2 = LockFreeLinkedListKt.NO_DECISION;
        return UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, obj2, decision);
    }

    private final Object decide(Object decision) {
        return tryDecide(decision) ? decision : this._consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.internal.OpDescriptor
    public final Object perform(Object affected) {
        Object obj;
        Object obj2 = this._consensus;
        obj = LockFreeLinkedListKt.NO_DECISION;
        if (obj2 == obj) {
            obj2 = decide(prepare(affected));
        }
        complete(affected, obj2);
        return obj2;
    }
}
