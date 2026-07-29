package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class d extends c {
    private static HashMap<String, byte[]> f;
    private static HashMap<String, HashMap<String, byte[]>> g;
    private f e = new f();

    public d() {
        this.e.f8740a = (short) 2;
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final <T> void a(String str, T t) {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException("put name can not startwith . , now is " + str);
        }
        super.a(str, (String) t);
    }

    @Override // com.tencent.bugly.proguard.c
    public final void b() {
        super.b();
        this.e.f8740a = (short) 3;
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final byte[] a() {
        if (this.e.f8740a == 2) {
            if (this.e.f8742c.equals("")) {
                throw new IllegalArgumentException("servantName can not is null");
            }
            if (this.e.f8743d.equals("")) {
                throw new IllegalArgumentException("funcName can not is null");
            }
        } else {
            if (this.e.f8742c == null) {
                this.e.f8742c = "";
            }
            if (this.e.f8743d == null) {
                this.e.f8743d = "";
            }
        }
        j jVar = new j(0);
        jVar.a(this.f8694b);
        if (this.e.f8740a == 2) {
            jVar.a((Map) this.f8693a, 0);
        } else {
            jVar.a((Map) this.f8738d, 0);
        }
        this.e.e = l.a(jVar.a());
        j jVar2 = new j(0);
        jVar2.a(this.f8694b);
        this.e.a(jVar2);
        byte[] a2 = l.a(jVar2.a());
        int length = a2.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a2).flip();
        return allocate.array();
    }

    @Override // com.tencent.bugly.proguard.c, com.tencent.bugly.proguard.a
    public final void a(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("decode package must include size head");
        }
        try {
            i iVar = new i(bArr, 4);
            iVar.a(this.f8694b);
            this.e.a(iVar);
            if (this.e.f8740a == 3) {
                i iVar2 = new i(this.e.e);
                iVar2.a(this.f8694b);
                if (f == null) {
                    HashMap<String, byte[]> hashMap = new HashMap<>();
                    f = hashMap;
                    hashMap.put("", new byte[0]);
                }
                this.f8738d = iVar2.a((Map) f, 0, false);
                return;
            }
            i iVar3 = new i(this.e.e);
            iVar3.a(this.f8694b);
            if (g == null) {
                g = new HashMap<>();
                HashMap<String, byte[]> hashMap2 = new HashMap<>();
                hashMap2.put("", new byte[0]);
                g.put("", hashMap2);
            }
            this.f8693a = iVar3.a((Map) g, 0, false);
            new HashMap();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final void b(String str) {
        this.e.f8742c = str;
    }

    public final void c(String str) {
        this.e.f8743d = str;
    }

    public final void b(int i) {
        this.e.f8741b = 1;
    }
}
