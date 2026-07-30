package com.crrepa.band.my.health.ecg.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class b {
    private static final String TAG = "Share2";
    private Activity activity;
    private String componentClassName;
    private String componentPackageName;
    private String contentText;
    private String contentType;
    private boolean forcedUseSystemChooser;
    private int requestCode;
    private Uri shareFileUri;
    private String title;

    /* renamed from: com.crrepa.band.my.health.ecg.share.b$b, reason: collision with other inner class name */
    public static class C0202b {
        private Activity activity;
        private String componentClassName;
        private String componentPackageName;
        private Uri shareFileUri;
        private String textContent;
        private String title;
        private String contentType = "application/pdf";
        private int requestCode = -1;
        private boolean forcedUseSystemChooser = true;

        public C0202b(Activity activity) {
            this.activity = activity;
        }

        public b build() {
            return new b(this);
        }

        public C0202b forcedUseSystemChooser(boolean z7) {
            this.forcedUseSystemChooser = z7;
            return this;
        }

        public C0202b setContentType(String str) {
            this.contentType = str;
            return this;
        }

        public C0202b setOnActivityResult(int i8) {
            this.requestCode = i8;
            return this;
        }

        public C0202b setShareFileUri(Uri uri) {
            this.shareFileUri = uri;
            return this;
        }

        public C0202b setShareToComponent(String str, String str2) {
            this.componentPackageName = str;
            this.componentClassName = str2;
            return this;
        }

        public C0202b setTextContent(String str) {
            this.textContent = str;
            return this;
        }

        public C0202b setTitle(@NonNull String str) {
            this.title = str;
            return this;
        }
    }

    private boolean checkShareParam() {
        if (this.activity == null) {
            Log.e(TAG, "activity is null.");
            return false;
        }
        if (TextUtils.isEmpty(this.contentType)) {
            Log.e(TAG, "Share content type is empty.");
            return false;
        }
        if ("text/plain".equals(this.contentType)) {
            if (!TextUtils.isEmpty(this.contentText)) {
                return true;
            }
            Log.e(TAG, "Share text context is empty.");
            return false;
        }
        if (this.shareFileUri != null) {
            return true;
        }
        Log.e(TAG, "Share file path is null.");
        return false;
    }

    private Intent createShareIntent() {
        Intent intent;
        intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.DEFAULT");
        if (!TextUtils.isEmpty(this.componentPackageName) && !TextUtils.isEmpty(this.componentClassName)) {
            intent.setComponent(new ComponentName(this.componentPackageName, this.componentClassName));
        }
        String str = this.contentType;
        str.hashCode();
        switch (str) {
            case "application/pdf":
            case "audio/*":
            case "video/*":
            case "image/*":
                intent.setAction("android.intent.action.SEND");
                intent.setType(this.contentType);
                intent.putExtra("android.intent.extra.STREAM", this.shareFileUri);
                intent.addFlags(1);
                Log.d(TAG, "Share uri: " + this.shareFileUri.toString());
                return intent;
            case "text/plain":
                intent.putExtra("android.intent.extra.TEXT", this.contentText);
                intent.setType("text/plain");
                return intent;
            default:
                Log.e(TAG, this.contentType + " is not support share type.");
                return null;
        }
    }

    public void shareBySystem() {
        if (checkShareParam()) {
            Intent createShareIntent = createShareIntent();
            if (createShareIntent == null) {
                Log.e(TAG, "shareBySystem cancel.");
                return;
            }
            if (this.title == null) {
                this.title = "";
            }
            if (this.forcedUseSystemChooser) {
                createShareIntent = Intent.createChooser(createShareIntent, this.title);
            }
            if (createShareIntent.resolveActivity(this.activity.getPackageManager()) != null) {
                try {
                    int i8 = this.requestCode;
                    if (i8 != -1) {
                        this.activity.startActivityForResult(createShareIntent, i8);
                    } else {
                        this.activity.startActivity(createShareIntent);
                    }
                } catch (Exception e8) {
                    Log.e(TAG, Log.getStackTraceString(e8));
                }
            }
        }
    }

    private b(@NonNull C0202b c0202b) {
        this.activity = c0202b.activity;
        this.contentType = c0202b.contentType;
        this.title = c0202b.title;
        this.shareFileUri = c0202b.shareFileUri;
        this.contentText = c0202b.textContent;
        this.componentPackageName = c0202b.componentPackageName;
        this.componentClassName = c0202b.componentClassName;
        this.requestCode = c0202b.requestCode;
        this.forcedUseSystemChooser = c0202b.forcedUseSystemChooser;
    }
}
