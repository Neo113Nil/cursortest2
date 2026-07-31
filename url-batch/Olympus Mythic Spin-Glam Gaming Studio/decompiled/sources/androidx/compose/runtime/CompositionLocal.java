package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CompositionLocal.kt */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0001\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/ValueHolder;", "defaultValueHolder", "Landroidx/compose/runtime/ValueHolder;", "getDefaultValueHolder$runtime", "()Landroidx/compose/runtime/ValueHolder;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CompositionLocal<T> {
    private final ValueHolder defaultValueHolder;

    public /* synthetic */ CompositionLocal(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    private CompositionLocal(Function0 function0) {
        this.defaultValueHolder = new LazyValueHolder(function0);
    }

    /* renamed from: getDefaultValueHolder$runtime, reason: from getter */
    public ValueHolder getDefaultValueHolder() {
        return this.defaultValueHolder;
    }
}
