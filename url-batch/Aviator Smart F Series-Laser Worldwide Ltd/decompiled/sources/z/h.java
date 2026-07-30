package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class h {
    private final i tts_results;
    private final String vcn;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ h copy$default(h hVar, String str, i iVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = hVar.vcn;
        }
        if ((i8 & 2) != 0) {
            iVar = hVar.tts_results;
        }
        return hVar.copy(str, iVar);
    }

    public final String component1() {
        return this.vcn;
    }

    public final i component2() {
        return this.tts_results;
    }

    public final h copy(String str, i iVar) {
        return new h(str, iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.areEqual(this.vcn, hVar.vcn) && s.areEqual(this.tts_results, hVar.tts_results);
    }

    public final i getTts_results() {
        return this.tts_results;
    }

    public final String getVcn() {
        return this.vcn;
    }

    public int hashCode() {
        String str = this.vcn;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        i iVar = this.tts_results;
        return hashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationTTS(vcn=" + this.vcn + ", tts_results=" + this.tts_results + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public h(String str, i iVar) {
        this.vcn = str;
        this.tts_results = iVar;
    }

    public /* synthetic */ h(String str, i iVar, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? "x2_catherine" : str, (i8 & 2) != 0 ? new i(null, null, null, null, 15, null) : iVar);
    }
}
