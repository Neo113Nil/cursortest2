package F;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033o extends P0.i implements O0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033o(P p2, int i2) {
        super(0);
        this.f414f = i2;
        this.f415g = p2;
    }

    @Override // O0.a
    public final Object h() {
        switch (this.f414f) {
            case 0:
                return ((Y) this.f415g.f297n.a()).f328b;
            default:
                V v2 = this.f415g.f288e;
                File canonicalFile = ((File) v2.f313b.h()).getCanonicalFile();
                synchronized (V.f311d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = V.f310c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    P0.h.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new Y(canonicalFile, (k0) v2.f312a.j(canonicalFile), new U(0, canonicalFile));
        }
    }
}
