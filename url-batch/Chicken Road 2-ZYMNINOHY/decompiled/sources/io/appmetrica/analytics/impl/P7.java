package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* loaded from: classes.dex */
public abstract class P7 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10808a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtobufStateStorage f10809b;

    /* renamed from: c, reason: collision with root package name */
    public final R7 f10810c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0521bo f10811d;

    /* renamed from: e, reason: collision with root package name */
    public final Im f10812e;

    /* renamed from: f, reason: collision with root package name */
    public final Ui f10813f;

    /* renamed from: g, reason: collision with root package name */
    public final Si f10814g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1124z6 f10815h;

    /* renamed from: i, reason: collision with root package name */
    public Q7 f10816i;

    public P7(Context context, ProtobufStateStorage protobufStateStorage, R7 r7, InterfaceC0521bo interfaceC0521bo, Im im, Ui ui, Si si, InterfaceC1124z6 interfaceC1124z6, Q7 q7) {
        this.f10808a = context;
        this.f10809b = protobufStateStorage;
        this.f10810c = r7;
        this.f10811d = interfaceC0521bo;
        this.f10812e = im;
        this.f10813f = ui;
        this.f10814g = si;
        this.f10815h = interfaceC1124z6;
        this.f10816i = q7;
    }

    public final synchronized Q7 a() {
        return this.f10816i;
    }

    public final synchronized boolean b(T7 t7) {
        try {
            boolean z = false;
            if (t7.a() == S7.f10932b) {
                return false;
            }
            if (t7.equals(this.f10816i.b())) {
                return false;
            }
            List list = (List) this.f10811d.invoke(this.f10816i.a(), t7);
            boolean z4 = list != null;
            if (list == null) {
                list = this.f10816i.a();
            }
            if (this.f10810c.a(t7, this.f10816i.b())) {
                z = true;
            } else {
                t7 = (T7) this.f10816i.b();
            }
            if (z || z4) {
                Q7 q7 = this.f10816i;
                Q7 q72 = (Q7) this.f10812e.invoke(t7, list);
                this.f10816i = q72;
                this.f10809b.save(q72);
                AbstractC0619fj.a("Update distribution data: %s -> %s", q7, this.f10816i);
            }
            return z;
        } finally {
        }
    }

    public final synchronized T7 c() {
        try {
            if (!this.f10814g.a()) {
                T7 t7 = (T7) this.f10813f.invoke();
                this.f10814g.b();
                if (t7 != null) {
                    b(t7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T7) this.f10816i.b();
    }

    public final T7 a(T7 t7) {
        T7 c4;
        this.f10815h.a(this.f10808a);
        synchronized (this) {
            b(t7);
            c4 = c();
        }
        return c4;
    }

    public final T7 b() {
        this.f10815h.a(this.f10808a);
        return c();
    }
}
