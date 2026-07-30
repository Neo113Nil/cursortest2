package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3331hr implements InterfaceC3544lq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31274a;

    /* renamed from: b, reason: collision with root package name */
    public final C2781Sn f31275b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31276c;

    public C3331hr(C3922sr c3922sr, C2781Sn c2781Sn) {
        this.f31274a = 1;
        this.f31276c = c3922sr;
        this.f31275b = c2781Sn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lq
    public final C3598mq a(String str, JSONObject jSONObject) {
        C3598mq c3598mq;
        InterfaceC2669Md b9;
        switch (this.f31274a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap hashMap = (HashMap) this.f31276c;
                        c3598mq = (C3598mq) hashMap.get(str);
                        if (c3598mq == null) {
                            c3598mq = new C3598mq(this.f31275b.a(str, jSONObject), new BinderC2614Iq(), str);
                            hashMap.put(str, c3598mq);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c3598mq;
            default:
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31718l2)).booleanValue()) {
                    try {
                        b9 = this.f31275b.b(str);
                    } catch (RemoteException e6) {
                        int i = t2.C.f40822b;
                        u2.i.d("Coundn't create RTB adapter: ", e6);
                    }
                } else {
                    ConcurrentHashMap concurrentHashMap = ((C3922sr) this.f31276c).f34319a;
                    if (concurrentHashMap.containsKey(str)) {
                        b9 = (InterfaceC2669Md) concurrentHashMap.get(str);
                    }
                    b9 = null;
                }
                if (b9 == null) {
                    return null;
                }
                return new C3598mq(b9, new BinderC2597Hq(), str);
        }
    }

    public C3331hr(C2781Sn c2781Sn) {
        this.f31274a = 0;
        this.f31276c = new HashMap();
        this.f31275b = c2781Sn;
    }
}
