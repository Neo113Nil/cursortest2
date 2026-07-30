package com.crrepa.q0;

import android.text.TextUtils;
import com.crrepa.ble.conn.bean.CRPHisiliconEpoInfo;
import com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback;
import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.listener.CRPWatchFaceTransListener;
import com.crrepa.ble.util.BleLog;
import com.crrepa.g1.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: h, reason: collision with root package name */
    private static final String f13648h = "AssistInfo.dat";

    /* renamed from: i, reason: collision with root package name */
    private static final String f13649i = "GLO";

    /* renamed from: j, reason: collision with root package name */
    private static final String f13650j = "NonGlo";

    /* renamed from: k, reason: collision with root package name */
    private static final String f13651k = "\\d+";

    /* renamed from: a, reason: collision with root package name */
    private List<File> f13652a;

    /* renamed from: b, reason: collision with root package name */
    private int f13653b;

    /* renamed from: c, reason: collision with root package name */
    private int f13654c;

    /* renamed from: d, reason: collision with root package name */
    private com.crrepa.s0.c f13655d;

    /* renamed from: e, reason: collision with root package name */
    private CRPFileTransListener f13656e;

    /* renamed from: f, reason: collision with root package name */
    private CRPHisiliconEpoInfo f13657f;

    /* renamed from: g, reason: collision with root package name */
    private int f13658g;

    class a implements CRPWatchFaceTransListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f13659a;

        a(long j8) {
            this.f13659a = j8;
        }

        private void a(int i8) {
            c.this.c((i8 * 100) / c.this.f13653b);
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onError(int i8) {
            BleLog.d("onError: " + i8);
            c.this.b(i8);
        }

        @Override // com.crrepa.ble.conn.listener.CRPWatchFaceTransListener
        public void onInstallStateChange(boolean z7) {
            BleLog.d("onTransProgressStarting");
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransCompleted() {
            BleLog.d("onTransCompleted");
            c.a(c.this, (int) this.f13659a);
            a(c.this.f13654c);
            c.this.d();
        }

        @Override // com.crrepa.ble.conn.listener.CRPFileTransListener
        public void onTransProgressChanged(int i8) {
            BleLog.d("onTransProgressStarting: " + i8);
            a(c.this.f13654c + i8);
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
            long a8 = c.this.a(file.getName()) - c.this.a(file2.getName());
            if (0 < a8) {
                return 1;
            }
            return a8 < 0 ? -1 : 0;
        }
    }

    /* renamed from: com.crrepa.q0.c$c, reason: collision with other inner class name */
    private static class C0239c {

        /* renamed from: a, reason: collision with root package name */
        private int f13662a;

        /* renamed from: b, reason: collision with root package name */
        private LinkedList<File> f13663b;

        public C0239c(int i8, LinkedList<File> linkedList) {
            this.f13662a = i8;
            this.f13663b = linkedList;
        }

        public LinkedList<File> a() {
            return this.f13663b;
        }

        public int b() {
            return this.f13662a;
        }

        public void a(int i8) {
            this.f13662a = i8;
        }

        public void a(LinkedList<File> linkedList) {
            this.f13663b = linkedList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f13652a.isEmpty()) {
            a();
            return;
        }
        File remove = this.f13652a.remove(0);
        this.f13655d.a(new a(remove.length()));
        this.f13655d.a(remove);
        this.f13655d.setPacketLength(this.f13658g);
    }

    protected void c() {
        CRPFileTransListener cRPFileTransListener = this.f13656e;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressStarting();
        }
    }

    static /* synthetic */ int a(c cVar, int i8) {
        int i9 = cVar.f13654c + i8;
        cVar.f13654c = i9;
        return i9;
    }

    protected void c(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13656e;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransProgressChanged(i8);
        }
    }

    private C0239c b(File file) {
        if (file == null || !file.isDirectory() || file.listFiles() == null) {
            return null;
        }
        int gloUpdateTime = this.f13657f.getGloUpdateTime();
        int nonGloUpdateTime = this.f13657f.getNonGloUpdateTime();
        LinkedList linkedList = new LinkedList();
        File file2 = null;
        for (File file3 : a(file)) {
            String name = file3.getName();
            if (TextUtils.equals(f13648h, name)) {
                file2 = file3;
            } else if ((b(name) ? gloUpdateTime : nonGloUpdateTime) < a(name)) {
                linkedList.add(file3);
            }
        }
        BleLog.d("epo file list size = " + linkedList.size());
        if (linkedList.isEmpty()) {
            return null;
        }
        Collections.sort(linkedList, new b());
        int i8 = 0;
        if (file2 != null) {
            linkedList.add(0, file2);
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            BleLog.d("epo file name: " + ((File) it.next()).getName());
        }
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            i8 = (int) (i8 + ((File) it2.next()).length());
        }
        BleLog.d("epo file total size: " + i8);
        return new C0239c(i8, linkedList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(String str) {
        Matcher matcher = Pattern.compile(f13651k).matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group());
        }
        return 0;
    }

    protected void b() {
        CRPFileTransListener cRPFileTransListener = this.f13656e;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(1);
        }
    }

    private List<File> a(File file) {
        ArrayList arrayList = new ArrayList();
        if (file != null && file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    arrayList.addAll(a(file2));
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    protected void b(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13656e;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onError(i8);
        }
    }

    private boolean b(String str) {
        return str.startsWith(f13649i);
    }

    protected void a() {
        CRPFileTransListener cRPFileTransListener = this.f13656e;
        if (cRPFileTransListener != null) {
            cRPFileTransListener.onTransCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i8) {
        com.crrepa.f0.a.a().b();
        this.f13658g = i8;
        d();
    }

    private void a(int i8, int i9) {
        byte[] bArr = new byte[6];
        bArr[0] = 1;
        byte[] b8 = com.crrepa.g1.c.b(i8);
        System.arraycopy(b8, 0, bArr, 1, b8.length);
        bArr[5] = (byte) i9;
        com.crrepa.m.f.e().c(com.crrepa.f.g.a(-76, bArr));
    }

    public void a(CRPHisiliconEpoInfo cRPHisiliconEpoInfo, File file) {
        File file2;
        if (file == null || !file.exists() || file.isDirectory()) {
            b();
            return;
        }
        try {
            file2 = o.a(file);
        } catch (Exception e8) {
            e8.printStackTrace();
            file2 = null;
        }
        this.f13655d = com.crrepa.s0.d.a().a((byte) 9);
        this.f13657f = cRPHisiliconEpoInfo;
        C0239c b8 = b(file2);
        if (b8 == null) {
            b();
            return;
        }
        this.f13652a = b8.a();
        int b9 = b8.b();
        this.f13653b = b9;
        a(b9, this.f13652a.size());
        com.crrepa.f0.a.a().a(new CRPJieliDfuPackageLengthCallback() { // from class: com.crrepa.q0.b
            @Override // com.crrepa.ble.conn.callback.CRPJieliDfuPackageLengthCallback
            public final void onPackageLength(int i8) {
                c.this.a(i8);
            }
        });
        c();
    }

    public void a(CRPFileTransListener cRPFileTransListener) {
        this.f13656e = cRPFileTransListener;
    }
}
