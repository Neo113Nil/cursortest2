package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import coil3.ImageLoader$Builder;
import coil3.request.ImageRequestsKt;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlin.InitializedLazyImpl;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class UiStepSavedStateHelper_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;

    public UiStepSavedStateHelper_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new UiStepSavedStateHelper((Context) provider.get());
            default:
                Context context = (Context) provider.get();
                context.getClass();
                ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context);
                ImageRequestsKt.crossfade(imageLoader$Builder);
                imageLoader$Builder.diskCacheLazy = new InitializedLazyImpl(null);
                return imageLoader$Builder.build();
        }
    }

    public UiStepSavedStateHelper_Factory(FormBody.Builder builder, InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
    }
}
