package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ti extends p10 {
    public final HashMap j = new HashMap();

    @Override // defpackage.p10
    public final m10 a(Object obj) {
        return (m10) this.j.get(obj);
    }

    @Override // defpackage.p10
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
