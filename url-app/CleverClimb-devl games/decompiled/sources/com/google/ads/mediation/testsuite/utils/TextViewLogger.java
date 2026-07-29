package com.google.ads.mediation.testsuite.utils;

import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class TextViewLogger {
    private WeakReference<TextView> textViewRef;

    public TextViewLogger(TextView textView) {
        this.textViewRef = new WeakReference<>(textView);
    }

    public void logEvent(String str) {
        if (this.textViewRef.get() != null) {
            this.textViewRef.get().append(String.format(Locale.getDefault(), "[%s] %s\n", new SimpleDateFormat("hh:mm:ss").format(Calendar.getInstance().getTime()), str));
        }
    }
}
