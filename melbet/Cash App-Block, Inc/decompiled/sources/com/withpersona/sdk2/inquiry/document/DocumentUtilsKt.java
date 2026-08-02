package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.google.android.play.core.splitcompat.zzd;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.DocumentPage;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public abstract class DocumentUtilsKt {
    public static final void logState(ExternalEventLogger externalEventLogger, TrackingEventsLogger trackingEventsLogger, DocumentWorkflow.Input input, DocumentWorkflow.State state) {
        final DocumentPage documentPage;
        externalEventLogger.getClass();
        trackingEventsLogger.getClass();
        input.getClass();
        state.getClass();
        if (state.getCaptureState() == DocumentWorkflow.State.CaptureState.CameraRunning) {
            documentPage = DocumentPage.TakePhoto.INSTANCE;
        } else if (state instanceof DocumentWorkflow.State.Start) {
            documentPage = DocumentPage.Prompt.INSTANCE;
        } else {
            boolean z = state instanceof DocumentWorkflow.State.ReviewCaptures;
            DocumentPage.Review review = DocumentPage.Review.INSTANCE;
            if (z || (state instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId)) {
                documentPage = review;
            } else {
                if (!(state instanceof DocumentWorkflow.State.UploadDocument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                documentPage = DocumentPage.Pending.INSTANCE;
            }
        }
        final String str = input.fromStep;
        externalEventLogger.logPageChange(new zzd(str, documentPage) { // from class: com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.InquiryPage$Document
            public final String stepName;
            public final DocumentPage subPage;

            {
                str.getClass();
                this.stepName = str;
                this.subPage = documentPage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InquiryPage$Document)) {
                    return false;
                }
                InquiryPage$Document inquiryPage$Document = (InquiryPage$Document) obj;
                return Intrinsics.areEqual(this.stepName, inquiryPage$Document.stepName) && this.subPage.equals(inquiryPage$Document.subPage);
            }

            @Override // com.google.android.play.core.splitcompat.zzd
            public final String getStepName() {
                return this.stepName;
            }

            public final int hashCode() {
                return this.subPage.hashCode() + (this.stepName.hashCode() * 31);
            }

            public final String toString() {
                String str2;
                DocumentPage.Pending pending = DocumentPage.Pending.INSTANCE;
                DocumentPage documentPage2 = this.subPage;
                if (documentPage2.equals(pending)) {
                    str2 = "pending";
                } else if (documentPage2.equals(DocumentPage.Prompt.INSTANCE)) {
                    str2 = "prompt";
                } else if (documentPage2.equals(DocumentPage.Review.INSTANCE)) {
                    str2 = "review";
                } else {
                    if (!documentPage2.equals(DocumentPage.TakePhoto.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str2 = "capture";
                }
                return "/inquiry/documents/".concat(str2);
            }
        });
        TrackingEventsLogger.DefaultImpls.logInquiryPageViewEvent$default(trackingEventsLogger, input.fromStep, documentPage.toString(), false, 4, null);
    }

    public static final ArrayList toDocumentUploadFiles(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new DocumentFile.Local((String) it.next(), CaptureMethod.UPLOAD, 0));
        }
        return arrayList2;
    }

    public static final String toMessage(GenericFileUploadErrorResponse.DocumentErrorResponse documentErrorResponse, Context context, DocumentWorkflow.Input input) {
        documentErrorResponse.getClass();
        context.getClass();
        input.getClass();
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) {
            GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError disabledFileTypeError = (GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError) documentErrorResponse;
            String string2 = context.getString(R.string.pi2_document_error_disabled_file_type, disabledFileTypeError.getDetails().getUploadedFileType(), CollectionsKt.joinToString$default(disabledFileTypeError.getDetails().getEnabledFileTypes(), ", ", null, null, 0, null, null, 62));
            string2.getClass();
            return string2;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileLimitExceededError) {
            String string3 = context.getString(R.string.pi2_document_error_file_limit_exceeded);
            string3.getClass();
            return string3;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) {
            String string4 = context.getString(R.string.pi2_document_error_page_limit_exceeded, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError) documentErrorResponse).getDetails().getPageLimit()));
            string4.getClass();
            return string4;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError) {
            String string5 = context.getString(R.string.pi2_document_error_malformed_image_or_file);
            string5.getClass();
            return string5;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError) {
            String string6 = context.getString(R.string.pi2_document_error_malformed_image_or_file);
            string6.getClass();
            return string6;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError) {
            String string7 = context.getString(R.string.pi2_document_error_malformed_pdf);
            string7.getClass();
            return string7;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) {
            String string8 = context.getString(R.string.pi2_document_error_government_id_min_dimension_size, Integer.valueOf(((GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError) documentErrorResponse).getDetails().getMinDimensionSize()));
            string8.getClass();
            return string8;
        }
        if (documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError) {
            String str = input.largeFileErrorPrompt;
            if (str != null) {
                return str;
            }
            String string9 = context.getString(R.string.pi2_document_error_unable_to_add_file);
            string9.getClass();
            return string9;
        }
        if (!(documentErrorResponse instanceof GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String string10 = context.getString(R.string.pi2_document_error_unable_to_add_file);
        string10.getClass();
        return string10;
    }
}
