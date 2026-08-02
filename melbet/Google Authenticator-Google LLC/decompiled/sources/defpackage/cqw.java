package defpackage;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class cqw {
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private static final fwm c = new fwm("LibraryVersion", (byte[]) null);
    public static final cqw a = new cqw();

    protected cqw() {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        InputStream inputStream;
        fwm fwmVar;
        oy.as(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.b;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        InputStream inputStream3 = null;
        try {
            try {
                inputStream = cqw.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            str2 = null;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                fwmVar = c;
                String ag = a.ag(str3, str, " version is ");
                if (fwmVar.T(2)) {
                    fwmVar.S(ag);
                }
            } else {
                fwmVar = c;
                String ah = a.ah(str, "Failed to get app version for libraryName: ");
                if (fwmVar.T(5)) {
                    Log.w("LibraryVersion", fwmVar.S(ah));
                }
            }
        } catch (IOException e2) {
            e = e2;
            str2 = str3;
            inputStream2 = inputStream;
            fwm fwmVar2 = c;
            String ah2 = a.ah(str, "Failed to get app version for libraryName: ");
            if (fwmVar2.T(6)) {
                Log.e("LibraryVersion", fwmVar2.S(ah2), e);
            }
            String str4 = str2;
            inputStream = inputStream2;
            str3 = str4;
            fwmVar = fwmVar2;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            this.b.put(str, str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
            if (inputStream3 != null) {
                a.r(inputStream3);
            }
            throw th;
        }
        if (inputStream != null) {
            a.r(inputStream);
        }
        if (str3 == null) {
            if (fwmVar.T(3)) {
                fwmVar.S(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        this.b.put(str, str3);
        return str3;
    }
}
