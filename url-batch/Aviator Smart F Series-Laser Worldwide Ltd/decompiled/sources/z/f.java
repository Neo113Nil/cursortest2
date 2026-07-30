package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f {
    private final b data;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ f copy$default(f fVar, b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bVar = fVar.data;
        }
        return fVar.copy(bVar);
    }

    public final b component1() {
        return this.data;
    }

    public final f copy(b bVar) {
        return new f(bVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && s.areEqual(this.data, ((f) obj).data);
    }

    public final b getData() {
        return this.data;
    }

    public int hashCode() {
        b bVar = this.data;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public String toString() {
        return "SimultaneousInterpretationPayload(data=" + this.data + ')';
    }

    public f(b bVar) {
        this.data = bVar;
    }

    public /* synthetic */ f(b bVar, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? null : bVar);
    }
}
