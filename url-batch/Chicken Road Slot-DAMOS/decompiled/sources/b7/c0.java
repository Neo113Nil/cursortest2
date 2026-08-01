package b7;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f1257a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.d f1258b;

    public /* synthetic */ c0(a aVar, z6.d dVar) {
        this.f1257a = aVar;
        this.f1258b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c7.c0.k(this.f1257a, c0Var.f1257a) && c7.c0.k(this.f1258b, c0Var.f1258b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1257a, this.f1258b});
    }

    public final String toString() {
        c6.e eVar = new c6.e(this);
        eVar.e(this.f1257a, "key");
        eVar.e(this.f1258b, "feature");
        return eVar.toString();
    }
}
