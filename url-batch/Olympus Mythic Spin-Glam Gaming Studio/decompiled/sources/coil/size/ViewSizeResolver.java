package coil.size;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.Dimension;
import coil.size.ViewSizeResolver;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewSizeResolver.kt */
/* loaded from: classes9.dex */
public interface ViewSizeResolver extends SizeResolver {
    boolean getSubtractPadding();

    View getView();

    /* compiled from: ViewSizeResolver.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, coil.size.ViewSizeResolver$size$3$preDrawListener$1] */
        public static Object size(final ViewSizeResolver viewSizeResolver, Continuation continuation) {
            Size size = getSize(viewSizeResolver);
            if (size != null) {
                return size;
            }
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final ViewTreeObserver viewTreeObserver = viewSizeResolver.getView().getViewTreeObserver();
            final ?? r2 = new ViewTreeObserver.OnPreDrawListener() { // from class: coil.size.ViewSizeResolver$size$3$preDrawListener$1
                private boolean isResumed;

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    Size size2;
                    size2 = ViewSizeResolver.DefaultImpls.getSize(ViewSizeResolver.this);
                    if (size2 != null) {
                        ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(ViewSizeResolver.this, viewTreeObserver, this);
                        if (!this.isResumed) {
                            this.isResumed = true;
                            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(size2));
                        }
                    }
                    return true;
                }
            };
            viewTreeObserver.addOnPreDrawListener(r2);
            cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: coil.size.ViewSizeResolver$size$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    ViewSizeResolver.DefaultImpls.removePreDrawListenerSafe(ViewSizeResolver.this, viewTreeObserver, r2);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Size getSize(ViewSizeResolver viewSizeResolver) {
            Dimension height;
            Dimension width = getWidth(viewSizeResolver);
            if (width == null || (height = getHeight(viewSizeResolver)) == null) {
                return null;
            }
            return new Size(width, height);
        }

        private static Dimension getWidth(ViewSizeResolver viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams != null ? layoutParams.width : -1, viewSizeResolver.getView().getWidth(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingLeft() + viewSizeResolver.getView().getPaddingRight() : 0);
        }

        private static Dimension getHeight(ViewSizeResolver viewSizeResolver) {
            ViewGroup.LayoutParams layoutParams = viewSizeResolver.getView().getLayoutParams();
            return getDimension(viewSizeResolver, layoutParams != null ? layoutParams.height : -1, viewSizeResolver.getView().getHeight(), viewSizeResolver.getSubtractPadding() ? viewSizeResolver.getView().getPaddingTop() + viewSizeResolver.getView().getPaddingBottom() : 0);
        }

        private static Dimension getDimension(ViewSizeResolver viewSizeResolver, int i, int i2, int i3) {
            if (i == -2) {
                return Dimension.Undefined.INSTANCE;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return Dimensions.Dimension(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return Dimensions.Dimension(i5);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void removePreDrawListenerSafe(ViewSizeResolver viewSizeResolver, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                viewSizeResolver.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
    }
}
