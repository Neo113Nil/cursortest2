package papa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationHelpBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerKey;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet;
import com.withpersona.sdk2.inquiry.steps.ui.components.DecimalPrecisionFilter;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2InputSelectBottomSheetBinding;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import dev.chrisbanes.haze.HazeEffectNode;
import dev.chrisbanes.haze.HazeEffectNode$areaPreDrawListener$2$1;
import dev.chrisbanes.haze.HazeSourceNode;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.KotlinGenericDeclaration;
import kotlin.reflect.KClass;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.ContextDescriptor;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import okhttp3.internal.Tags;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketWriter;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final /* synthetic */ class Choreographers$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Choreographers$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = R.id.list_content_separator;
        int i3 = 2;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Choreographers.INSTANCE.getClass();
                Choreographers.postOnCurrentFrameRendered$papa_release((OnFrameRenderedListener) obj);
                return Unit.INSTANCE;
            case 1:
                SpotlightView spotlightView = (SpotlightView) obj;
                int i4 = SpotlightView.$r8$clinit;
                Object parent = spotlightView.getParent();
                if (parent instanceof View) {
                    spotlightView.setTargetView(((View) parent).findViewById(spotlightView.targetViewId));
                }
                return Unit.INSTANCE;
            case 2:
                Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) obj;
                int i5 = Pi2DotsTabIndicator.$r8$clinit;
                pi2DotsTabIndicator.post(new Pi2DotsTabIndicator$$ExternalSyntheticLambda1(pi2DotsTabIndicator, i3));
                return Unit.INSTANCE;
            case 3:
                ((UiStepBottomSheet) obj).onCancelled.invoke();
                return Unit.INSTANCE;
            case 4:
                ShapeableImageView shapeableImageView = (ShapeableImageView) obj;
                ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
                if (layoutParams == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    return null;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.horizontalBias = 1.0f;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                shapeableImageView.setLayoutParams(layoutParams2);
                return Unit.INSTANCE;
            case 5:
                return Pattern.compile("-?[0-9]*+((\\.[0-9]{0," + ((DecimalPrecisionFilter) obj).precision + "})?)||(\\.)?");
            case 6:
                EditText editText = (EditText) obj;
                editText.requestFocus();
                editText.setSelection(editText.length());
                return Unit.INSTANCE;
            case 7:
                ViewGroup viewGroup = ((HelpBottomSheetController) obj).contentView;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pi2_navigation_help_bottom_sheet, viewGroup, false);
                viewGroup.addView(inflate);
                int i6 = R.id.action_button;
                MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(inflate, R.id.action_button);
                if (materialButton != null) {
                    i6 = R.id.bottom_inset;
                    Space space = (Space) ViewBindings.findChildViewById(inflate, R.id.bottom_inset);
                    if (space != null) {
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
                        if (frameLayout != null) {
                            i6 = R.id.bottom_sheet_content;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet_content);
                            if (linearLayout != null) {
                                i6 = R.id.close_button;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.close_button);
                                if (imageView != null) {
                                    i6 = R.id.dots_indicator;
                                    Pi2DotsTabIndicator pi2DotsTabIndicator2 = (Pi2DotsTabIndicator) ViewBindings.findChildViewById(inflate, R.id.dots_indicator);
                                    if (pi2DotsTabIndicator2 != null) {
                                        View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.list_content_separator);
                                        if (findChildViewById != null) {
                                            i2 = R.id.secondary_action_button;
                                            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(inflate, R.id.secondary_action_button);
                                            if (materialButton2 != null) {
                                                i2 = R.id.tint_screen;
                                                View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.tint_screen);
                                                if (findChildViewById2 != null) {
                                                    i2 = R.id.title;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                    if (textView != null) {
                                                        i2 = R.id.view_pager;
                                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(inflate, R.id.view_pager);
                                                        if (viewPager2 != null) {
                                                            return new Pi2NavigationHelpBottomSheetBinding((FrameLayout) inflate, materialButton, space, frameLayout, linearLayout, imageView, pi2DotsTabIndicator2, findChildViewById, materialButton2, findChildViewById2, textView, viewPager2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i2 = R.id.bottom_sheet;
                        }
                        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                        return null;
                    }
                }
                i2 = i6;
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 8:
                Pi2NavigationHelpBottomSheetBinding pi2NavigationHelpBottomSheetBinding = (Pi2NavigationHelpBottomSheetBinding) obj;
                BottomSheetBehavior.from(pi2NavigationHelpBottomSheetBinding.bottomSheet).setState(5);
                FrameLayout frameLayout2 = pi2NavigationHelpBottomSheetBinding.rootView;
                frameLayout2.getClass();
                BackPressHandlerKt.setBackPressedHandler(frameLayout2, null);
                return Unit.INSTANCE;
            case 9:
                ViewGroup viewGroup2 = (ViewGroup) ((Response) obj).result;
                View inflate2 = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.pi2_input_select_bottom_sheet, viewGroup2, false);
                viewGroup2.addView(inflate2);
                FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(inflate2, R.id.bottom_sheet);
                if (frameLayout3 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(inflate2, R.id.list_content);
                    if (linearLayout2 != null) {
                        View findChildViewById3 = ViewBindings.findChildViewById(inflate2, R.id.list_content_separator);
                        if (findChildViewById3 != null) {
                            i2 = R.id.nav_bar_back_button;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate2, R.id.nav_bar_back_button);
                            if (imageView2 != null) {
                                i2 = R.id.recyclerview_inquiry_select_list;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(inflate2, R.id.recyclerview_inquiry_select_list);
                                if (recyclerView != null) {
                                    i2 = R.id.search_bar_edit_text;
                                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(inflate2, R.id.search_bar_edit_text);
                                    if (textInputEditText != null) {
                                        i2 = R.id.search_bar_text_input;
                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(inflate2, R.id.search_bar_text_input);
                                        if (textInputLayout != null) {
                                            i2 = R.id.shadow;
                                            View findChildViewById4 = ViewBindings.findChildViewById(inflate2, R.id.shadow);
                                            if (findChildViewById4 != null) {
                                                i2 = R.id.textview_input_select_sheet_title;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate2, R.id.textview_input_select_sheet_title);
                                                if (textView2 != null) {
                                                    i2 = R.id.top_app_bar;
                                                    if (((LinearLayout) ViewBindings.findChildViewById(inflate2, R.id.top_app_bar)) != null) {
                                                        return new Pi2InputSelectBottomSheetBinding((FrameLayout) inflate2, frameLayout3, linearLayout2, findChildViewById3, imageView2, recyclerView, textInputEditText, textInputLayout, findChildViewById4, textView2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.list_content;
                    }
                } else {
                    i2 = R.id.bottom_sheet;
                }
                a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 10:
                ((UiWorkflow.Screen.EntryScreen) obj).onCancel.invoke();
                return Unit.INSTANCE;
            case 11:
                ((UiStepStateManager) obj).setOutput(UiWorkflow.Output.Back.INSTANCE);
                return Unit.INSTANCE;
            case 12:
                SystemUiControllerKey systemUiControllerKey = SystemUiControllerKey.INSTANCE;
                SystemUiController systemUiController = ((UiStepFragment) obj).systemUiController;
                if (systemUiController != null) {
                    return new ViewEnvironment(MapsKt__MapsJVMKt.mapOf(new Pair(systemUiControllerKey, systemUiController)));
                }
                Intrinsics.throwUninitializedPropertyAccessException("systemUiController");
                throw null;
            case 13:
                return new HazeEffectNode$areaPreDrawListener$2$1((HazeEffectNode) obj);
            case 14:
                HazeSourceNode hazeSourceNode = (HazeSourceNode) obj;
                boolean isEmpty = hazeSourceNode.area.preDrawListeners.isEmpty();
                StandaloneCoroutine standaloneCoroutine = hazeSourceNode.preDrawJob;
                if (isEmpty) {
                    if (standaloneCoroutine != null) {
                        standaloneCoroutine.cancel(null);
                    }
                    hazeSourceNode.preDrawJob = null;
                } else if (standaloneCoroutine == null || !standaloneCoroutine.isActive()) {
                    hazeSourceNode.preDrawJob = hazeSourceNode.launchPreDraw();
                }
                return Unit.INSTANCE;
            case 15:
                return ((Iterable) obj).iterator();
            case 16:
                Object obj2 = ((KTypeParameterBase) obj).container;
                KotlinGenericDeclaration kotlinGenericDeclaration = obj2 instanceof KotlinGenericDeclaration ? (KotlinGenericDeclaration) obj2 : null;
                if (kotlinGenericDeclaration != null) {
                    return kotlinGenericDeclaration.findJavaDeclaration();
                }
                return null;
            case 17:
                Disposable disposable = (Disposable) ((AtomicReference) obj).getAndSet(EmptyDisposable.INSTANCE);
                if (disposable != null) {
                    disposable.dispose();
                }
                return Unit.INSTANCE;
            case 18:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) obj;
                SerialDescriptorImpl buildSerialDescriptor = Tags.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], new ForwardingFileSystem$$ExternalSyntheticLambda0(polymorphicSerializer, 20));
                KClass kClass = polymorphicSerializer.baseClass;
                kClass.getClass();
                return new ContextDescriptor(buildSerialDescriptor, kClass);
            case 19:
                Http2Connection http2Connection = (Http2Connection) obj;
                http2Connection.getClass();
                try {
                    http2Connection.writer.ping(2, 0, false);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, e);
                }
                return Unit.INSTANCE;
            default:
                _UtilCommonKt.closeQuietly((WebSocketWriter) obj);
                return Unit.INSTANCE;
        }
    }
}
