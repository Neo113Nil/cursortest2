package com.appsflyer;

import android.content.Context;
import android.os.RemoteException;
import java.util.HashMap;

/* loaded from: classes.dex */
final class n implements com.android.a.a.c {

    /* renamed from: a, reason: collision with root package name */
    private com.android.a.a.a f3477a;

    /* renamed from: b, reason: collision with root package name */
    private r f3478b;

    n() {
    }

    protected final void a(Context context, r rVar) {
        this.f3478b = rVar;
        this.f3477a = com.android.a.a.a.a(context).a();
        try {
            this.f3477a.a(this);
        } catch (Exception e) {
            d.a("referrerClient -> startConnection", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0041  */
    @Override // com.android.a.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        com.android.a.a.d b2;
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        com.android.a.a.d dVar = null;
        switch (i) {
            case 0:
                try {
                    d.c("InstallReferrer connected");
                    b2 = this.f3477a.b();
                } catch (RemoteException e) {
                    e = e;
                }
                try {
                    this.f3477a.a();
                    dVar = b2;
                } catch (RemoteException e2) {
                    dVar = b2;
                    e = e2;
                    e.printStackTrace();
                    if (dVar != null) {
                    }
                    if (this.f3478b == null) {
                    }
                }
                break;
            case 1:
                d.e("InstallReferrer not supported");
                break;
            case 2:
                d.e("InstallReferrer not supported");
                break;
            default:
                d.e("responseCode not found.");
                break;
        }
        if (dVar != null) {
            if (dVar.a() != null) {
                hashMap.put("val", dVar.a());
            }
            hashMap.put("clk", Long.toString(dVar.b()));
            hashMap.put("install", Long.toString(dVar.c()));
        }
        if (this.f3478b == null) {
            this.f3478b.a(hashMap);
        }
    }

    @Override // com.android.a.a.c
    public final void a() {
        d.c("Install Referrer service disconnected");
    }
}
