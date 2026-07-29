package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: d, reason: collision with root package name */
    protected HashMap<String, byte[]> f8738d = null;
    private HashMap<String, Object> e = new HashMap<>();
    private i f = new i();

    @Override // com.tencent.bugly.proguard.a
    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public void b() {
        this.f8738d = new HashMap<>();
    }

    @Override // com.tencent.bugly.proguard.a
    public <T> void a(String str, T t) {
        if (this.f8738d == null) {
            super.a(str, (String) t);
            return;
        }
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        }
        if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        }
        if (t instanceof Set) {
            throw new IllegalArgumentException("can not support Set");
        }
        j jVar = new j();
        jVar.a(this.f8694b);
        jVar.a(t, 0);
        this.f8738d.put(str, l.a(jVar.a()));
    }

    public final <T> T b(String str, T t) throws b {
        if (this.f8738d != null) {
            if (!this.f8738d.containsKey(str)) {
                return null;
            }
            if (this.e.containsKey(str)) {
                return (T) this.e.get(str);
            }
            try {
                this.f.a(this.f8738d.get(str));
                this.f.a(this.f8694b);
                T t2 = (T) this.f.a((i) t, 0, true);
                if (t2 != null) {
                    this.e.put(str, t2);
                }
                return t2;
            } catch (Exception e) {
                throw new b(e);
            }
        }
        if (!this.f8693a.containsKey(str)) {
            return null;
        }
        if (this.e.containsKey(str)) {
            return (T) this.e.get(str);
        }
        byte[] bArr = new byte[0];
        Iterator<Map.Entry<String, byte[]>> it = this.f8693a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<String, byte[]> next = it.next();
            next.getKey();
            bArr = next.getValue();
        }
        try {
            this.f.a(bArr);
            this.f.a(this.f8694b);
            T t3 = (T) this.f.a((i) t, 0, true);
            this.e.put(str, t3);
            return t3;
        } catch (Exception e2) {
            throw new b(e2);
        }
    }

    @Override // com.tencent.bugly.proguard.a
    public byte[] a() {
        if (this.f8738d != null) {
            j jVar = new j(0);
            jVar.a(this.f8694b);
            jVar.a((Map) this.f8738d, 0);
            return l.a(jVar.a());
        }
        return super.a();
    }

    @Override // com.tencent.bugly.proguard.a
    public void a(byte[] bArr) {
        try {
            super.a(bArr);
        } catch (Exception unused) {
            this.f.a(bArr);
            this.f.a(this.f8694b);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f8738d = this.f.a((Map) hashMap, 0, false);
        }
    }
}
