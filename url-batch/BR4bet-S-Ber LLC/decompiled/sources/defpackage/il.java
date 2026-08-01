package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class il extends e40 {
    public final HashMap j = new HashMap();

    @Override // defpackage.e40
    public final b40 a(Object obj) {
        return (b40) this.j.get(obj);
    }

    @Override // defpackage.e40
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.j.remove(obj);
        return b;
    }
}
