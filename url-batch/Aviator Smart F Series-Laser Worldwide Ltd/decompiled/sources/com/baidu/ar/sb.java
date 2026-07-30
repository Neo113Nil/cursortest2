package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.rb;

/* loaded from: classes.dex */
public class sb {

    /* renamed from: c, reason: collision with root package name */
    public static sb f3211c;

    /* renamed from: a, reason: collision with root package name */
    public rb f3212a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3213b = false;

    public sb(Context context) {
        this.f3212a = new rb(context);
    }

    public static synchronized sb a(Context context) {
        sb sbVar;
        synchronized (sb.class) {
            try {
                if (f3211c == null) {
                    f3211c = new sb(context);
                }
                sbVar = f3211c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sbVar;
    }

    public void b() {
        rb rbVar = this.f3212a;
        if (rbVar != null) {
            rbVar.b();
            this.f3213b = false;
        }
    }

    public void a() {
        try {
            b();
        } catch (Throwable unused) {
        }
        if (this.f3212a != null) {
            this.f3212a = null;
        }
        if (f3211c != null) {
            f3211c = null;
        }
        this.f3213b = false;
    }

    public void a(rb.a aVar) {
        rb rbVar = this.f3212a;
        if (rbVar != null) {
            rbVar.a(aVar);
            if (this.f3213b) {
                return;
            }
            try {
                this.f3212a.a();
                this.f3213b = true;
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void a(boolean z7) {
        rb rbVar = this.f3212a;
        if (rbVar != null) {
            rbVar.a(z7);
        }
    }
}
