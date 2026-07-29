package com.moat.analytics.mobile.tjy;

import android.util.Log;
import android.webkit.ValueCallback;

/* loaded from: classes2.dex */
class p implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f7295a;

    p(n nVar) {
        this.f7295a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (r6 == 50) goto L28;
     */
    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceiveValue(String str) {
        ap apVar;
        int i;
        int i2;
        String str2;
        ap apVar2;
        if (str != null && !str.equalsIgnoreCase("null") && !str.equalsIgnoreCase("false")) {
            if (str.equalsIgnoreCase("true")) {
                this.f7295a.e = -1;
                this.f7295a.e();
                return;
            }
            apVar2 = this.f7295a.f7293d;
            if (apVar2.b()) {
                Log.d("MoatJavaScriptBridge", "Received unusual value from Javascript:" + str);
                return;
            }
            return;
        }
        apVar = this.f7295a.f7293d;
        if (apVar.b()) {
            StringBuilder sb = new StringBuilder("Received value is:");
            if (str == null) {
                str2 = "null";
            } else {
                str2 = "(String)" + str;
            }
            sb.append(str2);
            Log.d("MoatJavaScriptBridge", sb.toString());
        }
        i = this.f7295a.e;
        if (i != -1) {
            i2 = this.f7295a.e;
        }
        this.f7295a.g();
        n.e(this.f7295a);
    }
}
