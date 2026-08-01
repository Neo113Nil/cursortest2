package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import com.moontiko.really.admiralcasino.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class b9 {
    public static sb e = null;
    public static boolean q = false;
    public static Method r = null;
    public static boolean s = false;
    public static Field t = null;
    public static boolean u = true;
    public static Field v;
    public static boolean w;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object[] b = new Object[0];
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public static final sb d = new sb(null, null, null);
    public static final byte[] f = {48, 49, 53, 0};
    public static final byte[] g = {48, 49, 48, 0};
    public static final byte[] h = {48, 48, 57, 0};
    public static final byte[] i = {48, 48, 53, 0};
    public static final byte[] j = {48, 48, 49, 0};
    public static final byte[] k = {48, 48, 49, 0};
    public static final byte[] l = {48, 48, 50, 0};
    public static final xj m = new xj("NO_THREAD_ELEMENTS", 1);
    public static final hc n = new hc(5);
    public static final hc o = new hc(6);
    public static final hc p = new hc(7);

    public static w4 H(String str) {
        int i2;
        String str2;
        boolean U = n70.U(str, "HTTP/1.", false);
        q00 q00Var = q00.HTTP_1_0;
        if (U) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                q00Var = q00.HTTP_1_1;
            }
        } else {
            if (!n70.U(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i2 + 4);
            }
            return new w4(q00Var, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static ye J(ye yeVar, ye yeVar2) {
        yeVar2.getClass();
        return yeVar2 == gk.f ? yeVar : (ye) yeVar2.f(yeVar, new hc(1));
    }

    public static TypedValue K(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean L(Resources.Theme theme, int i2, boolean z) {
        TypedValue K = K(theme, i2);
        return (K == null || K.type != 18) ? z : K.data != 0;
    }

    public static TypedValue M(Context context, int i2, String str) {
        TypedValue K = K(context.getTheme(), i2);
        if (K != null) {
            return K;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue N(View view, int i2) {
        return M(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static final void O(ye yeVar, Object obj) {
        if (obj == m) {
            return;
        }
        if (!(obj instanceof c90)) {
            yeVar.f(null, o).getClass();
            g9.b();
            return;
        }
        ue[] ueVarArr = ((c90) obj).b;
        int length = ueVarArr.length - 1;
        if (length < 0) {
            return;
        }
        ue ueVar = ueVarArr[length];
        throw null;
    }

    public static void P(a5 a5Var, float f2) {
        s30 s30Var = (s30) a5Var.g;
        v9 v9Var = (v9) a5Var.h;
        boolean useCompatPadding = v9Var.getUseCompatPadding();
        boolean preventCornerOverlap = v9Var.getPreventCornerOverlap();
        if (f2 != s30Var.e || s30Var.f != useCompatPadding || s30Var.g != preventCornerOverlap) {
            s30Var.e = f2;
            s30Var.f = useCompatPadding;
            s30Var.g = preventCornerOverlap;
            s30Var.b(null);
            s30Var.invalidateSelf();
        }
        if (!v9Var.getUseCompatPadding()) {
            a5Var.S(0, 0, 0, 0);
            return;
        }
        s30 s30Var2 = (s30) a5Var.g;
        float f3 = s30Var2.e;
        float f4 = s30Var2.a;
        int ceil = (int) Math.ceil(t30.a(f3, f4, v9Var.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(t30.b(f3, f4, v9Var.getPreventCornerOverlap()));
        a5Var.S(ceil, ceil2, ceil, ceil2);
    }

    public static final Object[] S(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArr[i2] = it.next();
                    if (i3 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i4);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArr, i3);
                    }
                    i2 = i3;
                }
            }
        }
        return b;
    }

    public static final Object[] T(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final Object V(ye yeVar, Object obj) {
        if (obj == null) {
            obj = yeVar.f(0, n);
            obj.getClass();
        }
        if (obj == 0) {
            return m;
        }
        if (obj instanceof Integer) {
            return yeVar.f(new c90(yeVar, ((Number) obj).intValue()), p);
        }
        g9.b();
        return null;
    }

    public static boolean W(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static final tx a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new tx(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final int b(char c2) {
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

    public static void d(String str, boolean z) {
        if (z) {
            return;
        }
        g9.i(str);
    }

    public static void e(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void g(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static String j(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void k(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = ic0.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = hc0.d;
            hc0 hc0Var = (hc0) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (hc0Var == null) {
                hc0Var = new hc0();
                hc0Var.a = null;
                hc0Var.b = null;
                hc0Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, hc0Var);
            }
            WeakReference weakReference2 = hc0Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                hc0Var.c = new WeakReference(keyEvent);
                if (hc0Var.b == null) {
                    hc0Var.b = new SparseArray();
                }
                SparseArray sparseArray = hc0Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    g9.b();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m(yr yrVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (yrVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return yrVar.b(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!q) {
                            try {
                                r = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            q = true;
                        }
                        Method method = r;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (ic0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!s) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        t = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    s = true;
                }
                Field field = t;
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
                    if (ic0.c(decorView2, keyEvent)) {
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
            } else if ((view != null && ic0.c(view, keyEvent)) || yrVar.b(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static qd0 n(ae aeVar, int i2, ArrayList arrayList, qd0 qd0Var) {
        int i3;
        int i4 = i2 == 0 ? aeVar.n0 : aeVar.o0;
        if (i4 != -1 && (qd0Var == null || i4 != qd0Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                qd0 qd0Var2 = (qd0) arrayList.get(i5);
                if (qd0Var2.b == i4) {
                    if (qd0Var != null) {
                        qd0Var.c(i2, qd0Var2);
                        arrayList.remove(qd0Var);
                    }
                    qd0Var = qd0Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return qd0Var;
        }
        if (qd0Var == null) {
            if (aeVar instanceof mp) {
                mp mpVar = (mp) aeVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= mpVar.r0) {
                        i3 = -1;
                        break;
                    }
                    ae aeVar2 = mpVar.q0[i6];
                    if ((i2 == 0 && (i3 = aeVar2.n0) != -1) || (i2 == 1 && (i3 = aeVar2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        qd0 qd0Var3 = (qd0) arrayList.get(i7);
                        if (qd0Var3.b == i3) {
                            qd0Var = qd0Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (qd0Var == null) {
                qd0Var = new qd0();
                qd0Var.a = new ArrayList();
                qd0Var.d = null;
                qd0Var.e = -1;
                int i8 = qd0.f;
                qd0.f = i8 + 1;
                qd0Var.b = i8;
                qd0Var.c = i2;
            }
            arrayList.add(qd0Var);
        }
        ArrayList arrayList2 = qd0Var.a;
        if (arrayList2.contains(aeVar)) {
            return qd0Var;
        }
        arrayList2.add(aeVar);
        if (aeVar instanceof yo) {
            yo yoVar = (yo) aeVar;
            yoVar.t0.c(yoVar.u0 == 0 ? 1 : 0, qd0Var, arrayList);
        }
        int i9 = qd0Var.b;
        if (i2 == 0) {
            aeVar.n0 = i9;
            aeVar.I.c(i2, qd0Var, arrayList);
            aeVar.K.c(i2, qd0Var, arrayList);
        } else {
            aeVar.o0 = i9;
            aeVar.J.c(i2, qd0Var, arrayList);
            aeVar.M.c(i2, qd0Var, arrayList);
            aeVar.L.c(i2, qd0Var, arrayList);
        }
        aeVar.P.c(i2, qd0Var, arrayList);
        return qd0Var;
    }

    public static iw o(String str) {
        str.getClass();
        Matcher matcher = iw.c.matcher(str);
        if (!matcher.lookingAt()) {
            g9.h(str, "No subtype found for: \"");
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
        Matcher matcher2 = iw.d.matcher(str);
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
                } else if (n70.U(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new iw(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static w4 p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        w4 w4Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new w4((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                w4Var = w4.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                w4Var = null;
            }
            if (w4Var != null) {
                return w4Var;
            }
        }
        return new w4((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u30 q(Display display, int i2) {
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
                        g9.i(f60.e("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new u30(i3, radius, center);
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int w(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        g9.w(f60.d(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static TypedArray x(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public abstract void A(Typeface typeface);

    public abstract void B(Typeface typeface, boolean z);

    public abstract void C(rg rgVar);

    public abstract void E(int i2);

    public abstract void F(View view, int i2, int i3);

    public abstract void G(View view, float f2, float f3);

    public abstract Object I(Intent intent, int i2);

    public void Q(View view, float f2) {
        if (u) {
            try {
                fd0.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                u = false;
            }
        }
        view.setAlpha(f2);
    }

    public abstract void R(q50 q50Var, float f2);

    public abstract boolean U(View view, int i2);

    public void c(int i2) {
        new Handler(Looper.getMainLooper()).post(new av(i2, 1, this));
    }

    public abstract int h(View view, int i2);

    public abstract int i(View view, int i2);

    public float r(View view) {
        if (u) {
            try {
                return fd0.a(view);
            } catch (NoSuchMethodError unused) {
                u = false;
            }
        }
        return view.getAlpha();
    }

    public abstract float s(q50 q50Var);

    public int t(View view) {
        return 0;
    }

    public int u() {
        return 0;
    }

    public abstract void y(Throwable th);

    public abstract void z(int i2);

    public void D(View view, int i2) {
    }
}
