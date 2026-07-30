package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wo extends pc0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ mp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo(mp mpVar, int i) {
        super(0);
        this.d = i;
        this.e = mpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((gy) this.e.n.getValue()).b;
            default:
                dy dyVar = this.e.d;
                File canonicalFile = ((File) dyVar.b.invoke()).getCanonicalFile();
                synchronized (dy.d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = dy.c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new gy(canonicalFile, (ua1) dyVar.a.invoke(canonicalFile), new ce(1, canonicalFile));
        }
    }
}
