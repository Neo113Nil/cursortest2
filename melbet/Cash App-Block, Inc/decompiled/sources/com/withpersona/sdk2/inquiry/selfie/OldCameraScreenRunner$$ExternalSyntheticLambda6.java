package com.withpersona.sdk2.inquiry.selfie;

import android.widget.TextView;

/* loaded from: classes9.dex */
public final /* synthetic */ class OldCameraScreenRunner$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextView f$0;

    public /* synthetic */ OldCameraScreenRunner$$ExternalSyntheticLambda6(TextView textView, int i) {
        this.$r8$classId = i;
        this.f$0 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        TextView textView = this.f$0;
        switch (i) {
            case 0:
                textView.setAlpha(1.0f);
                textView.setVisibility(8);
                break;
            default:
                textView.setAlpha(0.8f);
                textView.setVisibility(8);
                break;
        }
    }
}
