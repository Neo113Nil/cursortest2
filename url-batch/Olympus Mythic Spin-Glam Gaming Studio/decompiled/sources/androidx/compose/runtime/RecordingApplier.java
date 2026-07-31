package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C4834q2;
import com.ironsource.mediationsdk.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PausableComposition.kt */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001)J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001b\u001a\u00020\u00042\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00040\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00028\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006¨\u0006*"}, d2 = {"Landroidx/compose/runtime/RecordingApplier;", "N", "Landroidx/compose/runtime/Applier;", "node", "", "down", "(Ljava/lang/Object;)V", "up", "()V", "", "index", "count", "remove", "(II)V", "from", "to", "move", "(III)V", "clear", C4834q2.p, "insertBottomUp", "(ILjava/lang/Object;)V", "insertTopDown", "Lkotlin/Function2;", "", "block", "value", "apply", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "Landroidx/collection/MutableIntList;", "operations", "Landroidx/collection/MutableIntList;", "Landroidx/collection/MutableObjectList;", d.k, "Landroidx/collection/MutableObjectList;", "current", "Ljava/lang/Object;", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RecordingApplier<N> implements Applier<N> {
    private Object current;
    private final MutableObjectList instances;
    private final MutableIntList operations;
    public static final int $stable = 8;

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object node) {
        this.operations.add(1);
        this.instances.add(node);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        this.operations.add(0);
    }

    @Override // androidx.compose.runtime.Applier
    public void remove(int index, int count) {
        this.operations.add(2);
        this.operations.add(index);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void move(int from, int to, int count) {
        this.operations.add(3);
        this.operations.add(from);
        this.operations.add(to);
        this.operations.add(count);
    }

    @Override // androidx.compose.runtime.Applier
    public void clear() {
        this.operations.add(4);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertBottomUp(int index, Object instance) {
        this.operations.add(5);
        this.operations.add(index);
        this.instances.add(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void insertTopDown(int index, Object instance) {
        this.operations.add(6);
        this.operations.add(index);
        this.instances.add(instance);
    }

    @Override // androidx.compose.runtime.Applier
    public void apply(Function2 block, Object value) {
        this.operations.add(7);
        this.instances.add(block);
        this.instances.add(value);
    }

    @Override // androidx.compose.runtime.Applier
    public void reuse() {
        this.operations.add(8);
    }
}
