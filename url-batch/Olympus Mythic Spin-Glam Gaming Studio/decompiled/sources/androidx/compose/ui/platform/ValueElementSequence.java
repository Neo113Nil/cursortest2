package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: InspectableValue.kt */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/ValueElementSequence;", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "", "iterator", "()Ljava/util/Iterator;", "", "name", "", "value", "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "elements", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ValueElementSequence implements Sequence {
    private final List elements;

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return this.elements.iterator();
    }

    public final void set(String name, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.elements.add(new ValueElement(name, value));
    }
}
