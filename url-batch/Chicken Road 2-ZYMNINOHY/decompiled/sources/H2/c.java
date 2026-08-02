package H2;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import t1.h;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1095a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1096b;

    public c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f1095a = context;
        this.f1096b = d.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r0.startsWith("http://") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h hVar) {
        Boolean bool;
        PackageManager packageManager;
        boolean hasSystemFeature;
        boolean z;
        Map map;
        d dVar = this.f1096b;
        boolean z4 = false;
        if (dVar.f1099b != null) {
            z = dVar.f1099b.booleanValue();
        } else {
            synchronized (dVar) {
                try {
                    if (dVar.f1099b != null) {
                        hasSystemFeature = dVar.f1099b.booleanValue();
                    } else {
                        if (dVar.b()) {
                            try {
                                packageManager = dVar.f1100c.getPackageManager();
                            } catch (SecurityException unused) {
                                bool = Boolean.FALSE;
                            } catch (Exception unused2) {
                                bool = Boolean.FALSE;
                            }
                            if (packageManager == null) {
                                dVar.f1099b = Boolean.FALSE;
                                z = false;
                            } else {
                                hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                dVar.f1099b = Boolean.valueOf(hasSystemFeature);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        dVar.f1099b = bool;
                        z = false;
                    }
                    z = hasSystemFeature;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z && (map = (Map) hVar.f15398b) != null) {
            String str = (String) map.get("verifierurl");
            String str2 = (String) ((Map) hVar.f15398b).get("version");
            if (str2 == null || str2.trim().isEmpty()) {
                str2 = "1.0";
            }
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            try {
                new URL(str);
                if (!str.startsWith("https://")) {
                }
                z4 = true;
            } catch (MalformedURLException unused3) {
            }
            if (z4) {
                try {
                    if (this.f1095a == null) {
                        return;
                    }
                    PrivacyPass.getInstance(this.f1095a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
                } catch (IllegalArgumentException | Exception unused4) {
                }
            }
        }
    }
}
