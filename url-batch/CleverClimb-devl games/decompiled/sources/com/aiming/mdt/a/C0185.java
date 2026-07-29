package com.aiming.mdt.a;

import android.text.TextUtils;
import com.aiming.mdt.adt.C0226;
import java.io.BufferedInputStream;

/* renamed from: com.aiming.mdt.a.ʾˊ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0185 implements InterfaceC0136 {

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private BufferedInputStream f650;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f651;

    public C0185(String str, BufferedInputStream bufferedInputStream) {
        this.f651 = str;
        this.f650 = bufferedInputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f650.close();
    }

    @Override // com.aiming.mdt.a.InterfaceC0136
    /* renamed from: ʻʼ */
    public final byte[] mo516() {
        return C0226.m838(this.f650);
    }

    @Override // com.aiming.mdt.a.InterfaceC0136
    /* renamed from: ʻʽ */
    public final BufferedInputStream mo517() {
        return this.f650;
    }

    @Override // com.aiming.mdt.a.InterfaceC0136
    /* renamed from: ʽ */
    public final String mo518() {
        String m405 = C0110.m405(this.f651, "charset", "UTF-8");
        return TextUtils.isEmpty(m405) ? new String(C0226.m838(this.f650)) : new String(C0226.m838(this.f650), m405);
    }
}
