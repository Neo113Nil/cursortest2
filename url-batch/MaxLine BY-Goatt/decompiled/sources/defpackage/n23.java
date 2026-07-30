package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class n23 extends ti2 {
    public final /* synthetic */ Method a;

    public n23(Method method) {
        this.a = method;
    }

    @Override // defpackage.ti2
    public final Object i(Class cls) {
        ti2.a(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
