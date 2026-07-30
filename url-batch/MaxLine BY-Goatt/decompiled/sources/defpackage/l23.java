package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l23 extends ti2 {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public l23(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.ti2
    public final Object i(Class cls) {
        ti2.a(cls);
        return this.a.invoke(this.b, cls);
    }
}
