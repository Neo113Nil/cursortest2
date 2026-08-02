package l1;

import android.content.Context;
import android.content.pm.PackageManager;
import b0.s;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements InterfaceC1104a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9938a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9939b;

    public c(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f9938a = context;
        this.f9939b = d.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        if (r0.startsWith("http://") == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(s sVar) {
        Boolean bool;
        PackageManager packageManager;
        boolean hasSystemFeature;
        boolean z;
        Map map;
        d dVar = this.f9939b;
        boolean z2 = false;
        if (dVar.f9942b != null) {
            z = dVar.f9942b.booleanValue();
        } else {
            synchronized (dVar) {
                try {
                    if (dVar.f9942b != null) {
                        hasSystemFeature = dVar.f9942b.booleanValue();
                    } else {
                        if (dVar.b()) {
                            try {
                                packageManager = dVar.f9943c.getPackageManager();
                            } catch (SecurityException unused) {
                                bool = Boolean.FALSE;
                            } catch (Exception unused2) {
                                bool = Boolean.FALSE;
                            }
                            if (packageManager == null) {
                                dVar.f9942b = Boolean.FALSE;
                                z = false;
                            } else {
                                hasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                dVar.f9942b = Boolean.valueOf(hasSystemFeature);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                        dVar.f9942b = bool;
                        z = false;
                    }
                    z = hasSystemFeature;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z && (map = (Map) sVar.f2544a) != null) {
            String str = (String) map.get("verifierurl");
            String str2 = (String) ((Map) sVar.f2544a).get("version");
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
                z2 = true;
            } catch (MalformedURLException unused3) {
            }
            if (z2) {
                try {
                    if (this.f9938a == null) {
                        return;
                    }
                    PrivacyPass.getInstance(this.f9938a).attest(new VerificationContext(Collections.singletonList(str)), (AttestAPICallback) null, str2);
                } catch (IllegalArgumentException | Exception unused4) {
                }
            }
        }
    }
}
