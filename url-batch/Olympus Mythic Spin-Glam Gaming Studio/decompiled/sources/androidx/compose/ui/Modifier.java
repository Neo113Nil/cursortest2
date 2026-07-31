package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Modifier.kt */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "Companion", "Element", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface Modifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    boolean all(Function1 predicate);

    Object foldIn(Object initial, Function2 operation);

    Object foldOut(Object initial, Function2 operation);

    default Modifier then(Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface Element extends Modifier {

        /* compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.ui.Modifier
        default Object foldIn(Object initial, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(initial, this);
        }

        @Override // androidx.compose.ui.Modifier
        default Object foldOut(Object initial, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(this, initial);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(Function1 predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return ((Boolean) predicate.invoke(this)).booleanValue();
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$Element;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "all", "(Lkotlin/jvm/functions/Function1;)Z", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1 predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public Object foldIn(Object initial, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public Object foldOut(Object initial, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        private Companion() {
        }

        public String toString() {
            return "Modifier";
        }
    }
}
