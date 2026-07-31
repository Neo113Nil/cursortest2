package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class Z1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f38592a;

    /* renamed from: b, reason: collision with root package name */
    public final J2 f38593b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38594c;

    public Z1(List list, J2 j22, List list2) {
        this.f38592a = list;
        this.f38593b = j22;
        this.f38594c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f38592a + ", mBackgroundRestrictionsState=" + this.f38593b + ", mAvailableProviders=" + this.f38594c + '}';
    }
}
