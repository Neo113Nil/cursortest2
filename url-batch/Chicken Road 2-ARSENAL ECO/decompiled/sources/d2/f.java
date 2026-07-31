package d2;

import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public interface f {
    Object awaitInitialized(InterfaceC0564d interfaceC0564d);

    <T extends g> boolean containsInstanceOf(D5.c cVar);

    void enqueue(g gVar, boolean z5);

    Object enqueueAndWait(g gVar, boolean z5, InterfaceC0564d interfaceC0564d);

    void forceExecuteOperations();
}
