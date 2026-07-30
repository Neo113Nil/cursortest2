package com.crrepa.a1;

import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.o;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends f {

    /* renamed from: g, reason: collision with root package name */
    private static final int f10839g = 4;

    /* renamed from: b, reason: collision with root package name */
    private List<File> f10840b;

    /* renamed from: c, reason: collision with root package name */
    private int f10841c;

    /* renamed from: d, reason: collision with root package name */
    private int f10842d;

    /* renamed from: e, reason: collision with root package name */
    private d f10843e = new d();

    /* renamed from: f, reason: collision with root package name */
    private com.crrepa.a1.c f10844f;

    class a implements CRPWatchFaceTransListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f10845a;

        a(long j8) {
            this.f10845a = j8;
        }

        private void a(int i8) {
            e.this.f10850a.onTransProgressChanged((i8 * 100) / e.this.f10841c);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            e.this.onError(i8, false);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            e.a(e.this, this.f10845a);
            a(e.this.f10842d);
            e.this.b();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            a(e.this.f10842d + i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressStarting() {
            BleLog.d("onTransProgressStarting");
        }
    }

    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long length = file.length() - file2.length();
            if (0 < length) {
                return -1;
            }
            return length < 0 ? 1 : 0;
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private int f10848a;

        /* renamed from: b, reason: collision with root package name */
        private List<File> f10849b;

        public c(int i8, List<File> list) {
            this.f10848a = i8;
            this.f10849b = list;
        }

        public List<File> a() {
            return this.f10849b;
        }

        public int b() {
            return this.f10848a;
        }

        public void a(int i8) {
            this.f10848a = i8;
        }

        public void a(List<File> list) {
            this.f10849b = list;
        }
    }

    @Override // com.crrepa.l0.g
    public void setTimeout(int i8) {
        super.setTimeout(i8);
        this.f10843e.setTimeout(i8);
    }

    @Override // com.crrepa.l0.g
    public void transFileIndex(com.crrepa.y0.a aVar) {
        this.f10843e.transFileIndex(aVar);
    }

    static /* synthetic */ int a(e eVar, long j8) {
        int i8 = (int) (eVar.f10842d + j8);
        eVar.f10842d = i8;
        return i8;
    }

    private c b(File file) {
        if ((file == null || !file.isDirectory() || file.listFiles() == null) && 4 == file.listFiles().length) {
            return null;
        }
        List<File> asList = Arrays.asList(file.listFiles());
        Collections.sort(asList, new b());
        int i8 = 0;
        for (File file2 : asList) {
            BleLog.d("watch face file size: " + file2.length());
            i8 = (int) (((long) i8) + file2.length());
        }
        BleLog.d("watch face file total size: " + i8);
        return new c(i8, asList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10840b.isEmpty()) {
            onTransComplete();
            return;
        }
        File remove = this.f10840b.remove(0);
        this.f10843e.a(new a(remove.length()));
        this.f10843e.a(remove);
    }

    @Override // com.crrepa.a1.f
    public void a(File file) {
        File file2;
        if (file == null || !file.exists() || file.isDirectory()) {
            onTransFileNull();
            return;
        }
        if (com.crrepa.q.a.b()) {
            com.crrepa.a1.c cVar = new com.crrepa.a1.c();
            this.f10844f = cVar;
            cVar.a(this.f10850a);
            this.f10844f.a(file.getPath(), 0);
        } else {
            try {
                file2 = o.a(file);
            } catch (Exception e8) {
                e8.printStackTrace();
                file2 = null;
            }
            c b8 = b(file2);
            if (b8 == null) {
                onTransFileNull();
                return;
            }
            byte[] bArr = new byte[6];
            bArr[0] = 1;
            int b9 = b8.b();
            this.f10841c = b9;
            byte[] b10 = com.crrepa.g1.c.b(b9);
            System.arraycopy(b10, 0, bArr, 1, b10.length);
            bArr[5] = 4;
            sendBleMessage(com.crrepa.f.g.a(-76, bArr));
            this.f10840b = new LinkedList(b8.a());
            b();
        }
        onTransStarting();
    }
}
