package okio.internal;

import android.view.View;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManager$$ExternalSyntheticLambda0;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Object $fileOrDirectory;
    public final /* synthetic */ int $r8$classId;
    public Object $this_commonDeleteRecursively;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystem$commonDeleteRecursively$sequence$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_commonDeleteRecursively = obj;
        this.$fileOrDirectory = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$fileOrDirectory;
        switch (i) {
            case 0:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1((FileSystem) this.$this_commonDeleteRecursively, (Path) obj2, continuation, 0);
                fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$1;
            case 1:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$12 = new FileSystem$commonDeleteRecursively$sequence$1((CoroutineContext) this.$this_commonDeleteRecursively, (Function2) obj2, continuation, 1);
                fileSystem$commonDeleteRecursively$sequence$12.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$12;
            case 2:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$13 = new FileSystem$commonDeleteRecursively$sequence$1((Function0) obj2, continuation, 2);
                fileSystem$commonDeleteRecursively$sequence$13.$this_commonDeleteRecursively = obj;
                return fileSystem$commonDeleteRecursively$sequence$13;
            case 3:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$14 = new FileSystem$commonDeleteRecursively$sequence$1((PointerEventPass) this.$this_commonDeleteRecursively, (Ref$ObjectRef) obj2, continuation, 3);
                fileSystem$commonDeleteRecursively$sequence$14.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$14;
            case 4:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$15 = new FileSystem$commonDeleteRecursively$sequence$1((TextDragObserver) obj2, continuation, 4);
                fileSystem$commonDeleteRecursively$sequence$15.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$15;
            case 5:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$16 = new FileSystem$commonDeleteRecursively$sequence$1((SelectionManager) this.$this_commonDeleteRecursively, (SelectionManager$$ExternalSyntheticLambda0) obj2, continuation, 5);
                fileSystem$commonDeleteRecursively$sequence$16.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$16;
            default:
                FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$17 = new FileSystem$commonDeleteRecursively$sequence$1((TouchRecorder) this.$this_commonDeleteRecursively, (View) obj2, continuation, 6);
                fileSystem$commonDeleteRecursively$sequence$17.L$0 = obj;
                return fileSystem$commonDeleteRecursively$sequence$17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((FileSystem$commonDeleteRecursively$sequence$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                ((FileSystem$commonDeleteRecursively$sequence$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0272 A[Catch: CancellationException -> 0x0259, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0259, blocks: (B:139:0x0272, B:144:0x0280, B:152:0x0255, B:154:0x0260), top: B:130:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x022c -> B:100:0x022d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:7:0x0036). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x028a -> B:117:0x026c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x029d -> B:117:0x026c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00fa -> B:41:0x00fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01c1 -> B:63:0x01c5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem$commonDeleteRecursively$sequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileSystem$commonDeleteRecursively$sequence$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$fileOrDirectory = obj;
    }
}
