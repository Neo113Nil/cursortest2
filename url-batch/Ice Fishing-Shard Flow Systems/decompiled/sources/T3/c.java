package T3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {
    public static final String IDENTITY_NAME_SPACE = "identity";

    public static final boolean hasOneSignalId(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return ((a) bVar.getModel()).hasProperty("onesignal_id");
    }
}
