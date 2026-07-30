package D;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: D.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o extends F0.j implements E0.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S f250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014o(S s2, int i2) {
        super(0);
        this.f249f = i2;
        this.f250g = s2;
    }

    @Override // E0.a
    public final Object d() {
        switch (this.f249f) {
            case 0:
                return ((a0) this.f250g.f135n.a()).f166b;
            default:
                X x2 = this.f250g.f126e;
                File canonicalFile = ((File) x2.f151b.d()).getCanonicalFile();
                synchronized (X.f149d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = X.f148c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    F0.i.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new a0(canonicalFile, (l0) x2.f150a.i(canonicalFile), new W(0, canonicalFile));
        }
    }
}
