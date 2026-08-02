package com.squareup.cash.work.webview.views;

import android.graphics.Bitmap;
import android.webkit.WebView;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import com.squareup.cash.card.onboarding.EquatableBitmap;

/* loaded from: classes7.dex */
public final class WorkWebViewKt$WorkWebViewContent$lambda$9$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $webViewInstance$delegate$inlined;

    public /* synthetic */ WorkWebViewKt$WorkWebViewContent$lambda$9$0$$inlined$onDispose$1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.$webViewInstance$delegate$inlined = mutableState;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        Bitmap bitmap;
        int i = this.$r8$classId;
        MutableState mutableState = this.$webViewInstance$delegate$inlined;
        switch (i) {
            case 0:
                WebView webView = (WebView) mutableState.getValue();
                if (webView != null) {
                    webView.destroy();
                }
                mutableState.setValue(null);
                break;
            default:
                EquatableBitmap equatableBitmap = (EquatableBitmap) mutableState.getValue();
                if (equatableBitmap != null && (bitmap = equatableBitmap.bitmap) != null) {
                    bitmap.recycle();
                    break;
                }
                break;
        }
    }
}
