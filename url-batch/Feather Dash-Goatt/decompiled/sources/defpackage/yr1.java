package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextPaint;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class yr1 {
    public static zq1 a;
    public static final j50 d;
    public static final j41 e;
    public static final a60 f;
    public static final fv h;
    public static final fv i;
    public static final fv j;
    public static final fv k;
    public static final fv l;
    public static final fv m;
    public static final i9 b = new i9();
    public static final f9 c = new f9();
    public static final og g = new og();
    public static final iv n = new iv(false);
    public static final iv o = new iv(true);
    public static final a60 p = new a60(26);
    public static final c51 q = new c51(new e9(14, 0), 3, new q1(29));
    public static final Object r = new Object();
    public static final j61 s = new j61(25);

    static {
        int i2 = 15;
        d = new j50(i2);
        e = new j41(i2);
        f = new a60(i2);
        int i3 = 1;
        h = new fv("CLOSED", i3);
        i = new fv("COMPLETING_ALREADY", i3);
        j = new fv("COMPLETING_WAITING_CHILDREN", i3);
        k = new fv("COMPLETING_RETRY", i3);
        l = new fv("TOO_LATE_TO_CANCEL", i3);
        m = new fv("SEALED", i3);
    }

    public static final void A(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final h80 B(j80 j80Var, float f2, float f3, final g80 g80Var, hl hlVar, int i2, int i3) {
        final Float valueOf = Float.valueOf(f2);
        final Float valueOf2 = Float.valueOf(f3);
        Object L = hlVar.L();
        j41 j41Var = bl.a;
        if (L == j41Var) {
            L = new h80(j80Var, valueOf, valueOf2, g80Var);
            hlVar.h0(L);
        }
        final h80 h80Var = (h80) L;
        boolean h2 = hlVar.h(g80Var);
        Object L2 = hlVar.L();
        if (h2 || L2 == j41Var) {
            L2 = new Function0() { // from class: k80
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    h80 h80Var2 = h80Var;
                    Float f4 = h80Var2.d;
                    Float f5 = valueOf;
                    boolean equals = f5.equals(f4);
                    Float f6 = valueOf2;
                    if (!equals || !f6.equals(h80Var2.e)) {
                        h80Var2.d = f5;
                        h80Var2.e = f6;
                        h80Var2.h = new lg1(g80Var, p4.o, f5, f6, null);
                        h80Var2.l.b.setValue(Boolean.TRUE);
                        h80Var2.i = false;
                        h80Var2.j = true;
                    }
                    return Unit.a;
                }
            };
            hlVar.h0(L2);
        }
        p4.k((Function0) L2, hlVar);
        boolean h3 = hlVar.h(j80Var);
        Object L3 = hlVar.L();
        if (h3 || L3 == j41Var) {
            L3 = new c(j80Var, 9, h80Var);
            hlVar.h0(L3);
        }
        p4.b(h80Var, (Function1) L3, hlVar);
        return h80Var;
    }

    public static final boolean C(ee1 ee1Var, int i2, j0 j0Var, boolean z) {
        boolean z2;
        synchronized (r) {
            try {
                int i3 = ee1Var.d;
                if (i3 == i2) {
                    ee1Var.c = j0Var;
                    z2 = true;
                    if (z) {
                        ee1Var.e++;
                    }
                    ee1Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final Bundle D(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.d;
            Object obj = pair.e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        af.g("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                ze.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    af.g("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                ze.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static byte[] E(byte[] bArr) {
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

    public static final x10 F(Context context) {
        return new x10(new o5(context, 0), new p5(Build.VERSION.SDK_INT >= 31 ? y20.a.a(context) : 0));
    }

    public static final am0 G(am0 am0Var, Function1 function1) {
        return am0Var.c(new du(function1));
    }

    public static final ArrayList H(vk vkVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = vkVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            wk wkVar = (wk) list.get(i2);
            int i4 = wkVar.a;
            int i5 = 0;
            while (true) {
                if (i5 >= 9) {
                    i5 = -1;
                    break;
                }
                if (i4 == iArr[i5]) {
                    break;
                }
                i5++;
            }
            if (i5 < 0) {
                if (wkVar.a == 100) {
                    int i6 = i2 + 2;
                    if (i6 < size && ((wk) list.get(i6)).a == 1000) {
                        break;
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                } else {
                    arrayList.add(wkVar);
                }
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static final Object I(e81 e81Var, long j2, Function2 function2) {
        while (true) {
            if (e81Var.e >= j2 && !e81Var.f()) {
                return e81Var;
            }
            Object d2 = e81Var.d();
            fv fvVar = h;
            if (d2 == fvVar) {
                return fvVar;
            }
            e81 e81Var2 = (e81) ((dm) d2);
            if (e81Var2 == null) {
                e81Var2 = (e81) function2.b(Long.valueOf(e81Var.e + 1), e81Var);
                if (e81Var.i(e81Var2)) {
                    if (e81Var.f()) {
                        e81Var.h();
                    }
                }
            }
            e81Var = e81Var2;
        }
    }

    public static es J(ds dsVar) {
        dsVar.getClass();
        int ordinal = dsVar.ordinal();
        if (ordinal == 0) {
            return new es(0.85f, 1.65f, 980L, 0.85f, 190.0f, 5, 1.0f);
        }
        if (ordinal == 1) {
            return new es(1.0f, 1.85f, 920L, 1.0f, 155.0f, 3, 1.25f);
        }
        if (ordinal == 2) {
            return new es(1.15f, 2.1f, 850L, 1.2f, 125.0f, 2, 1.6f);
        }
        l.a();
        return null;
    }

    public static long K(Context context, int i2) {
        return la0.c(context.getResources().getColor(i2, context.getTheme()));
    }

    public static final String[] L(an anVar) {
        anVar.getClass();
        return (String[]) ((b5) anVar).b.toArray(new String[0]);
    }

    public static final ee1 M(ac1 ac1Var) {
        ee1 ee1Var = ac1Var.d;
        ee1Var.getClass();
        return (ee1) pb1.t(ee1Var, ac1Var);
    }

    public static final int N(ac1 ac1Var) {
        ee1 ee1Var = ac1Var.d;
        ee1Var.getClass();
        return ((ee1) pb1.h(ee1Var)).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(gu guVar) {
        if (((zl0) guVar).d.r) {
            op.G(guVar, 1).Q0();
        }
    }

    public static final boolean P(ac1 ac1Var, Function1 function1) {
        int i2;
        j0 j0Var;
        Object invoke;
        ib1 j2;
        boolean C;
        do {
            synchronized (r) {
                ee1 ee1Var = ac1Var.d;
                ee1Var.getClass();
                ee1 ee1Var2 = (ee1) pb1.h(ee1Var);
                i2 = ee1Var2.d;
                j0Var = ee1Var2.c;
            }
            j0Var.getClass();
            uw0 f2 = j0Var.f();
            invoke = function1.invoke(f2);
            j0 d2 = f2.d();
            if (Intrinsics.a(d2, j0Var)) {
                break;
            }
            ee1 ee1Var3 = ac1Var.d;
            ee1Var3.getClass();
            synchronized (pb1.c) {
                j2 = pb1.j();
                C = C((ee1) pb1.w(ee1Var3, ac1Var, j2), i2, d2, true);
            }
            pb1.n(j2, ac1Var);
        } while (!C);
        return ((Boolean) invoke).booleanValue();
    }

    public static void Q(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final am0 R(am0 am0Var, float f2) {
        return am0Var.c(new iu0(f2, f2, f2, f2, new q1(24)));
    }

    public static final am0 S(am0 am0Var, float f2, float f3) {
        return am0Var.c(new iu0(f2, f3, f2, f3, new q1(23)));
    }

    public static am0 T(am0 am0Var, float f2, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return S(am0Var, f2, (i2 & 2) == 0 ? 10.0f : 0.0f);
    }

    public static final am0 U(am0 am0Var, float f2, float f3, float f4, float f5) {
        return am0Var.c(new iu0(f2, f3, f4, f5, new q1(22)));
    }

    public static am0 V(am0 am0Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        float f4 = (i2 & 2) != 0 ? 0.0f : 30.0f;
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        return U(am0Var, f2, f4, f3, (i2 & 8) == 0 ? 58.0f : 0.0f);
    }

    public static void W(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = Math.round(f2);
            f2 += i8;
        }
    }

    public static void X(int i2, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
        float f2 = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = Math.round(f2);
                f2 += i6 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f2);
            f2 += i8 + max;
            i3++;
            i7++;
        }
    }

    public static void Y(int i2, int[] iArr, int[] iArr2, boolean z) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float length = (i2 - i4) / (iArr.length + 1);
        if (z) {
            float f2 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i6 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i6 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f3 = length;
        int i7 = 0;
        while (i3 < length3) {
            int i8 = iArr[i3];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + length;
            i3++;
            i7++;
        }
    }

    public static byte[] Z(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                dd0.j(qy0.i(i2, "Not enough bytes to read: "));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    public static final void a(b2 b2Var, Function1 function1, hl hlVar, int i2) {
        b2Var.getClass();
        function1.getClass();
        hlVar.Y(382264763);
        int i3 = (hlVar.f(b2Var) ? 4 : 2) | i2 | (hlVar.h(function1) ? 32 : 16);
        int i4 = 5;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            int i5 = i3 & 14;
            boolean z2 = z | (i5 == 4);
            Object L = hlVar.L();
            if (z2 || L == bl.a) {
                L = new vc(function1, i4, b2Var);
                hlVar.h0(L);
            }
            b(b2Var, (Function0) L, hlVar, i5);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new il(i2, i4, b2Var, function1);
        }
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
    public static byte[] a0(FileInputStream fileInputStream, int i2, int i3) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[2048];
            int i4 = 0;
            int i5 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i4 < i2) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i2 + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i5 += inflater.inflate(bArr, i5, i3 - i5);
                    i4 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i2 + " actual=" + i4);
        } finally {
            inflater.end();
        }
    }

    public static final void b(final b2 b2Var, final Function0 function0, hl hlVar, int i2) {
        hl hlVar2;
        b2Var.getClass();
        function0.getClass();
        hlVar.Y(320776117);
        int i3 = (hlVar.f(b2Var) ? 4 : 2) | i2 | (hlVar.h(function0) ? 32 : 16);
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            final float f2 = b2Var.b / b2Var.a.e;
            hlVar2 = hlVar;
            v(R.drawable.panel_medium, xa1.b(xa1.a(xl0.a, 1.0f), 118.0f), 0.0f, m90.J(-2080110825, new s30() { // from class: bl0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar3 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zd) obj).getClass();
                    if (hlVar3.O(intValue & 1, (intValue & 17) != 16)) {
                        am0 V = yr1.V(xa1.b, 14.0f, 18.0f, 10);
                        r41 a2 = q41.a(yr1.b, j50.q, hlVar3, 48);
                        int hashCode = Long.hashCode(hlVar3.T);
                        kw0 l2 = hlVar3.l();
                        am0 N = p4.N(hlVar3, V);
                        yk.b.getClass();
                        xl xlVar = xk.b;
                        hlVar3.a0();
                        if (hlVar3.S) {
                            hlVar3.k(xlVar);
                        } else {
                            hlVar3.k0();
                        }
                        e7 e7Var = xk.e;
                        ka0.C(hlVar3, a2, e7Var);
                        e7 e7Var2 = xk.d;
                        ka0.C(hlVar3, l2, e7Var2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        e7 e7Var3 = xk.f;
                        ka0.u(hlVar3, valueOf, e7Var3);
                        y3 y3Var = xk.g;
                        ka0.A(hlVar3, y3Var);
                        e7 e7Var4 = xk.c;
                        ka0.C(hlVar3, N, e7Var4);
                        xl0 xl0Var = xl0.a;
                        am0 e2 = xa1.e(xl0Var, 100.0f);
                        vk0 d2 = vd.d(j50.j, false);
                        int hashCode2 = Long.hashCode(hlVar3.T);
                        kw0 l3 = hlVar3.l();
                        am0 N2 = p4.N(hlVar3, e2);
                        hlVar3.a0();
                        if (hlVar3.S) {
                            hlVar3.k(xlVar);
                        } else {
                            hlVar3.k0();
                        }
                        ka0.C(hlVar3, d2, e7Var);
                        ka0.C(hlVar3, l3, e7Var2);
                        ka0.u(hlVar3, Integer.valueOf(hashCode2), e7Var3);
                        ka0.A(hlVar3, y3Var);
                        ka0.C(hlVar3, N2, e7Var4);
                        b2 b2Var2 = b2.this;
                        yr1.e(b2Var2.c ? R.drawable.badge_achievement_completed : R.drawable.badge_achievement_locked, xa1.d(xl0Var, 160.0f, 90.0f), null, hlVar3, 48, 4);
                        hlVar3.p(true);
                        am0 V2 = yr1.V(xa1.b(new yd0(1.0f, true), 88.0f), 4.0f, 8.0f, 10);
                        yi a3 = wi.a(yr1.f, j50.s, hlVar3, 6);
                        int hashCode3 = Long.hashCode(hlVar3.T);
                        kw0 l4 = hlVar3.l();
                        am0 N3 = p4.N(hlVar3, V2);
                        hlVar3.a0();
                        if (hlVar3.S) {
                            hlVar3.k(xlVar);
                        } else {
                            hlVar3.k0();
                        }
                        ka0.C(hlVar3, a3, e7Var);
                        ka0.C(hlVar3, l4, e7Var2);
                        ka0.u(hlVar3, Integer.valueOf(hashCode3), e7Var3);
                        ka0.A(hlVar3, y3Var);
                        ka0.C(hlVar3, N3, e7Var4);
                        eh1.b(b2Var2.a.b, m90.F(xl0Var, 0.0f, 20.0f, 1), hi.c, t80.x(20), x20.l, null, 0L, null, t80.x(22), 2, false, 2, 0, null, hlVar3, 1597872, 25008, 239528);
                        final float f3 = f2;
                        boolean c2 = hlVar3.c(f3);
                        Object L = hlVar3.L();
                        if (c2 || L == bl.a) {
                            L = new Function0() { // from class: yk0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(b11.b(f3, 0.0f, 1.0f));
                                }
                            };
                            hlVar3.h0(L);
                        }
                        vz0.b((Function0) L, m90.F(xa1.b(xa1.a(xl0Var, 1.0f), 6.0f), 0.0f, -10.0f, 1), 0L, 0L, 0, 0.0f, null, hlVar3, 48);
                        hlVar3.p(true);
                        am0 F = m90.F(xa1.e(xl0Var, 100.0f), -10.0f, 0.0f, 2);
                        vk0 d3 = vd.d(j50.l, false);
                        int hashCode4 = Long.hashCode(hlVar3.T);
                        kw0 l5 = hlVar3.l();
                        am0 N4 = p4.N(hlVar3, F);
                        hlVar3.a0();
                        if (hlVar3.S) {
                            hlVar3.k(xlVar);
                        } else {
                            hlVar3.k0();
                        }
                        ka0.C(hlVar3, d3, e7Var);
                        ka0.C(hlVar3, l5, e7Var2);
                        ka0.u(hlVar3, Integer.valueOf(hashCode4), e7Var3);
                        ka0.A(hlVar3, y3Var);
                        ka0.C(hlVar3, N4, e7Var4);
                        yr1.t(R.drawable.button_claim_achievement_reward, function0, xa1.b(xa1.e(xl0Var, 90.0f), 60.0f), b2Var2.c && !b2Var2.d, "Claim achievement reward", hlVar3, 24960, 0);
                        hlVar3.p(true);
                        hlVar3.p(true);
                    } else {
                        hlVar3.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar2, 3504, 0);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new il(i2, 6, b2Var, function0);
        }
    }

    public static long b0(InputStream inputStream, int i2) {
        byte[] Z = Z(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (Z[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(List list, Function1 function1, hl hlVar, int i2) {
        int i3;
        hlVar.Y(-2076091940);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(function1) ? 32 : 16;
        }
        int i4 = i3;
        int i5 = 1;
        if (hlVar.O(i4 & 1, (i4 & 19) != 18)) {
            am0 R = R(xa1.b, 18.0f);
            yi a2 = wi.a(c, j50.s, hlVar, 0);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, a2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            xl0 xl0Var = xl0.a;
            e(R.drawable.title_achievements, xa1.b(xa1.a(xl0Var, 1.0f), 96.0f), null, hlVar, 48, 4);
            ca0.b(hlVar, xa1.b(xl0Var, 12.0f));
            h9 h9Var = new h9(10.0f, true, new e9(i5, r8));
            boolean z = (hlVar.h(list) ? 1 : 0) | ((i4 & 112) == 32 ? (byte) 1 : (byte) 0);
            Object L = hlVar.L();
            if (z != 0 || L == bl.a) {
                L = new c(list, 12, function1);
                hlVar.h0(L);
            }
            xa0.b(null, null, null, h9Var, null, null, false, null, (Function1) L, hlVar, 24576);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ag(i2, 6, list, function1);
        }
    }

    public static final j80 c0(int i2, hl hlVar) {
        Object L = hlVar.L();
        if (L == bl.a) {
            L = new j80();
            hlVar.h0(L);
        }
        j80 j80Var = (j80) L;
        j80Var.a(0, hlVar);
        return j80Var;
    }

    public static final void d(List list, z8 z8Var, hl hlVar, int i2) {
        int i3;
        z8 z8Var2;
        list.getClass();
        hlVar.Y(-1065525535);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                z8Var2 = z8Var;
                e eVar = new e(1, z8Var2, z8.class, "claimAchievementReward", "claimAchievementReward(Ljava/lang/String;)V", 0, 2);
                hlVar.h0(eVar);
                L = eVar;
            } else {
                z8Var2 = z8Var;
            }
            c(list, (Function1) ((b40) L), hlVar, i3 & 14);
        } else {
            z8Var2 = z8Var;
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ag(i2, 5, list, z8Var2);
        }
    }

    public static final void d0(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void e(final int i2, final am0 am0Var, ym ymVar, hl hlVar, final int i3, final int i4) {
        int i5;
        hl hlVar2;
        final ym ymVar2;
        hlVar.Y(1600023022);
        if ((i3 & 6) == 0) {
            i5 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= hlVar.f(am0Var) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= hlVar.f(ymVar) ? 256 : 128;
        }
        if (hlVar.O(i5 & 1, (i5 & 147) != 146)) {
            if (i6 != 0) {
                ymVar = xm.c;
            }
            ym ymVar3 = ymVar;
            hlVar2 = hlVar;
            mo.c(t80.F(i2, hlVar, i5 & 14), null, mo.h(am0Var, n41.a(8.0f)), null, ymVar3, 0.0f, hlVar2, 56 | (57344 & (i5 << 6)));
            ymVar2 = ymVar3;
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
            ymVar2 = ymVar;
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: qk1
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yr1.e(i2, am0Var, ymVar2, (hl) obj, gb0.P(i3 | 1), i4);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean e0(Throwable th, Function0 function0) {
        bs bsVar;
        th.getClass();
        List b2 = mo.h.b(th);
        int size = b2.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) b2.get(i2)) instanceof bs) {
                return false;
            }
        }
        try {
            vk vkVar = (vk) function0.invoke();
            if (vkVar != null && !vkVar.a.isEmpty()) {
                z = true;
            }
            if (z) {
                vkVar.getClass();
                bsVar = new bs(vkVar);
            } else {
                bsVar = null;
            }
        } catch (Throwable th2) {
            bsVar = th2;
        }
        if (bsVar != null) {
            lw.a(th, bsVar);
        }
        return z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:92|(21:139|140|(1:142)|96|97|(1:137)(1:101)|102|(7:107|108|109|110|111|(1:113)(1:121)|114)|124|125|126|127|128|129|130|108|109|110|111|(0)(0)|114)|94|(20:138|97|(1:99)|135|137|102|(8:104|107|108|109|110|111|(0)(0)|114)|124|125|126|127|128|129|130|108|109|110|111|(0)(0)|114)|96|97|(0)|135|137|102|(0)|124|125|126|127|128|129|130|108|109|110|111|(0)(0)|114) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e1, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[Catch: RejectedExecutionException -> 0x018b, TryCatch #2 {RejectedExecutionException -> 0x018b, blocks: (B:140:0x0184, B:97:0x0194, B:99:0x01a6, B:102:0x01b3, B:104:0x01c4, B:124:0x01cc, B:135:0x01ac, B:94:0x018d), top: B:139:0x0184 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a6 A[Catch: RejectedExecutionException -> 0x018b, TryCatch #2 {RejectedExecutionException -> 0x018b, blocks: (B:140:0x0184, B:97:0x0194, B:99:0x01a6, B:102:0x01b3, B:104:0x01c4, B:124:0x01cc, B:135:0x01ac, B:94:0x018d), top: B:139:0x0184 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final String str, final am0 am0Var, final th1 th1Var, final int i2, final boolean z, final int i3, final int i4, hl hlVar, final int i5) {
        int i6;
        v10 v10Var;
        boolean z2;
        boolean z3;
        boolean d2;
        Object L;
        Object obj;
        hlVar.Y(-1040751001);
        if ((i5 & 6) == 0) {
            i6 = (hlVar.f(str) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= hlVar.f(am0Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= hlVar.f(th1Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= hlVar.h(null) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= hlVar.d(i2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= hlVar.g(z) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= hlVar.d(i3) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= hlVar.d(i4) ? 8388608 : 4194304;
        }
        int i7 = i6 | 100663296;
        if ((805306368 & i5) == 0) {
            i7 |= (1073741824 & i5) == 0 ? hlVar.f(null) : hlVar.h(null) ? 536870912 : 268435456;
        }
        if (hlVar.O(i7 & 1, (306783379 & i7) != 306783378)) {
            if (i4 <= 0 || i3 <= 0) {
                r80.a("both minLines " + i4 + " and maxLines " + i3 + " must be greater than zero");
            }
            if (i4 > i3) {
                r80.a("minLines " + i4 + " must be less than or equal to maxLines " + i3);
            }
            if (hlVar.j(f81.a) != null) {
                af.c();
                return;
            }
            hlVar.W(356914239);
            hlVar.p(false);
            final v10 v10Var2 = (v10) hlVar.j(yl.k);
            int i8 = ((i7 >> 3) & 112) | (i7 & 14);
            Executor executor = (Executor) hlVar.j(fd.a);
            if (executor != null) {
                int length = str.length();
                if (length >= 8 && length < 1000) {
                    if (fd.b == null) {
                        fd.b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
                    }
                    Boolean bool = fd.b;
                    bool.getClass();
                    if (bool.booleanValue()) {
                        hlVar.W(1254274527);
                        final vc0 vc0Var = (vc0) hlVar.j(yl.n);
                        final nr nrVar = (nr) hlVar.j(yl.h);
                        if (((i8 & 112) ^ 48) > 32) {
                            try {
                                if (!hlVar.f(th1Var)) {
                                }
                                z3 = true;
                                d2 = ((((i8 & 14) ^ 6) <= 4 && hlVar.f(str)) || (i8 & 6) == 4) | z3 | hlVar.d(vc0Var.ordinal()) | hlVar.f(nrVar) | hlVar.h(v10Var2);
                                L = hlVar.L();
                            } catch (RejectedExecutionException unused) {
                                v10Var = v10Var2;
                            }
                            if (!d2 && L != bl.a) {
                                obj = L;
                                v10Var = v10Var2;
                                executor.execute((Runnable) obj);
                                z2 = false;
                                hlVar.p(z2);
                                hlVar.W(357875859);
                                hlVar.p(z2);
                                am0 c2 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
                                ud udVar = ud.c;
                                int hashCode = Long.hashCode(hlVar.T);
                                am0 N = p4.N(hlVar, c2);
                                kw0 l2 = hlVar.l();
                                yk.b.getClass();
                                Function0 function0 = xk.b;
                                hlVar.a0();
                                if (hlVar.S) {
                                    hlVar.k0();
                                } else {
                                    hlVar.k(function0);
                                }
                                ka0.C(hlVar, udVar, xk.e);
                                ka0.C(hlVar, l2, xk.d);
                                ka0.A(hlVar, xk.g);
                                ka0.C(hlVar, N, xk.c);
                                ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
                                hlVar.p(true);
                            }
                            obj = new Runnable() { // from class: ed
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zn0 C;
                                    th1 th1Var2 = th1.this;
                                    vc0 vc0Var2 = vc0Var;
                                    String str2 = str;
                                    nr nrVar2 = nrVar;
                                    v10 v10Var3 = v10Var2;
                                    Trace.beginSection("BackgroundTextMeasurement");
                                    try {
                                        ib1 j2 = pb1.j();
                                        zn0 zn0Var = j2 instanceof zn0 ? (zn0) j2 : null;
                                        if (zn0Var == null || (C = zn0Var.C(null, null)) == null) {
                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                        }
                                        try {
                                            ib1 j3 = C.j();
                                            try {
                                                th1 K = gb0.K(th1Var2, vc0Var2);
                                                nv nvVar = nv.d;
                                                new b6(str2, K, nvVar, nvVar, v10Var3, nrVar2).d();
                                                C.w().k();
                                                Trace.endSection();
                                            } finally {
                                                ib1.q(j3);
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                }
                            };
                            v10Var = v10Var2;
                            hlVar.h0(obj);
                            executor.execute((Runnable) obj);
                            z2 = false;
                            hlVar.p(z2);
                            hlVar.W(357875859);
                            hlVar.p(z2);
                            am0 c22 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
                            ud udVar2 = ud.c;
                            int hashCode2 = Long.hashCode(hlVar.T);
                            am0 N2 = p4.N(hlVar, c22);
                            kw0 l22 = hlVar.l();
                            yk.b.getClass();
                            Function0 function02 = xk.b;
                            hlVar.a0();
                            if (hlVar.S) {
                            }
                            ka0.C(hlVar, udVar2, xk.e);
                            ka0.C(hlVar, l22, xk.d);
                            ka0.A(hlVar, xk.g);
                            ka0.C(hlVar, N2, xk.c);
                            ka0.u(hlVar, Integer.valueOf(hashCode2), xk.f);
                            hlVar.p(true);
                        }
                        if ((i8 & 48) != 32) {
                            z3 = false;
                            d2 = ((((i8 & 14) ^ 6) <= 4 && hlVar.f(str)) || (i8 & 6) == 4) | z3 | hlVar.d(vc0Var.ordinal()) | hlVar.f(nrVar) | hlVar.h(v10Var2);
                            L = hlVar.L();
                            if (!d2) {
                                obj = L;
                                v10Var = v10Var2;
                                executor.execute((Runnable) obj);
                                z2 = false;
                                hlVar.p(z2);
                                hlVar.W(357875859);
                                hlVar.p(z2);
                                am0 c222 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
                                ud udVar22 = ud.c;
                                int hashCode22 = Long.hashCode(hlVar.T);
                                am0 N22 = p4.N(hlVar, c222);
                                kw0 l222 = hlVar.l();
                                yk.b.getClass();
                                Function0 function022 = xk.b;
                                hlVar.a0();
                                if (hlVar.S) {
                                }
                                ka0.C(hlVar, udVar22, xk.e);
                                ka0.C(hlVar, l222, xk.d);
                                ka0.A(hlVar, xk.g);
                                ka0.C(hlVar, N22, xk.c);
                                ka0.u(hlVar, Integer.valueOf(hashCode22), xk.f);
                                hlVar.p(true);
                            }
                            obj = new Runnable() { // from class: ed
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zn0 C;
                                    th1 th1Var2 = th1.this;
                                    vc0 vc0Var2 = vc0Var;
                                    String str2 = str;
                                    nr nrVar2 = nrVar;
                                    v10 v10Var3 = v10Var2;
                                    Trace.beginSection("BackgroundTextMeasurement");
                                    try {
                                        ib1 j2 = pb1.j();
                                        zn0 zn0Var = j2 instanceof zn0 ? (zn0) j2 : null;
                                        if (zn0Var == null || (C = zn0Var.C(null, null)) == null) {
                                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                        }
                                        try {
                                            ib1 j3 = C.j();
                                            try {
                                                th1 K = gb0.K(th1Var2, vc0Var2);
                                                nv nvVar = nv.d;
                                                new b6(str2, K, nvVar, nvVar, v10Var3, nrVar2).d();
                                                C.w().k();
                                                Trace.endSection();
                                            } finally {
                                                ib1.q(j3);
                                            }
                                        } finally {
                                        }
                                    } catch (Throwable th) {
                                        Trace.endSection();
                                        throw th;
                                    }
                                }
                            };
                            v10Var = v10Var2;
                            hlVar.h0(obj);
                            executor.execute((Runnable) obj);
                            z2 = false;
                            hlVar.p(z2);
                            hlVar.W(357875859);
                            hlVar.p(z2);
                            am0 c2222 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
                            ud udVar222 = ud.c;
                            int hashCode222 = Long.hashCode(hlVar.T);
                            am0 N222 = p4.N(hlVar, c2222);
                            kw0 l2222 = hlVar.l();
                            yk.b.getClass();
                            Function0 function0222 = xk.b;
                            hlVar.a0();
                            if (hlVar.S) {
                            }
                            ka0.C(hlVar, udVar222, xk.e);
                            ka0.C(hlVar, l2222, xk.d);
                            ka0.A(hlVar, xk.g);
                            ka0.C(hlVar, N222, xk.c);
                            ka0.u(hlVar, Integer.valueOf(hashCode222), xk.f);
                            hlVar.p(true);
                        }
                        z3 = true;
                        d2 = ((((i8 & 14) ^ 6) <= 4 && hlVar.f(str)) || (i8 & 6) == 4) | z3 | hlVar.d(vc0Var.ordinal()) | hlVar.f(nrVar) | hlVar.h(v10Var2);
                        L = hlVar.L();
                        if (!d2) {
                        }
                        obj = new Runnable() { // from class: ed
                            @Override // java.lang.Runnable
                            public final void run() {
                                zn0 C;
                                th1 th1Var2 = th1.this;
                                vc0 vc0Var2 = vc0Var;
                                String str2 = str;
                                nr nrVar2 = nrVar;
                                v10 v10Var3 = v10Var2;
                                Trace.beginSection("BackgroundTextMeasurement");
                                try {
                                    ib1 j2 = pb1.j();
                                    zn0 zn0Var = j2 instanceof zn0 ? (zn0) j2 : null;
                                    if (zn0Var == null || (C = zn0Var.C(null, null)) == null) {
                                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                    }
                                    try {
                                        ib1 j3 = C.j();
                                        try {
                                            th1 K = gb0.K(th1Var2, vc0Var2);
                                            nv nvVar = nv.d;
                                            new b6(str2, K, nvVar, nvVar, v10Var3, nrVar2).d();
                                            C.w().k();
                                            Trace.endSection();
                                        } finally {
                                            ib1.q(j3);
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    Trace.endSection();
                                    throw th;
                                }
                            }
                        };
                        v10Var = v10Var2;
                        hlVar.h0(obj);
                        executor.execute((Runnable) obj);
                        z2 = false;
                        hlVar.p(z2);
                        hlVar.W(357875859);
                        hlVar.p(z2);
                        am0 c22222 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
                        ud udVar2222 = ud.c;
                        int hashCode2222 = Long.hashCode(hlVar.T);
                        am0 N2222 = p4.N(hlVar, c22222);
                        kw0 l22222 = hlVar.l();
                        yk.b.getClass();
                        Function0 function02222 = xk.b;
                        hlVar.a0();
                        if (hlVar.S) {
                        }
                        ka0.C(hlVar, udVar2222, xk.e);
                        ka0.C(hlVar, l22222, xk.d);
                        ka0.A(hlVar, xk.g);
                        ka0.C(hlVar, N2222, xk.c);
                        ka0.u(hlVar, Integer.valueOf(hashCode2222), xk.f);
                        hlVar.p(true);
                    }
                }
                v10Var = v10Var2;
                z2 = false;
            } else {
                v10Var = v10Var2;
                z2 = false;
            }
            hlVar.W(1250991751);
            hlVar.p(z2);
            hlVar.W(357875859);
            hlVar.p(z2);
            am0 c222222 = am0Var.c(new ph1(str, th1Var, v10Var, i2, z, i3, i4));
            ud udVar22222 = ud.c;
            int hashCode22222 = Long.hashCode(hlVar.T);
            am0 N22222 = p4.N(hlVar, c222222);
            kw0 l222222 = hlVar.l();
            yk.b.getClass();
            Function0 function022222 = xk.b;
            hlVar.a0();
            if (hlVar.S) {
            }
            ka0.C(hlVar, udVar22222, xk.e);
            ka0.C(hlVar, l222222, xk.d);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N22222, xk.c);
            ka0.u(hlVar, Integer.valueOf(hashCode22222), xk.f);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: cd
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    yr1.f(str, am0Var, th1Var, i2, z, i3, i4, (hl) obj2, gb0.P(i5 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final Object f0(Object obj) {
        n70 n70Var;
        o70 o70Var = obj instanceof o70 ? (o70) obj : null;
        return (o70Var == null || (n70Var = o70Var.a) == null) ? obj : n70Var;
    }

    public static final void g(u8 u8Var, z8 z8Var, hl hlVar, int i2) {
        int i3;
        hl hlVar2;
        hlVar.Y(1224180145);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? hlVar.f(u8Var) : hlVar.h(u8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            hlVar2 = hlVar;
            nf1.a(null, hi.f, m90.J(274710412, new il(u8Var, 8, z8Var), hlVar), hlVar2, 91);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new ag(i2, 7, u8Var, z8Var);
        }
    }

    public static final am0 g0(am0 am0Var, i7 i7Var) {
        return am0Var.c(new tr(i7Var));
    }

    public static final void h(final u8 u8Var, final am0 am0Var, final Function0 function0, final Function0 function02, final Function0 function03, hl hlVar, final int i2) {
        hl hlVar2 = hlVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        hlVar2.Y(-723509122);
        int i3 = i2 | (hlVar2.f(u8Var) ? 4 : 2) | (hlVar2.h(function0) ? 2048 : 1024) | (hlVar2.h(function02) ? 16384 : 8192) | (hlVar2.h(function03) ? 131072 : 65536);
        if (hlVar2.O(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 >> 3;
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            am0 N = p4.N(hlVar2, am0Var);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            e7 e7Var = xk.e;
            ka0.C(hlVar2, d2, e7Var);
            e7 e7Var2 = xk.d;
            ka0.C(hlVar2, l2, e7Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var3 = xk.f;
            ka0.u(hlVar2, valueOf, e7Var3);
            y3 y3Var = xk.g;
            ka0.A(hlVar2, y3Var);
            e7 e7Var4 = xk.c;
            ka0.C(hlVar2, N, e7Var4);
            mu0 F = t80.F(R.drawable.bottom_nav_panel, hlVar2, 0);
            vy vyVar = xa1.b;
            mo.c(F, null, vyVar, null, xm.c, 0.0f, hlVar, 25016);
            am0 F2 = m90.F(S(vyVar, 34.0f, 10.0f), 0.0f, 0.0f, 1);
            r41 a2 = q41.a(f, j50.r, hlVar, 54);
            int hashCode2 = Long.hashCode(hlVar.T);
            kw0 l3 = hlVar.l();
            am0 N2 = p4.N(hlVar, F2);
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, a2, e7Var);
            ka0.C(hlVar, l3, e7Var2);
            ka0.u(hlVar, Integer.valueOf(hashCode2), e7Var3);
            ka0.A(hlVar, y3Var);
            ka0.C(hlVar, N2, e7Var4);
            boolean equals = u8Var.equals(q8.a);
            xl0 xl0Var = xl0.a;
            w(R.drawable.bottom_nav_history, equals, xa1.c(xl0Var, 50.0f), function0, hlVar, (i3 & 7168) | 384);
            hlVar2 = hlVar;
            w(R.drawable.bottom_nav_home, u8Var.equals(r8.a), xa1.c(xl0Var, 62.0f), function02, hlVar2, (i4 & 7168) | 384);
            w(R.drawable.bottom_nav_achievements, u8Var.equals(o8.a), xa1.c(xl0Var, 50.0f), function03, hlVar2, ((i3 >> 6) & 7168) | 384);
            hlVar2.p(true);
            hlVar2.p(true);
        } else {
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new Function2(am0Var, function0, function02, function03, i2) { // from class: tk1
                public final /* synthetic */ am0 e;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(433);
                    yr1.h(u8.this, this.e, this.g, this.h, this.i, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h0(Context context, Executor executor, lz0 lz0Var, boolean z) {
        boolean z2;
        ?? r7;
        as[] asVarArr;
        as[] asVarArr2;
        as[] asVarArr3;
        byte[] bArr;
        boolean z3;
        boolean z4;
        Throwable th;
        Throwable th2;
        boolean z5;
        boolean z6;
        ?? r72;
        boolean z7;
        zr zrVar;
        boolean z8;
        FileInputStream e2;
        boolean z9;
        boolean z10;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z10 = readLong == packageInfo.lastUpdateTime;
                            if (z10) {
                                lz0Var.k(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z10) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        pz0.c(false, context);
                        return;
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr2 = p4.g;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            zr zrVar2 = new zr(assets, executor, lz0Var, name, file2);
            byte[] bArr3 = (byte[]) zrVar2.d;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        zrVar2.f(4, null);
                    }
                    zrVar2.a = true;
                    try {
                        try {
                            r7 = zrVar2.e(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e3) {
                            lz0Var.k(6, e3);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            asVarArr2 = (as[]) zrVar2.h;
                            if (asVarArr2 != null) {
                            }
                            lz0 lz0Var2 = (lz0) zrVar2.c;
                            asVarArr3 = (as[]) zrVar2.h;
                            byte[] bArr4 = (byte[]) zrVar2.d;
                            boolean z11 = r7;
                            z11 = r7;
                            if (asVarArr3 != null) {
                            }
                            bArr = (byte[]) zrVar2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            pz0.c((z6 || !z) ? false : z9, context);
                        } catch (IOException e4) {
                            lz0Var.k(7, e4);
                            r7 = 0;
                            if (r7 != 0) {
                            }
                            asVarArr2 = (as[]) zrVar2.h;
                            if (asVarArr2 != null) {
                            }
                            lz0 lz0Var22 = (lz0) zrVar2.c;
                            asVarArr3 = (as[]) zrVar2.h;
                            byte[] bArr42 = (byte[]) zrVar2.d;
                            boolean z112 = r7;
                            z112 = r7;
                            if (asVarArr3 != null) {
                            }
                            bArr = (byte[]) zrVar2.e;
                            if (bArr != null) {
                            }
                            if (z4) {
                            }
                            z6 = z4;
                            z9 = z5;
                            pz0.c((z6 || !z) ? false : z9, context);
                        }
                        if (r7 != 0) {
                            try {
                                try {
                                } catch (IOException e5) {
                                    lz0Var.k(7, e5);
                                    try {
                                        r7.close();
                                    } catch (IOException e6) {
                                        lz0Var.k(7, e6);
                                    }
                                    asVarArr = null;
                                    zrVar2.h = asVarArr;
                                    asVarArr2 = (as[]) zrVar2.h;
                                    if (asVarArr2 != null) {
                                    }
                                    lz0 lz0Var222 = (lz0) zrVar2.c;
                                    asVarArr3 = (as[]) zrVar2.h;
                                    byte[] bArr422 = (byte[]) zrVar2.d;
                                    boolean z1122 = r7;
                                    z1122 = r7;
                                    if (asVarArr3 != null) {
                                    }
                                    bArr = (byte[]) zrVar2.e;
                                    if (bArr != null) {
                                    }
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    pz0.c((z6 || !z) ? false : z9, context);
                                }
                            } catch (IllegalStateException e7) {
                                lz0Var.k(8, e7);
                                r7.close();
                                asVarArr = null;
                                zrVar2.h = asVarArr;
                                asVarArr2 = (as[]) zrVar2.h;
                                if (asVarArr2 != null) {
                                }
                                lz0 lz0Var2222 = (lz0) zrVar2.c;
                                asVarArr3 = (as[]) zrVar2.h;
                                byte[] bArr4222 = (byte[]) zrVar2.d;
                                boolean z11222 = r7;
                                z11222 = r7;
                                if (asVarArr3 != null) {
                                }
                                bArr = (byte[]) zrVar2.e;
                                if (bArr != null) {
                                }
                                if (z4) {
                                }
                                z6 = z4;
                                z9 = z5;
                                pz0.c((z6 || !z) ? false : z9, context);
                            }
                            if (!Arrays.equals(bArr2, Z(r7, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            asVarArr = p4.W(r7, Z(r7, 4), (String) zrVar2.g);
                            try {
                                r7.close();
                            } catch (IOException e8) {
                                lz0Var.k(7, e8);
                            }
                            zrVar2.h = asVarArr;
                        }
                        asVarArr2 = (as[]) zrVar2.h;
                        if (asVarArr2 != null && (r7 = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                r7 = "dexopt/baseline.profm";
                                e2 = zrVar2.e(assets, "dexopt/baseline.profm");
                                z8 = r7;
                            } catch (FileNotFoundException e9) {
                                lz0Var.k(9, e9);
                                z8 = r7;
                            } catch (IOException e10) {
                                lz0Var.k(7, e10);
                                z8 = r7;
                            } catch (IllegalStateException e11) {
                                zrVar2.h = null;
                                lz0Var.k(8, e11);
                                z8 = r7;
                            }
                            if (e2 == null) {
                                try {
                                    if (!Arrays.equals(p4.h, Z(e2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] Z = Z(e2, 4);
                                    zrVar2.h = p4.T(e2, Z, bArr3, asVarArr2);
                                    e2.close();
                                    zrVar = zrVar2;
                                    r7 = Z;
                                    if (zrVar != null) {
                                        zrVar2 = zrVar;
                                    }
                                } finally {
                                }
                            } else {
                                if (e2 != null) {
                                    e2.close();
                                    z8 = r7;
                                }
                                zrVar = null;
                                r7 = z8;
                                if (zrVar != null) {
                                }
                            }
                        }
                        lz0 lz0Var22222 = (lz0) zrVar2.c;
                        asVarArr3 = (as[]) zrVar2.h;
                        byte[] bArr42222 = (byte[]) zrVar2.d;
                        boolean z112222 = r7;
                        z112222 = r7;
                        if (asVarArr3 != null && bArr42222 != null) {
                            r72 = zrVar2.a;
                            if (r72 != 0) {
                                dd0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                r72 = new ByteArrayOutputStream();
                                try {
                                    r72.write(bArr2);
                                    r72.write(bArr42222);
                                } finally {
                                }
                            } catch (IOException e12) {
                                lz0Var22222.k(7, e12);
                                z7 = r72;
                            } catch (IllegalStateException e13) {
                                lz0Var22222.k(8, e13);
                                z7 = r72;
                            }
                            if (p4.d0(r72, bArr42222, asVarArr3)) {
                                zrVar2.e = r72.toByteArray();
                                r72.close();
                                z7 = r72;
                                zrVar2.h = null;
                                z112222 = z7;
                            } else {
                                lz0Var22222.k(5, null);
                                zrVar2.h = null;
                                r72.close();
                                z112222 = r72;
                            }
                        }
                        bArr = (byte[]) zrVar2.e;
                        if (bArr != null) {
                            z4 = false;
                            z5 = true;
                        } else {
                            try {
                                if (!zrVar2.a) {
                                    dd0.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream((File) zrVar2.f);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock tryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (tryLock != null) {
                                                                        try {
                                                                            if (tryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                                    if (read <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                                    }
                                                                                }
                                                                                z5 = true;
                                                                                zrVar2.f(1, null);
                                                                                tryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                zrVar2.e = null;
                                                                                zrVar2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (tryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                tryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th12) {
                                                            th2.addSuppressed(th12);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e14) {
                                        e = e14;
                                        zrVar2.f(6, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        pz0.c((z6 || !z) ? false : z9, context);
                                    } catch (IOException e15) {
                                        e = e15;
                                        zrVar2.f(7, e);
                                        z3 = z112222;
                                        z4 = false;
                                        z5 = z3;
                                        if (z4) {
                                        }
                                        z6 = z4;
                                        z9 = z5;
                                        pz0.c((z6 || !z) ? false : z9, context);
                                    }
                                } catch (FileNotFoundException e16) {
                                    e = e16;
                                    z112222 = true;
                                    zrVar2.f(6, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    pz0.c((z6 || !z) ? false : z9, context);
                                } catch (IOException e17) {
                                    e = e17;
                                    z112222 = true;
                                    zrVar2.f(7, e);
                                    z3 = z112222;
                                    z4 = false;
                                    z5 = z3;
                                    if (z4) {
                                    }
                                    z6 = z4;
                                    z9 = z5;
                                    pz0.c((z6 || !z) ? false : z9, context);
                                }
                            } finally {
                                zrVar2.e = null;
                                zrVar2.h = null;
                            }
                        }
                        if (z4) {
                            Q(packageInfo, filesDir);
                        }
                        z6 = z4;
                        z9 = z5;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            zrVar2.f(4, null);
                        }
                        zrVar2.a = true;
                        r7 = zrVar2.e(assets, "dexopt/baseline.prof");
                        if (r7 != 0) {
                        }
                        asVarArr2 = (as[]) zrVar2.h;
                        if (asVarArr2 != null) {
                            r7 = "dexopt/baseline.profm";
                            e2 = zrVar2.e(assets, "dexopt/baseline.profm");
                            z8 = r7;
                            if (e2 == null) {
                            }
                        }
                        lz0 lz0Var222222 = (lz0) zrVar2.c;
                        asVarArr3 = (as[]) zrVar2.h;
                        byte[] bArr422222 = (byte[]) zrVar2.d;
                        boolean z1122222 = r7;
                        z1122222 = r7;
                        if (asVarArr3 != null) {
                            r72 = zrVar2.a;
                            if (r72 != 0) {
                            }
                        }
                        bArr = (byte[]) zrVar2.e;
                        if (bArr != null) {
                        }
                        if (z4) {
                        }
                        z6 = z4;
                        z9 = z5;
                    } catch (IOException unused2) {
                        z2 = true;
                        zrVar2.f(4, null);
                    }
                }
                pz0.c((z6 || !z) ? false : z9, context);
            }
            zrVar2.f(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z6 = false;
            z9 = z2;
            pz0.c((z6 || !z) ? false : z9, context);
        } catch (PackageManager.NameNotFoundException e18) {
            lz0Var.k(7, e18);
            pz0.c(false, context);
        }
    }

    public static we i(int i2, int i3, ue ueVar) {
        if ((i3 & 2) != 0) {
            ueVar = ue.d;
        }
        if (i2 == -2) {
            if (ueVar != ue.d) {
                return new em(1, ueVar);
            }
            fg.a.getClass();
            return new we(eg.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? ueVar == ue.d ? new we(i2) : new em(i2, ueVar) : new we(Integer.MAX_VALUE) : ueVar == ue.d ? new we(0) : new em(1, ueVar);
        }
        if (ueVar == ue.d) {
            return new em(1, ue.e);
        }
        dd0.e("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static void i0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final b5 j(String str) {
        return new b5(p91.a(str));
    }

    public static void j0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        i0(byteArrayOutputStream, i2, 2);
    }

    public static final pr k(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        q20 a2 = r20.a(f2);
        if (a2 == null) {
            a2 = new lh0(f2);
        }
        return new pr(f3, f2, a2);
    }

    public static final void l(hk hkVar, hl hlVar, int i2) {
        hl hlVar2;
        hlVar.Y(-1304365914);
        int i3 = 0;
        int i4 = 2;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            am0 R = R(mo.g(xa1.b, hi.b(0.48f, hi.b), m90.m), 22.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            hlVar2 = hlVar;
            v(R.drawable.panel_large, xa1.b(xa1.a(xl0.a, 1.0f), 420.0f), 0.0f, m90.J(1636625034, new pk1(i3, hkVar), hlVar), hlVar2, 3120, 4);
            hlVar2.p(true);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new sx(hkVar, i2, i4);
        }
    }

    public static final long m(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void n(final int i2, am0 am0Var, hl hlVar, int i3) {
        hl hlVar2;
        hlVar.Y(-2109857495);
        int i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        if (hlVar.O(i4 & 1, (i4 & 19) != 18)) {
            hlVar2 = hlVar;
            v(R.drawable.panel_small, xa1.b(am0Var, 46.0f), 0.0f, m90.J(-70899193, new s30() { // from class: sk1
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    hl hlVar3 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zd) obj).getClass();
                    if (hlVar3.O(intValue & 1, (intValue & 17) != 16)) {
                        xl0 xl0Var = xl0.a;
                        am0 T = yr1.T(xl0Var, 14.0f, 2);
                        r41 a2 = q41.a(yr1.b, j50.q, hlVar3, 48);
                        int hashCode = Long.hashCode(hlVar3.T);
                        kw0 l2 = hlVar3.l();
                        am0 N = p4.N(hlVar3, T);
                        yk.b.getClass();
                        xl xlVar = xk.b;
                        hlVar3.a0();
                        if (hlVar3.S) {
                            hlVar3.k(xlVar);
                        } else {
                            hlVar3.k0();
                        }
                        ka0.C(hlVar3, a2, xk.e);
                        ka0.C(hlVar3, l2, xk.d);
                        ka0.u(hlVar3, Integer.valueOf(hashCode), xk.f);
                        ka0.A(hlVar3, xk.g);
                        ka0.C(hlVar3, N, xk.c);
                        yr1.e(R.drawable.golden_feather_currency_icon, xa1.c(xl0Var, 28.0f), null, hlVar3, 48, 4);
                        eh1.b(String.valueOf(i2), null, hi.c, 0L, x20.l, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar3, 1573248, 0, 262074);
                        hlVar3.p(true);
                    } else {
                        hlVar3.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar2, 3456, 0);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new td(i2, i3, am0Var);
        }
    }

    public static final void o(hk hkVar, hl hlVar, int i2) {
        hlVar.Y(-999535691);
        int i3 = 0;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            ke1 ke1Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) hlVar.j(ke1Var);
            boolean z = ((Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            p(context, z, hlVar, 0);
            vy vyVar = xa1.b;
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, vyVar);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            hkVar.a(zd.a, hlVar, 54);
            if (z) {
                hlVar.W(1322077959);
            } else {
                hlVar.W(1323332498);
                am0 a2 = xa1.a(zd.a(j50.h), 1.0f);
                Context context2 = (Context) hlVar.j(ke1Var);
                nr nrVar = (nr) hlVar.j(yl.h);
                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                vd.a(mo.g(xa1.b(a2, nrVar.i0(identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0)), hi.b, m90.m), hlVar, 0);
            }
            hlVar.p(false);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new sx(hkVar, i2, i3);
        }
    }

    public static final void p(final Context context, final boolean z, hl hlVar, final int i2) {
        hlVar.Y(309375584);
        int i3 = (hlVar.h(context) ? 4 : 2) | i2 | (hlVar.g(z) ? 32 : 16);
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            Boolean valueOf = Boolean.valueOf(z);
            boolean h2 = hlVar.h(context) | ((i3 & 112) == 32);
            Object L = hlVar.L();
            if (h2 || L == bl.a) {
                L = new Function1() { // from class: tx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Window window;
                        ((ps) obj).getClass();
                        Context context2 = context;
                        WindowInsetsController windowInsetsController = null;
                        Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                        if (activity != null && (window = activity.getWindow()) != null) {
                            windowInsetsController = window.getInsetsController();
                        }
                        if (windowInsetsController != null) {
                            windowInsetsController.setSystemBarsBehavior(2);
                        }
                        boolean z2 = z;
                        int statusBars = z2 ? WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars() : WindowInsets.Type.statusBars();
                        if (windowInsetsController != null) {
                            windowInsetsController.hide(statusBars);
                        }
                        if (!z2 && windowInsetsController != null) {
                            windowInsetsController.show(WindowInsets.Type.navigationBars());
                        }
                        return new n2(3, windowInsetsController);
                    }
                };
                hlVar.h0(L);
            }
            p4.a(context, valueOf, (Function1) L, hlVar);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2(context, z, i2) { // from class: ux
                public final /* synthetic */ Context d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int P = gb0.P(1);
                    yr1.p(this.d, this.e, (hl) obj, P);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    public static final void q(List list, hl hlVar, int i2) {
        ?? r3;
        hl hlVar2;
        boolean z;
        hl hlVar3;
        hl hlVar4 = hlVar;
        hlVar4.Y(915023861);
        int i3 = (hlVar4.h(list) ? 4 : 2) | i2;
        if (hlVar4.O(i3 & 1, (i3 & 3) != 2)) {
            am0 R = R(xa1.b, 18.0f);
            yi a2 = wi.a(c, j50.s, hlVar4, 0);
            int hashCode = Long.hashCode(hlVar4.T);
            kw0 l2 = hlVar4.l();
            am0 N = p4.N(hlVar4, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar4.a0();
            if (hlVar4.S) {
                hlVar4.k(xlVar);
            } else {
                hlVar4.k0();
            }
            e7 e7Var = xk.e;
            ka0.C(hlVar4, a2, e7Var);
            e7 e7Var2 = xk.d;
            ka0.C(hlVar4, l2, e7Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var3 = xk.f;
            ka0.u(hlVar4, valueOf, e7Var3);
            y3 y3Var = xk.g;
            ka0.A(hlVar4, y3Var);
            e7 e7Var4 = xk.c;
            ka0.C(hlVar4, N, e7Var4);
            xl0 xl0Var = xl0.a;
            e(R.drawable.title_history, xa1.b(xa1.a(xl0Var, 1.0f), 96.0f), null, hlVar4, 48, 4);
            ca0.b(hlVar4, xa1.b(xl0Var, 12.0f));
            if (list.isEmpty()) {
                hlVar4.W(1665914241);
                am0 c2 = xa1.a(xl0Var, 1.0f).c(new yd0(1.0f, true));
                vk0 d2 = vd.d(j50.k, false);
                int hashCode2 = Long.hashCode(hlVar4.T);
                kw0 l3 = hlVar4.l();
                am0 N2 = p4.N(hlVar4, c2);
                hlVar4.a0();
                if (hlVar4.S) {
                    hlVar4.k(xlVar);
                } else {
                    hlVar4.k0();
                }
                ka0.C(hlVar4, d2, e7Var);
                ka0.C(hlVar4, l3, e7Var2);
                ka0.u(hlVar4, Integer.valueOf(hashCode2), e7Var3);
                ka0.A(hlVar4, y3Var);
                ka0.C(hlVar4, N2, e7Var4);
                v(R.drawable.panel_medium, xa1.b(xa1.a(xl0Var, 1.0f), 150.0f), 0.08f, m90.g, hlVar, 3504, 0);
                hl hlVar5 = hlVar;
                z = true;
                hlVar5.p(true);
                hlVar5.p(false);
                hlVar3 = hlVar5;
            } else {
                hlVar4.W(1667464830);
                h9 h9Var = new h9(10.0f, true, new e9(1, (byte) 0));
                boolean h2 = hlVar4.h(list);
                Object L = hlVar4.L();
                if (h2 || L == bl.a) {
                    L = new l(12, list);
                    hlVar4.h0(L);
                }
                xa0.b(null, null, null, h9Var, null, null, false, null, (Function1) L, hlVar, 24576);
                hl hlVar6 = hlVar;
                hlVar6.p(false);
                z = true;
                hlVar3 = hlVar6;
            }
            hlVar3.p(z);
            r3 = z;
            hlVar2 = hlVar3;
        } else {
            r3 = 1;
            hlVar4.R();
            hlVar2 = hlVar4;
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new zk0(list, i2, r3);
        }
    }

    public static final void r(ia iaVar, hl hlVar, int i2) {
        hl hlVar2;
        iaVar.getClass();
        hlVar.Y(-337666594);
        int i3 = 4;
        int i4 = (hlVar.f(iaVar) ? 4 : 2) | i2;
        int i5 = 0;
        if (hlVar.O(i4 & 1, (i4 & 3) != 2)) {
            Object L = hlVar.L();
            if (L == bl.a) {
                L = new SimpleDateFormat("dd MMM, HH:mm", Locale.getDefault());
                hlVar.h0(L);
            }
            hlVar2 = hlVar;
            v(R.drawable.panel_medium, xa1.b(xa1.a(xl0.a, 1.0f), 112.0f), 0.0f, m90.J(1226491324, new al0(iaVar, i5, (SimpleDateFormat) L), hlVar), hlVar2, 3504, 0);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new jl(i2, i3, iaVar);
        }
    }

    public static final void s(List list, hl hlVar, int i2) {
        list.getClass();
        hlVar.Y(-40046924);
        int i3 = (hlVar.h(list) ? 4 : 2) | i2;
        int i4 = 0;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            q(list, hlVar, i3 & 14);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new zk0(list, i2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final int i2, final Function0 function0, final am0 am0Var, boolean z, final String str, hl hlVar, final int i3, final int i4) {
        int i5;
        boolean z2;
        final boolean z3;
        i11 r2;
        function0.getClass();
        hlVar.Y(-717000746);
        if ((i3 & 6) == 0) {
            i5 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= hlVar.h(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= hlVar.f(am0Var) ? 256 : 128;
        }
        int i6 = i4 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z2 = z;
            i5 |= hlVar.g(z2) ? 2048 : 1024;
            if ((i3 & 24576) == 0) {
                i5 |= hlVar.f(str) ? 16384 : 8192;
            }
            if (hlVar.O(i5 & 1, (i5 & 9363) == 9362)) {
                hlVar.R();
                z3 = z2;
            } else {
                boolean z4 = i6 != 0 ? true : z2;
                am0 h2 = mo.h(mo.e(am0Var, z4 ? 1.0f : 0.42f), n41.a(8.0f));
                Object L = hlVar.L();
                if (L == bl.a) {
                    L = new gn0();
                    hlVar.h0(L);
                }
                am0 v = p4.v(h2, (gn0) L, z4, function0, 24);
                vk0 d2 = vd.d(j50.k, false);
                int hashCode = Long.hashCode(hlVar.T);
                kw0 l2 = hlVar.l();
                am0 N = p4.N(hlVar, v);
                yk.b.getClass();
                xl xlVar = xk.b;
                hlVar.a0();
                if (hlVar.S) {
                    hlVar.k(xlVar);
                } else {
                    hlVar.k0();
                }
                ka0.C(hlVar, d2, xk.e);
                ka0.C(hlVar, l2, xk.d);
                ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
                ka0.A(hlVar, xk.g);
                ka0.C(hlVar, N, xk.c);
                mo.c(t80.F(i2, hlVar, i5 & 14), str, xa1.b, null, xm.c, 0.0f, hlVar, 24968 | ((i5 >> 9) & 112));
                hlVar.p(true);
                z3 = z4;
            }
            r2 = hlVar.r();
            if (r2 == null) {
                r2.d = new Function2() { // from class: ok1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object b(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yr1.t(i2, function0, am0Var, z3, str, (hl) obj, gb0.P(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 24576) == 0) {
        }
        if (hlVar.O(i5 & 1, (i5 & 9363) == 9362)) {
        }
        r2 = hlVar.r();
        if (r2 == null) {
        }
    }

    public static final void u(int i2, Function0 function0, am0 am0Var, String str, hl hlVar, int i3) {
        int i4;
        function0.getClass();
        hlVar.Y(-1279028967);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.h(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.f(am0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= hlVar.f(str) ? 2048 : 1024;
        }
        if (hlVar.O(i4 & 1, (i4 & 1171) != 1170)) {
            am0 h2 = mo.h(am0Var, n41.a(8.0f));
            Object L = hlVar.L();
            if (L == bl.a) {
                L = new gn0();
                hlVar.h0(L);
            }
            am0 R = R(p4.v(h2, (gn0) L, false, function0, 28), 3.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, R);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            mo.c(t80.F(i2, hlVar, i4 & 14), str, xa1.b, null, xm.c, 0.0f, hlVar, 24968 | ((i4 >> 6) & 112));
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new xe0(i2, function0, am0Var, str, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(final int i2, final am0 am0Var, float f2, hk hkVar, hl hlVar, final int i3, final int i4) {
        float f3;
        hk hkVar2;
        final float f4;
        i11 r2;
        hlVar.Y(1787641243);
        int i5 = (hlVar.d(i2) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i5 |= hlVar.f(am0Var) ? 32 : 16;
        }
        int i6 = i4 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            f3 = f2;
            i5 |= hlVar.c(f3) ? 256 : 128;
            if (hlVar.O(i5 & 1, (i5 & 1171) == 1170)) {
                hkVar2 = hkVar;
                hlVar.R();
                f4 = f3;
            } else {
                float f5 = i6 != 0 ? 0.16f : f3;
                am0 h2 = mo.h(am0Var, n41.a(8.0f));
                kd kdVar = j50.k;
                vk0 d2 = vd.d(kdVar, false);
                int hashCode = Long.hashCode(hlVar.T);
                kw0 l2 = hlVar.l();
                am0 N = p4.N(hlVar, h2);
                yk.b.getClass();
                xl xlVar = xk.b;
                hlVar.a0();
                if (hlVar.S) {
                    hlVar.k(xlVar);
                } else {
                    hlVar.k0();
                }
                e7 e7Var = xk.e;
                ka0.C(hlVar, d2, e7Var);
                e7 e7Var2 = xk.d;
                ka0.C(hlVar, l2, e7Var2);
                Integer valueOf = Integer.valueOf(hashCode);
                e7 e7Var3 = xk.f;
                ka0.u(hlVar, valueOf, e7Var3);
                y3 y3Var = xk.g;
                ka0.A(hlVar, y3Var);
                e7 e7Var4 = xk.c;
                ka0.C(hlVar, N, e7Var4);
                mo.c(t80.F(i2, hlVar, i5 & 14), null, zd.b(), null, xm.c, 0.0f, hlVar, 24632);
                if (f5 > 0.0f) {
                    hlVar.W(421738278);
                    vd.a(mo.g(zd.b(), hi.b(f5, hi.b), m90.m), hlVar, 0);
                } else {
                    hlVar.W(414647617);
                }
                hlVar.p(false);
                am0 b2 = zd.b();
                vk0 d3 = vd.d(kdVar, false);
                int hashCode2 = Long.hashCode(hlVar.T);
                kw0 l3 = hlVar.l();
                am0 N2 = p4.N(hlVar, b2);
                hlVar.a0();
                if (hlVar.S) {
                    hlVar.k(xlVar);
                } else {
                    hlVar.k0();
                }
                ka0.C(hlVar, d3, e7Var);
                ka0.C(hlVar, l3, e7Var2);
                ka0.u(hlVar, Integer.valueOf(hashCode2), e7Var3);
                ka0.A(hlVar, y3Var);
                ka0.C(hlVar, N2, e7Var4);
                hkVar2 = hkVar;
                hkVar2.a(zd.a, hlVar, 54);
                hlVar.p(true);
                hlVar.p(true);
                f4 = f5;
            }
            r2 = hlVar.r();
            if (r2 == null) {
                final hk hkVar3 = hkVar2;
                r2.d = new Function2() { // from class: nk1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object b(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yr1.v(i2, am0Var, f4, hkVar3, (hl) obj, gb0.P(i3 | 1), i4);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if (hlVar.O(i5 & 1, (i5 & 1171) == 1170)) {
        }
        r2 = hlVar.r();
        if (r2 == null) {
        }
    }

    public static final void w(int i2, boolean z, am0 am0Var, Function0 function0, hl hlVar, int i3) {
        int i4;
        am0Var.getClass();
        function0.getClass();
        hlVar.Y(-1399509927);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.g(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.f(am0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= hlVar.h(function0) ? 2048 : 1024;
        }
        if (hlVar.O(i4 & 1, (i4 & 1171) != 1170)) {
            am0 h2 = mo.h(mo.e(am0Var, z ? 1.0f : 0.72f), n41.a);
            Object L = hlVar.L();
            if (L == bl.a) {
                L = new gn0();
                hlVar.h0(L);
            }
            am0 v = p4.v(h2, (gn0) L, false, function0, 28);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, v);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            e(i2, xa1.b, null, hlVar, (i4 & 14) | 48, 4);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new rk1(i2, z, am0Var, function0, i3);
        }
    }

    public static final void x(Function0 function0, am0 am0Var, hl hlVar, int i2) {
        hl hlVar2 = hlVar;
        function0.getClass();
        hlVar2.Y(-552778041);
        int i3 = i2 | (hlVar2.h(function0) ? 32 : 16);
        if (hlVar2.O(i3 & 1, (i3 & 147) != 146)) {
            am0 h2 = mo.h(am0Var, n41.a(8.0f));
            Object L = hlVar2.L();
            if (L == bl.a) {
                L = new gn0();
                hlVar2.h0(L);
            }
            am0 v = p4.v(h2, (gn0) L, false, function0, 28);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            am0 N = p4.N(hlVar2, v);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, d2, xk.e);
            ka0.C(hlVar2, l2, xk.d);
            ka0.u(hlVar2, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar2, xk.g);
            ka0.C(hlVar2, N, xk.c);
            mo.c(t80.F(R.drawable.panel_small, hlVar2, 0), null, xa1.b, null, xm.c, 0.0f, hlVar2, 25016);
            eh1.b("HOME", null, la0.d(4294961562L), 0L, x20.l, null, 0L, null, 0L, 0, false, 0, 0, null, hlVar, 1573254, 0, 262074);
            hlVar2 = hlVar;
            hlVar2.p(true);
        } else {
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new il(i2, 9, function0, am0Var);
        }
    }

    public static final void y(boolean z, int i2, int i3, am0 am0Var, Function0 function0, hl hlVar, int i4) {
        hl hlVar2;
        Function0 function02;
        am0 am0Var2;
        am0Var.getClass();
        function0.getClass();
        hlVar.Y(-1232280604);
        int i5 = (hlVar.g(z) ? 4 : 2) | i4 | (hlVar.d(i2) ? 32 : 16) | (hlVar.d(i3) ? 256 : 128) | (hlVar.h(function0) ? 16384 : 8192);
        if (hlVar.O(i5 & 1, (i5 & 9363) != 9362)) {
            hlVar2 = hlVar;
            u(z ? i2 : i3, function0, am0Var, null, hlVar2, ((i5 >> 9) & 112) | 3456);
            function02 = function0;
            am0Var2 = am0Var;
        } else {
            hlVar2 = hlVar;
            function02 = function0;
            am0Var2 = am0Var;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new rk1(z, i2, i3, am0Var2, function02, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(List list, uo uoVar, fn fnVar) {
        no noVar;
        int i2;
        List list2;
        z11 z11Var;
        Iterator it;
        Throwable th;
        if (fnVar instanceof no) {
            noVar = (no) fnVar;
            int i3 = noVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                noVar.k = i3 - Integer.MIN_VALUE;
                Object obj = noVar.j;
                Object obj2 = tn.d;
                i2 = noVar.k;
                if (i2 != 0) {
                    ca0.v(obj);
                    ArrayList arrayList = new ArrayList();
                    po poVar = new po(list, arrayList, (dn) null);
                    noVar.h = arrayList;
                    noVar.k = 1;
                    if (uoVar.a(poVar, noVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = noVar.i;
                        z11Var = (z11) noVar.h;
                        try {
                            ca0.v(obj);
                        } catch (Throwable th2) {
                            Object obj3 = z11Var.d;
                            if (obj3 == null) {
                                z11Var.d = th2;
                            } else {
                                lw.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            noVar.h = z11Var;
                            noVar.i = it;
                            noVar.k = 2;
                            if (function1.invoke(noVar) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) z11Var.d;
                        if (th == null) {
                            return Unit.a;
                        }
                        throw th;
                    }
                    list2 = (List) noVar.h;
                    ca0.v(obj);
                }
                z11Var = new z11();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) z11Var.d;
                if (th == null) {
                }
            }
        }
        noVar = new no(fnVar);
        Object obj4 = noVar.j;
        Object obj22 = tn.d;
        i2 = noVar.k;
        if (i2 != 0) {
        }
        z11Var = new z11();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) z11Var.d;
        if (th == null) {
        }
    }
}
