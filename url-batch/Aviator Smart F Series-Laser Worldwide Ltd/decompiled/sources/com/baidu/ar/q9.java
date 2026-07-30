package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.IOfflineAuthenticator;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes.dex */
public class q9 implements IOfflineAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    public static volatile q9 f2977a;

    public static q9 a() {
        if (f2977a == null) {
            f2977a = new q9();
        }
        return f2977a;
    }

    @Override // com.baidu.ar.auth.IOfflineAuthenticator
    public boolean checkLicense(Context context, byte[] bArr) {
        com.baidu.ar.libloader.a.a(context, (ILibLoader.b) null);
        return ARAuth.checkOfflineLicenseAuth(context, bArr);
    }
}
