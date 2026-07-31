package O2;

import G2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f3904c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r0.intValue() >= 9) goto L10;
     */
    static {
        String property = System.getProperty("java.specification.version");
        Integer A3 = property != null ? AbstractC0737q.A(property) : null;
        boolean z3 = false;
        if (A3 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        z3 = true;
        f3904c = z3;
    }

    @Override // O2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj) != s.f2273e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(S1.n.E0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f2280d);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // O2.n
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
