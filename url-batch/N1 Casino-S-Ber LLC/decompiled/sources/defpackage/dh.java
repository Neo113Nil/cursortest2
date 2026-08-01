package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class dh implements bu, bf, h90 {
    public static final dh g = new dh(1);
    public static final dh h = new dh(2);
    public static final dh i = new dh(3);
    public static final dh j = new dh(4);
    public static final dh k = new dh(5);
    public static final dh l = new dh(6);
    public static final dh m = new dh(7);
    public static final dh n = new dh(8);
    public static final dh o = new dh(9);
    public final /* synthetic */ int f;

    public /* synthetic */ dh(int i2) {
        this.f = i2;
    }

    public static final ka e(dh dhVar, String str) {
        ka kaVar = new ka(str);
        ka.d.put(str, kaVar);
        return kaVar;
    }

    public static final i00 f(i00 i00Var) {
        if ((i00Var != null ? i00Var.l : null) == null) {
            return i00Var;
        }
        h00 n2 = i00Var.n();
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
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || c40.n0(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !o(str, i6, length)))) || (codePointAt == 43 && z3)))) {
                u8 u8Var = new u8();
                u8Var.B(str, i5, i6);
                u8 u8Var2 = null;
                while (i6 < length) {
                    int codePointAt2 = str.codePointAt(i6);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            u8Var.A(z ? "+" : "%2B");
                        } else if (codePointAt2 < i8 || codePointAt2 == 127 || ((codePointAt2 >= i7 && !z4) || c40.n0(str2, (char) codePointAt2) || (codePointAt2 == 37 && (!z || (z2 && !o(str, i6, length)))))) {
                            if (u8Var2 == null) {
                                u8Var2 = new u8();
                            }
                            u8Var2.C(codePointAt2);
                            while (!u8Var2.n()) {
                                byte readByte = u8Var2.readByte();
                                u8Var.w(37);
                                char[] cArr = jo.j;
                                u8Var.w(cArr[((readByte & 255) >> 4) & 15]);
                                u8Var.w(cArr[readByte & 15]);
                            }
                        } else {
                            u8Var.C(codePointAt2);
                        }
                    }
                    i6 += Character.charCount(codePointAt2);
                    i7 = 128;
                    i8 = 32;
                }
                return u8Var.r(u8Var.g, z9.a);
            }
            i6 += Character.charCount(codePointAt);
        }
        return str.substring(i5, length);
    }

    public static y8 h(String str) {
        if (str.length() % 2 != 0) {
            t8.e("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (o8.a(str.charAt(i3 + 1)) + (o8.a(str.charAt(i3)) << 4));
        }
        return new y8(bArr);
    }

    public static y8 i(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(z9.a);
        bytes.getClass();
        y8 y8Var = new y8(bytes);
        y8Var.h = str;
        return y8Var;
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
    public static boolean m(qh qhVar, Editable editable, int i2, int i3, boolean z) {
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
                m70[] m70VarArr = (m70[]) editable.getSpans(selectionStart, min, m70.class);
                if (m70VarArr != null && m70VarArr.length > 0) {
                    for (m70 m70Var : m70VarArr) {
                        int spanStart = editable.getSpanStart(m70Var);
                        int spanEnd = editable.getSpanEnd(m70Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    qhVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    qhVar.endBatchEdit();
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
        return i4 < i3 && str.charAt(i2) == '%' && r70.o(str.charAt(i2 + 1)) != -1 && r70.o(str.charAt(i4)) != -1;
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
                u8 u8Var = new u8();
                u8Var.B(str, i2, i6);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt != 37 || (i5 = i6 + 2) >= i3) {
                        if (codePointAt == 43 && z) {
                            u8Var.w(32);
                            i6++;
                        }
                        u8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        int o2 = r70.o(str.charAt(i6 + 1));
                        int o3 = r70.o(str.charAt(i5));
                        if (o2 != -1 && o3 != -1) {
                            u8Var.w((o2 << 4) + o3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        u8Var.C(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return u8Var.r(u8Var.g, z9.a);
            }
            i6++;
        }
        return str.substring(i2, i3);
    }

    public static ArrayList q(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int r0 = c40.r0(str, '&', i2, 4);
            if (r0 == -1) {
                r0 = str.length();
            }
            int r02 = c40.r0(str, '=', i2, 4);
            if (r02 == -1 || r02 > r0) {
                arrayList.add(str.substring(i2, r0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, r02));
                arrayList.add(str.substring(r02 + 1, r0));
            }
            i2 = r0 + 1;
        }
        return arrayList;
    }

    @Override // defpackage.bf
    public boolean b(SSLSocket sSLSocket) {
        return k40.m0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.h90
    public f90 c(Class cls) {
        switch (this.f) {
            case 23:
                return new dl(true);
            default:
                return new dr();
        }
    }

    @Override // defpackage.bf
    public a30 d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new n2(cls2);
    }

    public synchronized ka j(String str) {
        ka kaVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = ka.d;
            kaVar = (ka) linkedHashMap.get(str);
            if (kaVar == null) {
                kaVar = (ka) linkedHashMap.get(k40.m0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : k40.m0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (kaVar == null) {
                    kaVar = new ka(str);
                }
                linkedHashMap.put(str, kaVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kaVar;
    }

    public Signature[] k(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f) {
            case 7:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.bu
    public boolean x(mt mtVar) {
        return false;
    }

    @Override // defpackage.bu
    public void a(mt mtVar, boolean z) {
    }
}
