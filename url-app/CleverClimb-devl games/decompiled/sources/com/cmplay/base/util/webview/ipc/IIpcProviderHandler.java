package com.cmplay.base.util.webview.ipc;

import android.content.ContentValues;
import android.content.Context;

/* loaded from: classes.dex */
public interface IIpcProviderHandler {
    Context getContext();

    String handleRequest(ContentValues contentValues);

    void setContext(Context context);
}
