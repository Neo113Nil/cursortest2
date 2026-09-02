package K;

import java.io.File;
import java.util.LinkedHashSet;
import o3.InterfaceC1328a;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064m extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f1397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0064m(M m4, int i4) {
        super(0);
        this.f1396e = i4;
        this.f1397f = m4;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        switch (this.f1396e) {
            case 0:
                return ((U) this.f1397f.f1282j.a()).f1311b;
            default:
                Q q4 = this.f1397f.f1273a;
                File canonicalFile = ((File) q4.f1296b.invoke()).getCanonicalFile();
                synchronized (Q.f1294d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = Q.f1293c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new U(canonicalFile, (g0) q4.f1295a.invoke(canonicalFile), new G3.k(2, canonicalFile));
        }
    }
}
