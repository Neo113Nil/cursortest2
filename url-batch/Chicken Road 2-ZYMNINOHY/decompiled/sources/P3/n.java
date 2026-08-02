package P3;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public interface n {
    boolean a(SSLSocket sSLSocket);

    String b(SSLSocket sSLSocket);

    void c(SSLSocket sSLSocket, String str, List list);

    boolean isSupported();
}
