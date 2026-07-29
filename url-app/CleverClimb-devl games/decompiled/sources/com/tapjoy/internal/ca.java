package com.tapjoy.internal;

import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class ca {

    /* renamed from: a, reason: collision with root package name */
    public static ExecutorService f7878a;

    /* renamed from: b, reason: collision with root package name */
    public static cd f7879b;

    /* renamed from: c, reason: collision with root package name */
    private Future f7880c;

    public abstract Object a(URI uri, InputStream inputStream);

    public abstract String b();

    public abstract String c();

    public String d() {
        return null;
    }

    public Map a() {
        return Collections.emptyMap();
    }

    public Map e() {
        return new LinkedHashMap();
    }

    public Object f() {
        return f7879b.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0015, B:15:0x0022, B:16:0x002b), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0015, B:15:0x0022, B:16:0x002b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(@Nullable cf cfVar, ExecutorService executorService) {
        boolean z;
        if (this.f7880c != null && !this.f7880c.isDone()) {
            z = false;
            if (!z) {
                this.f7880c = executorService.submit(new cc(this, cfVar));
            } else {
                throw new IllegalStateException(String.valueOf("Call has not completed"));
            }
        }
        z = true;
        if (!z) {
        }
    }
}
