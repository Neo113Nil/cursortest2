package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.widget.Toast;
import com.mopub.common.AdReport;
import com.mopub.common.util.DateAndTime;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public class AdAlertReporter {
    private static final String BODY_SEPARATOR = "\n=================\n";
    private static final String DATE_FORMAT_PATTERN = "M/d/yy hh:mm:ss a z";
    private static final String EMAIL_RECIPIENT = "creative-review@mopub.com";
    private static final int IMAGE_QUALITY = 25;
    private final Context mContext;
    private final String mDateString = new SimpleDateFormat(DATE_FORMAT_PATTERN, Locale.US).format(DateAndTime.now());
    private Intent mEmailIntent;
    private String mParameters;
    private String mResponse;
    private final View mView;

    public AdAlertReporter(Context context, View view, AdReport adReport) {
        this.mView = view;
        this.mContext = context;
        initEmailIntent();
        String convertBitmapInWEBPToBase64EncodedString = convertBitmapInWEBPToBase64EncodedString(takeScreenShot());
        this.mParameters = "";
        this.mResponse = "";
        if (adReport != null) {
            this.mParameters = adReport.toString();
            this.mResponse = adReport.getResponseString();
        }
        addEmailSubject();
        addEmailBody(this.mParameters, this.mResponse, convertBitmapInWEBPToBase64EncodedString);
    }

    public void send() {
        try {
            Intents.startActivity(this.mContext, this.mEmailIntent);
        } catch (IntentNotResolvableException unused) {
            Toast.makeText(this.mContext, "No email client available", 0).show();
        }
    }

    private void initEmailIntent() {
        this.mEmailIntent = new Intent("android.intent.action.SENDTO");
        this.mEmailIntent.setData(Uri.parse("mailto:creative-review@mopub.com"));
    }

    private Bitmap takeScreenShot() {
        if (this.mView == null || this.mView.getRootView() == null) {
            return null;
        }
        View rootView = this.mView.getRootView();
        boolean isDrawingCacheEnabled = rootView.isDrawingCacheEnabled();
        rootView.setDrawingCacheEnabled(true);
        Bitmap drawingCache = rootView.getDrawingCache();
        if (drawingCache == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
        rootView.setDrawingCacheEnabled(isDrawingCacheEnabled);
        return createBitmap;
    }

    private String convertBitmapInWEBPToBase64EncodedString(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 25, byteArrayOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void addEmailSubject() {
        this.mEmailIntent.putExtra("android.intent.extra.SUBJECT", "New creative violation report - " + this.mDateString);
    }

    private void addEmailBody(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
            if (i != strArr.length - 1) {
                sb.append(BODY_SEPARATOR);
            }
        }
        this.mEmailIntent.putExtra("android.intent.extra.TEXT", sb.toString());
    }

    @Deprecated
    Intent getEmailIntent() {
        return this.mEmailIntent;
    }

    @Deprecated
    String getParameters() {
        return this.mParameters;
    }

    @Deprecated
    String getResponse() {
        return this.mResponse;
    }
}
