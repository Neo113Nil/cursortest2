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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "initialType", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "onCompletion", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "Ljava/util/List;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "cacheable", "Z", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AsyncFontListLoader implements State<Object> {
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;
    private final List fontList;
    private final Function1 onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;

    public AsyncFontListLoader(List fontList, Object initialType, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1 onCompletion, PlatformFontLoader platformFontLoader) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.fontList = fontList;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = onCompletion;
        this.platformFontLoader = platformFontLoader;
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.cacheable = true;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x00f2, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:20:0x0075, B:22:0x008c, B:27:0x00be, B:31:0x00f5), top: B:19:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5 A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:20:0x0075, B:22:0x008c, B:27:0x00be, B:31:0x00f5), top: B:19:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0108 -> B:13:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010d -> B:14:0x010f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(Continuation continuation) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        AsyncFontListLoader asyncFontListLoader;
        List list;
        int size;
        AsyncFontListLoader asyncFontListLoader2;
        int i2;
        Font font;
        List list2;
        int i3;
        if (continuation instanceof AsyncFontListLoader$load$1) {
            asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) continuation;
            int i4 = asyncFontListLoader$load$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$load$1.label = i4 - Integer.MIN_VALUE;
                Object obj = asyncFontListLoader$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncFontListLoader$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        list = this.fontList;
                        size = list.size();
                        asyncFontListLoader2 = this;
                        i2 = 0;
                        if (i2 >= size) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        asyncFontListLoader = this;
                    }
                } else if (i == 1) {
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    Font font2 = (Font) asyncFontListLoader$load$1.L$2;
                    List list3 = (List) asyncFontListLoader$load$1.L$1;
                    AsyncFontListLoader asyncFontListLoader3 = (AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        asyncFontListLoader2 = asyncFontListLoader3;
                        font = font2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        asyncFontListLoader = asyncFontListLoader3;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = asyncFontListLoader$load$1.I$1;
                    i3 = asyncFontListLoader$load$1.I$0;
                    list2 = (List) asyncFontListLoader$load$1.L$1;
                    asyncFontListLoader = (AsyncFontListLoader) asyncFontListLoader$load$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        i2 = i3;
                        list = list2;
                        asyncFontListLoader2 = asyncFontListLoader;
                        i2++;
                        if (i2 >= size) {
                            try {
                                Font font3 = (Font) list.get(i2);
                                if (FontLoadingStrategy.m2291equalsimpl0(font3.getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m2295getAsyncPKNRLFQ())) {
                                    AsyncTypefaceCache asyncTypefaceCache = asyncFontListLoader2.asyncTypefaceCache;
                                    PlatformFontLoader platformFontLoader = asyncFontListLoader2.platformFontLoader;
                                    AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(asyncFontListLoader2, font3, null);
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list;
                                    asyncFontListLoader$load$1.L$2 = font3;
                                    asyncFontListLoader$load$1.I$0 = i2;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 1;
                                    int i5 = i2;
                                    Object runCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$1);
                                    if (runCached == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    list2 = list;
                                    obj = runCached;
                                    font = font3;
                                    i3 = i5;
                                    if (obj == null) {
                                        asyncFontListLoader2.setValue(FontSynthesis_androidKt.m2321synthesizeTypefaceFxwP2eA(asyncFontListLoader2.typefaceRequest.getFontSynthesis(), obj, font, asyncFontListLoader2.typefaceRequest.getFontWeight(), asyncFontListLoader2.typefaceRequest.getFontStyle()));
                                        Unit unit = Unit.INSTANCE;
                                        boolean isActive = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive));
                                        return unit;
                                    }
                                    asyncFontListLoader$load$1.L$0 = asyncFontListLoader2;
                                    asyncFontListLoader$load$1.L$1 = list2;
                                    asyncFontListLoader$load$1.L$2 = null;
                                    asyncFontListLoader$load$1.I$0 = i3;
                                    asyncFontListLoader$load$1.I$1 = size;
                                    asyncFontListLoader$load$1.label = 2;
                                    if (YieldKt.yield(asyncFontListLoader$load$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    asyncFontListLoader = asyncFontListLoader2;
                                    i2 = i3;
                                    list = list2;
                                    asyncFontListLoader2 = asyncFontListLoader;
                                    i2++;
                                    if (i2 >= size) {
                                        boolean isActive2 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                                        asyncFontListLoader2.cacheable = false;
                                        asyncFontListLoader2.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader2.getValue(), isActive2));
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    i2++;
                                    if (i2 >= size) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                asyncFontListLoader = asyncFontListLoader2;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                boolean isActive3 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
                asyncFontListLoader.cacheable = false;
                asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive3));
                throw th;
            }
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, continuation);
        Object obj2 = asyncFontListLoader$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$load$1.label;
        if (i != 0) {
        }
        boolean isActive32 = JobKt.isActive(asyncFontListLoader$load$1.getContext());
        asyncFontListLoader.cacheable = false;
        asyncFontListLoader.onCompletion.invoke(new TypefaceResult.Immutable(asyncFontListLoader.getValue(), isActive32));
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text_release(Font font, Continuation continuation) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        Object obj;
        try {
            if (continuation instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) continuation;
                int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    obj = null;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                        asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                        asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                        obj2 = TimeoutKt.withTimeoutOrNull(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        font = (Font) asyncFontListLoader$loadWithTimeoutOrNull$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                    }
                    obj = obj2;
                    return obj;
                }
            }
            if (i != 0) {
            }
            obj = obj2;
            return obj;
        } catch (CancellationException e) {
            if (JobKt.isActive(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                return obj;
            }
            throw e;
        } catch (Exception e2) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler == null) {
                return obj;
            }
            coroutineExceptionHandler.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            return obj;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, continuation);
        Object obj22 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        obj = null;
    }
}
