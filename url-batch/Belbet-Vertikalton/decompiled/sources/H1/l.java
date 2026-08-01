package H1;

import M.E;
import M.P;
import M.Y;
import S.o;
import S.q;
import V.s;
import V.t;
import a.AbstractC0058a;
import a1.C0064b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import c1.AbstractC0104a;
import c1.AbstractC0106c;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import h0.AbstractC0141G;
import h0.S;
import i0.C0178c;
import i0.C0179d;
import i1.InterfaceC0192l;
import i1.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k0.InterfaceC0199a;
import n.C0267c0;
import p0.x;
import r1.AbstractC0351a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static long f564a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f565b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f566c = true;

    /* renamed from: d, reason: collision with root package name */
    public static Field f567d;
    public static boolean e;

    public static K.e A(C0267c0 c0267c0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new K.e(o.c(c0267c0));
        }
        TextPaint textPaint = new TextPaint(c0267c0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = S.m.a(c0267c0);
        int d2 = S.m.d(c0267c0);
        if (c0267c0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0267c0.getInputType() & 15) != 3) {
                boolean z2 = c0267c0.getLayoutDirection() == 1;
                switch (c0267c0.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z2) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(o.b(S.n.a(c0267c0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new K.e(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static a1.d C(a1.d dVar) {
        a1.d intercepted;
        j1.h.e(dVar, "<this>");
        AbstractC0106c abstractC0106c = dVar instanceof AbstractC0106c ? (AbstractC0106c) dVar : null;
        return (abstractC0106c == null || (intercepted = abstractC0106c.intercepted()) == null) ? dVar : intercepted;
    }

    public static boolean D(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = E.a.f278a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d2 = red / 255.0d;
            double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = green / 255.0d;
            double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            double d4 = blue / 255.0d;
            double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d5;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d5 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean F() {
        boolean isEnabled;
        try {
            if (f565b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f565b == null) {
                f564a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f565b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f565b.invoke(null, Long.valueOf(f564a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean G(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int H(int i, int i2, float f2) {
        return E.a.b(E.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static List I(Object obj) {
        List singletonList = Collections.singletonList(obj);
        j1.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static MappedByteBuffer J(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
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
        } catch (IOException unused) {
            return null;
        }
    }

    public static void K(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static a1.i N(a1.i iVar, a1.i iVar2) {
        j1.h.e(iVar2, "context");
        return iVar2 == a1.j.f1673a ? iVar : (a1.i) iVar2.q(iVar, C0064b.f1668d);
    }

    public static W.b O(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    W.b bVar = new W.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f702d = duplicate;
                    bVar.f699a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f700b = i6;
                    bVar.f701c = ((ByteBuffer) bVar.f702d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List P(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        Y0.c cVar = new Y0.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            j1.h.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            j1.h.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new C0178c(i, i2, string, string2));
        }
        Y0.c f2 = f(cVar);
        j1.h.e(f2, "<this>");
        if (f2.a() <= 1) {
            return X0.k.s0(f2);
        }
        Object[] array = f2.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return X0.j.l0(array);
    }

    public static final C0179d Q(InterfaceC0199a interfaceC0199a, String str, boolean z2) {
        Cursor u2 = interfaceC0199a.u("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = u2.getColumnIndex("seqno");
            int columnIndex2 = u2.getColumnIndex("cid");
            int columnIndex3 = u2.getColumnIndex("name");
            int columnIndex4 = u2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (u2.moveToNext()) {
                    if (u2.getInt(columnIndex2) >= 0) {
                        int i = u2.getInt(columnIndex);
                        String string = u2.getString(columnIndex3);
                        String str2 = u2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        j1.h.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                j1.h.d(values, "columnsMap.values");
                List s0 = X0.k.s0(values);
                Collection values2 = treeMap2.values();
                j1.h.d(values2, "ordersMap.values");
                C0179d c0179d = new C0179d(str, z2, s0, X0.k.s0(values2));
                j(u2, null);
                return c0179d;
            }
            j(u2, null);
            return null;
        } finally {
        }
    }

    public static void R(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        F.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void S(Object[] objArr, int i, int i2) {
        j1.h.e(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static int T(Context context, int i, int i2) {
        TypedValue V2 = AbstractC0058a.V(context, i);
        return (V2 == null || V2.type != 16) ? i2 : V2.data;
    }

    public static TimeInterpolator U(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!G(valueOf, "cubic-bezier") && !G(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (G(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return O.a.b(y(split, 0), y(split, 1), y(split, 2), y(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!G(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            E.f.b(AbstractC0058a.o(substring), path);
            return O.a.c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static void W(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            Y.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void Y(TextView textView, int i) {
        d.k(i);
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void Z(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = P.f711a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static final boolean a(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!j1.h.a(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static void a0(TextView textView, int i) {
        d.k(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static final String b(Object[] objArr, int i, int i2, X0.f fVar) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        j1.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void b0(TextView textView, int i) {
        d.k(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void c(StringBuilder sb, Object obj, InterfaceC0192l interfaceC0192l) {
        if (interfaceC0192l != null) {
            sb.append((CharSequence) interfaceC0192l.g(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void c0(View view, N0.g gVar) {
        G0.a aVar = gVar.f900a.f887b;
        if (aVar == null || !aVar.f334a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = P.f711a;
            f2 += E.i((View) parent);
        }
        N0.f fVar = gVar.f900a;
        if (fVar.f894l != f2) {
            fVar.f894l = f2;
            gVar.m();
        }
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                F.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                F.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                F.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void d0(Drawable drawable, int i) {
        F.a.g(drawable, i);
    }

    public static final boolean e(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        j1.h.e(bArr, "a");
        j1.h.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static Y0.c f(Y0.c cVar) {
        cVar.f();
        cVar.f1401c = true;
        return cVar.f1400b > 0 ? cVar : Y0.c.f1398d;
    }

    public static void g(long j, M1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        M1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((M1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        M1.i iVar = (M1.i) arrayList.get(i2);
        M1.i iVar2 = (M1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            M1.i iVar3 = (M1.i) arrayList.get(i11);
            i4 = i11;
            i5 = intValue;
            iVar = iVar3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (iVar.d(i8) == iVar2.d(i8)) {
            int min = Math.min(iVar.a(), iVar2.a());
            int i12 = 0;
            for (int i13 = i8; i13 < min && iVar.d(i13) == iVar2.d(i13); i13++) {
                i12++;
            }
            long j2 = 4;
            long j3 = (fVar.f827b / j2) + j + 2 + i12 + 1;
            fVar.O(-i12);
            fVar.O(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.O(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((M1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.O(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                M1.f fVar3 = new M1.f();
                fVar.O(((int) ((fVar3.f827b / j2) + j3)) * (-1));
                g(j3, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.L(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((M1.i) arrayList.get(i16 - 1)).d(i8) != ((M1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j4 = 4;
        long j5 = (fVar.f827b / j4) + j + 2 + (i15 * 2);
        fVar.O(i15);
        fVar.O(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d2 = ((M1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d2 != ((M1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.O(d2 & 255);
            }
        }
        M1.f fVar4 = new M1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d3 = ((M1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d3 != ((M1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((M1.i) arrayList.get(i18)).a()) {
                fVar.O(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.O(((int) ((fVar4.f827b / j4) + j5)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                g(j5, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.L(fVar4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g0(p pVar, AbstractC0351a abstractC0351a, AbstractC0351a abstractC0351a2) {
        try {
            w1.a.i(C(((AbstractC0104a) pVar).create(abstractC0351a, abstractC0351a2)), W0.i.f1345a, null);
        } catch (Throwable th) {
            abstractC0351a2.resumeWith(d.r(th));
            throw th;
        }
    }

    public static final void h(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static ActionMode.Callback h0(ActionMode.Callback callback) {
        return callback instanceof q ? ((q) callback).f1140a : callback;
    }

    public static ActionMode.Callback i0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static final void j(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0058a.a(th, th2);
            }
        }
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int l(S s2, V.g gVar, View view, View view2, AbstractC0141G abstractC0141G, boolean z2) {
        if (abstractC0141G.v() == 0 || s2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0141G.H(view) - AbstractC0141G.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int m(S s2, V.g gVar, View view, View view2, AbstractC0141G abstractC0141G, boolean z2, boolean z3) {
        if (abstractC0141G.v() == 0 || s2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (s2.b() - Math.max(AbstractC0141G.H(view), AbstractC0141G.H(view2))) - 1) : Math.max(0, Math.min(AbstractC0141G.H(view), AbstractC0141G.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0141G.H(view) - AbstractC0141G.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int n(S s2, V.g gVar, View view, View view2, AbstractC0141G abstractC0141G, boolean z2) {
        if (abstractC0141G.v() == 0 || s2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return s2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(AbstractC0141G.H(view) - AbstractC0141G.H(view2)) + 1)) * s2.b());
    }

    public static ImageView.ScaleType o(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean p(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean q2 = q(file, inputStream);
                k(inputStream);
                return q2;
            } catch (Throwable th) {
                th = th;
                k(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean q(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t r(Context context) {
        ProviderInfo providerInfo;
        J.d dVar;
        ApplicationInfo applicationInfo;
        N0.e cVar = Build.VERSION.SDK_INT >= 28 ? new V.c(8) : new N0.e(8);
        PackageManager packageManager = context.getPackageManager();
        d.l(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] j = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new J.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (dVar != null) {
                return null;
            }
            return new t(new s(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
    }

    public static d s(int i) {
        if (i != 0 && i == 1) {
            return new N0.d();
        }
        return new N0.i();
    }

    public static int t(Context context, int i, int i2) {
        Integer num;
        TypedValue V2 = AbstractC0058a.V(context, i);
        if (V2 != null) {
            int i3 = V2.resourceId;
            num = Integer.valueOf(i3 != 0 ? C.b.a(context, i3) : V2.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int u(View view, int i) {
        Context context = view.getContext();
        TypedValue X2 = AbstractC0058a.X(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = X2.resourceId;
        return i2 != 0 ? C.b.a(context, i2) : X2.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f183c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList v(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        D.l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        D.m mVar = new D.m(resources, theme);
        synchronized (D.q.f194c) {
            try {
                SparseArray sparseArray = (SparseArray) D.q.f193b.get(mVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (lVar = (D.l) sparseArray.get(i)) != null) {
                    if (lVar.f182b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (lVar.f183c != 0) {
                            }
                            colorStateList2 = lVar.f181a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = D.q.f192a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = D.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return D.k.b(resources, i, theme);
        }
        synchronized (D.q.f194c) {
            try {
                WeakHashMap weakHashMap = D.q.f193b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mVar, sparseArray2);
                }
                sparseArray2.append(i, new D.l(colorStateList, mVar.f184a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static final int w(Cursor cursor, String str) {
        String str2;
        j1.h.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            j1.h.d(columnNames, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i = 0;
            for (String str3 : columnNames) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ", ");
                }
                c(sb, str3, null);
            }
            sb.append((CharSequence) "");
            str2 = sb.toString();
            j1.h.d(str2, "toString(...)");
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public static float y(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File z(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public float B(View view) {
        if (f566c) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                f566c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean E();

    public abstract void L(int i);

    public abstract void M(Typeface typeface, boolean z2);

    public abstract void V(boolean z2);

    public abstract void X(boolean z2);

    public void e0(View view, float f2) {
        if (f566c) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f566c = false;
            }
        }
        view.setAlpha(f2);
    }

    public void f0(View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f567d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            e = true;
        }
        Field field = f567d;
        if (field != null) {
            try {
                f567d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract List i(List list, String str);

    public abstract TransformationMethod j0(TransformationMethod transformationMethod);

    public abstract InputFilter[] x(InputFilter[] inputFilterArr);
}
