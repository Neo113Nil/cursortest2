package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* compiled from: Composer.kt */
@StabilityInferred
@InternalComposeApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/MovableContent;", "P", "", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "content", "Lkotlin/jvm/functions/Function3;", "getContent", "()Lkotlin/jvm/functions/Function3;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MovableContent<P> {
    private final Function3 content;

    public final Function3 getContent() {
        return this.content;
    }
}
