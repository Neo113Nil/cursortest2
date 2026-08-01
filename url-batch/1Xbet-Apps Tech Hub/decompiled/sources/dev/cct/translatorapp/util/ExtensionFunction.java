package dev.cct.translatorapp.util;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExtensionFunction.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\nJ\u0012\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0006J\n\u0010\u000f\u001a\u00020\u0004*\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\b*\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012J\u0012\u0010\u0013\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"Ldev/cct/translatorapp/util/ExtensionFunction;", "", "()V", "checkInternetConnection", "", "context", "Landroid/content/Context;", "hasTextCopied", "", "onResult", "Lkotlin/Function1;", "copyToClipboard", "text", "", "getFromClipboard", "isClipboardTextAvailable", "openActivity", "activityClass", "Ljava/lang/Class;", "openLink", ImagesContract.URL, "", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtensionFunction {
    public static final ExtensionFunction INSTANCE = new ExtensionFunction();

    private ExtensionFunction() {
    }

    public final void openActivity(Context context, Class<?> activityClass) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        context.startActivity(new Intent(context, activityClass));
    }

    public final void openLink(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final boolean isClipboardTextAvailable(Context context) {
        ClipDescription primaryClipDescription;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    public final void copyToClipboard(Context context, CharSequence text) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("label", text));
        if (Build.VERSION.SDK_INT <= 32) {
            Toast.makeText(context, "Copied To Clipboard", 0).show();
        }
    }

    public final CharSequence getFromClipboard(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
        ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
        if (itemAt != null) {
            return itemAt.getText();
        }
        return null;
    }

    public final void hasTextCopied(Context context, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager clipboardManager = (ClipboardManager) systemService;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: dev.cct.translatorapp.util.ExtensionFunction$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ExtensionFunction.hasTextCopied$lambda$0(clipboardManager, onResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasTextCopied$lambda$0(ClipboardManager clipboardManager, Function1 onResult) {
        Intrinsics.checkNotNullParameter(clipboardManager, "$clipboardManager");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        onResult.invoke(Boolean.valueOf(primaryClip != null && primaryClip.getItemCount() > 0));
    }

    public final boolean checkInternetConnection(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                return true;
            }
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }
}
