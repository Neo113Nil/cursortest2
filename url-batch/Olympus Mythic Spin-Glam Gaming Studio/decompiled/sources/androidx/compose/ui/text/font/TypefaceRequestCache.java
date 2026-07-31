package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FontFamilyResolver.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "resolveTypeface", "Landroidx/compose/runtime/State;", "runCached", "(Landroidx/compose/ui/text/font/TypefaceRequest;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "typefaceRequests", "preWarmCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock$ui_text_release", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", "Landroidx/compose/ui/text/caches/LruCache;", "resultCache", "Landroidx/compose/ui/text/caches/LruCache;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TypefaceRequestCache {
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final LruCache resultCache = new LruCache(16);

    /* renamed from: getLock$ui_text_release, reason: from getter */
    public final SynchronizedObject getLock() {
        return this.lock;
    }

    public final State runCached(final TypefaceRequest typefaceRequest, Function1 resolveTypeface) {
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (this.lock) {
            TypefaceResult typefaceResult = (TypefaceResult) this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) resolveTypeface.invoke(new Function1() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((TypefaceResult) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TypefaceResult finalResult) {
                        LruCache lruCache;
                        LruCache lruCache2;
                        Intrinsics.checkNotNullParameter(finalResult, "finalResult");
                        SynchronizedObject lock = TypefaceRequestCache.this.getLock();
                        TypefaceRequestCache typefaceRequestCache = TypefaceRequestCache.this;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock) {
                            try {
                                if (finalResult.getCacheable()) {
                                    lruCache2 = typefaceRequestCache.resultCache;
                                    lruCache2.put(typefaceRequest2, finalResult);
                                } else {
                                    lruCache = typefaceRequestCache.resultCache;
                                    lruCache.remove(typefaceRequest2);
                                }
                                Unit unit = Unit.INSTANCE;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.get(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                            this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final void preWarmCache(List typefaceRequests, Function1 resolveTypeface) {
        TypefaceResult typefaceResult;
        Intrinsics.checkNotNullParameter(typefaceRequests, "typefaceRequests");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        int size = typefaceRequests.size();
        for (int i = 0; i < size; i++) {
            TypefaceRequest typefaceRequest = (TypefaceRequest) typefaceRequests.get(i);
            synchronized (this.lock) {
                typefaceResult = (TypefaceResult) this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) resolveTypeface.invoke(typefaceRequest);
                    if (typefaceResult2 instanceof TypefaceResult.Async) {
                        continue;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }
}
