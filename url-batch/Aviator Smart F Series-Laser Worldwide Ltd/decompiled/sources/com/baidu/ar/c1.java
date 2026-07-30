package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.IAuthenticateCallback;
import com.baidu.ar.auth.IAuthenticator;
import com.baidu.ar.auth.IDuMixAuthCallback;
import com.baidu.ar.libloader.ILibLoader;
import java.util.List;

/* loaded from: classes.dex */
public class c1 implements IAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c1 f1880a;

    public class a implements IDuMixAuthCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f1881a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List[] f1882b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ IAuthenticateCallback f1883c;

        public a(c1 c1Var, Context context, List[] listArr, IAuthenticateCallback iAuthenticateCallback) {
            this.f1881a = context;
            this.f1882b = listArr;
            this.f1883c = iAuthenticateCallback;
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onAvailFeaturesUpdate(List<Integer> list) {
            this.f1882b[0] = list;
            IAuthenticateCallback iAuthenticateCallback = this.f1883c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onAvailFeaturesChanged(list);
            }
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onFeatureRejected(int i8) {
            IAuthenticateCallback iAuthenticateCallback = this.f1883c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onFeatureRejected(i8);
            }
        }

        @Override // com.baidu.ar.auth.IDuMixAuthCallback
        public void onResult(boolean z7) {
            if (z7) {
                ARAuth.doAuth(this.f1881a, null);
            } else {
                this.f1882b[0].clear();
            }
            IAuthenticateCallback iAuthenticateCallback = this.f1883c;
            if (iAuthenticateCallback != null) {
                iAuthenticateCallback.onResult(z7, this.f1882b[0]);
            }
        }
    }

    public static c1 a() {
        if (f1880a == null) {
            f1880a = new c1();
        }
        return f1880a;
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr) {
        init(context, bArr, null);
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void release() {
        ARAuth.release();
    }

    @Override // com.baidu.ar.auth.IAuthenticator
    public void init(Context context, byte[] bArr, IAuthenticateCallback iAuthenticateCallback) {
        com.baidu.ar.libloader.a.a(context, (ILibLoader.b) null);
        List[] listArr = new List[1];
        listArr[0] = ARAuth.checkAuth(context, bArr, new a(this, context, listArr, iAuthenticateCallback));
    }
}
