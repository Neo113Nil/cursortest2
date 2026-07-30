package com.moyoung.lib.videoeditor.editors;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.arthenica.ffmpegkit.l;
import com.arthenica.ffmpegkit.m;
import com.arthenica.ffmpegkit.t;
import com.arthenica.ffmpegkit.v;
import com.arthenica.ffmpegkit.w;
import java.util.Objects;

/* loaded from: classes4.dex */
public class h {
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    public static void cancel() {
        com.arthenica.ffmpegkit.g.cancel();
    }

    public static void execute(String str, @NonNull final b bVar) {
        Log.d("FFmpegKit", "cmd:" + str);
        Handler handler = mainHandler;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: com.moyoung.lib.videoeditor.editors.d
            @Override // java.lang.Runnable
            public final void run() {
                b.this.onStart();
            }
        });
        Log.d("FFmpegKit", String.format("Async FFmpeg process started with sessionId %d.", Long.valueOf(com.arthenica.ffmpegkit.g.executeAsync(str, new com.arthenica.ffmpegkit.i() { // from class: com.moyoung.lib.videoeditor.editors.e
            @Override // com.arthenica.ffmpegkit.i
            public final void apply(com.arthenica.ffmpegkit.h hVar) {
                h.lambda$execute$1(b.this, hVar);
            }
        }).getSessionId())));
        FFmpegKitConfig.enableLogCallback(new m() { // from class: com.moyoung.lib.videoeditor.editors.f
            @Override // com.arthenica.ffmpegkit.m
            public final void apply(l lVar) {
                h.lambda$execute$2(lVar);
            }
        });
        FFmpegKitConfig.enableStatisticsCallback(new w() { // from class: com.moyoung.lib.videoeditor.editors.g
            @Override // com.arthenica.ffmpegkit.w
            public final void apply(v vVar) {
                h.lambda$execute$3(vVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$0(t tVar, b bVar) {
        if (t.isSuccess(tVar)) {
            bVar.onSuccess("returnCode=" + tVar);
        } else {
            bVar.onFailure("returnCode=" + tVar);
        }
        bVar.onFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$1(final b bVar, com.arthenica.ffmpegkit.h hVar) {
        final t returnCode = hVar.getReturnCode();
        Log.d("FFmpegKit", "returnCode:" + returnCode.getValue());
        mainHandler.post(new Runnable() { // from class: com.moyoung.lib.videoeditor.editors.c
            @Override // java.lang.Runnable
            public final void run() {
                h.lambda$execute$0(t.this, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$2(l lVar) {
        Log.d("FFmpegKit", lVar.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$3(v vVar) {
        Log.d("FFmpegKit", "getSpeed:" + vVar.getSpeed());
        Log.d("FFmpegKit", "frame:" + vVar.getVideoFrameNumber() + "time:" + vVar.getTime());
    }
}
