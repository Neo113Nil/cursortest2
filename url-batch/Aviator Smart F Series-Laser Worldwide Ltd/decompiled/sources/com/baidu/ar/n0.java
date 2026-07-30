package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.AuthJni;
import com.baidu.ar.auth.IAuthenticateCallback;
import com.baidu.ar.auth.IAuthenticator;
import com.baidu.ar.libloader.ILibLoader;

/* loaded from: classes.dex */
public class n0 implements IAuthenticator {

    /* renamed from: e, reason: collision with root package name */
    public static volatile n0 f2834e;

    /* renamed from: a, reason: collision with root package name */
    public String f2835a;

    /* renamed from: b, reason: collision with root package name */
    public String f2836b;

    /* renamed from: c, reason: collision with root package name */
    public String f2837c;

    /* renamed from: d, reason: collision with root package name */
    public q0 f2838d;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f2839a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f2840b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IAuthenticateCallback f2841c;

        public a(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
            this.f2839a = context;
            this.f2840b = bArr;
            this.f2841c = iAuthenticateCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.a(this.f2839a, this.f2840b, this.f2841c);
        }
    }

    public n0(String str, String str2, String str3) {
        this.f2835a = str;
        this.f2836b = str2;
        this.f2837c = str3;
    }

    public static n0 a(String str, String str2, String str3) {
        if (f2834e == null) {
            f2834e = new n0(str, str2, str3);
        } else {
            f2834e.f2835a = str;
            f2834e.f2836b = str2;
            f2834e.f2837c = str3;
        }
        return f2834e;
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr) {
        init(context, bArr, null);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void release() {
        ARAuth.release();
    }

    public final void a(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        c1.a().init(context, bArr, iAuthenticateCallback);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        com.baidu.ar.libloader.a.a(context, (ILibLoader.b) null);
        ARAuth.setAuthLicense(bArr, this.f2835a, this.f2836b, this.f2837c);
        if (this.f2838d == null) {
            q0 q0Var = new q0("AsyncAuthenticator");
            this.f2838d = q0Var;
            q0Var.a();
        }
        AuthJni.init();
        this.f2838d.a(new a(context, bArr, iAuthenticateCallback));
    }
}
