package com.umeng.analytics.game;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.pro.s;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.Serializable;

/* compiled from: GameState.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f8839a;

    /* renamed from: b, reason: collision with root package name */
    public String f8840b;

    /* renamed from: c, reason: collision with root package name */
    private Context f8841c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8842d = "um_g_cache";
    private final String e = "single_level";
    private final String f = "stat_player_level";
    private final String g = "stat_game_level";
    private C0392a h = null;

    public a(Context context) {
        this.f8841c = context;
    }

    public C0392a a(String str) {
        this.h = new C0392a(str);
        this.h.a();
        return this.h;
    }

    public void a() {
        try {
            if (this.h != null) {
                this.h.b();
                SharedPreferences.Editor edit = this.f8841c.getSharedPreferences("um_g_cache", 0).edit();
                edit.putString("single_level", s.a(this.h));
                edit.putString("stat_player_level", this.f8840b);
                edit.putString("stat_game_level", this.f8839a);
                edit.commit();
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        SharedPreferences sharedPreferences;
        try {
            SharedPreferences preferenceWrapper = PreferenceWrapper.getInstance(this.f8841c, "um_g_cache");
            String string = preferenceWrapper.getString("single_level", null);
            if (!TextUtils.isEmpty(string)) {
                this.h = (C0392a) s.a(string);
                if (this.h != null) {
                    this.h.c();
                }
            }
            if (TextUtils.isEmpty(this.f8840b)) {
                this.f8840b = preferenceWrapper.getString("stat_player_level", null);
                if (this.f8840b == null && (sharedPreferences = PreferenceWrapper.getDefault(this.f8841c)) != null) {
                    this.f8840b = sharedPreferences.getString("userlevel", null);
                }
            }
            if (this.f8839a == null) {
                this.f8839a = preferenceWrapper.getString("stat_game_level", null);
            }
        } catch (Throwable unused) {
        }
    }

    public C0392a b(String str) {
        if (this.h != null) {
            this.h.d();
            if (this.h.a(str)) {
                C0392a c0392a = this.h;
                this.h = null;
                return c0392a;
            }
        }
        return null;
    }

    /* compiled from: GameState.java */
    /* renamed from: com.umeng.analytics.game.a$a, reason: collision with other inner class name */
    static class C0392a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private static final long f8843a = 20140327;

        /* renamed from: b, reason: collision with root package name */
        private String f8844b;

        /* renamed from: c, reason: collision with root package name */
        private long f8845c;

        /* renamed from: d, reason: collision with root package name */
        private long f8846d;

        public C0392a(String str) {
            this.f8844b = str;
        }

        public boolean a(String str) {
            return this.f8844b.equals(str);
        }

        public void a() {
            this.f8846d = System.currentTimeMillis();
        }

        public void b() {
            this.f8845c += System.currentTimeMillis() - this.f8846d;
            this.f8846d = 0L;
        }

        public void c() {
            a();
        }

        public void d() {
            b();
        }

        public long e() {
            return this.f8845c;
        }

        public String f() {
            return this.f8844b;
        }
    }
}
