package com.crrepa.band.my.device.ai.asr.decoder;

import com.crrepa.band.my.device.ai.asr.decoder.b;
import com.moyoung.dafit.module.common.utils.g0;
import com.moyoung.lib.mp3decoder.Mp3Decoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class e implements b {
    private static final String MP3_FILE_NAME = "record.mp3";

    static {
        System.loadLibrary("songstudio");
    }

    private static void opusToMp3File(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void decode(byte[] bArr) {
    }

    @Override // com.crrepa.band.my.device.ai.asr.decoder.b
    public void opus2Audio(String str, String str2, b.a aVar) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                aVar.onError("源文件不存在");
                return;
            }
            String musicFilePath = g0.getMusicFilePath(com.moyoung.dafit.module.common.utils.d.get(), MP3_FILE_NAME);
            opusToMp3File(file, new File(musicFilePath));
            Mp3Decoder mp3Decoder = new Mp3Decoder();
            if (mp3Decoder.init(musicFilePath, str2) < 0) {
                aVar.onError("Decoder Initialized Failed...");
                return;
            }
            mp3Decoder.decode();
            mp3Decoder.destroy();
            aVar.onComplete();
        } catch (IOException e8) {
            e8.printStackTrace();
            aVar.onError("源文件不存在");
        }
    }
}
