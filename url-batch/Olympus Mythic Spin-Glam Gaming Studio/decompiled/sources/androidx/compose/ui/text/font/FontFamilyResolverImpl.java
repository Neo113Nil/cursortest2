package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontFamilyResolver.kt */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0002R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "platformFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "(Landroidx/compose/ui/text/font/PlatformFontLoader;Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;)V", "createDefaultTypeface", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "", "getPlatformFontLoader$ui_text_release", "()Landroidx/compose/ui/text/font/PlatformFontLoader;", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "typefaceRequest", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    private final Function1 createDefaultTypeface;
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter) {
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFamilyTypefaceAdapter;
        this.createDefaultTypeface = new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Object invoke(@NotNull TypefaceRequest it) {
                State resolve;
                Intrinsics.checkNotNullParameter(it, "it");
                resolve = FontFamilyResolverImpl.this.resolve(TypefaceRequest.m2329copye1PVR60$default(it, null, null, 0, 0, null, 30, null));
                return resolve.getValue();
            }
        };
    }

    /* renamed from: getPlatformFontLoader$ui_text_release, reason: from getter */
    public final PlatformFontLoader getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader, (i & 2) != 0 ? PlatformResolveInterceptor.INSTANCE.getDefault$ui_text_release() : platformResolveInterceptor, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c A[LOOP:0: B:11:0x006a->B:12:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object preload(FontFamily fontFamily, Continuation continuation) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        int i;
        final FontFamilyResolverImpl fontFamilyResolverImpl;
        int size;
        int i2;
        if (continuation instanceof FontFamilyResolverImpl$preload$1) {
            fontFamilyResolverImpl$preload$1 = (FontFamilyResolverImpl$preload$1) continuation;
            int i3 = fontFamilyResolverImpl$preload$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fontFamilyResolverImpl$preload$1.label = i3 - Integer.MIN_VALUE;
                Object obj = fontFamilyResolverImpl$preload$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fontFamilyResolverImpl$preload$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!(fontFamily instanceof FontListFontFamily)) {
                        return Unit.INSTANCE;
                    }
                    FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.fontListFontFamilyTypefaceAdapter;
                    PlatformFontLoader platformFontLoader = this.platformFontLoader;
                    fontFamilyResolverImpl$preload$1.L$0 = this;
                    fontFamilyResolverImpl$preload$1.L$1 = fontFamily;
                    fontFamilyResolverImpl$preload$1.label = 1;
                    if (fontListFontFamilyTypefaceAdapter.preload(fontFamily, platformFontLoader, fontFamilyResolverImpl$preload$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fontFamilyResolverImpl = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fontFamily = (FontFamily) fontFamilyResolverImpl$preload$1.L$1;
                    fontFamilyResolverImpl = (FontFamilyResolverImpl) fontFamilyResolverImpl$preload$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                List fonts = ((FontListFontFamily) fontFamily).getFonts();
                ArrayList arrayList = new ArrayList(fonts.size());
                size = fonts.size();
                for (i2 = 0; i2 < size; i2++) {
                    Font font = (Font) fonts.get(i2);
                    arrayList.add(new TypefaceRequest(fontFamilyResolverImpl.platformResolveInterceptor.interceptFontFamily(fontFamily), fontFamilyResolverImpl.platformResolveInterceptor.interceptFontWeight(font.getWeight()), fontFamilyResolverImpl.platformResolveInterceptor.m2322interceptFontStyleT2F_aPo(font.getStyle()), FontSynthesis.INSTANCE.m2317getAllGVVA2EU(), fontFamilyResolverImpl.platformFontLoader.getCacheKey(), null));
                }
                fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList, new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final TypefaceResult invoke(@NotNull TypefaceRequest typeRequest) {
                        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2;
                        Function1 function1;
                        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                        Function1 function12;
                        Intrinsics.checkNotNullParameter(typeRequest, "typeRequest");
                        fontListFontFamilyTypefaceAdapter2 = FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                        PlatformFontLoader platformFontLoader2 = FontFamilyResolverImpl.this.getPlatformFontLoader();
                        AnonymousClass1 anonymousClass1 = new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                            public final void invoke(@NotNull TypefaceResult.Immutable it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((TypefaceResult.Immutable) obj2);
                                return Unit.INSTANCE;
                            }
                        };
                        function1 = FontFamilyResolverImpl.this.createDefaultTypeface;
                        TypefaceResult resolve = fontListFontFamilyTypefaceAdapter2.resolve(typeRequest, platformFontLoader2, anonymousClass1, function1);
                        if (resolve == null) {
                            platformFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                            PlatformFontLoader platformFontLoader3 = FontFamilyResolverImpl.this.getPlatformFontLoader();
                            AnonymousClass2 anonymousClass2 = new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                                public final void invoke(@NotNull TypefaceResult.Immutable it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((TypefaceResult.Immutable) obj2);
                                    return Unit.INSTANCE;
                                }
                            };
                            function12 = FontFamilyResolverImpl.this.createDefaultTypeface;
                            resolve = platformFontFamilyTypefaceAdapter.resolve(typeRequest, platformFontLoader3, anonymousClass2, function12);
                            if (resolve == null) {
                                throw new IllegalStateException("Could not load font");
                            }
                        }
                        return resolve;
                    }
                });
                return Unit.INSTANCE;
            }
        }
        fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(this, continuation);
        Object obj2 = fontFamilyResolverImpl$preload$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fontFamilyResolverImpl$preload$1.label;
        if (i != 0) {
        }
        List fonts2 = ((FontListFontFamily) fontFamily).getFonts();
        ArrayList arrayList2 = new ArrayList(fonts2.size());
        size = fonts2.size();
        while (i2 < size) {
        }
        fontFamilyResolverImpl.typefaceRequestCache.preWarmCache(arrayList2, new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final TypefaceResult invoke(@NotNull TypefaceRequest typeRequest) {
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2;
                Function1 function1;
                PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                Function1 function12;
                Intrinsics.checkNotNullParameter(typeRequest, "typeRequest");
                fontListFontFamilyTypefaceAdapter2 = FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                PlatformFontLoader platformFontLoader2 = FontFamilyResolverImpl.this.getPlatformFontLoader();
                AnonymousClass1 anonymousClass1 = new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.1
                    public final void invoke(@NotNull TypefaceResult.Immutable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                        invoke((TypefaceResult.Immutable) obj22);
                        return Unit.INSTANCE;
                    }
                };
                function1 = FontFamilyResolverImpl.this.createDefaultTypeface;
                TypefaceResult resolve = fontListFontFamilyTypefaceAdapter2.resolve(typeRequest, platformFontLoader2, anonymousClass1, function1);
                if (resolve == null) {
                    platformFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                    PlatformFontLoader platformFontLoader3 = FontFamilyResolverImpl.this.getPlatformFontLoader();
                    AnonymousClass2 anonymousClass2 = new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2.2
                        public final void invoke(@NotNull TypefaceResult.Immutable it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj22) {
                            invoke((TypefaceResult.Immutable) obj22);
                            return Unit.INSTANCE;
                        }
                    };
                    function12 = FontFamilyResolverImpl.this.createDefaultTypeface;
                    resolve = platformFontFamilyTypefaceAdapter.resolve(typeRequest, platformFontLoader3, anonymousClass2, function12);
                    if (resolve == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return resolve;
            }
        });
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    /* renamed from: resolve-DPcqOEQ */
    public State mo2288resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m2322interceptFontStyleT2F_aPo(fontStyle), this.platformResolveInterceptor.m2323interceptFontSynthesisMscr08Y(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new Function1() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final TypefaceResult invoke(@NotNull Function1 onAsyncCompletion) {
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
                Function1 function1;
                PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                Function1 function12;
                Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
                fontListFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                TypefaceRequest typefaceRequest2 = typefaceRequest;
                PlatformFontLoader platformFontLoader = FontFamilyResolverImpl.this.getPlatformFontLoader();
                function1 = FontFamilyResolverImpl.this.createDefaultTypeface;
                TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader, onAsyncCompletion, function1);
                if (resolve == null) {
                    platformFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                    TypefaceRequest typefaceRequest3 = typefaceRequest;
                    PlatformFontLoader platformFontLoader2 = FontFamilyResolverImpl.this.getPlatformFontLoader();
                    function12 = FontFamilyResolverImpl.this.createDefaultTypeface;
                    resolve = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest3, platformFontLoader2, onAsyncCompletion, function12);
                    if (resolve == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return resolve;
            }
        });
    }
}
