package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class CallableId {
    public static final Companion Companion = new Companion(null);
    public final Name callableName;
    public final FqName packageName;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        FqName.Companion.topLevel(SpecialNames.LOCAL);
    }

    public CallableId(FqName fqName, Name name) {
        fqName.getClass();
        name.getClass();
        this.packageName = fqName;
        this.callableName = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.packageName, callableId.packageName) && Intrinsics.areEqual(this.callableName, callableId.callableName);
    }

    public int hashCode() {
        return this.callableName.hashCode() + ((this.packageName.hashCode() + 527) * 961);
    }

    public String toString() {
        return StringsKt__StringsJVMKt.replace(this.packageName.asString(), '.', '/', false) + "/" + this.callableName;
    }
}
