package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Hz implements InterfaceC3065cx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25491a;

    /* renamed from: b, reason: collision with root package name */
    public final C3619nA f25492b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25493c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25494d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25495e;

    public Hz(Context context, C3066cy c3066cy, C3619nA c3619nA) {
        this.f25491a = context;
        this.f25493c = c3066cy.R();
        this.f25494d = c3066cy.Y();
        this.f25495e = c3066cy.Z();
        this.f25492b = c3619nA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        String str;
        J3.a aVar;
        D6 d62;
        hashMap.put("v", this.f25493c);
        hashMap.put("t", new Throwable());
        try {
            aVar = (J3.a) hashMap.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (d62 = (D6) aVar.get(this.f25494d, TimeUnit.MILLISECONDS)) != null && d62.v0().length() > 1)) {
            str = d62.v0();
            if (str.equals("E")) {
                try {
                    J3.a aVar2 = (J3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
                    if (aVar2 != null) {
                        String str2 = (String) aVar2.get(this.f25495e, TimeUnit.MILLISECONDS);
                        if (!AbstractC3217fl.q(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            hashMap.put("int", str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        hashMap.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap c() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap d() {
        HashMap a9 = this.f25492b.a();
        a(a9);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap i() {
        HashMap b9 = this.f25492b.b(this.f25491a, null);
        a(b9);
        return b9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3065cx
    public final HashMap o() {
        HashMap c4 = this.f25492b.c();
        a(c4);
        return c4;
    }
}
