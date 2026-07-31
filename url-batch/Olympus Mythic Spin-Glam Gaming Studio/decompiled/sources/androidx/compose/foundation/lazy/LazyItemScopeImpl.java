package androidx.compose.foundation.lazy;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R4\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR4\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "<set-?>", "maxWidth$delegate", "Landroidx/compose/runtime/MutableState;", "getMaxWidth-D9Ej5fM", "()F", "setMaxWidth-0680j_4", "(F)V", "maxWidth", "maxHeight$delegate", "getMaxHeight-D9Ej5fM", "setMaxHeight-0680j_4", "maxHeight", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyItemScopeImpl implements LazyItemScope {

    /* renamed from: maxHeight$delegate, reason: from kotlin metadata */
    private final MutableState maxHeight;

    /* renamed from: maxWidth$delegate, reason: from kotlin metadata */
    private final MutableState maxWidth;

    public LazyItemScopeImpl() {
        Dp.Companion companion = Dp.INSTANCE;
        this.maxWidth = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m2505boximpl(companion.m2515getUnspecifiedD9Ej5fM()), null, 2, null);
        this.maxHeight = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m2505boximpl(companion.m2515getUnspecifiedD9Ej5fM()), null, 2, null);
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m405setMaxWidth0680j_4(float f) {
        this.maxWidth.setValue(Dp.m2505boximpl(f));
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m404setMaxHeight0680j_4(float f) {
        this.maxHeight.setValue(Dp.m2505boximpl(f));
    }
}
