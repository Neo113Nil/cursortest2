package com.baidu.platform.comapi.walknavi.g;

import android.os.Handler;
import com.baidu.ar.npc.BaiduArView;
import com.baidu.platform.comapi.walknavi.g.f;
import com.github.mikephil.charting.utils.i;
import java.io.File;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f9960a = new Handler();

    /* renamed from: b, reason: collision with root package name */
    private static final String f9961b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private f f9962c;

    /* renamed from: d, reason: collision with root package name */
    final Runnable f9963d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f9962c.a("\nlocal token = dfk7fghdsf7d33e\nlocal pod_name = \"turnAndGuide\"\n\nfunction run()\nlocal cfg = an.ActionPriorityConfig:new()\ncfg.forward_logic = 1\ncfg.backward_logic = 0\nlocal param = an.GpbAnimationParam:new()\nparam._speed = 1.0\nparam._repeat_count = 1\nparam._name = pod_name\nlocal id_play_pod = pod_node:play_gpb_animation(param, cfg)\nif id_play_pod == -1 then\nlocal mapData = an.MapData:new()\nmapData:put_string(\"action_type\", \"animation_failed\")\nmapData:put_string(\"token\", token)\nlua_handler:send_message_tosdk(mapData)\nreturn\nend\nlocal podFinishedHandlerId = lua_handler:register_handle(\"onTurnAndGuidePlayPodFinished\")\npod_node:set_action_completion_handler(id_play_pod, podFinishedHandlerId)\nend\nrun()\nfunction onTurnAndGuidePlayPodFinished(state, action_id)\n    local mapData = an.MapData:new()\n    mapData:put_string(\"action_id\", action_id)\n    mapData:put_string(\"action_type\", \"animation_end\")\n    mapData:put_string(\"action_name\", \"turnAndGuide\")\n    mapData:put_string(\"token\", token)\n    mapData:put_int(\"state\", state)\n    lua_handler:send_message_tosdk(mapData)\nend\n", "turnAndGuide");
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final e f9965a = new e(null);
    }

    /* synthetic */ e(a aVar) {
        this();
    }

    public static e d() {
        return b.f9965a;
    }

    public void b(String str, c cVar) {
        this.f9962c.a(str, cVar);
    }

    public String c() {
        return this.f9962c.c();
    }

    public void e(String str) {
        this.f9962c.c(str);
    }

    public boolean f() {
        return this.f9962c.e();
    }

    public boolean g() {
        return this.f9962c.f();
    }

    public boolean h() {
        return this.f9962c.g();
    }

    public void i() {
        if (this.f9962c.e()) {
            this.f9962c.h();
        }
    }

    public void j() {
        if (this.f9962c.e()) {
            this.f9962c.i();
        }
    }

    public void k() {
        if (this.f9962c.e()) {
            this.f9962c.k();
        }
    }

    public void l() {
        if (this.f9962c.e()) {
            this.f9962c.j();
        }
    }

    public void m() {
        if (this.f9962c.e()) {
            this.f9962c.l();
        }
    }

    public void n() {
        this.f9962c.m();
    }

    public void o() {
        this.f9962c.b(true);
        this.f9962c.a(h.a(-90.0d), i.DOUBLE_EPSILON, i.DOUBLE_EPSILON, "mapNPC");
        this.f9962c.b(false);
    }

    private e() {
        this.f9963d = new a();
        this.f9962c = new f();
    }

    public void a(com.baidu.platform.comapi.walknavi.g.b bVar) {
        this.f9962c.a(bVar);
    }

    public void b(String str, String str2) {
        Runnable runnable;
        Handler handler = f9960a;
        if (handler != null && (runnable = this.f9963d) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f9962c.a(str, str2);
        f9960a.postDelayed(this.f9963d, 30000L);
    }

    public boolean c(String str) {
        return !d().b(d().d(str));
    }

    public String d(String str) {
        return this.f9962c.b(str);
    }

    public boolean e() {
        return this.f9962c.d();
    }

    public void a(String str, String str2) {
        Runnable runnable;
        Handler handler = f9960a;
        if (handler != null && (runnable = this.f9963d) != null) {
            handler.removeCallbacks(runnable);
        }
        this.f9962c.a(str, str2);
    }

    public void c(boolean z7) {
        this.f9962c.c(z7);
    }

    public boolean a(String str) {
        return this.f9962c.a(str);
    }

    public void b(boolean z7) {
        this.f9962c.b(z7);
    }

    public void a(boolean z7) {
        this.f9962c.a(z7);
    }

    public BaiduArView b() {
        return this.f9962c.b();
    }

    public void a(double d8, double d9, double d10) {
        this.f9962c.a(d8, d9, d10, "mapNPC");
    }

    public boolean b(String str) {
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(String str, c cVar) {
        this.f9962c.b(str, cVar);
    }

    public void a() {
        this.f9962c.a();
    }

    public boolean a(String str, boolean z7) {
        return this.f9962c.a(str, z7);
    }

    public void a(f.c cVar) {
        com.baidu.platform.comapi.h.g.a.c(f9961b, "setNpcManagerStatusListener:" + cVar);
        this.f9962c.a(cVar);
    }
}
