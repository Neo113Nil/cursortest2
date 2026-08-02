package K;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049m extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f800e;
    public final /* synthetic */ N f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0049m(N n3, int i3) {
        super(0);
        this.f800e = i3;
        this.f = n3;
    }

    @Override // l2.a
    public final Object invoke() {
        switch (this.f800e) {
            case 0:
                return ((W) this.f.f703j.a()).f730b;
            default:
                T t3 = this.f.f695a;
                File canonicalFile = ((File) t3.f717b.invoke()).getCanonicalFile();
                synchronized (T.f715d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = T.f714c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.j.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new W(canonicalFile, (h0) t3.f716a.invoke(canonicalFile), new S(0, canonicalFile));
        }
    }
}
