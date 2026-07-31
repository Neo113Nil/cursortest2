package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJB\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00190\u0016H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "injectedContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "asyncLoadScope", "Lkotlinx/coroutines/CoroutineScope;", "preload", "", "family", "Landroidx/compose/ui/text/font/FontFamily;", "resourceLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "createDefaultTypeface", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private CoroutineScope asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final CoroutineExceptionHandler DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext injectedContext) {
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(injectedContext, "injectedContext");
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = CoroutineScopeKt.CoroutineScope(DropExceptionHandler.plus(injectedContext).plus(SupervisorKt.SupervisorJob((Job) injectedContext.get(Job.Key))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, Continuation continuation) {
        Pair firstImmediatelyAvailable;
        if (!(fontFamily instanceof FontListFontFamily)) {
            return Unit.INSTANCE;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
        List fonts = fontListFontFamily.getFonts();
        List fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i = 0; i < size; i++) {
            Object obj = fonts2.get(i);
            if (FontLoadingStrategy.m2291equalsimpl0(((Font) obj).getLoadingStrategy(), FontLoadingStrategy.INSTANCE.m2295getAsyncPKNRLFQ())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Font font = (Font) arrayList.get(i2);
            arrayList2.add(TuplesKt.to(font.getWeight(), FontStyle.m2299boximpl(font.getStyle())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = arrayList2.get(i3);
            if (hashSet.add((Pair) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        for (int i4 = 0; i4 < size4; i4++) {
            Pair pair = (Pair) arrayList3.get(i4);
            FontWeight fontWeight = (FontWeight) pair.component1();
            int value = ((FontStyle) pair.component2()).getValue();
            firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m2298matchFontRetOiIg(fonts, fontWeight, value), new TypefaceRequest(fontFamily, fontWeight, value, FontSynthesis.INSTANCE.m2317getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new Function1() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                public final void invoke(@NotNull TypefaceRequest it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((TypefaceRequest) obj3);
                    return Unit.INSTANCE;
                }
            });
            List list = (List) firstImmediatelyAvailable.component1();
            if (list != null) {
                arrayList4.add(CollectionsKt.first(list));
            }
        }
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, platformFontLoader, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1 onAsyncCompletion, Function1 createDefaultTypeface) {
        Pair firstImmediatelyAvailable;
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
        Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m2298matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) firstImmediatelyAvailable.component1();
        Object component2 = firstImmediatelyAvailable.component2();
        if (list == null) {
            return new TypefaceResult.Immutable(component2, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, component2, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        BuildersKt__Builders_commonKt.launch$default(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }
}
