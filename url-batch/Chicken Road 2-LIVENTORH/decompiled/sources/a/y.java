package a;

import android.R;
import android.animation.TimeInterpolator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.window.BackEvent;
import androidx.fragment.app.w0;
import androidx.lifecycle.j0;
import f1.m0;
import f1.y0;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class y implements r0.f {

    /* renamed from: f, reason: collision with root package name */
    public static Field f69f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f70g;

    /* renamed from: h, reason: collision with root package name */
    public static Class f71h;
    public static boolean i;

    /* renamed from: j, reason: collision with root package name */
    public static Field f72j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f73k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f74l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f75m;

    public y() {
        new ConcurrentHashMap();
    }

    public static int A(View view, int i4) {
        Context context = view.getContext();
        TypedValue c02 = h.a.c0(view.getContext(), i4, view.getClass().getCanonicalName());
        int i5 = c02.resourceId;
        return i5 != 0 ? context.getColor(i5) : c02.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f1152c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList B(Context context, int i4) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e0.i iVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        e0.j jVar = new e0.j(resources, theme);
        synchronized (e0.m.f1160c) {
            try {
                SparseArray sparseArray = (SparseArray) e0.m.f1159b.get(jVar);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (iVar = (e0.i) sparseArray.get(i4)) != null) {
                    if (iVar.f1151b.equals(resources.getConfiguration())) {
                        if (theme == null) {
                            if (iVar.f1152c != 0) {
                            }
                            colorStateList2 = iVar.f1150a;
                        }
                        if (theme != null) {
                        }
                    }
                    sparseArray.remove(i4);
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = e0.m.f1158a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i4, typedValue, true);
        int i5 = typedValue.type;
        if (i5 < 28 || i5 > 31) {
            try {
                colorStateList = e0.c.a(resources, resources.getXml(i4), theme);
            } catch (Exception e4) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            }
        }
        if (colorStateList == null) {
            return resources.getColorStateList(i4, theme);
        }
        synchronized (e0.m.f1160c) {
            try {
                WeakHashMap weakHashMap = e0.m.f1159b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(jVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(jVar, sparseArray2);
                }
                sparseArray2.append(i4, new e0.i(colorStateList, jVar.f1153a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateList;
    }

    public static ColorStateList C(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !u.v(drawable)) {
            return null;
        }
        colorStateList = u.f(drawable).getColorStateList();
        return colorStateList;
    }

    public static Set D() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(k3.a aVar) {
        f3.d.e(aVar, "<this>");
        if (j0.class.isPrimitive()) {
            String name = j0.class.getName();
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
        return j0.class;
    }

    public static float F(String[] strArr, int i4) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File G(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean H(int i4) {
        if (i4 == 0) {
            return false;
        }
        ThreadLocal threadLocal = f0.a.f1264a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i4);
        int green = Color.green(i4);
        int blue = Color.blue(i4);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d3 = green / 255.0d;
        double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = blue / 255.0d;
        double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d5;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d5 / 100.0d > 0.5d;
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int J(int i4, int i5, float f2) {
        return f0.a.b(f0.a.d(i5, Math.round(Color.alpha(i5) * f2)), i4);
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
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
    }

    public static v0.b Q(MappedByteBuffer mappedByteBuffer) {
        long j4;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i4 = duplicate.getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                j4 = -1;
                break;
            }
            int i6 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j4 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (j4 != -1) {
            duplicate.position(duplicate.position() + ((int) (j4 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j5 = duplicate.getInt() & 4294967295L;
            for (int i7 = 0; i7 < j5; i7++) {
                int i8 = duplicate.getInt();
                long j6 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    duplicate.position((int) (j6 + j4));
                    v0.b bVar = new v0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.d = duplicate;
                    bVar.f2710a = position;
                    int i9 = position - duplicate.getInt(position);
                    bVar.f2711b = i9;
                    bVar.f2712c = ((ByteBuffer) bVar.d).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int R(Context context, int i4, int i5) {
        TypedValue a02 = h.a.a0(context, i4);
        return (a02 == null || a02.type != 16) ? i5 : a02.data;
    }

    public static TimeInterpolator S(Context context, int i4, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!I(valueOf, "cubic-bezier") && !I(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (I(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(F(split, 0), F(split, 1), F(split, 2), F(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!I(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            f0.e.b(w(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(substring), e4);
        }
    }

    public static void T(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static int V(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final c1.b c(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new c1.b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final String f(Object[] objArr, int i4, int i5, a3.a aVar) {
        StringBuilder sb = new StringBuilder((i5 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i4 + i6];
            if (obj == aVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        f3.d.d(sb2, "toString(...)");
        return sb2;
    }

    public static void h(int i4, int i5, int i6) {
        if (i4 >= 0 && i5 <= i6) {
            if (i4 > i5) {
                throw new IllegalArgumentException(w0.e("fromIndex: ", i4, " > toIndex: ", i5));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
    }

    public static int i(Context context, String str) {
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
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, c0.d.a(context)) : 1;
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

    public static void j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int k(y0 y0Var, androidx.emoji2.text.g gVar, View view, View view2, m0 m0Var, boolean z3) {
        if (m0Var.v() == 0 || y0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(m0.H(view) - m0.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int l(y0 y0Var, androidx.emoji2.text.g gVar, View view, View view2, m0 m0Var, boolean z3, boolean z4) {
        if (m0Var.v() == 0 || y0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z4 ? Math.max(0, (y0Var.b() - Math.max(m0.H(view), m0.H(view2))) - 1) : Math.max(0, Math.min(m0.H(view), m0.H(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(m0.H(view) - m0.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return max;
    }

    public static int m(y0 y0Var, androidx.emoji2.text.g gVar, View view, View view2, m0 m0Var, boolean z3) {
        if (m0Var.v() == 0 || y0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return y0Var.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(m0.H(view) - m0.H(view2)) + 1)) * y0Var.b());
    }

    public static float[] n(float[] fArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i4, length);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static boolean o(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean p3 = p(file, inputStream);
                j(inputStream);
                return p3;
            } catch (Throwable th) {
                th = th;
                j(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean p(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    j(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            j(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.emoji2.text.v q(Context context) {
        ProviderInfo providerInfo;
        k0.d dVar;
        ApplicationInfo applicationInfo;
        l2.f cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new l2.f(2);
        PackageManager packageManager = context.getPackageManager();
        h.a.m(packageManager, "Package manager required to locate emoji font provider");
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
                Signature[] h4 = cVar.h(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : h4) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new k0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e4);
            }
            if (dVar != null) {
                return null;
            }
            return new androidx.emoji2.text.v(new androidx.emoji2.text.u(context, dVar));
        }
        dVar = null;
        if (dVar != null) {
        }
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
    public static f0.e[] w(String str) {
        int i4;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < str.length()) {
            while (i7 < str.length()) {
                char charAt = str.charAt(i7);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i7++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i6, i7).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i5) == 'z' || trim.charAt(i5) == 'Z') {
                            fArr = new float[i5];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i8 = i5;
                                int i9 = 1;
                                while (i9 < length) {
                                    int i10 = i5;
                                    int i11 = i10;
                                    int i12 = i11;
                                    int i13 = i12;
                                    for (int i14 = i9; i14 < trim.length(); i14++) {
                                        char charAt2 = trim.charAt(i14);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i14 != i9 && i10 == 0) {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                            break;
                                                        }
                                                        i10 = 0;
                                                        break;
                                                    case '.':
                                                        if (i11 == 0) {
                                                            i10 = 0;
                                                            i11 = 1;
                                                            break;
                                                        }
                                                        i10 = 0;
                                                        i12 = 1;
                                                        i13 = 1;
                                                        break;
                                                    default:
                                                        i10 = 0;
                                                        break;
                                                }
                                            } else {
                                                i10 = 1;
                                            }
                                            if (i12 == 0) {
                                                if (i9 < i14) {
                                                    fArr2[i8] = Float.parseFloat(trim.substring(i9, i14));
                                                    i8++;
                                                }
                                                i9 = i13 == 0 ? i14 : i14 + 1;
                                                i5 = 0;
                                            }
                                        }
                                        i10 = 0;
                                        i12 = 1;
                                        if (i12 == 0) {
                                        }
                                    }
                                    if (i9 < i14) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    i5 = 0;
                                }
                                fArr = n(fArr2, i8);
                                i5 = 0;
                            } catch (NumberFormatException e4) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e4);
                            }
                        }
                        arrayList.add(new f0.e(trim.charAt(i5), fArr));
                    }
                    i6 = i7;
                    i7++;
                    i5 = 0;
                }
                i7++;
            }
            trim = str.substring(i6, i7).trim();
            if (!trim.isEmpty()) {
            }
            i6 = i7;
            i7++;
            i5 = 0;
        }
        if (i7 - i6 != 1 || i6 >= str.length()) {
            i4 = 0;
        } else {
            i4 = 0;
            arrayList.add(new f0.e(str.charAt(i6), new float[0]));
        }
        return (f0.e[]) arrayList.toArray(new f0.e[i4]);
    }

    public static f0.e[] x(f0.e[] eVarArr) {
        f0.e[] eVarArr2 = new f0.e[eVarArr.length];
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr2[i4] = new f0.e(eVarArr[i4]);
        }
        return eVarArr2;
    }

    public static int z(Context context, int i4, int i5) {
        Integer num;
        TypedValue a02 = h.a.a0(context, i4);
        if (a02 != null) {
            int i6 = a02.resourceId;
            num = Integer.valueOf(i6 != 0 ? context.getColor(i6) : a02.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i5;
    }

    public abstract void L(Throwable th);

    public abstract View M(int i4);

    public abstract boolean N();

    public abstract void O(a0.j jVar);

    public abstract Object P(Intent intent, int i4);

    public abstract void U(i0 i0Var, i0 i0Var2, Window window, View view, boolean z3, boolean z4);

    public abstract Typeface r(Context context, e0.f fVar, Resources resources, int i4);

    public abstract Typeface s(Context context, k0.i[] iVarArr, int i4);

    public Typeface t(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface u(Context context, InputStream inputStream) {
        File G = G(context);
        if (G == null) {
            return null;
        }
        try {
            if (p(G, inputStream)) {
                return Typeface.createFromFile(G.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G.delete();
        }
    }

    public Typeface v(Context context, Resources resources, int i4, String str, int i5) {
        File G = G(context);
        if (G == null) {
            return null;
        }
        try {
            if (o(G, resources, i4)) {
                return Typeface.createFromFile(G.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            G.delete();
        }
    }

    public k0.i y(k0.i[] iVarArr, int i4) {
        new l2.f(14);
        int i5 = (i4 & 1) == 0 ? 400 : 700;
        boolean z3 = (i4 & 2) != 0;
        k0.i iVar = null;
        int i6 = Integer.MAX_VALUE;
        for (k0.i iVar2 : iVarArr) {
            int abs = (Math.abs(iVar2.f2152c - i5) * 2) + (iVar2.d == z3 ? 0 : 1);
            if (iVar == null || i6 > abs) {
                iVar = iVar2;
                i6 = abs;
            }
        }
        return iVar;
    }

    public void g(Window window) {
    }
}
