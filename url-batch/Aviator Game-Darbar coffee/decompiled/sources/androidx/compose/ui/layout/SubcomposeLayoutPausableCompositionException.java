package androidx.compose.ui.layout;

import androidx.collection.IntList;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "operations", "Landroidx/collection/IntList;", "slotId", "", "cause", "", "<init>", "(Landroidx/collection/IntList;Ljava/lang/Object;Ljava/lang/Throwable;)V", "operationsList", "", "", "message", "getMessage$annotations", "()V", "getMessage", "()Ljava/lang/String;", "ui"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class SubcomposeLayoutPausableCompositionException extends IllegalStateException {
    private final IntList operations;
    private final Object slotId;

    public static /* synthetic */ void getMessage$annotations() {
    }

    public SubcomposeLayoutPausableCompositionException(IntList intList, Object obj, Throwable th) {
        super(th);
        this.operations = intList;
        this.slotId = obj;
    }

    private final List<String> operationsList() {
        String str;
        List createListBuilder = CollectionsKt.createListBuilder();
        for (int i = this.operations._size - 1; i >= 0; i--) {
            int i2 = this.operations.get(i);
            int m6266constructorimpl = SLOperation.m6266constructorimpl(i2);
            if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6273getCancelPausedPrecompositionNjRlDlw())) {
                str = "CancelPausedPrecomposition";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6279getReuseForceSyncDeactivationNjRlDlw())) {
                str = "ReuseForceSyncDeactivation";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6280getReuseScheduleOutOfFrameDeactivationNjRlDlw())) {
                str = "ReuseScheduleOutOfFrameDeactivation";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6281getReuseSyncDeactivationNjRlDlw())) {
                str = "ReuseSyncDeactivation";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6278getReuseDeactivationViaHostNjRlDlw())) {
                str = "ReuseDeactivationViaHost";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6289getTookFromPrecomposeMapNjRlDlw())) {
                str = "TookFromPrecomposeMap";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6285getSubcomposeNjRlDlw())) {
                str = "Subcompose";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6287getSubcomposeNewNjRlDlw())) {
                str = "SubcomposeNew";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6288getSubcomposePausableNjRlDlw())) {
                str = "SubcomposePausable";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6286getSubcomposeForceReuseNjRlDlw())) {
                str = "SubcomposeForceReuse";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6274getDeactivateOutOfFrameNjRlDlw())) {
                str = "DeactivateOutOfFrame";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6275getDeactivateOutOfFrameCancelledNjRlDlw())) {
                str = "DeactivateOutOfFrameCancelled";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6283getSlotToReusedFromOnDeactivateNjRlDlw())) {
                str = "SlotToReusedFromOnDeactivate";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6284getSlotToReusedFromOnReuseNjRlDlw())) {
                str = "SlotToReusedFromOnReuse";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6282getReusedNjRlDlw())) {
                str = "Reused";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6277getResumePausedNjRlDlw())) {
                str = "ResumePaused";
            } else if (SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6276getPausePausedNjRlDlw())) {
                str = "PausePaused";
            } else {
                str = SLOperation.m6268equalsimpl0(m6266constructorimpl, SLOperation.INSTANCE.m6272getApplyPausedNjRlDlw()) ? "ApplyPaused" : "Unexpected " + i2;
            }
            createListBuilder.add(i + ": " + str);
        }
        return CollectionsKt.build(createListBuilder);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return StringsKt.trimMargin$default("\n            |slotid=" + this.slotId + ". Last operations:\n            |" + CollectionsKt.joinToString$default(operationsList(), "\n", null, null, 0, null, null, 62, null) + "\n            ", null, 1, null);
    }
}
