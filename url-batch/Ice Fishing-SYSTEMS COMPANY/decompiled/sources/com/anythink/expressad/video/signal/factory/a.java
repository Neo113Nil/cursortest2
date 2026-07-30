package com.anythink.expressad.video.signal.factory;

import com.anythink.expressad.video.signal.a.d;
import com.anythink.expressad.video.signal.a.f;
import com.anythink.expressad.video.signal.c;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.video.signal.j;

/* loaded from: classes.dex */
public class a implements IJSFactory {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.a f22322a;

    /* renamed from: b, reason: collision with root package name */
    protected c f22323b;

    /* renamed from: c, reason: collision with root package name */
    protected j f22324c;

    /* renamed from: d, reason: collision with root package name */
    protected g f22325d;

    /* renamed from: e, reason: collision with root package name */
    protected e f22326e;

    /* renamed from: f, reason: collision with root package name */
    protected i f22327f;

    /* renamed from: g, reason: collision with root package name */
    protected com.anythink.expressad.video.signal.b f22328g;

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        if (this.f22322a == null) {
            this.f22322a = new com.anythink.expressad.video.signal.a.a();
        }
        return this.f22322a;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        if (this.f22327f == null) {
            this.f22327f = new f();
        }
        return this.f22327f;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.b getJSBTModule() {
        if (this.f22328g == null) {
            this.f22328g = new com.anythink.expressad.video.signal.a.b();
        }
        return this.f22328g;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public c getJSCommon() {
        if (this.f22323b == null) {
            this.f22323b = new com.anythink.expressad.video.signal.a.c();
        }
        return this.f22323b;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        if (this.f22326e == null) {
            this.f22326e = new d();
        }
        return this.f22326e;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        if (this.f22325d == null) {
            this.f22325d = new com.anythink.expressad.video.signal.a.e();
        }
        return this.f22325d;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        if (this.f22324c == null) {
            this.f22324c = new com.anythink.expressad.video.signal.a.g();
        }
        return this.f22324c;
    }
}
