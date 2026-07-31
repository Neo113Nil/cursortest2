package androidx.compose.runtime;

import com.ironsource.C4834q2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H&¢\u0006\u0004\b\u0018\u0010\u0005J5\u0010\u001c\u001a\u00020\u00032\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0005R\u0014\u0010!\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/Applier;", "N", "", "", "onBeginChanges", "()V", "onEndChanges", "node", "down", "(Ljava/lang/Object;)V", "up", "", "index", C4834q2.p, "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", "count", "remove", "(II)V", "from", "to", "move", "(III)V", "clear", "Lkotlin/Function2;", "block", "value", "apply", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "getCurrent", "()Ljava/lang/Object;", "current", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Applier<N> {

    /* compiled from: Applier.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void clear();

    void down(Object node);

    Object getCurrent();

    void insertBottomUp(int index, Object instance);

    void insertTopDown(int index, Object instance);

    void move(int from, int to, int count);

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }

    void remove(int index, int count);

    void up();

    default void apply(Function2 block, Object value) {
        block.invoke(getCurrent(), value);
    }

    default void reuse() {
        Object current = getCurrent();
        ComposeNodeLifecycleCallback composeNodeLifecycleCallback = current instanceof ComposeNodeLifecycleCallback ? (ComposeNodeLifecycleCallback) current : null;
        if (composeNodeLifecycleCallback != null) {
            composeNodeLifecycleCallback.onReuse();
        }
    }
}
