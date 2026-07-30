package o;

import F0.i;
import M0.AbstractC0060s;
import U.m;
import U.n;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t0.InterfaceC0237b;
import u0.C0243c;
import w.AbstractC0252D;
import w.C0254F;
import w.G;
import w.H;
import w.S;
import w0.h;
import w0.j;

/* loaded from: classes.dex */
public abstract class g {
    public g() {
        new ConcurrentHashMap();
    }

    public static ArrayList A(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void a(Throwable th, Throwable th2) {
        i.e(th, "<this>");
        i.e(th2, "exception");
        if (th != th2) {
            Integer num = A0.a.f39a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = z0.a.f3103a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void b(Context context, InterfaceC0237b interfaceC0237b) {
        Rect rect;
        S b2;
        WindowMetrics maximumWindowMetrics;
        Activity n2 = n(context);
        if (n2 != null) {
            m.f1024a.getClass();
            int i2 = n.f1025b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) n2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = n2.getSystemService("window");
                i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                i.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                b2 = (i3 >= 30 ? new H() : i3 >= 29 ? new G() : new C0254F()).b();
                i.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = Y.b.f1081a.a(n2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            }
            if (i5 <= i7) {
                i.e(b2, "_windowInsetsCompat");
                ((d0.c) interfaceC0237b).f1788a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean e2 = e(file, inputStream);
                c(inputStream);
                return e2;
            } catch (Throwable th) {
                th = th;
                c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean e(File file, InputStream inputStream) {
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
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final C0243c f(Throwable th) {
        i.e(th, "exception");
        return new C0243c(th);
    }

    public static boolean k(Object obj, Object obj2) {
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
            if (objArr.length != objArr2.length) {
                return false;
            }
            Iterable cVar = new I0.c(0, objArr.length - 1, 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator it = cVar.iterator();
                while (((I0.b) it).f414g) {
                    int a2 = ((I0.b) it).a();
                    if (!k(objArr[a2], objArr2[a2])) {
                        return false;
                    }
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Collection collection = (Collection) obj;
            i.e(collection, "<this>");
            Iterable cVar2 = new I0.c(0, collection.size() - 1, 1);
            if (!(cVar2 instanceof Collection) || !((Collection) cVar2).isEmpty()) {
                Iterator it2 = cVar2.iterator();
                while (((I0.b) it2).f414g) {
                    int a3 = ((I0.b) it2).a();
                    if (!k(list.get(a3), list2.get(a3))) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return i.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey()) || !k(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static w0.g m(w0.g gVar, h hVar) {
        i.e(hVar, "key");
        if (i.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static Activity n(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return n(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int o(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static String p(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static File q(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static w0.d r(w0.d dVar) {
        i.e(dVar, "<this>");
        y0.b bVar = dVar instanceof y0.b ? (y0.b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        w0.d dVar2 = bVar.f3099g;
        if (dVar2 != null) {
            return dVar2;
        }
        w0.f fVar = (w0.f) bVar.getContext().f(w0.e.f3081e);
        w0.d hVar = fVar != null ? new R0.h((AbstractC0060s) fVar, bVar) : bVar;
        bVar.f3099g = hVar;
        return hVar;
    }

    public static List s(Object obj) {
        List singletonList = Collections.singletonList(obj);
        i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static int t(int i2) {
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

    public static w0.i u(w0.g gVar, h hVar) {
        i.e(hVar, "key");
        return i.a(gVar.getKey(), hVar) ? j.f3082e : gVar;
    }

    public static MappedByteBuffer v(Context context, Uri uri) {
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

    public static void y(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0252D.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final void z(Object obj) {
        if (obj instanceof C0243c) {
            throw ((C0243c) obj).f3000e;
        }
    }

    public abstract Typeface g(Context context, c cVar, Resources resources, int i2);

    public abstract Typeface h(Context context, t.h[] hVarArr, int i2);

    public Typeface i(Context context, InputStream inputStream) {
        File q2 = q(context);
        if (q2 == null) {
            return null;
        }
        try {
            if (e(q2, inputStream)) {
                return Typeface.createFromFile(q2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q2.delete();
        }
    }

    public Typeface j(Context context, Resources resources, int i2, String str, int i3) {
        File q2 = q(context);
        if (q2 == null) {
            return null;
        }
        try {
            if (d(q2, resources, i2)) {
                return Typeface.createFromFile(q2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            q2.delete();
        }
    }

    public t.h l(t.h[] hVarArr, int i2) {
        new E.a(23);
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        t.h hVar = null;
        int i4 = Integer.MAX_VALUE;
        for (t.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f2985c - i3) * 2) + (hVar2.f2986d == z2 ? 0 : 1);
            if (hVar == null || i4 > abs) {
                hVar = hVar2;
                i4 = abs;
            }
        }
        return hVar;
    }

    public abstract void x(boolean z2);

    public void w(boolean z2) {
    }
}
