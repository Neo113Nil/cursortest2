package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public interface sc0 {
    default pc0 b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default pc0 k(Class cls, qx qxVar) {
        return b(cls);
    }

    default pc0 r(gb gbVar, qx qxVar) {
        return k(gbVar.a(), qxVar);
    }
}
