package k3;

import c3.r;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l extends o {
    public static final boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r0.intValue() >= 9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
    static {
        Integer num;
        int i4;
        int i5;
        int i6;
        String property = System.getProperty("java.specification.version");
        boolean z3 = false;
        if (property != null) {
            d.i(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i7 = -2147483647;
                if (u2.c.f(charAt, 48) >= 0) {
                    i4 = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i5 = 0;
                        i4 = 1;
                        int i8 = 0;
                        int i9 = -59652323;
                        while (i4 < length) {
                            int digit = Character.digit((int) property.charAt(i4), 10);
                            if (digit >= 0 && ((i8 >= i9 || (i9 == -59652323 && i8 >= (i9 = i7 / 10))) && (i6 = i8 * 10) >= i7 + digit)) {
                                i8 = i6 - digit;
                                i4++;
                            }
                        }
                        num = i5 == 0 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
                        if (num == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                        z3 = true;
                        c = z3;
                    }
                    if (charAt == '-') {
                        i7 = Integer.MIN_VALUE;
                        i4 = 1;
                    }
                }
                i5 = i4;
                int i82 = 0;
                int i92 = -59652323;
                while (i4 < length) {
                }
                if (i5 == 0) {
                }
                if (num == null) {
                }
                z3 = true;
                c = z3;
            }
        }
        num = null;
        if (num == null) {
        }
        z3 = true;
        c = z3;
    }

    @Override // k3.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n2.i.E(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((r) obj2).f1126f);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // k3.o
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
