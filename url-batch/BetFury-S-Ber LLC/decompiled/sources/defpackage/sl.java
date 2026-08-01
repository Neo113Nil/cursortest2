package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class sl implements pg, g20, dj {
    public static final sl f = new sl();
    public static final /* synthetic */ sl g = new sl();
    public static final sl h = new sl();
    public static final /* synthetic */ sl i = new sl();
    public static final sl j = new sl();
    public static final /* synthetic */ sl k = new sl();
    public static final sl l = new sl();
    public static final sl m = new sl();
    public static final sl n = new sl();
    public static final sl o = new sl();

    public static final zb d(sl slVar, String str) {
        zb zbVar = new zb(str);
        zb.d.put(str, zbVar);
        return zbVar;
    }

    public static final v90 e(v90 v90Var) {
        if ((v90Var != null ? v90Var.l : null) == null) {
            return v90Var;
        }
        u90 n2 = v90Var.n();
        n2.g = null;
        return n2.a();
    }

    public static String f(String str, int i2, int i3, String str2, int i4) {
        int i5 = (i4 & 1) != 0 ? 0 : i2;
        int length = (i4 & 2) != 0 ? str.length() : i3;
        boolean z = (i4 & 8) == 0;
        boolean z2 = (i4 & 16) == 0;
        boolean z3 = (i4 & 32) == 0;
        boolean z4 = (i4 & 64) == 0;
        str.getClass();
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 128;
            int i8 = 32;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || mf0.s(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !m(str, i6, length)))) || (codePointAt == 43 && z3)))) {
                t9 t9Var = new t9();
                t9Var.Y(str, i5, i6);
                t9 t9Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            t9Var.X(z ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z4) || mf0.s(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !m(str, i6, length)))))) {
                            if (t9Var2 == null) {
                                t9Var2 = new t9();
                            }
                            t9Var2.Z(codePointAt2);
                            while (!t9Var2.n()) {
                                byte readByte = t9Var2.readByte();
                                t9Var.T(37);
                                char[] cArr = ou.j;
                                t9Var.T(cArr[((readByte & 255) >> 4) & 15]);
                                t9Var.T(cArr[readByte & 15]);
                            }
                        } else {
                            t9Var.Z(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return t9Var.O(t9Var.g, fb.a);
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static y9 g(String str) {
        if (str.length() % 2 != 0) {
            s9.e("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (n9.a(str.charAt(i3 + 1)) + (n9.a(str.charAt(i3)) << 4));
        }
        return new y9(bArr);
    }

    public static y9 h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(fb.a);
        bytes.getClass();
        y9 y9Var = new y9(bytes);
        y9Var.h = str;
        return y9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(gm gmVar, Editable editable, int i2, int i3, boolean z) {
        int min;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i3, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    min = Math.min(selectionEnd + i3, editable.length());
                }
                ok0[] ok0VarArr = (ok0[]) editable.getSpans(selectionStart, min, ok0.class);
                if (ok0VarArr != null && ok0VarArr.length > 0) {
                    for (ok0 ok0Var : ok0VarArr) {
                        int spanStart = editable.getSpanStart(ok0Var);
                        int spanEnd = editable.getSpanEnd(ok0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    gmVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    gmVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean l(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean m(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && zk0.o(str.charAt(i2 + 1)) != -1 && zk0.o(str.charAt(i4)) != -1;
    }

    public static String n(String str, int i2, int i3, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z = (i4 & 4) == 0;
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt == '%' || (charAt == '+' && z)) {
                t9 t9Var = new t9();
                t9Var.Y(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            t9Var.T(32);
                            i6++;
                        }
                        t9Var.Z(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int o2 = zk0.o(str.charAt(i6 + 1));
                        int o3 = zk0.o(str.charAt(i5));
                        if (o2 != -1 && o3 != -1) {
                            t9Var.T((o2 << 4) + o3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        t9Var.Z(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return t9Var.O(t9Var.g, fb.a);
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int w = mf0.w(str, '&', i2, 4);
            if (w == -1) {
                w = str.length();
            }
            int w2 = mf0.w(str, '=', i2, 4);
            if (w2 == -1 || w2 > w) {
                arrayList.add(str.substring(i2, w));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, w2));
                arrayList.add(str.substring(w2 + 1, w));
            }
            i2 = w + 1;
        }
        return arrayList;
    }

    @Override // defpackage.dj
    public boolean b(SSLSocket sSLSocket) {
        return uf0.r(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.dj
    public fe0 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f3(cls2);
    }

    public synchronized zb i(String str) {
        zb zbVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = zb.d;
            zbVar = (zb) linkedHashMap.get(str);
            if (zbVar == null) {
                zbVar = (zb) linkedHashMap.get(uf0.r(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : uf0.r(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (zbVar == null) {
                    zbVar = new zb(str);
                }
                linkedHashMap.put(str, zbVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zbVar;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.g20
    public boolean t(r10 r10Var) {
        return false;
    }

    @Override // defpackage.g20
    public void a(r10 r10Var, boolean z) {
    }
}
