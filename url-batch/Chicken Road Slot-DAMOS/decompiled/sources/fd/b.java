package fd;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b extends e {
    void addObserver(c cVar);

    @Override // fd.e
    /* synthetic */ String getId();

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(c cVar);
}
