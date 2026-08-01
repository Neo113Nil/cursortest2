package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class io extends jb0 {
    public final HashMap j = new HashMap();

    @Override // defpackage.jb0
    public final gb0 a(Object obj) {
        return (gb0) this.j.get(obj);
    }

    @Override // defpackage.jb0
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
