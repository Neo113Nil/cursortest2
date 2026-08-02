package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099y7 {

    /* renamed from: a, reason: collision with root package name */
    public final Ia f13052a;

    /* renamed from: b, reason: collision with root package name */
    public String f13053b = "";

    public C1099y7(Ia ia) {
        this.f13052a = ia;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.i.a(this.f13053b, str)) {
                return;
            }
            this.f13053b = str;
            this.f13052a.a(str, z);
        }
    }
}
