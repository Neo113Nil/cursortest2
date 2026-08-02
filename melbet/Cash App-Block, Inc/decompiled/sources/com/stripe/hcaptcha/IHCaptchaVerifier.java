package com.stripe.hcaptcha;

import androidx.fragment.app.FragmentActivity;
import com.stripe.hcaptcha.task.OnFailureListener;
import com.stripe.hcaptcha.task.OnSuccessListener;

/* loaded from: classes8.dex */
public interface IHCaptchaVerifier extends OnSuccessListener, OnFailureListener {
    void onLoaded();

    void onOpen();

    void reset();

    void startVerification(FragmentActivity fragmentActivity);
}
