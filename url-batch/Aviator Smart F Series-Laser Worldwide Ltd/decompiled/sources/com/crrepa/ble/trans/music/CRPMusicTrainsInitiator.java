package com.crrepa.ble.trans.music;

import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.conn.type.CRPMcuPlatform;
import com.crrepa.s0.c;
import com.crrepa.s0.d;
import java.io.File;

/* loaded from: classes3.dex */
public class CRPMusicTrainsInitiator {
    private c hisiliconTransInitiator;
    private com.crrepa.v0.a jieliTrainsInitiator;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final CRPMusicTrainsInitiator f12314a = new CRPMusicTrainsInitiator();

        private b() {
        }
    }

    private CRPMusicTrainsInitiator() {
    }

    public static CRPMusicTrainsInitiator getInstance() {
        return b.f12314a;
    }

    public void abort() {
        c cVar = this.hisiliconTransInitiator;
        if (cVar != null) {
            cVar.abort();
        }
        com.crrepa.v0.a aVar = this.jieliTrainsInitiator;
        if (aVar != null) {
            aVar.abort();
        }
    }

    public void start(CRPMcuPlatform cRPMcuPlatform, String str, File file, String str2, CRPFileTransListener cRPFileTransListener) {
        if (cRPFileTransListener == null) {
            return;
        }
        if (cRPMcuPlatform == CRPMcuPlatform.PLATFORM_HISILICON) {
            c a8 = d.a().a((byte) 7);
            this.hisiliconTransInitiator = a8;
            a8.a(cRPFileTransListener);
            this.hisiliconTransInitiator.a(file, str2);
            return;
        }
        com.crrepa.v0.a d8 = com.crrepa.v0.a.d();
        this.jieliTrainsInitiator = d8;
        d8.a(cRPFileTransListener);
        this.jieliTrainsInitiator.a(str, file, str2);
        com.crrepa.o.a.c().a(this.jieliTrainsInitiator);
    }
}
