package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import androidx.fragment.app.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class vg implements qu, af, p90 {
    public static final vg g = new vg(1);
    public static final vg h = new vg(2);
    public static final vg i = new vg(3);
    public static final vg j = new vg(4);
    public static final vg k = new vg(5);
    public static final vg l = new vg(6);
    public static final vg m = new vg(7);
    public static final vg n = new vg(8);
    public static final vg o = new vg(9);
    public final /* synthetic */ int f;

    public /* synthetic */ vg(int i2) {
        this.f = i2;
    }

    public static final na e(vg vgVar, String str) {
        na naVar = new na(str);
        na.d.put(str, naVar);
        return naVar;
    }

    public static final y00 f(y00 y00Var) {
        if ((y00Var != null ? y00Var.l : null) == null) {
            return y00Var;
        }
        x00 n2 = y00Var.n();
        n2.g = null;
        return n2.a();
    }

    public static String g(String str, int i2, int i3, String str2, int i4) {
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
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || l40.f0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !o(str, i6, length)))) || (codePointAt == 43 && z3)))) {
                p8 p8Var = new p8();
                p8Var.B(str, i5, i6);
                p8 p8Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            p8Var.A(z ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z4) || l40.f0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !o(str, i6, length)))))) {
                            if (p8Var2 == null) {
                                p8Var2 = new p8();
                            }
                            p8Var2.C(codePointAt2);
                            while (!p8Var2.n()) {
                                byte readByte = p8Var2.readByte();
                                p8Var.w(37);
                                char[] cArr = yo.j;
                                p8Var.w(cArr[((readByte & 255) >> 4) & 15]);
                                p8Var.w(cArr[readByte & 15]);
                            }
                        } else {
                            p8Var.C(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return p8Var.r(p8Var.g, v9.a);
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static t8 h(String str) {
        if (str.length() % 2 != 0) {
            o8.e("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (j8.a(str.charAt(i3 + 1)) + (j8.a(str.charAt(i3)) << 4));
        }
        return new t8(bArr);
    }

    public static t8 j(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(v9.a);
        bytes.getClass();
        t8 t8Var = new t8(bytes);
        t8Var.h = str;
        return t8Var;
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
    public static boolean m(ih ihVar, Editable editable, int i2, int i3, boolean z) {
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
                t70[] t70VarArr = (t70[]) editable.getSpans(selectionStart, min, t70.class);
                if (t70VarArr != null && t70VarArr.length > 0) {
                    for (t70 t70Var : t70VarArr) {
                        int spanStart = editable.getSpanStart(t70Var);
                        int spanEnd = editable.getSpanEnd(t70Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    ihVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    ihVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean o(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && y70.o(str.charAt(i2 + 1)) != -1 && y70.o(str.charAt(i4)) != -1;
    }

    public static String p(String str, int i2, int i3, int i4) {
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
                p8 p8Var = new p8();
                p8Var.B(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            p8Var.w(32);
                            i6++;
                        }
                        p8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int o2 = y70.o(str.charAt(i6 + 1));
                        int o3 = y70.o(str.charAt(i5));
                        if (o2 != -1 && o3 != -1) {
                            p8Var.w((o2 << 4) + o3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        p8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return p8Var.r(p8Var.g, v9.a);
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    public static ArrayList q(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int j0 = l40.j0(str, '&', i2, 4);
            if (j0 == -1) {
                j0 = str.length();
            }
            int j02 = l40.j0(str, '=', i2, 4);
            if (j02 == -1 || j02 > j0) {
                arrayList.add(str.substring(i2, j0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, j02));
                arrayList.add(str.substring(j02 + 1, j0));
            }
            i2 = j0 + 1;
        }
        return arrayList;
    }

    @Override // defpackage.af
    public boolean b(SSLSocket sSLSocket) {
        return t40.e0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.p90
    public m90 c(Class cls) {
        switch (this.f) {
            case 24:
                return new o(true);
            default:
                return new qr();
        }
    }

    @Override // defpackage.af
    public l30 d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new e3(cls2);
    }

    public synchronized na k(String str) {
        na naVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = na.d;
            naVar = (na) linkedHashMap.get(str);
            if (naVar == null) {
                naVar = (na) linkedHashMap.get(t40.e0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : t40.e0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (naVar == null) {
                    naVar = new na(str);
                }
                linkedHashMap.put(str, naVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return naVar;
    }

    public Signature[] l(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.qu
    public boolean s(au auVar) {
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 7:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qu
    public void a(au auVar, boolean z) {
    }
}
