package P;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149n extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f2139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149n(Q q4, int i2) {
        super(0);
        this.f2138d = i2;
        this.f2139e = q4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f2138d) {
            case 0:
                return ((Z) this.f2139e.f2026r.getValue()).f2056b;
            default:
                File file = ((File) this.f2139e.f2017d.f2041a.invoke()).getCanonicalFile();
                synchronized (W.f2040c) {
                    String path = file.getAbsolutePath();
                    LinkedHashSet linkedHashSet = W.f2039b;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Intrinsics.checkNotNullExpressionValue(path, "path");
                    linkedHashSet.add(path);
                }
                Intrinsics.checkNotNullExpressionValue(file, "file");
                Intrinsics.checkNotNullParameter(file, "it");
                Intrinsics.checkNotNullParameter(file, "file");
                String filePath = file.getCanonicalFile().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
                Intrinsics.checkNotNullParameter(filePath, "filePath");
                return new Z(file, new l0(filePath), new V(0, file));
        }
    }
}
