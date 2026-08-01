package z1;

import E1.u;
import M.InterfaceC0010k;
import M.P;
import M.Q;
import M.a0;
import X0.s;
import a.y;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.InputFilter;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.winfour.neondrop.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class d implements S.j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4350a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f4351b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4352c = false;
    public static Field d;

    public d() {
        new ConcurrentHashMap();
    }

    public static final Class A(g1.b bVar) {
        Class a2 = bVar.a();
        g1.d.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class B(l1.a aVar) {
        g1.d.e(aVar, "<this>");
        Class a2 = ((g1.a) aVar).a();
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

    public static final boolean D(AssertionError assertionError) {
        Logger logger = E1.m.f214a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? n1.d.D(message, "getsockname failed") : false;
    }

    public static boolean E(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean F(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = E.a.f160a;
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

    public static boolean G(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean H() {
        return e.d;
    }

    public static int I(int i, int i2, float f2) {
        return E.a.b(E.a.d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static int J(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static Typeface K(Configuration configuration, Typeface typeface) {
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
        create = Typeface.create(typeface, g(i3 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static int L(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static float O(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.e.c(edgeEffect, f2, f3);
        }
        S.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static W.b Q(MappedByteBuffer mappedByteBuffer) {
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
                    bVar.f503a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f504b = i6;
                    bVar.f505c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
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

    public static int S(U0.g[][] gVarArr, U0.g gVar) {
        int i;
        U0.g gVar2 = U0.g.f875c;
        if (gVar == gVar2) {
            gVar2 = U0.g.f874b;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = 0;
            while (i4 < 4) {
                U0.g[] gVarArr2 = gVarArr[i3];
                int i5 = i4 + 1;
                i2 += T(X0.k.y0(gVarArr2[i4], gVarArr2[i5], gVarArr2[i4 + 2], gVarArr2[i4 + 3]), gVar, gVar2);
                i4 = i5;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= 7) {
                break;
            }
            int i7 = 0;
            while (i7 < 3) {
                int i8 = i7 + 1;
                i2 += T(X0.k.y0(gVarArr[i7][i6], gVarArr[i8][i6], gVarArr[i7 + 2][i6], gVarArr[i7 + 3][i6]), gVar, gVar2);
                i7 = i8;
            }
            i6++;
        }
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = 0;
            while (i10 < 4) {
                int i11 = i10 + 1;
                i2 += T(X0.k.y0(gVarArr[i9][i10], gVarArr[i9 + 1][i11], gVarArr[i9 + 2][i10 + 2], gVarArr[i9 + 3][i10 + 3]), gVar, gVar2);
                i10 = i11;
            }
        }
        for (i = 3; i < 6; i++) {
            int i12 = 0;
            while (i12 < 4) {
                int i13 = i12 + 1;
                i2 += T(X0.k.y0(gVarArr[i][i12], gVarArr[i - 1][i13], gVarArr[i - 2][i12 + 2], gVarArr[i - 3][i12 + 3]), gVar, gVar2);
                i12 = i13;
            }
        }
        return i2;
    }

    public static int T(List list, U0.g gVar, U0.g gVar2) {
        int i;
        int i2;
        int i3;
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((U0.g) it.next()) == gVar && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = list.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((U0.g) it2.next()) == U0.g.f873a && (i2 = i2 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (list.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it3 = list.iterator();
            i3 = 0;
            while (it3.hasNext()) {
                if (((U0.g) it3.next()) == gVar2 && (i3 = i3 + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        if (i <= 0 || i3 <= 0) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 1000 : i2 == 1 ? 50 : 0 : i2 == 2 ? 8 : 0 : i2 == 3 ? 2 : 0;
        }
        return 0;
    }

    public static final void U(View view, y yVar) {
        g1.d.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void Y(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            a0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static void a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = Q.f513a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static final boolean b(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        g1.d.e(bArr, "a");
        g1.d.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = J(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean d2 = d(i, rect, rect2);
        if (d(i, rect, rect3) || !d2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static void c0(Drawable drawable, int i) {
        F.a.g(drawable, i);
    }

    public static boolean d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final E1.c d0(Socket socket) {
        Logger logger = E1.m.f214a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        g1.d.d(outputStream, "getOutputStream(...)");
        return new E1.c(uVar, new E1.c(outputStream, uVar));
    }

    public static final void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final E1.d e0(Socket socket) {
        Logger logger = E1.m.f214a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        g1.d.d(inputStream, "getInputStream(...)");
        return new E1.d(uVar, 0, new E1.d(inputStream, 1, uVar));
    }

    public static int f(Context context, String str) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = B.f.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                c2 = B.f.c((AppOpsManager) B.f.a(context, AppOpsManager.class), d2, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c3 = B.g.c(context);
                c2 = B.g.a(c3, d2, Binder.getCallingUid(), packageName);
                if (c2 == 0) {
                    c2 = B.g.a(c3, d2, myUid, B.g.b(context));
                }
            } else {
                c2 = B.f.c((AppOpsManager) B.f.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static int f0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int g(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static ImageView.ScaleType i(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void j(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    public static boolean n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = Q.f513a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = P.d;
        P p2 = (P) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (p2 == null) {
            p2 = new P();
            p2.f510a = null;
            p2.f511b = null;
            p2.f512c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, p2);
        }
        WeakReference weakReference2 = p2.f512c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        p2.f512c = new WeakReference(keyEvent);
        if (p2.f511b == null) {
            p2.f511b = new SparseArray();
        }
        SparseArray sparseArray = p2.f511b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(InterfaceC0010k interfaceC0010k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0010k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0010k.g(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f4350a) {
                        try {
                            f4351b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f4350a = true;
                    }
                    Method method = f4351b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z2 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (Q.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && Q.b(view, keyEvent)) || interfaceC0010k.g(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f4352c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f4352c = true;
        }
        Field field = d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (Q.b(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static Integer p(U0.g[][] gVarArr, int i, U0.g gVar) {
        if (i >= 0 && i < 7) {
            for (int i2 = 5; -1 < i2; i2--) {
                U0.g[] gVarArr2 = gVarArr[i2];
                if (gVarArr2[i] == U0.g.f873a) {
                    gVarArr2[i] = gVar;
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    public static List r(U0.g[][] gVarArr, int i, int i2, U0.g gVar) {
        for (W0.c cVar : X0.k.y0(new W0.c(0, 1), new W0.c(1, 0), new W0.c(1, 1), new W0.c(1, -1))) {
            int intValue = ((Number) cVar.f950a).intValue();
            int intValue2 = ((Number) cVar.f951b).intValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new W0.c(Integer.valueOf(i), Integer.valueOf(i2)));
            int i3 = i - intValue;
            for (int i4 = i2 - intValue2; i3 >= 0 && i3 < 6 && i4 >= 0 && i4 < 7 && gVarArr[i3][i4] == gVar; i4 -= intValue2) {
                arrayList.add(new W0.c(Integer.valueOf(i3), Integer.valueOf(i4)));
                i3 -= intValue;
            }
            int i5 = i + intValue;
            for (int i6 = i2 + intValue2; i5 >= 0 && i5 < 6 && i6 >= 0 && i6 < 7 && gVarArr[i5][i6] == gVar; i6 += intValue2) {
                arrayList.add(new W0.c(Integer.valueOf(i5), Integer.valueOf(i6)));
                i5 += intValue;
            }
            if (arrayList.size() >= 4) {
                return X0.j.F0(arrayList, 4);
            }
        }
        return s.f992a;
    }

    public static int s(Context context, int i, int i2) {
        Integer num;
        TypedValue k02 = l.k0(context, i);
        if (k02 != null) {
            int i3 = k02.resourceId;
            num = Integer.valueOf(i3 != 0 ? C.b.a(context, i3) : k02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int t(View view, int i) {
        Context context = view.getContext();
        TypedValue o02 = l.o0(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = o02.resourceId;
        return i2 != 0 ? C.b.a(context, i2) : o02.data;
    }

    public static ColorStateList u(Context context, A1.j jVar, int i) {
        int resourceId;
        ColorStateList D2;
        TypedArray typedArray = (TypedArray) jVar.f81c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = l.D(context, resourceId)) == null) ? jVar.i(i) : D2;
    }

    public static ColorStateList v(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList D2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D2 = l.D(context, resourceId)) == null) ? typedArray.getColorStateList(i) : D2;
    }

    public static float x(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return S.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Drawable y(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable F2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (F2 = l.F(context, resourceId)) == null) ? typedArray.getDrawable(i) : F2;
    }

    public abstract void C();

    public abstract void M(Throwable th);

    public abstract void N(T0.g gVar);

    public abstract Object P(Intent intent, int i);

    public abstract void V(boolean z2);

    public abstract void W(boolean z2);

    public abstract void X(boolean z2);

    public abstract void Z(boolean z2);

    public abstract void b0();

    public abstract List h(List list, String str);

    public abstract Typeface k(Context context, D.g gVar, Resources resources, int i);

    public abstract Typeface l(Context context, J.j[] jVarArr, int i);

    public Typeface m(Context context, Resources resources, int i, String str, int i2) {
        File Q2 = l.Q(context);
        if (Q2 == null) {
            return null;
        }
        try {
            if (l.x(Q2, resources, i)) {
                return Typeface.createFromFile(Q2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            Q2.delete();
        }
    }

    public J.j q(int i, J.j[] jVarArr) {
        new L0.e(2);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        J.j jVar = null;
        int i3 = Integer.MAX_VALUE;
        for (J.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f377c - i2) * 2) + (jVar2.d == z2 ? 0 : 1);
            if (jVar == null || i3 > abs) {
                jVar = jVar2;
                i3 = abs;
            }
        }
        return jVar;
    }

    public abstract void w(L0.u uVar, float f2, float f3);

    public abstract InputFilter[] z(InputFilter[] inputFilterArr);
}
