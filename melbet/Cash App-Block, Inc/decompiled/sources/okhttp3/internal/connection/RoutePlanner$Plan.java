package okhttp3.internal.connection;

/* loaded from: classes3.dex */
public interface RoutePlanner$Plan {
    void cancel();

    RoutePlanner$ConnectResult connectTcp();

    RoutePlanner$ConnectResult connectTlsEtc();

    RealConnection handleSuccess();

    boolean isReady();

    RoutePlanner$Plan retry();
}
