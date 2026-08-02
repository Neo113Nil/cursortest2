package com.withpersona.sdk2.inquiry.selfie.cameraScreen;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.SpotlightView;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes9.dex */
public final class BasicSelfieCaptureViewController {
    public final Pi2SelfieCameraBinding binding;
    public final int confirmHapticFeedbackConst;
    public boolean isCameraCoverAnimatingOut;
    public boolean isFinalizingCoverAnimatingIn;
    public boolean isFinalizingCoverAnimatingOut;
    public boolean isFlashEnabled;
    public boolean isHintBodyAnimatingIn;
    public boolean isHintBodyAnimatingOut;
    public boolean isHintTitleAnimatingIn;
    public boolean isHintTitleAnimatingOut;
    public boolean isPlayingSuccessAnimation;
    public final LifecycleCoroutineScopeImpl lifecycleScope;
    public final StateFlowImpl realTimeHintFlow;

    public BasicSelfieCaptureViewController(Context context, ViewGroup viewGroup) {
        context.getClass();
        this.confirmHapticFeedbackConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.pi2_selfie_camera, viewGroup, false);
        int i = R.id.auto_capture_disclaimer;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.auto_capture_disclaimer);
        if (textView != null) {
            i = R.id.auto_capture_progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.auto_capture_progress_bar);
            if (circularProgressIndicator != null) {
                i = R.id.bottom_space;
                Space space = (Space) ViewBindings.findChildViewById(inflate, R.id.bottom_space);
                if (space != null) {
                    i = R.id.button;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.button);
                    if (imageView != null) {
                        i = R.id.camera2_preview;
                        Camera2PreviewView camera2PreviewView = (Camera2PreviewView) ViewBindings.findChildViewById(inflate, R.id.camera2_preview);
                        if (camera2PreviewView != null) {
                            i = R.id.camera_cover;
                            View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.camera_cover);
                            if (findChildViewById != null) {
                                i = R.id.capture_success;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.capture_success);
                                if (textView2 != null) {
                                    i = R.id.countdown;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.countdown);
                                    if (textView3 != null) {
                                        i = R.id.cover;
                                        View findChildViewById2 = ViewBindings.findChildViewById(inflate, R.id.cover);
                                        if (findChildViewById2 != null) {
                                            i = R.id.finalizing_cover;
                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.finalizing_cover);
                                            if (frameLayout != null) {
                                                i = R.id.hint_message_body;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(inflate, R.id.hint_message_body);
                                                if (textView4 != null) {
                                                    i = R.id.hint_message_title;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(inflate, R.id.hint_message_title);
                                                    if (textView5 != null) {
                                                        i = R.id.initializing_progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(inflate, R.id.initializing_progress_bar);
                                                        if (progressBar != null) {
                                                            i = R.id.navigation_bar;
                                                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                                            if (pi2NavigationBar != null) {
                                                                i = R.id.next_camera;
                                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.next_camera);
                                                                if (imageView2 != null) {
                                                                    i = R.id.preview_bottom_barrier;
                                                                    if (((Barrier) ViewBindings.findChildViewById(inflate, R.id.preview_bottom_barrier)) != null) {
                                                                        i = R.id.preview_container;
                                                                        if (((FrameLayout) ViewBindings.findChildViewById(inflate, R.id.preview_container)) != null) {
                                                                            i = R.id.previewview_selfie_camera;
                                                                            PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(inflate, R.id.previewview_selfie_camera);
                                                                            if (previewView != null) {
                                                                                i = R.id.progress_bar;
                                                                                if (((CircularProgressIndicator) ViewBindings.findChildViewById(inflate, R.id.progress_bar)) != null) {
                                                                                    i = R.id.real_time_hint;
                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(inflate, R.id.real_time_hint);
                                                                                    if (textView6 != null) {
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                        i = R.id.selfie_flash;
                                                                                        View findChildViewById3 = ViewBindings.findChildViewById(inflate, R.id.selfie_flash);
                                                                                        if (findChildViewById3 != null) {
                                                                                            i = R.id.selfie_overlay;
                                                                                            SelfieOverlayView selfieOverlayView = (SelfieOverlayView) ViewBindings.findChildViewById(inflate, R.id.selfie_overlay);
                                                                                            if (selfieOverlayView != null) {
                                                                                                i = R.id.spotlight;
                                                                                                SpotlightView spotlightView = (SpotlightView) ViewBindings.findChildViewById(inflate, R.id.spotlight);
                                                                                                if (spotlightView != null) {
                                                                                                    i = R.id.title;
                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                                                                                                    if (textView7 != null) {
                                                                                                        i = R.id.title_top_space;
                                                                                                        if (((Space) ViewBindings.findChildViewById(inflate, R.id.title_top_space)) != null) {
                                                                                                            i = R.id.toggle_flash;
                                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(inflate, R.id.toggle_flash);
                                                                                                            if (imageView3 != null) {
                                                                                                                i = R.id.top_space;
                                                                                                                Space space2 = (Space) ViewBindings.findChildViewById(inflate, R.id.top_space);
                                                                                                                if (space2 != null) {
                                                                                                                    i = R.id.watermark;
                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(inflate, R.id.watermark);
                                                                                                                    if (textView8 != null) {
                                                                                                                        this.binding = new Pi2SelfieCameraBinding(constraintLayout, textView, circularProgressIndicator, space, imageView, camera2PreviewView, findChildViewById, textView2, textView3, findChildViewById2, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, previewView, textView6, findChildViewById3, selfieOverlayView, spotlightView, textView7, imageView3, space2, textView8);
                                                                                                                        this.realTimeHintFlow = FlowKt.MutableStateFlow(null);
                                                                                                                        Context context2 = constraintLayout.getContext();
                                                                                                                        context2.getClass();
                                                                                                                        this.lifecycleScope = ViewModelKt.getCoroutineScope(ContextUtilsKt.requireLifecycleOwner(context2).getLifecycle());
                                                                                                                        return;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void setMessageBody(String str) {
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = this.binding;
        if (str == null || StringsKt.isBlank(str)) {
            TextView textView = pi2SelfieCameraBinding.hintMessageBody;
            if (textView.getAlpha() == RecyclerView.DECELERATION_RATE || this.isHintBodyAnimatingOut) {
                return;
            }
            this.isHintBodyAnimatingIn = false;
            this.isHintBodyAnimatingOut = true;
            textView.animate().cancel();
            textView.animate().alpha(RecyclerView.DECELERATION_RATE).withEndAction(new BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(this, 0));
            return;
        }
        TextView textView2 = pi2SelfieCameraBinding.hintMessageBody;
        textView2.setText(str);
        if (textView2.getAlpha() == 1.0f || this.isHintBodyAnimatingIn) {
            return;
        }
        this.isHintBodyAnimatingIn = true;
        this.isHintBodyAnimatingOut = false;
        textView2.animate().cancel();
        textView2.animate().alpha(1.0f).withEndAction(new BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(this, 1));
    }

    public final void setMessageTitle(String str) {
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = this.binding;
        if (str == null || StringsKt.isBlank(str)) {
            TextView textView = pi2SelfieCameraBinding.hintMessageTitle;
            if (textView.getAlpha() == RecyclerView.DECELERATION_RATE || this.isHintTitleAnimatingOut) {
                return;
            }
            this.isHintTitleAnimatingOut = true;
            textView.animate().cancel();
            textView.animate().alpha(RecyclerView.DECELERATION_RATE).withEndAction(new BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(this, 3));
            return;
        }
        TextView textView2 = pi2SelfieCameraBinding.hintMessageTitle;
        textView2.setText(str);
        if (textView2.getAlpha() == 1.0f || this.isHintTitleAnimatingIn) {
            return;
        }
        this.isHintTitleAnimatingIn = true;
        textView2.animate().cancel();
        textView2.animate().alpha(1.0f).withEndAction(new BasicSelfieCaptureViewController$$ExternalSyntheticLambda10(this, 4));
    }
}
