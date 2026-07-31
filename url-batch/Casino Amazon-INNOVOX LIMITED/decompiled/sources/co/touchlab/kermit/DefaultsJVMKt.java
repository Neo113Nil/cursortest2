package co.touchlab.kermit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultsJVM.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\"$\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"value", "", "defaultTag", "getDefaultTag", "()Ljava/lang/String;", "setDefaultTag", "(Ljava/lang/String;)V", "internalDefaultTag", "lock", "", "kermit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultsJVMKt {
    private static volatile String internalDefaultTag = "";
    private static final Object lock = new Object();

    public static final String getDefaultTag() {
        return internalDefaultTag;
    }

    public static final void setDefaultTag(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (lock) {
            internalDefaultTag = value;
            Unit unit = Unit.INSTANCE;
        }
    }
}
