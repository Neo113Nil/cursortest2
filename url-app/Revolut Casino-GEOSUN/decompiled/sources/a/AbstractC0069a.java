package a;

import A.o;
import A.q;
import A.r;
import D.C0005f;
import D.C0007h;
import D.C0011l;
import E0.l;
import E0.p;
import F.k;
import F0.e;
import F0.i;
import F0.s;
import L.C0041q;
import L.G;
import L.x;
import L.y;
import M0.AbstractC0043a;
import M0.AbstractC0063v;
import M0.C0056n;
import R0.AbstractC0068a;
import R0.u;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0077g;
import androidx.lifecycle.d;
import androidx.lifecycle.j;
import d0.c;
import d0.f;
import g0.C0140d;
import h.C0167u;
import h.s0;
import h0.C0173a;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.AbstractFutureC0188g;
import l.C0184c;
import l.C0187f;
import m.AbstractC0190a;
import o.AbstractC0213a;
import o.g;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import u.C0239b;
import u0.C0247g;
import y0.b;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0069a {

    /* renamed from: e, reason: collision with root package name */
    public static long f1082e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f1083f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f1084g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f1085h;

    public static void A(C0140d c0140d, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = c0140d.f2064g;
                    int i4 = c0140d.f2063f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    c0140d.f2059b = i3;
                    c0140d.f2058a = i4;
                    c0140d.f2060c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static List B(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0213a.a(obtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void C(c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static void D(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            q.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void E(TextView textView, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void F(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        s0 s0Var = s0.f2274j;
        if (s0Var != null && s0Var.f2276a == view) {
            s0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new s0(view, charSequence);
            return;
        }
        s0 s0Var2 = s0.f2275k;
        if (s0Var2 != null && s0Var2.f2276a == view) {
            s0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void G(XmlResourceParser xmlResourceParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void H(p pVar, AbstractC0043a abstractC0043a, AbstractC0043a abstractC0043a2) {
        try {
            AbstractC0068a.i(g.r(((b) pVar).b(abstractC0043a, abstractC0043a2)), C0247g.f3005a, null);
        } catch (Throwable th) {
            abstractC0043a2.resumeWith(g.f(th));
            throw th;
        }
    }

    public static final Object I(u uVar, u uVar2, p pVar) {
        Object c0056n;
        Object J2;
        try {
            s.a(2, pVar);
            c0056n = pVar.f(uVar2, uVar);
        } catch (Throwable th) {
            c0056n = new C0056n(th, false);
        }
        x0.a aVar = x0.a.f3094e;
        if (c0056n == aVar || (J2 = uVar.J(c0056n)) == AbstractC0063v.f691d) {
            return aVar;
        }
        if (J2 instanceof C0056n) {
            throw ((C0056n) J2).f676a;
        }
        return AbstractC0063v.l(J2);
    }

    public static boolean J(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static String K(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean L(String str, E0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.d()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Object M(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(M(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(M(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), M(entry.getValue()));
            }
            return jSONObject;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        }
        return obj;
    }

    public static ActionMode.Callback N(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof r) || callback == null) ? callback : new r(callback, textView);
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
    public static final Object a(List list, C0011l c0011l, b bVar) {
        C0005f c0005f;
        int i2;
        List list2;
        F0.p pVar;
        Iterator it;
        Throwable th;
        if (bVar instanceof C0005f) {
            c0005f = (C0005f) bVar;
            int i3 = c0005f.f188k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0005f.f188k = i3 - Integer.MIN_VALUE;
                Object obj = c0005f.f187j;
                Object obj2 = x0.a.f3094e;
                i2 = c0005f.f188k;
                if (i2 != 0) {
                    g.z(obj);
                    ArrayList arrayList = new ArrayList();
                    C0007h c0007h = new C0007h(list, arrayList, null);
                    c0005f.f185h = arrayList;
                    c0005f.f188k = 1;
                    if (c0011l.a(c0007h, c0005f) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0005f.f186i;
                        pVar = (F0.p) c0005f.f185h;
                        try {
                            g.z(obj);
                        } catch (Throwable th2) {
                            Object obj3 = pVar.f324e;
                            if (obj3 == null) {
                                pVar.f324e = th2;
                            } else {
                                g.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0005f.f185h = pVar;
                            c0005f.f186i = it;
                            c0005f.f188k = 2;
                            if (lVar.i(c0005f) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) pVar.f324e;
                        if (th == null) {
                            return C0247g.f3005a;
                        }
                        throw th;
                    }
                    list2 = (List) c0005f.f185h;
                    g.z(obj);
                }
                pVar = new F0.p();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) pVar.f324e;
                if (th == null) {
                }
            }
        }
        c0005f = new C0005f(bVar);
        Object obj4 = c0005f.f187j;
        Object obj22 = x0.a.f3094e;
        i2 = c0005f.f188k;
        if (i2 != 0) {
        }
        pVar = new F0.p();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) pVar.f324e;
        if (th == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap b(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                case k.BYTES_FIELD_NUMBER /* 8 */:
                    break;
                case k.FLOAT_FIELD_NUMBER /* 2 */:
                case k.LONG_FIELD_NUMBER /* 4 */:
                case k.STRING_FIELD_NUMBER /* 5 */:
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else {
                        if (i2 != 5) {
                            return bitmap;
                        }
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
        }
        return bitmap;
    }

    public static final void f(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                g.a(th, th2);
            }
        }
    }

    public static int g(G g2, C0041q c0041q, View view, View view2, x xVar, boolean z2) {
        int s2;
        int t2;
        if (xVar.p() == 0 || g2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            ((y) view.getLayoutParams()).getClass();
            throw null;
        }
        int b2 = c0041q.b(view2) - c0041q.c(view);
        switch (c0041q.f589b) {
            case 0:
                x xVar2 = c0041q.f588a;
                s2 = xVar2.f601f - xVar2.s();
                t2 = xVar2.t();
                break;
            default:
                x xVar3 = c0041q.f588a;
                s2 = xVar3.f602g - xVar3.u();
                t2 = xVar3.r();
                break;
        }
        return Math.min(s2 - t2, b2);
    }

    public static int h(G g2, C0041q c0041q, View view, View view2, x xVar, boolean z2) {
        if (xVar.p() == 0 || g2.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return g2.a();
        }
        c0041q.b(view2);
        c0041q.c(view);
        ((y) view.getLayoutParams()).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] i(Serializable serializable) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static void k(Activity activity, d dVar) {
        j a2;
        i.e(activity, "activity");
        i.e(dVar, "event");
        if (!(activity instanceof androidx.lifecycle.i) || (a2 = ((androidx.lifecycle.i) activity).a()) == null) {
            return;
        }
        a2.a(dVar);
    }

    public static boolean l(Method method, e eVar) {
        Class a2 = eVar.a();
        i.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static String n(C0077g c0077g) {
        StringBuilder sb = new StringBuilder(c0077g.size());
        for (int i2 = 0; i2 < c0077g.size(); i2++) {
            byte a2 = c0077g.a(i2);
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

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return A.e.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class p(J0.b bVar) {
        i.e(bVar, "<this>");
        Class a2 = ((F0.d) bVar).a();
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

    public static C0239b q(C0167u c0167u) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new C0239b(q.c(c0167u));
        }
        TextPaint textPaint = new TextPaint(c0167u.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a2 = o.a(c0167u);
        int d2 = o.d(c0167u);
        if (c0167u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (c0167u.getInputType() & 15) != 3) {
                boolean z2 = c0167u.getLayoutDirection() == 1;
                switch (c0167u.getTextDirection()) {
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
                byte directionality = Character.getDirectionality(q.b(A.p.a(c0167u.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new C0239b(textPaint, textDirectionHeuristic, a2, d2);
    }

    public static void r(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean s(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentSizingFlag", "Could not get metadata", e2);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static boolean t(byte b2) {
        return b2 > -65;
    }

    public static C0173a u(Context context) {
        String string;
        String string2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str = f.f1820a.f1818b;
            String str2 = f.f1821b.f1818b;
            String str3 = null;
            if (bundle == null) {
                string = null;
            } else {
                string = bundle.getString(str, null);
                if (string == null) {
                    string = bundle.getString(str2);
                }
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str4 = f.f1825f.f1818b;
            if (bundle2 != null) {
                bundle2.getString(str4, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str5 = f.f1826g.f1818b;
            if (bundle3 != null) {
                bundle3.getString(str5, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str6 = f.f1822c.f1818b;
            String str7 = f.f1823d.f1818b;
            if (bundle4 == null) {
                string2 = null;
            } else {
                string2 = bundle4.getString(str6, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str7);
                }
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                x(xml, jSONArray, false);
                            }
                        }
                    }
                    str3 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str8 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new C0173a(string, string2, str3, str8, bundle6 == null ? true : bundle6.getBoolean("io.flutter.automatically-register-plugins", true));
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static float v(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return A.e.c(edgeEffect, f2, f3);
        }
        A.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static o.b w(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0190a.f2701a);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    G(xmlResourceParser);
                }
                return new o.e(new t.c(string, string2, string3, B(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0190a.f2702b);
                        int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = obtainAttributes2.getInt(i3, 0);
                        int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                        String string6 = obtainAttributes2.getString(i5);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            G(xmlResourceParser);
                        }
                        arrayList.add(new o.d(string6, i2, z2, string5, i4, resourceId2));
                    } else {
                        G(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new o.c((o.d[]) arrayList.toArray(new o.d[0]));
            }
        } else {
            G(xmlResourceParser);
        }
        return null;
    }

    public static void x(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    x(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public abstract void O(byte[] bArr, int i2, int i3);

    public abstract boolean c(AbstractFutureC0188g abstractFutureC0188g, C0184c c0184c);

    public abstract boolean d(AbstractFutureC0188g abstractFutureC0188g, Object obj, Object obj2);

    public abstract boolean e(AbstractFutureC0188g abstractFutureC0188g, C0187f c0187f, C0187f c0187f2);

    public abstract String j(byte[] bArr, int i2, int i3);

    public abstract int m(String str, byte[] bArr, int i2, int i3);

    public abstract void y(C0187f c0187f, C0187f c0187f2);

    public abstract void z(C0187f c0187f, Thread thread);
}
