package b.a.g;

import b.x;
import b.y;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: Platform.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final e f2019a = a();

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f2020b = Logger.getLogger(x.class.getName());

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(SSLSocket sSLSocket, String str, List<y> list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String str) {
        return true;
    }

    public static e b() {
        return f2019a;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        f2020b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object a(String str) {
        if (f2020b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public static List<String> a(List<y> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y yVar = list.get(i);
            if (yVar != y.HTTP_1_0) {
                arrayList.add(yVar.toString());
            }
        }
        return arrayList;
    }

    public b.a.i.b a(X509TrustManager x509TrustManager) {
        return new b.a.i.a(b.a.i.e.a(x509TrustManager));
    }

    private static e a() {
        e a2 = a.a();
        if (a2 != null) {
            return a2;
        }
        b a3 = b.a();
        if (a3 != null) {
            return a3;
        }
        e a4 = c.a();
        return a4 != null ? a4 : new e();
    }

    static byte[] b(List<y> list) {
        c.c cVar = new c.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y yVar = list.get(i);
            if (yVar != y.HTTP_1_0) {
                cVar.i(yVar.toString().length());
                cVar.b(yVar.toString());
            }
        }
        return cVar.r();
    }
}
