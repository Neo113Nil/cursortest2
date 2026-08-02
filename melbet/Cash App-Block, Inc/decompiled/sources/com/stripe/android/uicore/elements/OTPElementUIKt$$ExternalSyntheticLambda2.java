package com.stripe.android.uicore.elements;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.focus.FocusStateImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class OTPElementUIKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ OTPElementUIKt$$ExternalSyntheticLambda2(Object obj, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = z;
        this.f$2 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$2;
        boolean z = this.f$1;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                if (focusStateImpl.isFocused()) {
                    parcelableSnapshotMutableIntState.setIntValue(i2);
                } else if (!focusStateImpl.isFocused() && z) {
                    parcelableSnapshotMutableIntState.setIntValue(-1);
                }
                return Unit.INSTANCE;
            default:
                String str = (String) obj2;
                Context context = (Context) obj;
                context.getClass();
                WebView webView = new WebView(context);
                webView.setBackgroundColor(i2);
                webView.setAlpha(0.99f);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                if (!z) {
                    webView.setVerticalScrollBarEnabled(false);
                    webView.setHorizontalScrollBarEnabled(false);
                    webView.getSettings().setLoadWithOverviewMode(true);
                    webView.getSettings().setUseWideViewPort(true);
                    webView.setVerticalFadingEdgeEnabled(false);
                }
                webView.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                return webView;
        }
    }
}
