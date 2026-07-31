package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComposableLambda.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "bits", "slot", "bitsForSlot", "(II)I", "sameBits", "(I)I", "differentBits", "Landroidx/compose/runtime/RecomposeScope;", "other", "", "replacableWith", "(Landroidx/compose/runtime/RecomposeScope;Landroidx/compose/runtime/RecomposeScope;)Z", "Landroidx/compose/runtime/Composer;", "composer", "key", "tracked", "", "block", "Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambda", "(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "composableLambdaInstance", "(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;", "lambdaKey", "Ljava/lang/Object;", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableLambdaKt {
    private static final Object lambdaKey = new Object();

    public static final ComposableLambda composableLambda(Composer composer, int i, boolean z, Object obj) {
        ComposableLambdaImpl composableLambdaImpl;
        composer.startMovableGroup(Integer.rotateLeft(i, 1), lambdaKey);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            composableLambdaImpl = new ComposableLambdaImpl(i, z, obj);
            composer.updateRememberedValue(composableLambdaImpl);
        } else {
            Intrinsics.checkNotNull(rememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambdaImpl = (ComposableLambdaImpl) rememberedValue;
            composableLambdaImpl.update(obj);
        }
        composer.endMovableGroup();
        return composableLambdaImpl;
    }

    public static final int bitsForSlot(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final int sameBits(int i) {
        return bitsForSlot(1, i);
    }

    public static final int differentBits(int i) {
        return bitsForSlot(2, i);
    }

    public static final boolean replacableWith(RecomposeScope recomposeScope, RecomposeScope recomposeScope2) {
        if (recomposeScope != null) {
            if ((recomposeScope instanceof RecomposeScopeImpl) && (recomposeScope2 instanceof RecomposeScopeImpl)) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) recomposeScope;
                if (!recomposeScopeImpl.getValid() || Intrinsics.areEqual(recomposeScope, recomposeScope2) || Intrinsics.areEqual(recomposeScopeImpl.getAnchor(), ((RecomposeScopeImpl) recomposeScope2).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final ComposableLambda composableLambdaInstance(int i, boolean z, Object obj) {
        return new ComposableLambdaImpl(i, z, obj);
    }
}
