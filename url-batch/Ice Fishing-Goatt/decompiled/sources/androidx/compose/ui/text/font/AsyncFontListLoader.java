package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u000e\u0010 \u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super TypefaceResult.Immutable, Unit> function1, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader;
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[Catch: all -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:26:0x00b1, B:35:0x00e5, B:55:0x0069), top: B:54:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: all -> 0x0126, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:26:0x00b1, B:35:0x00e5, B:55:0x0069), top: B:54:0x0069 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:14:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f8 -> B:13:0x00fd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Continuation<? super Unit> continuation) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        List<Font> list;
        int size;
        AsyncFontListLoader$load$1 asyncFontListLoader$load$12;
        int i2;
        Throwable th;
        AsyncFontListLoader asyncFontListLoader;
        Throwable th2;
        Font font;
        List<Font> list2;
        int i3;
        if (continuation instanceof AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuation;
            if ((asyncFontListLoader$load$1.label & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.label -= Integer.MIN_VALUE;
                AsyncFontListLoader$load$1 asyncFontListLoader$load$13 = asyncFontListLoader$load$1;
                Object obj = asyncFontListLoader$load$13.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncFontListLoader$load$13.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        list = this.fontList;
                        size = list.size();
                        asyncFontListLoader$load$12 = asyncFontListLoader$load$13;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        asyncFontListLoader = this;
                        th = th2;
                        boolean isActive = JobKt.isActive(asyncFontListLoader$load$13.getContext());
                        asyncFontListLoader.cacheable = false;
                        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive));
                        throw th;
                    }
                } else if (i == 1) {
                    int i4 = asyncFontListLoader$load$13.I$1;
                    int i5 = asyncFontListLoader$load$13.I$0;
                    Font font2 = (Font) asyncFontListLoader$load$13.L$2;
                    list2 = (List) asyncFontListLoader$load$13.L$1;
                    AsyncFontListLoader asyncFontListLoader2 = (AsyncFontListLoader) asyncFontListLoader$load$13.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        size = i4;
                        this = asyncFontListLoader2;
                        font = font2;
                        i3 = i5;
                        if (obj == null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        asyncFontListLoader = asyncFontListLoader2;
                        boolean isActive2 = JobKt.isActive(asyncFontListLoader$load$13.getContext());
                        asyncFontListLoader.cacheable = false;
                        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive2));
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = asyncFontListLoader$load$13.I$1;
                    int i7 = asyncFontListLoader$load$13.I$0;
                    List<Font> list3 = (List) asyncFontListLoader$load$13.L$1;
                    asyncFontListLoader = (AsyncFontListLoader) asyncFontListLoader$load$13.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        asyncFontListLoader$load$12 = asyncFontListLoader$load$13;
                        i2 = i7;
                        list = list3;
                        size = i6;
                        this = asyncFontListLoader;
                        i2++;
                        if (i2 < size) {
                            try {
                                Font font3 = list.get(i2);
                                if (FontLoadingStrategy.m5849equalsimpl0(font3.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m5853getAsyncPKNRLFQ())) {
                                    AsyncTypefaceCache asyncTypefaceCache = this.asyncTypefaceCache;
                                    PlatformFontLoader platformFontLoader = this.platformFontLoader;
                                    AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(this, font3, null);
                                    asyncFontListLoader$load$12.L$0 = this;
                                    asyncFontListLoader$load$12.L$1 = list;
                                    asyncFontListLoader$load$12.L$2 = font3;
                                    asyncFontListLoader$load$12.I$0 = i2;
                                    asyncFontListLoader$load$12.I$1 = size;
                                    asyncFontListLoader$load$12.label = 1;
                                    Object runCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$12);
                                    if (runCached != coroutine_suspended) {
                                        font = font3;
                                        list2 = list;
                                        obj = runCached;
                                        i3 = i2;
                                        asyncFontListLoader$load$13 = asyncFontListLoader$load$12;
                                        if (obj == null) {
                                            this.setValue(FontSynthesis_androidKt.m5883synthesizeTypefaceFxwP2eA(this.typefaceRequest.m5908getFontSynthesisGVVA2EU(), obj, font, this.typefaceRequest.getFontWeight(), this.typefaceRequest.m5907getFontStyle_LCdwA()));
                                            Unit unit = Unit.INSTANCE;
                                            boolean isActive3 = JobKt.isActive(asyncFontListLoader$load$13.getContext());
                                            this.cacheable = false;
                                            this.onCompletion.invoke(new TypefaceResult.Immutable(this.getValue(), isActive3));
                                            return unit;
                                        }
                                        asyncFontListLoader$load$13.L$0 = this;
                                        asyncFontListLoader$load$13.L$1 = list2;
                                        asyncFontListLoader$load$13.L$2 = null;
                                        asyncFontListLoader$load$13.I$0 = i3;
                                        asyncFontListLoader$load$13.I$1 = size;
                                        asyncFontListLoader$load$13.label = 2;
                                        if (YieldKt.yield(asyncFontListLoader$load$13) != coroutine_suspended) {
                                            List<Font> list4 = list2;
                                            asyncFontListLoader = this;
                                            i6 = size;
                                            i7 = i3;
                                            list3 = list4;
                                            asyncFontListLoader$load$12 = asyncFontListLoader$load$13;
                                            i2 = i7;
                                            list = list3;
                                            size = i6;
                                            this = asyncFontListLoader;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                i2++;
                                if (i2 < size) {
                                    boolean isActive4 = JobKt.isActive(asyncFontListLoader$load$12.getContext());
                                    this.cacheable = false;
                                    this.onCompletion.invoke(new TypefaceResult.Immutable(this.getValue(), isActive4));
                                    return Unit.INSTANCE;
                                }
                            } catch (Throwable th5) {
                                asyncFontListLoader = this;
                                th = th5;
                                asyncFontListLoader$load$13 = asyncFontListLoader$load$12;
                                boolean isActive22 = JobKt.isActive(asyncFontListLoader$load$13.getContext());
                                asyncFontListLoader.cacheable = false;
                                asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive22));
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        th = th2;
                        boolean isActive222 = JobKt.isActive(asyncFontListLoader$load$13.getContext());
                        asyncFontListLoader.cacheable = false;
                        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive222));
                        throw th;
                    }
                }
            }
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuation);
        AsyncFontListLoader$load$1 asyncFontListLoader$load$132 = asyncFontListLoader$load$1;
        Object obj2 = asyncFontListLoader$load$132.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$load$132.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text_release(Font font, Continuation<Object> continuation) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        try {
            if (continuation instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
                if ((asyncFontListLoader$loadWithTimeoutOrNull$1.label & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label -= Integer.MIN_VALUE;
                    Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                    asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                    Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                    return withTimeoutOrNull == coroutine_suspended ? coroutine_suspended : withTimeoutOrNull;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            if (!JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            }
            return null;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
        Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
    }
}
