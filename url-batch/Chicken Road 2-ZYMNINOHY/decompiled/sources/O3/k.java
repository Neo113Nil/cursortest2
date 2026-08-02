package O3;

import G3.t;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2076c;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0079, code lost:
    
        if (r0.intValue() >= 9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0073  */
    static {
        int i4;
        int i5;
        Integer valueOf;
        int i6;
        String property = System.getProperty("java.specification.version");
        boolean z = false;
        if (property != null) {
            AbstractC0457a.d(10);
            int length = property.length();
            if (length != 0) {
                char charAt = property.charAt(0);
                int i7 = -2147483647;
                if (kotlin.jvm.internal.i.f(charAt, 48) >= 0) {
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
                        valueOf = i5 == 0 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
                        if (valueOf == null) {
                            try {
                                SSLSocket.class.getMethod("getApplicationProtocol", null);
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                        z = true;
                        f2076c = z;
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
                if (valueOf == null) {
                }
                z = true;
                f2076c = z;
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
        z = true;
        f2076c = z;
    }

    @Override // O3.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(d3.k.Y(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((t) obj2).f1006a);
        }
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // O3.n
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
