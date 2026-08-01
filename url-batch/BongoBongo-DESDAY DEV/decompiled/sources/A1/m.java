package A1;

import L.H;
import L.T;
import L.d0;
import R.p;
import R.r;
import Z.V;
import a.y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.winfour.winrandom.R;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import m.C0208d0;

/* loaded from: classes.dex */
public abstract class m implements d0, R.j {
    public m() {
        new ConcurrentHashMap();
    }

    public static J.d E(C0208d0 c0208d0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new J.d(p.c(c0208d0));
        }
        TextPaint textPaint = new TextPaint(c0208d0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = R.n.a(c0208d0);
        int d = R.n.d(c0208d0);
        if (c0208d0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0208d0.getInputType() & 15) != 3) {
                boolean z2 = c0208d0.getLayoutDirection() == 1;
                switch (c0208d0.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(p.b(R.o.a(c0208d0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new J.d(textPaint, textDirectionHeuristic, a2, d);
    }

    public static int H(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(V.e("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean I(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean K(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static W.b W(MappedByteBuffer mappedByteBuffer) {
        long j2;
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
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    W.b bVar = new W.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f480a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f481b = i6;
                    bVar.f482c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue X(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean Y(Context context, int i, boolean z2) {
        TypedValue X2 = X(context, i);
        return (X2 == null || X2.type != 18) ? z2 : X2.data != 0;
    }

    public static int Z(Context context, int i, int i2) {
        TypedValue X2 = X(context, i);
        return (X2 == null || X2.type != 16) ? i2 : X2.data;
    }

    public static TimeInterpolator a0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!K(valueOf, "cubic-bezier") && !K(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (K(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return N.a.b(y(split, 0), y(split, 1), y(split, 2), y(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!K(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            D.f.b(d.w(substring), path);
            return N.a.c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    public static TypedValue b0(Context context, int i, String str) {
        TypedValue X2 = X(context, i);
        if (X2 != null) {
            return X2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final void c0(View view, y yVar) {
        h1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static F1.e d() {
        F1.e eVar = F1.e.f242l;
        h1.d.b(eVar);
        F1.e eVar2 = eVar.f244f;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            F1.e.i.await(F1.e.f240j, TimeUnit.MILLISECONDS);
            F1.e eVar3 = F1.e.f242l;
            h1.d.b(eVar3);
            if (eVar3.f244f != null || System.nanoTime() - nanoTime < F1.e.f241k) {
                return null;
            }
            return F1.e.f242l;
        }
        long nanoTime2 = eVar2.f245g - System.nanoTime();
        if (nanoTime2 > 0) {
            F1.e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        F1.e eVar4 = F1.e.f242l;
        h1.d.b(eVar4);
        eVar4.f244f = eVar2.f244f;
        eVar2.f244f = null;
        return eVar2;
    }

    public static void d0(TextView textView, int i) {
        i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(long j2, F1.f fVar, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        int i6;
        int i7;
        F1.f fVar2;
        int i8 = i;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i9 = i2; i9 < i3; i9++) {
            if (((F1.i) arrayList.get(i9)).a() < i8) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        F1.i iVar = (F1.i) arrayList.get(i2);
        F1.i iVar2 = (F1.i) arrayList.get(i3 - 1);
        int i10 = -1;
        if (i8 == iVar.a()) {
            int intValue = ((Number) arrayList2.get(i2)).intValue();
            int i11 = i2 + 1;
            F1.i iVar3 = (F1.i) arrayList.get(i11);
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
            long j3 = 4;
            long j4 = (fVar.f247b / j3) + j2 + 2 + i12 + 1;
            fVar.w(-i12);
            fVar.w(i5);
            int i14 = i12 + i8;
            while (i8 < i14) {
                fVar.w(iVar.d(i8) & 255);
                i8++;
            }
            if (i4 + 1 == i3) {
                if (i14 != ((F1.i) arrayList.get(i4)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.w(((Number) arrayList2.get(i4)).intValue());
                return;
            } else {
                F1.f fVar3 = new F1.f();
                fVar.w(((int) ((fVar3.f247b / j3) + j4)) * (-1));
                e(j4, fVar3, i14, arrayList, i4, i3, arrayList2);
                fVar.t(fVar3);
                return;
            }
        }
        int i15 = 1;
        for (int i16 = i4 + 1; i16 < i3; i16++) {
            if (((F1.i) arrayList.get(i16 - 1)).d(i8) != ((F1.i) arrayList.get(i16)).d(i8)) {
                i15++;
            }
        }
        long j5 = 4;
        long j6 = (fVar.f247b / j5) + j2 + 2 + (i15 * 2);
        fVar.w(i15);
        fVar.w(i5);
        for (int i17 = i4; i17 < i3; i17++) {
            int d = ((F1.i) arrayList.get(i17)).d(i8);
            if (i17 == i4 || d != ((F1.i) arrayList.get(i17 - 1)).d(i8)) {
                fVar.w(d & 255);
            }
        }
        F1.f fVar4 = new F1.f();
        int i18 = i4;
        while (i18 < i3) {
            byte d2 = ((F1.i) arrayList.get(i18)).d(i8);
            int i19 = i18 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i6 = i3;
                    break;
                } else {
                    if (d2 != ((F1.i) arrayList.get(i20)).d(i8)) {
                        i6 = i20;
                        break;
                    }
                    i20++;
                }
            }
            if (i19 == i6 && i8 + 1 == ((F1.i) arrayList.get(i18)).a()) {
                fVar.w(((Number) arrayList2.get(i18)).intValue());
                i7 = i6;
                fVar2 = fVar4;
            } else {
                fVar.w(((int) ((fVar4.f247b / j5) + j6)) * i10);
                i7 = i6;
                fVar2 = fVar4;
                e(j6, fVar4, i8 + 1, arrayList, i18, i6, arrayList2);
            }
            fVar4 = fVar2;
            i18 = i7;
            i10 = -1;
        }
        fVar.t(fVar4);
    }

    public static void e0(TextView textView, int i) {
        i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void f0(TextView textView, int i) {
        i(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void g0(View view, K0.g gVar) {
        D0.a aVar = gVar.f397a.f383b;
        if (aVar == null || !aVar.f136a) {
            return;
        }
        float f2 = RecyclerView.A0;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = T.f490a;
            f2 += H.i((View) parent);
        }
        K0.f fVar = gVar.f397a;
        if (fVar.f391l != f2) {
            fVar.f391l = f2;
            gVar.m();
        }
    }

    public static void h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void i0(Drawable drawable, int i) {
        E.a.g(drawable, i);
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void k0(Object obj) {
        if (obj instanceof V0.c) {
            throw ((V0.c) obj).f941a;
        }
    }

    public static int l0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static d m(int i) {
        if (i != 0 && i == 1) {
            return new K0.d();
        }
        return new K0.i();
    }

    public static ActionMode.Callback n0(ActionMode.Callback callback) {
        return callback instanceof r ? ((r) callback).f789a : callback;
    }

    public static ActionMode.Callback p0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof r) || callback == null) ? callback : new r(callback, textView);
    }

    public static List r(T0.b bVar) {
        ArrayList arrayList;
        T0.b a2 = bVar.a();
        int i = a2.f834b;
        int i2 = a2.f833a;
        int i3 = (i - i2) + 1;
        int i4 = a2.f835c;
        boolean z2 = a2.d;
        if (z2 && i4 > i3) {
            throw new IllegalArgumentException("Count exceeds unique range size");
        }
        if (!z2) {
            ArrayList arrayList2 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                j1.e.f2670a.getClass();
                arrayList2.add(Integer.valueOf(j1.e.f2671b.c(i2, i + 1)));
            }
            return arrayList2;
        }
        Iterable cVar = new l1.c(i2, i, 1);
        h1.d.e(j1.e.f2670a, "random");
        if (!(cVar instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator it = cVar.iterator();
            while (true) {
                l1.b bVar2 = (l1.b) it;
                if (!bVar2.hasNext()) {
                    break;
                }
                arrayList.add(bVar2.next());
            }
        } else {
            arrayList = new ArrayList((Collection) cVar);
        }
        for (int m02 = W0.h.m0(arrayList); m02 > 0; m02--) {
            int e2 = j1.e.f2671b.e(m02 + 1);
            arrayList.set(e2, arrayList.set(m02, arrayList.get(e2)));
        }
        return W0.g.t0(arrayList, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f90c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList s(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C.n nVar = new C.n(resources, theme);
        synchronized (C.r.f101c) {
            try {
                SparseArray sparseArray = (SparseArray) C.r.f100b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (C.m) sparseArray.get(i)) != null) {
                    if (mVar.f89b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f90c != 0) {
                            }
                            colorStateList2 = mVar.f88a;
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
        ThreadLocal threadLocal = C.r.f99a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = C.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return C.l.b(resources, i, theme);
        }
        synchronized (C.r.f101c) {
            try {
                WeakHashMap weakHashMap = C.r.f100b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new C.m(colorStateList, nVar.f91a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList t(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !k.r(drawable)) {
            return null;
        }
        colorStateList = k.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static final Class w(h1.b bVar) {
        Class a2 = bVar.a();
        h1.d.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class x(m1.a aVar) {
        h1.d.e(aVar, "<this>");
        Class a2 = ((h1.a) aVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static float y(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.A0 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public abstract int A();

    public abstract int B(View view);

    public abstract int C(CoordinatorLayout coordinatorLayout);

    public abstract int D();

    public int F(View view) {
        return 0;
    }

    public int G() {
        return 0;
    }

    public abstract boolean J(float f2);

    public abstract boolean L(View view);

    public abstract boolean M(float f2, float f3);

    public abstract void N(Throwable th);

    public abstract void O(int i);

    public abstract void P(Typeface typeface, boolean z2);

    public abstract void Q(S0.g gVar);

    public void R(View view, int i) {
    }

    public abstract void S(int i);

    public abstract void T(View view, int i, int i2);

    public abstract void U(View view, float f2, float f3);

    public abstract Object V(Intent intent, int i);

    @Override // L.d0
    public void b() {
    }

    @Override // L.d0
    public void c() {
    }

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i);

    public abstract boolean j0(View view, float f2);

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);

    public abstract boolean m0(View view, int i);

    public abstract Typeface n(Context context, C.g gVar, Resources resources, int i);

    public abstract Typeface o(Context context, I.j[] jVarArr, int i);

    public abstract void o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public Typeface p(Context context, Resources resources, int i, String str, int i2) {
        File K2 = d.K(context);
        if (K2 == null) {
            return null;
        }
        try {
            if (d.t(K2, resources, i)) {
                return Typeface.createFromFile(K2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            K2.delete();
        }
    }

    public I.j q(int i, I.j[] jVarArr) {
        new K0.e(2);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        I.j jVar = null;
        int i3 = Integer.MAX_VALUE;
        for (I.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f339c - i2) * 2) + (jVar2.d == z2 ? 0 : 1);
            if (jVar == null || i3 > abs) {
                jVar = jVar2;
                i3 = abs;
            }
        }
        return jVar;
    }

    public abstract int u();

    public abstract int v();

    public abstract int z();
}
