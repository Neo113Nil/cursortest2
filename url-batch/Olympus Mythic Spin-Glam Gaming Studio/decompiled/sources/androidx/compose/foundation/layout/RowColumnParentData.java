package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "<init>", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getWeight", "()F", "setWeight", "(F)V", "Z", "getFill", "()Z", "setFill", "(Z)V", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RowColumnParentData {
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private float weight;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.weight), (Object) Float.valueOf(rowColumnParentData.weight)) && this.fill == rowColumnParentData.fill && Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Float.hashCode(this.weight) * 31;
        boolean z = this.fill;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        return i2 + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode());
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }

    public RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment) {
        this.weight = f;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnParentData(float f, boolean z, CrossAxisAlignment crossAxisAlignment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment);
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final void setCrossAxisAlignment(CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }
}
