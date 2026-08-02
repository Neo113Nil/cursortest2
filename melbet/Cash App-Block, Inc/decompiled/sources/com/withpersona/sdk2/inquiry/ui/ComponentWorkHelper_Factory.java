package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.ui.state.UiStepComponentWorkHelper;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.MarkwonImpl;
import kotlin.text.MatchResult;
import net.oneformapp.helper.matching.POPMatchingFactory;

/* loaded from: classes9.dex */
public final class ComponentWorkHelper_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Logger_Factory addressAutocompleteWorkerProvider;
    public final Logger_Factory addressDetailsWorkerProvider;
    public final Provider applicationContextProvider;
    public final DocumentCameraWorker_Factory fileSelectWorkerFactoryProvider;

    public /* synthetic */ ComponentWorkHelper_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, Logger_Factory logger_Factory, Logger_Factory logger_Factory2, DocumentCameraWorker_Factory documentCameraWorker_Factory, int i) {
        this.$r8$classId = i;
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.addressAutocompleteWorkerProvider = logger_Factory;
        this.addressDetailsWorkerProvider = logger_Factory2;
        this.fileSelectWorkerFactoryProvider = documentCameraWorker_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        DocumentCameraWorker_Factory documentCameraWorker_Factory = this.fileSelectWorkerFactoryProvider;
        Logger_Factory logger_Factory = this.addressDetailsWorkerProvider;
        Logger_Factory logger_Factory2 = this.addressAutocompleteWorkerProvider;
        Provider provider = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new ComponentWorkHelper((Context) provider.get(), (Pool) logger_Factory2.get(), (MatchResult.Destructured) logger_Factory.get(), new POPMatchingFactory(20), (MarkwonImpl) documentCameraWorker_Factory.get());
            default:
                return new UiStepComponentWorkHelper((Context) provider.get(), (Pool) logger_Factory2.get(), (MatchResult.Destructured) logger_Factory.get(), new POPMatchingFactory(20), (MarkwonImpl) documentCameraWorker_Factory.get());
        }
    }
}
