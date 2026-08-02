package com.squareup.cash.work.webview.views;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.core.Easing;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentResultListener;
import coil3.size.SizeKt;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.squareup.cash.observability.types.ErrorReporter;
import com.stripe.android.Stripe;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.frauddetection.FraudDetectionErrorReporter;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestLauncherResult;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import kotlin.NotImplementedError;
import org.xml.sax.SAXException;

/* loaded from: classes4.dex */
public final /* synthetic */ class WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 implements ObjectConstructor, OnApplyWindowInsetsListener, Easing, FraudDetectionErrorReporter, FragmentResultListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    public static /* synthetic */ void m$1(Object obj, String str) {
        throw new NotImplementedError(str + obj + ((Object) " is not supported."));
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.$r8$classId) {
            case 1:
                return new TreeMap();
            case 2:
                return new ConcurrentHashMap();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 5:
                break;
            case 23:
                int i = FinancialConnectionsSheetLiteActivity.$r8$clinit;
                view.getClass();
                Insets insets = windowInsetsCompat.mImpl.getInsets(647);
                insets.getClass();
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                break;
            case 26:
                int i2 = StripeBrowserLauncherActivity.$r8$clinit;
                view.getClass();
                Insets insets2 = windowInsetsCompat.mImpl.getInsets(519);
                insets2.getClass();
                view.setPaddingRelative(insets2.bottom, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                break;
            default:
                int i3 = Stripe3ds2TransactionActivity.$r8$clinit;
                view.getClass();
                Insets insets3 = windowInsetsCompat.mImpl.getInsets(519);
                insets3.getClass();
                view.setPaddingRelative(insets3.bottom, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
                break;
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(Bundle bundle, String str) {
        PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult = (PermissionRequestFragment.PermissionRequestFragmentResult) SizeKt.getParcelable(bundle, "pi2_result", PermissionRequestFragment.PermissionRequestFragmentResult.class);
        if (permissionRequestFragmentResult != null) {
            PermissionRequestLauncherResult.flow.tryEmit(permissionRequestFragmentResult);
        }
    }

    public boolean provideFraudDetectionEnabled() {
        switch (this.$r8$classId) {
            case 22:
                return Stripe.advancedFraudSignalsEnabled;
            default:
                return true;
        }
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionErrorReporter
    public void reportFraudDetectionError(StripeException stripeException) {
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f) {
        switch (this.$r8$classId) {
            case 10:
                float f2 = 1.0f - f;
                return 1.0f - ((f2 * f2) * f2);
            case 11:
                float f3 = f - 1.0f;
                return (((3.0f * f3) + 2.0f) * f3 * f3) + 1.0f;
            default:
                return (-(((float) Math.cos(f * 3.1415927f)) - 1.0f)) / 2.0f;
        }
    }

    public static /* synthetic */ void m() {
        throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new NotImplementedError(str + obj + ((Object) " is not supported."));
    }

    public static /* synthetic */ void m(String str) {
        throw new SAXException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback m(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }
}
