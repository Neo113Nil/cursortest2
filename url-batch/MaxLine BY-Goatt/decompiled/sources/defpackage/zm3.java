package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.majelw.libystne.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class zm3 {
    public static final my a;
    public static final zo0 b = new zo0(8);
    public static final q63 c = new q63(0.31006f, 0.31616f);
    public static final q63 d = new q63(0.34567f, 0.3585f);
    public static final q63 e = new q63(0.32168f, 0.33767f);
    public static final q63 f = new q63(0.31271f, 0.32902f);
    public static final float[] g = {0.964212f, 1.0f, 0.825188f};
    public static final byte[] h = {112, 114, 111, 0};
    public static final byte[] i = {112, 114, 109, 0};
    public static final ng0 j;
    public static final ng0 k;
    public static y9 l;
    public static y6 m;
    public static ns n;

    static {
        int i2 = 1;
        a = new my(380904583, new ww(i2), false);
        j = new ng0("NONE", i2);
        k = new ng0("PENDING", i2);
    }

    public static final Bundle A(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        lh.e(q40.m("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final void B(Throwable th, CoroutineContext coroutineContext) {
        try {
            u40 u40Var = (u40) coroutineContext.m(qb2.M);
            if (u40Var != null) {
                u40Var.L(th, coroutineContext);
            } else {
                ll3.J(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                wi0.a(runtimeException, th);
                th = runtimeException;
            }
            ll3.J(th, coroutineContext);
        }
    }

    public static final void C(a91 a91Var) {
        s03.J(a91Var).D();
    }

    public static final boolean D(i91 i91Var) {
        int ordinal = i91Var.Q.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            a.b();
                            return false;
                        }
                        i91 u = i91Var.u();
                        if (u != null) {
                            return D(u);
                        }
                        lh.e("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean E(m22 m22Var) {
        List list = m22Var.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((t22) list.get(i2)).i != 2) {
                return false;
            }
        }
        return true;
    }

    public static void F(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final r50 G(yo0 yo0Var) {
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo0 C = j8.C(yo0Var);
                if (C == null) {
                    lh.e("ActiveParent with no focused child");
                    return null;
                }
                r50 G = G(C);
                r50 r50Var = r50.m;
                r50 r50Var2 = G != r50Var ? G : null;
                if (r50Var2 != null) {
                    return r50Var2;
                }
                if (yo0Var.B) {
                    return r50Var;
                }
                yo0Var.B = true;
                try {
                    ro0 H0 = yo0Var.H0();
                    no0 focusOwner = ((t7) s03.K(yo0Var)).getFocusOwner();
                    yo0 yo0Var2 = ((po0) focusOwner).h;
                    H0.k.getClass();
                    Unit unit = Unit.a;
                    yo0 yo0Var3 = ((po0) focusOwner).h;
                    return (yo0Var2 == yo0Var3 || yo0Var3 == null) ? r50Var : to0.d == to0.c ? r50.n : r50.o;
                } finally {
                    yo0Var.B = false;
                }
            }
            if (ordinal == 2) {
                return r50.n;
            }
            if (ordinal != 3) {
                a.b();
                return null;
            }
        }
        return r50.m;
    }

    public static final r50 H(yo0 yo0Var) {
        if (!yo0Var.C) {
            yo0Var.C = true;
            try {
                ro0 H0 = yo0Var.H0();
                no0 focusOwner = ((t7) s03.K(yo0Var)).getFocusOwner();
                yo0 yo0Var2 = ((po0) focusOwner).h;
                H0.j.getClass();
                Unit unit = Unit.a;
                yo0 yo0Var3 = ((po0) focusOwner).h;
                if (yo0Var2 != yo0Var3 && yo0Var3 != null) {
                    return to0.d == to0.c ? r50.n : r50.o;
                }
            } finally {
                yo0Var.C = false;
            }
        }
        return r50.m;
    }

    public static final r50 I(yo0 yo0Var) {
        ul1 ul1Var;
        fs1 fs1Var;
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo0 C = j8.C(yo0Var);
                if (C != null) {
                    return G(C);
                }
                lh.e("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    a.b();
                    return null;
                }
                if (!yo0Var.m.z) {
                    h21.b("visitAncestors called on an unattached node");
                }
                ul1 ul1Var2 = yo0Var.m.q;
                i91 J = s03.J(yo0Var);
                loop0: while (true) {
                    if (J == null) {
                        ul1Var = null;
                        break;
                    }
                    if ((J.P.f.p & 1024) != 0) {
                        while (ul1Var2 != null) {
                            if ((ul1Var2.o & 1024) != 0) {
                                ul1Var = ul1Var2;
                                eo1 eo1Var = null;
                                while (ul1Var != null) {
                                    if (ul1Var instanceof yo0) {
                                        break loop0;
                                    }
                                    if ((ul1Var.o & 1024) != 0 && (ul1Var instanceof p90)) {
                                        int i2 = 0;
                                        for (ul1 ul1Var3 = ((p90) ul1Var).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                            if ((ul1Var3.o & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    ul1Var = ul1Var3;
                                                } else {
                                                    if (eo1Var == null) {
                                                        eo1Var = new eo1(new ul1[16]);
                                                    }
                                                    if (ul1Var != null) {
                                                        eo1Var.b(ul1Var);
                                                        ul1Var = null;
                                                    }
                                                    eo1Var.b(ul1Var3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    ul1Var = s03.c(eo1Var);
                                }
                            }
                            ul1Var2 = ul1Var2.q;
                        }
                    }
                    J = J.u();
                    ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
                }
                yo0 yo0Var2 = (yo0) ul1Var;
                if (yo0Var2 == null) {
                    return r50.m;
                }
                int ordinal2 = yo0Var2.I0().ordinal();
                if (ordinal2 == 0) {
                    return H(yo0Var2);
                }
                if (ordinal2 == 1) {
                    return I(yo0Var2);
                }
                if (ordinal2 == 2) {
                    return r50.n;
                }
                if (ordinal2 != 3) {
                    a.b();
                    return null;
                }
                r50 I = I(yo0Var2);
                r50 r50Var = I != r50.m ? I : null;
                return r50Var == null ? H(yo0Var2) : r50Var;
            }
        }
        return r50.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean J(yo0 yo0Var) {
        eo1 eo1Var;
        fs1 fs1Var;
        char c2;
        fs1 fs1Var2;
        no0 focusOwner = ((t7) s03.K(yo0Var)).getFocusOwner();
        yo0 yo0Var2 = ((po0) focusOwner).h;
        xo0 I0 = yo0Var.I0();
        if (yo0Var2 == yo0Var) {
            yo0Var.G0(I0, I0);
            return true;
        }
        int i2 = 0;
        if (yo0Var2 == null && !((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).a.E()) {
            return false;
        }
        char c3 = 16;
        if (yo0Var2 != null) {
            eo1Var = new eo1(new yo0[16]);
            if (!yo0Var2.m.z) {
                h21.b("visitAncestors called on an unattached node");
            }
            ul1 ul1Var = yo0Var2.m.q;
            i91 J = s03.J(yo0Var2);
            while (J != null) {
                if ((J.P.f.p & 1024) != 0) {
                    while (ul1Var != null) {
                        if ((ul1Var.o & 1024) != 0) {
                            ul1 ul1Var2 = ul1Var;
                            eo1 eo1Var2 = null;
                            while (ul1Var2 != null) {
                                if (ul1Var2 instanceof yo0) {
                                    eo1Var.b((yo0) ul1Var2);
                                } else if ((ul1Var2.o & 1024) != 0 && (ul1Var2 instanceof p90)) {
                                    int i3 = 0;
                                    for (ul1 ul1Var3 = ((p90) ul1Var2).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                        if ((ul1Var3.o & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                ul1Var2 = ul1Var3;
                                            } else {
                                                if (eo1Var2 == null) {
                                                    eo1Var2 = new eo1(new ul1[16]);
                                                }
                                                if (ul1Var2 != null) {
                                                    eo1Var2.b(ul1Var2);
                                                    ul1Var2 = null;
                                                }
                                                eo1Var2.b(ul1Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                ul1Var2 = s03.c(eo1Var2);
                            }
                        }
                        ul1Var = ul1Var.q;
                    }
                }
                J = J.u();
                ul1Var = (J == null || (fs1Var2 = J.P) == null) ? null : fs1Var2.e;
            }
        } else {
            eo1Var = null;
        }
        yo0[] yo0VarArr = new yo0[16];
        if (!yo0Var.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var4 = yo0Var.m.q;
        i91 J2 = s03.J(yo0Var);
        int i4 = 1;
        int i5 = 0;
        while (J2 != null) {
            if ((J2.P.f.p & 1024) != 0) {
                while (ul1Var4 != null) {
                    if ((ul1Var4.o & 1024) != 0) {
                        ul1 ul1Var5 = ul1Var4;
                        eo1 eo1Var3 = null;
                        while (ul1Var5 != null) {
                            if (ul1Var5 instanceof yo0) {
                                yo0 yo0Var3 = (yo0) ul1Var5;
                                Boolean valueOf = eo1Var != null ? Boolean.valueOf(eo1Var.k(yo0Var3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (yo0VarArr.length < i6) {
                                        int length = yo0VarArr.length;
                                        ?? r4 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(yo0VarArr, i2, r4, i2, length);
                                        yo0VarArr = r4;
                                    }
                                    yo0VarArr[i5] = yo0Var3;
                                    i5 = i6;
                                }
                                if (yo0Var3 == yo0Var2) {
                                    i4 = i2;
                                }
                            } else if ((ul1Var5.o & 1024) != 0 && (ul1Var5 instanceof p90)) {
                                int i7 = i2;
                                for (ul1 ul1Var6 = ((p90) ul1Var5).B; ul1Var6 != null; ul1Var6 = ul1Var6.r) {
                                    if ((ul1Var6.o & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            ul1Var5 = ul1Var6;
                                        } else {
                                            if (eo1Var3 == null) {
                                                eo1Var3 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var5 != null) {
                                                eo1Var3.b(ul1Var5);
                                                ul1Var5 = null;
                                            }
                                            eo1Var3.b(ul1Var6);
                                        }
                                    }
                                }
                                c2 = 16;
                                if (i7 == 1) {
                                    c3 = 16;
                                    i2 = 0;
                                }
                                ul1Var5 = s03.c(eo1Var3);
                                c3 = c2;
                                i2 = 0;
                            }
                            c2 = 16;
                            ul1Var5 = s03.c(eo1Var3);
                            c3 = c2;
                            i2 = 0;
                        }
                    }
                    ul1Var4 = ul1Var4.q;
                    c3 = c3;
                    i2 = 0;
                }
            }
            char c4 = c3;
            J2 = J2.u();
            ul1Var4 = (J2 == null || (fs1Var = J2.P) == null) ? null : fs1Var.e;
            c3 = c4;
            i2 = 0;
        }
        if (i4 == 0 || yo0Var2 == null || p(yo0Var2, false)) {
            j8.P(yo0Var, new u(10, yo0Var));
            int ordinal = yo0Var.I0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            a.b();
                            return false;
                        }
                    }
                }
                ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).g(yo0Var);
            }
            if (eo1Var != null) {
                int i8 = eo1Var.o - 1;
                Object[] objArr = eo1Var.m;
                if (i8 < objArr.length) {
                    while (i8 >= 0) {
                        yo0 yo0Var4 = (yo0) objArr[i8];
                        if (((po0) focusOwner).h != yo0Var) {
                            break;
                        }
                        yo0Var4.G0(xo0.n, xo0.p);
                        i8--;
                    }
                }
            }
            int i9 = i5 - 1;
            if (i9 < yo0VarArr.length) {
                while (i9 >= 0) {
                    yo0 yo0Var5 = yo0VarArr[i9];
                    if (((po0) focusOwner).h != yo0Var) {
                        break;
                    }
                    yo0Var5.G0(yo0Var5 == yo0Var2 ? xo0.m : xo0.p, xo0.n);
                    i9--;
                }
            }
            po0 po0Var = (po0) focusOwner;
            if (po0Var.h == yo0Var) {
                yo0Var.G0(I0, xo0.m);
                if (po0Var.h != yo0Var) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static int[] K(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) yk3.Q(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static na0[] L(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, na0[] na0VarArr) {
        byte[] bArr3 = j8.s;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, j8.t)) {
                lh.g("Unsupported meta version");
                return null;
            }
            int Q = (int) yk3.Q(fileInputStream, 2);
            byte[] P = yk3.P(fileInputStream, (int) yk3.Q(fileInputStream, 4), (int) yk3.Q(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                lh.g("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(P);
            try {
                na0[] N = N(byteArrayInputStream, bArr2, Q, na0VarArr);
                byteArrayInputStream.close();
                return N;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(j8.n, bArr2)) {
            lh.g("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            lh.g("Unsupported meta version");
            return null;
        }
        int Q2 = (int) yk3.Q(fileInputStream, 1);
        byte[] P2 = yk3.P(fileInputStream, (int) yk3.Q(fileInputStream, 4), (int) yk3.Q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            lh.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(P2);
        try {
            na0[] M = M(byteArrayInputStream2, Q2, na0VarArr);
            byteArrayInputStream2.close();
            return M;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static na0[] M(ByteArrayInputStream byteArrayInputStream, int i2, na0[] na0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new na0[0];
        }
        if (i2 != na0VarArr.length) {
            lh.g("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int Q = (int) yk3.Q(byteArrayInputStream, 2);
            iArr[i3] = (int) yk3.Q(byteArrayInputStream, 2);
            strArr[i3] = new String(yk3.O(byteArrayInputStream, Q), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            na0 na0Var = na0VarArr[i4];
            if (!na0Var.b.equals(strArr[i4])) {
                lh.g("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            na0Var.e = i5;
            na0Var.h = K(byteArrayInputStream, i5);
        }
        return na0VarArr;
    }

    public static na0[] N(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, na0[] na0VarArr) {
        na0 na0Var;
        if (byteArrayInputStream.available() == 0) {
            return new na0[0];
        }
        if (i2 != na0VarArr.length) {
            lh.g("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            yk3.Q(byteArrayInputStream, 2);
            String str = new String(yk3.O(byteArrayInputStream, (int) yk3.Q(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long Q = yk3.Q(byteArrayInputStream, 4);
            int Q2 = (int) yk3.Q(byteArrayInputStream, 2);
            if (na0VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < na0VarArr.length; i4++) {
                    if (na0VarArr[i4].b.equals(substring)) {
                        na0Var = na0VarArr[i4];
                        break;
                    }
                }
            }
            na0Var = null;
            if (na0Var == null) {
                lh.g("Missing profile key: ".concat(str));
                return null;
            }
            na0Var.d = Q;
            int[] K = K(byteArrayInputStream, Q2);
            if (Arrays.equals(bArr, j8.r)) {
                na0Var.e = Q2;
                na0Var.h = K;
            }
        }
        return na0VarArr;
    }

    public static na0[] O(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, j8.o)) {
            lh.g("Unsupported version");
            return null;
        }
        int Q = (int) yk3.Q(fileInputStream, 1);
        byte[] P = yk3.P(fileInputStream, (int) yk3.Q(fileInputStream, 4), (int) yk3.Q(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            lh.g("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(P);
        try {
            na0[] P2 = P(byteArrayInputStream, str, Q);
            byteArrayInputStream.close();
            return P2;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static na0[] P(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new na0[0];
        }
        na0[] na0VarArr = new na0[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int Q = (int) yk3.Q(byteArrayInputStream, 2);
            int Q2 = (int) yk3.Q(byteArrayInputStream, 2);
            na0VarArr[i4] = new na0(str, new String(yk3.O(byteArrayInputStream, Q), StandardCharsets.UTF_8), yk3.Q(byteArrayInputStream, 4), Q2, (int) yk3.Q(byteArrayInputStream, 4), (int) yk3.Q(byteArrayInputStream, 4), new int[Q2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            na0 na0Var = na0VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = na0Var.f;
            int i7 = na0Var.g;
            TreeMap treeMap = na0Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) yk3.Q(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int Q3 = (int) yk3.Q(byteArrayInputStream, 2);
                while (Q3 > 0) {
                    yk3.Q(byteArrayInputStream, 2);
                    int Q4 = (int) yk3.Q(byteArrayInputStream, 1);
                    if (Q4 != 6 && Q4 != 7) {
                        while (Q4 > 0) {
                            yk3.Q(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int Q5 = (int) yk3.Q(byteArrayInputStream, 1); Q5 > 0; Q5--) {
                                yk3.Q(byteArrayInputStream, 2);
                            }
                            Q4--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    Q3--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                lh.g("Read too much data during profile line parse");
                return null;
            }
            na0Var.h = K(byteArrayInputStream, na0Var.e);
            BitSet valueOf = BitSet.valueOf(yk3.O(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return na0VarArr;
    }

    public static final long Q(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    /* JADX WARN: Finally extract failed */
    public static boolean R(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, na0[] na0VarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = j8.r;
        byte[] bArr3 = j8.q;
        byte[] bArr4 = j8.n;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = j8.o;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] r = r(na0VarArr, bArr5);
                yk3.Z(byteArrayOutputStream, na0VarArr.length, 1);
                yk3.Z(byteArrayOutputStream, r.length, 4);
                byte[] z = yk3.z(r);
                yk3.Z(byteArrayOutputStream, z.length, 4);
                byteArrayOutputStream.write(z);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                yk3.Z(byteArrayOutputStream, na0VarArr.length, 1);
                for (na0 na0Var : na0VarArr) {
                    int size = na0Var.i.size() * 4;
                    String x = x(na0Var.a, na0Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    yk3.a0(byteArrayOutputStream, x.getBytes(charset).length);
                    yk3.a0(byteArrayOutputStream, na0Var.h.length);
                    yk3.Z(byteArrayOutputStream, size, 4);
                    yk3.Z(byteArrayOutputStream, na0Var.c, 4);
                    byteArrayOutputStream.write(x.getBytes(charset));
                    Iterator it = na0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        yk3.a0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        yk3.a0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : na0Var.h) {
                        yk3.a0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = j8.p;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] r2 = r(na0VarArr, bArr6);
                yk3.Z(byteArrayOutputStream, na0VarArr.length, 1);
                yk3.Z(byteArrayOutputStream, r2.length, 4);
                byte[] z2 = yk3.z(r2);
                yk3.Z(byteArrayOutputStream, z2.length, 4);
                byteArrayOutputStream.write(z2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            yk3.a0(byteArrayOutputStream, na0VarArr.length);
            for (na0 na0Var2 : na0VarArr) {
                String str = na0Var2.a;
                TreeMap treeMap = na0Var2.i;
                String x2 = x(str, na0Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                yk3.a0(byteArrayOutputStream, x2.getBytes(charset2).length);
                yk3.a0(byteArrayOutputStream, treeMap.size());
                yk3.a0(byteArrayOutputStream, na0Var2.h.length);
                yk3.Z(byteArrayOutputStream, na0Var2.c, 4);
                byteArrayOutputStream.write(x2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    yk3.a0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : na0Var2.h) {
                    yk3.a0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            yk3.a0(byteArrayOutputStream2, na0VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (na0 na0Var3 : na0VarArr) {
                yk3.Z(byteArrayOutputStream2, na0Var3.c, 4);
                yk3.Z(byteArrayOutputStream2, na0Var3.d, 4);
                yk3.Z(byteArrayOutputStream2, na0Var3.g, 4);
                String x3 = x(na0Var3.a, na0Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = x3.getBytes(charset3).length;
                yk3.a0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(x3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            j93 j93Var = new j93(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(j93Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < na0VarArr.length) {
                try {
                    na0 na0Var4 = na0VarArr[i8];
                    yk3.a0(byteArrayOutputStream3, i8);
                    yk3.a0(byteArrayOutputStream3, na0Var4.e);
                    i9 = i9 + 4 + (na0Var4.e * i6);
                    int[] iArr = na0Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        yk3.a0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            j93 j93Var2 = new j93(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(j93Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < na0VarArr.length; i14++) {
                try {
                    na0 na0Var5 = na0VarArr[i14];
                    Iterator it3 = na0Var5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        U(byteArrayOutputStream4, i15, na0Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            V(byteArrayOutputStream4, na0Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            yk3.a0(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            yk3.Z(byteArrayOutputStream3, length4, 4);
                            yk3.a0(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            j93 j93Var3 = new j93(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(j93Var3);
            long size2 = 12 + (arrayList.size() * 16);
            yk3.Z(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                j93 j93Var4 = (j93) arrayList.get(i17);
                int i18 = j93Var4.a;
                byte[] bArr7 = j93Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                yk3.Z(byteArrayOutputStream, j2, 4);
                yk3.Z(byteArrayOutputStream, size2, 4);
                if (j93Var4.c) {
                    long length5 = bArr7.length;
                    byte[] z3 = yk3.z(bArr7);
                    arrayList2.add(z3);
                    yk3.Z(byteArrayOutputStream, z3.length, 4);
                    yk3.Z(byteArrayOutputStream, length5, 4);
                    length = z3.length;
                } else {
                    arrayList2.add(bArr7);
                    yk3.Z(byteArrayOutputStream, bArr7.length, 4);
                    yk3.Z(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void S(ByteArrayOutputStream byteArrayOutputStream, na0 na0Var) {
        V(byteArrayOutputStream, na0Var);
        int i2 = na0Var.g;
        int[] iArr = na0Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            yk3.a0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : na0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void T(ByteArrayOutputStream byteArrayOutputStream, na0 na0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        yk3.a0(byteArrayOutputStream, str.getBytes(charset).length);
        yk3.a0(byteArrayOutputStream, na0Var.e);
        yk3.Z(byteArrayOutputStream, na0Var.f, 4);
        yk3.Z(byteArrayOutputStream, na0Var.c, 4);
        yk3.Z(byteArrayOutputStream, na0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void U(ByteArrayOutputStream byteArrayOutputStream, int i2, na0 na0Var) {
        int i3 = na0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : na0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, na0 na0Var) {
        int i2 = 0;
        for (Map.Entry entry : na0Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                yk3.a0(byteArrayOutputStream, intValue - i2);
                yk3.a0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static rm3 W() {
        String str;
        ClassLoader classLoader = zm3.class.getClassLoader();
        if (rm3.class.equals(rm3.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!rm3.class.getPackage().equals(zm3.class.getPackage())) {
                lh.e(rm3.class.getName());
                return null;
            }
            str = rm3.class.getPackage().getName() + ".BlazeGenerated" + rm3.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        q40.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            } catch (InstantiationException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new zm3[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e6) {
                        Logger.getLogger(lm3.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(rm3.class.getSimpleName()), (Throwable) e6);
                    }
                }
                if (arrayList.size() == 1) {
                    return (rm3) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (rm3) rm3.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                } catch (NoSuchMethodException e8) {
                    throw new IllegalStateException(e8);
                } catch (InvocationTargetException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final y6 a(y9 y9Var) {
        Canvas canvas = z6.a;
        y6 y6Var = new y6();
        y6Var.a = new Canvas(k31.a(y9Var));
        return y6Var;
    }

    public static final ea0 b(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        cq0 a2 = dq0.a(f2);
        if (a2 == null) {
            a2 = new wd1(f2);
        }
        return new ea0(f3, f2, a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0138, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r4.M(), java.lang.Integer.valueOf(r9)) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function0 function0, a00 a00Var, int i2) {
        Function0 function02;
        q80 q80Var;
        a00 a00Var2 = a00Var;
        function0.getClass();
        a00Var2.Z(1204251629);
        int i3 = 2;
        int i4 = i2 | (a00Var2.h(function0) ? 4 : 2);
        if (a00Var2.P(i4 & 1, (i4 & 3) != 2)) {
            List g2 = qv.g(new ul2(R.drawable.mascot_goose, R.string.ml_ob1_title, R.string.ml_ob1_body), new ul2(R.drawable.mascot_goose_tip, R.string.ml_ob2_title, R.string.ml_ob2_body), new ul2(R.drawable.mascot_goose_happy, R.string.ml_ob3_title, R.string.ml_ob3_body));
            boolean f2 = a00Var2.f(g2);
            Object M = a00Var2.M();
            Object obj = sz.a;
            if (f2 || M == obj) {
                M = new dj(3, g2);
                a00Var2.i0(M);
            }
            Function0 function03 = (Function0) M;
            ky1 ky1Var = uy1.a;
            Object[] objArr = new Object[0];
            tt1 tt1Var = q80.H;
            boolean d2 = a00Var2.d(0) | a00Var2.c(0.0f) | a00Var2.f(function03);
            Object M2 = a00Var2.M();
            if (d2 || M2 == obj) {
                M2 = new xi(i3, function03);
                a00Var2.i0(M2);
            }
            q80 q80Var2 = (q80) ll3.Q(objArr, tt1Var, (Function0) M2, a00Var2, 0, 4);
            q80Var2.G.setValue(function03);
            Object M3 = a00Var2.M();
            if (M3 == obj) {
                M3 = l41.x(h.m, a00Var2);
                a00Var2.i0(M3);
            }
            a50 a50Var = (a50) M3;
            boolean z = q80Var2.j() == qv.f(g2);
            sl1 sl1Var = sl1.a;
            vl1 a2 = a.a(b.b(sl1Var, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b))));
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = bd3.E(a00Var2, a2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var2, e2, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var2, l2, scVar2);
            sc scVar3 = oz.g;
            if (a00Var2.S) {
                q80Var = q80Var2;
            } else {
                q80Var = q80Var2;
            }
            q40.r(D, a00Var2, D, scVar3);
            sc scVar4 = oz.d;
            uj2.e(a00Var2, E, scVar4);
            vl1 h2 = androidx.compose.foundation.layout.a.h(b.b(sl1Var, 1.0f), 24.0f);
            qw a3 = ow.a(s93.c, qb2.A, a00Var2, 0);
            int D2 = iv1.D(a00Var2);
            v02 l3 = a00Var2.l();
            vl1 E2 = bd3.E(a00Var2, h2);
            a00Var2.b0();
            boolean z2 = z;
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a3, scVar);
            uj2.e(a00Var2, l3, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var2, D2, scVar3);
            }
            uj2.e(a00Var2, E2, scVar4);
            vl1 c2 = b.c(sl1Var, 1.0f);
            vh vhVar = s93.b;
            zn znVar = qb2.y;
            fc2 a4 = ec2.a(vhVar, znVar, a00Var2, 6);
            int D3 = iv1.D(a00Var2);
            v02 l4 = a00Var2.l();
            vl1 E3 = bd3.E(a00Var2, c2);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a4, scVar);
            uj2.e(a00Var2, l4, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var2, D3, scVar3);
            }
            uj2.e(a00Var2, E3, scVar4);
            int i5 = i4 & 14;
            s93.q(function0, null, false, null, null, null, ap.b, a00Var, 805306368 | i5);
            a00Var.q(true);
            q80 q80Var3 = q80Var;
            ll3.b(q80Var3, new LayoutWeightElement(1.0f, true), null, null, null, null, false, null, null, yj1.H(-820590581, new ma(1, g2), a00Var), a00Var, 0);
            vl1 j2 = androidx.compose.foundation.layout.a.j(b.c(sl1Var, 1.0f), 0.0f, 20.0f, 1);
            fc2 a5 = ec2.a(s93.d, znVar, a00Var, 6);
            int D4 = iv1.D(a00Var);
            v02 l5 = a00Var.l();
            vl1 E4 = bd3.E(a00Var, j2);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a5, scVar);
            uj2.e(a00Var, l5, scVar2);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D4))) {
                q40.r(D4, a00Var, D4, scVar3);
            }
            uj2.e(a00Var, E4, scVar4);
            a00Var.X(-532474258);
            int size = g2.size();
            int i6 = 0;
            while (i6 < size) {
                boolean z3 = i6 == q80Var3.j();
                fp.a(a.b(yk3.u(b.h(androidx.compose.foundation.layout.a.j(sl1Var, 4.0f, 0.0f, 2), z3 ? 10.0f : 8.0f), zb2.a(999.0f)), z3 ? cw.w : cw.j, ap.e), a00Var, 0);
                nk2.a(a00Var, b.h(sl1Var, 1.0f));
                i6++;
            }
            a00Var.q(false);
            a00Var.q(true);
            String f3 = uj2.f(z2 ? R.string.ob_get_started : R.string.action_next, a00Var);
            boolean g3 = a00Var.g(z2) | (i5 == 4) | a00Var.h(a50Var) | a00Var.f(q80Var3);
            Object M4 = a00Var.M();
            if (g3 || M4 == obj) {
                function02 = function0;
                M4 = new nu0(z2, function02, a50Var, q80Var3);
                a00Var.i0(M4);
            } else {
                function02 = function0;
            }
            yi1.a(f3, (Function0) M4, b.c(sl1Var, 1.0f), null, false, a00Var, 384, 24);
            a00Var2 = a00Var;
            a00Var2.q(true);
            a00Var2.q(true);
        } else {
            function02 = function0;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new di0(i2, function02);
        }
    }

    public static final long d(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void e(my myVar, a00 a00Var, int i2) {
        a00 a00Var2;
        a00Var.Z(674185128);
        int i3 = 2;
        if ((i2 & 3) == 2 && a00Var.B()) {
            a00Var.S();
            a00Var2 = a00Var;
        } else {
            t52 t52Var = nd2.a;
            ld2 ld2Var = (ld2) a00Var.j(t52Var);
            Object[] objArr = {ld2Var};
            tt1 tt1Var = new tt1(10, sc.F, new fc1(ld2Var, 1));
            boolean h2 = a00Var.h(ld2Var);
            Object M = a00Var.M();
            if (h2 || M == sz.a) {
                M = new u(16, ld2Var);
                a00Var.i0(M);
            }
            Function0 function0 = (Function0) M;
            a00Var2 = a00Var;
            Object obj = (gc1) ll3.Q(objArr, tt1Var, function0, a00Var2, 0, 4);
            yk3.a(t52Var.a(obj), yj1.H(1863926504, new n8(14, obj, myVar), a00Var2), a00Var2, 56);
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new x5(myVar, i2, i3);
        }
    }

    public static final vo2 f(Object obj) {
        if (obj == null) {
            obj = yj1.k;
        }
        return new vo2(obj);
    }

    public static Object g(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:10:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(ur2 ur2Var, hn hnVar) {
        gh2 gh2Var;
        int i2;
        int size;
        int i3;
        if (hnVar instanceof gh2) {
            gh2Var = (gh2) hnVar;
            int i4 = gh2Var.o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gh2Var.o = i4 - Integer.MIN_VALUE;
                Object obj = gh2Var.n;
                b50 b50Var = b50.m;
                i2 = gh2Var.o;
                if (i2 != 0) {
                    ca2.b(obj);
                    n22 n22Var = n22.n;
                    gh2Var.m = ur2Var;
                    gh2Var.o = 1;
                    obj = ur2Var.a(n22Var, gh2Var);
                    if (obj == b50Var) {
                    }
                    m22 m22Var = (m22) obj;
                    List list = m22Var.a;
                    size = list.size();
                    i3 = 0;
                    while (i3 < size) {
                    }
                    return m22Var;
                }
                if (i2 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ur2Var = gh2Var.m;
                ca2.b(obj);
                m22 m22Var2 = (m22) obj;
                List list2 = m22Var2.a;
                size = list2.size();
                i3 = 0;
                while (i3 < size) {
                    if (s93.z((t22) list2.get(i3))) {
                        i3++;
                    } else {
                        n22 n22Var2 = n22.n;
                        gh2Var.m = ur2Var;
                        gh2Var.o = 1;
                        obj = ur2Var.a(n22Var2, gh2Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                        m22 m22Var22 = (m22) obj;
                        List list22 = m22Var22.a;
                        size = list22.size();
                        i3 = 0;
                        while (i3 < size) {
                        }
                    }
                }
                return m22Var22;
            }
        }
        gh2Var = new gh2(hnVar);
        Object obj2 = gh2Var.n;
        b50 b50Var2 = b50.m;
        i2 = gh2Var.o;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(ur2 ur2Var, ot2 ot2Var, yf yfVar, m22 m22Var, hn hnVar) {
        hh2 hh2Var;
        int i2;
        gv2 gv2Var;
        sc1 sc1Var;
        ur2 ur2Var2 = ur2Var;
        ot2 ot2Var2 = ot2Var;
        if (hnVar instanceof hh2) {
            hh2Var = (hh2) hnVar;
            int i3 = hh2Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hh2Var.p = i3 - Integer.MIN_VALUE;
                hh2 hh2Var2 = hh2Var;
                Object obj = hh2Var2.o;
                b50 b50Var = b50.m;
                i2 = hh2Var2.p;
                int i4 = 0;
                int i5 = 1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ot2 ot2Var3 = hh2Var2.n;
                        ur2 ur2Var3 = hh2Var2.m;
                        ca2.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            List list = ur2Var3.r.F.a;
                            int size = list.size();
                            while (i4 < size) {
                                t22 t22Var = (t22) list.get(i4);
                                if (s93.A(t22Var)) {
                                    t22Var.a();
                                }
                                i4++;
                            }
                        }
                        ot2Var3.getClass();
                        return Unit.a;
                    }
                    if (i2 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ot2 ot2Var4 = hh2Var2.n;
                    ur2 ur2Var4 = hh2Var2.m;
                    ca2.b(obj);
                    ot2Var2 = ot2Var4;
                    ur2Var2 = ur2Var4;
                    if (((Boolean) obj).booleanValue()) {
                        List list2 = ur2Var2.r.F.a;
                        int size2 = list2.size();
                        while (i4 < size2) {
                            t22 t22Var2 = (t22) list2.get(i4);
                            if (s93.A(t22Var2)) {
                                t22Var2.a();
                            }
                            i4++;
                        }
                    }
                    ot2Var2.getClass();
                    return Unit.a;
                }
                ca2.b(obj);
                g53 g53Var = (g53) yfVar.o;
                t22 t22Var3 = (t22) yfVar.p;
                t22 t22Var4 = (t22) m22Var.a.get(0);
                if (t22Var3 != null && t22Var4.b - t22Var3.b < g53Var.b()) {
                    int i6 = t22Var3.i;
                    float f2 = gd0.a;
                    if (au1.c(au1.f(t22Var3.c, t22Var4.c)) < (i6 == 2 ? g53Var.d() * gd0.a : g53Var.d())) {
                        yfVar.n++;
                        yfVar.p = t22Var4;
                        t22 t22Var5 = (t22) m22Var.a.get(0);
                        int i7 = yfVar.n;
                        dh2 dh2Var = i7 == 1 ? i7 != 2 ? by1.w : by1.v : by1.u;
                        long j2 = t22Var5.c;
                        gv2Var = (gv2) ot2Var2.n;
                        if (gv2Var.h() || gv2Var.j().a.n.length() == 0 || (sc1Var = gv2Var.d) == null || sc1Var.d() == null) {
                            i5 = 0;
                        } else {
                            to0 to0Var = gv2Var.i;
                            if (to0Var != null) {
                                to0Var.a(new cv2(i5, 26));
                            }
                            gv2Var.l = j2;
                            gv2Var.q = -1;
                            gv2Var.f(true);
                            ot2Var2.i(gv2Var.j(), gv2Var.l, true, dh2Var);
                        }
                        if (i5 != 0) {
                            long j3 = t22Var5.a;
                            ih2 ih2Var = new ih2(i4, ot2Var2, dh2Var);
                            hh2Var2.m = ur2Var2;
                            hh2Var2.n = ot2Var2;
                            hh2Var2.p = 2;
                            obj = gd0.c(ur2Var2, j3, ih2Var, hh2Var2);
                            if (obj == b50Var) {
                                return b50Var;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            ot2Var2.getClass();
                        }
                        return Unit.a;
                    }
                }
                yfVar.n = 1;
                yfVar.p = t22Var4;
                t22 t22Var52 = (t22) m22Var.a.get(0);
                int i72 = yfVar.n;
                dh2 dh2Var2 = i72 == 1 ? i72 != 2 ? by1.w : by1.v : by1.u;
                long j22 = t22Var52.c;
                gv2Var = (gv2) ot2Var2.n;
                if (gv2Var.h()) {
                }
                i5 = 0;
                if (i5 != 0) {
                }
                return Unit.a;
            }
        }
        hh2Var = new hh2(hnVar);
        hh2 hh2Var22 = hh2Var;
        Object obj2 = hh2Var22.o;
        b50 b50Var2 = b50.m;
        i2 = hh2Var22.p;
        int i42 = 0;
        int i52 = 1;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r15 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067 A[Catch: CancellationException -> 0x0031, TryCatch #0 {CancellationException -> 0x0031, blocks: (B:12:0x002c, B:13:0x00ab, B:15:0x00b3, B:17:0x00bf, B:19:0x00cb, B:21:0x00ce, B:24:0x00d1, B:28:0x00d5, B:32:0x0040, B:34:0x0063, B:36:0x0067, B:38:0x0073, B:39:0x007f, B:43:0x0092, B:47:0x007b, B:49:0x004a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(ur2 ur2Var, bu2 bu2Var, m22 m22Var, hn hnVar) {
        jh2 jh2Var;
        int i2;
        t22 t22Var;
        t22 t22Var2;
        try {
            if (hnVar instanceof jh2) {
                jh2Var = (jh2) hnVar;
                int i3 = jh2Var.q;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jh2Var.q = i3 - Integer.MIN_VALUE;
                    Object obj = jh2Var.p;
                    b50 b50Var = b50.m;
                    i2 = jh2Var.q;
                    int i4 = 1;
                    if (i2 != 0) {
                        ca2.b(obj);
                        t22Var = (t22) zv.u(m22Var.a);
                        long j2 = t22Var.a;
                        jh2Var.m = ur2Var;
                        jh2Var.n = bu2Var;
                        jh2Var.o = t22Var;
                        jh2Var.q = 1;
                        obj = gd0.b(ur2Var, j2, jh2Var);
                        if (obj == b50Var) {
                            return b50Var;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            bu2Var = jh2Var.n;
                            ur2Var = jh2Var.m;
                            ca2.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                List list = ur2Var.r.F.a;
                                int size = list.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    t22 t22Var3 = (t22) list.get(i5);
                                    if (s93.A(t22Var3)) {
                                        t22Var3.a();
                                    }
                                }
                                bu2Var.a();
                            } else {
                                bu2Var.onCancel();
                            }
                            return Unit.a;
                        }
                        t22 t22Var4 = jh2Var.o;
                        bu2Var = jh2Var.n;
                        ur2 ur2Var2 = jh2Var.m;
                        ca2.b(obj);
                        t22Var = t22Var4;
                        ur2Var = ur2Var2;
                    }
                    t22Var2 = (t22) obj;
                    if (t22Var2 != null) {
                        long j3 = t22Var2.c;
                        g53 h2 = ur2Var.h();
                        int i6 = t22Var.i;
                        float f2 = gd0.a;
                        if (au1.c(au1.f(t22Var.c, j3)) < (i6 == 2 ? h2.d() * gd0.a : h2.d())) {
                            bu2Var.c(j3);
                            long j4 = t22Var2.a;
                            jg1 jg1Var = new jg1(bu2Var, i4);
                            jh2Var.m = ur2Var;
                            jh2Var.n = bu2Var;
                            jh2Var.o = null;
                            jh2Var.q = 2;
                            obj = gd0.c(ur2Var, j4, jg1Var, jh2Var);
                        }
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            t22Var2 = (t22) obj;
            if (t22Var2 != null) {
            }
            return Unit.a;
        } catch (CancellationException e2) {
            bu2Var.onCancel();
            throw e2;
        }
        jh2Var = new jh2(hnVar);
        Object obj2 = jh2Var.p;
        b50 b50Var2 = b50.m;
        i2 = jh2Var.q;
        int i42 = 1;
    }

    public static String k(String str, int i2, int i3) {
        if (i2 < 0) {
            return zj2.j("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zj2.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void l(int i2, int i3) {
        String j2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                j2 = zj2.j("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                j2 = zj2.j("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(j2);
        }
    }

    public static void m(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void n(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            a.c(k(FirebaseAnalytics.Param.INDEX, i2, i3));
        }
    }

    public static void o(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? k("start index", i2, i4) : (i3 < 0 || i3 > i4) ? k("end index", i3, i4) : zj2.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static final boolean p(yo0 yo0Var, boolean z) {
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal == 0) {
            ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).g(null);
            yo0Var.G0(xo0.m, xo0.p);
            return true;
        }
        if (ordinal == 1) {
            yo0 C = j8.C(yo0Var);
            if (!(C != null ? p(C, z) : true)) {
                return false;
            }
            yo0Var.G0(xo0.n, xo0.p);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            a.b();
            return false;
        }
        if (z) {
            ((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).g(null);
            yo0Var.G0(xo0.o, xo0.p);
        }
        return z;
    }

    public static zn1 q() {
        return new lz1(Unit.a, qb2.Z);
    }

    public static byte[] r(na0[] na0VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (na0 na0Var : na0VarArr) {
            i3 += ((((na0Var.g * 2) + 7) & (-8)) / 8) + (na0Var.e * 2) + x(na0Var.a, na0Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + na0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, j8.p)) {
            int length = na0VarArr.length;
            while (i2 < length) {
                na0 na0Var2 = na0VarArr[i2];
                T(byteArrayOutputStream, na0Var2, x(na0Var2.a, na0Var2.b, bArr));
                S(byteArrayOutputStream, na0Var2);
                i2++;
            }
        } else {
            for (na0 na0Var3 : na0VarArr) {
                T(byteArrayOutputStream, na0Var3, x(na0Var3.a, na0Var3.b, bArr));
            }
            int length2 = na0VarArr.length;
            while (i2 < length2) {
                S(byteArrayOutputStream, na0VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final void s(gl0 gl0Var, qz1 qz1Var) {
        try {
            IOException iOException = null;
            for (qz1 qz1Var2 : gl0Var.g(qz1Var)) {
                try {
                    if (gl0Var.h(qz1Var2).b) {
                        s(gl0Var, qz1Var2);
                    }
                    gl0Var.d(qz1Var2);
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static boolean t(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = t(file2) && z;
        }
        return z;
    }

    public static op1 u(rp1 rp1Var) {
        Sequence c2 = aj2.c(rp1Var, bl0.L);
        c2.getClass();
        Iterator it = c2.iterator();
        if (!it.hasNext()) {
            ch2.k("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (op1) next;
    }

    public static long v(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    v10.m(i7);
                    throw new k81();
                }
                i6 = 8190;
            }
        }
        return v10.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long w(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    v10.m(i7);
                    throw new k81();
                }
                i6 = 8190;
            }
        }
        return v10.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static String x(String str, String str2, byte[] bArr) {
        byte[] bArr2 = j8.q;
        byte[] bArr3 = j8.r;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return q40.p(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static final rj1 y(ob1 ob1Var, int i2, long j2, iy1 iy1Var, long j3, ww1 ww1Var, yn ynVar, zn znVar, u81 u81Var, boolean z, int i3) {
        return new rj1(i2, i3, ob1Var.a(j2, i2), j3, iy1Var.d(i2), ww1Var, ynVar, znVar, u81Var, z);
    }

    public static final ArrayList z(h41 h41Var) {
        h41Var.getClass();
        i91 x0 = ((qg1) h41Var).x0();
        boolean D = D(x0);
        bo1 bo1Var = (bo1) x0.o();
        eo1 eo1Var = bo1Var.m;
        ArrayList arrayList = new ArrayList(eo1Var.o);
        int i2 = eo1Var.o;
        for (int i3 = 0; i3 < i2; i3++) {
            i91 i91Var = (i91) bo1Var.get(i3);
            arrayList.add(D ? i91Var.l() : i91Var.m());
        }
        return arrayList;
    }
}
