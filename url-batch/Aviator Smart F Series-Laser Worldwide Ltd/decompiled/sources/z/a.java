package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {
    private final c header;
    private final e parameter;
    private final f payload;

    public a() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ a copy$default(a aVar, e eVar, f fVar, c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            eVar = aVar.parameter;
        }
        if ((i8 & 2) != 0) {
            fVar = aVar.payload;
        }
        if ((i8 & 4) != 0) {
            cVar = aVar.header;
        }
        return aVar.copy(eVar, fVar, cVar);
    }

    public final e component1() {
        return this.parameter;
    }

    public final f component2() {
        return this.payload;
    }

    public final c component3() {
        return this.header;
    }

    public final a copy(e eVar, f fVar, c cVar) {
        return new a(eVar, fVar, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.areEqual(this.parameter, aVar.parameter) && s.areEqual(this.payload, aVar.payload) && s.areEqual(this.header, aVar.header);
    }

    public final c getHeader() {
        return this.header;
    }

    public final e getParameter() {
        return this.parameter;
    }

    public final f getPayload() {
        return this.payload;
    }

    public int hashCode() {
        e eVar = this.parameter;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        f fVar = this.payload;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        c cVar = this.header;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationBody(parameter=" + this.parameter + ", payload=" + this.payload + ", header=" + this.header + ')';
    }

    public a(e eVar) {
        this(eVar, null, null, 6, null);
    }

    public a(e eVar, f fVar) {
        this(eVar, fVar, null, 4, null);
    }

    public a(e eVar, f fVar, c cVar) {
        this.parameter = eVar;
        this.payload = fVar;
        this.header = cVar;
    }

    public /* synthetic */ a(e eVar, f fVar, c cVar, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? new e(null, null, null, 7, null) : eVar, (i8 & 2) != 0 ? null : fVar, (i8 & 4) != 0 ? null : cVar);
    }
}
