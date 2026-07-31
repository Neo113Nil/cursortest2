package y3;

/* loaded from: classes.dex */
public interface b extends e {
    void addObserver(c cVar);

    @Override // y3.e
    /* synthetic */ String getId();

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(c cVar);
}
