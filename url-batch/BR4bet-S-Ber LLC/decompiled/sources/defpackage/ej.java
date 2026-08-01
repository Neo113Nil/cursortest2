package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class ej implements xe, cx, yg {
    public static final ej g = new ej(1);
    public static final /* synthetic */ ej h = new ej(2);
    public static final ej i = new ej(3);
    public static final /* synthetic */ ej j = new ej(4);
    public static final ej k = new ej(5);
    public static final /* synthetic */ ej l = new ej(6);
    public static final ej m = new ej(7);
    public static final ej n = new ej(8);
    public static final ej o = new ej(9);
    public static final ej p = new ej(10);
    public static final ej q = new ej(11);
    public static final ej r = new ej(12);
    public final /* synthetic */ int f;

    public /* synthetic */ ej(int i2) {
        this.f = i2;
    }

    public static final db d(ej ejVar, String str) {
        db dbVar = new db(str);
        db.d.put(str, dbVar);
        return dbVar;
    }

    public static final n30 e(n30 n30Var) {
        if ((n30Var != null ? n30Var.l : null) == null) {
            return n30Var;
        }
        m30 g2 = n30Var.g();
        g2.g = null;
        return g2.a();
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
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || f70.V(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !m(str, i6, length)))) || (codePointAt == 43 && z3)))) {
                h9 h9Var = new h9();
                h9Var.B(str, i5, i6);
                h9 h9Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            h9Var.A(z ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z4) || f70.V(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !m(str, i6, length)))))) {
                            if (h9Var2 == null) {
                                h9Var2 = new h9();
                            }
                            h9Var2.C(codePointAt2);
                            while (!h9Var2.g()) {
                                byte readByte = h9Var2.readByte();
                                h9Var.w(37);
                                char[] cArr = uq.j;
                                h9Var.w(cArr[((readByte & 255) >> 4) & 15]);
                                h9Var.w(cArr[readByte & 15]);
                            }
                        } else {
                            h9Var.C(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return h9Var.r(h9Var.g, la.a);
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static l9 g(String str) {
        if (str.length() % 2 != 0) {
            g9.d("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (b9.b(str.charAt(i3 + 1)) + (b9.b(str.charAt(i3)) << 4));
        }
        return new l9(bArr);
    }

    public static l9 h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(la.a);
        bytes.getClass();
        l9 l9Var = new l9(bytes);
        l9Var.h = str;
        return l9Var;
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
    public static boolean k(sj sjVar, Editable editable, int i2, int i3, boolean z) {
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
                ta0[] ta0VarArr = (ta0[]) editable.getSpans(selectionStart, min, ta0.class);
                if (ta0VarArr != null && ta0VarArr.length > 0) {
                    for (ta0 ta0Var : ta0VarArr) {
                        int spanStart = editable.getSpanStart(ta0Var);
                        int spanEnd = editable.getSpanEnd(ta0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    sjVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    sjVar.endBatchEdit();
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
        return i4 < i3 && str.charAt(i2) == '%' && cb0.o(str.charAt(i2 + 1)) != -1 && cb0.o(str.charAt(i4)) != -1;
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
                h9 h9Var = new h9();
                h9Var.B(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            h9Var.w(32);
                            i6++;
                        }
                        h9Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int o2 = cb0.o(str.charAt(i6 + 1));
                        int o3 = cb0.o(str.charAt(i5));
                        if (o2 != -1 && o3 != -1) {
                            h9Var.w((o2 << 4) + o3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        h9Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return h9Var.r(h9Var.g, la.a);
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int Z = f70.Z(str, '&', i2, 4);
            if (Z == -1) {
                Z = str.length();
            }
            int Z2 = f70.Z(str, '=', i2, 4);
            if (Z2 == -1 || Z2 > Z) {
                arrayList.add(str.substring(i2, Z));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, Z2));
                arrayList.add(str.substring(Z2 + 1, Z));
            }
            i2 = Z + 1;
        }
        return arrayList;
    }

    @Override // defpackage.yg
    public boolean b(SSLSocket sSLSocket) {
        return n70.U(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.yg
    public c60 c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new w2(cls2);
    }

    public synchronized db i(String str) {
        db dbVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = db.d;
            dbVar = (db) linkedHashMap.get(str);
            if (dbVar == null) {
                dbVar = (db) linkedHashMap.get(n70.U(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : n70.U(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (dbVar == null) {
                    dbVar = new db(str);
                }
                linkedHashMap.put(str, dbVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return dbVar;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f) {
            case 11:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.cx
    public boolean w(mw mwVar) {
        return false;
    }

    @Override // defpackage.cx
    public void a(mw mwVar, boolean z) {
    }
}
