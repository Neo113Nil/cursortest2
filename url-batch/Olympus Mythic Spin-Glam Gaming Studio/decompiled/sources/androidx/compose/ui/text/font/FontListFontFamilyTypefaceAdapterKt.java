package androidx.compose.ui.text.font;

import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0003¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair firstImmediatelyAvailable(List list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, Function1 function1) {
        SynchronizedObject synchronizedObject;
        LruCache lruCache;
        Object loadBlocking;
        Font font;
        SimpleArrayMap simpleArrayMap;
        SynchronizedObject synchronizedObject2;
        LruCache lruCache2;
        Object m8023constructorimpl;
        Font font2;
        SimpleArrayMap simpleArrayMap2;
        int size = list.size();
        List list2 = null;
        for (int i = 0; i < size; i++) {
            Font font3 = (Font) list.get(i);
            int loadingStrategy = font3.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2296getBlockingPKNRLFQ())) {
                synchronizedObject = asyncTypefaceCache.cacheLock;
                synchronized (synchronizedObject) {
                    try {
                        AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        lruCache = asyncTypefaceCache.resultCache;
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) lruCache.get(key);
                        if (asyncTypefaceResult == null) {
                            simpleArrayMap = asyncTypefaceCache.permanentCache;
                            asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) simpleArrayMap.get(key);
                        }
                        if (asyncTypefaceResult != null) {
                            loadBlocking = asyncTypefaceResult.getResult();
                            font = font3;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            try {
                                loadBlocking = platformFontLoader.loadBlocking(font3);
                                font = font3;
                                AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, loadBlocking, false, 8, null);
                            } catch (Exception e) {
                                throw new IllegalStateException("Unable to load font " + font3, e);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (loadBlocking != null) {
                    return TuplesKt.to(list2, FontSynthesis_androidKt.m2321synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), loadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2297getOptionalLocalPKNRLFQ())) {
                synchronizedObject2 = asyncTypefaceCache.cacheLock;
                synchronized (synchronizedObject2) {
                    try {
                        AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font3, platformFontLoader.getCacheKey());
                        lruCache2 = asyncTypefaceCache.resultCache;
                        AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) lruCache2.get(key2);
                        if (asyncTypefaceResult2 == null) {
                            simpleArrayMap2 = asyncTypefaceCache.permanentCache;
                            asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) simpleArrayMap2.get(key2);
                        }
                        if (asyncTypefaceResult2 != null) {
                            m8023constructorimpl = asyncTypefaceResult2.getResult();
                            font2 = font3;
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                            try {
                                Result.Companion companion2 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(platformFontLoader.loadBlocking(font3));
                            } catch (Throwable th2) {
                                Result.Companion companion3 = Result.INSTANCE;
                                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th2));
                            }
                            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                                m8023constructorimpl = null;
                            }
                            font2 = font3;
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font3, platformFontLoader, m8023constructorimpl, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (m8023constructorimpl != null) {
                    return TuplesKt.to(list2, FontSynthesis_androidKt.m2321synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), m8023constructorimpl, font2, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!FontLoadingStrategy.m2291equalsimpl0(loadingStrategy, companion.m2295getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font3);
                }
                AsyncTypefaceCache.AsyncTypefaceResult m2274get1ASDuI8 = asyncTypefaceCache.m2274get1ASDuI8(font3, platformFontLoader);
                if (m2274get1ASDuI8 == null) {
                    if (list2 == null) {
                        list2 = CollectionsKt.mutableListOf(font3);
                    } else {
                        list2.add(font3);
                    }
                } else if (!AsyncTypefaceCache.AsyncTypefaceResult.m2279isPermanentFailureimpl(m2274get1ASDuI8.getResult()) && m2274get1ASDuI8.getResult() != null) {
                    return TuplesKt.to(list2, FontSynthesis_androidKt.m2321synthesizeTypefaceFxwP2eA(typefaceRequest.getFontSynthesis(), m2274get1ASDuI8.getResult(), font3, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            }
        }
        return TuplesKt.to(list2, function1.invoke(typefaceRequest));
    }
}
