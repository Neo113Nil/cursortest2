package com.yandex.div.internal.viewpool.optimization;

import D2.AbstractC0348a;
import D2.C;
import D2.p;
import Q.e;
import Q.f;
import Q.j;
import android.content.Context;
import android.util.Log;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.logging.Severity;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3333i;
import o2.Z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.AbstractC3537l;

@Metadata
/* loaded from: classes2.dex */
public class ViewPreCreationProfileRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final WeakHashMap<String, e> stores = new WeakHashMap<>();

    @NotNull
    private final Context context;

    @NotNull
    private final ViewPreCreationProfile defaultProfile;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e getStoreForId(@NotNull Context context, @NotNull String id) {
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(id, "id");
            WeakHashMap<String, e> stores = getStores();
            e eVar = stores.get(id);
            if (eVar == null) {
                eVar = f.b(f.f9076a, ViewPreCreationProfileSerializer.INSTANCE, null, null, null, new ViewPreCreationProfileRepository$Companion$getStoreForId$1$1(context, id), 14, null);
                stores.put(id, eVar);
            }
            Intrinsics.checkNotNullExpressionValue(eVar, "stores.getOrPut(id) {\n  …          )\n            }");
            return eVar;
        }

        @NotNull
        public final WeakHashMap<String, e> getStores() {
            return ViewPreCreationProfileRepository.stores;
        }

        private Companion() {
        }
    }

    @Metadata
    private static final class ViewPreCreationProfileSerializer implements j {

        @Nullable
        private static final ViewPreCreationProfile defaultValue = null;

        @NotNull
        public static final ViewPreCreationProfileSerializer INSTANCE = new ViewPreCreationProfileSerializer();

        @NotNull
        private static final AbstractC0348a json = p.b(null, ViewPreCreationProfileRepository$ViewPreCreationProfileSerializer$json$1.INSTANCE, 1, null);

        private ViewPreCreationProfileSerializer() {
        }

        @Override // Q.j
        @Nullable
        public Object readFrom(@NotNull InputStream inputStream, @NotNull d dVar) {
            Object m243constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                AbstractC0348a abstractC0348a = json;
                m243constructorimpl = Result.m243constructorimpl((ViewPreCreationProfile) C.a(abstractC0348a, AbstractC3537l.b(abstractC0348a.a(), H.e(ViewPreCreationProfile.class)), inputStream));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", d4);
            }
            if (Result.m244isFailureimpl(m243constructorimpl)) {
                return null;
            }
            return m243constructorimpl;
        }

        @Override // Q.j
        @Nullable
        public ViewPreCreationProfile getDefaultValue() {
            return defaultValue;
        }

        @Override // Q.j
        @Nullable
        public Object writeTo(@Nullable ViewPreCreationProfile viewPreCreationProfile, @NotNull OutputStream outputStream, @NotNull d dVar) {
            Object m243constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                AbstractC0348a abstractC0348a = json;
                C.b(abstractC0348a, AbstractC3537l.b(abstractC0348a.a(), H.e(ViewPreCreationProfile.class)), viewPreCreationProfile, outputStream);
                m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
            }
            Throwable d4 = Result.d(m243constructorimpl);
            if (d4 != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                Log.e("OptimizedViewPreCreationProfileRepository", "", d4);
            }
            return Unit.f41027a;
        }
    }

    public ViewPreCreationProfileRepository(@NotNull Context context, @NotNull ViewPreCreationProfile defaultProfile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultProfile, "defaultProfile");
        this.context = context;
        this.defaultProfile = defaultProfile;
    }

    static /* synthetic */ Object get$suspendImpl(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, d dVar) {
        return AbstractC3333i.g(Z.b(), new ViewPreCreationProfileRepository$get$2(viewPreCreationProfileRepository, str, null), dVar);
    }

    @Nullable
    public Object get(@NotNull String str, @NotNull d dVar) {
        return get$suspendImpl(this, str, dVar);
    }
}
