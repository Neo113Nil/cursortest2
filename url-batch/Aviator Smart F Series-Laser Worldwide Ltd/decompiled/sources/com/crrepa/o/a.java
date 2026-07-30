package com.crrepa.o;

import com.crrepa.ble.util.BleLog;
import com.crrepa.l0.g;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private g f13464a;

    /* renamed from: b, reason: collision with root package name */
    private com.crrepa.l0.b f13465b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13466a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a c() {
        return b.f13466a;
    }

    public g a() {
        if (this.f13464a != null) {
            BleLog.d("FileTransInitiatorManager: " + this.f13464a.getClass().getName());
        }
        return this.f13464a;
    }

    public com.crrepa.l0.b b() {
        return this.f13465b;
    }

    public void a(com.crrepa.l0.b bVar) {
        this.f13465b = bVar;
    }

    public void a(g gVar) {
        this.f13464a = gVar;
    }
}
