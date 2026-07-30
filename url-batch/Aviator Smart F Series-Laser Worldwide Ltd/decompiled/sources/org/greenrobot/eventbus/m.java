package org.greenrobot.eventbus;

/* loaded from: classes5.dex */
public final class m {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final c eventBus;
    public final Throwable throwable;

    public m(c cVar, Throwable th, Object obj, Object obj2) {
        this.eventBus = cVar;
        this.throwable = th;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
