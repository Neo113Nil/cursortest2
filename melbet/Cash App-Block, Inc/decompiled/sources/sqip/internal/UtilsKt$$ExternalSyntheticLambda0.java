package sqip.internal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentResultListener;
import com.withpersona.sdk2.inquiry.internal.InquiryActivity;

/* loaded from: classes9.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements FragmentResultListener, OnApplyWindowInsetsListener {
    public final /* synthetic */ KeyEvent.Callback f$0;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(KeyEvent.Callback callback) {
        this.f$0 = callback;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat applySafeToDrawInsets$lambda$2;
        applySafeToDrawInsets$lambda$2 = UtilsKt.applySafeToDrawInsets$lambda$2((View) this.f$0, view, windowInsetsCompat);
        return applySafeToDrawInsets$lambda$2;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(Bundle bundle, String str) {
        InquiryActivity inquiryActivity = (InquiryActivity) this.f$0;
        int i = InquiryActivity.$r8$clinit;
        Intent intent = new Intent();
        intent.putExtras(bundle);
        inquiryActivity.setResult(-1, intent);
        inquiryActivity.finish();
    }
}
