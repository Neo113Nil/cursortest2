package u3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.t;
import z2.C1442z;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f10958c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        String property = System.getProperty("java.specification.version");
        Integer f4 = property != null ? t.f(property) : null;
        boolean z4 = false;
        if (f4 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        z4 = true;
        f10958c = z4;
    }

    @Override // u3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((m3.t) obj) != m3.t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((m3.t) it.next()).f8459d);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // u3.n
    public final String f(SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
