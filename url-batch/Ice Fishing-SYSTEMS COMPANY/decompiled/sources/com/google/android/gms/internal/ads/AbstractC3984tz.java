package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.ads.tz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3984tz implements InterfaceCallableC3930sz {

    /* renamed from: a, reason: collision with root package name */
    public final String f34502a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34503b;

    /* renamed from: c, reason: collision with root package name */
    public final C3391iz f34504c;

    /* renamed from: d, reason: collision with root package name */
    public final C3830r6 f34505d;

    /* renamed from: e, reason: collision with root package name */
    public final C4104wA f34506e;

    public AbstractC3984tz(String str, String str2, C3830r6 c3830r6, C3391iz c3391iz, C4104wA c4104wA) {
        this.f34502a = str;
        this.f34503b = str2;
        this.f34505d = c3830r6;
        this.f34504c = c3391iz;
        this.f34506e = c4104wA;
    }

    public abstract void a(Method method, C3830r6 c3830r6);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C4104wA c4104wA = this.f34506e;
        try {
            c4104wA.a();
            Method b9 = this.f34504c.b(this.f34502a, this.f34503b);
            if (b9 != null) {
                a(b9, this.f34505d);
            }
            c4104wA.c();
            return null;
        } finally {
        }
    }
}
