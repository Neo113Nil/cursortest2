package I;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: I.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080o extends Q0.i implements P0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P f695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0080o(P p2, int i2) {
        super(0);
        this.f694f = i2;
        this.f695g = p2;
    }

    @Override // P0.a
    public final Object g() {
        switch (this.f694f) {
            case 0:
                return ((Y) this.f695g.f578n.a()).f609b;
            default:
                V v = this.f695g.f569e;
                File canonicalFile = ((File) v.f594b.g()).getCanonicalFile();
                synchronized (V.f592d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = V.f591c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Q0.h.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new Y(canonicalFile, (j0) v.f593a.i(canonicalFile), new U(0, canonicalFile));
        }
    }
}
