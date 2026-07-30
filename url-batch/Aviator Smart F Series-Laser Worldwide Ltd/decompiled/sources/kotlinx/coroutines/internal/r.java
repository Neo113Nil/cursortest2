package kotlinx.coroutines.internal;

import androidx.exifinterface.media.ExifInterface;

/* loaded from: classes5.dex */
public class r extends LockFreeLinkedListNode {
    public final /* synthetic */ <T extends LockFreeLinkedListNode> void forEach(f6.l lVar) {
        Object next = getNext();
        kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next; !kotlin.jvm.internal.s.areEqual(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            kotlin.jvm.internal.s.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                lVar.invoke(lockFreeLinkedListNode);
            }
        }
    }

    public final boolean isEmpty() {
        return getNext() == this;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    protected LockFreeLinkedListNode nextIfRemoved() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo1292remove() {
        return ((Boolean) remove()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    public final void validate$kotlinx_coroutines_core() {
        Object next = getNext();
        kotlin.jvm.internal.s.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        r rVar = this;
        r rVar2 = (LockFreeLinkedListNode) next;
        while (!kotlin.jvm.internal.s.areEqual(rVar2, this)) {
            LockFreeLinkedListNode nextNode = rVar2.getNextNode();
            rVar2.validateNode$kotlinx_coroutines_core(rVar, nextNode);
            rVar = rVar2;
            rVar2 = nextNode;
        }
        Object next2 = getNext();
        kotlin.jvm.internal.s.checkNotNull(next2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        validateNode$kotlinx_coroutines_core(rVar, (LockFreeLinkedListNode) next2);
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
