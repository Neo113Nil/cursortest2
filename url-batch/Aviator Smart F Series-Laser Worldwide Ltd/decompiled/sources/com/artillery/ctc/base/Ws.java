package com.artillery.ctc.base;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Ws {
    private final int bg;
    private final List<Cw> cw;
    private final int ed;

    public Ws(List<Cw> cw, int i8, int i9) {
        s.checkNotNullParameter(cw, "cw");
        this.cw = cw;
        this.bg = i8;
        this.ed = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ws copy$default(Ws ws, List list, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = ws.cw;
        }
        if ((i10 & 2) != 0) {
            i8 = ws.bg;
        }
        if ((i10 & 4) != 0) {
            i9 = ws.ed;
        }
        return ws.copy(list, i8, i9);
    }

    public final List<Cw> component1() {
        return this.cw;
    }

    public final int component2() {
        return this.bg;
    }

    public final int component3() {
        return this.ed;
    }

    public final Ws copy(List<Cw> cw, int i8, int i9) {
        s.checkNotNullParameter(cw, "cw");
        return new Ws(cw, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ws)) {
            return false;
        }
        Ws ws = (Ws) obj;
        return s.areEqual(this.cw, ws.cw) && this.bg == ws.bg && this.ed == ws.ed;
    }

    public final int getBg() {
        return this.bg;
    }

    public final List<Cw> getCw() {
        return this.cw;
    }

    public final int getEd() {
        return this.ed;
    }

    public int hashCode() {
        return (((this.cw.hashCode() * 31) + this.bg) * 31) + this.ed;
    }

    public String toString() {
        return "Ws(cw=" + this.cw + ", bg=" + this.bg + ", ed=" + this.ed + ')';
    }

    public /* synthetic */ Ws(List list, int i8, int i9, int i10, o oVar) {
        this(list, (i10 & 2) != 0 ? 0 : i8, (i10 & 4) != 0 ? 0 : i9);
    }
}
