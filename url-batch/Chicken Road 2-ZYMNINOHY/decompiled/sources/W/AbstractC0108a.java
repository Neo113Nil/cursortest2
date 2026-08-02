package W;

import E.AbstractC0005f;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;
import v2.a0;

/* renamed from: W.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0108a {

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f3290a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3291b = new Object();

    public static String a(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f3291b) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace(IOUtils.LINE_SEPARATOR_UNIX, "\n  ") + '\n';
    }

    public static void b() {
        StringBuilder sb = new StringBuilder();
        v2.r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        boolean z = false;
        int i4 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i5 = i4 + 1;
            int e4 = v2.C.e(objArr.length, i5);
            if (e4 > objArr.length) {
                objArr = Arrays.copyOf(objArr, e4);
            }
            objArr[i4] = valueOf;
            z = true;
            i4 = i5;
        }
        if (z) {
            throw new C0115h(sb.toString(), v2.I.i(i4, objArr));
        }
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        v2.G g4 = v2.I.f15571b;
        throw new C0115h(str, a0.f15605e);
    }

    public static void d(String str, String str2) {
        synchronized (f3291b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f3291b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void f(String str, String str2, Throwable th) {
        synchronized (f3291b) {
            Log.e(str, a(str2, th));
        }
    }

    public static synchronized Executor g() {
        ExecutorService executorService;
        synchronized (AbstractC0108a.class) {
            try {
                if (f3290a == null) {
                    String str = J.f3263a;
                    f3290a = Executors.newSingleThreadExecutor(new H("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f3290a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public static String h(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            if (xmlPullParser.getAttributeName(i4).equals(str)) {
                return xmlPullParser.getAttributeValue(i4);
            }
        }
        return null;
    }

    public static int[] i(String str) {
        int i4;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i5 = indexOf4 + 2;
        if (i5 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i5) == '/') {
            i4 = str.indexOf(47, indexOf4 + 3);
            if (i4 == -1 || i4 > indexOf2) {
                i4 = indexOf2;
            }
        } else {
            i4 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i4;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static void j(String str, String str2) {
        synchronized (f3291b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean k(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean l(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        c("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        c("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        b();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void n(MediaFormat mediaFormat, String str, int i4) {
        if (i4 != -1) {
            mediaFormat.setInteger(str, i4);
        }
    }

    public static String o(StringBuilder sb, int i4, int i5) {
        int i6;
        int i7;
        if (i4 >= i5) {
            return sb.toString();
        }
        if (sb.charAt(i4) == '/') {
            i4++;
        }
        int i8 = i4;
        int i9 = i8;
        while (i8 <= i5) {
            if (i8 == i5) {
                i6 = i8;
            } else if (sb.charAt(i8) == '/') {
                i6 = i8 + 1;
            } else {
                i8++;
            }
            int i10 = i9 + 1;
            if (i8 == i10 && sb.charAt(i9) == '.') {
                sb.delete(i9, i6);
                i5 -= i6 - i9;
            } else {
                if (i8 == i9 + 2 && sb.charAt(i9) == '.' && sb.charAt(i10) == '.') {
                    i7 = sb.lastIndexOf("/", i9 - 2) + 1;
                    int i11 = i7 > i4 ? i7 : i4;
                    sb.delete(i11, i6);
                    i5 -= i6 - i11;
                } else {
                    i7 = i8 + 1;
                }
                i9 = i7;
            }
            i8 = i9;
        }
        return sb.toString();
    }

    public static String p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] i4 = i(str2);
        if (i4[0] != -1) {
            sb.append(str2);
            o(sb, i4[1], i4[2]);
            return sb.toString();
        }
        int[] i5 = i(str);
        if (i4[3] == 0) {
            sb.append((CharSequence) str, 0, i5[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (i4[2] == 0) {
            sb.append((CharSequence) str, 0, i5[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i6 = i4[1];
        if (i6 != 0) {
            int i7 = i5[0] + 1;
            sb.append((CharSequence) str, 0, i7);
            sb.append(str2);
            return o(sb, i4[1] + i7, i7 + i4[2]);
        }
        if (str2.charAt(i6) == '/') {
            sb.append((CharSequence) str, 0, i5[1]);
            sb.append(str2);
            int i8 = i5[1];
            return o(sb, i8, i4[2] + i8);
        }
        int i9 = i5[0] + 2;
        int i10 = i5[1];
        if (i9 >= i10 || i10 != i5[2]) {
            int lastIndexOf = str.lastIndexOf(47, i5[2] - 1);
            int i11 = lastIndexOf == -1 ? i5[1] : lastIndexOf + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return o(sb, i5[1], i11 + i4[2]);
        }
        sb.append((CharSequence) str, 0, i10);
        sb.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb.append(str2);
        int i12 = i5[1];
        return o(sb, i12, i4[2] + i12 + 1);
    }

    public static Uri q(String str, String str2) {
        return Uri.parse(p(str, str2));
    }

    public static void r(MediaFormat mediaFormat, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            mediaFormat.setByteBuffer(AbstractC0005f.j(i4, "csd-"), ByteBuffer.wrap((byte[]) list.get(i4)));
        }
    }

    public static void s(String str, String str2) {
        synchronized (f3291b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void t(String str, String str2, Throwable th) {
        synchronized (f3291b) {
            Log.w(str, a(str2, th));
        }
    }
}
