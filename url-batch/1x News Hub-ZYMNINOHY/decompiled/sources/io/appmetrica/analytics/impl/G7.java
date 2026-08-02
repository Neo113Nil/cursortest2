package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final Pa f6030a;

    /* renamed from: b, reason: collision with root package name */
    public String f6031b = "";

    public G7(Pa pa) {
        this.f6030a = pa;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.j.a(this.f6031b, str)) {
                return;
            }
            this.f6031b = str;
            this.f6030a.a(str, z);
        }
    }
}
