package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Build;
import android.webkit.JavascriptInterface;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import dalvik.system.DexFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class HCaptchaDebugInfo implements Serializable {
    public final Context context;
    public final Lazy debugInfo$delegate;

    public HCaptchaDebugInfo(Context context) {
        context.getClass();
        this.context = context;
        this.debugInfo$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 1));
    }

    public static ArrayList debugInfo(String str, String str2) {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
        MessageDigest messageDigest3 = MessageDigest.getInstance("MD5");
        DexFile dexFile = new DexFile(str2);
        try {
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                nextElement.getClass();
                if (!StringsKt__StringsJVMKt.startsWith(nextElement, "com.google.android.", false) && !StringsKt__StringsJVMKt.startsWith(nextElement, "android.", false)) {
                    str.getClass();
                    if (StringsKt__StringsJVMKt.startsWith(nextElement, str, false)) {
                        Charset forName = Charset.forName("UTF-8");
                        forName.getClass();
                        byte[] bytes = nextElement.getBytes(forName);
                        bytes.getClass();
                        messageDigest2.update(bytes);
                    } else {
                        Charset forName2 = Charset.forName("UTF-8");
                        forName2.getClass();
                        byte[] bytes2 = nextElement.getBytes(forName2);
                        bytes2.getClass();
                        messageDigest3.update(bytes2);
                    }
                }
                Charset forName3 = Charset.forName("UTF-8");
                forName3.getClass();
                byte[] bytes3 = nextElement.getBytes(forName3);
                bytes3.getClass();
                messageDigest.update(bytes3);
            }
            dexFile.close();
            arrayList.add("sys_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1))));
            arrayList.add("deps_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest3.digest())}, 1))));
            arrayList.add("app_".concat(String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest2.digest())}, 1))));
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            return arrayList;
        } catch (Throwable th) {
            dexFile.close();
            throw th;
        }
    }

    @JavascriptInterface
    public final String getDebugInfo() {
        return (String) this.debugInfo$delegate.getValue();
    }
}
