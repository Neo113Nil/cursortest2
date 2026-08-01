package u1;

import B.r;
import K.C0011l;
import K.G;
import K.S;
import K.a0;
import Q.o;
import Q.q;
import T.s;
import X.V;
import a.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.InputFilter;
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
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.TextView;
import com.glasspulse.glasspulse.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import f0.I;
import f0.U;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import l.C0202b0;
import l.L0;

/* loaded from: classes.dex */
public abstract class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f3949a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3950b;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f57c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList A(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.m mVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.n nVar = new B.n(resources, theme);
        synchronized (r.f68c) {
            try {
                SparseArray sparseArray = (SparseArray) r.f67b.get(nVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (mVar = (B.m) sparseArray.get(i)) != null) {
                    if (mVar.f56b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (mVar.f57c != 0) {
                            }
                            colorStateList2 = mVar.f55a;
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
        ThreadLocal threadLocal = r.f66a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateList = B.c.a(resources, resources.getXml(i), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList == null) {
            return B.l.b(resources, i, theme);
        }
        synchronized (r.f68c) {
            try {
                WeakHashMap weakHashMap = r.f67b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(nVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(nVar, sparseArray2);
                }
                sparseArray2.append(i, new B.m(colorStateList, nVar.f58a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList B(Context context, C0011l c0011l, int i) {
        int resourceId;
        ColorStateList A2;
        TypedArray typedArray = (TypedArray) c0011l.f405c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = A(context, resourceId)) == null) ? c0011l.g(i) : A2;
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A2 = A(context, resourceId)) == null) ? typedArray.getColorStateList(i) : A2;
    }

    public static Drawable D(Context context, int i) {
        return L0.b().c(context, i);
    }

    public static Drawable E(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable D2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = D(context, resourceId)) == null) ? typedArray.getDrawable(i) : D2;
    }

    public static Set F() {
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

    public static File H(Context context) {
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

    public static I.e I(C0202b0 c0202b0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new I.e(o.c(c0202b0));
        }
        TextPaint textPaint = new TextPaint(c0202b0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = Q.m.a(c0202b0);
        int d = Q.m.d(c0202b0);
        if (c0202b0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0202b0.getInputType() & 15) != 3) {
                boolean z2 = c0202b0.getLayoutDirection() == 1;
                switch (c0202b0.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(o.b(Q.n.a(c0202b0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new I.e(textPaint, textDirectionHeuristic, a2, d);
    }

    public static int L(int i) {
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
        throw new IllegalArgumentException(V.d("type needs to be >= FIRST and <= LAST, type=", i));
    }

    public static boolean M() {
        boolean isEnabled;
        try {
            if (f3950b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f3950b == null) {
                f3949a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3950b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3950b.invoke(null, Long.valueOf(f3949a))).booleanValue();
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

    public static boolean N(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean O() {
        return e.d;
    }

    public static List P(Object obj) {
        List singletonList = Collections.singletonList(obj);
        b1.d.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static Typeface Q(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, j(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static MappedByteBuffer R(Context context, Uri uri) {
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

    public static void W(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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
        D.a.h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void X(View view, y yVar) {
        b1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void a0(TextView textView, int i) {
        f(i);
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

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f351a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static void c0(TextView textView, int i) {
        f(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                D.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                D.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                D.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void d0(TextView textView, int i) {
        f(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void e(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e0(View view, M0.g gVar) {
        F0.a aVar = gVar.f495a.f482b;
        if (aVar == null || !aVar.f167a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = S.f351a;
            f2 += G.i((View) parent);
        }
        M0.f fVar = gVar.f495a;
        if (fVar.f489l != f2) {
            fVar.f489l = f2;
            gVar.m();
        }
    }

    public static void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g0(Drawable drawable, int i) {
        D.a.g(drawable, i);
    }

    public static void h(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new f1.c(2, 36, 1));
        }
    }

    public static int h0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void i(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
    }

    public static int j(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static ActionMode.Callback j0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static final void m(z1.h hVar, Throwable th) {
        if (hVar != null) {
            if (th == null) {
                hVar.close();
                return;
            }
            try {
                hVar.close();
            } catch (Throwable th2) {
                l.e(th, th2);
            }
        }
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(I.H(view) - I.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int p(U u2, T.g gVar, View view, View view2, I i, boolean z2, boolean z3) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (u2.b() - Math.max(I.H(view), I.H(view2))) - 1) : Math.max(0, Math.min(I.H(view), I.H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int q(U u2, T.g gVar, View view, View view2, I i, boolean z2) {
        if (i.v() == 0 || u2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return u2.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(I.H(view) - I.H(view2)) + 1)) * u2.b());
    }

    public static ImageView.ScaleType r(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static float[] s(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static boolean t(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean u2 = u(file, inputStream);
                n(inputStream);
                return u2;
            } catch (Throwable th) {
                th = th;
                n(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean u(File file, InputStream inputStream) {
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
                    n(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            n(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            n(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s v(Context context) {
        ProviderInfo providerInfo;
        H.e eVar;
        ApplicationInfo applicationInfo;
        M0.e cVar = Build.VERSION.SDK_INT >= 28 ? new T.c(5) : new M0.e(5);
        PackageManager packageManager = context.getPackageManager();
        g(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] j2 = cVar.j(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : j2) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new H.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (eVar != null) {
                return null;
            }
            return new s(new T.r(context, eVar));
        }
        eVar = null;
        if (eVar != null) {
        }
    }

    public static l w(int i) {
        if (i != 0 && i == 1) {
            return new M0.d();
        }
        return new M0.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C.g[] x(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = s(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e2);
                            }
                        }
                        arrayList.add(new C.g(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C.g(str.charAt(i3), new float[0]));
        }
        return (C.g[]) arrayList.toArray(new C.g[i]);
    }

    public static C.g[] y(C.g[] gVarArr) {
        C.g[] gVarArr2 = new C.g[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            gVarArr2[i] = new C.g(gVarArr[i]);
        }
        return gVarArr2;
    }

    public static final boolean z(char c2, char c3, boolean z2) {
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

    public abstract InputFilter[] G(InputFilter[] inputFilterArr);

    public int J(View view) {
        return 0;
    }

    public int K() {
        return 0;
    }

    public void S(View view, int i) {
    }

    public abstract void T(int i);

    public abstract void U(View view, int i, int i2);

    public abstract void V(View view, float f2, float f3);

    public abstract void Y(boolean z2);

    public abstract void Z(boolean z2);

    @Override // K.a0
    public void b() {
    }

    @Override // K.a0
    public void c() {
    }

    public abstract boolean i0(View view, int i);

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);
}
