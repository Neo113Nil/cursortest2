package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class U7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2569db f38349a;

    /* renamed from: b, reason: collision with root package name */
    public String f38350b = "";

    public U7(InterfaceC2569db interfaceC2569db) {
        this.f38349a = interfaceC2569db;
    }

    public final void a(String str, boolean z4) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.f38350b, str)) {
                return;
            }
            this.f38350b = str;
            this.f38349a.a(str, z4);
        }
    }
}
