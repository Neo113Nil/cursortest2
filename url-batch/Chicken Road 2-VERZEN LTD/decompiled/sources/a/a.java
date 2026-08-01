package a;

import T.b;
import U.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.lifecycle.d;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import e0.h;
import f.AbstractFutureC0036g;
import f.C0032c;
import f.C0035f;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k0.AbstractC0057p;
import l.e;
import l.f;
import l.g;
import l.q;
import org.json.JSONArray;
import org.json.JSONObject;
import v.C0111n;
import v.InterfaceC0110m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f405a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f406b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f407c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f408d;

    public static boolean A(byte[] bArr, byte[] bArr2) {
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

    public static final void B(Object obj) {
        if (obj instanceof c) {
            throw ((c) obj).f373b;
        }
    }

    public static String C(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean D(String str, d0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
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

    public static Object E(Object obj) {
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
                jSONArray.put(E(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(E(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), E(entry.getValue()));
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

    public static ArrayList F(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void a(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = a0.a.f409a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = Z.a.f404a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Bitmap b(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
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

    public static void c(Context context, b bVar) {
        Rect rect;
        q b2;
        WindowMetrics maximumWindowMetrics;
        Activity l2 = l(context);
        if (l2 != null) {
            InterfaceC0110m.f1293a.getClass();
            int i2 = C0111n.f1294b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) l2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = l2.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                b2 = (i3 >= 30 ? new g() : i3 >= 29 ? new f() : new e()).b();
                h.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = z.b.f1328a.a(l2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            }
            if (i5 <= i7) {
                h.e(b2, "_windowInsetsCompat");
                ((E.c) bVar).f148a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
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

    public static final c h(Throwable th) {
        h.e(th, "exception");
        return new c(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Activity activity, d dVar) {
        j a2;
        h.e(activity, "activity");
        h.e(dVar, "event");
        if (!(activity instanceof i) || (a2 = ((i) activity).a()) == null) {
            return;
        }
        a2.a(dVar);
    }

    public static boolean j(Method method, e0.e eVar) {
        Class a2 = eVar.a();
        h.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static W.g k(W.g gVar, W.h hVar) {
        h.e(hVar, "key");
        if (h.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity l(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return l(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class m(h0.b bVar) {
        h.e(bVar, "<this>");
        Class a2 = ((e0.d) bVar).a();
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

    public static void n(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static W.d o(W.d dVar) {
        h.e(dVar, "<this>");
        Y.b bVar = dVar instanceof Y.b ? (Y.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        W.d dVar2 = bVar.f400d;
        if (dVar2 != null) {
            return dVar2;
        }
        W.i iVar = bVar.f399c;
        h.b(iVar);
        W.f fVar = (W.f) iVar.k(W.e.f393b);
        W.d hVar = fVar != null ? new p0.h((AbstractC0057p) fVar, bVar) : bVar;
        bVar.f400d = hVar;
        return hVar;
    }

    public static boolean p(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("ContentSizingFlag", "Could not get metadata");
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static int q(int i2) {
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

    public static W.i r(W.g gVar, W.h hVar) {
        h.e(hVar, "key");
        return h.a(gVar.getKey(), hVar) ? W.j.f394b : gVar;
    }

    public static W.i s(W.g gVar, W.i iVar) {
        h.e(iVar, "context");
        return t(gVar, iVar);
    }

    public static W.i t(W.i iVar, W.i iVar2) {
        h.e(iVar2, "context");
        return iVar2 == W.j.f394b ? iVar : (W.i) iVar2.f(iVar, new W.b(1));
    }

    public static void w(H.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = dVar.f245g;
                    int i4 = dVar.f244f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    dVar.f240b = i3;
                    dVar.f239a = i4;
                    dVar.f241c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static void x(E.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", E.c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public abstract boolean d(AbstractFutureC0036g abstractFutureC0036g, C0032c c0032c);

    public abstract boolean e(AbstractFutureC0036g abstractFutureC0036g, Object obj, Object obj2);

    public abstract boolean f(AbstractFutureC0036g abstractFutureC0036g, C0035f c0035f, C0035f c0035f2);

    public abstract void u(C0035f c0035f, C0035f c0035f2);

    public abstract void v(C0035f c0035f, Thread thread);

    public abstract void z(boolean z2);

    public void y(boolean z2) {
    }
}
