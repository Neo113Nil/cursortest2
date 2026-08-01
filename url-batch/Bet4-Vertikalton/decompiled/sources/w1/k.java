package w1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import m.C0260a;
import o1.q;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f4185c;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
    
        if (r1.intValue() >= 9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    static {
        Integer num;
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            C0260a.b(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i4 = -2147483647;
                if (d1.d.f(charAt, 48) >= 0) {
                    i = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i = 1;
                        i2 = 0;
                        int i5 = 0;
                        int i6 = -59652323;
                        while (i < length) {
                            int digit = Character.digit((int) property.charAt(i), 10);
                            if (digit >= 0 && ((i5 >= i6 || (i6 == -59652323 && i5 >= (i6 = i4 / 10))) && (i3 = i5 * 10) >= i4 + digit)) {
                                i5 = i3 - digit;
                                i++;
                            }
                        }
                        num = i2 == 0 ? Integer.valueOf(i5) : Integer.valueOf(-i5);
                        if (num == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                                z2 = false;
                                f4185c = z2;
                            }
                        }
                        f4185c = z2;
                    }
                    if (charAt == '-') {
                        i4 = Integer.MIN_VALUE;
                        i = 1;
                    }
                }
                i2 = i;
                int i52 = 0;
                int i62 = -59652323;
                while (i < length) {
                }
                if (i2 == 0) {
                }
                if (num == null) {
                }
                f4185c = z2;
            }
        }
        num = null;
        if (num == null) {
        }
        f4185c = z2;
    }

    @Override // w1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d1.d.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q) obj) != q.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(S0.i.z0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((q) it.next()).f3372a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // w1.n
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
