package r3;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class c {
    public static final String IDENTITY_NAME_SPACE = "identity";

    public static final boolean hasOneSignalId(b bVar) {
        i.e(bVar, "<this>");
        return ((C0617a) bVar.getModel()).hasProperty("onesignal_id");
    }
}
