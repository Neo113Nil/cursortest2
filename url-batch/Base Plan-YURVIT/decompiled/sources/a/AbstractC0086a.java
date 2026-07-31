package a;

import C.d;
import C.e;
import C.p;
import E0.q;
import F.C0024f;
import F.C0026h;
import F.C0030l;
import F0.f;
import G0.g;
import G0.j;
import H.k;
import I0.b;
import N.C0059p;
import N.F;
import N.w;
import N.x;
import O0.l;
import P0.o;
import T.h;
import V0.i;
import W.m;
import W.n;
import W0.AbstractC0078s;
import a0.C0088b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0095g;
import i.C0174v;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l0.c;
import w.C0245a;
import y.C0255E;
import y.C0256F;
import y.G;
import y.Q;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0086a {

    /* renamed from: a, reason: collision with root package name */
    public static long f1135a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f1136b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f1137c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1138d;

    public static float A(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f2, f3);
        }
        d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static h B(String str) {
        String group;
        if (str == null || i.P(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
        if (!matcher.matches() || (group = matcher.group(1)) == null) {
            return null;
        }
        int parseInt = Integer.parseInt(group);
        String group2 = matcher.group(2);
        if (group2 == null) {
            return null;
        }
        int parseInt2 = Integer.parseInt(group2);
        String group3 = matcher.group(3);
        if (group3 == null) {
            return null;
        }
        int parseInt3 = Integer.parseInt(group3);
        String group4 = matcher.group(4) != null ? matcher.group(4) : "";
        P0.h.d(group4, "description");
        return new h(parseInt, parseInt2, parseInt3, group4);
    }

    public static final void D(Object[] objArr, int i2, int i3) {
        P0.h.e(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void E(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void F(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static Set G(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return q.f221e;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            P0.h.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(y(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static boolean H(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void I(Object obj) {
        if (obj instanceof D0.d) {
            throw ((D0.d) obj).f201e;
        }
    }

    public static String J(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static ActionMode.Callback K(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof C.q) || callback == null) ? callback : new C.q(callback, textView);
    }

    public static ArrayList L(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static ArrayList M(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, C0030l c0030l, b bVar) {
        C0024f c0024f;
        int i2;
        List list2;
        o oVar;
        Iterator it;
        Throwable th;
        if (bVar instanceof C0024f) {
            c0024f = (C0024f) bVar;
            int i3 = c0024f.f356k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0024f.f356k = i3 - Integer.MIN_VALUE;
                Object obj = c0024f.f355j;
                i2 = c0024f.f356k;
                Object obj2 = H0.a.f511e;
                if (i2 != 0) {
                    I(obj);
                    ArrayList arrayList = new ArrayList();
                    C0026h c0026h = new C0026h(list, arrayList, null);
                    c0024f.f353h = arrayList;
                    c0024f.f356k = 1;
                    if (c0030l.a(c0026h, c0024f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0024f.f354i;
                        oVar = (o) c0024f.f353h;
                        try {
                            I(obj);
                        } catch (Throwable th2) {
                            Object obj3 = oVar.f807e;
                            if (obj3 == null) {
                                oVar.f807e = th2;
                            } else {
                                c((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0024f.f353h = oVar;
                            c0024f.f354i = it;
                            c0024f.f356k = 2;
                            if (lVar.j(c0024f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) oVar.f807e;
                        if (th == null) {
                            return D0.h.f206a;
                        }
                        throw th;
                    }
                    list2 = (List) c0024f.f353h;
                    I(obj);
                }
                oVar = new o();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) oVar.f807e;
                if (th == null) {
                }
            }
        }
        c0024f = new C0024f(bVar);
        Object obj4 = c0024f.f355j;
        i2 = c0024f.f356k;
        Object obj22 = H0.a.f511e;
        if (i2 != 0) {
        }
        oVar = new o();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) oVar.f807e;
        if (th == null) {
        }
    }

    public static final String b(Object[] objArr, int i2, int i3, E0.a aVar) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        P0.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void c(Throwable th, Throwable th2) {
        P0.h.e(th, "<this>");
        P0.h.e(th2, "exception");
        if (th != th2) {
            Integer num = K0.a.f602a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = J0.a.f590a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static F0.i d(F0.i iVar) {
        f fVar = iVar.f494e;
        fVar.b();
        fVar.f489q = true;
        if (fVar.f485m <= 0) {
            P0.h.c(f.f476r, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return fVar.f485m > 0 ? iVar : F0.i.f493f;
    }

    public static void e(Context context, C0.b bVar) {
        Rect rect;
        Q b2;
        WindowMetrics maximumWindowMetrics;
        Activity q2 = q(context);
        if (q2 != null) {
            m.f902a.getClass();
            int i2 = n.f903b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) q2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                P0.h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = q2.getSystemService("window");
                P0.h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                P0.h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                b2 = (i3 >= 30 ? new G() : i3 >= 29 ? new C0256F() : new C0255E()).b();
                P0.h.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = C0088b.f1139a.a(q2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(L.d.f("Left must be less than or equal to right, left: ", i4, ", right: ", i6).toString());
            }
            if (i5 > i7) {
                throw new IllegalArgumentException(L.d.f("top must be less than or equal to bottom, top: ", i5, ", bottom: ", i7).toString());
            }
            P0.h.e(b2, "_windowInsetsCompat");
            ((c) bVar).f2775a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void f(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 > i3) {
                throw new IllegalArgumentException(L.d.f("fromIndex: ", i2, " > toIndex: ", i3));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
    }

    public static final void g(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }
    }

    public static int i(F f2, C0059p c0059p, View view, View view2, w wVar, boolean z2) {
        int s2;
        int t;
        if (wVar.p() == 0 || f2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            ((x) view.getLayoutParams()).getClass();
            throw null;
        }
        int b2 = c0059p.b(view2) - c0059p.c(view);
        switch (c0059p.f767b) {
            case 0:
                w wVar2 = c0059p.f766a;
                s2 = wVar2.f779f - wVar2.s();
                t = wVar2.t();
                break;
            default:
                w wVar3 = c0059p.f766a;
                s2 = wVar3.f780g - wVar3.u();
                t = wVar3.r();
                break;
        }
        return Math.min(s2 - t, b2);
    }

    public static int j(F f2, C0059p c0059p, View view, View view2, w wVar, boolean z2) {
        if (wVar.p() == 0 || f2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return f2.a();
        }
        c0059p.b(view2);
        c0059p.c(view);
        ((x) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] k(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final D0.d l(Throwable th) {
        P0.h.e(th, "exception");
        return new D0.d(th);
    }

    public static String m(Object obj, String str) {
        P0.h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static boolean n(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable cVar = new S0.c(0, objArr.length - 1, 1);
                if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                    Iterator it = cVar.iterator();
                    while (((S0.b) it).f828g) {
                        int nextInt = ((S0.b) it).nextInt();
                        if (!n(objArr[nextInt], objArr2[nextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Collection collection = (Collection) obj;
                P0.h.e(collection, "<this>");
                Iterable cVar2 = new S0.c(0, collection.size() - 1, 1);
                if (!(cVar2 instanceof Collection) || !((Collection) cVar2).isEmpty()) {
                    Iterator it2 = cVar2.iterator();
                    while (((S0.b) it2).f828g) {
                        int nextInt2 = ((S0.b) it2).nextInt();
                        if (!n(list.get(nextInt2), list2.get(nextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return P0.h.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (map2.containsKey(entry.getKey()) && n(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String o(C0095g c0095g) {
        StringBuilder sb = new StringBuilder(c0095g.size());
        for (int i2 = 0; i2 < c0095g.size(); i2++) {
            byte a2 = c0095g.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static g p(g gVar, G0.h hVar) {
        P0.h.e(hVar, "key");
        if (P0.h.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity q(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return q(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static float r(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class s(T0.b bVar) {
        P0.h.e(bVar, "<this>");
        Class a2 = ((P0.d) bVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static C0245a t(C0174v c0174v) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0245a(p.c(c0174v));
        }
        TextPaint textPaint = new TextPaint(c0174v.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = C.n.a(c0174v);
        int d2 = C.n.d(c0174v);
        if (c0174v.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0174v.getInputType() & 15) != 3) {
                boolean z2 = c0174v.getLayoutDirection() == 1;
                switch (c0174v.getTextDirection()) {
                    case k.FLOAT_FIELD_NUMBER /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
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
                byte directionality = Character.getDirectionality(p.b(C.o.a(c0174v.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0245a(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void u(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static G0.d v(G0.d dVar) {
        P0.h.e(dVar, "<this>");
        b bVar = dVar instanceof b ? (b) dVar : null;
        if (bVar == null || (dVar = bVar.f528g) != null) {
            return dVar;
        }
        G0.f fVar = (G0.f) bVar.e().m(G0.e.f499e);
        G0.d hVar = fVar != null ? new b1.h((AbstractC0078s) fVar, bVar) : bVar;
        bVar.f528g = hVar;
        return hVar;
    }

    public static boolean w(byte b2) {
        return b2 > -65;
    }

    public static List x(Object obj) {
        List singletonList = Collections.singletonList(obj);
        P0.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int y(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static G0.i z(g gVar, G0.h hVar) {
        P0.h.e(hVar, "key");
        return P0.h.a(gVar.getKey(), hVar) ? j.f500e : gVar;
    }

    public abstract AbstractC0086a C(String str, l lVar);

    public abstract void N(byte[] bArr, int i2, int i3);

    public abstract Object h();
}
