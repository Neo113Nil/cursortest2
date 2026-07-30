package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b {
    private final String audio;
    private final String encoding;
    private final Integer sample_rate;
    private final Integer seq;
    private final Integer status;

    public b() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ b copy$default(b bVar, Integer num, String str, String str2, Integer num2, Integer num3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = bVar.sample_rate;
        }
        if ((i8 & 2) != 0) {
            str = bVar.encoding;
        }
        String str3 = str;
        if ((i8 & 4) != 0) {
            str2 = bVar.audio;
        }
        String str4 = str2;
        if ((i8 & 8) != 0) {
            num2 = bVar.seq;
        }
        Integer num4 = num2;
        if ((i8 & 16) != 0) {
            num3 = bVar.status;
        }
        return bVar.copy(num, str3, str4, num4, num3);
    }

    public final Integer component1() {
        return this.sample_rate;
    }

    public final String component2() {
        return this.encoding;
    }

    public final String component3() {
        return this.audio;
    }

    public final Integer component4() {
        return this.seq;
    }

    public final Integer component5() {
        return this.status;
    }

    public final b copy(Integer num, String str, String str2, Integer num2, Integer num3) {
        return new b(num, str, str2, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.areEqual(this.sample_rate, bVar.sample_rate) && s.areEqual(this.encoding, bVar.encoding) && s.areEqual(this.audio, bVar.audio) && s.areEqual(this.seq, bVar.seq) && s.areEqual(this.status, bVar.status);
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getEncoding() {
        return this.encoding;
    }

    public final Integer getSample_rate() {
        return this.sample_rate;
    }

    public final Integer getSeq() {
        return this.seq;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.sample_rate;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.encoding;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.audio;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.seq;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.status;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationData(sample_rate=" + this.sample_rate + ", encoding=" + this.encoding + ", audio=" + this.audio + ", seq=" + this.seq + ", status=" + this.status + ')';
    }

    public b(Integer num) {
        this(num, null, null, null, null, 30, null);
    }

    public b(Integer num, String str) {
        this(num, str, null, null, null, 28, null);
    }

    public b(Integer num, String str, String str2) {
        this(num, str, str2, null, null, 24, null);
    }

    public b(Integer num, String str, String str2, Integer num2) {
        this(num, str, str2, num2, null, 16, null);
    }

    public b(Integer num, String str, String str2, Integer num2, Integer num3) {
        this.sample_rate = num;
        this.encoding = str;
        this.audio = str2;
        this.seq = num2;
        this.status = num3;
    }

    public /* synthetic */ b(Integer num, String str, String str2, Integer num2, Integer num3, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? 16000 : num, (i8 & 2) != 0 ? "raw" : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : num2, (i8 & 16) == 0 ? num3 : null);
    }
}
