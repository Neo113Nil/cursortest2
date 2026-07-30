package com.crrepa.band.my.device.ai.asr.decoder;

import com.crrepa.band.my.device.ai.asr.decoder.b;
import java.io.File;

/* loaded from: classes2.dex */
public class a implements b {
    public static boolean createPcmFile(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            return file.renameTo(new File(str2));
        }
        return false;
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void decode(byte[] bArr) {
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void opus2Audio(String str, String str2, b.a aVar) {
        aVar.onStart();
        if (createPcmFile(str, str2)) {
            aVar.onComplete();
        } else {
            aVar.onError("pcm文件创建失败");
        }
    }
}
