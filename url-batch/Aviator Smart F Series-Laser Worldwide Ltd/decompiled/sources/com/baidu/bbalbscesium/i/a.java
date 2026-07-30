package com.baidu.bbalbscesium.i;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f3932b = false;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f3933c = false;

    /* renamed from: a, reason: collision with root package name */
    e[] f3934a = {new f(8, 0), new j(0, 1), new j(1, 1), new f(7, 1)};

    public byte[] a(byte[] bArr) {
        d dVar = new d();
        byte[] a8 = c.a(bArr, bArr.length + ((this.f3934a.length + 1) * d.f3945a));
        c.a(a8, dVar.a(), bArr.length);
        int i8 = 0;
        while (true) {
            e[] eVarArr = this.f3934a;
            if (i8 >= eVarArr.length) {
                return Arrays.copyOf(dVar.a(), d.f3945a);
            }
            e eVar = eVarArr[i8];
            i8++;
            int length = bArr.length + (d.f3945a * i8);
            dVar.a(eVar.a(a8, 0, length), eVar.c(), eVar.a(), eVar.b());
            c.a(a8, dVar.a(), length);
        }
    }
}
