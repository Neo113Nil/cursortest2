package com.crrepa.n;

import com.crrepa.ble.conn.listener.CRPAiWatchFaceChangeListener;
import com.crrepa.ble.conn.listener.CRPChatChangeListener;
import com.crrepa.ble.conn.type.CRPBleRecordingType;
import com.crrepa.ble.spp.hisilicon.receive.SPPReceiver;
import com.crrepa.ble.spp.hisilicon.receive.map.CRPMapChangeListener;
import com.crrepa.ble.util.BleLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private CRPChatChangeListener f13371b;

    /* renamed from: c, reason: collision with root package name */
    private CRPAiWatchFaceChangeListener f13372c;

    /* renamed from: d, reason: collision with root package name */
    private CRPMapChangeListener f13373d;

    /* renamed from: a, reason: collision with root package name */
    private final SPPReceiver f13370a = new SPPReceiver();

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f13374e = Executors.newSingleThreadExecutor();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final d f13375a = new d();

        private a() {
        }
    }

    public void b(byte[] bArr) {
        BleLog.d("onReceivedData: " + com.crrepa.g1.c.c(bArr));
        c(bArr);
    }

    public void c(final byte[] bArr) {
        this.f13374e.execute(new Runnable() { // from class: com.crrepa.n.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.a(bArr);
            }
        });
    }

    private byte a(byte b8) {
        return (byte) (b8 & Byte.MAX_VALUE);
    }

    public static d a() {
        return a.f13375a;
    }

    private void a(byte b8, byte[] bArr) {
        CRPMapChangeListener cRPMapChangeListener;
        if (b8 == 5) {
            CRPChatChangeListener cRPChatChangeListener = this.f13371b;
            if (cRPChatChangeListener != null) {
                cRPChatChangeListener.onActivateRecording();
            }
            CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener = this.f13372c;
            if (cRPAiWatchFaceChangeListener != null) {
                cRPAiWatchFaceChangeListener.onActivateRecording();
            }
            CRPMapChangeListener cRPMapChangeListener2 = this.f13373d;
            if (cRPMapChangeListener2 != null) {
                cRPMapChangeListener2.onActivateRecording();
                return;
            }
            return;
        }
        if (b8 == 6) {
            CRPChatChangeListener cRPChatChangeListener2 = this.f13371b;
            if (cRPChatChangeListener2 != null) {
                cRPChatChangeListener2.onStartRecording(bArr);
            }
            CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener2 = this.f13372c;
            if (cRPAiWatchFaceChangeListener2 != null) {
                cRPAiWatchFaceChangeListener2.onStartRecording(bArr);
            }
            CRPMapChangeListener cRPMapChangeListener3 = this.f13373d;
            if (cRPMapChangeListener3 != null) {
                cRPMapChangeListener3.onStartRecording(bArr);
                return;
            }
            return;
        }
        if (b8 == 7 && !com.crrepa.g1.c.h(bArr)) {
            byte b9 = bArr[0];
            if (b9 == 0) {
                CRPChatChangeListener cRPChatChangeListener3 = this.f13371b;
                if (cRPChatChangeListener3 != null) {
                    cRPChatChangeListener3.onStopRecording(CRPBleRecordingType.HISILICON);
                    return;
                }
                return;
            }
            if (b9 != 1) {
                if (b9 == 2 && (cRPMapChangeListener = this.f13373d) != null) {
                    cRPMapChangeListener.onStopRecording();
                    return;
                }
                return;
            }
            CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener3 = this.f13372c;
            if (cRPAiWatchFaceChangeListener3 != null) {
                cRPAiWatchFaceChangeListener3.onStopRecording(CRPBleRecordingType.HISILICON);
            }
        }
    }

    public void a(CRPAiWatchFaceChangeListener cRPAiWatchFaceChangeListener) {
        this.f13372c = cRPAiWatchFaceChangeListener;
    }

    public void a(CRPChatChangeListener cRPChatChangeListener) {
        this.f13371b = cRPChatChangeListener;
    }

    public void a(CRPMapChangeListener cRPMapChangeListener) {
        this.f13373d = cRPMapChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(byte[] bArr) {
        byte d8;
        byte s7;
        byte b8;
        byte[] bArr2;
        com.crrepa.r.c cVar = new com.crrepa.r.c(bArr);
        com.crrepa.r.a f8 = cVar.f();
        BleLog.d("currentFrameStatus: " + f8);
        if (cVar.a()) {
            if (!cVar.w()) {
                byte m8 = cVar.m();
                d8 = cVar.d();
                s7 = cVar.s();
                byte[] n8 = cVar.n();
                b8 = m8;
                bArr2 = n8;
            } else {
                if (f8 != com.crrepa.r.a.FRAME_END) {
                    return;
                }
                HashMap<String, Object> hashMap = com.crrepa.r.c.f13721i;
                b8 = (byte) Integer.parseInt((String) hashMap.get("MODULE_ID"), 16);
                d8 = (byte) Integer.parseInt((String) hashMap.get("CMD_ID"), 16);
                s7 = (byte) Integer.parseInt((String) hashMap.get("TYPE"), 16);
                Object obj = hashMap.get("VALUE_LIST");
                bArr2 = obj != null ? a((List<byte[]>) obj) : null;
            }
            BleLog.d("mid= " + ((int) b8) + ", cid= " + ((int) d8) + ", type= " + com.crrepa.g1.c.a(s7));
            StringBuilder sb = new StringBuilder();
            sb.append("Payload=");
            sb.append(com.crrepa.g1.c.c(bArr2));
            BleLog.d(sb.toString());
            byte a8 = a(s7);
            BleLog.d("real type=" + com.crrepa.g1.c.a(a8));
            if (b8 == 13) {
                if (d8 == 1) {
                    a(a8, bArr2);
                } else if (d8 == 4) {
                    com.crrepa.u.b.a().a(a8, bArr2);
                } else if (d8 == 8) {
                    com.crrepa.s.c.a().a(a8, bArr2);
                }
            }
            this.f13370a.onReceiverChanged(b8, d8, a8, bArr2);
            com.crrepa.r.c.b();
        }
    }

    private byte[] a(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            return new byte[0];
        }
        Iterator<byte[]> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().length;
        }
        byte[] bArr = new byte[i8];
        int i9 = 0;
        for (byte[] bArr2 : list) {
            int length = bArr2.length;
            int i10 = 0;
            while (i10 < length) {
                bArr[i9] = bArr2[i10];
                i10++;
                i9++;
            }
        }
        return bArr;
    }
}
