package H1;

import G1.AbstractC0001b;
import K.InterfaceC0014j;
import K.P;
import K.Q;
import K.b0;
import M1.u;
import Q.o;
import Q.q;
import a.y;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
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
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fortunequest.neontrack.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e1.AbstractC0109a;
import f1.AbstractC0111a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import l.C0223a0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f510a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f511b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f512c = false;
    public static Field d;

    public d() {
        new ConcurrentHashMap();
    }

    public static I.e I(C0223a0 c0223a0) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new I.e(o.c(c0223a0));
        }
        TextPaint textPaint = new TextPaint(c0223a0.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = Q.m.a(c0223a0);
        int d2 = Q.m.d(c0223a0);
        if (c0223a0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (c0223a0.getInputType() & 15) != 3) {
                boolean z2 = c0223a0.getLayoutDirection() == 1;
                switch (c0223a0.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(o.b(Q.n.a(c0223a0.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new I.e(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static final boolean M(AssertionError assertionError) {
        Logger logger = M1.m.f811a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? r1.d.E(message, "getsockname failed") : false;
    }

    public static boolean P() {
        return e.d;
    }

    public static List R(Object obj) {
        List singletonList = Collections.singletonList(obj);
        k1.e.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final void a(C1.a aVar, C1.c cVar, String str) {
        C1.d.i.fine(cVar.f114b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f108a);
    }

    public static final boolean a0(String str) {
        k1.e.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void b(Throwable th, Throwable th2) {
        k1.e.e(th, "<this>");
        k1.e.e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0111a.f2538a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC0109a.f2513a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static V.b b0(MappedByteBuffer mappedByteBuffer) {
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
                    V.b bVar = new V.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f568a = position;
                    int i6 = position - duplicate.getInt(position);
                    bVar.f569b = i6;
                    bVar.f570c = ((ByteBuffer) bVar.d).getShort(i6);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static void c0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static final boolean d(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        k1.e.e(bArr, "a");
        k1.e.e(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static TypedValue d0(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static Z0.i e(Z0.i iVar) {
        Z0.f fVar = iVar.f1554a;
        fVar.b();
        return fVar.i > 0 ? iVar : Z0.i.f1553b;
    }

    public static boolean e0(Context context, int i, boolean z2) {
        TypedValue d02 = d0(context, i);
        return (d02 == null || d02.type != 18) ? z2 : d02.data != 0;
    }

    public static TypedValue f0(Context context, int i, String str) {
        TypedValue d02 = d0(context, i);
        if (d02 != null) {
            return d02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final void g0(View view, y yVar) {
        k1.e.e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, yVar);
    }

    public static void h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void j0(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            b0.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final void k(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void k0(TextView textView, int i) {
        i(i);
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

    public static void l(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(AbstractC0001b.d(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static void l0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = Q.f578a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    public static int m(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void m0(TextView textView, int i) {
        i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void n0(TextView textView, int i) {
        i(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void o0(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static ImageView.ScaleType q(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final M1.c r0(Socket socket) {
        Logger logger = M1.m.f811a;
        u uVar = new u(socket);
        OutputStream outputStream = socket.getOutputStream();
        k1.e.d(outputStream, "getOutputStream(...)");
        return new M1.c(uVar, new M1.c(outputStream, uVar));
    }

    public static final M1.d s0(Socket socket) {
        Logger logger = M1.m.f811a;
        u uVar = new u(socket);
        InputStream inputStream = socket.getInputStream();
        k1.e.d(inputStream, "getInputStream(...)");
        return new M1.d(uVar, 0, new M1.d(inputStream, 1, uVar));
    }

    public static int t0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
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
    public static final InetAddress u(String str, int i, int i2) {
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
                if (i11 <= i2 && r1.l.B(str, "::", i7, z2)) {
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
                    if (!r1.l.B(str, ":", i7, z2)) {
                        if (r1.l.B(str, ".", i7, z2)) {
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
                                        if (k1.e.f(charAt, 48) < 0 || k1.e.f(charAt, 57) > 0) {
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

    public static final String u0(String str) {
        k1.e.e(str, "<this>");
        int i = 0;
        int i2 = -1;
        if (!r1.d.E(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                k1.e.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                k1.e.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                k1.e.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = lowerCase.charAt(i3);
                    if (k1.e.f(charAt, 31) <= 0 || k1.e.f(charAt, 127) >= 0 || r1.d.I(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress u2 = (r1.l.C(str, "[", false) && r1.l.x(str, "]")) ? u(str, 1, str.length() - 1) : u(str, 0, str.length());
        if (u2 == null) {
            return null;
        }
        byte[] address = u2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return u2.getHostAddress();
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
                fVar.A(58);
                i += i5;
                if (i == 16) {
                    fVar.A(58);
                }
            } else {
                if (i > 0) {
                    fVar.A(58);
                }
                byte b2 = address[i];
                byte[] bArr = A1.c.f13a;
                fVar.B(((b2 & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return fVar.t(fVar.f799b, r1.a.f3833a);
    }

    public static boolean v(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = Q.f578a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = P.d;
        P p2 = (P) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (p2 == null) {
            p2 = new P();
            p2.f575a = null;
            p2.f576b = null;
            p2.f577c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, p2);
        }
        WeakReference weakReference2 = p2.f577c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        p2.f577c = new WeakReference(keyEvent);
        if (p2.f576b == null) {
            p2.f576b = new SparseArray();
        }
        SparseArray sparseArray = p2.f576b;
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
    public static boolean w(InterfaceC0014j interfaceC0014j, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z2 = false;
        if (interfaceC0014j == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0014j.d(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f510a) {
                        try {
                            f511b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f510a = true;
                    }
                    Method method = f511b;
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
            return (view != null && Q.b(view, keyEvent)) || interfaceC0014j.d(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f512c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f512c = true;
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

    public static ActionMode.Callback x0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof q) || callback == null) ? callback : new q(callback, textView);
    }

    public static final String y(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f45c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList z(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        B.l lVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        B.m mVar = new B.m(resources, theme);
        synchronized (B.q.f56c) {
            try {
                SparseArray sparseArray = (SparseArray) B.q.f55b.get(mVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (lVar = (B.l) sparseArray.get(i)) != null) {
                    if (lVar.f44b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (lVar.f45c != 0) {
                            }
                            colorStateList2 = lVar.f43a;
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
        ThreadLocal threadLocal = B.q.f54a;
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
            return B.k.b(resources, i, theme);
        }
        synchronized (B.q.f56c) {
            try {
                WeakHashMap weakHashMap = B.q.f55b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(mVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(mVar, sparseArray2);
                }
                sparseArray2.append(i, new B.l(colorStateList, mVar.f46a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public abstract void A(R0.u uVar, float f2, float f3);

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract int E();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public int J(View view) {
        return 0;
    }

    public int K() {
        return 0;
    }

    public abstract void L();

    public abstract boolean N(float f2);

    public abstract boolean O(View view);

    public abstract boolean Q(float f2, float f3);

    public abstract void S(Throwable th);

    public abstract void T(int i);

    public abstract void U(Typeface typeface, boolean z2);

    public abstract void V(T0.m mVar);

    public void W(View view, int i) {
    }

    public abstract void X(int i);

    public abstract void Y(View view, int i, int i2);

    public abstract void Z(View view, float f2, float f3);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i);

    public abstract void h0(boolean z2);

    public abstract void i0(boolean z2);

    public abstract int n(View view, int i);

    public abstract int o(View view, int i);

    public abstract List p(List list, String str);

    public abstract void p0();

    public abstract boolean q0(View view, float f2);

    public abstract Typeface r(Context context, B.g gVar, Resources resources, int i);

    public abstract Typeface s(Context context, H.j[] jVarArr, int i);

    public Typeface t(Context context, Resources resources, int i, String str, int i2) {
        File J2 = l.J(context);
        if (J2 == null) {
            return null;
        }
        try {
            if (l.s(J2, resources, i)) {
                return Typeface.createFromFile(J2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            J2.delete();
        }
    }

    public abstract boolean v0(View view, int i);

    public abstract void w0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public H.j x(int i, H.j[] jVarArr) {
        new R0.e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        H.j jVar = null;
        int i3 = Integer.MAX_VALUE;
        for (H.j jVar2 : jVarArr) {
            int abs = (Math.abs(jVar2.f499c - i2) * 2) + (jVar2.d == z2 ? 0 : 1);
            if (jVar == null || i3 > abs) {
                jVar = jVar2;
                i3 = abs;
            }
        }
        return jVar;
    }
}
