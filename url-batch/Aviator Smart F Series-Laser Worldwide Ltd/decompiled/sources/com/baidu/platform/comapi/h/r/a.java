package com.baidu.platform.comapi.h.r;

import android.os.Handler;
import android.os.Message;
import com.baidu.platform.comapi.h.t.c;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import java.io.BufferedReader;
import java.io.File;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private static String f9237a;

    /* renamed from: b, reason: collision with root package name */
    private static final Long f9238b = -1L;

    /* renamed from: c, reason: collision with root package name */
    private File f9239c;

    /* renamed from: d, reason: collision with root package name */
    private BufferedReader f9240d;

    /* renamed from: g, reason: collision with root package name */
    private b f9243g;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9241e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f9242f = 0;

    /* renamed from: h, reason: collision with root package name */
    private com.baidu.platform.comapi.h.f.b f9244h = null;

    /* renamed from: i, reason: collision with root package name */
    private Object f9245i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f9246j = true;

    /* renamed from: k, reason: collision with root package name */
    private Long f9247k = 0L;

    /* renamed from: l, reason: collision with root package name */
    private Long f9248l = 600L;

    /* renamed from: m, reason: collision with root package name */
    private Handler f9249m = new HandlerC0111a();

    /* renamed from: com.baidu.platform.comapi.h.r.a$a, reason: collision with other inner class name */
    class HandlerC0111a extends Handler {
        HandlerC0111a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            WLocData wLocData = (WLocData) message.obj;
            if (a.this.f9244h != null) {
                a.this.f9244h.a(wLocData);
            }
        }
    }

    private class b extends Thread {
    }

    public a() {
        f9237a = c.a() + "/WNavi/track/track.txt";
    }

    private void b() {
        synchronized (this.f9245i) {
            this.f9239c = null;
            this.f9240d = null;
            this.f9242f = 0;
        }
    }

    public void a(com.baidu.platform.comapi.h.f.b bVar) {
        this.f9244h = bVar;
    }

    public void c() {
        if (this.f9241e) {
            if (this.f9243g != null) {
                throw null;
            }
            b();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        com.baidu.platform.comapi.walknavi.b.n().s().i(3);
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        c();
    }
}
