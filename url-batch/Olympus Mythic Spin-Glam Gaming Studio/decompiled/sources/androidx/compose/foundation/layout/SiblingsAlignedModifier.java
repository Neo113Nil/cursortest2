package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "WithAlignmentLine", "WithAlignmentLineBlock", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SiblingsAlignedModifier extends InspectorValueInfo implements ParentDataModifier {

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLineBlock;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "block", "Lkotlin/jvm/functions/Function1;", "getBlock", "()Lkotlin/jvm/functions/Function1;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WithAlignmentLineBlock extends SiblingsAlignedModifier {
        private final Function1 block;

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.Relative$foundation_layout_release(new AlignmentLineProvider.Block(this.block)));
            return rowColumnParentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLineBlock withAlignmentLineBlock = other instanceof WithAlignmentLineBlock ? (WithAlignmentLineBlock) other : null;
            if (withAlignmentLineBlock == null) {
                return false;
            }
            return Intrinsics.areEqual(this.block, withAlignmentLineBlock.block);
        }

        public int hashCode() {
            return this.block.hashCode();
        }

        public String toString() {
            return "WithAlignmentLineBlock(block=" + this.block + ')';
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/SiblingsAlignedModifier$WithAlignmentLine;", "Landroidx/compose/foundation/layout/SiblingsAlignedModifier;", "Landroidx/compose/ui/unit/Density;", "", "parentData", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class WithAlignmentLine extends SiblingsAlignedModifier {

        /* renamed from: alignmentLine, reason: from kotlin metadata and from toString */
        private final AlignmentLine line;

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData(0.0f, false, null, 7, null);
            }
            rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.INSTANCE.Relative$foundation_layout_release(new AlignmentLineProvider.Value(this.line)));
            return rowColumnParentData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            WithAlignmentLine withAlignmentLine = other instanceof WithAlignmentLine ? (WithAlignmentLine) other : null;
            if (withAlignmentLine == null) {
                return false;
            }
            return Intrinsics.areEqual(this.line, withAlignmentLine.line);
        }

        public int hashCode() {
            return this.line.hashCode();
        }

        public String toString() {
            return "WithAlignmentLine(line=" + this.line + ')';
        }
    }
}
