package kotlin.reflect.jvm.internal.impl.incremental.components;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final Position NO_POSITION = new Position(-1, -1);
    public final int column;
    public final int line;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Position getNO_POSITION() {
            return Position.NO_POSITION;
        }
    }

    public Position(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.line == position.line && this.column == position.column;
    }

    public int hashCode() {
        return Integer.hashCode(this.column) + (Integer.hashCode(this.line) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Position(line=");
        sb.append(this.line);
        sb.append(", column=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.column, ')');
    }
}
