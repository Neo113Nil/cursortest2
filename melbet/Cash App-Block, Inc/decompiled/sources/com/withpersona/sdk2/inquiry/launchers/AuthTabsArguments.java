package com.withpersona.sdk2.inquiry.launchers;

import androidx.camera.view.PreviewView;

/* loaded from: classes9.dex */
public final class AuthTabsArguments implements BrowserArguments {
    public final String host;
    public final PreviewView.AnonymousClass1 intent;
    public final String path;
    public final String url;

    public AuthTabsArguments(PreviewView.AnonymousClass1 anonymousClass1, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.intent = anonymousClass1;
        this.url = str;
        this.host = str2;
        this.path = str3;
    }
}
