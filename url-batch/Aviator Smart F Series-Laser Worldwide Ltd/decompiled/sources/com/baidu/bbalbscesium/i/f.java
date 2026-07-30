package com.baidu.bbalbscesium.i;

import com.baidu.bbalbscesium.i.i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: f, reason: collision with root package name */
    private b f3953f;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private Class<?> f3954a;

        /* renamed from: b, reason: collision with root package name */
        private Method f3955b;

        /* renamed from: c, reason: collision with root package name */
        private Method f3956c;

        private b() {
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object b() {
            return this.f3954a.newInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long a(Object obj) {
            try {
                return ((Long) this.f3956c.invoke(obj, new Object[0])).longValue();
            } catch (Exception unused) {
                throw new i.a("");
            }
        }

        private void a() {
            try {
                this.f3954a = Class.forName(i.a(h.b()), true, Object.class.getClassLoader());
                String a8 = i.a(h.h());
                Class<?> cls = this.f3954a;
                Class cls2 = Integer.TYPE;
                this.f3955b = i.a(cls, a8, new Class[]{byte[].class, cls2, cls2});
                this.f3956c = i.a(this.f3954a, i.a(h.c()), null);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Object obj, byte[] bArr, int i8, int i9) {
            try {
                this.f3955b.invoke(obj, bArr, Integer.valueOf(i8), Integer.valueOf(i9));
            } catch (Exception unused) {
                throw new i.a("");
            }
        }
    }

    public f(int i8, int i9) {
        this.f3948a = 1099511627775L;
        this.f3949b = 4;
        this.f3950c = 32;
        this.f3951d = i8;
        this.f3952e = i9;
        this.f3953f = new b();
    }

    @Override // com.baidu.bbalbscesium.i.e
    public com.baidu.bbalbscesium.i.b a(byte[] bArr, int i8, int i9) {
        long j8;
        try {
            Object b8 = this.f3953f.b();
            this.f3953f.a(b8, bArr, i8, i9);
            j8 = this.f3953f.a(b8);
        } catch (Exception unused) {
            j8 = com.realsil.sdk.dfu.i.a.INVALID_VERSION_32;
        }
        return com.baidu.bbalbscesium.i.b.a(new long[]{j8});
    }
}
