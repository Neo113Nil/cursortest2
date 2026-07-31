package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/gestures/DefaultTransformableState$transformScope$1", "Landroidx/compose/foundation/gestures/TransformScope;", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "", "transformBy-d-4ec7I", "(FJF)V", "transformBy", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultTransformableState$transformScope$1 implements TransformScope {
    final /* synthetic */ DefaultTransformableState this$0;

    @Override // androidx.compose.foundation.gestures.TransformScope
    /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
    public void mo225transformByd4ec7I(float zoomChange, long panChange, float rotationChange) {
        this.this$0.getOnTransformation().invoke(Float.valueOf(zoomChange), Offset.m1288boximpl(panChange), Float.valueOf(rotationChange));
    }
}
