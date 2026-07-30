package defpackage;

import java.io.File;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s60 extends o81 implements Function0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ i70 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s60(i70 i70Var, int i) {
        super(0);
        this.m = i;
        this.n = i70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
                return ((fl0) this.n.v.getValue()).b;
            default:
                cl0 cl0Var = this.n.m;
                File canonicalFile = ((File) cl0Var.b.invoke()).getCanonicalFile();
                synchronized (cl0.d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = cl0.c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new fl0(canonicalFile, (ll2) cl0Var.a.invoke(canonicalFile), new u(9, canonicalFile));
        }
    }
}
