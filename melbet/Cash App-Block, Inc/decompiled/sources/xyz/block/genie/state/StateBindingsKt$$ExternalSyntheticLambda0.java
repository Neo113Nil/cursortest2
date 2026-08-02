package xyz.block.genie.state;

import android.webkit.WebView;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntRect;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.tinygraph.models.EntityReference;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import radiography.internal.ComposeLayoutInfo;
import xyz.block.genie.state.GenieStateValue;

/* loaded from: classes7.dex */
public final /* synthetic */ class StateBindingsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ StateBindingsKt$$ExternalSyntheticLambda0(String str) {
        this.$r8$classId = 8;
        LocationStatus locationStatus = LocationStatus.ACTIVE;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.$r8$classId;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                GenieStateValue genieStateValue = (GenieStateValue) obj;
                GenieStateValue.StringValue stringValue = genieStateValue instanceof GenieStateValue.StringValue ? (GenieStateValue.StringValue) genieStateValue : null;
                return (stringValue == null || (str = stringValue.value) == null) ? str2 : str;
            case 1:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str2);
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                if (str2 != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str2);
                }
                return Unit.INSTANCE;
            case 4:
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj;
                pickerItem.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(((JobIdentifier) pickerItem.identifier).token, str2));
            case 5:
                ClockInOverlayViewModel.PickerItem pickerItem2 = (ClockInOverlayViewModel.PickerItem) obj;
                pickerItem2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(((LocationIdentifier) pickerItem2.identifier).token, str2));
            case 6:
                Job job = (Job) obj;
                job.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(job.id, str2));
            case 7:
                Location location = (Location) obj;
                location.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(location.id, str2));
            case 8:
                LocationStatus locationStatus = LocationStatus.ACTIVE;
                Location location2 = (Location) obj;
                location2.getClass();
                EntityReference entityReference = location2.merchantId;
                return Boolean.valueOf(Intrinsics.areEqual(entityReference != null ? entityReference.id : null, str2) && location2.status == locationStatus);
            case 9:
                Merchant merchant = (Merchant) obj;
                merchant.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(merchant.id, str2));
            case 10:
                Person person = (Person) obj;
                person.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(person.id, str2));
            case 11:
                Setting setting = (Setting) obj;
                setting.getClass();
                EntityReference entityReference2 = setting.merchantId;
                return Boolean.valueOf(Intrinsics.areEqual(entityReference2 != null ? entityReference2.id : null, str2));
            case 12:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver4, str2);
                return Unit.INSTANCE;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver5, str2);
                return Unit.INSTANCE;
            case 14:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadDataWithBaseURL(null, this.f$0, "text/html", "UTF-8", null);
                return Unit.INSTANCE;
            case 15:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                Object obj2 = updater.state;
                DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = obj2 instanceof DocumentWorkflow.State.ReviewCapturesWithoutDocumentId ? (DocumentWorkflow.State.ReviewCapturesWithoutDocumentId) obj2 : null;
                if (reviewCapturesWithoutDocumentId == null) {
                    return Unit.INSTANCE;
                }
                String str3 = this.f$0;
                DocumentWorkflow.State.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId2 = reviewCapturesWithoutDocumentId;
                updater.state = new DocumentWorkflow.State.ReviewCaptures(reviewCapturesWithoutDocumentId2.documents, str3, new DocumentWorkflow.State.UploadState.UploadFiles(str3), false, reviewCapturesWithoutDocumentId2.error, 116);
                return Unit.INSTANCE;
            case 16:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                GovernmentIdState backState$government_id_release = ((GovernmentIdState) updater2.state).getBackState$government_id_release();
                if (backState$government_id_release != null) {
                    updater2.state = backState$government_id_release.copyWithErrorMessage$government_id_release(str2);
                }
                return Unit.INSTANCE;
            case 17:
                return Boolean.valueOf(((RealFontDownloader.FontDownloadedCallback) obj).url.equals(str2));
            case 18:
                return Boolean.valueOf(((RealFontDownloader.FontDownloadedCallback) obj).url.equals(str2));
            case 19:
                ButtonComponent buttonComponent = (ButtonComponent) obj;
                buttonComponent.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(buttonComponent.getName(), str2));
            default:
                ComposeLayoutInfo.SubcompositionInfo subcompositionInfo = (ComposeLayoutInfo.SubcompositionInfo) obj;
                subcompositionInfo.getClass();
                List list = subcompositionInfo.callChain;
                IntRect intRect = subcompositionInfo.bounds;
                Sequence sequence = subcompositionInfo.children;
                list.getClass();
                intRect.getClass();
                return new ComposeLayoutInfo.SubcompositionInfo(str2, list, intRect, sequence);
        }
    }

    public /* synthetic */ StateBindingsKt$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }
}
