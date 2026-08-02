package radiography;

import android.view.View;
import android.view.ViewGroup;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import papa.SafeTrace;
import radiography.ScannableView;
import radiography.internal.ComposeViewsKt;
import radiography.internal.ComposeViewsKt$getComposeScannableViews$scannableViews$1;

/* loaded from: classes9.dex */
public final class ScannableViewKt$scannableChildren$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ View $this_scannableChildren;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScannableViewKt$scannableChildren$1(View view, Continuation continuation) {
        super(2, continuation);
        this.$this_scannableChildren = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScannableViewKt$scannableChildren$1 scannableViewKt$scannableChildren$1 = new ScannableViewKt$scannableChildren$1(this.$this_scannableChildren, continuation);
        scannableViewKt$scannableChildren$1.L$0 = obj;
        return scannableViewKt$scannableChildren$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScannableViewKt$scannableChildren$1) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x00ee -> B:6:0x00f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        Object yieldAll;
        boolean z;
        int childCount;
        SequenceScope sequenceScope = (SequenceScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        List list = null;
        View view = this.$this_scannableChildren;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lazy lazy = ComposeViewsKt.isComposeAvailable$delegate;
            view.getClass();
            if (StringsKt.contains((CharSequence) view.getClass().getName(), (CharSequence) "AndroidComposeView", false)) {
                try {
                    Sequence tryGetLayoutInfos = ComposeViewsKt.tryGetLayoutInfos(view);
                    list = tryGetLayoutInfos != null ? SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(tryGetLayoutInfos, ComposeViewsKt$getComposeScannableViews$scannableViews$1.INSTANCE)) : null;
                    e = null;
                } catch (LinkageError e) {
                    e = e;
                }
                if (list != null) {
                    pair = new Pair(list, Boolean.TRUE);
                } else {
                    StringBuilder sb = new StringBuilder("Composition was found, but either Compose Tooling artifact is missing or the Compose version is not supported. Please ensure you have a dependency on androidx.ui:ui-tooling or check https://github.com/square/radiography for a new release.");
                    if (e != null) {
                        sb.append('\n');
                        sb.append("Error: " + e);
                    }
                    pair = new Pair(CollectionsKt__CollectionsJVMKt.listOf(new ScannableView.ChildRenderingError(sb.toString())), Boolean.FALSE);
                }
                List list2 = (List) pair.first;
                boolean booleanValue = ((Boolean) pair.second).booleanValue();
                List list3 = list2;
                this.L$0 = sequenceScope;
                this.Z$0 = booleanValue;
                this.label = 1;
                sequenceScope.getClass();
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    yieldAll = Unit.INSTANCE;
                } else {
                    yieldAll = sequenceScope.yieldAll(list3.iterator(), this);
                    if (yieldAll != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        yieldAll = Unit.INSTANCE;
                    }
                }
                if (yieldAll != coroutineSingletons) {
                    z = booleanValue;
                }
                return coroutineSingletons;
            }
            if (view instanceof ViewGroup) {
                return Unit.INSTANCE;
            }
            childCount = ((ViewGroup) view).getChildCount();
            if (i2 >= childCount) {
            }
        } else if (i == 1) {
            z = this.Z$0;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            childCount = this.I$1;
            i2 = this.I$0;
            SafeTrace.throwOnFailure(obj);
            i2++;
            if (i2 >= childCount) {
                return Unit.INSTANCE;
            }
            View childAt = ((ViewGroup) view).getChildAt(i2);
            if (childAt != null) {
                ScannableView.AndroidView androidView = new ScannableView.AndroidView(childAt);
                this.L$0 = sequenceScope;
                this.I$0 = i2;
                this.I$1 = childCount;
                this.label = 2;
                sequenceScope.yield(androidView, this);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return coroutineSingletons;
            }
            i2++;
            if (i2 >= childCount) {
            }
        }
        if (z) {
            return Unit.INSTANCE;
        }
        if (view instanceof ViewGroup) {
        }
    }
}
