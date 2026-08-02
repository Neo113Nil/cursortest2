package com.stripe.hcaptcha.encode;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import com.squareup.workflow1.WorkflowAction;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.image.StripeImageState;
import com.withpersona.sdk2.inquiry.document.DocumentFile;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.CharRange;
import kotlin.text.MatchResult;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes8.dex */
public final /* synthetic */ class EncodeKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EncodeKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = "🌐";
        switch (this.$r8$classId) {
            case 0:
                JsonBuilder jsonBuilder = (JsonBuilder) obj;
                jsonBuilder.getClass();
                jsonBuilder.ignoreUnknownKeys = true;
                jsonBuilder.isLenient = true;
                jsonBuilder.encodeDefaults = true;
                break;
            case 1:
                Country country = (Country) obj;
                country.getClass();
                CountryCode countryCode = country.code;
                String str2 = countryCode.value;
                str2.getClass();
                if (str2.length() == 2) {
                    int codePointAt = Character.codePointAt(str2, 0) - (-127397);
                    int codePointAt2 = Character.codePointAt(str2, 1) - (-127397);
                    char[] chars = Character.toChars(codePointAt);
                    chars.getClass();
                    char[] chars2 = Character.toChars(codePointAt2);
                    chars2.getClass();
                    str = new String(ArraysKt___ArraysJvmKt.plus(chars, chars2));
                }
                CharRange charRange = PhoneNumberFormatter.VALID_INPUT_RANGE;
                String str3 = countryCode.value;
                str3.getClass();
                Map map = PhoneNumberFormatter.allMetadata;
                String upperCase = str3.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                PhoneNumberFormatter.Metadata metadata = (PhoneNumberFormatter.Metadata) map.get(upperCase);
                String str4 = metadata != null ? metadata.prefix : null;
                break;
            case 2:
                PhoneNumberFormatter phoneNumberFormatter = (PhoneNumberFormatter) obj;
                phoneNumberFormatter.getClass();
                break;
            case 3:
                PhoneNumberFormatter phoneNumberFormatter2 = (PhoneNumberFormatter) obj;
                phoneNumberFormatter2.getClass();
                break;
            case 4:
                Country country2 = (Country) obj;
                country2.getClass();
                CountryCode countryCode2 = country2.code;
                String str5 = countryCode2.value;
                str5.getClass();
                if (str5.length() == 2) {
                    int codePointAt3 = Character.codePointAt(str5, 0) - (-127397);
                    int codePointAt4 = Character.codePointAt(str5, 1) - (-127397);
                    char[] chars3 = Character.toChars(codePointAt3);
                    chars3.getClass();
                    char[] chars4 = Character.toChars(codePointAt4);
                    chars4.getClass();
                    str = new String(ArraysKt___ArraysJvmKt.plus(chars3, chars4));
                }
                String str6 = country2.name;
                CharRange charRange2 = PhoneNumberFormatter.VALID_INPUT_RANGE;
                String str7 = countryCode2.value;
                str7.getClass();
                Map map2 = PhoneNumberFormatter.allMetadata;
                String upperCase2 = str7.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                PhoneNumberFormatter.Metadata metadata2 = (PhoneNumberFormatter.Metadata) map2.get(upperCase2);
                break;
            case 5:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.second;
                bool.booleanValue();
                break;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                ContentType.Companion.getClass();
                SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.PhoneNumberNational);
                break;
            case 7:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                break;
            case 8:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 9:
                String str8 = (String) obj;
                str8.getClass();
                break;
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                break;
            case 11:
                TextFieldState textFieldState = (TextFieldState) obj;
                textFieldState.getClass();
                break;
            case 12:
                ((String) obj).getClass();
                break;
            case 13:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 14:
                break;
            case 15:
                ((ModalBottomSheetValue) obj).getClass();
                break;
            case 16:
                StripeImageState stripeImageState = (StripeImageState) obj;
                stripeImageState.getClass();
                break;
            case 17:
                ((Boolean) obj).booleanValue();
                break;
            case 18:
                ((TextLayoutResult) obj).getClass();
                break;
            case 19:
                ((Placeable.PlacementScope) obj).getClass();
                break;
            case 20:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                break;
            case 21:
                MatchResult matchResult2 = (MatchResult) obj;
                matchResult2.getClass();
                break;
            case 22:
                Byte b = (Byte) obj;
                b.byteValue();
                break;
            case 23:
                ((DocumentFile.Remote) obj).getClass();
                break;
            case 24:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                updater.setOutput(DocumentWorkflow.Output.Finished.INSTANCE);
                break;
            case 25:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.setOutput(DocumentWorkflow.Output.Canceled.INSTANCE);
                break;
            case 26:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                updater3.setOutput(DocumentWorkflow.Output.Back.INSTANCE);
                break;
            case 27:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                updater4.state = ((DocumentWorkflow.State) updater4.state).copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.SelectFileFromDocuments).copyWithUploadOptions$document_release(false);
                break;
            case 28:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.state = ((DocumentWorkflow.State) updater5.state).copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.SelectImageFromPhotoLibrary).copyWithUploadOptions$document_release(false);
                break;
            default:
                WorkflowAction.Updater updater6 = (WorkflowAction.Updater) obj;
                updater6.getClass();
                updater6.state = ((DocumentWorkflow.State) updater6.state).copyWithCaptureState$document_release(DocumentWorkflow.State.CaptureState.CheckCameraPermissions).copyWithUploadOptions$document_release(false);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EncodeKt$$ExternalSyntheticLambda0(SimpleTextFieldController simpleTextFieldController, int i) {
        this.$r8$classId = i;
    }
}
