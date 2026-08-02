package com.stripe.android.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class ApiVersion {
    public static final ApiVersion INSTANCE = new ApiVersion(0, EmptySet.INSTANCE);
    public final Set betaCodes;
    public final String version;

    public ApiVersion(int i, Set set) {
        set.getClass();
        this.version = "2020-03-02";
        this.betaCodes = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiVersion)) {
            return false;
        }
        ApiVersion apiVersion = (ApiVersion) obj;
        return Intrinsics.areEqual(this.version, apiVersion.version) && Intrinsics.areEqual(this.betaCodes, apiVersion.betaCodes);
    }

    public final String getCode() {
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(this.version);
        Set set = this.betaCodes;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return CollectionsKt.joinToString$default(CollectionsKt.plus((Iterable) arrayList, (Collection) listOf), ";", null, null, 0, null, null, 62);
    }

    public final int hashCode() {
        return this.betaCodes.hashCode() + (this.version.hashCode() * 31);
    }

    public final String toString() {
        return "ApiVersion(version=" + this.version + ", betaCodes=" + this.betaCodes + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set set) {
        this(0, set);
        set.getClass();
    }
}
