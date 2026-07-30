package F2;

import k6.InterfaceC0608c;

/* loaded from: classes.dex */
public interface f {
    Object awaitInitialized(V5.b bVar);

    <T extends g> boolean containsInstanceOf(InterfaceC0608c interfaceC0608c);

    void enqueue(g gVar, boolean z7);

    Object enqueueAndWait(g gVar, boolean z7, V5.b bVar);

    void forceExecuteOperations();
}
