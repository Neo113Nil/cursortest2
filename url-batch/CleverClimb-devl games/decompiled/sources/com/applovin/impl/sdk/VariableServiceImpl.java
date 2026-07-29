package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a, reason: collision with root package name */
    private final j f2890a;

    /* renamed from: c, reason: collision with root package name */
    private AppLovinVariableService.OnVariablesUpdateListener f2892c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f2893d;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f2891b = new AtomicBoolean();
    private final Object e = new Object();

    VariableServiceImpl(j jVar) {
        this.f2890a = jVar;
        String str = (String) jVar.a(com.applovin.impl.sdk.b.d.f3010d);
        if (com.applovin.impl.sdk.e.i.b(str)) {
            updateVariables(com.applovin.impl.sdk.e.f.a(str, jVar));
        }
    }

    private void a() {
        synchronized (this.e) {
            if (this.f2892c != null && this.f2893d != null) {
                final Bundle bundle = (Bundle) this.f2893d.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f2892c.onVariablesUpdate(bundle);
                    }
                });
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.f2890a.u().e("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            return z;
        }
        synchronized (this.e) {
            if (this.f2893d == null) {
                this.f2890a.u().e("AppLovinVariableService", "Unable to retrieve variable value, none retrieved from server yet. Please set a delegate to be notified when values are retrieved from the server.");
                return z;
            }
            return this.f2893d.getBoolean(str, z);
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f2892c = onVariablesUpdateListener;
        synchronized (this.e) {
            if (onVariablesUpdateListener != null) {
                try {
                    if (this.f2893d != null && this.f2891b.compareAndSet(false, true)) {
                        this.f2890a.u().a("AppLovinVariableService", "Setting initial listener");
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void updateVariables(JSONObject jSONObject) {
        this.f2890a.u().a("AppLovinVariableService", "Updating variables...");
        synchronized (this.e) {
            this.f2893d = com.applovin.impl.sdk.e.f.b(jSONObject);
            a();
            this.f2890a.a((com.applovin.impl.sdk.b.d<com.applovin.impl.sdk.b.d<String>>) com.applovin.impl.sdk.b.d.f3010d, (com.applovin.impl.sdk.b.d<String>) jSONObject.toString());
        }
    }
}
