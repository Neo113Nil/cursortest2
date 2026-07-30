package com.crrepa.r0;

import com.crrepa.ble.conn.listener.CRPFileTransListener;
import com.crrepa.ble.trans.hisilicon.app.CRPAppTransListener;
import com.crrepa.s0.c;
import com.crrepa.s0.d;
import java.io.File;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private c f13746a;

    /* renamed from: b, reason: collision with root package name */
    protected CRPFileTransListener f13747b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a f13748a = new a();

        private b() {
        }
    }

    private a() {
    }

    public static a b() {
        return b.f13748a;
    }

    public void a() {
        c cVar = this.f13746a;
        if (cVar != null) {
            cVar.abort();
        }
    }

    public void a(int i8) {
        CRPFileTransListener cRPFileTransListener = this.f13747b;
        if (cRPFileTransListener == null || !(cRPFileTransListener instanceof CRPAppTransListener)) {
            return;
        }
        CRPAppTransListener cRPAppTransListener = (CRPAppTransListener) cRPFileTransListener;
        if (i8 == 0) {
            cRPAppTransListener.onInstallSuccess();
        } else {
            cRPAppTransListener.onInstallFail(i8);
        }
    }

    public void a(CRPAppTransListener cRPAppTransListener, File file) {
        this.f13747b = cRPAppTransListener;
        c a8 = d.a().a((byte) 10);
        this.f13746a = a8;
        a8.a(cRPAppTransListener);
        this.f13746a.a(file);
    }
}
