package io.appmetrica.analytics.impl;

import java.util.List;

/* loaded from: classes.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f10970a;

    /* renamed from: b, reason: collision with root package name */
    public final C1068x2 f10971b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10972c;

    public T1(List list, C1068x2 c1068x2, List list2) {
        this.f10970a = list;
        this.f10971b = c1068x2;
        this.f10972c = list2;
    }

    public final String toString() {
        return "AppPermissionsState{mPermissionStateList=" + this.f10970a + ", mBackgroundRestrictionsState=" + this.f10971b + ", mAvailableProviders=" + this.f10972c + '}';
    }
}
