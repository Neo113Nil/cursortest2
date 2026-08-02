package io.appmetrica.analytics.impl;

import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f7114a;

    /* renamed from: b, reason: collision with root package name */
    public final F2 f7115b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7116c;

    public C0403c2(List list, F2 f22, List list2) {
        this.f7114a = list;
        this.f7115b = f22;
        this.f7116c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f7114a + ", mBackgroundRestrictionsState=" + this.f7115b + ", mAvailableProviders=" + this.f7116c + '}';
    }
}
