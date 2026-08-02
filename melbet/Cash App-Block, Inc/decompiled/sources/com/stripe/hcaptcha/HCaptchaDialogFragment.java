package com.stripe.hcaptcha;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.scannerview.TextSetter;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaInternalConfig;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import sqip.internal.CreditCardEditor$$ExternalSyntheticLambda1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/hcaptcha/HCaptchaDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/stripe/hcaptcha/IHCaptchaVerifier;", "<init>", "()V", "hcaptcha_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HCaptchaDialogFragment extends DialogFragment implements IHCaptchaVerifier {
    public float defaultDimAmount = 0.6f;
    public LinearLayout loadingContainer;
    public boolean readyForInteraction;
    public TextSetter webViewHelper;

    public final void hideLoadingContainer() {
        Window window;
        TextSetter textSetter = this.webViewHelper;
        if (textSetter != null && ((HCaptchaConfig) textSetter.textView).loading) {
            LinearLayout linearLayout = this.loadingContainer;
            if (linearLayout != null) {
                linearLayout.animate().alpha(RecyclerView.DECELERATION_RATE).setDuration(200L).setListener(new Transition.AnonymousClass3(linearLayout, 14));
                return;
            }
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.addFlags(2);
        window.setDimAmount(this.defaultDimAmount);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onCancel(dialogInterface);
        onFailure(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, R.style.StripeHCaptchaDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        HCaptchaDialogFragment hCaptchaDialogFragment;
        HCaptchaStateListener hCaptchaStateListener;
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        layoutInflater.getClass();
        try {
            Bundle arguments = getArguments();
            if (arguments == null) {
                dismiss();
                return null;
            }
            hCaptchaStateListener = (HCaptchaStateListener) SizeKt.getParcelable(arguments, "hCaptchaDialogListener", HCaptchaStateListener.class);
            try {
                if (hCaptchaStateListener == null) {
                    dismiss();
                    return null;
                }
                Function1 function15 = hCaptchaStateListener.onFailure;
                int i = Build.VERSION.SDK_INT;
                HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) (i >= 33 ? arguments.getSerializable("hCaptchaConfig", HCaptchaConfig.class) : arguments.getSerializable("hCaptchaConfig"));
                if (hCaptchaConfig == null) {
                    dismiss();
                    function15.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    return null;
                }
                HCaptchaInternalConfig hCaptchaInternalConfig = (HCaptchaInternalConfig) (i >= 33 ? arguments.getSerializable("hCaptchaInternalConfig", HCaptchaInternalConfig.class) : arguments.getSerializable("hCaptchaInternalConfig"));
                if (hCaptchaInternalConfig == null) {
                    dismiss();
                    function15.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    return null;
                }
                View prepareRootView = prepareRootView(layoutInflater, viewGroup, hCaptchaConfig);
                HCaptchaWebView prepareWebView = prepareWebView(prepareRootView, hCaptchaConfig);
                View findViewById = prepareRootView.findViewById(R.id.loadingContainer);
                ((LinearLayout) findViewById).setVisibility(hCaptchaConfig.loading ? 0 : 8);
                this.loadingContainer = (LinearLayout) findViewById;
                Handler handler = new Handler(Looper.getMainLooper());
                Context requireContext = requireContext();
                requireContext.getClass();
                hCaptchaDialogFragment = this;
                try {
                    hCaptchaDialogFragment.webViewHelper = new TextSetter(handler, requireContext, hCaptchaConfig, hCaptchaInternalConfig, hCaptchaDialogFragment, hCaptchaStateListener, prepareWebView);
                    hCaptchaDialogFragment.readyForInteraction = false;
                    return prepareRootView;
                } catch (BadParcelableException unused) {
                    hCaptchaDialogFragment.dismiss();
                    if (hCaptchaStateListener != null && (function14 = hCaptchaStateListener.onFailure) != null) {
                        function14.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    }
                    return null;
                } catch (InflateException unused2) {
                    hCaptchaDialogFragment.dismiss();
                    if (hCaptchaStateListener != null && (function13 = hCaptchaStateListener.onFailure) != null) {
                        function13.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    }
                    return null;
                } catch (AssertionError unused3) {
                    hCaptchaDialogFragment.dismiss();
                    if (hCaptchaStateListener != null && (function12 = hCaptchaStateListener.onFailure) != null) {
                        function12.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    }
                    return null;
                } catch (ClassCastException unused4) {
                    hCaptchaDialogFragment.dismiss();
                    if (hCaptchaStateListener != null && (function1 = hCaptchaStateListener.onFailure) != null) {
                        function1.invoke(new HCaptchaException(HCaptchaError.ERROR));
                    }
                    return null;
                }
            } catch (BadParcelableException unused5) {
                hCaptchaDialogFragment = this;
            } catch (InflateException unused6) {
                hCaptchaDialogFragment = this;
            } catch (AssertionError unused7) {
                hCaptchaDialogFragment = this;
            } catch (ClassCastException unused8) {
                hCaptchaDialogFragment = this;
            }
        } catch (BadParcelableException unused9) {
            hCaptchaDialogFragment = this;
            hCaptchaStateListener = null;
        } catch (InflateException unused10) {
            hCaptchaDialogFragment = this;
            hCaptchaStateListener = null;
        } catch (AssertionError unused11) {
            hCaptchaDialogFragment = this;
            hCaptchaStateListener = null;
        } catch (ClassCastException unused12) {
            hCaptchaDialogFragment = this;
            hCaptchaStateListener = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        TextSetter textSetter = this.webViewHelper;
        if (textSetter != null) {
            HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) textSetter.scannerText;
            hCaptchaWebView.removeJavascriptInterface("JSInterface");
            hCaptchaWebView.removeJavascriptInterface("JSDI");
            ViewParent parent = hCaptchaWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(hCaptchaWebView);
            }
            hCaptchaWebView.destroy();
        }
    }

    @Override // com.stripe.hcaptcha.task.OnFailureListener
    public final void onFailure(HCaptchaException hCaptchaException) {
        hCaptchaException.getClass();
        TextSetter textSetter = this.webViewHelper;
        boolean z = false;
        if (textSetter != null && textSetter.shouldRetry(hCaptchaException)) {
            z = true;
        }
        if (isAdded() && !z) {
            dismissAllowingStateLoss();
        }
        TextSetter textSetter2 = this.webViewHelper;
        if (textSetter2 != null) {
            if (z) {
                ((HCaptchaWebView) textSetter2.scannerText).loadUrl("javascript:resetAndExecute();");
            } else {
                ((HCaptchaStateListener) textSetter2.textSwitcher).onFailure.invoke(hCaptchaException);
            }
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void onLoaded() {
        TextSetter textSetter = this.webViewHelper;
        if ((textSetter != null ? ((HCaptchaConfig) textSetter.textView).size : null) != HCaptchaSize.INVISIBLE) {
            this.readyForInteraction = true;
            hideLoadingContainer();
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void onOpen() {
        TextSetter textSetter = this.webViewHelper;
        if ((textSetter != null ? ((HCaptchaConfig) textSetter.textView).size : null) == HCaptchaSize.INVISIBLE) {
            hideLoadingContainer();
        }
        this.readyForInteraction = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog != null ? dialog.getWindow() : null;
        TextSetter textSetter = this.webViewHelper;
        if (dialog == null || window == null || textSetter == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.defaultDimAmount = window.getAttributes().dimAmount;
        if (((HCaptchaConfig) textSetter.textView).loading) {
            return;
        }
        window.clearFlags(2);
        window.setDimAmount(RecyclerView.DECELERATION_RATE);
    }

    @Override // com.stripe.hcaptcha.task.OnSuccessListener
    public final void onSuccess(Object obj) {
        Function1 function1;
        String str = (String) obj;
        str.getClass();
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
        TextSetter textSetter = this.webViewHelper;
        if (textSetter == null || (function1 = ((HCaptchaStateListener) textSetter.textSwitcher).onSuccess) == null) {
            return;
        }
        function1.invoke(str);
    }

    public final View prepareRootView(LayoutInflater layoutInflater, ViewGroup viewGroup, HCaptchaConfig hCaptchaConfig) {
        View inflate = layoutInflater.inflate(R.layout.stripe_hcaptcha_fragment, viewGroup, false);
        inflate.getClass();
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        inflate.setOnKeyListener(new CreditCardEditor$$ExternalSyntheticLambda1(1, this, hCaptchaConfig));
        return inflate;
    }

    public final HCaptchaWebView prepareWebView(View view, HCaptchaConfig hCaptchaConfig) {
        HCaptchaWebView hCaptchaWebView = (HCaptchaWebView) view.findViewById(R.id.webView);
        if (!hCaptchaConfig.loading) {
            hCaptchaWebView.setOnTouchListener(new HCaptchaDialogFragment$$ExternalSyntheticLambda1(this, 0));
        }
        hCaptchaWebView.getClass();
        return hCaptchaWebView;
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void reset() {
        TextSetter textSetter = this.webViewHelper;
        if (textSetter != null) {
            ((HCaptchaWebView) textSetter.scannerText).loadUrl("javascript:reset();");
        }
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // com.stripe.hcaptcha.IHCaptchaVerifier
    public final void startVerification(FragmentActivity fragmentActivity) {
        Function1 function1;
        fragmentActivity.getClass();
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("HCaptchaDialogFragment");
        if (findFragmentByTag == null || !findFragmentByTag.isAdded()) {
            try {
                show(supportFragmentManager, "HCaptchaDialogFragment");
            } catch (IllegalStateException unused) {
                TextSetter textSetter = this.webViewHelper;
                if (textSetter == null || (function1 = ((HCaptchaStateListener) textSetter.textSwitcher).onFailure) == null) {
                    return;
                }
                function1.invoke(new HCaptchaException(HCaptchaError.ERROR));
            }
        }
    }
}
