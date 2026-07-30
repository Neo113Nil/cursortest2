package com.moyoung.lib.ai;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.moyoung.lib.ai.img.ImgStyleDelegate;
import com.moyoung.lib.ai.tone.ToneDelegate;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public class e {
    private static com.moyoung.lib.ai.oauth.a authConfig = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context context = null;

    @SuppressLint({"StaticFieldLeak"})
    public static e instance = null;
    private static boolean isPrintLog = false;
    public final com.moyoung.lib.ai.asr.b asr;
    public final com.moyoung.lib.ai.asrstream.c asrStream;
    public final com.moyoung.lib.ai.chat.a chat;
    public final com.moyoung.lib.ai.img.d img;
    public final ImgStyleDelegate imgStyle;
    public final com.moyoung.lib.ai.oauth.e oauth;
    public final ToneDelegate tone;
    public final com.moyoung.lib.ai.tts.c tts;

    private e() {
        OkHttpClient okHttpClient = getOkHttpClient();
        this.oauth = new com.moyoung.lib.ai.oauth.e(okHttpClient);
        this.asrStream = new com.moyoung.lib.ai.asrstream.c();
        this.asr = new com.moyoung.lib.ai.asr.b(okHttpClient);
        this.chat = new com.moyoung.lib.ai.chat.a(okHttpClient);
        this.tts = new com.moyoung.lib.ai.tts.c(okHttpClient);
        this.tone = new ToneDelegate(okHttpClient);
        this.img = new com.moyoung.lib.ai.img.d(okHttpClient);
        this.imgStyle = new ImgStyleDelegate(okHttpClient);
    }

    public static synchronized e get() {
        e eVar;
        synchronized (e.class) {
            try {
                if (instance == null) {
                    instance = new e();
                }
                eVar = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static com.moyoung.lib.ai.oauth.a getAuthConfig() {
        return authConfig;
    }

    public static Context getContext() {
        return context;
    }

    @NonNull
    private static OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builder.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).addInterceptor(new d()).build();
    }

    public static boolean isPrintLog() {
        return isPrintLog;
    }

    public static void setPrintLog(boolean z7) {
        isPrintLog = z7;
    }

    public void authenticate(Context context2, com.moyoung.lib.ai.oauth.a aVar, com.moyoung.lib.ai.oauth.d dVar) {
        context = context2;
        authConfig = aVar;
        if (isAuthorized()) {
            return;
        }
        this.oauth.authenticate(aVar, dVar);
    }

    public boolean isAuthorized() {
        return this.oauth.isAuthorized();
    }
}
