package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992u4 implements InterfaceC0604f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12800a;

    /* renamed from: b, reason: collision with root package name */
    public final C1070x4 f12801b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f12802c;

    public C0992u4(Context context, C1070x4 c1070x4, C0863p4 c0863p4) {
        this.f12800a = context;
        this.f12801b = c1070x4;
        this.f12802c = c0863p4.f12560c;
        c1070x4.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0604f4
    public final void a(P5 p5, C0863p4 c0863p4) {
        this.f12801b.a(c0863p4.f12559b);
        this.f12801b.a(p5, this);
    }

    public final C1070x4 b() {
        return this.f12801b;
    }

    public final Context c() {
        return this.f12800a;
    }

    public final ResultReceiver d() {
        return this.f12802c;
    }

    public final void a(S3 s32) {
        B6.a(this.f12802c, s32);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0604f4
    public final void a() {
        this.f12801b.b(this);
    }
}
