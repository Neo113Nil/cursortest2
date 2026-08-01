package H1;

import M.X;
import M1.u;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.EditText;
import b.x;
import com.winpower.neonfit.R;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import n.P0;
import p0.v;
import z1.t;

/* loaded from: classes.dex */
public abstract class d implements X, S.j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f550a = true;

    public d() {
        new ConcurrentHashMap();
    }

    public static final String A(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static ColorStateList B(Context context, I0.h hVar, int i) {
        int resourceId;
        ColorStateList v2;
        TypedArray typedArray = (TypedArray) hVar.f592c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (v2 = l.v(context, resourceId)) == null) ? hVar.g(i) : v2;
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList v2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (v2 = l.v(context, resourceId)) == null) ? typedArray.getColorStateList(i) : v2;
    }

    public static float E(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable F(Context context, int i) {
        return P0.b().c(context, i);
    }

    public static Drawable G(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable F2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (F2 = F(context, resourceId)) == null) ? typedArray.getDrawable(i) : F2;
    }

    public static Set H() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static l0.c K(l0.d dVar, SQLiteDatabase sQLiteDatabase) {
        j1.h.e(dVar, "refHolder");
        j1.h.e(sQLiteDatabase, "sqLiteDatabase");
        l0.c cVar = dVar.f3251a;
        if (cVar != null && j1.h.a(cVar.f3250a, sQLiteDatabase)) {
            return cVar;
        }
        l0.c cVar2 = new l0.c(sQLiteDatabase);
        dVar.f3251a = cVar2;
        return cVar2;
    }

    public static final boolean M(AssertionError assertionError) {
        Logger logger = M1.m.f840a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? q1.e.u0(message, "getsockname failed") : false;
    }

    public static boolean O(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean P(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean Q() {
        return e.f551d;
    }

    public static final boolean R(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static float U(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.e.c(edgeEffect, f2, f3);
        }
        S.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static D.d Z(String str) {
        int i;
        String str2;
        j1.h.e(str, "statusLine");
        boolean s0 = q1.m.s0(str, "HTTP/1.", false);
        t tVar = t.HTTP_1_0;
        if (s0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                tVar = t.HTTP_1_1;
            }
        } else {
            if (!q1.m.s0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String substring = str.substring(i, i2);
            j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int parseInt = Integer.parseInt(substring);
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i + 4);
                j1.h.d(str2, "this as java.lang.String).substring(startIndex)");
            }
            return new D.d(tVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final void b0(View view, x xVar) {
        j1.h.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, xVar);
    }

    public static final M1.c f0(Socket socket) {
        Logger logger = M1.m.f840a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        j1.h.d(outputStream, "getOutputStream(...)");
        return new M1.c(uVar, new M1.c(outputStream, uVar));
    }

    public static final M1.d g0(Socket socket) {
        Logger logger = M1.m.f840a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        j1.h.d(inputStream, "getInputStream(...)");
        return new M1.d(uVar, 0, new M1.d(inputStream, 1, uVar));
    }

    public static final void h(C1.a aVar, C1.c cVar, String str) {
        C1.f.i.fine(cVar.f139b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f133a);
    }

    public static void h0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            v.b(viewGroup, z2);
        } else if (f550a) {
            try {
                v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f550a = false;
            }
        }
    }

    public static Y0.i i(Y0.i iVar) {
        Y0.f fVar = iVar.f1419a;
        fVar.b();
        return fVar.i > 0 ? iVar : Y0.i.f1418b;
    }

    public static final void i0(Object obj) {
        if (obj instanceof W0.e) {
            throw ((W0.e) obj).f1340a;
        }
    }

    public static void j(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final String j0(String str) {
        j1.h.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!q1.e.u0(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                j1.h.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                j1.h.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                j1.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (j1.h.f(charAt, 31) <= 0 || j1.h.f(charAt, 127) >= 0 || q1.e.y0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress v2 = (q1.m.s0(str, "[", false) && q1.m.n0(str, "]")) ? v(str, 1, str.length() - 1) : v(str, 0, str.length());
        if (v2 == null) {
            return null;
        }
        byte[] address = v2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return v2.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        M1.f fVar = new M1.f();
        while (i < address.length) {
            if (i == i2) {
                fVar.M(58);
                i += i5;
                if (i == 16) {
                    fVar.M(58);
                }
            } else {
                if (i > 0) {
                    fVar.M(58);
                }
                byte b2 = address[i];
                byte[] bArr = A1.c.f19a;
                fVar.N(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.F(fVar.f827b, q1.a.f3995a);
    }

    public static void k(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new n1.c(2, 36, 1));
        }
    }

    public static int n(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final void q(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static final W0.e r(Throwable th) {
        j1.h.e(th, "exception");
        return new W0.e(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r7 == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (r8 != (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress v(String str, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i7 = i;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        while (true) {
            if (i7 >= i2) {
                i3 = i6;
                break;
            }
            if (i8 != i6) {
                int i11 = i7 + 2;
                if (i11 <= i2 && q1.m.r0(str, "::", i7, z2)) {
                    if (i9 == -1) {
                        i8 += 2;
                        if (i11 != i2) {
                            i9 = i8;
                            i10 = i11;
                            i7 = i10;
                            int i12 = 0;
                            while (i7 < i2) {
                            }
                            i5 = i7 - i10;
                            if (i5 == 0) {
                                break;
                            }
                            break;
                        }
                        i3 = i6;
                        i9 = i8;
                        break;
                    }
                    return null;
                }
                if (i8 != 0) {
                    if (!q1.m.r0(str, ":", i7, z2)) {
                        if (q1.m.r0(str, ".", i7, z2)) {
                            int i13 = i8 - 2;
                            int i14 = i13;
                            loop2: while (true) {
                                if (i10 < i2) {
                                    if (i14 == i6) {
                                        break;
                                    }
                                    if (i14 != i13) {
                                        if (str.charAt(i10) != '.') {
                                            break;
                                        }
                                        i10++;
                                    }
                                    ?? r14 = z2;
                                    int i15 = i10;
                                    while (i15 < i2) {
                                        char charAt = str.charAt(i15);
                                        if (j1.h.f(charAt, 48) < 0 || j1.h.f(charAt, 57) > 0) {
                                            break;
                                        }
                                        if ((r14 == 0 && i10 != i15) || (i4 = ((r14 * 10) + charAt) - 48) > 255) {
                                            break loop2;
                                        }
                                        i15++;
                                        r14 = i4;
                                    }
                                    if (i15 - i10 == 0) {
                                        break;
                                    }
                                    bArr[i14] = (byte) r14;
                                    i14++;
                                    i10 = i15;
                                    i6 = 16;
                                    z2 = false;
                                } else if (i14 == i8 + 2) {
                                    i8 += 2;
                                    i3 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i7++;
                }
                i10 = i7;
                i7 = i10;
                int i122 = 0;
                while (i7 < i2) {
                    int p2 = A1.c.p(str.charAt(i7));
                    if (p2 == -1) {
                        break;
                    }
                    i122 = (i122 << 4) + p2;
                    i7++;
                }
                i5 = i7 - i10;
                if (i5 == 0 || i5 > 4) {
                    break;
                }
                int i16 = i8 + 1;
                bArr[i8] = (byte) ((i122 >>> 8) & 255);
                i8 += 2;
                bArr[i16] = (byte) (i122 & 255);
                i6 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static boolean w(String str, String str2) {
        j1.h.e(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    j1.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return j1.h.a(q1.e.L0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean x(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static View z(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public abstract void D(N0.u uVar, float f2, float f3);

    public int I(View view) {
        return 0;
    }

    public int J() {
        return 0;
    }

    public abstract void L();

    public abstract boolean N();

    public abstract View S(int i);

    public abstract boolean T();

    public void V(View view, int i) {
    }

    public abstract void W(int i);

    public abstract void X(View view, int i, int i2);

    public abstract void Y(View view, float f2, float f3);

    public abstract Object a0(Intent intent, int i);

    public abstract void c0(boolean z2);

    @Override // M.X
    public void d() {
    }

    public abstract void d0(boolean z2);

    public abstract void e0();

    @Override // M.X
    public void g() {
    }

    public abstract boolean k0(View view, int i);

    public abstract int o(View view, int i);

    public abstract int p(View view, int i);

    public abstract Typeface s(Context context, D.g gVar, Resources resources, int i);

    public abstract Typeface t(Context context, J.i[] iVarArr, int i);

    public Typeface u(Context context, Resources resources, int i, String str, int i2) {
        File z2 = l.z(context);
        if (z2 == null) {
            return null;
        }
        try {
            if (l.p(z2, resources, i)) {
                return Typeface.createFromFile(z2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            z2.delete();
        }
    }

    public J.i y(int i, J.i[] iVarArr) {
        new N0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        J.i iVar = null;
        int i3 = Integer.MAX_VALUE;
        for (J.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f643c - i2) * 2) + (iVar2.f644d == z2 ? 0 : 1);
            if (iVar == null || i3 > abs) {
                iVar = iVar2;
                i3 = abs;
            }
        }
        return iVar;
    }
}
