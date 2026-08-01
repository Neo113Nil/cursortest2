package b4;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import t3.p;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f850c;

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
        int i;
        int i4;
        int i5;
        String property = System.getProperty("java.specification.version");
        boolean z4 = false;
        if (property != null) {
            d.l(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i6 = -2147483647;
                if (i3.d.f(charAt, 48) >= 0) {
                    i = 0;
                } else if (length != 1) {
                    if (charAt == '+') {
                        i4 = 0;
                        i = 1;
                        int i7 = 0;
                        int i8 = -59652323;
                        while (i < length) {
                            int digit = Character.digit((int) property.charAt(i), 10);
                            if (digit >= 0 && ((i7 >= i8 || (i8 == -59652323 && i7 >= (i8 = i6 / 10))) && (i5 = i7 * 10) >= i6 + digit)) {
                                i7 = i5 - digit;
                                i++;
                            }
                        }
                        num = i4 == 0 ? Integer.valueOf(i7) : Integer.valueOf(-i7);
                        if (num == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                        z4 = true;
                        f850c = z4;
                    }
                    if (charAt == '-') {
                        i6 = Integer.MIN_VALUE;
                        i = 1;
                    }
                }
                i4 = i;
                int i72 = 0;
                int i82 = -59652323;
                while (i < length) {
                }
                if (i4 == 0) {
                }
                if (num == null) {
                }
                z4 = true;
                f850c = z4;
            }
        }
        num = null;
        if (num == null) {
        }
        z4 = true;
        f850c = z4;
    }

    @Override // b4.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i3.d.e(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj) != p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.j.C(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((p) obj2).f3505f);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // b4.n
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
