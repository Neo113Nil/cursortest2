package com.withpersona.sdk2.inquiry.document;

import com.squareup.workflow1.StatefulWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class DocumentWorkflow$$ExternalSyntheticLambda42 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DocumentWorkflow f$0;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$1;

    public /* synthetic */ DocumentWorkflow$$ExternalSyntheticLambda42(DocumentWorkflow documentWorkflow, StatefulWorkflow.RenderContext renderContext, int i) {
        this.$r8$classId = i;
        this.f$0 = documentWorkflow;
        this.f$1 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DocumentWorkflow.Event.SelectDocument selectDocument = DocumentWorkflow.Event.SelectDocument.INSTANCE;
        DocumentWorkflow.Event.SelectPhotoFromLibrary selectPhotoFromLibrary = DocumentWorkflow.Event.SelectPhotoFromLibrary.INSTANCE;
        DocumentWorkflow.Event.TakePhoto takePhoto = DocumentWorkflow.Event.TakePhoto.INSTANCE;
        StatefulWorkflow.RenderContext renderContext = this.f$1;
        DocumentWorkflow documentWorkflow = this.f$0;
        UiComponent uiComponent = (UiComponent) obj;
        switch (i) {
            case 0:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, selectDocument);
                break;
            case 1:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, selectPhotoFromLibrary);
                break;
            case 2:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, takePhoto);
                break;
            case 3:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, DocumentWorkflow.Event.OpenUploadOptions.INSTANCE);
                break;
            case 4:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, selectDocument);
                break;
            case 5:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, selectPhotoFromLibrary);
                break;
            default:
                uiComponent.getClass();
                documentWorkflow.onEvent(renderContext, takePhoto);
                break;
        }
        return Unit.INSTANCE;
    }
}
