package com.crrepa.ble.trans.hisilicon;

import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.f.g;
import com.crrepa.g1.o;
import com.crrepa.m.f;
import com.crrepa.s0.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class AudioHisiliconTransInitiator {
    private List<File> fileList;
    private int totalFileSize;
    private int totalTransSize;
    private com.crrepa.s0.c transInitiator;
    private CRPFileTransListener transListener;

    class a implements CRPWatchFaceTransListener {
        a() {
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            onError(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            AudioHisiliconTransInitiator audioHisiliconTransInitiator = AudioHisiliconTransInitiator.this;
            AudioHisiliconTransInitiator.access$214(audioHisiliconTransInitiator, audioHisiliconTransInitiator.transInitiator.a());
            AudioHisiliconTransInitiator.this.sendAudioFile();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            AudioHisiliconTransInitiator.this.onTransChanged(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f12311a;

        /* renamed from: b, reason: collision with root package name */
        private List<File> f12312b;

        public b(int i8, List<File> list) {
            this.f12311a = i8;
            this.f12312b = list;
        }

        public List<File> a() {
            return this.f12312b;
        }

        public int b() {
            return this.f12311a;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioHisiliconTransInitiator f12313a = new AudioHisiliconTransInitiator(null);

        private c() {
        }
    }

    private AudioHisiliconTransInitiator() {
    }

    /* synthetic */ AudioHisiliconTransInitiator(a aVar) {
        this();
    }

    static /* synthetic */ int access$214(AudioHisiliconTransInitiator audioHisiliconTransInitiator, long j8) {
        int i8 = (int) (audioHisiliconTransInitiator.totalTransSize + j8);
        audioHisiliconTransInitiator.totalTransSize = i8;
        return i8;
    }

    private List<File> getAllFile(File file) {
        ArrayList arrayList = new ArrayList();
        if (file != null && file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.addAll(getAllFile(file2));
                } else {
                    BleLog.d("audio file name: " + file2.getName());
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    private b getAudioFileInfo(File file) {
        if (file == null || !file.isDirectory() || file.listFiles() == null) {
            return null;
        }
        List<File> allFile = getAllFile(file);
        if (allFile.isEmpty()) {
            return null;
        }
        BleLog.d("audio file list size = " + allFile.size());
        Iterator<File> it = allFile.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += (int) it.next().length();
        }
        BleLog.d("audio file total size: " + i8);
        return new b(i8, allFile);
    }

    public static AudioHisiliconTransInitiator getInstance() {
        return c.f12313a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAudioFile() {
        if (this.fileList.isEmpty()) {
            onTransComplete();
            return;
        }
        File remove = this.fileList.remove(0);
        this.transInitiator.a(new a());
        this.transInitiator.a(remove);
    }

    private void sendFileSize(int i8, int i9) {
        byte[] bArr = new byte[6];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        bArr[5] = (byte) i9;
        f.e().c(g.a(-76, bArr));
    }

    protected void onError(int i8) {
        CRPFileTransListener cRPFileTransListener = this.transListener;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
    }

    protected void onTransChanged(int i8) {
        if (this.transListener != null) {
            long a8 = this.transInitiator.a() + this.totalTransSize;
            BleLog.i("onTransChanged percent: " + i8);
            BleLog.i("onTransChanged getTransIndex: " + this.transInitiator.a());
            BleLog.i("onTransChanged transSize: " + a8);
            BleLog.i("onTransChanged totalFileSize: " + this.totalFileSize);
            int i9 = (int) ((a8 * 100) / ((long) this.totalFileSize));
            BleLog.i("onTransChanged: " + i9);
            this.transListener.onTransProgressChanged(i9);
        }
    }

    protected void onTransComplete() {
        CRPFileTransListener cRPFileTransListener = this.transListener;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
    }

    protected void onTransStarting() {
        CRPFileTransListener cRPFileTransListener = this.transListener;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    public void setTransListener(CRPFileTransListener cRPFileTransListener) {
        this.transListener = cRPFileTransListener;
    }

    public void start(File file) {
        File file2;
        if (file == null || !file.exists() || file.isDirectory()) {
            onError(1);
            return;
        }
        try {
            file2 = o.a(file);
        } catch (Exception e8) {
            e8.printStackTrace();
            file2 = null;
        }
        this.transInitiator = d.a().a((byte) 16);
        b audioFileInfo = getAudioFileInfo(file2);
        if (audioFileInfo == null) {
            onError(1);
            return;
        }
        this.fileList = audioFileInfo.a();
        int b8 = audioFileInfo.b();
        this.totalFileSize = b8;
        sendFileSize(b8, this.fileList.size());
        onTransStarting();
        sendAudioFile();
    }
}
