package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708j5 implements PermissionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final PermissionStrategy[] f12100a;

    public C0708j5(PermissionStrategy... permissionStrategyArr) {
        this.f12100a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.f12100a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f12100a) + ')';
    }
}
