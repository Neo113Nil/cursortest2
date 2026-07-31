package com.digitalturbine.ignite.authenticator.decorator;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* loaded from: classes11.dex */
public abstract class f implements a {
    public final a a;
    public AuthenticationServiceListener b;

    public f(a aVar, AuthenticationServiceListener authenticationServiceListener) {
        this.a = aVar;
        this.b = authenticationServiceListener;
        aVar.b(this);
        aVar.a(this);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean a() {
        return this.a.a();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void b() {
        this.a.b();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean c() {
        return this.a.c();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public String d() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void destroy() {
        this.b = null;
        this.a.destroy();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final String e() {
        return this.a.e();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean f() {
        return this.a.f();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public Context g() {
        return this.a.g();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean h() {
        return this.a.h();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public String i() {
        return null;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public boolean j() {
        return false;
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public IIgniteServiceAPI k() {
        return this.a.k();
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void l() {
        this.a.l();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestFailed(String str) {
        this.a.onCredentialsRequestFailed(str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.a.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void a(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void b(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void c(String str) {
        AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public void a(ComponentName componentName, IBinder iBinder) {
        AuthenticationServiceListener authenticationServiceListener = this.b;
        if (authenticationServiceListener != null) {
            authenticationServiceListener.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void b(a aVar) {
        this.a.b(aVar);
    }

    @Override // com.digitalturbine.ignite.authenticator.decorator.a
    public final void a(a aVar) {
        this.a.a(aVar);
    }
}
