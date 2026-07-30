package com.crrepa.band.my.device.ai.asr.decoder;

import android.content.Context;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.ai.asr.decoder.b;
import com.just.agentweb.AgentWebPermissions;
import com.realsil.sdk.core.RtkConfigure;
import com.realsil.sdk.core.RtkCore;
import o5.a;

/* loaded from: classes2.dex */
public class d implements b {
    private final p5.b opusDecoder;

    class a extends a.AbstractC0378a {
        final /* synthetic */ b.a val$covertCallback;

        a(b.a aVar) {
            this.val$covertCallback = aVar;
        }

        @Override // o5.a.AbstractC0378a
        public void onCompleted(@NonNull String str, @NonNull String str2) {
            super.onCompleted(str, str2);
            this.val$covertCallback.onComplete();
        }

        @Override // o5.a.AbstractC0378a
        public void onError() {
            super.onError();
            this.val$covertCallback.onError("");
        }

        @Override // o5.a.AbstractC0378a
        public void onStarted() {
            super.onStarted();
            this.val$covertCallback.onStart();
        }
    }

    public d(Context context) {
        RtkCore.initialize(context, new RtkConfigure.Builder().debugEnabled(true).printLog(true).logTag(AgentWebPermissions.ACTION_MEDIA).build());
        this.opusDecoder = new p5.b();
    }

    private static String getFileDir(String str) {
        return str.substring(0, str.lastIndexOf("/"));
    }

    private static String getFileName(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void decode(byte[] bArr) {
        this.opusDecoder.decode(bArr);
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void opus2Audio(String str, String str2, b.a aVar) {
        new p5.a().convert(new a.c.C0379a().srcFile(getFileDir(str), getFileName(str)).destFile(getFileDir(str2), getFileName(str2)).callback(new a(aVar)).build());
    }
}
