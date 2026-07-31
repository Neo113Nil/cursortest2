package com.startapp.sdk.internal;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class w9 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                n8 n8Var = new n8(o8.e);
                n8Var.d = "MraidMode.ConsoleError";
                n8Var.e = consoleMessage.message();
                n8Var.a();
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
