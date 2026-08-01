package com.bykv.vk.openvk.component.video.pvs.icD;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.pvs.icD.yiw;
import com.facebook.ads.AdError;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ProxyServer.java */
/* loaded from: classes.dex */
public class sUS {
    private static volatile sUS Jd;
    private final AtomicBoolean Ju;
    private final yiw.vG Mxy;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.icD.vG NB;
    private volatile vG Wyp;
    private volatile int icD;
    private final Runnable kj;
    private volatile ServerSocket pvs;
    private volatile vG qh;
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG sUS;
    private final SparseArray<Set<yiw>> so;
    private final AtomicInteger vG = new AtomicInteger(0);
    private volatile com.bykv.vk.openvk.component.video.pvs.icD.pvs.icD yiw;

    static /* synthetic */ void pvs(String str, String str2) {
    }

    boolean pvs(int i, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.so) {
            Set<yiw> set = this.so.get(i);
            if (set != null) {
                for (yiw yiwVar : set) {
                    if (yiwVar != null && str.equals(yiwVar.so)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static sUS pvs() {
        if (Jd == null) {
            synchronized (sUS.class) {
                if (Jd == null) {
                    Jd = new sUS();
                }
            }
        }
        return Jd;
    }

    private sUS() {
        SparseArray<Set<yiw>> sparseArray = new SparseArray<>(2);
        this.so = sparseArray;
        this.Mxy = new yiw.vG() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.sUS.1
            @Override // com.bykv.vk.openvk.component.video.pvs.icD.yiw.vG
            public void pvs(yiw yiwVar) {
                synchronized (sUS.this.so) {
                    Set set = (Set) sUS.this.so.get(yiwVar.sUS());
                    if (set != null) {
                        set.add(yiwVar);
                    }
                }
            }

            @Override // com.bykv.vk.openvk.component.video.pvs.icD.yiw.vG
            public void icD(yiw yiwVar) {
                if (NB.vG) {
                    Log.d("ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(yiwVar)));
                }
                int sUS = yiwVar.sUS();
                synchronized (sUS.this.so) {
                    Set set = (Set) sUS.this.so.get(sUS);
                    if (set != null) {
                        set.remove(yiwVar);
                    }
                }
            }
        };
        this.kj = new Runnable() { // from class: com.bykv.vk.openvk.component.video.pvs.icD.sUS.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i = 0;
                    sUS.this.pvs = new ServerSocket(0, 50, InetAddress.getByName(sUS.this.Mxy()));
                    sUS sus = sUS.this;
                    sus.icD = sus.pvs.getLocalPort();
                    if (sUS.this.icD != -1) {
                        Wyp.pvs(sUS.this.Mxy(), sUS.this.icD);
                        if (sUS.this.yiw()) {
                            Object[] objArr = new Object[2];
                            AtomicInteger unused = sUS.this.vG;
                            if (sUS.this.vG.compareAndSet(0, 1)) {
                                Object[] objArr2 = new Object[2];
                                AtomicInteger unused2 = sUS.this.vG;
                                boolean z = NB.vG;
                                while (sUS.this.vG.get() == 1) {
                                    try {
                                        try {
                                            Socket accept = sUS.this.pvs.accept();
                                            com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar = sUS.this.NB;
                                            if (vGVar != null) {
                                                final yiw pvs2 = new yiw.pvs().pvs(vGVar).pvs(accept).pvs(sUS.this.Mxy).pvs();
                                                com.bytedance.sdk.component.so.sUS.vG().execute(new com.bytedance.sdk.component.so.so("ProxyTask", 10) { // from class: com.bykv.vk.openvk.component.video.pvs.icD.sUS.2.1
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        pvs2.run();
                                                    }
                                                });
                                            } else {
                                                com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(accept);
                                            }
                                        } catch (IOException e) {
                                            sUS.pvs("accept error", Log.getStackTraceString(e));
                                            i++;
                                            if (i > 3) {
                                                break;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        String stackTraceString = Log.getStackTraceString(th);
                                        Log.e("ProxyServer", "proxy server crashed!  ".concat(String.valueOf(stackTraceString)));
                                        sUS.pvs("error", stackTraceString);
                                    }
                                }
                                boolean z2 = NB.vG;
                                sUS.this.NB();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    sUS.pvs("socket not bound", "");
                    sUS.this.NB();
                } catch (IOException e2) {
                    if (NB.vG) {
                        Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e2));
                    }
                    sUS.pvs("create ServerSocket error", Log.getStackTraceString(e2));
                    sUS.this.NB();
                }
            }
        };
        this.Ju = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    vG icD() {
        return this.Wyp;
    }

    vG vG() {
        return this.qh;
    }

    void pvs(com.bykv.vk.openvk.component.video.pvs.icD.icD.vG vGVar) {
        this.NB = vGVar;
    }

    void pvs(com.bykv.vk.openvk.component.video.pvs.icD.pvs.vG vGVar) {
        this.sUS = vGVar;
    }

    public String pvs(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.NB == null) {
            return strArr[0];
        }
        if ((z ? this.yiw : this.sUS) == null) {
            return strArr[0];
        }
        if (this.vG.get() != 1) {
            return strArr[0];
        }
        List<String> pvs2 = com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(strArr);
        if (pvs2 == null) {
            return strArr[0];
        }
        String pvs3 = Mxy.pvs(str, z2 ? str : com.bykv.vk.openvk.component.video.api.sUS.icD.pvs(str), pvs2);
        if (pvs3 == null) {
            return strArr[0];
        }
        if (z) {
            str2 = "https://" + Mxy() + ":" + this.icD + "?f=1&" + pvs3;
        } else {
            str2 = "https://" + Mxy() + ":" + this.icD + "?" + pvs3;
        }
        return str2.replaceFirst("s", "");
    }

    public void Jd() {
        if (this.Ju.compareAndSet(false, true)) {
            Thread thread = new Thread(this.kj);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB() {
        if (this.vG.compareAndSet(1, 2) || this.vG.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(this.pvs);
            sUS();
        }
    }

    private void sUS() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.so) {
            int size = this.so.size();
            for (int i = 0; i < size; i++) {
                SparseArray<Set<yiw>> sparseArray = this.so;
                Set<yiw> set = sparseArray.get(sparseArray.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yiw) it.next()).pvs();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean yiw() {
        com.bytedance.sdk.component.so.yiw yiwVar = new com.bytedance.sdk.component.so.yiw(new pvs(Mxy(), this.icD), 5, 1);
        com.bytedance.sdk.component.so.sUS.vG().submit(yiwVar);
        so();
        try {
            if (!((Boolean) yiwVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                NB();
                return false;
            }
            boolean z = NB.vG;
            return true;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            NB();
            return false;
        }
    }

    /* compiled from: ProxyServer.java */
    private static final class pvs implements Callable<Boolean> {
        private final int icD;
        private final String pvs;

        pvs(String str, int i) {
            this.pvs = str;
            this.icD = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                socket = new Socket(this.pvs, this.icD);
                try {
                    socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        return Boolean.TRUE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.getMessage();
                        sUS.pvs("ping error", Log.getStackTraceString(th));
                        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(socket);
                        return Boolean.FALSE;
                    } finally {
                        com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(socket);
                    }
                }
            } catch (Throwable th3) {
                socket = null;
                th = th3;
            }
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(socket);
            return Boolean.FALSE;
        }
    }

    private void so() {
        Socket socket = null;
        try {
            socket = this.pvs.accept();
            socket.setSoTimeout(AdError.SERVER_ERROR_CODE);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs));
                outputStream.flush();
            }
        } catch (IOException e) {
            Log.getStackTraceString(e);
        } finally {
            com.bykv.vk.openvk.component.video.pvs.vG.pvs.pvs(socket);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Mxy() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
