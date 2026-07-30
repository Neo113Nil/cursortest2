package z;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class k {

    @SerializedName("data")
    private final j data;

    @SerializedName("msg_type")
    private final String msgType;

    @SerializedName("res_type")
    private final String resType;

    public k(String msgType, String resType, j data) {
        s.checkNotNullParameter(msgType, "msgType");
        s.checkNotNullParameter(resType, "resType");
        s.checkNotNullParameter(data, "data");
        this.msgType = msgType;
        this.resType = resType;
        this.data = data;
    }

    public static /* synthetic */ k copy$default(k kVar, String str, String str2, j jVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = kVar.msgType;
        }
        if ((i8 & 2) != 0) {
            str2 = kVar.resType;
        }
        if ((i8 & 4) != 0) {
            jVar = kVar.data;
        }
        return kVar.copy(str, str2, jVar);
    }

    public final String component1() {
        return this.msgType;
    }

    public final String component2() {
        return this.resType;
    }

    public final j component3() {
        return this.data;
    }

    public final k copy(String msgType, String resType, j data) {
        s.checkNotNullParameter(msgType, "msgType");
        s.checkNotNullParameter(resType, "resType");
        s.checkNotNullParameter(data, "data");
        return new k(msgType, resType, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.areEqual(this.msgType, kVar.msgType) && s.areEqual(this.resType, kVar.resType) && s.areEqual(this.data, kVar.data);
    }

    public final j getData() {
        return this.data;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final String getResType() {
        return this.resType;
    }

    public int hashCode() {
        return (((this.msgType.hashCode() * 31) + this.resType.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "SmartAsrResponse(msgType=" + this.msgType + ", resType=" + this.resType + ", data=" + this.data + ')';
    }
}
