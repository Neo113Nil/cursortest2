package a;

import B6.o;
import C4.p;
import D6.x;
import I.InterfaceC0115k;
import I.S;
import I.T;
import P0.e;
import R5.C0164d;
import T.d;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.d0;
import com.icefishing.icefish.ice.fishing.s294s.R;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k6.InterfaceC0608c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.InterfaceC0641f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import l4.b;
import m0.C0684c;
import n6.AbstractC0792z;
import n6.C0784q;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import q0.AbstractC0831a;
import r4.f;
import s6.q;
import x0.i;
import y.InterfaceC1021a;
import y.t;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0169a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3030a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f3031b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f3032c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f3033d;

    /* renamed from: e, reason: collision with root package name */
    public static long f3034e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3035f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f3036g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f3037h;

    public AbstractC0169a(d0 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
    }

    public static void A(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            C.a.g(context, broadcastReceiver, intentFilter);
        } else if (i2 >= 26) {
            C.a.f(context, broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void B(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (TextUtils.isEmpty(strArr[i5])) {
                throw new IllegalArgumentException(f.f(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < strArr.length; i8++) {
                if (!hashSet.contains(Integer.valueOf(i8))) {
                    strArr2[i7] = strArr[i8];
                    i7++;
                }
            }
        }
        if (activity instanceof InterfaceC1021a) {
            ((InterfaceC1021a) activity).validateRequestPermissionsRequestCode(i2);
        }
        activity.requestPermissions(strArr, i2);
    }

    public static boolean C(PermissionsActivity permissionsActivity, String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i2 >= 32) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
        if (i2 != 31) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(permissionsActivity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static final Object D(q qVar, q qVar2, Function2 function2) {
        Object c0784q;
        Object K7;
        try {
            I.b(2, function2);
            c0784q = function2.invoke(qVar2, qVar);
        } catch (Throwable th) {
            c0784q = new C0784q(th, false);
        }
        W5.a aVar = W5.a.f2787d;
        if (c0784q == aVar || (K7 = qVar.K(c0784q)) == AbstractC0792z.f7099e) {
            return aVar;
        }
        if (K7 instanceof C0784q) {
            throw ((C0784q) K7).f7076a;
        }
        return AbstractC0792z.s(K7);
    }

    public static final d E(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name);
    }

    public static final d F(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name);
    }

    public static String G(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static void H(Object[] objArr, int i2) {
        for (int i5 = 0; i5 < i2; i5++) {
            if (objArr[i5] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 9);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static final d a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name);
    }

    public static int b(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new t(context).f8521b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C0164d.a(th, th2);
            }
        }
    }

    public static boolean e(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean f7 = f(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return f7;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean f(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static M5.a g(Map attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        M5.a aVar = M5.a.f1769c;
        aVar.getClass();
        e eVar = new e(2);
        C4.d dVar = (C4.d) eVar.f2194e;
        dVar.g(aVar.f1771b);
        String str = aVar.f1770a;
        if (str != null) {
            eVar.f2195i = str;
        }
        H4.e eVar2 = P5.a.f2289a;
        if (eVar2 != null && !eVar2.f991b.isEmpty()) {
            dVar.e(eVar2, "OneSignalDeviceSDK");
        }
        Intrinsics.checkNotNullExpressionValue(eVar, "put(...)");
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        for (Map.Entry entry : attributes.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null && str3 != null) {
                dVar.f(str2, str3);
            }
        }
        M5.a a7 = M5.a.a(dVar.b(), (String) eVar.f2195i);
        Intrinsics.checkNotNullExpressionValue(a7, "build(...)");
        return a7;
    }

    public static boolean h(String current, String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.a(current, str)) {
            return true;
        }
        if (current.length() != 0) {
            int i2 = 0;
            int i5 = 0;
            int i7 = 0;
            while (true) {
                if (i2 < current.length()) {
                    char charAt = current.charAt(i2);
                    int i8 = i7 + 1;
                    if (i7 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i5 - 1 == 0 && i7 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i5++;
                    }
                    i2++;
                    i7 = i8;
                } else if (i5 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return Intrinsics.a(StringsKt.J(substring).toString(), str);
                }
            }
        }
        return false;
    }

    public static boolean i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = T.f1153a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = S.f1149d;
        S s7 = (S) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (s7 == null) {
            s7 = new S();
            s7.f1150a = null;
            s7.f1151b = null;
            s7.f1152c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, s7);
        }
        WeakReference weakReference2 = s7.f1152c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        s7.f1152c = new WeakReference(keyEvent);
        if (s7.f1151b == null) {
            s7.f1151b = new SparseArray();
        }
        SparseArray sparseArray = s7.f1151b;
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
        throw p.f(arrayList, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(InterfaceC0115k interfaceC0115k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z7 = false;
        if (interfaceC0115k != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0115k.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f3030a) {
                            try {
                                f3031b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f3030a = true;
                        }
                        Method method = f3031b;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z7 = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z7) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (T.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f3032c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f3033d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f3032c = true;
                }
                Field field = f3033d;
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
                    if (T.c(decorView2, keyEvent)) {
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
            } else if ((view != null && T.c(view, keyEvent)) || interfaceC0115k.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class k(InterfaceC0608c interfaceC0608c) {
        Intrinsics.checkNotNullParameter(interfaceC0608c, "<this>");
        Class a7 = ((InterfaceC0641f) interfaceC0608c).a();
        if (a7.isPrimitive()) {
            String name = a7.getName();
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
        return a7;
    }

    public static File l(Context context) {
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

    public static C0684c m(b refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        C0684c c0684c = (C0684c) refHolder.f6272e;
        if (c0684c != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.a(c0684c.f6490d, sqLiteDatabase)) {
                return c0684c;
            }
        }
        C0684c c0684c2 = new C0684c(sqLiteDatabase);
        refHolder.f6272e = c0684c2;
        return c0684c2;
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

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0831a.c();
        }
        try {
            if (f3035f == null) {
                f3034e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f3035f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f3035f.invoke(null, Long.valueOf(f3034e))).booleanValue();
        } catch (Exception e7) {
            n("isTagEnabled", e7);
            return false;
        }
    }

    public static final d q(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d(name);
    }

    public static String r(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer s(Context context, Uri uri) {
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

    public static o t(String statusLine) {
        x xVar;
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(statusLine, "statusLine");
        if (kotlin.text.p.l(statusLine, "HTTP/1.")) {
            i2 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                xVar = x.f624i;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                xVar = x.f625l;
            }
        } else if (kotlin.text.p.l(statusLine, "ICY ")) {
            xVar = x.f624i;
            i2 = 4;
        } else {
            if (!kotlin.text.p.l(statusLine, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            xVar = x.f625l;
            i2 = 12;
        }
        int i5 = i2 + 3;
        if (statusLine.length() < i5) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i2, i5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        Integer intOrNull = StringsKt.toIntOrNull(substring);
        if (intOrNull == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = intOrNull.intValue();
        if (statusLine.length() <= i5) {
            str = "";
        } else {
            if (statusLine.charAt(i5) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i2 + 4);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        return new o(xVar, intValue, str);
    }

    public static i u(String str) {
        String group;
        if (str == null || StringsKt.z(str)) {
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
        String description = matcher.group(4) != null ? matcher.group(4) : "";
        Intrinsics.checkNotNullExpressionValue(description, "description");
        return new i(parseInt, parseInt2, parseInt3, description);
    }

    public static void v(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (openFileOutput != null) {
                            openFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e7);
                    if (openFileOutput != null) {
                        openFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static final void w(LinkedHashMap linkedHashMap, String str, String str2) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        if (str2 != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static V.b x(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                j = -1;
                break;
            }
            int i7 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i7) {
                break;
            }
            i5++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j7 = duplicate.getInt() & 4294967295L;
            for (int i8 = 0; i8 < j7; i8++) {
                int i9 = duplicate.getInt();
                long j8 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i9 || 1701669481 == i9) {
                    duplicate.position((int) (j8 + j));
                    V.b bVar = new V.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f1145l = duplicate;
                    bVar.f1142d = position;
                    int i10 = position - duplicate.getInt(position);
                    bVar.f1143e = i10;
                    bVar.f1144i = ((ByteBuffer) bVar.f1145l).getShort(i10);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final int y(int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char charAt = str.charAt(i2);
        return (charAt << 7) + str.charAt(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String z(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                if (str.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(str));
                }
                return str;
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    public abstract List c(String str, List list);

    public boolean p() {
        throw null;
    }
}
