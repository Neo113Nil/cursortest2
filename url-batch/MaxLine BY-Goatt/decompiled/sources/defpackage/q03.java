package defpackage;

import java.lang.reflect.Field;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q03 implements PrivilegedAction {
    public final /* synthetic */ Field a;

    public q03(Field field) {
        this.a = field;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        this.a.setAccessible(true);
        return null;
    }
}
