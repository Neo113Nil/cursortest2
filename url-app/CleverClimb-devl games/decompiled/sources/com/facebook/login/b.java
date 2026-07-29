package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient;
import java.util.Collection;

/* compiled from: DeviceLoginManager.java */
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f6258b;

    /* renamed from: a, reason: collision with root package name */
    private Uri f6259a;

    public static b a() {
        if (f6258b == null) {
            synchronized (b.class) {
                if (f6258b == null) {
                    f6258b = new b();
                }
            }
        }
        return f6258b;
    }

    public void a(Uri uri) {
        this.f6259a = uri;
    }

    public Uri b() {
        return this.f6259a;
    }

    @Override // com.facebook.login.f
    protected LoginClient.Request a(Collection<String> collection) {
        LoginClient.Request a2 = super.a(collection);
        Uri b2 = b();
        if (b2 != null) {
            a2.setDeviceRedirectUriString(b2.toString());
        }
        return a2;
    }
}
