package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class gb implements pf {

    /* renamed from: e, reason: collision with root package name */
    private static final int f16364e = 5;

    /* renamed from: f, reason: collision with root package name */
    private static gb f16365f;

    /* renamed from: a, reason: collision with root package name */
    private fb f16366a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f16367b;

    /* renamed from: c, reason: collision with root package name */
    private Thread f16368c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16369d;

    private gb(String str, ig igVar, JSONObject jSONObject) {
        this.f16369d = str;
        this.f16366a = new fb(igVar.a());
        this.f16367b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized gb a(String str, ig igVar, JSONObject jSONObject) {
        gb gbVar;
        synchronized (gb.class) {
            try {
                if (f16365f == null) {
                    f16365f = new gb(str, igVar, jSONObject);
                }
                gbVar = f16365f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gbVar;
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f16369d, d9.f15835D);
    }

    public boolean c() {
        Thread thread = this.f16368c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f16365f = null;
        fb fbVar = this.f16366a;
        if (fbVar != null) {
            fbVar.a();
            this.f16366a = null;
        }
    }

    private Thread b(oh ohVar, String str, int i4, int i5, Handler handler) {
        if (i4 <= 0) {
            i4 = this.f16367b.optInt("connectionTimeout", 5);
        }
        if (i5 <= 0) {
            i5 = this.f16367b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.f16367b.optBoolean(d9.f15839H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new db(ohVar, str, (int) timeUnit.toMillis(i4), (int) timeUnit.toMillis(i5), optBoolean, b()), handler);
    }

    public String a() {
        return this.f16369d;
    }

    private Thread a(db dbVar, Handler handler) {
        return new Thread(new qt(dbVar, handler));
    }

    @Override // com.ironsource.pf
    public void a(oh ohVar, String str) {
        int optInt = this.f16367b.optInt("connectionTimeout", 5);
        int optInt2 = this.f16367b.optInt("readTimeout", 5);
        boolean optBoolean = this.f16367b.optBoolean(d9.f15839H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a4 = a(new db(ohVar, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.f16366a);
        this.f16368c = a4;
        a4.start();
    }

    @Override // com.ironsource.pf
    public void a(oh ohVar, String str, int i4, int i5) {
        b(ohVar, str, i4, i5, this.f16366a).start();
    }

    @Override // com.ironsource.pf
    public void a(oh ohVar, String str, int i4, int i5, Handler handler) {
        b(ohVar, str, i4, i5, handler).start();
    }

    @Override // com.ironsource.pf
    public void a(qo qoVar) {
        this.f16366a.a(qoVar);
    }
}
