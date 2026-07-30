package z;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: cn, reason: collision with root package name */
    @SerializedName("cn")
    private final l f17337cn;

    @SerializedName("ls")
    private final boolean isFinal;

    @SerializedName("seg_id")
    private final int segId;

    public j(int i8, l cn2, boolean z7) {
        s.checkNotNullParameter(cn2, "cn");
        this.segId = i8;
        this.f17337cn = cn2;
        this.isFinal = z7;
    }

    public static /* synthetic */ j copy$default(j jVar, int i8, l lVar, boolean z7, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = jVar.segId;
        }
        if ((i9 & 2) != 0) {
            lVar = jVar.f17337cn;
        }
        if ((i9 & 4) != 0) {
            z7 = jVar.isFinal;
        }
        return jVar.copy(i8, lVar, z7);
    }

    public final int component1() {
        return this.segId;
    }

    public final l component2() {
        return this.f17337cn;
    }

    public final boolean component3() {
        return this.isFinal;
    }

    public final j copy(int i8, l cn2, boolean z7) {
        s.checkNotNullParameter(cn2, "cn");
        return new j(i8, cn2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.segId == jVar.segId && s.areEqual(this.f17337cn, jVar.f17337cn) && this.isFinal == jVar.isFinal;
    }

    public final l getCn() {
        return this.f17337cn;
    }

    public final int getSegId() {
        return this.segId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.segId * 31) + this.f17337cn.hashCode()) * 31;
        boolean z7 = this.isFinal;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return hashCode + i8;
    }

    public final boolean isFinal() {
        return this.isFinal;
    }

    public String toString() {
        return "SmartAsrData(segId=" + this.segId + ", cn=" + this.f17337cn + ", isFinal=" + this.isFinal + ')';
    }
}
