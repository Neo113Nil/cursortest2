package com.digitalturbine.ignite.authenticator;

import com.digitalturbine.ignite.authenticator.decorator.f;
import com.digitalturbine.ignite.authenticator.logger.ILogger;

/* loaded from: classes4.dex */
public abstract class IgniteManager implements com.digitalturbine.ignite.authenticator.listeners.api.a {
    public f a;
    public b b;

    public IgniteManager(ILogger iLogger, com.digitalturbine.ignite.authenticator.events.a aVar) {
        com.digitalturbine.ignite.authenticator.logger.a.b.a = iLogger;
        com.digitalturbine.ignite.authenticator.events.b.b.a = aVar;
    }

    public void authenticate() {
        com.digitalturbine.ignite.authenticator.utils.concurency.c.a.execute(new a(this));
    }

    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    public String getOdt() {
        b bVar = this.b;
        return bVar != null ? bVar.a : "";
    }

    public boolean isAuthenticated() {
        return this.a.h();
    }

    public boolean isConnected() {
        return this.a.a();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }
}
