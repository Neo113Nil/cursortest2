package com.baidu.vi;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Message;
import android.os.Process;

/* loaded from: classes2.dex */
public class AudioRecorder {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private static Handler f10680a = new a();

    /* renamed from: b, reason: collision with root package name */
    private volatile AudioRecord f10681b;

    /* renamed from: c, reason: collision with root package name */
    private int f10682c;

    /* renamed from: d, reason: collision with root package name */
    private int f10683d;

    /* renamed from: e, reason: collision with root package name */
    private int f10684e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10685f;

    /* renamed from: g, reason: collision with root package name */
    private int f10686g;

    /* renamed from: h, reason: collision with root package name */
    private int f10687h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f10688i = false;

    /* renamed from: j, reason: collision with root package name */
    private Object f10689j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private Thread f10690k = new b(AudioRecorder.class.getSimpleName() + "-Record");

    static class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AudioRecorder audioRecorder = ((c) message.obj).f10692a;
            int i8 = message.what;
            if (i8 != 1) {
                if (i8 == 2 && audioRecorder.f10688i) {
                    audioRecorder.onReadError();
                    return;
                }
                return;
            }
            if (audioRecorder.f10688i) {
                c cVar = (c) message.obj;
                audioRecorder.onReadData(cVar.f10693b, cVar.f10694c);
            }
        }
    }

    class b extends Thread {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            AudioRecorder.this.f10681b.startRecording();
            int i8 = 0;
            while (AudioRecorder.this.f10688i) {
                byte[] bArr = new byte[AudioRecorder.this.f10686g];
                if (AudioRecorder.this.f10681b != null) {
                    i8 = AudioRecorder.this.f10681b.read(bArr, 0, AudioRecorder.this.f10686g);
                }
                if (i8 == -3 || i8 == -2 || i8 == -1 || i8 == 0) {
                    AudioRecorder.this.a();
                } else {
                    AudioRecorder.this.a(bArr, i8);
                }
            }
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        AudioRecorder f10692a;

        /* renamed from: b, reason: collision with root package name */
        byte[] f10693b;

        /* renamed from: c, reason: collision with root package name */
        int f10694c;

        public c(AudioRecorder audioRecorder, byte[] bArr, int i8) {
            this.f10692a = audioRecorder;
            this.f10693b = bArr;
            this.f10694c = i8;
        }
    }

    public AudioRecorder(int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f10685f = true;
        if (i10 == 8) {
            this.f10684e = 3;
        } else {
            this.f10684e = 2;
        }
        if (i11 == 2) {
            this.f10683d = 3;
        } else {
            this.f10683d = 2;
        }
        this.f10685f = i14 == 1;
        this.f10682c = i9;
        this.f10687h = i12;
        this.f10686g = i13;
    }

    native void onReadData(byte[] bArr, int i8);

    native void onReadError();

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f10685f) {
            c cVar = new c(this, null, 0);
            Handler handler = f10680a;
            handler.sendMessage(handler.obtainMessage(2, cVar));
        } else if (this.f10688i) {
            onReadError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(byte[] bArr, int i8) {
        if (this.f10685f) {
            c cVar = new c(this, bArr, i8);
            Handler handler = f10680a;
            handler.sendMessage(handler.obtainMessage(1, cVar));
        } else if (this.f10688i) {
            onReadData(bArr, i8);
        }
    }
}
