package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ek {
    public static void a(Context context, jj jjVar) {
        if (context == null || jjVar == null) {
            return;
        }
        Iterator it = jjVar.f4034a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.length() > 0) {
                gi.a(context, str, null);
            }
        }
    }

    public static VideoUtil$VideoEligibility a(Context context) {
        VideoUtil$VideoEligibility videoUtil$VideoEligibility = VideoUtil$VideoEligibility.ELIGIBLE;
        if (AdsCommonMetaData.k().F().p() >= 0 && ((sf) com.startapp.sdk.components.a.a(context).f3449G.a()).getInt("videoErrorsCount", 0) >= AdsCommonMetaData.k().F().p()) {
            videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_ERRORS_THRESHOLD_REACHED;
        }
        WeakHashMap weakHashMap = si.f4438a;
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                    break;
                }
            }
        } catch (Exception unused) {
        }
        videoUtil$VideoEligibility = VideoUtil$VideoEligibility.INELIGIBLE_MISSING_ACTIVITY;
        File cacheDir = context.getCacheDir();
        WeakHashMap weakHashMap2 = si.f4438a;
        long a3 = p0.a(cacheDir);
        return (a3 >= 0 && a3 / 1024 > AdsCommonMetaData.k().F().g() * 1024) ? videoUtil$VideoEligibility : VideoUtil$VideoEligibility.INELIGIBLE_NO_STORAGE;
    }

    public static String a(Context context, URL url, String str) {
        File file;
        try {
            file = new File(context.getCacheDir(), "StartIoVideos");
            if (str != null) {
                file = new File(file, str);
            }
        } catch (Throwable unused) {
        }
        if (file.exists()) {
            return file.getPath();
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return null;
        }
        parentFile.mkdirs();
        InputStream openStream = url.openStream();
        try {
            File createTempFile = File.createTempFile("tmp-", ".temp", parentFile);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = openStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (!createTempFile.renameTo(file)) {
                    openStream.close();
                    return null;
                }
                String path = file.getPath();
                openStream.close();
                return path;
            } finally {
            }
        } finally {
        }
    }
}
