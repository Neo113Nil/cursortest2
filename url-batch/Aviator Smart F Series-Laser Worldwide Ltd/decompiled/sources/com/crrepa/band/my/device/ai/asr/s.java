package com.crrepa.band.my.device.ai.asr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioRecord;
import com.moyoung.dafit.module.common.utils.g0;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class s {
    private final String audioPath;
    private AudioRecord audioRecord;
    private boolean isRecording;
    private int recordBufSize;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            Exception e8;
            s.this.audioRecord.startRecording();
            FileOutputStream fileOutputStream2 = null;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    fileOutputStream = new FileOutputStream(s.this.audioPath);
                    try {
                        int i8 = s.this.recordBufSize;
                        byte[] bArr = new byte[i8];
                        while (s.this.isRecording) {
                            s.this.audioRecord.read(bArr, 0, i8);
                            fileOutputStream.write(bArr, 0, i8);
                            fileOutputStream.flush();
                        }
                        s.this.audioRecord.stop();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e9) {
                        e8 = e9;
                        e8.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (Exception e11) {
                fileOutputStream = null;
                e8 = e11;
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        }
    }

    public s(Context context) {
        this.audioPath = g0.getMusicFilePath(context, q.PCM_FILE_NAME);
    }

    @SuppressLint({"MissingPermission"})
    private void initAudioRecord() {
        this.recordBufSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        this.audioRecord = new AudioRecord(1, 16000, 16, 2, this.recordBufSize);
    }

    public void release() {
        this.isRecording = false;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
            this.audioRecord.release();
            this.audioRecord = null;
        }
    }

    public void start() {
        if (this.audioRecord == null) {
            initAudioRecord();
        }
        this.isRecording = true;
        new Thread(new a()).start();
    }

    public void stop() {
        this.isRecording = false;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.stop();
        }
    }
}
