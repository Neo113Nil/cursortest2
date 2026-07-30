package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e {
    private final d ist;
    private final g streamtrans;
    private final h tts;

    public e() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ e copy$default(e eVar, g gVar, d dVar, h hVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = eVar.streamtrans;
        }
        if ((i8 & 2) != 0) {
            dVar = eVar.ist;
        }
        if ((i8 & 4) != 0) {
            hVar = eVar.tts;
        }
        return eVar.copy(gVar, dVar, hVar);
    }

    public final g component1() {
        return this.streamtrans;
    }

    public final d component2() {
        return this.ist;
    }

    public final h component3() {
        return this.tts;
    }

    public final e copy(g gVar, d dVar, h hVar) {
        return new e(gVar, dVar, hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.areEqual(this.streamtrans, eVar.streamtrans) && s.areEqual(this.ist, eVar.ist) && s.areEqual(this.tts, eVar.tts);
    }

    public final d getIst() {
        return this.ist;
    }

    public final g getStreamtrans() {
        return this.streamtrans;
    }

    public final h getTts() {
        return this.tts;
    }

    public int hashCode() {
        g gVar = this.streamtrans;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        d dVar = this.ist;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.tts;
        return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationParameter(streamtrans=" + this.streamtrans + ", ist=" + this.ist + ", tts=" + this.tts + ')';
    }

    public e(g gVar) {
        this(gVar, null, null, 6, null);
    }

    public e(g gVar, d dVar) {
        this(gVar, dVar, null, 4, null);
    }

    public e(g gVar, d dVar, h hVar) {
        this.streamtrans = gVar;
        this.ist = dVar;
        this.tts = hVar;
    }

    public /* synthetic */ e(g gVar, d dVar, h hVar, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? new g(null, null, 3, null) : gVar, (i8 & 2) != 0 ? new d(null, null, null, null, null, null, null, 127, null) : dVar, (i8 & 4) != 0 ? new h(null, null, 3, null) : hVar);
    }
}
