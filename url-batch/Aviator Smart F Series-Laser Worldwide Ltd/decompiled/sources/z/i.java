package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class i {
    private final Integer bit_depth;
    private final Integer channels;
    private final String encoding;
    private final Integer sample_rate;

    public i() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ i copy$default(i iVar, String str, Integer num, Integer num2, Integer num3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = iVar.encoding;
        }
        if ((i8 & 2) != 0) {
            num = iVar.sample_rate;
        }
        if ((i8 & 4) != 0) {
            num2 = iVar.channels;
        }
        if ((i8 & 8) != 0) {
            num3 = iVar.bit_depth;
        }
        return iVar.copy(str, num, num2, num3);
    }

    public final String component1() {
        return this.encoding;
    }

    public final Integer component2() {
        return this.sample_rate;
    }

    public final Integer component3() {
        return this.channels;
    }

    public final Integer component4() {
        return this.bit_depth;
    }

    public final i copy(String str, Integer num, Integer num2, Integer num3) {
        return new i(str, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.areEqual(this.encoding, iVar.encoding) && s.areEqual(this.sample_rate, iVar.sample_rate) && s.areEqual(this.channels, iVar.channels) && s.areEqual(this.bit_depth, iVar.bit_depth);
    }

    public final Integer getBit_depth() {
        return this.bit_depth;
    }

    public final Integer getChannels() {
        return this.channels;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final Integer getSample_rate() {
        return this.sample_rate;
    }

    public int hashCode() {
        String str = this.encoding;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sample_rate;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.channels;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bit_depth;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationTTSResult(encoding=" + this.encoding + ", sample_rate=" + this.sample_rate + ", channels=" + this.channels + ", bit_depth=" + this.bit_depth + ')';
    }

    public i(String str) {
        this(str, null, null, null, 14, null);
    }

    public i(String str, Integer num) {
        this(str, num, null, null, 12, null);
    }

    public i(String str, Integer num, Integer num2) {
        this(str, num, num2, null, 8, null);
    }

    public i(String str, Integer num, Integer num2, Integer num3) {
        this.encoding = str;
        this.sample_rate = num;
        this.channels = num2;
        this.bit_depth = num3;
    }

    public /* synthetic */ i(String str, Integer num, Integer num2, Integer num3, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? "raw" : str, (i8 & 2) != 0 ? 16000 : num, (i8 & 4) != 0 ? 1 : num2, (i8 & 8) != 0 ? 16 : num3);
    }
}
