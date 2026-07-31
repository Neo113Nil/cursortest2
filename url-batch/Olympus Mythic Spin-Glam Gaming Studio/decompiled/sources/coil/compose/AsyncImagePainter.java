package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.SuccessResult;
import coil.size.Precision;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.transition.Transition;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncImagePainter.kt */
/* loaded from: classes8.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {
    public static final Companion Companion = new Companion(null);
    private static final Function1 DefaultTransform = new Function1() { // from class: coil.compose.AsyncImagePainter$Companion$DefaultTransform$1
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final AsyncImagePainter.State invoke(@NotNull AsyncImagePainter.State state) {
            return state;
        }
    };
    private Painter _painter;
    private State _state;
    private ContentScale contentScale;
    private int filterQuality;
    private final MutableState imageLoader$delegate;
    private boolean isPreview;
    private Function1 onState;
    private CoroutineScope rememberScope;
    private final MutableState request$delegate;
    private final MutableState state$delegate;
    private Function1 transform;
    private final MutableStateFlow drawSize = StateFlowKt.MutableStateFlow(Size.m1329boximpl(Size.INSTANCE.m1341getZeroNHjbRc()));
    private final MutableState painter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState alpha$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
    private final MutableState colorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public AsyncImagePainter(ImageRequest imageRequest, ImageLoader imageLoader) {
        State.Empty empty = State.Empty.INSTANCE;
        this._state = empty;
        this.transform = DefaultTransform;
        this.contentScale = ContentScale.INSTANCE.getFit();
        this.filterQuality = DrawScope.INSTANCE.m1710getDefaultFilterQualityfv9h1I();
        this.state$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(empty, null, 2, null);
        this.request$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageRequest, null, 2, null);
        this.imageLoader$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(imageLoader, null, 2, null);
    }

    private final Painter getPainter() {
        return (Painter) this.painter$delegate.getValue();
    }

    private final void setPainter(Painter painter) {
        this.painter$delegate.setValue(painter);
    }

    private final float getAlpha() {
        return ((Number) this.alpha$delegate.getValue()).floatValue();
    }

    private final void setAlpha(float f) {
        this.alpha$delegate.setValue(Float.valueOf(f));
    }

    private final ColorFilter getColorFilter() {
        return (ColorFilter) this.colorFilter$delegate.getValue();
    }

    private final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter$delegate.setValue(colorFilter);
    }

    private final void set_state(State state) {
        this._state = state;
        setState(state);
    }

    private final void set_painter(Painter painter) {
        this._painter = painter;
        setPainter(painter);
    }

    public final void setTransform$coil_compose_base_release(Function1 function1) {
        this.transform = function1;
    }

    public final void setOnState$coil_compose_base_release(Function1 function1) {
        this.onState = function1;
    }

    public final void setContentScale$coil_compose_base_release(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    /* renamed from: setFilterQuality-vDHp3xo$coil_compose_base_release, reason: not valid java name */
    public final void m2903setFilterQualityvDHp3xo$coil_compose_base_release(int i) {
        this.filterQuality = i;
    }

    public final void setPreview$coil_compose_base_release(boolean z) {
        this.isPreview = z;
    }

    private final void setState(State state) {
        this.state$delegate.setValue(state);
    }

    public final ImageRequest getRequest() {
        return (ImageRequest) this.request$delegate.getValue();
    }

    public final void setRequest$coil_compose_base_release(ImageRequest imageRequest) {
        this.request$delegate.setValue(imageRequest);
    }

    public final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader$delegate.getValue();
    }

    public final void setImageLoader$coil_compose_base_release(ImageLoader imageLoader) {
        this.imageLoader$delegate.setValue(imageLoader);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        Painter painter = getPainter();
        return painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1340getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        this.drawSize.setValue(Size.m1329boximpl(drawScope.mo1708getSizeNHjbRc()));
        Painter painter = getPainter();
        if (painter != null) {
            painter.m1721drawx_KDEd0(drawScope, drawScope.mo1708getSizeNHjbRc(), getAlpha(), getColorFilter());
        }
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        setAlpha(f);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        setColorFilter(colorFilter);
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        if (this.rememberScope != null) {
            return;
        }
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()));
        this.rememberScope = CoroutineScope;
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onRemembered();
        }
        if (!this.isPreview) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AsyncImagePainter$onRemembered$1(this, null), 3, null);
        } else {
            Drawable placeholder = ImageRequest.newBuilder$default(getRequest(), null, 1, null).defaults(getImageLoader().getDefaults()).build().getPlaceholder();
            updateState(new State.Loading(placeholder != null ? toPainter(placeholder) : null));
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        clear();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        clear();
        Object obj = this._painter;
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
    }

    private final void clear() {
        CoroutineScope coroutineScope = this.rememberScope;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.rememberScope = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageRequest updateRequest(ImageRequest imageRequest) {
        ImageRequest.Builder target = ImageRequest.newBuilder$default(imageRequest, null, 1, null).target(new Target() { // from class: coil.compose.AsyncImagePainter$updateRequest$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(Drawable drawable) {
            }

            @Override // coil.target.Target
            public void onSuccess(Drawable drawable) {
            }

            @Override // coil.target.Target
            public void onStart(Drawable drawable) {
                AsyncImagePainter.this.updateState(new AsyncImagePainter.State.Loading(drawable != null ? AsyncImagePainter.this.toPainter(drawable) : null));
            }
        });
        if (imageRequest.getDefined().getSizeResolver() == null) {
            target.size(new SizeResolver() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1
                @Override // coil.size.SizeResolver
                public final Object size(Continuation continuation) {
                    final MutableStateFlow mutableStateFlow;
                    mutableStateFlow = AsyncImagePainter.this.drawSize;
                    return FlowKt.first(new Flow() { // from class: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector flowCollector, Continuation continuation2) {
                            Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation2);
                            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2 implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            /* compiled from: Emitters.kt */
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                            @DebugMetadata(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE}, m = "emit")
                            /* renamed from: coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                coil.size.Size m2907toSizeOrNulluvyYCjk;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i2 = anonymousClass1.label;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            m2907toSizeOrNulluvyYCjk = AsyncImagePainterKt.m2907toSizeOrNulluvyYCjk(((Size) obj).getPackedValue());
                                            if (m2907toSizeOrNulluvyYCjk != null) {
                                                anonymousClass1.label = 1;
                                                if (flowCollector.emit(m2907toSizeOrNulluvyYCjk, anonymousClass1) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(continuation);
                                Object obj22 = anonymousClass1.result;
                                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, continuation);
                }
            });
        }
        if (imageRequest.getDefined().getScale() == null) {
            target.scale(UtilsKt.toScale(this.contentScale));
        }
        if (imageRequest.getDefined().getPrecision() != Precision.EXACT) {
            target.precision(Precision.INEXACT);
        }
        return target.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(State state) {
        State state2 = this._state;
        State state3 = (State) this.transform.invoke(state);
        set_state(state3);
        maybeNewCrossfadePainter(state2, state3);
        set_painter(state3.getPainter());
        if (this.rememberScope != null && state2.getPainter() != state3.getPainter()) {
            Object painter = state2.getPainter();
            RememberObserver rememberObserver = painter instanceof RememberObserver ? (RememberObserver) painter : null;
            if (rememberObserver != null) {
                rememberObserver.onForgotten();
            }
            Object painter2 = state3.getPainter();
            RememberObserver rememberObserver2 = painter2 instanceof RememberObserver ? (RememberObserver) painter2 : null;
            if (rememberObserver2 != null) {
                rememberObserver2.onRemembered();
            }
        }
        Function1 function1 = this.onState;
        if (function1 != null) {
            function1.invoke(state3);
        }
    }

    private final CrossfadePainter maybeNewCrossfadePainter(State state, State state2) {
        ImageResult result;
        AsyncImagePainterKt$FakeTransitionTarget$1 asyncImagePainterKt$FakeTransitionTarget$1;
        if (!(state2 instanceof State.Success)) {
            if (state2 instanceof State.Error) {
                result = ((State.Error) state2).getResult();
            }
            return null;
        }
        result = ((State.Success) state2).getResult();
        Transition.Factory transitionFactory = result.getRequest().getTransitionFactory();
        asyncImagePainterKt$FakeTransitionTarget$1 = AsyncImagePainterKt.FakeTransitionTarget;
        transitionFactory.create(asyncImagePainterKt$FakeTransitionTarget$1, result);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State toState(ImageResult imageResult) {
        if (imageResult instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) imageResult;
            return new State.Success(toPainter(successResult.getDrawable()), successResult);
        }
        if (!(imageResult instanceof ErrorResult)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable = imageResult.getDrawable();
        return new State.Error(drawable != null ? toPainter(drawable) : null, (ErrorResult) imageResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Painter toPainter(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return BitmapPainterKt.m1720BitmapPainterQZhYCtY$default(AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap()), 0L, 0L, this.filterQuality, 6, null);
        }
        return drawable instanceof ColorDrawable ? new ColorPainter(ColorKt.Color(((ColorDrawable) drawable).getColor()), null) : new DrawablePainter(drawable.mutate());
    }

    /* compiled from: AsyncImagePainter.kt */
    public static abstract class State {
        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Painter getPainter();

        private State() {
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class Empty extends State {
            public static final Empty INSTANCE = new Empty();

            @Override // coil.compose.AsyncImagePainter.State
            public Painter getPainter() {
                return null;
            }

            private Empty() {
                super(null);
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class Loading extends State {
            private final Painter painter;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loading) && Intrinsics.areEqual(getPainter(), ((Loading) obj).getPainter());
            }

            public int hashCode() {
                if (getPainter() == null) {
                    return 0;
                }
                return getPainter().hashCode();
            }

            public String toString() {
                return "Loading(painter=" + getPainter() + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public Painter getPainter() {
                return this.painter;
            }

            public Loading(Painter painter) {
                super(null);
                this.painter = painter;
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class Success extends State {
            private final Painter painter;
            private final SuccessResult result;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(getPainter(), success.getPainter()) && Intrinsics.areEqual(this.result, success.result);
            }

            public int hashCode() {
                return (getPainter().hashCode() * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Success(painter=" + getPainter() + ", result=" + this.result + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public Painter getPainter() {
                return this.painter;
            }

            public final SuccessResult getResult() {
                return this.result;
            }

            public Success(Painter painter, SuccessResult successResult) {
                super(null);
                this.painter = painter;
                this.result = successResult;
            }
        }

        /* compiled from: AsyncImagePainter.kt */
        public static final class Error extends State {
            private final Painter painter;
            private final ErrorResult result;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.areEqual(getPainter(), error.getPainter()) && Intrinsics.areEqual(this.result, error.result);
            }

            public int hashCode() {
                return ((getPainter() == null ? 0 : getPainter().hashCode()) * 31) + this.result.hashCode();
            }

            public String toString() {
                return "Error(painter=" + getPainter() + ", result=" + this.result + ')';
            }

            @Override // coil.compose.AsyncImagePainter.State
            public Painter getPainter() {
                return this.painter;
            }

            public final ErrorResult getResult() {
                return this.result;
            }

            public Error(Painter painter, ErrorResult errorResult) {
                super(null);
                this.painter = painter;
                this.result = errorResult;
            }
        }
    }

    /* compiled from: AsyncImagePainter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1 getDefaultTransform() {
            return AsyncImagePainter.DefaultTransform;
        }
    }
}
