package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
final class a0 {
    public final LockFreeLinkedListNode ref;

    public a0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.ref = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.ref + ']';
    }
}
