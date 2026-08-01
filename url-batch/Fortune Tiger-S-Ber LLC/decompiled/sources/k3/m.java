package k3;

import android.animation.TimeInterpolator;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.s;
import androidx.emoji2.text.w;
import androidx.fragment.app.w0;
import androidx.lifecycle.h0;
import c3.y;
import f1.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k.j2;
import k0.m0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class m implements o0.f, m0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f2837f = 0;
    public static Method g = null;
    public static boolean h = true;

    /* renamed from: i, reason: collision with root package name */
    public static Field f2838i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f2839j;

    public static int B(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        if (i4 == 64) {
            return 6;
        }
        if (i4 == 128) {
            return 7;
        }
        if (i4 == 256) {
            return 8;
        }
        if (i4 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(w0.e("type needs to be >= FIRST and <= LAST, type=", i4));
    }

    public static boolean C(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return e1.a.a();
        }
        try {
            if (g == null) {
                f2837f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) g.invoke(null, Long.valueOf(f2837f))).booleanValue();
        } catch (Exception e4) {
            if (!(e4 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e4);
                return false;
            }
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean E(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean F(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static Typeface G(Configuration configuration, Typeface typeface) {
        int i4;
        int i5;
        int weight;
        int i6;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == Integer.MAX_VALUE) {
            return null;
        }
        i5 = configuration.fontWeightAdjustment;
        if (i5 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i6 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, d.k(i6 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    public static MappedByteBuffer H(Context context, Uri uri) {
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

    public static void I(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final boolean N(String str) {
        u2.c.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static String O(X509Certificate x509Certificate) {
        StringBuilder sb = new StringBuilder("sha256/");
        p3.i iVar = p3.i.f3029i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        u2.c.d(encoded, "publicKey.encoded");
        int length = encoded.length;
        int i4 = 0;
        m0.a.g(encoded.length, 0, length);
        l0.g.g(length, encoded.length);
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, length);
        u2.c.d(copyOfRange, "copyOfRange(...)");
        p3.i iVar2 = new p3.i(copyOfRange);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(copyOfRange, 0, iVar2.a());
        byte[] digest = messageDigest.digest();
        u2.c.b(digest);
        new p3.i(digest);
        byte[] bArr = p3.a.f3019a;
        u2.c.e(bArr, "map");
        byte[] bArr2 = new byte[((digest.length + 2) / 3) * 4];
        int length2 = digest.length - (digest.length % 3);
        int i5 = 0;
        while (i4 < length2) {
            byte b2 = digest[i4];
            int i6 = i4 + 2;
            byte b4 = digest[i4 + 1];
            i4 += 3;
            byte b5 = digest[i6];
            bArr2[i5] = bArr[(b2 & 255) >> 2];
            bArr2[i5 + 1] = bArr[((b2 & 3) << 4) | ((b4 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr2[i5 + 2] = bArr[((b4 & 15) << 2) | ((b5 & 255) >> 6)];
            i5 += 4;
            bArr2[i7] = bArr[b5 & 63];
        }
        int length3 = digest.length - length2;
        if (length3 == 1) {
            byte b6 = digest[i4];
            bArr2[i5] = bArr[(b6 & 255) >> 2];
            bArr2[i5 + 1] = bArr[(b6 & 3) << 4];
            bArr2[i5 + 2] = 61;
            bArr2[i5 + 3] = 61;
        } else if (length3 == 2) {
            int i8 = i4 + 1;
            byte b7 = digest[i4];
            byte b8 = digest[i8];
            bArr2[i5] = bArr[(b7 & 255) >> 2];
            bArr2[i5 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr2[i5 + 2] = bArr[(b8 & 15) << 2];
            bArr2[i5 + 3] = 61;
        }
        sb.append(new String(bArr2, b3.a.f967a));
        return sb.toString();
    }

    public static s0.b P(MappedByteBuffer mappedByteBuffer) {
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
                    s0.b bVar = new s0.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f2795d = duplicate;
                    bVar.f2793a = position;
                    int i9 = position - duplicate.getInt(position);
                    bVar.f2794b = i9;
                    bVar.c = ((ByteBuffer) bVar.f2795d).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int Q(Context context, int i4, int i5) {
        TypedValue X = d.X(context.getTheme(), i4);
        return (X == null || X.type != 16) ? i5 : X.data;
    }

    public static TimeInterpolator R(Context context, int i4, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!F(valueOf, "cubic-bezier") && !F(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (F(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return new PathInterpolator(y(split, 0), y(split, 1), y(split, 2), y(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!F(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            c0.e.b(p(substring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing ".concat(substring), e4);
        }
    }

    public static void S(View view, g2.j jVar) {
        y1.a aVar = jVar.g.f1844b;
        if (aVar == null || !aVar.f3613a) {
            return;
        }
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f4 += ((View) parent).getElevation();
        }
        g2.h hVar = jVar.g;
        if (hVar.f1851l != f4) {
            hVar.f1851l = f4;
            jVar.v();
        }
    }

    public static void T(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static void h(StringBuilder sb, Object obj, t2.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.b(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static void i(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static int j(Context context, String str) {
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
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, z.d.a(context)) : 1;
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

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float[] l(float[] fArr, int i4) {
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

    public static boolean m(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean n3 = n(file, inputStream);
                k(inputStream);
                return n3;
            } catch (Throwable th) {
                th = th;
                k(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean n(File file, InputStream inputStream) {
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
                    k(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            k(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static d o(int i4) {
        return i4 != 0 ? i4 != 1 ? new g2.l() : new g2.e() : new g2.l();
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
    public static c0.e[] p(String str) {
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
                                fArr = l(fArr2, i8);
                                i5 = 0;
                            } catch (NumberFormatException e4) {
                                throw new RuntimeException("error in parsing \"" + trim + "\"", e4);
                            }
                        }
                        arrayList.add(new c0.e(trim.charAt(i5), fArr));
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
            arrayList.add(new c0.e(str.charAt(i6), new float[0]));
        }
        return (c0.e[]) arrayList.toArray(new c0.e[i4]);
    }

    public static c0.e[] q(c0.e[] eVarArr) {
        c0.e[] eVarArr2 = new c0.e[eVarArr.length];
        for (int i4 = 0; i4 < eVarArr.length; i4++) {
            eVarArr2[i4] = new c0.e(eVarArr[i4]);
        }
        return eVarArr2;
    }

    public static View r(View view, int i4) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View findViewById = viewGroup.getChildAt(i5).findViewById(i4);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c3.j s(SSLSession sSLSession) {
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = n2.o.f2953f;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        c3.f c = c3.f.f1030b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        y A = d.A(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
        }
        if (peerCertificates != null) {
            list = d3.c.i(Arrays.copyOf(peerCertificates, peerCertificates.length));
            localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = d3.c.i(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new c3.j(A, c, list2, new h0(1, list));
        }
        list = list2;
        localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
        }
        return new c3.j(A, c, list2, new h0(1, list));
    }

    public static c3.o t(String str) {
        u2.c.e(str, "<this>");
        Matcher matcher = c3.o.c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        u2.c.d(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        u2.c.d(locale, "US");
        u2.c.d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        u2.c.d(group2, "typeSubtype.group(2)");
        u2.c.d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = c3.o.f1082d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                u2.c.d(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (b3.m.b0(group4, "'", false) && group4.endsWith("'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    u2.c.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new c3.o(str, (String[]) arrayList.toArray(new String[0]));
    }

    public static ColorStateList u(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList D;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (D = d.D(context, resourceId)) == null) ? typedArray.getColorStateList(i4) : D;
    }

    public static ColorStateList v(Context context, s sVar, int i4) {
        int resourceId;
        ColorStateList D;
        TypedArray typedArray = (TypedArray) sVar.c;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (D = d.D(context, resourceId)) == null) ? sVar.h(i4) : D;
    }

    public static Drawable w(Context context, int i4) {
        return j2.b().c(context, i4);
    }

    public static Drawable x(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable w3;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (w3 = w(context, resourceId)) == null) ? typedArray.getDrawable(i4) : w3;
    }

    public static float y(String[] strArr, int i4) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static File z(Context context) {
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

    public float A(View view) {
        if (h) {
            try {
                return z.a(view);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void J(Throwable th);

    public abstract View K(int i4);

    public abstract boolean L();

    public abstract void M(w wVar);

    public void U(View view, float f4) {
        if (h) {
            try {
                z.b(view, f4);
                return;
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
        view.setAlpha(f4);
    }

    public void V(View view, int i4) {
        if (!f2839j) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2838i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2839j = true;
        }
        Field field = f2838i;
        if (field != null) {
            try {
                f2838i.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void c() {
    }

    public void g() {
    }
}
