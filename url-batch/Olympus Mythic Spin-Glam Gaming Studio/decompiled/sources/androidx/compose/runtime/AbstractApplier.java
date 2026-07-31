package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Applier.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "", "down", "up", "()V", "clear", "onClear", "Ljava/lang/Object;", "getRoot", "()Ljava/lang/Object;", "Landroidx/compose/runtime/Stack;", "stack", "Ljava/util/ArrayList;", "value", "current", "getCurrent", "setCurrent", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    private Object current;
    private final Object root;
    private final ArrayList stack = Stack.m1135constructorimpl$default(null, 1, null);

    protected abstract void onClear();

    public AbstractApplier(Object obj) {
        this.root = obj;
        this.current = obj;
    }

    public final Object getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.current;
    }

    protected void setCurrent(Object obj) {
        this.current = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public void down(Object node) {
        Stack.m1144pushimpl(this.stack, getCurrent());
        setCurrent(node);
    }

    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(Stack.m1143popimpl(this.stack));
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m1133clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }
}
