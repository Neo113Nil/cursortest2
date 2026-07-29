package com.youappi.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.logic.Logger;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.utils.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f9419a = g.a(c.class);

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f9421c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: b, reason: collision with root package name */
    private Logger f9420b = new Logger(this.f9421c);

    /* renamed from: d, reason: collision with root package name */
    private Handler f9422d = new Handler(Looper.getMainLooper());

    c() {
    }

    @Override // com.youappi.sdk.b
    public Context a() {
        this.f9420b.log(this.f9419a, "uninitialized logic manager has no context");
        return null;
    }

    @Override // com.youappi.sdk.b
    public <T extends BaseAd> T a(AdType adType, Class<T> cls, String str) {
        T t;
        Exception e;
        this.f9420b.log(this.f9419a, "uninitialized logic manager asked for creation of interface");
        try {
            t = cls.newInstance();
        } catch (Exception e2) {
            t = null;
            e = e2;
        }
        try {
            t.setAdUnitId(str);
            t.setAdImpl(new com.youappi.sdk.logic.impl.a(null, null, null, this.f9420b, this.f9422d));
        } catch (Exception e3) {
            e = e3;
            this.f9420b.log(6, this.f9419a, "Interface type error\n" + e.toString());
            return t;
        }
        return t;
    }

    @Override // com.youappi.sdk.b
    public void a(int i) {
        if (this.f9420b != null) {
            this.f9420b.setUserLogLevel(i);
        }
    }

    @Override // com.youappi.sdk.b
    public void a(BaseAd.a aVar) {
        this.f9420b.log(this.f9419a, "register for initialization callback should not happen");
    }

    @Override // com.youappi.sdk.b
    public void a(Logger.LogListener logListener) {
        this.f9420b.log(this.f9419a, "uninitialized logic manager setLogListener not possible");
    }

    @Override // com.youappi.sdk.b
    public void a(AdItem adItem) {
        this.f9420b.log(this.f9419a, "uninitialized logic manager onDoneWith not possible");
    }

    @Override // com.youappi.sdk.b
    public boolean a(AdItem adItem, BaseAd baseAd) {
        this.f9420b.log(this.f9419a, "uninitialized logic manager prepareInterfaceForDisplay not possible");
        return false;
    }

    @Override // com.youappi.sdk.b
    public BaseAd b(AdItem adItem) {
        this.f9420b.log(this.f9419a, "uninitialized logic manager retrieveInterfaceForDisplay not possible");
        return null;
    }

    @Override // com.youappi.sdk.b
    public void b() {
        this.f9421c.shutdownNow();
    }

    @Override // com.youappi.sdk.b
    public String d() {
        this.f9420b.log(this.f9419a, "uninitialized logic manager has no appToken");
        return null;
    }

    @Override // com.youappi.sdk.b
    public String e() {
        this.f9420b.log(this.f9419a, "uninitialized logic manager has no app id");
        return null;
    }

    @Override // com.youappi.sdk.b
    public Logger f() {
        return this.f9420b;
    }

    @Override // com.youappi.sdk.b
    public void g() {
        this.f9420b.log(this.f9419a, "uninitialized logic manager sendUserApps not possible");
    }

    @Override // com.youappi.sdk.b
    public boolean h() {
        this.f9420b.log(this.f9419a, "uninitialized logic manager isDeviceIdInitialized false");
        return false;
    }
}
