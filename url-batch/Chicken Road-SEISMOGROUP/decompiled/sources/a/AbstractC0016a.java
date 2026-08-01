package a;

import C.c;
import T.b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.lifecycle.d;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import e0.h;
import f.AbstractFutureC0034g;
import f.C0030c;
import f.C0033f;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.AbstractC0055p;
import l.e;
import l.f;
import l.g;
import l.q;
import org.json.JSONArray;
import org.json.JSONObject;
import u.m;
import u.n;
import y.C0102a;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0016a implements c {

    /* renamed from: c, reason: collision with root package name */
    public static long f460c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f461d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f462e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f463f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f464b;

    public /* synthetic */ AbstractC0016a(int i2) {
        this.f464b = i2;
    }

    public static void A(F.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", F.c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public static final void D(Object obj) {
        if (obj instanceof U.c) {
            throw ((U.c) obj).f428b;
        }
    }

    public static String E(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean F(String str, d0.a aVar) {
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

    public static Object G(Object obj) {
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
                jSONArray.put(G(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(G(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), G(entry.getValue()));
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

    public static ArrayList H(Throwable th) {
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
            Integer num = a0.a.f465a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = Z.a.f459a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void d(Context context, b bVar) {
        Rect rect;
        q b2;
        WindowMetrics maximumWindowMetrics;
        Activity l2 = l(context);
        if (l2 != null) {
            m.f1290a.getClass();
            int i2 = n.f1291b;
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
                b2 = C0102a.f1325a.a(l2);
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
                ((F.c) bVar).f223a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    public static final U.c h(Throwable th) {
        h.e(th, "exception");
        return new U.c(th);
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
    public static final Class n(h0.b bVar) {
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

    public static W.d t(W.d dVar) {
        h.e(dVar, "<this>");
        Y.b bVar = dVar instanceof Y.b ? (Y.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        W.d dVar2 = bVar.f455d;
        if (dVar2 != null) {
            return dVar2;
        }
        W.i iVar = bVar.f454c;
        h.b(iVar);
        W.f fVar = (W.f) iVar.k(W.e.f448b);
        W.d hVar = fVar != null ? new p0.h((AbstractC0055p) fVar, bVar) : bVar;
        bVar.f455d = hVar;
        return hVar;
    }

    public static int u(int i2) {
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

    public static W.i v(W.g gVar, W.h hVar) {
        h.e(hVar, "key");
        return h.a(gVar.getKey(), hVar) ? W.j.f449b : gVar;
    }

    public static W.i w(W.g gVar, W.i iVar) {
        h.e(iVar, "context");
        return x(gVar, iVar);
    }

    public static W.i x(W.i iVar, W.i iVar2) {
        h.e(iVar2, "context");
        return iVar2 == W.j.f449b ? iVar : (W.i) iVar2.f(iVar, new W.b(1));
    }

    public abstract void C(boolean z);

    @Override // C.c
    public void b(String str, HashMap hashMap) {
        q().b(str, hashMap);
    }

    @Override // C.c
    public void c(Serializable serializable) {
        q().c(serializable);
    }

    public abstract boolean e(AbstractFutureC0034g abstractFutureC0034g, C0030c c0030c);

    public abstract boolean f(AbstractFutureC0034g abstractFutureC0034g, Object obj, Object obj2);

    public abstract boolean g(AbstractFutureC0034g abstractFutureC0034g, C0033f c0033f, C0033f c0033f2);

    public abstract Object m(String str);

    public abstract String o();

    public boolean p() {
        return Boolean.TRUE.equals(m("noResult"));
    }

    public abstract c q();

    public abstract boolean s();

    public String toString() {
        switch (this.f464b) {
            case 1:
                return o() + " " + ((String) m("sql")) + " " + ((List) m("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract void y(C0033f c0033f, C0033f c0033f2);

    public abstract void z(C0033f c0033f, Thread thread);

    public void B(boolean z) {
    }
}
