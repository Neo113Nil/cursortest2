package kotlin.reflect.full;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1;
import androidx.camera.camera2.impl.CapturePipelineImpl$toCameraCaptureResult$frameInfo$1;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.material3.DateInputKt$DateInputContent$3;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.common.PlayerListener;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.ui.Ui;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.screens.app.LocalMenuPickerScreen;
import app.cash.zipline.CallResult;
import coil3.size.SizeKt;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.zzl;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.blockers.analytics.BlockerResponse;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.deposits.physical.screens.PhysicalCashDepositAddressEntryScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositEditPaycheckAllocationScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormDetailsScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.filament.util.Mesh;
import com.squareup.cash.investing.components.InvestingHomeRowAdapter;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.recurring.db.RecurringPreferenceId;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.Quadruple;
import com.squareup.util.cash.ProtoDefaults;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$waitForExternalBrowserReturn$2$observer$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class KClasses$$Lambda$2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;

    public KClasses$$Lambda$2(BitmapFactory.Options options, InputStream inputStream) {
        this.$r8$classId = 23;
        this.arg$0 = inputStream;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.$r8$classId;
        int i2 = 2;
        boolean z = false;
        r3 = false;
        r3 = false;
        boolean z2 = false;
        Float f = null;
        int i3 = 1;
        Object obj2 = this.arg$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(Intrinsics.areEqual((KClass) obj, (KClass) obj2));
            case 1:
                FrameInfo frameInfo = (FrameInfo) obj;
                frameInfo.getClass();
                CapturePipelineImpl capturePipelineImpl = (CapturePipelineImpl) obj2;
                AndroidFrameMetadata metadata = frameInfo.getMetadata();
                CapturePipelineImpl$toCameraCaptureResult$frameInfo$1 capturePipelineImpl$toCameraCaptureResult$frameInfo$1 = new CapturePipelineImpl$toCameraCaptureResult$frameInfo$1(metadata, capturePipelineImpl);
                CapturePipelineImpl$emptyRequestMetadata$1 capturePipelineImpl$emptyRequestMetadata$1 = capturePipelineImpl.emptyRequestMetadata;
                metadata.captureResult.getFrameNumber();
                return Boolean.valueOf(ConvergenceUtils.is3AConverged(new CaptureResultAdapter(capturePipelineImpl$emptyRequestMetadata$1, capturePipelineImpl$toCameraCaptureResult$frameInfo$1), true));
            case 2:
                float[] fArr = ((Matrix) obj).values;
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj2;
                if (layoutCoordinates.isAttached()) {
                    ValueInsets.findRootCoordinates(layoutCoordinates).mo845transformFromEL8BTi8(layoutCoordinates, fArr);
                }
                return Unit.INSTANCE;
            case 3:
                SelectionManager selectionManager = (SelectionManager) obj2;
                if (BasicTextKt.platformDefaultKeyMapping.m357mapZmokQxo(((KeyEvent) obj).nativeKeyEvent) == KeyCommand.COPY) {
                    selectionManager.copy$foundation();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                Object obj3 = ((Ref$ObjectRef) obj2).element;
                if (obj3 != null) {
                    ((PlayerListener) obj3).isCancelled.set(true);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("listener");
                throw null;
            case 5:
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                Location.LocationDetail locationDetail = (Location.LocationDetail) ((State) obj2).getValue();
                locationDetail.getClass();
                LocationMenu locationMenu = locationDetail.menu;
                locationMenu.getClass();
                return new LocalMenuPickerScreen(locationMenu.menus, askedQuestion);
            case 6:
                ((CallResult) obj2).cancel();
                return Unit.INSTANCE;
            case 7:
                zzl zzlVar = (zzl) obj2;
                ImageView imageView = zzlVar.zzc;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("image");
                    throw null;
                }
                imageView.setVisibility(8);
                FrameLayout frameLayout = zzlVar.zzf;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("loadingFailedUi");
                throw null;
            case 8:
                AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                askedQuestion2.getClass();
                return new PhysicalCashDepositAddressEntryScreen((PhysicalCashDepositAddressEntryScreen.SearchScreen) obj2, PhysicalCashDepositAddressEntryScreen.AddressSearchType.BITCOIN_MAP, BlockersData.DUMMY, askedQuestion2);
            case 9:
                ApiResult.Success success = (ApiResult.Success) obj;
                success.getClass();
                VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) success.response;
                ResponseContext responseContext = verifyIdentityResponse.response_context;
                if (responseContext == null || (str = responseContext.dialog_message) == null) {
                    str = responseContext != null ? responseContext.failure_message : null;
                    if (str == null) {
                        str = verifyIdentityResponse.status != VerifyIdentityResponse.Status.SUCCESS ? ((AndroidStringManager) ((DisclosurePresenter) obj2).stringManager).get(R.string.blockers_verify_identity_failed) : null;
                    }
                }
                VerifyIdentityResponse.Status status = verifyIdentityResponse.status;
                if (status == null) {
                    status = ProtoDefaults.VERIFY_IDENTITY_STATUS;
                }
                int ordinal = status.ordinal();
                int i4 = 4;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return null;
                    }
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return new BlockerResponse.Error(status.name(), str, i4);
            case 10:
                Quadruple quadruple = (Quadruple) obj;
                quadruple.getClass();
                Quadruple quadruple2 = (Quadruple) quadruple.second;
                ByteBuffer byteBuffer = (ByteBuffer) quadruple2.first;
                ByteBuffer byteBuffer2 = (ByteBuffer) quadruple2.second;
                InputStream inputStream = (InputStream) quadruple2.third;
                InputStream inputStream2 = (InputStream) quadruple2.fourth;
                CardModelView cardModelView = (CardModelView) obj2;
                Material createMaterial = cardModelView.createMaterial(byteBuffer);
                cardModelView.material = createMaterial;
                MaterialInstance createInstance = createMaterial.createInstance();
                createInstance.setCullingMode();
                cardModelView.materialInstanceBack = createInstance;
                cardModelView.meshBack = cardModelView.createMesh(inputStream, createInstance);
                inputStream.reset();
                Material material = cardModelView.material;
                material.getClass();
                MaterialInstance createInstance2 = material.createInstance();
                cardModelView.materialInstance = createInstance2;
                Mesh createMesh = cardModelView.createMesh(inputStream, createInstance2);
                cardModelView.mesh = createMesh;
                float[] fArr2 = (float[]) createMesh.aabb.mHalfExtent;
                if (fArr2.length != 0) {
                    float f2 = fArr2[0];
                    int length = fArr2.length - 1;
                    if (1 <= length) {
                        while (true) {
                            f2 = Math.max(f2, fArr2[i3]);
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    f = Float.valueOf(f2);
                }
                f.getClass();
                cardModelView.setCardScale(3.0f / (f.floatValue() * 2.0f));
                Material createMaterial2 = cardModelView.createMaterial(byteBuffer2);
                cardModelView.copyMaterial = createMaterial2;
                MaterialInstance createInstance3 = createMaterial2.createInstance();
                cardModelView.textMaterialInstance = createInstance3;
                cardModelView.contouredTextMesh = cardModelView.createMesh(inputStream2, createInstance3);
                cardModelView.childEntityFactory = new CardModelView$1$3$4$2(z ? 1 : 0, inputStream, cardModelView);
                return Unit.INSTANCE;
            case 11:
                AskedQuestion askedQuestion3 = (AskedQuestion) obj;
                askedQuestion3.getClass();
                return new PatternSignatureStampsV2(((CardStudioScreen) ((CardStudioPresenter) obj2).args).availableStamps, askedQuestion3);
            case 12:
                AskedQuestion askedQuestion4 = (AskedQuestion) obj;
                askedQuestion4.getClass();
                CardStudioViewModelV2.Content content = (CardStudioViewModelV2.Content) obj2;
                return new CardStudioMoreSheetScreen(content.cashtag, content.isShowingCashtag, content.isShowingCashtagToggle, askedQuestion4);
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                PaymentDeviceItemViewModel paymentDeviceItemViewModel = (PaymentDeviceItemViewModel) obj2;
                String str2 = paymentDeviceItemViewModel.accessibilityText;
                if (str2.length() == 0) {
                    str2 = paymentDeviceItemViewModel.name;
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2);
                return Unit.INSTANCE;
            case 14:
                AskedQuestion askedQuestion5 = (AskedQuestion) obj;
                askedQuestion5.getClass();
                return new DirectDepositEditPaycheckAllocationScreen(((DirectDepositManualFormDetailsScreen) ((CardStudioPresenter) obj2).appConfig).token, askedQuestion5);
            case 15:
                AskedQuestion askedQuestion6 = (AskedQuestion) obj;
                askedQuestion6.getClass();
                return new DirectDepositEditPaycheckAllocationScreen(((DirectDepositUpdateManualFormScreen) ((LocalEditorialPresenter) obj2).screen).token, askedQuestion6);
            case 16:
                String str3 = ((RecurringPreferenceId) obj).entityId;
                str3.getClass();
                Ui.EventReceiver eventReceiver = ((InvestingHomeRowAdapter) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new InvestingHomeViewEvent.DependentAutoInvestClicked(str3));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 17:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                String str4 = ((StockContentModel) obj2).stockPrice;
                if (str4 != null) {
                    realCellActivityAccessoryScope.amount(new ComposableLambdaImpl(new DateInputKt$DateInputContent$3(str4, i2), true, -1768445641));
                }
                return Unit.INSTANCE;
            case 18:
                Element element = (Element) obj;
                element.getClass();
                return Boolean.valueOf(element.getId() == ((PersonalizePaymentViewEvent.RequestFocus) ((PersonalizePaymentViewEvent) obj2)).element.getId());
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((SavingsAppletTileViewModel.Installed.GoalSet) ((SavingsAppletTileViewModel.Installed) obj2)).iconAccessibilityLabel);
                return Unit.INSTANCE;
            case 20:
                Timber.Forest forest = Timber.Forest;
                forest.tag("3DS");
                forest.d("3DS SDK init was canceled upstream", new Object[0]);
                try {
                    RealThreeDsService realThreeDsService = (RealThreeDsService) obj2;
                    ThreeDS2Service threeDS2Service = realThreeDsService.threeDsService;
                    if (threeDS2Service != null) {
                        threeDS2Service.cleanup(realThreeDsService.context);
                    }
                } catch (Exception e) {
                    Timber.Forest forest2 = Timber.Forest;
                    forest2.tag("3DS");
                    forest2.w("3DS SDK cleanup failed during cancellation", new Object[0], e);
                }
                return Unit.INSTANCE;
            case 21:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return BlockersData.copy$default(blockersData, null, null, null, (Flow$Type) obj2, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535);
            case 22:
                ((HCaptcha) obj2).reset();
                return Unit.INSTANCE;
            case 23:
                InputStream inputStream3 = (InputStream) obj2;
                try {
                    Result.Companion companion = Result.Companion;
                    inputStream3.close();
                } catch (Throwable unused) {
                    Result.Companion companion2 = Result.Companion;
                }
                return Unit.INSTANCE;
            case 24:
                ProcessLifecycleOwner.newInstance.registry.removeObserver((IntegrationBrowserWorker$waitForExternalBrowserReturn$2$observer$1) obj2);
                return Unit.INSTANCE;
            case 25:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                DrawScope.m740drawImagegbVJVH8$default(drawScope, new AndroidImageBitmap((Bitmap) obj2), 0L, RecyclerView.DECELERATION_RATE, null, 0, 62);
                return Unit.INSTANCE;
            case 26:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                SizeKt.drawLayer(drawScope2, (GraphicsLayer) obj2);
                return Unit.INSTANCE;
            case 27:
                KotlinTypeRefiner kotlinTypeRefiner = (KotlinTypeRefiner) obj;
                AbstractClassDescriptor abstractClassDescriptor = ((AbstractClassDescriptor.AnonymousClass1) obj2).this$0;
                ClassifierDescriptor refineDescriptor = kotlinTypeRefiner.refineDescriptor(abstractClassDescriptor);
                return refineDescriptor == null ? (SimpleType) abstractClassDescriptor.defaultType.invoke() : refineDescriptor instanceof TypeAliasDescriptor ? KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) refineDescriptor, TypeUtils.getDefaultTypeProjections(refineDescriptor.getTypeConstructor().getParameters())) : refineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) refineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : refineDescriptor.getDefaultType();
            case 28:
                AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = (AbstractTypeAliasDescriptor) obj2;
                UnwrappedType unwrappedType = (UnwrappedType) obj;
                int i5 = AbstractTypeAliasDescriptor.$r8$clinit;
                unwrappedType.getClass();
                if (!KotlinTypeKt.isError(unwrappedType)) {
                    ClassifierDescriptor mo4153getDeclarationDescriptor = unwrappedType.getConstructor().mo4153getDeclarationDescriptor();
                    if ((mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) && !Intrinsics.areEqual(((TypeParameterDescriptor) mo4153getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                int i6 = AbstractTypeAliasDescriptor.$r8$clinit;
                ClassifierDescriptor refineDescriptor2 = ((KotlinTypeRefiner) obj).refineDescriptor((DeserializedTypeAliasDescriptor) obj2);
                if (refineDescriptor2 != null) {
                    return refineDescriptor2.getDefaultType();
                }
                return null;
        }
    }

    public /* synthetic */ KClasses$$Lambda$2(Object obj, int i) {
        this.$r8$classId = i;
        this.arg$0 = obj;
    }
}
