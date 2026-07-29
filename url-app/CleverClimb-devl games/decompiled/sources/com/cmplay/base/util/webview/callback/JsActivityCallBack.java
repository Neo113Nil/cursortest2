package com.cmplay.base.util.webview.callback;

/* loaded from: classes.dex */
public interface JsActivityCallBack {
    void closeWebView(int i);

    void getUnlockStateCallback(String str);

    void hideCloseBtn();

    void loginCallBack(String str);

    void playAbleCallBack(String str);

    void selectPictureWithCallback(String str);

    void shareCallBack(String str);

    void showCloseBtn();

    void showWebView();

    void unlockCallback(String str);
}
