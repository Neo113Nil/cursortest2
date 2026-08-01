package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class aj extends z00 {
    public final HashMap j = new HashMap();

    @Override // defpackage.z00
    public final w00 a(Object obj) {
        return (w00) this.j.get(obj);
    }

    @Override // defpackage.z00
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
