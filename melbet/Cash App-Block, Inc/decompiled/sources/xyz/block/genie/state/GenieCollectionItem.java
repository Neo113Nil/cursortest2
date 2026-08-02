package xyz.block.genie.state;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class GenieCollectionItem {
    public final Map fields;
    public final GenieIdValue identity;

    public GenieCollectionItem(Map map, GenieIdValue genieIdValue) {
        map.getClass();
        this.fields = map;
        this.identity = genieIdValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenieCollectionItem)) {
            return false;
        }
        GenieCollectionItem genieCollectionItem = (GenieCollectionItem) obj;
        return Intrinsics.areEqual(this.fields, genieCollectionItem.fields) && Intrinsics.areEqual(this.identity, genieCollectionItem.identity);
    }

    public final String getIdentityValue() {
        GenieIdValue genieIdValue = this.identity;
        if (genieIdValue == null) {
            return "";
        }
        String str = genieIdValue.server;
        if (str == null) {
            str = genieIdValue.local;
        }
        return str == null ? "" : str;
    }

    public final int hashCode() {
        int hashCode = this.fields.hashCode() * 31;
        GenieIdValue genieIdValue = this.identity;
        return hashCode + (genieIdValue == null ? 0 : genieIdValue.hashCode());
    }

    public final String toString() {
        return "GenieCollectionItem(fields=" + this.fields + ", identity=" + this.identity + ")";
    }
}
