package kotlin.reflect.jvm.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class FakeOverrideMembers {
    public final boolean containsInheritedStatics;
    public final boolean containsPackagePrivate;
    public final HashMap members;

    public FakeOverrideMembers(HashMap hashMap, boolean z, boolean z2) {
        this.members = hashMap;
        this.containsInheritedStatics = z;
        this.containsPackagePrivate = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakeOverrideMembers)) {
            return false;
        }
        FakeOverrideMembers fakeOverrideMembers = (FakeOverrideMembers) obj;
        return this.members.equals(fakeOverrideMembers.members) && this.containsInheritedStatics == fakeOverrideMembers.containsInheritedStatics && this.containsPackagePrivate == fakeOverrideMembers.containsPackagePrivate;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.containsPackagePrivate) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.members.hashCode() * 31, 31, this.containsInheritedStatics);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.members);
        sb.append(", containsInheritedStatics=");
        sb.append(this.containsInheritedStatics);
        sb.append(", containsPackagePrivate=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.containsPackagePrivate, ')');
    }
}
