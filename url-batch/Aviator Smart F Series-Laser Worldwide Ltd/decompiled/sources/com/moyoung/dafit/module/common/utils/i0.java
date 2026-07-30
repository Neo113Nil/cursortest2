package com.moyoung.dafit.module.common.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.provider.Settings;
import android.speech.SpeechRecognizer;
import android.util.Log;
import java.util.List;

/* loaded from: classes4.dex */
public class i0 {
    private static final String TAG = "ASR_厂商";
    public static String asr_engine_name;
    public static String asr_engine_service_name;

    public static SpeechRecognizer createSpeechRecognizer(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "voice_recognition_service");
        if (string == null) {
            string = "";
        }
        ComponentName unflattenFromString = ComponentName.unflattenFromString(string);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 131072);
        ComponentName componentName = null;
        if (queryIntentServices == null || queryIntentServices.size() == 0) {
            Log.d(TAG, "No recognition services installed");
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            Log.d(TAG, "\t" + ((Object) resolveInfo.loadLabel(context.getPackageManager())) + ": " + resolveInfo.serviceInfo.packageName + "/" + resolveInfo.serviceInfo.name);
            if (resolveInfo.serviceInfo.packageName.equals(unflattenFromString.getPackageName())) {
                asr_engine_name = resolveInfo.loadLabel(context.getPackageManager()).toString();
                asr_engine_service_name = resolveInfo.serviceInfo.name;
                return SpeechRecognizer.createSpeechRecognizer(context);
            }
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            asr_engine_name = resolveInfo.loadLabel(context.getPackageManager()).toString();
            asr_engine_service_name = resolveInfo.serviceInfo.name;
            componentName = componentName2;
        }
        return SpeechRecognizer.createSpeechRecognizer(context, componentName);
    }
}
