package com.yandex.div.internal.viewpool.optimization;

import a2.AbstractC1241b;
import android.content.Context;
import android.util.Log;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.viewpool.ViewPreCreationProfile;
import com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository;
import com.yandex.div.logging.Severity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.AbstractC3398h;
import r2.InterfaceC3396f;

@f(c = "com.yandex.div.internal.viewpool.optimization.ViewPreCreationProfileRepository$get$2", f = "ViewPreCreationProfileRepository.kt", l = {33}, m = "invokeSuspend")
@Metadata
/* loaded from: classes2.dex */
final class ViewPreCreationProfileRepository$get$2 extends l implements Function2<InterfaceC3316J, d, Object> {
    final /* synthetic */ String $id;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ViewPreCreationProfileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPreCreationProfileRepository$get$2(ViewPreCreationProfileRepository viewPreCreationProfileRepository, String str, d dVar) {
        super(2, dVar);
        this.this$0 = viewPreCreationProfileRepository;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final d create(@Nullable Object obj, @NotNull d dVar) {
        ViewPreCreationProfileRepository$get$2 viewPreCreationProfileRepository$get$2 = new ViewPreCreationProfileRepository$get$2(this.this$0, this.$id, dVar);
        viewPreCreationProfileRepository$get$2.L$0 = obj;
        return viewPreCreationProfileRepository$get$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m243constructorimpl;
        ViewPreCreationProfile viewPreCreationProfile;
        ViewPreCreationProfileRepository.Companion companion;
        Context context;
        Object m4;
        Object f4 = AbstractC1241b.f();
        int i4 = this.label;
        try {
            if (i4 == 0) {
                ResultKt.a(obj);
                ViewPreCreationProfileRepository viewPreCreationProfileRepository = this.this$0;
                String str = this.$id;
                Result.Companion companion2 = Result.Companion;
                companion = ViewPreCreationProfileRepository.Companion;
                context = viewPreCreationProfileRepository.context;
                InterfaceC3396f data = companion.getStoreForId(context, str).getData();
                this.label = 1;
                m4 = AbstractC3398h.m(data, this);
                if (m4 == f4) {
                    return f4;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.a(obj);
                m4 = obj;
            }
            m243constructorimpl = Result.m243constructorimpl((ViewPreCreationProfile) m4);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null && KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
            Log.e("OptimizedViewPreCreationProfileRepository", "", d4);
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        ViewPreCreationProfile viewPreCreationProfile2 = (ViewPreCreationProfile) m243constructorimpl;
        if (viewPreCreationProfile2 != null) {
            return viewPreCreationProfile2;
        }
        viewPreCreationProfile = this.this$0.defaultProfile;
        return ViewPreCreationProfile.copy$default(viewPreCreationProfile, this.$id, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524286, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC3316J interfaceC3316J, @Nullable d dVar) {
        return ((ViewPreCreationProfileRepository$get$2) create(interfaceC3316J, dVar)).invokeSuspend(Unit.f41027a);
    }
}
