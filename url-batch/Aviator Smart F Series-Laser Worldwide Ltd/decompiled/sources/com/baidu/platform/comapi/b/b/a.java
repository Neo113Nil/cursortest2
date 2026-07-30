package com.baidu.platform.comapi.b.b;

import com.baidu.platform.comapi.h.t.l;
import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.baidu.platform.comapi.wnplatform.tts.b;
import com.baidu.platform.comjni.jninative.tts.WNaviTTSPlayer;

/* loaded from: classes2.dex */
public class a extends BaseTTSPlayer {

    /* renamed from: e, reason: collision with root package name */
    private b f8740e = null;

    /* renamed from: com.baidu.platform.comapi.b.b.a$a, reason: collision with other inner class name */
    class C0098a implements com.baidu.platform.comapi.wnplatform.tts.a {
        C0098a() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.a
        public int getTTSState() {
            return a.this.d();
        }

        @Override // com.baidu.platform.comapi.wnplatform.tts.a
        public int playTTSText(String str, int i8, int i9) {
            return a.this.a(str, i9);
        }
    }

    @Override // com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer
    public void a(b bVar) {
        this.f8740e = bVar;
    }

    public int b(String str, boolean z7) {
        b bVar = this.f8740e;
        if (bVar != null) {
            return bVar.a(str, z7);
        }
        return 0;
    }

    public int d() {
        b bVar = this.f8740e;
        if (bVar != null) {
            return bVar.b();
        }
        return 0;
    }

    public void e() {
        b bVar = this.f8740e;
        if (bVar != null) {
            bVar.release();
        }
    }

    public void f() {
        b bVar = this.f8740e;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        f();
        WNaviTTSPlayer.setTTSPlayerListener(new C0098a());
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        e();
        WNaviTTSPlayer.setTTSPlayerListener(null);
        BaseTTSPlayer.b();
        BaseTTSPlayer.f10535b = null;
        this.f8740e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(String str, int i8) {
        if (com.baidu.platform.comapi.walknavi.b.f9854a == com.baidu.platform.comapi.walknavi.b.n().w()) {
            return b(str, false);
        }
        if (com.baidu.platform.comapi.walknavi.b.f9855b != com.baidu.platform.comapi.walknavi.b.n().w()) {
            return b(str, false);
        }
        if (i8 == 1) {
            l.a().c(com.baidu.platform.comapi.h.i.a.b().c());
            return 1;
        }
        if (i8 == 2) {
            l.a().b(com.baidu.platform.comapi.h.i.a.b().a());
            return 1;
        }
        if (l.a().b()) {
            return 0;
        }
        return b(str, false);
    }
}
