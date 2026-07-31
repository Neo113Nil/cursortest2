package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ox2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9863a;

    /* renamed from: b, reason: collision with root package name */
    private long f9864b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9865c = false;

    /* renamed from: l, reason: collision with root package name */
    private int f9874l = 2;

    /* renamed from: m, reason: collision with root package name */
    private int f9875m = 2;

    /* renamed from: d, reason: collision with root package name */
    private int f9866d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f9867e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f9868f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f9869g = "";

    /* renamed from: h, reason: collision with root package name */
    private final String f9870h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f9871i = "";

    /* renamed from: j, reason: collision with root package name */
    private boolean f9872j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f9873k = false;

    private ox2(Context context, int i7) {
        this.f9863a = context;
    }

    public static ox2 p(Context context, int i7, int i8, kv kvVar) {
        ox2 ox2Var = qx2.b() ? new ox2(context, 7) : null;
        if (ox2Var == null) {
            return null;
        }
        ox2Var.h();
        ox2Var.q(i8);
        String str = kvVar.f7658u;
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) sw.c().b(m10.w6), str)) {
                ox2Var.f(kvVar.f7658u);
            }
        }
        return ox2Var;
    }

    public final synchronized ox2 c(cv cvVar) {
        IBinder iBinder = cvVar.f3958j;
        if (iBinder == null) {
            return this;
        }
        oa1 oa1Var = (oa1) iBinder;
        String f7 = oa1Var.f();
        if (!TextUtils.isEmpty(f7)) {
            this.f9867e = f7;
        }
        String d7 = oa1Var.d();
        if (!TextUtils.isEmpty(d7)) {
            this.f9868f = d7;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r2.f9868f = r0.Y;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ox2 d(cs2 cs2Var) {
        if (!TextUtils.isEmpty(cs2Var.f3934b.f12947b)) {
            this.f9867e = cs2Var.f3934b.f12947b;
        }
        Iterator<rr2> it = cs2Var.f3933a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rr2 next = it.next();
            if (!TextUtils.isEmpty(next.Y)) {
                break;
            }
        }
        return this;
    }

    public final synchronized ox2 e(String str) {
        this.f9869g = str;
        return this;
    }

    public final synchronized ox2 f(String str) {
        this.f9871i = str;
        return this;
    }

    public final synchronized ox2 g(boolean z6) {
        this.f9865c = z6;
        return this;
    }

    public final synchronized ox2 h() {
        Configuration configuration;
        y2.t.q();
        this.f9866d = a3.g2.c(this.f9863a);
        Resources resources = this.f9863a.getResources();
        int i7 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i7 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f9875m = i7;
        this.f9864b = y2.t.a().b();
        this.f9873k = true;
        return this;
    }

    public final synchronized px2 i() {
        if (this.f9872j) {
            return null;
        }
        this.f9872j = true;
        if (!this.f9873k) {
            h();
        }
        return new px2(this);
    }

    public final synchronized ox2 q(int i7) {
        this.f9874l = i7;
        return this;
    }
}
