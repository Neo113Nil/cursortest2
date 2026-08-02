package com.withpersona.sdk2.inquiry.ui;

import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.ui.databinding.Pi2SignatureBottomSheetBinding;
import kotlin.Lazy;
import kotlin.LazyKt;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class SignatureBottomSheetController {
    public final ViewGroup contentView;
    public Radiography$$ExternalSyntheticLambda1 currentOnCompleteListener;
    public final Lazy lazyBinding;
    public boolean setup;

    public SignatureBottomSheetController(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.contentView = viewGroup;
        this.lazyBinding = LazyKt.lazy(new SignatureBottomSheetController$$ExternalSyntheticLambda0(this, 0));
    }

    public final Pi2SignatureBottomSheetBinding getBinding() {
        return (Pi2SignatureBottomSheetBinding) this.lazyBinding.getValue();
    }
}
