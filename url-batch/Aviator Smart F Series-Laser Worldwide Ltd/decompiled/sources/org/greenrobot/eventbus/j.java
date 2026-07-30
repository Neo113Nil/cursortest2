package org.greenrobot.eventbus;

/* loaded from: classes5.dex */
final class j {
    private i head;
    private i tail;

    j() {
    }

    synchronized void enqueue(i iVar) {
        try {
            if (iVar == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            i iVar2 = this.tail;
            if (iVar2 != null) {
                iVar2.next = iVar;
                this.tail = iVar;
            } else {
                if (this.head != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.tail = iVar;
                this.head = iVar;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized i poll() {
        i iVar;
        iVar = this.head;
        if (iVar != null) {
            i iVar2 = iVar.next;
            this.head = iVar2;
            if (iVar2 == null) {
                this.tail = null;
            }
        }
        return iVar;
    }

    synchronized i poll(int i8) {
        try {
            if (this.head == null) {
                wait(i8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return poll();
    }
}
