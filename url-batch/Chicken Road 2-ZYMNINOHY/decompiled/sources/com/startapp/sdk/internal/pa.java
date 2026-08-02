package com.startapp.sdk.internal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: classes.dex */
public final class pa extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                d9 d9Var = new d9(e9.f6839e);
                d9Var.f6792d = "MraidMode.ConsoleError";
                d9Var.f6793e = consoleMessage.message();
                d9Var.a();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
