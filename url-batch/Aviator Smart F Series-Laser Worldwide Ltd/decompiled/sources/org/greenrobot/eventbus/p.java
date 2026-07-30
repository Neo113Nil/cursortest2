package org.greenrobot.eventbus;

/* loaded from: classes5.dex */
final class p {
    volatile boolean active = true;
    final Object subscriber;
    final n subscriberMethod;

    p(Object obj, n nVar) {
        this.subscriber = obj;
        this.subscriberMethod = nVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.subscriber == pVar.subscriber && this.subscriberMethod.equals(pVar.subscriberMethod);
    }

    public int hashCode() {
        return this.subscriber.hashCode() + this.subscriberMethod.methodString.hashCode();
    }
}
