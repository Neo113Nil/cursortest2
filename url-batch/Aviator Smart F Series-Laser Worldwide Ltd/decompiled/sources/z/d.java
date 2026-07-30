package z;

import com.google.android.exoplayer2.C;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class d {
    private final String accent;
    private final String domain;
    private final Long eos;
    private final String language;
    private final Integer language_type;
    private final Integer nunum;
    private final Long vto;

    public d() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ d copy$default(d dVar, String str, String str2, String str3, Integer num, Long l8, Long l9, Integer num2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = dVar.accent;
        }
        if ((i8 & 2) != 0) {
            str2 = dVar.domain;
        }
        String str4 = str2;
        if ((i8 & 4) != 0) {
            str3 = dVar.language;
        }
        String str5 = str3;
        if ((i8 & 8) != 0) {
            num = dVar.language_type;
        }
        Integer num3 = num;
        if ((i8 & 16) != 0) {
            l8 = dVar.vto;
        }
        Long l10 = l8;
        if ((i8 & 32) != 0) {
            l9 = dVar.eos;
        }
        Long l11 = l9;
        if ((i8 & 64) != 0) {
            num2 = dVar.nunum;
        }
        return dVar.copy(str, str4, str5, num3, l10, l11, num2);
    }

    public final String component1() {
        return this.accent;
    }

    public final String component2() {
        return this.domain;
    }

    public final String component3() {
        return this.language;
    }

    public final Integer component4() {
        return this.language_type;
    }

    public final Long component5() {
        return this.vto;
    }

    public final Long component6() {
        return this.eos;
    }

    public final Integer component7() {
        return this.nunum;
    }

    public final d copy(String str, String str2, String str3, Integer num, Long l8, Long l9, Integer num2) {
        return new d(str, str2, str3, num, l8, l9, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.areEqual(this.accent, dVar.accent) && s.areEqual(this.domain, dVar.domain) && s.areEqual(this.language, dVar.language) && s.areEqual(this.language_type, dVar.language_type) && s.areEqual(this.vto, dVar.vto) && s.areEqual(this.eos, dVar.eos) && s.areEqual(this.nunum, dVar.nunum);
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Long getEos() {
        return this.eos;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getLanguage_type() {
        return this.language_type;
    }

    public final Integer getNunum() {
        return this.nunum;
    }

    public final Long getVto() {
        return this.vto;
    }

    public int hashCode() {
        String str = this.accent;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.domain;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.language_type;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l8 = this.vto;
        int hashCode5 = (hashCode4 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.eos;
        int hashCode6 = (hashCode5 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Integer num2 = this.nunum;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationIST(accent=" + this.accent + ", domain=" + this.domain + ", language=" + this.language + ", language_type=" + this.language_type + ", vto=" + this.vto + ", eos=" + this.eos + ", nunum=" + this.nunum + ')';
    }

    public d(String str) {
        this(str, null, null, null, null, null, null, 126, null);
    }

    public d(String str, String str2) {
        this(str, str2, null, null, null, null, null, 124, null);
    }

    public d(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, 120, null);
    }

    public d(String str, String str2, String str3, Integer num) {
        this(str, str2, str3, num, null, null, null, 112, null);
    }

    public d(String str, String str2, String str3, Integer num, Long l8) {
        this(str, str2, str3, num, l8, null, null, 96, null);
    }

    public d(String str, String str2, String str3, Integer num, Long l8, Long l9) {
        this(str, str2, str3, num, l8, l9, null, 64, null);
    }

    public d(String str, String str2, String str3, Integer num, Long l8, Long l9, Integer num2) {
        this.accent = str;
        this.domain = str2;
        this.language = str3;
        this.language_type = num;
        this.vto = l8;
        this.eos = l9;
        this.nunum = num2;
    }

    public /* synthetic */ d(String str, String str2, String str3, Integer num, Long l8, Long l9, Integer num2, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? "mandarin" : str, (i8 & 2) != 0 ? "ist_ed_open" : str2, (i8 & 4) != 0 ? "zh_cn" : str3, (i8 & 8) != 0 ? 1 : num, (i8 & 16) != 0 ? Long.valueOf(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) : l8, (i8 & 32) != 0 ? 60000L : l9, (i8 & 64) != 0 ? 0 : num2);
    }
}
