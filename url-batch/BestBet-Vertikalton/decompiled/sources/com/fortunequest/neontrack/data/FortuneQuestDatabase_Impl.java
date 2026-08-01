package com.fortunequest.neontrack.data;

import B.d;
import g.C0121b;
import h0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.C0191o;
import k0.InterfaceC0203a;
import l0.C0281h;
import u0.C0362a;
import u0.C0365d;
import u0.C0369h;
import u0.C0372k;
import u0.C0385x;

/* loaded from: classes.dex */
public final class FortuneQuestDatabase_Impl extends FortuneQuestDatabase {

    /* renamed from: n, reason: collision with root package name */
    public volatile C0372k f2104n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C0365d f2105o;

    /* renamed from: p, reason: collision with root package name */
    public volatile C0385x f2106p;

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final C0365d b() {
        C0365d c0365d;
        if (this.f2105o != null) {
            return this.f2105o;
        }
        synchronized (this) {
            try {
                if (this.f2105o == null) {
                    this.f2105o = new C0365d(this);
                }
                c0365d = this.f2105o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0365d;
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final l c() {
        return new l(this, new HashMap(0), new HashMap(0), "habits", "completions", "streak_state");
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final InterfaceC0203a d(C0121b c0121b) {
        return new C0281h(c0121b.f2641c, "fortune_quest.db", new d(c0121b, new C0191o(this)));
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final List e(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final Set g() {
        return new HashSet();
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final Map h() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0372k.class, Collections.emptyList());
        hashMap.put(C0365d.class, Collections.emptyList());
        hashMap.put(C0385x.class, Collections.emptyList());
        return hashMap;
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final C0372k i() {
        C0372k c0372k;
        if (this.f2104n != null) {
            return this.f2104n;
        }
        synchronized (this) {
            try {
                if (this.f2104n == null) {
                    C0372k c0372k2 = new C0372k();
                    c0372k2.f4190a = this;
                    c0372k2.f4191b = new C0362a(this, 1);
                    new C0369h(this, 0);
                    c0372k2.f4192c = new C0369h(this, 1);
                    this.f2104n = c0372k2;
                }
                c0372k = this.f2104n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0372k;
    }

    @Override // com.fortunequest.neontrack.data.FortuneQuestDatabase
    public final C0385x m() {
        C0385x c0385x;
        if (this.f2106p != null) {
            return this.f2106p;
        }
        synchronized (this) {
            try {
                if (this.f2106p == null) {
                    this.f2106p = new C0385x(this);
                }
                c0385x = this.f2106p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0385x;
    }
}
