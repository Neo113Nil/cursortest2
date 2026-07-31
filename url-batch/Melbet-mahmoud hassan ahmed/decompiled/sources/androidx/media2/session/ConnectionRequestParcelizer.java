package androidx.media2.session;

/* loaded from: classes.dex */
public final class ConnectionRequestParcelizer {
    public static ConnectionRequest read(androidx.versionedparcelable.a aVar) {
        ConnectionRequest connectionRequest = new ConnectionRequest();
        connectionRequest.f1139a = aVar.v(connectionRequest.f1139a, 0);
        connectionRequest.f1140b = aVar.E(connectionRequest.f1140b, 1);
        connectionRequest.f1141c = aVar.v(connectionRequest.f1141c, 2);
        connectionRequest.f1142d = aVar.k(connectionRequest.f1142d, 3);
        return connectionRequest;
    }

    public static void write(ConnectionRequest connectionRequest, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(connectionRequest.f1139a, 0);
        aVar.h0(connectionRequest.f1140b, 1);
        aVar.Y(connectionRequest.f1141c, 2);
        aVar.O(connectionRequest.f1142d, 3);
    }
}
