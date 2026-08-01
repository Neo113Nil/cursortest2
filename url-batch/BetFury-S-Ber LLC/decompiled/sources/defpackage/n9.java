package defpackage;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.trembin.nirefon.betfury.data.Note;
import java.lang.reflect.Method;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class n9 {
    public static final lm g;
    public static final lm h;
    public static final lm i;
    public static final lm j;
    public static final lm k;
    public static final lm n;
    public static Method p;
    public static boolean q;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final yb f = new yb(2);
    public static final sm l = new sm(false);
    public static final sm m = new sm(true);
    public static final Object o = new Object();
    public static final yb r = new yb(9);

    static {
        int i2 = 1;
        g = new lm("COMPLETING_ALREADY", i2);
        h = new lm("COMPLETING_WAITING_CHILDREN", i2);
        i = new lm("COMPLETING_RETRY", i2);
        j = new lm("TOO_LATE_TO_CANCEL", i2);
        k = new lm("SEALED", i2);
        n = new lm("NULL", i2);
    }

    public static ww B(zw zwVar, ir irVar) {
        sl slVar = sl.o;
        zwVar.getClass();
        int i2 = xw.a[zwVar.ordinal()];
        if (i2 == 1) {
            return new wg0(irVar);
        }
        if (i2 == 2) {
            kb0 kb0Var = new kb0();
            kb0Var.f = irVar;
            kb0Var.g = slVar;
            return kb0Var;
        }
        if (i2 != 3) {
            throw new md();
        }
        wk0 wk0Var = new wk0();
        wk0Var.f = irVar;
        wk0Var.g = slVar;
        return wk0Var;
    }

    public static float C(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static m2 D(Note note) {
        m2 m2Var = new m2();
        Bundle bundle = new Bundle();
        if (note != null) {
            bundle.putInt("arg_id", note.getId());
            bundle.putString("arg_title", note.getTitle());
            bundle.putString("arg_content", note.getContent());
            bundle.putString("arg_priority", note.getPriority().name());
            bundle.putBoolean("arg_pinned", note.isPinned());
            Long reminderTime = note.getReminderTime();
            if (reminderTime != null) {
                bundle.putLong("arg_reminder", reminderTime.longValue());
            }
        }
        m2Var.H(bundle);
        return m2Var;
    }

    public static TypedValue J(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean K(Resources.Theme theme, int i2, boolean z) {
        TypedValue J = J(theme, i2);
        return (J == null || J.type != 18) ? z : J.data != 0;
    }

    public static TypedValue L(Context context, int i2, String str) {
        TypedValue J = J(context.getTheme(), i2);
        if (J != null) {
            return J;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue M(View view, int i2) {
        return L(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static void P(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static int S(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final Object T(Object obj) {
        wu wuVar;
        xu xuVar = obj instanceof xu ? (xu) obj : null;
        return (xuVar == null || (wuVar = xuVar.a) == null) ? obj : wuVar;
    }

    public static Object U(xr xrVar, Object obj, dg dgVar) {
        xrVar.getClass();
        qg d2 = dgVar.d();
        Object pvVar = d2 == um.f ? new pv(dgVar) : new qv(dgVar, d2);
        gk0.b(xrVar);
        return xrVar.g(obj, pvVar);
    }

    public static float V() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void b(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static int c(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, v6.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void e(ReadableByteChannel readableByteChannel, Throwable th) {
        if (readableByteChannel != null) {
            if (th == null) {
                readableByteChannel.close();
                return;
            }
            try {
                readableByteChannel.close();
            } catch (Throwable th2) {
                bi.f(th, th2);
            }
        }
    }

    public static final void h(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dg i(xr xrVar, Object obj, dg dgVar) {
        xrVar.getClass();
        dgVar.getClass();
        if (xrVar instanceof f8) {
            return ((f8) xrVar).i(dgVar, obj);
        }
        qg d2 = dgVar.d();
        return d2 == um.f ? new nv(xrVar, obj, dgVar) : new ov(dgVar, d2, xrVar, obj);
    }

    public static final in k(Enum[] enumArr) {
        enumArr.getClass();
        return new in(enumArr);
    }

    public static l10 l(String str) {
        str.getClass();
        Matcher matcher = l10.c.matcher(str);
        if (!matcher.lookingAt()) {
            s9.j(str, "No subtype found for: \"");
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        group.toLowerCase(locale).getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        group2.toLowerCase(locale).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = l10.d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"').toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (uf0.r(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new l10(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static final long o(cb0 cb0Var) {
        if (u(cb0Var) == 0) {
            return -1L;
        }
        eb0 N = cb0Var.N("SELECT last_insert_rowid()");
        try {
            N.G();
            long j2 = N.getLong(0);
            mv.h(N, null);
            return j2;
        } finally {
        }
    }

    public static Object p(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i0.b(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (v1.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wa0 q(Display display, int i2) {
        RoundedCorner roundedCorner;
        int position;
        int i3;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i3 = 1;
            if (position != 1) {
                i3 = 2;
                if (position != 2) {
                    i3 = 3;
                    if (position != 3) {
                        s9.k(r7.b("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new wa0(i3, radius, center);
    }

    public static ArrayList s(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final int u(cb0 cb0Var) {
        eb0 N = cb0Var.N("SELECT changes()");
        try {
            N.G();
            int i2 = (int) N.getLong(0);
            mv.h(N, null);
            return i2;
        } finally {
        }
    }

    public static final void x(qg qgVar, Throwable th) {
        try {
            a3 a3Var = (a3) qgVar.w(sl.i);
            if (a3Var != null) {
                a3Var.O(th);
            } else {
                gk0.t(qgVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                bi.f(runtimeException, th);
                th = runtimeException;
            }
            gk0.t(qgVar, th);
        }
    }

    public static int y(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return fd.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static dg z(dg dgVar) {
        dgVar.getClass();
        eg egVar = dgVar instanceof eg ? (eg) dgVar : null;
        if (egVar == null || (dgVar = egVar.h) != null) {
            return dgVar;
        }
        qg qgVar = egVar.g;
        qgVar.getClass();
        tg tgVar = (tg) qgVar.w(sl.g);
        dg ekVar = tgVar != null ? new ek(tgVar, egVar) : egVar;
        egVar.h = ekVar;
        return ekVar;
    }

    public boolean A() {
        return false;
    }

    public abstract void E();

    public abstract boolean G(int i2, KeyEvent keyEvent);

    public boolean H(KeyEvent keyEvent) {
        return false;
    }

    public boolean I() {
        return false;
    }

    public abstract void N(boolean z);

    public abstract void O(boolean z);

    public abstract void Q(CharSequence charSequence);

    public p1 R(i5 i5Var) {
        return null;
    }

    public abstract List d(List list, String str);

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void j(boolean z);

    public abstract void m(qd0 qd0Var, float f2, float f3);

    public abstract int n();

    public abstract int r(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract Context t();

    public abstract int v();

    public abstract ViewPropertyAnimator w(View view, int i2);

    public void F() {
    }
}
