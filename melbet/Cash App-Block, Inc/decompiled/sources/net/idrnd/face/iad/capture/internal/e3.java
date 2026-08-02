package net.idrnd.face.iad.capture.internal;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.trace.api.tracer.DatadogTracerBuilder;
import com.datadog.android.trace.internal.DatadogTracerBuilderAdapter;
import com.datadog.android.trace.internal.TracingFeature;
import com.datadog.android.trace.opentelemetry.OtelTracerProvider;
import com.datadog.android.trace.opentelemetry.OtelTracerProvider$Builder$build$1$1;
import com.datadog.android.trace.opentelemetry.OtelTracerProvider$get$1;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.Snapshots;
import com.squareup.workflow1.TreeSnapshot;
import com.squareup.workflow1.WorkflowIdentifier;
import com.squareup.workflow1.internal.WorkflowNodeId;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.modal.ModalContainer;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$special$$inlined$lazyViewModel$2;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.misnap.iad.IadFrame;
import okio.Buffer;
import okio.ByteString;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.ast.impl.ListCompositeNode;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class e3 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(Object obj, int i) {
        super(0);
        this.$r8$classId = i;
        this.a = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 0;
        boolean z = false;
        Object obj = this.a;
        switch (i) {
            case 0:
                return Long.valueOf(((IadFrame) ((f3) obj).d.match).b / 1000000);
            case 1:
                OtelTracerProvider.Builder builder = (OtelTracerProvider.Builder) obj;
                InternalSdkCore internalSdkCore = builder.sdkCore;
                SdkFeature feature = internalSdkCore.getFeature("tracing");
                Feature feature2 = feature != null ? feature.wrappedFeature : null;
                TracingFeature tracingFeature = feature2 instanceof TracingFeature ? (TracingFeature) feature2 : null;
                if (feature2 != null && tracingFeature != null) {
                    internalSdkCore.updateFeatureContext("tracing", OtelTracerProvider$Builder$build$1$1.INSTANCE, false);
                }
                DatadogTracerBuilder datadogTracerBuilder = builder.builderDelegate;
                String str = builder.serviceName;
                if (str.length() == 0) {
                    str = internalSdkCore.getService();
                    if (str.length() == 0) {
                        DBUtil.log$default(internalSdkCore.getInternalLogger(), 5, InternalLogger.Target.USER, OtelTracerProvider$get$1.INSTANCE, null, false, 56);
                    }
                }
                DatadogTracerBuilder withServiceName = datadogTracerBuilder.withServiceName(str);
                DatadogTracerBuilderAdapter datadogTracerBuilderAdapter = withServiceName instanceof DatadogTracerBuilderAdapter ? (DatadogTracerBuilderAdapter) withServiceName : null;
                if (datadogTracerBuilderAdapter != null) {
                    datadogTracerBuilderAdapter.sdkV2OTelCompatible = true;
                }
                return new OtelTracerProvider(withServiceName.build(), internalSdkCore.getInternalLogger());
            case 2:
                ((FrameLoader) obj).n = true;
                return Unit.INSTANCE;
            case 3:
                return (ByteString) obj;
            case 4:
                Buffer buffer = new Buffer();
                ((InterceptedRenderContext$send$1) obj).invoke(buffer);
                return buffer.readByteString(buffer.size);
            case 5:
                Buffer buffer2 = (Buffer) obj;
                int readInt = buffer2.readInt();
                MapBuilder mapBuilder = new MapBuilder(readInt);
                while (i2 < readInt) {
                    i2++;
                    ByteString readByteStringWithLength = Snapshots.readByteStringWithLength(buffer2);
                    readByteStringWithLength.getClass();
                    Buffer buffer3 = new Buffer();
                    buffer3.m4333write(readByteStringWithLength);
                    WorkflowNodeId workflowNodeId = new WorkflowNodeId(WorkflowIdentifier.Companion.parse(Snapshots.readByteStringWithLength(buffer3)), Snapshots.readByteStringWithLength(buffer3).utf8());
                    ByteString readByteStringWithLength2 = Snapshots.readByteStringWithLength(buffer2);
                    readByteStringWithLength2.getClass();
                    Buffer buffer4 = new Buffer();
                    buffer4.m4333write(readByteStringWithLength2);
                    ByteString readByteStringWithLength3 = Snapshots.readByteStringWithLength(buffer4);
                    readByteStringWithLength3.getClass();
                    mapBuilder.put(workflowNodeId, new TreeSnapshot(new Snapshot(new e3(readByteStringWithLength3, 3)), new e3(buffer4, 5)));
                }
                return mapBuilder.build();
            case 6:
                KAnnotatedElement kAnnotatedElement = ((WorkflowIdentifier) obj).f1421type;
                return kAnnotatedElement instanceof KClass ? PapaEvent.getJavaClass((KClass) kAnnotatedElement).getName() : kAnnotatedElement.toString();
            case 7:
                return (LinkedHashMap) obj;
            case 8:
                ModalContainer modalContainer = (ModalContainer) obj;
                LifecycleOwner lifecycleOwner = DBUtil.get(modalContainer);
                RealWorkflowLifecycleOwner realWorkflowLifecycleOwner = lifecycleOwner instanceof RealWorkflowLifecycleOwner ? (RealWorkflowLifecycleOwner) lifecycleOwner : null;
                if (realWorkflowLifecycleOwner != null) {
                    return realWorkflowLifecycleOwner;
                }
                a$$ExternalSyntheticBUOutline0.m1430m((Object) Intrinsics.stringPlus(modalContainer, "Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in "));
                return null;
            case 9:
                return (DocumentStepFragment) obj;
            case 10:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 11:
                return (GovernmentIdStepFragment) obj;
            case 12:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 13:
                return (IntegrationStepFragment) obj;
            case 14:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 15:
                return (InquiryFragment) obj;
            case 16:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 17:
                return (ViewModelStoreOwner) ((InquiryWorkflowFragment$special$$inlined$lazyViewModel$2) obj).invoke();
            case 18:
                return (ViewModelStoreOwner) ((InquiryWorkflowFragment$special$$inlined$lazyViewModel$2) obj).invoke();
            case 19:
                return (PermissionRequestFragment) obj;
            case 20:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 21:
                return (SelfieStepFragment) obj;
            case 22:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            case 23:
                return (UiStepFragment) obj;
            case 24:
                return (ViewModelStoreOwner) ((e3) obj).invoke();
            default:
                ListCompositeNode listCompositeNode = (ListCompositeNode) obj;
                if (!KClasses$$Lambda$1.access$hasLooseContent(listCompositeNode)) {
                    for (ASTNodeImpl aSTNodeImpl : listCompositeNode.children) {
                        if (!Intrinsics.areEqual(aSTNodeImpl.f1630type, MarkdownTokenTypes.LIST_ITEM) || !KClasses$$Lambda$1.access$hasLooseContent(aSTNodeImpl)) {
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
