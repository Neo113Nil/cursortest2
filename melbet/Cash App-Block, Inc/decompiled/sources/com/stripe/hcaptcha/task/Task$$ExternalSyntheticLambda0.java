package com.stripe.hcaptcha.task;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.compose.ui.focus.FocusRequester;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import app.cash.broadway.navigation.Navigator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.squareup.cash.R;
import com.squareup.cash.reactions.views.ChooseReactionOverlay$$ExternalSyntheticLambda4;
import com.squareup.cash.screens.Back;
import com.squareup.cash.support.chat.viewmodels.ChatViewModel;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.chat.views.transcript.TranscriptRecyclerView;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.stripe.hcaptcha.HCaptcha;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewBinding;
import com.withpersona.sdk2.inquiry.governmentid.reviewCaptureScreen.BasicGovIdReviewCaptureViewController;
import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController;
import com.withpersona.sdk2.inquiry.ui.SignatureBottomSheetController;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final /* synthetic */ class Task$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Task$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                Iterator it = ((ArrayList) ((HCaptcha) obj).onFailureListeners).iterator();
                while (it.hasNext()) {
                    ((OnFailureListener) it.next()).onFailure(new HCaptchaException(HCaptchaError.TOKEN_TIMEOUT));
                }
                break;
            case 1:
                ((ChooseReactionOverlay$$ExternalSyntheticLambda4) obj).invoke();
                break;
            case 2:
                ChatView chatView = (ChatView) obj;
                boolean z = chatView.restoredFromInstanceState;
                TranscriptRecyclerView transcriptRecyclerView = chatView.chatView;
                if (z) {
                    chatView.restoredFromInstanceState = false;
                    chatView.nextScrollActionAfterContentChange = null;
                } else {
                    ChatViewModel.ScrollAction scrollAction = chatView.nextScrollActionAfterContentChange;
                    if (scrollAction != null) {
                        int i3 = scrollAction.scrollPosition;
                        if (chatView.viewInitialized) {
                            if (i3 >= chatView.chatAdapter.getItemCount() - 1) {
                                transcriptRecyclerView.smoothScrollToBottom();
                            } else {
                                transcriptRecyclerView.smoothScrollToPosition(i3);
                            }
                            chatView.nextScrollActionAfterContentChange = null;
                        } else {
                            int ordinal = scrollAction.snapPreference.ordinal();
                            if (ordinal == 0) {
                                i = PKIFailureInfo.systemUnavail;
                            } else if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                i = transcriptRecyclerView.getHeight() / 4;
                            }
                            transcriptRecyclerView.linearLayoutManager.scrollToPositionWithOffset(i3, i);
                            chatView.nextScrollActionAfterContentChange = null;
                        }
                    }
                }
                transcriptRecyclerView.addOnLayoutChangeListener(new SearchView.AnonymousClass4(chatView, 12));
                chatView.viewInitialized = true;
                break;
            case 3:
                ((Navigator) obj).goTo(Back.INSTANCE);
                break;
            case 4:
                int i4 = BalancedLineTextView.$r8$clinit;
                ((BalancedLineTextView) obj).balanceText();
                break;
            case 5:
                FocusRequester.m605requestFocus3ESFkO8$default((FocusRequester) obj);
                break;
            case 6:
                Camera2Manager camera2Manager = (Camera2Manager) obj;
                JobKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager.AnonymousClass1(camera2Manager, null, 6), 3);
                break;
            case 7:
                ((CameraScreenRunner) obj).registerCameraStateListener();
                break;
            case 8:
                Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding = (Pi2GovernmentidReviewBinding) obj;
                ObjectAnimator duration = ObjectAnimator.ofFloat(pi2GovernmentidReviewBinding.flashScreen, "alpha", 0.9f, RecyclerView.DECELERATION_RATE).setDuration(500L);
                duration.setInterpolator(new LinearInterpolator());
                duration.start();
                FrameLayout frameLayout = pi2GovernmentidReviewBinding.rootView;
                frameLayout.setHapticFeedbackEnabled(true);
                frameLayout.performHapticFeedback(1, 2);
                break;
            case 9:
                BasicGovIdReviewCaptureViewController basicGovIdReviewCaptureViewController = (BasicGovIdReviewCaptureViewController) obj;
                ConstraintSet constraintSet = basicGovIdReviewCaptureViewController.constraintSet;
                Pi2GovernmentidReviewBinding pi2GovernmentidReviewBinding2 = basicGovIdReviewCaptureViewController.binding;
                if (pi2GovernmentidReviewBinding2.acceptButton.getTop() < pi2GovernmentidReviewBinding2.disclaimerView.getBottom() + pi2GovernmentidReviewBinding2.rootView.getContext().getResources().getDimensionPixelOffset(R.dimen.pi2_governmentid_buttons_min_margin)) {
                    constraintSet.clone(pi2GovernmentidReviewBinding2.rootView.getContext(), R.layout.pi2_governmentid_review_low_space);
                    TransitionManager.beginDelayedTransition(pi2GovernmentidReviewBinding2.cameraScreenContent, new AutoTransition());
                    constraintSet.applyTo(pi2GovernmentidReviewBinding2.cameraView);
                    break;
                }
                break;
            case 10:
                ((WorkflowStepFragment) obj).startPostponedEnterTransition();
                break;
            case 11:
                OldCameraScreenRunner oldCameraScreenRunner = (OldCameraScreenRunner) obj;
                Function0 function0 = oldCameraScreenRunner.permissionChangedHandler;
                if (function0 != null) {
                    function0.invoke();
                }
                oldCameraScreenRunner.registerCameraStateListener$1();
                break;
            case 12:
                int i5 = OldSelfieOverlayView.$r8$clinit;
                ((ImageView) obj).setImageDrawable(null);
                break;
            case 13:
                BottomSheetBehavior.from(((HelpBottomSheetController) obj).getBinding().bottomSheet).setState(3);
                break;
            default:
                BottomSheetBehavior.from(((SignatureBottomSheetController) obj).getBinding().bottomSheet).setState(3);
                break;
        }
    }
}
