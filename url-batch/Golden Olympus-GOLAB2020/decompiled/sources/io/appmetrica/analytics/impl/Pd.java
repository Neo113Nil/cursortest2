package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public abstract class Pd implements InterfaceC2528bo, InterfaceC2847o2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f38126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38127b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2895po f38128c;

    /* renamed from: d, reason: collision with root package name */
    public final W2 f38129d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f38130e = PublicLogger.getAnonymousInstance();

    public Pd(int i4, String str, InterfaceC2895po interfaceC2895po, W2 w22) {
        this.f38127b = i4;
        this.f38126a = str;
        this.f38128c = interfaceC2895po;
        this.f38129d = w22;
    }

    @NonNull
    public final C2555co a() {
        C2555co c2555co = new C2555co();
        c2555co.f38802b = this.f38127b;
        c2555co.f38801a = this.f38126a.getBytes();
        c2555co.f38804d = new C2608eo();
        c2555co.f38803c = new Cdo();
        return c2555co;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2528bo
    public abstract /* synthetic */ void a(@NonNull C2501ao c2501ao);

    @NonNull
    public final W2 b() {
        return this.f38129d;
    }

    @NonNull
    public final String c() {
        return this.f38126a;
    }

    @NonNull
    public final InterfaceC2895po d() {
        return this.f38128c;
    }

    public final int e() {
        return this.f38127b;
    }

    public final boolean f() {
        C2843no a4 = this.f38128c.a(this.f38126a);
        if (a4.f39527a) {
            return true;
        }
        this.f38130e.warning("Attribute " + this.f38126a + " of type " + ((String) Ln.f37933a.get(this.f38127b)) + " is skipped because " + a4.f39528b, new Object[0]);
        return false;
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.f38130e = publicLogger;
    }
}
