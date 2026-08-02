package kotlin.time;

import android.graphics.Typeface;
import android.view.View;
import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BackgroundImage;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeStyleKt$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.sequences.Sequence;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.StringOpsKt;
import okio.Utf8;
import org.slf4j.Marker;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final /* synthetic */ class InstantKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InstantKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UiState.Displaying displaying;
        int i = this.$r8$classId;
        UiWorkflow.Output.Completed completed = UiWorkflow.Output.Completed.INSTANCE;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 1:
                Option option = (Option) obj;
                option.getClass();
                return option.text;
            case 2:
                View view = (View) obj;
                view.getClass();
                return Boolean.valueOf(view instanceof BackgroundImage);
            case 3:
                ((Typeface) obj).getClass();
                return Unit.INSTANCE;
            case 4:
                SelectedFile selectedFile = (SelectedFile) obj;
                selectedFile.getClass();
                return selectedFile.fileName;
            case 5:
                Option option2 = (Option) obj;
                option2.getClass();
                return option2.text;
            case 6:
                ((GovernmentIdNfcScanComponent) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                ((VerifyPersonaButtonComponent) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                Object obj2 = updater.state;
                displaying = obj2 instanceof UiState.Displaying ? (UiState.Displaying) obj2 : null;
                if (displaying == null) {
                    return Unit.INSTANCE;
                }
                UiWorkflow.outputSubmit(updater, displaying);
                return Unit.INSTANCE;
            case 9:
                WorkflowAction.Updater updater2 = (WorkflowAction.Updater) obj;
                updater2.getClass();
                updater2.setOutput(completed);
                return Unit.INSTANCE;
            case 10:
                WorkflowAction.Updater updater3 = (WorkflowAction.Updater) obj;
                updater3.getClass();
                Object obj3 = updater3.state;
                displaying = obj3 instanceof UiState.Displaying ? (UiState.Displaying) obj3 : null;
                if (displaying == null) {
                    return Unit.INSTANCE;
                }
                UiWorkflow.outputSubmit(updater3, displaying);
                return Unit.INSTANCE;
            case 11:
                ButtonComponent buttonComponent = (ButtonComponent) obj;
                buttonComponent.getClass();
                return Boolean.valueOf(buttonComponent.getAutoSubmitIntervalSeconds() != null);
            case 12:
                WorkflowAction.Updater updater4 = (WorkflowAction.Updater) obj;
                updater4.getClass();
                Object obj4 = updater4.state;
                UiState.Displaying displaying2 = obj4 instanceof UiState.Displaying ? (UiState.Displaying) obj4 : null;
                if (displaying2 == null) {
                    return Unit.INSTANCE;
                }
                updater4.state = UiState.Displaying.copy$default(displaying2, null, null, null, null, null, null, false, null, null, null, false, null, 0, 65471);
                updater4.setOutput(completed);
                return Unit.INSTANCE;
            case 13:
                WorkflowAction.Updater updater5 = (WorkflowAction.Updater) obj;
                updater5.getClass();
                updater5.setOutput(UiWorkflow.Output.Back.INSTANCE);
                return Unit.INSTANCE;
            case 14:
                ButtonComponent buttonComponent2 = (ButtonComponent) obj;
                buttonComponent2.getClass();
                return Boolean.valueOf(buttonComponent2.getAutoSubmitIntervalSeconds() != null);
            case 15:
                return Unit.INSTANCE;
            case 16:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("exchange_data");
                return Unit.INSTANCE;
            case 17:
                KTypeProjection kTypeProjection = (KTypeProjection) obj;
                kTypeProjection.getClass();
                KVariance kVariance = kTypeProjection.variance;
                if (kVariance == null) {
                    return Marker.ANY_MARKER;
                }
                KType kType = kTypeProjection.f1521type;
                TypeReference typeReference = kType instanceof TypeReference ? (TypeReference) kType : null;
                String asString = typeReference != null ? typeReference.asString(true) : String.valueOf(kType);
                int ordinal = kVariance.ordinal();
                if (ordinal == 0) {
                    return asString;
                }
                if (ordinal == 1) {
                    return "in ".concat(asString);
                }
                if (ordinal == 2) {
                    return "out ".concat(asString);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 18:
                Sequence sequence = (Sequence) obj;
                sequence.getClass();
                return sequence.iterator();
            case 19:
                return obj;
            case 20:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return charSequence.toString();
            case 21:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 22:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    r5 = false;
                }
                return Boolean.valueOf(r5);
            case 23:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 24:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 25:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 26:
                KClass kClass = (KClass) obj;
                kClass.getClass();
                KSerializer serializerOrNull = SerializersKt.serializerOrNull(kClass);
                if (serializerOrNull != null) {
                    return serializerOrNull;
                }
                if (PapaEvent.getJavaClass(kClass).isInterface()) {
                    return new PolymorphicSerializer(kClass);
                }
                return null;
            case 27:
                KClass kClass2 = (KClass) obj;
                kClass2.getClass();
                KSerializer serializerOrNull2 = SerializersKt.serializerOrNull(kClass2);
                if (serializerOrNull2 == null) {
                    serializerOrNull2 = PapaEvent.getJavaClass(kClass2).isInterface() ? new PolymorphicSerializer(kClass2) : null;
                }
                if (serializerOrNull2 != null) {
                    return BuiltinSerializersKt.getNullable(serializerOrNull2);
                }
                return null;
            case 28:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                final HazeStyleKt$$ExternalSyntheticLambda0 hazeStyleKt$$ExternalSyntheticLambda0 = new HazeStyleKt$$ExternalSyntheticLambda0(9);
                SerialDescriptor serialDescriptor = new SerialDescriptor(hazeStyleKt$$ExternalSyntheticLambda0) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1
                    public final Lazy original$delegate;

                    {
                        this.original$delegate = LazyKt.lazy(hazeStyleKt$$ExternalSyntheticLambda0);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List getElementAnnotations(int i2) {
                        return getOriginal().getElementAnnotations(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor getElementDescriptor(int i2) {
                        return getOriginal().getElementDescriptor(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementIndex(String str) {
                        str.getClass();
                        return getOriginal().getElementIndex(str);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getElementName(int i2) {
                        return getOriginal().getElementName(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementsCount() {
                        return getOriginal().getElementsCount();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final Utf8 getKind() {
                        return getOriginal().getKind();
                    }

                    public final SerialDescriptor getOriginal() {
                        return (SerialDescriptor) this.original$delegate.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getSerialName() {
                        return getOriginal().getSerialName();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean isElementOptional(int i2) {
                        return getOriginal().isElementOptional(i2);
                    }
                };
                EmptyList emptyList = EmptyList.INSTANCE;
                classSerialDescriptorBuilder.element("JsonPrimitive", serialDescriptor, emptyList, false);
                final HazeStyleKt$$ExternalSyntheticLambda0 hazeStyleKt$$ExternalSyntheticLambda02 = new HazeStyleKt$$ExternalSyntheticLambda0(10);
                classSerialDescriptorBuilder.element("JsonNull", new SerialDescriptor(hazeStyleKt$$ExternalSyntheticLambda02) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1
                    public final Lazy original$delegate;

                    {
                        this.original$delegate = LazyKt.lazy(hazeStyleKt$$ExternalSyntheticLambda02);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List getElementAnnotations(int i2) {
                        return getOriginal().getElementAnnotations(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor getElementDescriptor(int i2) {
                        return getOriginal().getElementDescriptor(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementIndex(String str) {
                        str.getClass();
                        return getOriginal().getElementIndex(str);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getElementName(int i2) {
                        return getOriginal().getElementName(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementsCount() {
                        return getOriginal().getElementsCount();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final Utf8 getKind() {
                        return getOriginal().getKind();
                    }

                    public final SerialDescriptor getOriginal() {
                        return (SerialDescriptor) this.original$delegate.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getSerialName() {
                        return getOriginal().getSerialName();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean isElementOptional(int i2) {
                        return getOriginal().isElementOptional(i2);
                    }
                }, emptyList, false);
                final HazeStyleKt$$ExternalSyntheticLambda0 hazeStyleKt$$ExternalSyntheticLambda03 = new HazeStyleKt$$ExternalSyntheticLambda0(11);
                classSerialDescriptorBuilder.element("JsonLiteral", new SerialDescriptor(hazeStyleKt$$ExternalSyntheticLambda03) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1
                    public final Lazy original$delegate;

                    {
                        this.original$delegate = LazyKt.lazy(hazeStyleKt$$ExternalSyntheticLambda03);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List getElementAnnotations(int i2) {
                        return getOriginal().getElementAnnotations(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor getElementDescriptor(int i2) {
                        return getOriginal().getElementDescriptor(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementIndex(String str) {
                        str.getClass();
                        return getOriginal().getElementIndex(str);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getElementName(int i2) {
                        return getOriginal().getElementName(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementsCount() {
                        return getOriginal().getElementsCount();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final Utf8 getKind() {
                        return getOriginal().getKind();
                    }

                    public final SerialDescriptor getOriginal() {
                        return (SerialDescriptor) this.original$delegate.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getSerialName() {
                        return getOriginal().getSerialName();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean isElementOptional(int i2) {
                        return getOriginal().isElementOptional(i2);
                    }
                }, emptyList, false);
                final HazeStyleKt$$ExternalSyntheticLambda0 hazeStyleKt$$ExternalSyntheticLambda04 = new HazeStyleKt$$ExternalSyntheticLambda0(12);
                classSerialDescriptorBuilder.element("JsonObject", new SerialDescriptor(hazeStyleKt$$ExternalSyntheticLambda04) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1
                    public final Lazy original$delegate;

                    {
                        this.original$delegate = LazyKt.lazy(hazeStyleKt$$ExternalSyntheticLambda04);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List getElementAnnotations(int i2) {
                        return getOriginal().getElementAnnotations(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor getElementDescriptor(int i2) {
                        return getOriginal().getElementDescriptor(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementIndex(String str) {
                        str.getClass();
                        return getOriginal().getElementIndex(str);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getElementName(int i2) {
                        return getOriginal().getElementName(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementsCount() {
                        return getOriginal().getElementsCount();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final Utf8 getKind() {
                        return getOriginal().getKind();
                    }

                    public final SerialDescriptor getOriginal() {
                        return (SerialDescriptor) this.original$delegate.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getSerialName() {
                        return getOriginal().getSerialName();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean isElementOptional(int i2) {
                        return getOriginal().isElementOptional(i2);
                    }
                }, emptyList, false);
                final HazeStyleKt$$ExternalSyntheticLambda0 hazeStyleKt$$ExternalSyntheticLambda05 = new HazeStyleKt$$ExternalSyntheticLambda0(13);
                classSerialDescriptorBuilder.element("JsonArray", new SerialDescriptor(hazeStyleKt$$ExternalSyntheticLambda05) { // from class: kotlinx.serialization.json.JsonElementSerializersKt$defer$1
                    public final Lazy original$delegate;

                    {
                        this.original$delegate = LazyKt.lazy(hazeStyleKt$$ExternalSyntheticLambda05);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final List getElementAnnotations(int i2) {
                        return getOriginal().getElementAnnotations(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final SerialDescriptor getElementDescriptor(int i2) {
                        return getOriginal().getElementDescriptor(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementIndex(String str) {
                        str.getClass();
                        return getOriginal().getElementIndex(str);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getElementName(int i2) {
                        return getOriginal().getElementName(i2);
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final int getElementsCount() {
                        return getOriginal().getElementsCount();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final Utf8 getKind() {
                        return getOriginal().getKind();
                    }

                    public final SerialDescriptor getOriginal() {
                        return (SerialDescriptor) this.original$delegate.getValue();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final String getSerialName() {
                        return getOriginal().getSerialName();
                    }

                    @Override // kotlinx.serialization.descriptors.SerialDescriptor
                    public final boolean isElementOptional(int i2) {
                        return getOriginal().isElementOptional(i2);
                    }
                }, emptyList, false);
                return Unit.INSTANCE;
            default:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                JsonElement jsonElement = (JsonElement) entry.getValue();
                StringBuilder sb = new StringBuilder();
                StringOpsKt.printQuoted(sb, str);
                sb.append(':');
                sb.append(jsonElement);
                return sb.toString();
        }
    }

    public /* synthetic */ InstantKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
    }
}
