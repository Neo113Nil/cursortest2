package na;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface f {
    Object awaitInitialized(ld.a aVar);

    <T extends g> boolean containsInstanceOf(ce.b bVar);

    void enqueue(g gVar, boolean z10);

    Object enqueueAndWait(g gVar, boolean z10, ld.a aVar);

    void forceExecuteOperations();
}
