package defpackage;

import android.content.Context;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.feathherdashh.dashgame.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class t90 {
    public static String a;

    public static int A(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void B(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final long C(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final String D(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void E(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i));
    }

    public static int F(Parcel parcel) {
        int readInt = parcel.readInt();
        int A = A(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ij("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = A + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new ij("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
    }

    public static void G(Parcel parcel, int i, int i2) {
        int A = A(parcel, i);
        if (A == i2) {
            return;
        }
        throw new ij("Expected size " + i2 + " got " + A + " (0x" + Integer.toHexString(A) + ")", parcel);
    }

    public static final void a(Function0 function0, am0 am0Var, bf0 bf0Var, qf0 qf0Var, hl hlVar, int i) {
        hlVar.Y(1055276397);
        int i2 = (hlVar.h(function0) ? 4 : 2) | i | (hlVar.f(am0Var) ? 32 : 16) | (hlVar.f(bf0Var) ? 256 : 128) | (hlVar.f(qf0Var) ? 2048 : 1024);
        if (hlVar.O(i2 & 1, (i2 & 1171) != 1170)) {
            ka0.a(m90.J(-933153643, new re0(bf0Var, am0Var, qf0Var, gb0.H(function0, hlVar), 0), hlVar), hlVar, 6);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new se0(function0, am0Var, bf0Var, qf0Var, i, 0);
        }
    }

    public static x5 b(String str, th1 th1Var, long j, or orVar, v10 v10Var, int i) {
        nv nvVar = nv.d;
        return new x5(new b6(str, th1Var, nvVar, nvVar, v10Var, orVar), i, 1, j);
    }

    public static final s11 c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new s11(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final int d(ej0 ej0Var, m60 m60Var) {
        ej0 n0 = ej0Var.n0();
        if (n0 == null) {
            o80.b("Child of " + ej0Var + " cannot be null when calculating alignment line");
        }
        if (ej0Var.r0().a().containsKey(m60Var)) {
            Integer num = (Integer) ej0Var.r0().a().get(m60Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int j0 = n0.j0(m60Var);
            if (j0 != Integer.MIN_VALUE) {
                n0.n = true;
                ej0Var.o = true;
                ej0Var.x0();
                n0.n = false;
                ej0Var.o = false;
                return j0 + ((int) (m60Var instanceof m60 ? n0.t0() & 4294967295L : n0.t0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final String e(Object[] objArr, int i, int i2, f0 f0Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == f0Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final int f(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static StaticLayout g(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i2 < 0) {
            p80.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            p80.a("invalid end value");
        }
        if (i3 < 0) {
            p80.a("invalid maxLines value");
        }
        if (i < 0) {
            p80.a("invalid width value");
        }
        if (i4 < 0) {
            p80.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        obtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            lineBreakStyle = l1.a().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static Bundle h(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + A);
        return readBundle;
    }

    public static Parcelable i(Parcel parcel, int i, Parcelable.Creator creator) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + A);
        return parcelable;
    }

    public static String j(Parcel parcel, int i) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + A);
        return readString;
    }

    public static Object[] k(Parcel parcel, int i, Parcelable.Creator creator) {
        int A = A(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (A == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + A);
        return createTypedArray;
    }

    public static final long l() {
        return Thread.currentThread().getId();
    }

    public static void m(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ij(qy0.i(i, "Overread allowed size end="), parcel);
        }
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static final float o(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final e61 p(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            e61 e61Var = tag instanceof e61 ? (e61) tag : null;
            if (e61Var != null) {
                return e61Var;
            }
            Object x = gb0.x(view);
            view = x instanceof View ? (View) x : null;
        }
        return null;
    }

    public static final long q(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final gm0 r(CoroutineContext coroutineContext) {
        gm0 gm0Var = (gm0) coroutineContext.d(j50.z);
        if (gm0Var != null) {
            return gm0Var;
        }
        dd0.j("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final e81 s(Object obj) {
        if (obj != yr1.h) {
            return (e81) obj;
        }
        dd0.j("Does not contain segment");
        return null;
    }

    public static final boolean t(Object obj) {
        return obj == yr1.h;
    }

    public static MappedByteBuffer u(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final long v(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(ViewStructure viewStructure, jd0 jd0Var, AutofillId autofillId, String str, u11 u11Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        pi1 pi1Var;
        y7 y7Var;
        l5 l5Var;
        a5 a5Var;
        boolean z2;
        an anVar;
        Boolean bool;
        e41 e41Var;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        String[] L;
        boolean z4;
        Object[] objArr;
        String[] L2;
        String[] L3;
        vn0 vn0Var;
        long[] jArr;
        Object[] objArr2;
        int i3;
        long[] jArr2;
        Object[] objArr3;
        vn0 vn0Var2;
        pi1 pi1Var2;
        y7 y7Var2;
        l5 l5Var2;
        t81 t81Var = p81.a;
        t81 t81Var2 = g81.a;
        h81 v = jd0Var.v();
        int i4 = 8;
        if (v == null || (vn0Var2 = v.d) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            pi1Var = null;
            y7Var = null;
            l5Var = null;
            a5Var = null;
            z2 = false;
            anVar = null;
            bool = null;
            e41Var = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr4 = vn0Var2.b;
            j = 128;
            Object[] objArr5 = vn0Var2.c;
            long[] jArr3 = vn0Var2.a;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                a5Var = null;
                j2 = 255;
                z2 = false;
                pi1Var2 = null;
                y7Var2 = null;
                l5Var2 = null;
                anVar = null;
                bool = null;
                e41Var = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr4[i8];
                                Object obj2 = objArr5[i8];
                                t81 t81Var3 = (t81) obj;
                                if (Intrinsics.a(t81Var3, p81.r)) {
                                    obj2.getClass();
                                    a5Var = (a5) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.a(t81Var3, p81.q)) {
                                    obj2.getClass();
                                    anVar = (an) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.s)) {
                                    obj2.getClass();
                                    l5Var2 = (l5) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.D)) {
                                    obj2.getClass();
                                    y7Var2 = (y7) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.a(t81Var3, p81.L)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.H)) {
                                    z3 = true;
                                } else if (Intrinsics.a(t81Var3, p81.n)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (Intrinsics.a(t81Var3, p81.w)) {
                                    obj2.getClass();
                                    e41Var = (e41) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.F)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.a(t81Var3, p81.G)) {
                                    obj2.getClass();
                                    pi1Var2 = (pi1) obj2;
                                } else if (Intrinsics.a(t81Var3, g81.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.a(t81Var3, g81.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.a(t81Var3, g81.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.a(t81Var3, g81.k)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                a5Var = null;
                z2 = false;
                pi1Var2 = null;
                y7Var2 = null;
                l5Var2 = null;
                anVar = null;
                bool = null;
                e41Var = null;
                z3 = false;
                num = null;
            }
            pi1Var = pi1Var2;
            y7Var = y7Var2;
            l5Var = l5Var2;
        }
        h81 v2 = jd0Var.v();
        if (v2 != null && v2.g && !v2.h) {
            v2 = v2.b();
            mn0 mn0Var = new mn0(((bo0) jd0Var.m()).d.g);
            mn0Var.c(jd0Var.m());
            while (mn0Var.i()) {
                jd0 jd0Var2 = (jd0) mn0Var.k(mn0Var.b - 1);
                h81 v3 = jd0Var2.v();
                if (v3 != null && !v3.g) {
                    v2.e(v3);
                    if (!v3.h) {
                        mn0Var.c(jd0Var2.m());
                    }
                }
            }
        }
        if (v2 != null && (vn0Var = v2.d) != null) {
            Object[] objArr6 = vn0Var.b;
            Object[] objArr7 = vn0Var.c;
            long[] jArr4 = vn0Var.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 1;
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i10];
                    int i11 = i4;
                    List list2 = list;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i10 - length2)) >>> 31);
                        i2 = i9;
                        list = list2;
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i10 << 3) + i13;
                                Object obj3 = objArr6[i14];
                                Object obj4 = objArr7[i14];
                                jArr2 = jArr4;
                                t81 t81Var4 = (t81) obj3;
                                objArr3 = objArr6;
                                if (Intrinsics.a(t81Var4, p81.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.a(t81Var4, p81.z)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr3 = objArr6;
                            }
                            j5 >>= i11;
                            i13++;
                            objArr6 = objArr3;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr2 = objArr6;
                        i3 = i11;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr2 = objArr6;
                        i2 = i9;
                        i3 = i11;
                        list = list2;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i4 = i3;
                    i9 = i2;
                    objArr6 = objArr2;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(jd0Var.e);
                if (jd0Var.s() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = a5Var == null ? Integer.valueOf(a5Var.a) : z2 ? Integer.valueOf(i2) : pi1Var != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (y7Var != null) {
                    viewStructure.setAutofillValue(AutofillValue.forText(y7Var.e));
                }
                if (l5Var != null) {
                    viewStructure.setAutofillValue(l5Var.a);
                }
                if (anVar != null && (L3 = yr1.L(anVar)) != null) {
                    viewStructure.setAutofillHints(L3);
                }
                u11Var.a.g(jd0Var.e, new by0(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (pi1Var == null) {
                    boolean z5 = i2;
                    viewStructure.setCheckable(z5);
                    viewStructure.setChecked(pi1Var == pi1.d ? z5 ? 1 : 0 : false);
                } else {
                    boolean z6 = i2;
                    if (bool != null) {
                        viewStructure.setCheckable(z6);
                        viewStructure.setChecked(bool.booleanValue());
                    }
                }
                an.a.getClass();
                L = yr1.L(zm.b);
                L.getClass();
                if (L.length != 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                String str2 = L[0];
                if (anVar == null || (L2 = yr1.L(anVar)) == null) {
                    z4 = true;
                } else {
                    z4 = true;
                    if (y9.i(L2, str2)) {
                        objArr = true;
                        boolean z7 = (!z3 || objArr == true) ? z4 : false;
                        viewStructure.setDataIsSensitive((!z7 || z) ? z4 : false);
                        viewStructure.setVisibility(!((qp0) jd0Var.J.e).R0() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str3 = str3 + ((y7) list.get(i15)).e + '\n';
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((bo0) jd0Var.m()).isEmpty() && e41Var != null) {
                            viewStructure.setClassName("android.widget.ImageView");
                        }
                        if (z2) {
                            return;
                        }
                        viewStructure.setClassName("android.widget.EditText");
                        if (num != null) {
                            viewStructure.setMaxTextLength(num.intValue());
                        }
                        if (z7) {
                            viewStructure.setInputType(129);
                            return;
                        }
                        return;
                    }
                }
                objArr = false;
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z7 || z) ? z4 : false);
                viewStructure.setVisibility(!((qp0) jd0Var.J.e).R0() ? 4 : 0);
                if (list != null) {
                }
                if (((bo0) jd0Var.m()).isEmpty()) {
                    viewStructure.setClassName("android.widget.ImageView");
                }
                if (z2) {
                }
            }
        }
        i2 = 1;
        list = null;
        Integer valueOf22 = Integer.valueOf(jd0Var.e);
        if (jd0Var.s() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (a5Var == null) {
        }
        if (valueOf != null) {
        }
        if (y7Var != null) {
        }
        if (l5Var != null) {
        }
        if (anVar != null) {
            viewStructure.setAutofillHints(L3);
        }
        u11Var.a.g(jd0Var.e, new by0(viewStructure));
        if (bool != null) {
        }
        if (pi1Var == null) {
        }
        an.a.getClass();
        L = yr1.L(zm.b);
        L.getClass();
        if (L.length != 0) {
        }
    }

    public static final void x(db1 db1Var, b9 b9Var, int i) {
        while (true) {
            int i2 = db1Var.v;
            if (i > i2 && i < db1Var.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            db1Var.M();
            if (db1Var.y(db1Var.v)) {
                b9Var.i();
            }
            db1Var.j();
        }
    }

    public static boolean y(Parcel parcel, int i) {
        G(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int z(Parcel parcel, int i) {
        G(parcel, i, 4);
        return parcel.readInt();
    }
}
