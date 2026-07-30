package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.input.nestedscroll.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class yk3 implements wg2 {
    public static UserManager m = null;
    public static volatile boolean n = false;
    public static final ng0 o = new ng0("RESUME_TOKEN", 1);
    public static final int[] p = new int[0];
    public static final long[] q = new long[0];
    public static final Object[] r = new Object[0];
    public static final int[] s = new int[2];
    public static final va t = new va(1000);
    public static final ex2 u;

    static {
        new va(1007);
        new va(1008);
        new va(1002);
        u = new ex2(0, new long[0], new Object[0]);
    }

    public static final sd A(sd sdVar) {
        sd c = sdVar.c();
        int b = c.b();
        for (int i = 0; i < b; i++) {
            c.e(i, sdVar.a(i));
        }
        return c;
    }

    public static void B(yd0 yd0Var, bx1 bx1Var, long j) {
        if (bx1Var instanceof zw1) {
            w72 w72Var = ((zw1) bx1Var).a;
            float f = w72Var.a;
            float f2 = w72Var.b;
            yd0Var.P(j, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), S(w72Var), 3);
            return;
        }
        if (!(bx1Var instanceof ax1)) {
            if (bx1Var instanceof yw1) {
                yd0Var.b0(((yw1) bx1Var).a, j);
                return;
            } else {
                a.b();
                return;
            }
        }
        ax1 ax1Var = (ax1) bx1Var;
        oa oaVar = ax1Var.b;
        if (oaVar != null) {
            yd0Var.b0(oaVar, j);
            return;
        }
        ub2 ub2Var = ax1Var.a;
        float f3 = ub2Var.b;
        float f4 = ub2Var.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (ub2Var.h >> 32));
        float f5 = ub2Var.c - f4;
        float f6 = ub2Var.d - f3;
        yd0Var.z(j, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L), (4294967295L & Float.floatToRawIntBits(intBitsToFloat)) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public static final float C(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final t81 D(t81 t81Var) {
        t81 t81Var2;
        t81 j = t81Var.j();
        while (true) {
            t81 t81Var3 = j;
            t81Var2 = t81Var;
            t81Var = t81Var3;
            if (t81Var == null) {
                break;
            }
            j = t81Var.j();
        }
        ks1 ks1Var = t81Var2 instanceof ks1 ? (ks1) t81Var2 : null;
        if (ks1Var == null) {
            return t81Var2;
        }
        ks1 ks1Var2 = ks1Var.C;
        while (true) {
            ks1 ks1Var3 = ks1Var2;
            ks1 ks1Var4 = ks1Var;
            ks1Var = ks1Var3;
            if (ks1Var == null) {
                return ks1Var4;
            }
            ks1Var2 = ks1Var.C;
        }
    }

    public static hp1 E(t53 t53Var) {
        h50 h50Var = h50.b;
        h50Var.getClass();
        js0 js0Var = new js0(t53Var, hp1.c, h50Var);
        gu a = d82.a(hp1.class);
        String b = a.b();
        if (b != null) {
            return (hp1) js0Var.x(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        lh.e("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static final vg2 F(Object obj) {
        if (obj != tk3.f) {
            return (vg2) obj;
        }
        lh.g("Does not contain segment");
        return null;
    }

    public static SimpleDateFormat G(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                lh.e(in1.k(i, "Unknown DateFormat style: "));
                return null;
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                lh.e(in1.k(i2, "Unknown DateFormat style: "));
                return null;
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final boolean H(Object obj) {
        return obj == tk3.f;
    }

    public static boolean I(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static int J(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        dm0.j(q40.j("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
        return 0;
    }

    public static final float K(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int L(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static byte[] O(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                lh.g(in1.k(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] P(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long Q(InputStream inputStream, int i) {
        byte[] O = O(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (O[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final long R(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long S(w72 w72Var) {
        float f = w72Var.c - w72Var.a;
        float f2 = w72Var.d - w72Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void T(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int b0 = b0(parcel, i);
        parcel.writeBundle(bundle);
        c0(parcel, b0);
    }

    public static void U(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int b0 = b0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        c0(parcel, b0);
    }

    public static void V(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int b0 = b0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        c0(parcel, b0);
    }

    public static void W(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int b0 = b0(parcel, i);
        parcel.writeString(str);
        c0(parcel, b0);
    }

    public static void X(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int b0 = b0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        c0(parcel, b0);
    }

    public static void Y(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int b0 = b0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        c0(parcel, b0);
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ye yeVar, Function2 function2, a00 a00Var, int i) {
        r33 r33Var;
        boolean z;
        n72 s2;
        a00Var.Z(-149765515);
        y31 y31Var = a00Var.x;
        v02 l = a00Var.l();
        a00Var.V(201, b00.b);
        Object M = a00Var.M();
        if (Intrinsics.b(M, sz.a)) {
            r33Var = null;
        } else {
            M.getClass();
            r33Var = (r33) M;
        }
        t52 t52Var = (t52) yeVar.f;
        r33 c = t52Var.c(yeVar, r33Var);
        boolean equals = c.equals(r33Var);
        if (!equals) {
            a00Var.i0(c);
        }
        int i2 = 1;
        if (a00Var.S) {
            if (yeVar.e || !l.containsKey(t52Var)) {
                l = l.g(t52Var, c);
            }
            a00Var.J = true;
        } else {
            vl2 vl2Var = a00Var.G;
            Object b = vl2Var.b(vl2Var.b, vl2Var.g);
            b.getClass();
            v02 v02Var = (v02) b;
            if (!(a00Var.B() && equals) && (yeVar.e || !l.containsKey(t52Var))) {
                l = l.g(t52Var, c);
            } else if ((equals && !a00Var.w) || !a00Var.w) {
                l = v02Var;
            }
            if (a00Var.y || v02Var != l) {
                z = true;
                if (z && !a00Var.S) {
                    a00Var.K(l);
                }
                y31Var.c(a00Var.w ? 1 : 0);
                a00Var.w = z;
                a00Var.K = l;
                a00Var.T(202, 0, b00.c, l);
                function2.invoke(a00Var, Integer.valueOf((i >> 3) & 14));
                a00Var.q(false);
                a00Var.q(false);
                a00Var.w = y31Var.b() != 0;
                a00Var.K = null;
                s2 = a00Var.s();
                if (s2 == null) {
                    s2.d = new ky(i, i2, yeVar, function2);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            a00Var.K(l);
        }
        y31Var.c(a00Var.w ? 1 : 0);
        a00Var.w = z;
        a00Var.K = l;
        a00Var.T(202, 0, b00.c, l);
        function2.invoke(a00Var, Integer.valueOf((i >> 3) & 14));
        a00Var.q(false);
        a00Var.q(false);
        a00Var.w = y31Var.b() != 0;
        a00Var.K = null;
        s2 = a00Var.s();
        if (s2 == null) {
        }
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, int i) {
        Z(byteArrayOutputStream, i, 2);
    }

    public static int b0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ye[] yeVarArr, Function2 function2, a00 a00Var, int i) {
        v02 h0;
        boolean z;
        n72 s2;
        a00Var.Z(415205898);
        y31 y31Var = a00Var.x;
        v02 l = a00Var.l();
        a00Var.V(201, b00.b);
        if (a00Var.S) {
            h0 = a00Var.h0(l, ll3.b0(yeVarArr, l, v02.s));
            a00Var.J = true;
        } else {
            vl2 vl2Var = a00Var.G;
            Object h = vl2Var.h(vl2Var.g, 0);
            h.getClass();
            v02 v02Var = (v02) h;
            vl2 vl2Var2 = a00Var.G;
            Object h2 = vl2Var2.h(vl2Var2.g, 1);
            h2.getClass();
            v02 v02Var2 = (v02) h2;
            v02 b0 = ll3.b0(yeVarArr, l, v02Var2);
            if (a00Var.B() && !a00Var.y && v02Var2.equals(b0)) {
                a00Var.l = a00Var.G.s() + a00Var.l;
                h0 = v02Var;
            } else {
                h0 = a00Var.h0(l, b0);
                if (a00Var.y || !Intrinsics.b(h0, v02Var)) {
                    z = true;
                    if (z && !a00Var.S) {
                        a00Var.K(h0);
                    }
                    y31Var.c(a00Var.w ? 1 : 0);
                    a00Var.w = z;
                    a00Var.K = h0;
                    a00Var.T(202, 0, b00.c, h0);
                    function2.invoke(a00Var, Integer.valueOf((i >> 3) & 14));
                    a00Var.q(false);
                    a00Var.q(false);
                    a00Var.w = y31Var.b() != 0;
                    a00Var.K = null;
                    s2 = a00Var.s();
                    if (s2 == null) {
                        s2.d = new ky(i, 2, yeVarArr, function2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            a00Var.K(h0);
        }
        y31Var.c(a00Var.w ? 1 : 0);
        a00Var.w = z;
        a00Var.K = h0;
        a00Var.T(202, 0, b00.c, h0);
        function2.invoke(a00Var, Integer.valueOf((i >> 3) & 14));
        a00Var.q(false);
        a00Var.q(false);
        a00Var.w = y31Var.b() != 0;
        a00Var.K = null;
        s2 = a00Var.s();
        if (s2 == null) {
        }
    }

    public static void c0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void d0(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final void e(ab0 ab0Var, a00 a00Var, int i) {
        a00Var.Z(294589392);
        int i2 = i | (a00Var.f(ab0Var) ? 4 : 2);
        int i3 = 8;
        if ((i2 & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            kd2 S = ll3.S(a00Var);
            zn1 b = ij2.b(ab0Var.b().e, a00Var);
            List list = (List) b.getValue();
            boolean booleanValue = ((Boolean) a00Var.j(g31.a)).booleanValue();
            boolean f = a00Var.f(list);
            Object M = a00Var.M();
            Object obj = sz.a;
            Object obj2 = M;
            if (f || M == obj) {
                fn2 fn2Var = new fn2();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    cp1 cp1Var = (cp1) obj3;
                    if (booleanValue || cp1Var.t.c.compareTo(zc1.p) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                fn2Var.addAll(arrayList);
                a00Var.i0(fn2Var);
                obj2 = fn2Var;
            }
            fn2 fn2Var2 = (fn2) obj2;
            j(fn2Var2, (List) b.getValue(), a00Var, 0);
            zn1 b2 = ij2.b(ab0Var.b().f, a00Var);
            Object M2 = a00Var.M();
            if (M2 == obj) {
                M2 = new fn2();
                a00Var.i0(M2);
            }
            fn2 fn2Var3 = (fn2) M2;
            a00Var.X(1361037007);
            ListIterator listIterator = fn2Var2.listIterator();
            while (true) {
                sx0 sx0Var = (sx0) listIterator;
                if (!sx0Var.hasNext()) {
                    break;
                }
                cp1 cp1Var2 = (cp1) sx0Var.next();
                op1 op1Var = cp1Var2.n;
                op1Var.getClass();
                za0 za0Var = (za0) op1Var;
                boolean h = ((i2 & 14) == 4) | a00Var.h(cp1Var2);
                Object M3 = a00Var.M();
                if (h || M3 == obj) {
                    M3 = new k7(i3, ab0Var, cp1Var2);
                    a00Var.i0(M3);
                }
                j8.c((Function0) M3, za0Var.v, yj1.H(1129586364, new ua0(cp1Var2, ab0Var, S, fn2Var3, za0Var), a00Var), a00Var, 384);
                i3 = 8;
            }
            a00Var.q(false);
            Set set = (Set) b2.getValue();
            boolean f2 = a00Var.f(b2) | ((i2 & 14) == 4);
            Object M4 = a00Var.M();
            if (f2 || M4 == obj) {
                M4 = new va0(b2, ab0Var, fn2Var3, (o30) null);
                a00Var.i0(M4);
            }
            l41.i(set, fn2Var3, (Function2) M4, a00Var);
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new c0(i, 8, ab0Var);
        }
    }

    public static final long h(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x031c, code lost:
    
        if (r49.f(r47) != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x033b, code lost:
    
        if (r49.d(0) == false) goto L234;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0352 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x033e  */
    /* JADX WARN: Type inference failed for: r12v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(vl1 vl1Var, q80 q80Var, yx1 yx1Var, im2 im2Var, boolean z, by1 by1Var, hr1 hr1Var, zn znVar, by1 by1Var2, my myVar, a00 a00Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r12;
        boolean f;
        Object bdVar;
        ww1 ww1Var;
        int i6;
        boolean z5;
        int i7;
        a50 a50Var;
        q80 q80Var2;
        q71 q71Var;
        boolean g;
        boolean z6;
        Object obj2;
        boolean f2;
        int i8;
        boolean z7;
        q80 q80Var3;
        vl1 k;
        boolean z8;
        hr1 hr1Var2 = hr1Var;
        yn ynVar = qb2.B;
        a00Var.Z(538371694);
        if ((i & 6) == 0) {
            i3 = (a00Var.f(vl1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= a00Var.f(q80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= a00Var.f(yx1Var) ? 256 : 128;
        }
        int i9 = i3;
        if ((i & 3072) == 0) {
            i4 = i9 | (a00Var.g(false) ? 2048 : 1024);
        } else {
            i4 = i9;
        }
        int i10 = i & 24576;
        int i11 = Utility.DEFAULT_STREAM_BUFFER_SIZE;
        ww1 ww1Var2 = ww1.n;
        if (i10 == 0) {
            i4 |= a00Var.f(ww1Var2) ? 16384 : 8192;
        }
        int i12 = i & 196608;
        int i13 = NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        if (i12 == 0) {
            i4 |= a00Var.f(im2Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= a00Var.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= a00Var.d(0) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= a00Var.c(0.0f) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= a00Var.f(by1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (a00Var.h(hr1Var2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= a00Var.h(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= a00Var.f(ynVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= a00Var.f(znVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (a00Var.f(by1Var2)) {
                i11 = 16384;
            }
            i5 |= i11;
        }
        if ((i2 & 196608) == 0) {
            if (a00Var.h(myVar)) {
                i13 = 131072;
            }
            i5 |= i13;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 74899) == 74898 && a00Var.B()) {
            a00Var.S();
            q80Var3 = q80Var;
        } else {
            int i14 = i4 & 112;
            boolean z9 = i14 == 32;
            Object M = a00Var.M();
            nj njVar = sz.a;
            if (z9 || M == njVar) {
                rb1 rb1Var = new rb1(q80Var, 1);
                a00Var.i0(rb1Var);
                obj = rb1Var;
            } else {
                obj = M;
            }
            Function0 function0 = (Function0) obj;
            int i15 = i4 >> 3;
            int i16 = i15 & 14;
            int i17 = i5 >> 12;
            int i18 = i16 | (i17 & 112) | ((i5 << 3) & 896);
            zn1 k2 = ij2.k(myVar, a00Var);
            zn1 k3 = ij2.k(null, a00Var);
            boolean f3 = ((((i18 & 14) ^ 6) > 4 && a00Var.f(q80Var)) || (i18 & 6) == 4) | a00Var.f(k2) | a00Var.f(k3) | a00Var.f(function0);
            Object M2 = a00Var.M();
            if (f3 || M2 == njVar) {
                by1 by1Var3 = by1.q;
                M2 = new ga1(0, 1, so2.class, ij2.e(by1Var3, new k7(14, ij2.e(by1Var3, new bn(k2, k3, function0, 4)), q80Var)), "value", "getValue()Ljava/lang/Object;");
                a00Var.i0(M2);
            }
            q71 q71Var2 = (q71) M2;
            Object M3 = a00Var.M();
            if (M3 == njVar) {
                q00 q00Var = new q00(l41.x(h.m, a00Var));
                a00Var.i0(q00Var);
                M3 = q00Var;
            }
            a50 a50Var2 = ((q00) M3).m;
            boolean z10 = i14 == 32;
            Object M4 = a00Var.M();
            Object obj3 = M4;
            if (z10 || M4 == njVar) {
                rb1 rb1Var2 = new rb1(q80Var, 0);
                a00Var.i0(rb1Var2);
                obj3 = rb1Var2;
            }
            Function0 function02 = (Function0) obj3;
            int i19 = i4 & 7168;
            int i20 = i4 >> 6;
            int i21 = (65520 & i4) | (i20 & 458752) | (i20 & 3670016) | (i20 & 29360128);
            int i22 = i5 << 18;
            int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
            boolean z11 = ((((i23 & 896) ^ 384) > 256 && a00Var.f(yx1Var)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) > 32 && a00Var.f(q80Var)) || (i23 & 48) == 32) | ((((i23 & 7168) ^ 3072) > 2048 && a00Var.g(false)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) > 16384 && a00Var.f(ww1Var2)) || (i23 & 24576) == 16384) | ((((i23 & 234881024) ^ 100663296) > 67108864 && a00Var.f(ynVar)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && a00Var.f(znVar)) || (i23 & 805306368) == 536870912) | ((((i23 & 3670016) ^ 1572864) > 1048576 && a00Var.c(0.0f)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) > 8388608 && a00Var.f(by1Var)) || (i23 & 12582912) == 8388608);
            if (((i17 & 14) ^ 6) <= 4) {
            }
            if ((i17 & 6) != 4) {
                z2 = false;
                boolean f4 = z11 | z2 | a00Var.f(function02);
                if (((i23 & 458752) ^ 196608) <= 131072) {
                    z8 = false;
                    z3 = false;
                } else {
                    z3 = false;
                }
                z8 = z3;
                if ((i23 & 196608) != 131072) {
                    z4 = z3 ? 1 : 0;
                    r12 = z3;
                    f = f4 | z4 | a00Var.f(a50Var2);
                    Object M5 = a00Var.M();
                    if (!f || M5 == njVar) {
                        ww1Var = ww1Var2;
                        i6 = 4;
                        z5 = true;
                        i7 = i4;
                        bdVar = new bd(q80Var, yx1Var, by1Var, q71Var2, function02, znVar, by1Var2, a50Var2);
                        a50Var = a50Var2;
                        q80Var2 = q80Var;
                        q71Var = q71Var2;
                        a00Var.i0(bdVar);
                    } else {
                        a50Var = a50Var2;
                        q71Var = q71Var2;
                        i7 = i4;
                        ww1Var = ww1Var2;
                        bdVar = M5;
                        i6 = 4;
                        z5 = true;
                        q80Var2 = q80Var;
                    }
                    Function2 function2 = (Function2) bdVar;
                    g = ((((i16 ^ 6) > i6 || !a00Var.f(q80Var2)) && (i15 & 6) != i6) ? r12 : z5) | a00Var.g(r12);
                    Object M6 = a00Var.M();
                    Object obj4 = M6;
                    if (!g || M6 == njVar) {
                        ac1 ac1Var = new ac1(q80Var2, r12);
                        a00Var.i0(ac1Var);
                        obj4 = ac1Var;
                    }
                    zb1 zb1Var = (zb1) obj4;
                    z6 = (i14 == 32 ? z5 : r12) | ((i7 & 458752) == 131072 ? z5 : r12);
                    Object M7 = a00Var.M();
                    if (!z6 || M7 == njVar) {
                        wy1 wy1Var = new wy1(im2Var, q80Var2);
                        a00Var.i0(wy1Var);
                        obj2 = wy1Var;
                    } else {
                        obj2 = M7;
                    }
                    wy1 wy1Var2 = (wy1) obj2;
                    wp wpVar = (wp) a00Var.j(yp.a);
                    f2 = (i14 == 32 ? z5 : r12) | a00Var.f(wpVar);
                    Object M8 = a00Var.M();
                    Object obj5 = M8;
                    if (!f2 || M8 == njVar) {
                        dy1 dy1Var = new dy1(q80Var2, wpVar);
                        a00Var.i0(dy1Var);
                        obj5 = dy1Var;
                    }
                    dy1 dy1Var2 = (dy1) obj5;
                    vl1 a = c.a(vl1Var.k(q80Var2.x).k(q80Var2.v), q71Var, zb1Var, ww1Var, z);
                    sl1 sl1Var = sl1.a;
                    vl1 k4 = z ? a.k(wh2.a(sl1Var, new i40((boolean) r12, q80Var2, a50Var))) : a.k(sl1Var);
                    i8 = i16 | ((i7 >> 18) & 112);
                    boolean z12 = ((((i8 & 14) ^ 6) > i6 || !a00Var.f(q80Var2)) && (i8 & 6) != i6) ? r12 : z5;
                    int i24 = i7;
                    if ((((i8 & 112) ^ 48) > 32 || !a00Var.d(r12)) && (i8 & 48) != 32) {
                        z5 = r12;
                    }
                    z7 = z12 | z5;
                    Object M9 = a00Var.M();
                    Object obj6 = M9;
                    if (!z7 || M9 == njVar) {
                        cy1 cy1Var = new cy1(q80Var2);
                        a00Var.i0(cy1Var);
                        obj6 = cy1Var;
                    }
                    ww1 ww1Var3 = ww1Var;
                    vl1 R = s93.R(iv1.K(k4, (cy1) obj6, q80Var2.u, (u81) a00Var.j(p00.n), ww1Var3, z, a00Var, 512 | i19 | ((i24 << 3) & 458752) | (i24 & 3670016)), q80Var, ww1Var3, z, wy1Var2, q80Var2.q, dy1Var2, a00Var, 0);
                    q80Var3 = q80Var;
                    k = sl1Var.k(new SuspendPointerInputElement(q80Var3, null, new qr2(new v(26, null, q80Var3)), 6));
                    hr1Var2 = hr1Var;
                    tk3.n(q71Var, a.a(R.k(k), hr1Var2), q80Var3.t, function2, a00Var, 0);
                }
                z4 = true;
                r12 = z8;
                f = f4 | z4 | a00Var.f(a50Var2);
                Object M52 = a00Var.M();
                if (f) {
                }
                ww1Var = ww1Var2;
                i6 = 4;
                z5 = true;
                i7 = i4;
                bdVar = new bd(q80Var, yx1Var, by1Var, q71Var2, function02, znVar, by1Var2, a50Var2);
                a50Var = a50Var2;
                q80Var2 = q80Var;
                q71Var = q71Var2;
                a00Var.i0(bdVar);
                Function2 function22 = (Function2) bdVar;
                g = ((((i16 ^ 6) > i6 || !a00Var.f(q80Var2)) && (i15 & 6) != i6) ? r12 : z5) | a00Var.g(r12);
                Object M62 = a00Var.M();
                Object obj42 = M62;
                if (!g) {
                }
                ac1 ac1Var2 = new ac1(q80Var2, r12);
                a00Var.i0(ac1Var2);
                obj42 = ac1Var2;
                zb1 zb1Var2 = (zb1) obj42;
                z6 = (i14 == 32 ? z5 : r12) | ((i7 & 458752) == 131072 ? z5 : r12);
                Object M72 = a00Var.M();
                if (z6) {
                }
                wy1 wy1Var3 = new wy1(im2Var, q80Var2);
                a00Var.i0(wy1Var3);
                obj2 = wy1Var3;
                wy1 wy1Var22 = (wy1) obj2;
                wp wpVar2 = (wp) a00Var.j(yp.a);
                f2 = (i14 == 32 ? z5 : r12) | a00Var.f(wpVar2);
                Object M82 = a00Var.M();
                Object obj52 = M82;
                if (!f2) {
                }
                dy1 dy1Var3 = new dy1(q80Var2, wpVar2);
                a00Var.i0(dy1Var3);
                obj52 = dy1Var3;
                dy1 dy1Var22 = (dy1) obj52;
                vl1 a2 = c.a(vl1Var.k(q80Var2.x).k(q80Var2.v), q71Var, zb1Var2, ww1Var, z);
                sl1 sl1Var2 = sl1.a;
                if (z) {
                }
                i8 = i16 | ((i7 >> 18) & 112);
                if (((i8 & 14) ^ 6) > i6) {
                }
                int i242 = i7;
                if (((i8 & 112) ^ 48) > 32) {
                }
                z5 = r12;
                z7 = z12 | z5;
                Object M92 = a00Var.M();
                Object obj62 = M92;
                if (!z7) {
                }
                cy1 cy1Var2 = new cy1(q80Var2);
                a00Var.i0(cy1Var2);
                obj62 = cy1Var2;
                ww1 ww1Var32 = ww1Var;
                vl1 R2 = s93.R(iv1.K(k4, (cy1) obj62, q80Var2.u, (u81) a00Var.j(p00.n), ww1Var32, z, a00Var, 512 | i19 | ((i242 << 3) & 458752) | (i242 & 3670016)), q80Var, ww1Var32, z, wy1Var22, q80Var2.q, dy1Var22, a00Var, 0);
                q80Var3 = q80Var;
                k = sl1Var2.k(new SuspendPointerInputElement(q80Var3, null, new qr2(new v(26, null, q80Var3)), 6));
                hr1Var2 = hr1Var;
                tk3.n(q71Var, a.a(R2.k(k), hr1Var2), q80Var3.t, function22, a00Var, 0);
            }
            z2 = true;
            boolean f42 = z11 | z2 | a00Var.f(function02);
            if (((i23 & 458752) ^ 196608) <= 131072) {
            }
            z8 = z3;
            if ((i23 & 196608) != 131072) {
            }
            z4 = true;
            r12 = z8;
            f = f42 | z4 | a00Var.f(a50Var2);
            Object M522 = a00Var.M();
            if (f) {
            }
            ww1Var = ww1Var2;
            i6 = 4;
            z5 = true;
            i7 = i4;
            bdVar = new bd(q80Var, yx1Var, by1Var, q71Var2, function02, znVar, by1Var2, a50Var2);
            a50Var = a50Var2;
            q80Var2 = q80Var;
            q71Var = q71Var2;
            a00Var.i0(bdVar);
            Function2 function222 = (Function2) bdVar;
            g = ((((i16 ^ 6) > i6 || !a00Var.f(q80Var2)) && (i15 & 6) != i6) ? r12 : z5) | a00Var.g(r12);
            Object M622 = a00Var.M();
            Object obj422 = M622;
            if (!g) {
            }
            ac1 ac1Var22 = new ac1(q80Var2, r12);
            a00Var.i0(ac1Var22);
            obj422 = ac1Var22;
            zb1 zb1Var22 = (zb1) obj422;
            z6 = (i14 == 32 ? z5 : r12) | ((i7 & 458752) == 131072 ? z5 : r12);
            Object M722 = a00Var.M();
            if (z6) {
            }
            wy1 wy1Var32 = new wy1(im2Var, q80Var2);
            a00Var.i0(wy1Var32);
            obj2 = wy1Var32;
            wy1 wy1Var222 = (wy1) obj2;
            wp wpVar22 = (wp) a00Var.j(yp.a);
            f2 = (i14 == 32 ? z5 : r12) | a00Var.f(wpVar22);
            Object M822 = a00Var.M();
            Object obj522 = M822;
            if (!f2) {
            }
            dy1 dy1Var32 = new dy1(q80Var2, wpVar22);
            a00Var.i0(dy1Var32);
            obj522 = dy1Var32;
            dy1 dy1Var222 = (dy1) obj522;
            vl1 a22 = c.a(vl1Var.k(q80Var2.x).k(q80Var2.v), q71Var, zb1Var22, ww1Var, z);
            sl1 sl1Var22 = sl1.a;
            if (z) {
            }
            i8 = i16 | ((i7 >> 18) & 112);
            if (((i8 & 14) ^ 6) > i6) {
            }
            int i2422 = i7;
            if (((i8 & 112) ^ 48) > 32) {
            }
            z5 = r12;
            z7 = z12 | z5;
            Object M922 = a00Var.M();
            Object obj622 = M922;
            if (!z7) {
            }
            cy1 cy1Var22 = new cy1(q80Var2);
            a00Var.i0(cy1Var22);
            obj622 = cy1Var22;
            ww1 ww1Var322 = ww1Var;
            vl1 R22 = s93.R(iv1.K(k4, (cy1) obj622, q80Var2.u, (u81) a00Var.j(p00.n), ww1Var322, z, a00Var, 512 | i19 | ((i2422 << 3) & 458752) | (i2422 & 3670016)), q80Var, ww1Var322, z, wy1Var222, q80Var2.q, dy1Var222, a00Var, 0);
            q80Var3 = q80Var;
            k = sl1Var22.k(new SuspendPointerInputElement(q80Var3, null, new qr2(new v(26, null, q80Var3)), 6));
            hr1Var2 = hr1Var;
            tk3.n(q71Var, a.a(R22.k(k), hr1Var2), q80Var3.t, function222, a00Var, 0);
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new qb1(vl1Var, q80Var3, yx1Var, im2Var, z, by1Var, hr1Var2, znVar, by1Var2, myVar, i, i2);
        }
    }

    public static final void j(List list, Collection collection, a00 a00Var, int i) {
        a00Var.Z(1537894851);
        if ((((a00Var.h(list) ? 4 : 2) | i | (a00Var.h(collection) ? 32 : 16)) & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            boolean booleanValue = ((Boolean) a00Var.j(g31.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                cp1 cp1Var = (cp1) it.next();
                kd1 kd1Var = cp1Var.t;
                boolean g = a00Var.g(booleanValue) | a00Var.h(list) | a00Var.h(cp1Var);
                Object M = a00Var.M();
                if (g || M == sz.a) {
                    M = new i40(cp1Var, list, booleanValue);
                    a00Var.i0(M);
                }
                l41.f(kd1Var, (Function1) M, a00Var);
            }
        }
        n72 s2 = a00Var.s();
        if (s2 != null) {
            s2.d = new n8(i, 9, list, collection);
        }
    }

    public static final int k(float[] fArr) {
        int i = 0;
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = (fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0;
        if (fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) {
            i = 1;
        }
        return (i2 << 1) | i;
    }

    public static final boolean l(long j) {
        return !s31.a(j, 9223372034707292159L);
    }

    public static final void m(g2 g2Var, ai2 ai2Var) {
        sh2 sh2Var = ai2Var.d;
        tn1 tn1Var = sh2Var.m;
        Object g = sh2Var.m.g(gi2.x);
        if (g == null) {
            g = null;
        }
        fb2 fb2Var = (fb2) g;
        if (ll3.f(ai2Var)) {
            if (fb2Var != null && fb2Var.a == 8) {
                return;
            }
            Object g2 = tn1Var.g(rh2.x);
            if (g2 == null) {
                g2 = null;
            }
            r1 r1Var = (r1) g2;
            if (r1Var != null) {
                g2Var.a(new b2(null, R.id.accessibilityActionPageUp, r1Var.a, null));
            }
            Object g3 = tn1Var.g(rh2.z);
            if (g3 == null) {
                g3 = null;
            }
            r1 r1Var2 = (r1) g3;
            if (r1Var2 != null) {
                g2Var.a(new b2(null, R.id.accessibilityActionPageDown, r1Var2.a, null));
            }
            Object g4 = tn1Var.g(rh2.y);
            if (g4 == null) {
                g4 = null;
            }
            r1 r1Var3 = (r1) g4;
            if (r1Var3 != null) {
                g2Var.a(new b2(null, R.id.accessibilityActionPageLeft, r1Var3.a, null));
            }
            Object g5 = tn1Var.g(rh2.A);
            if (g5 == null) {
                g5 = null;
            }
            r1 r1Var4 = (r1) g5;
            if (r1Var4 != null) {
                g2Var.a(new b2(null, R.id.accessibilityActionPageRight, r1Var4.a, null));
            }
        }
    }

    public static wr n(i90 i90Var) {
        ur urVar = new ur();
        urVar.c = new j92();
        wr wrVar = new wr(urVar);
        urVar.b = wrVar;
        urVar.a = q40.class;
        try {
            i90Var.o(new p8(15, urVar, i90Var));
            urVar.a = "Deferred.asListenableFuture";
            return wrVar;
        } catch (Exception e) {
            wrVar.n.setException(e);
            return wrVar;
        }
    }

    public static final int o(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int p(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final w72 q(t81 t81Var) {
        t81 j = t81Var.j();
        return j != null ? j.M(t81Var, true) : new w72(0.0f, 0.0f, (int) (t81Var.N() >> 32), (int) (t81Var.N() & 4294967295L));
    }

    public static final w72 r(t81 t81Var) {
        t81 D = D(t81Var);
        float N = (int) (D.N() >> 32);
        float N2 = (int) (D.N() & 4294967295L);
        w72 M = D.M(t81Var, true);
        float f = M.a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > N) {
            f = N;
        }
        float f2 = M.b;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > N2) {
            f2 = N2;
        }
        float f3 = M.c;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= N) {
            N = f3;
        }
        float f4 = M.d;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= N2) {
            N2 = f5;
        }
        if (f == N || f2 == N2) {
            return w72.e;
        }
        long h = D.h((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long h2 = D.h((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(N) << 32));
        long h3 = D.h((Float.floatToRawIntBits(N) << 32) | (Float.floatToRawIntBits(N2) & 4294967295L));
        long h4 = D.h((Float.floatToRawIntBits(N2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (h2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (h4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (h3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (h & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (h2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (h4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (h3 & 4294967295L));
        return new w72(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static void s(boolean z) {
        if (z) {
            return;
        }
        b71.t();
    }

    public static void t(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static final vl1 u(vl1 vl1Var, fk2 fk2Var) {
        return androidx.compose.ui.graphics.a.c(vl1Var, 0.0f, fk2Var, 518143);
    }

    public static final vl1 v(vl1 vl1Var) {
        return androidx.compose.ui.graphics.a.c(vl1Var, 0.0f, null, 520191);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void w(uc2 uc2Var, Throwable th) {
        boolean isTerminated;
        if (uc2Var != 0) {
            if (th != null) {
                try {
                    q40.s(uc2Var);
                    return;
                } catch (Throwable th2) {
                    wi0.a(th, th2);
                    return;
                }
            }
            if (uc2Var instanceof AutoCloseable) {
                uc2Var.close();
                return;
            }
            if (!(uc2Var instanceof ExecutorService)) {
                if (uc2Var instanceof TypedArray) {
                    ((TypedArray) uc2Var).recycle();
                    return;
                }
                if (uc2Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) uc2Var).release();
                    return;
                } else if (uc2Var instanceof MediaDrm) {
                    ((MediaDrm) uc2Var).release();
                    return;
                } else {
                    b71.t();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) uc2Var;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static final zn1 x(b41 b41Var, a00 a00Var, int i) {
        Object M = a00Var.M();
        nj njVar = sz.a;
        if (M == njVar) {
            M = ij2.j(Boolean.FALSE);
            a00Var.i0(M);
        }
        zn1 zn1Var = (zn1) M;
        boolean z = (((i & 14) ^ 6) > 4 && a00Var.f(b41Var)) || (i & 6) == 4;
        Object M2 = a00Var.M();
        if (z || M2 == njVar) {
            M2 = new v(b41Var, zn1Var, null, 24);
            a00Var.i0(M2);
        }
        l41.h(a00Var, b41Var, (Function2) M2);
        return zn1Var;
    }

    public static mx0 y(mx0 mx0Var, mx0 mx0Var2) {
        lx0 lx0Var = new lx0(0);
        int size = mx0Var.size();
        for (int i = 0; i < size; i++) {
            String b = mx0Var.b(i);
            String d = mx0Var.d(i);
            if ((!"Warning".equalsIgnoreCase(b) || !tp2.o(d, AppEventsConstants.EVENT_PARAM_VALUE_YES, false)) && ("Content-Length".equalsIgnoreCase(b) || "Content-Encoding".equalsIgnoreCase(b) || "Content-Type".equalsIgnoreCase(b) || !I(b) || mx0Var2.a(b) == null)) {
                lx0Var.b(b, d);
            }
        }
        int size2 = mx0Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String b2 = mx0Var2.b(i2);
            if (!"Content-Length".equalsIgnoreCase(b2) && !"Content-Encoding".equalsIgnoreCase(b2) && !"Content-Type".equalsIgnoreCase(b2) && I(b2)) {
                lx0Var.b(b2, mx0Var2.d(i2));
            }
        }
        return lx0Var.c();
    }

    public static byte[] z(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public abstract int M(int i);

    public abstract int N(int i);

    @Override // defpackage.wg2
    public int b(int i) {
        return N(i);
    }

    @Override // defpackage.wg2
    public int d(int i) {
        return M(i);
    }

    @Override // defpackage.wg2
    public int f(int i) {
        int M = M(i);
        if (M == -1 || M(M) == -1) {
            return -1;
        }
        return M;
    }

    @Override // defpackage.wg2
    public int g(int i) {
        int N = N(i);
        if (N == -1 || N(N) == -1) {
            return -1;
        }
        return N;
    }
}
