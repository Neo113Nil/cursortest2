package com.squareup.workflow1;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.LifecycleRegistry;
import androidx.room.util.DBUtil;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.ParseSvg_androidKt;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.internal.utils.WriteOperation$submit$1$1;
import com.fillr.profile.adapter.ProfileAdapter;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.AttachedScope;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.squareup.workflow1.ui.androidx.RealWorkflowLifecycleOwner;
import com.squareup.workflow1.ui.modal.ModalContainer;
import com.withpersona.sdk2.inquiry.permissions.OldCheckRequestPermissionRationaleStateView;
import com.withpersona.sdk2.inquiry.permissions.databinding.Pi2CheckRequestPermissionRationaleStateBinding;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import nl.dionsegijn.konfetti.core.models.CoreRectImpl;
import okio.BufferedSink;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes9.dex */
public final class InterceptedRenderContext$send$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterceptedRenderContext$send$1(Object obj, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r1 == null) goto L14;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Integer num = null;
        boolean z = true;
        r2 = true;
        boolean z2 = true;
        z = true;
        final int i2 = 0;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                WorkflowAction workflowAction = (WorkflowAction) obj;
                workflowAction.getClass();
                ((InterceptedRenderContext) obj2).baseRenderContext.getActionSink().send(workflowAction);
                return Unit.INSTANCE;
            case 1:
                EventBatchWriter eventBatchWriter = (EventBatchWriter) obj;
                eventBatchWriter.getClass();
                WriteOperation writeOperation = (WriteOperation) obj2;
                DataWriter dataWriter = (DataWriter) writeOperation.rumDataWriter;
                AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) writeOperation.advancedRumMonitor;
                if (dataWriter instanceof NoOpDataWriter) {
                    DBUtil.log$default(((InternalSdkCore) writeOperation.sdkCore).getInternalLogger(), 3, InternalLogger.Target.USER, WriteOperation$submit$1$1.INSTANCE, null, false, 56);
                    if (advancedRumMonitor != null) {
                        ((Function1) writeOperation.onError).invoke(advancedRumMonitor);
                    }
                } else {
                    try {
                        if (!dataWriter.write(eventBatchWriter, ((Function0) writeOperation.eventSource).invoke(), writeOperation.eventType)) {
                            writeOperation.notifyEventWriteFailure(null);
                        } else if (advancedRumMonitor != null) {
                            ((Function1) writeOperation.onSuccess).invoke(advancedRumMonitor);
                        }
                    } catch (Exception e) {
                        writeOperation.notifyEventWriteFailure(e);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                WeakReference weakReference = (WeakReference) obj;
                weakReference.getClass();
                if (weakReference.get() != null && !Intrinsics.areEqual(weakReference.get(), (Activity) obj2)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((AttachedScope) obj2).attachHandlers.clear();
                return Unit.INSTANCE;
            case 4:
                BufferedSink bufferedSink = (BufferedSink) obj;
                bufferedSink.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.getClass();
                obtain.writeParcelable((Parcelable) obj2, 0);
                byte[] marshall = obtain.marshall();
                marshall.getClass();
                bufferedSink.write(marshall);
                obtain.recycle();
                return Unit.INSTANCE;
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                TextControllerImpl textControllerImpl = (TextControllerImpl) obj2;
                String obj3 = charSequence != null ? charSequence.toString() : null;
                if (obj3 == null) {
                    obj3 = "";
                }
                textControllerImpl.setTextValue(obj3);
                return Unit.INSTANCE;
            case 6:
                ((View) obj).getClass();
                LifecycleRegistry lifecycleRegistry = ((RealWorkflowLifecycleOwner) ((ModalContainer) obj2).parentLifecycleOwner$delegate.getValue()).localLifecycle;
                lifecycleRegistry.getClass();
                return lifecycleRegistry;
            case 7:
                final ViewBinding viewBinding = (ViewBinding) obj;
                viewBinding.getClass();
                final OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView = (OldCheckRequestPermissionRationaleStateView) obj2;
                final int i3 = z ? 1 : 0;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$special$$inlined$bind$1$1
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj4, ViewEnvironment viewEnvironment) {
                        int i4 = i3;
                        AndroidViewRendering androidViewRendering = oldCheckRequestPermissionRationaleStateView;
                        ViewBinding viewBinding2 = viewBinding;
                        viewEnvironment.getClass();
                        switch (i4) {
                            case 0:
                                Pi2GenericUiStepBottomSheetBinding pi2GenericUiStepBottomSheetBinding = (Pi2GenericUiStepBottomSheetBinding) viewBinding2;
                                pi2GenericUiStepBottomSheetBinding.getClass();
                                ((UiStepBottomSheet) androidViewRendering).showRendering(pi2GenericUiStepBottomSheetBinding, (UiStepBottomSheet) obj4);
                                break;
                            default:
                                OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2 = (OldCheckRequestPermissionRationaleStateView) obj4;
                                Pi2CheckRequestPermissionRationaleStateBinding pi2CheckRequestPermissionRationaleStateBinding = (Pi2CheckRequestPermissionRationaleStateBinding) viewBinding2;
                                Context context = pi2CheckRequestPermissionRationaleStateBinding.rootView.getContext();
                                context.getClass();
                                AppCompatActivity activity = ContextUtilsKt.getActivity(context);
                                if (activity == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    break;
                                } else {
                                    pi2CheckRequestPermissionRationaleStateBinding.rootView.post(new ProfileAdapter.AnonymousClass8(pi2CheckRequestPermissionRationaleStateBinding, (OldCheckRequestPermissionRationaleStateView) androidViewRendering, oldCheckRequestPermissionRationaleStateView2, false, activity, 18));
                                    break;
                                }
                        }
                    }
                };
            case 8:
                final ViewBinding viewBinding2 = (ViewBinding) obj;
                viewBinding2.getClass();
                final UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) obj2;
                return new LayoutRunner() { // from class: com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$special$$inlined$bind$1$1
                    @Override // com.squareup.workflow1.ui.LayoutRunner
                    public final void showRendering(Object obj4, ViewEnvironment viewEnvironment) {
                        int i4 = i2;
                        AndroidViewRendering androidViewRendering = uiStepBottomSheet;
                        ViewBinding viewBinding22 = viewBinding2;
                        viewEnvironment.getClass();
                        switch (i4) {
                            case 0:
                                Pi2GenericUiStepBottomSheetBinding pi2GenericUiStepBottomSheetBinding = (Pi2GenericUiStepBottomSheetBinding) viewBinding22;
                                pi2GenericUiStepBottomSheetBinding.getClass();
                                ((UiStepBottomSheet) androidViewRendering).showRendering(pi2GenericUiStepBottomSheetBinding, (UiStepBottomSheet) obj4);
                                break;
                            default:
                                OldCheckRequestPermissionRationaleStateView oldCheckRequestPermissionRationaleStateView2 = (OldCheckRequestPermissionRationaleStateView) obj4;
                                Pi2CheckRequestPermissionRationaleStateBinding pi2CheckRequestPermissionRationaleStateBinding = (Pi2CheckRequestPermissionRationaleStateBinding) viewBinding22;
                                Context context = pi2CheckRequestPermissionRationaleStateBinding.rootView.getContext();
                                context.getClass();
                                AppCompatActivity activity = ContextUtilsKt.getActivity(context);
                                if (activity == null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                    break;
                                } else {
                                    pi2CheckRequestPermissionRationaleStateBinding.rootView.post(new ProfileAdapter.AnonymousClass8(pi2CheckRequestPermissionRationaleStateBinding, (OldCheckRequestPermissionRationaleStateView) androidViewRendering, oldCheckRequestPermissionRationaleStateView2, false, activity, 18));
                                    break;
                                }
                        }
                    }
                };
            case 9:
                ((LayoutCoordinates) obj).getClass();
                ((MutableState) obj2).setValue(new CoreRectImpl((int) (r11.mo838getSizeYbymL2g() >> 32), (int) (r11.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
            default:
                LookaheadText$Position lookaheadText$Position = (LookaheadText$Position) obj;
                lookaheadText$Position.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints = (CommonMarkdownConstraints) obj2;
                CommonMarkdownConstraints applyToNextLine$1 = commonMarkdownConstraints.applyToNextLine$1(lookaheadText$Position);
                String str = lookaheadText$Position.currentLine;
                int charsEaten = ParseSvg_androidKt.getCharsEaten(applyToNextLine$1, str);
                if (ParseSvg_androidKt.upstreamWith(applyToNextLine$1, commonMarkdownConstraints)) {
                    if (charsEaten < str.length()) {
                        LookaheadText$Position nextPosition = lookaheadText$Position.nextPosition(charsEaten + 1);
                        if (nextPosition != null) {
                            num = nextPosition.charsToNonWhitespace();
                            break;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
                z2 = false;
                return Boolean.valueOf(z2);
        }
    }
}
