package com.cmplay.base.util.webview.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class PaxWebChromeClient extends WebChromeClient {
    private static final int CHOOSE_REQUEST_CODE = 36865;
    private Activity mActivity;
    private ValueCallback<Uri> uploadFile;
    private ValueCallback<Uri[]> uploadFiles;

    public PaxWebChromeClient(Activity activity) {
        this.mActivity = activity;
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.grant(permissionRequest.getResources());
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        this.uploadFile = valueCallback;
        openFileChooseProcess();
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        this.uploadFile = valueCallback;
        openFileChooseProcess();
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        this.uploadFile = valueCallback;
        openFileChooseProcess();
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.uploadFiles = valueCallback;
        openFileChooseProcess();
        return true;
    }

    private void openFileChooseProcess() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        this.mActivity.startActivityForResult(Intent.createChooser(intent, "Choose"), CHOOSE_REQUEST_CODE);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.d("requestCode===", i + "====");
        if (i2 == -1) {
            if (i != CHOOSE_REQUEST_CODE) {
                return;
            }
            if (this.uploadFile != null) {
                this.uploadFile.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
                this.uploadFile = null;
            }
            if (this.uploadFiles != null) {
                this.uploadFiles.onReceiveValue(new Uri[]{(intent == null || i2 != -1) ? null : intent.getData()});
                this.uploadFiles = null;
                return;
            }
            return;
        }
        if (i2 == 0) {
            if (this.uploadFile != null) {
                this.uploadFile.onReceiveValue(null);
                this.uploadFile = null;
            }
            if (this.uploadFiles != null) {
                this.uploadFiles.onReceiveValue(null);
                this.uploadFiles = null;
            }
        }
    }
}
