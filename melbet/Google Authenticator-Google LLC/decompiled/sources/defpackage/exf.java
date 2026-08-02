package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import android.system.Os;
import android.text.TextUtils;
import com.google.android.apps.authenticator2.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exf {
    public static volatile kbl a;
    private static volatile kae b;
    private static volatile kae c;
    private static volatile kae d;
    private static Method e;

    private exf() {
    }

    public static kae a() {
        kae kaeVar;
        kae kaeVar2 = b;
        if (kaeVar2 != null) {
            return kaeVar2;
        }
        synchronized (exf.class) {
            kaeVar = b;
            if (kaeVar == null) {
                kab c2 = kae.c();
                c2.c = kad.a;
                c2.d = kae.b("com.google.android.libraries.restore.osmigration.systemappapi.TargetService", "Handshake");
                c2.b();
                exd exdVar = exd.a;
                jkd jkdVar = knl.a;
                c2.a = new knk(exdVar);
                c2.b = new knk(exe.a);
                kaeVar = c2.a();
                b = kaeVar;
            }
        }
        return kaeVar;
    }

    public static kae b() {
        kae kaeVar;
        kae kaeVar2 = c;
        if (kaeVar2 != null) {
            return kaeVar2;
        }
        synchronized (exf.class) {
            kaeVar = c;
            if (kaeVar == null) {
                kab c2 = kae.c();
                c2.c = kad.a;
                c2.d = kae.b("com.google.android.libraries.restore.osmigration.systemappapi.TargetService", "ImportItem");
                c2.b();
                ewz ewzVar = ewz.a;
                jkd jkdVar = knl.a;
                c2.a = new knk(ewzVar);
                c2.b = new knk(exa.a);
                kaeVar = c2.a();
                c = kaeVar;
            }
        }
        return kaeVar;
    }

    public static kae c() {
        kae kaeVar;
        kae kaeVar2 = d;
        if (kaeVar2 != null) {
            return kaeVar2;
        }
        synchronized (exf.class) {
            kaeVar = d;
            if (kaeVar == null) {
                kab c2 = kae.c();
                c2.c = kad.a;
                c2.d = kae.b("com.google.android.libraries.restore.osmigration.systemappapi.TargetService", "ImportItemsDone");
                c2.b();
                exb exbVar = exb.a;
                jkd jkdVar = knl.a;
                c2.a = new knk(exbVar);
                c2.b = new knk(exc.a);
                kaeVar = c2.a();
                d = kaeVar;
            }
        }
        return kaeVar;
    }

    public static String d(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            openRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = openRawResource.read(bArr, 0, Math.min(i, 1024));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            openRawResource.close();
            try {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException("Failed to read license or metadata text.", e3);
        }
    }

    public static final /* synthetic */ exe e(jkj jkjVar) {
        jkp q = jkjVar.q();
        q.getClass();
        return (exe) q;
    }

    public static final void f(boolean z, jkj jkjVar) {
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        exe exeVar = (exe) jkjVar.b;
        exe exeVar2 = exe.a;
        exeVar.b |= 1;
        exeVar.c = z;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 14;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 25:
                return 27;
            case 26:
                return 28;
            case 27:
                return 29;
            default:
                return 0;
        }
    }

    public static final File h(Uri uri) {
        if (!uri.getScheme().equals("file")) {
            throw new fbd("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new fbd("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new fbd("Did not expect uri to have authority");
    }

    public static File i(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static void j(by byVar) {
        if (e == null) {
            try {
                Method declaredMethod = by.class.getDeclaredMethod("noteStateNotSaved", null);
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                t(e2);
            }
        }
        try {
            Method method = e;
            method.getClass();
            method.invoke(byVar, null);
        } catch (IllegalAccessException e3) {
            t(e3);
        } catch (InvocationTargetException e4) {
            t(e4);
        }
    }

    public static void k() {
        exu.a.a();
    }

    public static Uri l(Uri uri, String str) {
        return uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
    }

    public static hvi m(hvi hviVar) {
        return hti.f(hviVar, new gzg(null), huf.a);
    }

    public static final void n(fcw fcwVar, HashMap hashMap) {
        String a2 = fcwVar.a();
        hoq.C(!hashMap.containsKey(a2), "There is already a factory registered for the ID %s", a2);
        hashMap.put(a2, fcwVar);
    }

    public static void o(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static boolean p(bst bstVar) {
        return exu.a.b(bstVar);
    }

    public static final fwm q(StringBuilder sb, ArrayList arrayList) {
        return new fwm(sb.toString(), arrayList.toArray(new Object[arrayList.size()]));
    }

    public static IOException r(iyi iyiVar, Uri uri, IOException iOException, String str) {
        try {
            fbp fbpVar = new fbp();
            fbpVar.b();
            File file = (File) iyiVar.r(uri, fbpVar);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? v(file, iOException, str) : v(file, iOException, str) : file.canWrite() ? v(file, iOException, str) : v(file, iOException, str) : file.canRead() ? file.canWrite() ? v(file, iOException, str) : v(file, iOException, str) : file.canWrite() ? v(file, iOException, str) : v(file, iOException, str) : v(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static fcu s(String str, hvi hviVar, jll jllVar, jkd jkdVar, Executor executor, gzp gzpVar, iyi iyiVar) {
        return new fcu(new fcr(str, hviVar, new fcz(jllVar, jkdVar), executor, iyiVar, gzpVar, new gtg()), hnu.aJ(""), true);
    }

    private static void t(Throwable th) {
        throw new IllegalStateException("Could not access method FragmentManager#noteStateNotSaved", th);
    }

    private static IOException u(File file, IOException iOException, String str) {
        String concat;
        try {
            concat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                concat = concat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            concat = "Inoperable file:".concat(" failed");
        }
        return new IOException(concat, iOException);
    }

    private static IOException v(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? u(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? u(file, iOException, str) : u(file, iOException, str) : parentFile.canWrite() ? u(file, iOException, str) : u(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? u(file, iOException, str) : u(file, iOException, str) : parentFile.canWrite() ? u(file, iOException, str) : u(file, iOException, str) : u(file, iOException, str);
    }
}
