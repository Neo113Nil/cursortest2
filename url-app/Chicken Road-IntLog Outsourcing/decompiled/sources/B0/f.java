package B0;

import E.O;
import E.Q;
import E.S;
import E.b0;
import T4.v;
import a.AbstractC0169a;
import a4.AbstractC0197c;
import a4.C0195a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.datastore.preferences.protobuf.C0212g;
import b2.AbstractC0279e;
import c0.C0301c;
import com.google.android.gms.tasks.Task;
import f4.C0430g;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.GeneratedPluginRegistrant;
import j3.C1200a;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ProtocolException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k4.InterfaceC1218d;
import kotlin.KotlinVersion;
import l4.EnumC1260a;
import m2.AbstractC1286i;
import m2.C1282e;
import m2.EnumC1281d;
import m2.EnumC1289l;
import m4.AbstractC1295c;
import o1.u;
import r3.C1406b;
import s0.C1415c;
import t3.C1427b;
import t3.C1429d;
import u1.AbstractC1477a;
import u3.C1480b;

/* loaded from: classes.dex */
public abstract class f {
    public static final void A(String value, String name) {
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(name, "name");
        int length = value.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = value.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0169a.b(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.i.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(name);
                sb.append(" value");
                sb.append(U4.c.j(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final int B(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(o.g(i2, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int C(int i2) {
        if (i2 == 0) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            i3 = 4;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i2 != 5) {
                    throw new IllegalArgumentException(o.g(i2, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i3;
    }

    public static final int D(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(o.g(i2, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int E(int i2) {
        if (i2 == 0) {
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            i3 = 4;
            if (i2 != 3) {
                if (i2 == 4) {
                    return 5;
                }
                if (i2 == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(o.g(i2, "Could not convert ", " to State"));
            }
        }
        return i3;
    }

    public static InterfaceC1218d F(InterfaceC1218d interfaceC1218d) {
        InterfaceC1218d intercepted;
        kotlin.jvm.internal.i.e(interfaceC1218d, "<this>");
        AbstractC1295c abstractC1295c = interfaceC1218d instanceof AbstractC1295c ? (AbstractC1295c) interfaceC1218d : null;
        return (abstractC1295c == null || (intercepted = abstractC1295c.intercepted()) == null) ? interfaceC1218d : intercepted;
    }

    public static MappedByteBuffer G(Context context, Uri uri) {
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

    public static B3.d H(String statusLine) {
        v vVar;
        int i2;
        String str;
        kotlin.jvm.internal.i.e(statusLine, "statusLine");
        if (B4.r.O(statusLine, "HTTP/1.", false)) {
            i2 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                vVar = v.f2986c;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                vVar = v.f2987d;
            }
        } else if (B4.r.O(statusLine, "ICY ", false)) {
            vVar = v.f2986c;
            i2 = 4;
        } else {
            if (!B4.r.O(statusLine, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            vVar = v.f2987d;
            i2 = 12;
        }
        int i3 = i2 + 3;
        if (statusLine.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i2, i3);
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        Integer P5 = B4.r.P(substring);
        if (P5 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = P5.intValue();
        if (statusLine.length() <= i3) {
            str = "";
        } else {
            if (statusLine.charAt(i3) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i2 + 4);
            kotlin.jvm.internal.i.d(str, "substring(...)");
        }
        return new B3.d(vVar, intValue, str);
    }

    public static void I(FlutterEngine flutterEngine) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
        } catch (Exception e3) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }

    public static int J(float f3) {
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f3);
    }

    public static final int K(int i2) {
        AbstractC0279e.k(i2, "state");
        int b6 = O.j.b(i2);
        if (b6 == 0) {
            return 0;
        }
        if (b6 == 1) {
            return 1;
        }
        if (b6 == 2) {
            return 2;
        }
        if (b6 == 3) {
            return 3;
        }
        if (b6 == 4) {
            return 4;
        }
        if (b6 == 5) {
            return 5;
        }
        throw new C1.b();
    }

    public static Object L(Task task) {
        if (task.e()) {
            return task.c();
        }
        if (((I1.o) task).f1266d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.b());
    }

    public static Object a(I1.o oVar, long j2, TimeUnit timeUnit) {
        u.f("Must not be called on the main application thread");
        u.e();
        u.h(oVar, "Task must not be null");
        u.h(timeUnit, "TimeUnit must not be null");
        if (oVar.d()) {
            return L(oVar);
        }
        I1.j jVar = new I1.j();
        C0.p pVar = I1.i.f1250b;
        oVar.a(pVar, jVar);
        I1.l lVar = new I1.l(pVar, (I1.d) jVar);
        I1.n nVar = oVar.f1264b;
        nVar.b(lVar);
        oVar.n();
        nVar.b(new I1.l(pVar, (I1.b) jVar));
        oVar.n();
        if (jVar.f1251a.await(j2, timeUnit)) {
            return L(oVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Object b(Task task) {
        u.f("Must not be called on the main application thread");
        u.e();
        u.h(task, "Task must not be null");
        if (task.d()) {
            return L(task);
        }
        I1.j jVar = new I1.j();
        C0.p pVar = I1.i.f1250b;
        task.a(pVar, jVar);
        I1.o oVar = (I1.o) task;
        I1.l lVar = new I1.l(pVar, (I1.d) jVar);
        I1.n nVar = oVar.f1264b;
        nVar.b(lVar);
        oVar.n();
        nVar.b(new I1.l(pVar, (I1.b) jVar));
        oVar.n();
        jVar.f1251a.await();
        return L(task);
    }

    public static final Bundle c(C0430g... c0430gArr) {
        Bundle bundle = new Bundle(c0430gArr.length);
        for (C0430g c0430g : c0430gArr) {
            String str = (String) c0430g.f5668a;
            Object obj = c0430g.f5669b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                kotlin.jvm.internal.i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                A.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                A.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final LinkedHashSet d(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.i.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } finally {
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            int readInt = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                Uri uri = Uri.parse(objectInputStream.readUTF());
                boolean readBoolean = objectInputStream.readBoolean();
                kotlin.jvm.internal.i.d(uri, "uri");
                linkedHashSet.add(new C1415c(readBoolean, uri));
            }
            AbstractC1477a.e(objectInputStream, null);
            AbstractC1477a.e(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    public static void e(Context context, O2.b bVar) {
        Rect rect;
        b0 _windowInsetsCompat;
        WindowMetrics maximumWindowMetrics;
        Activity t5 = t(context);
        if (t5 != null) {
            m0.m.f11120a.getClass();
            int i2 = m0.n.f11121b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) t5.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                kotlin.jvm.internal.i.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = t5.getSystemService("window");
                kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService).getDefaultDisplay();
                kotlin.jvm.internal.i.d(display, "display");
                Point point = new Point();
                display.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                _windowInsetsCompat = (i3 >= 30 ? new S() : i3 >= 29 ? new Q() : new O()).b();
                kotlin.jvm.internal.i.d(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                _windowInsetsCompat = q0.a.f11663a.a(t5);
            }
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom;
            if (i6 > i8) {
                throw new IllegalArgumentException(o.h("Left must be less than or equal to right, left: ", i6, i8, ", right: ").toString());
            }
            if (i7 > i9) {
                throw new IllegalArgumentException(o.h("top must be less than or equal to bottom, top: ", i7, i9, ", bottom: ").toString());
            }
            kotlin.jvm.internal.i.e(_windowInsetsCompat, "_windowInsetsCompat");
            ((FlutterEngine) bVar).f10082a.updateDisplayMetrics(0, new Rect(i6, i7, i8, i9).width(), new Rect(i6, i7, i8, i9).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static I1.o f(Executor executor, Callable callable) {
        u.h(executor, "Executor must not be null");
        I1.o oVar = new I1.o();
        executor.execute(new A0.a(oVar, callable, 23, false));
        return oVar;
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final void i(L3.j jVar, String name, String value) {
        kotlin.jvm.internal.i.e(jVar, "<this>");
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        ArrayList arrayList = jVar.f1503a;
        arrayList.add(name);
        arrayList.add(B4.k.n0(value).toString());
    }

    public static final void j(AbstractC1286i abstractC1286i, String str) {
        EnumC1281d enumC1281d = EnumC1281d.f11151b;
        EnumC1289l enumC1289l = EnumC1289l.f11190b;
        new C1282e(abstractC1286i, abstractC1286i.f11178b, abstractC1286i.f11180d);
    }

    public static final double k(double d6, C4.c cVar, C4.c targetUnit) {
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        long convert = targetUnit.f402a.convert(1L, cVar.f402a);
        return convert > 0 ? d6 * convert : d6 / r8.convert(1L, r9);
    }

    public static final long l(long j2, C4.c sourceUnit, C4.c targetUnit) {
        kotlin.jvm.internal.i.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.i.e(targetUnit, "targetUnit");
        return targetUnit.f402a.convert(j2, sourceUnit.f402a);
    }

    public static final void m(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static boolean n(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean o2 = o(file, inputStream);
                h(inputStream);
                return o2;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean o(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static String p(C0212g c0212g) {
        StringBuilder sb = new StringBuilder(c0212g.size());
        for (int i2 = 0; i2 < c0212g.size(); i2++) {
            byte b6 = c0212g.b(i2);
            if (b6 == 34) {
                sb.append("\\\"");
            } else if (b6 == 39) {
                sb.append("\\'");
            } else if (b6 != 92) {
                switch (b6) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
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
                        if (b6 < 32 || b6 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b6 >>> 6) & 3) + 48));
                            sb.append((char) (((b6 >>> 3) & 7) + 48));
                            sb.append((char) ((b6 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b6);
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

    public static I1.o q(Exception exc) {
        I1.o oVar = new I1.o();
        oVar.j(exc);
        return oVar;
    }

    public static I1.o r(Object obj) {
        I1.o oVar = new I1.o();
        oVar.k(obj);
        return oVar;
    }

    public static ArrayList s(C1406b c1406b) {
        V2.a aVar;
        int i2 = 1;
        ArrayList arrayList = new ArrayList();
        for (C1429d c1429d : c1406b.f11723c) {
            C1480b c1480b = c1429d.f11935c;
            String str = c1429d.f11937e;
            if (str.isEmpty()) {
                str = null;
            }
            C0195a c0195a = AbstractC0197c.f3886a;
            L3.j jVar = new L3.j(i2);
            if (str == null) {
                str = null;
            }
            jVar.g(AbstractC1477a.w(c1480b.f12051c));
            C0195a a6 = AbstractC0197c.a(jVar.b(), str);
            for (t3.f fVar : c1429d.f11936d) {
                s3.h hVar = fVar.f11939c;
                String str2 = hVar.f11828c;
                int i3 = J3.a.f1351e;
                Q2.a w3 = AbstractC1477a.w(hVar.f11830e);
                String str3 = hVar.f11829d;
                if (str3.isEmpty()) {
                    str3 = null;
                }
                String str4 = fVar.f11941e;
                if (str4 == null) {
                    str4 = null;
                }
                J3.a a7 = J3.a.a(str2, str3, str4, w3);
                for (C1427b c1427b : fVar.f11940d) {
                    long j2 = c1427b.f11923c;
                    byte b6 = (byte) (((byte) i2) | 2);
                    for (W2.i iVar : W2.i.values()) {
                        if (iVar.f3418a == c1427b.f11925e.f11968a) {
                            s3.b bVar = c1427b.f11927g;
                            Q2.g c2 = bVar != null ? e5.g.c(bVar) : null;
                            Q2.a w5 = AbstractC1477a.w(c1427b.f11928h);
                            String b7 = c1427b.f11931k.b();
                            String b8 = c1427b.f11932l.b();
                            Y2.e eVar = Y2.e.f3689c[((byte) (c1427b.f11930j & KotlinVersion.MAX_COMPONENT_VALUE)) & 255];
                            Y2.b bVar2 = Y2.a.f3685a;
                            if (b8 != null) {
                                V2.a aVar2 = V2.a.f3225f;
                                if (b8.length() == 16 && !"0000000000000000".contentEquals(b8)) {
                                    char[] cArr = V2.f.f3240a;
                                    int length = b8.length();
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 < length) {
                                            if (!V2.f.f3242c[b8.charAt(i6)]) {
                                                break;
                                            }
                                            i6++;
                                        } else if (b7 != null && b7.length() == 32 && !"00000000000000000000000000000000".contentEquals(b7)) {
                                            int length2 = b7.length();
                                            for (int i7 = 0; i7 < length2; i7++) {
                                                if (V2.f.f3242c[b7.charAt(i7)]) {
                                                }
                                            }
                                            aVar = new V2.a(b7, b8, eVar, bVar2, true);
                                        }
                                    }
                                }
                            }
                            aVar = new V2.a("00000000000000000000000000000000", "0000000000000000", eVar, bVar2, false);
                            int size = w5.size() + c1427b.f11929i;
                            byte b9 = (byte) (b6 | 4);
                            if (b9 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((1 & b9) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b9 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b9 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new C1200a(a6, a7, j2, c1427b.f11924d, aVar, iVar, c1427b.f11926f, size, w5, c2, c1427b.f11933m));
                            i2 = 1;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    public static Activity t(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return t(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void u() {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
    }

    public static SharedPreferences v(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final int w(int i2, int i3, int i6) {
        if (i6 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i7 = i3 % i6;
            if (i7 < 0) {
                i7 += i6;
            }
            int i8 = i2 % i6;
            if (i8 < 0) {
                i8 += i6;
            }
            int i9 = (i7 - i8) % i6;
            if (i9 < 0) {
                i9 += i6;
            }
            return i3 - i9;
        }
        if (i6 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i10 = -i6;
        int i11 = i2 % i10;
        if (i11 < 0) {
            i11 += i10;
        }
        int i12 = i3 % i10;
        if (i12 < 0) {
            i12 += i10;
        }
        int i13 = (i11 - i12) % i10;
        if (i13 < 0) {
            i13 += i10;
        }
        return i3 + i13;
    }

    public static File x(Context context) {
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

    public static C0301c y(V0.j refHolder, SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.i.e(refHolder, "refHolder");
        kotlin.jvm.internal.i.e(sqLiteDatabase, "sqLiteDatabase");
        C0301c c0301c = (C0301c) refHolder.f3212b;
        if (c0301c != null && kotlin.jvm.internal.i.a(c0301c.f4870a, sqLiteDatabase)) {
            return c0301c;
        }
        C0301c c0301c2 = new C0301c(sqLiteDatabase);
        refHolder.f3212b = c0301c2;
        return c0301c2;
    }

    public static final void z(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = name.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                AbstractC0169a.b(16);
                String num = Integer.toString(charAt, 16);
                kotlin.jvm.internal.i.d(num, "toString(...)");
                if (num.length() < 2) {
                    num = CommonUrlParts.Values.FALSE_INTEGER.concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in header name: ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }
}
