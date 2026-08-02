package xyz.block.genie.state;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class GenieIdValue {
    public final String local;
    public final String server;

    public GenieIdValue(String str, String str2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        this.server = str;
        this.local = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenieIdValue)) {
            return false;
        }
        GenieIdValue genieIdValue = (GenieIdValue) obj;
        return Intrinsics.areEqual(this.server, genieIdValue.server) && Intrinsics.areEqual(this.local, genieIdValue.local);
    }

    public final int hashCode() {
        String str = this.server;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.local;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("GenieIdValue(server=", this.server, ", local=", this.local, ")");
    }
}
