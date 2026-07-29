package com.aiming.mdt.utils;

import com.aiming.mdt.a.InterfaceC0041;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.aiming.mdt.utils.ʻ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0271 implements InterfaceC0041 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final byte[] f805;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private final Charset f806;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private final String f807;

    public C0271(byte[] bArr) {
        this(bArr, Charset.forName("UTF-8"));
    }

    private C0271(byte[] bArr, Charset charset) {
        this(bArr, charset, Constants.CONTENT_TYPE_STREAM);
    }

    private C0271(byte[] bArr, Charset charset, String str) {
        this.f805 = bArr;
        this.f806 = charset;
        this.f807 = str;
    }

    @Override // com.aiming.mdt.a.InterfaceC0041
    /* renamed from: ʻʽ */
    public String mo96() {
        return this.f807;
    }

    @Override // com.aiming.mdt.a.InterfaceC0041
    /* renamed from: ʼ */
    public void mo97(OutputStream outputStream) {
        byte[] bArr = this.f805;
        if (bArr != null) {
            outputStream.write(bArr);
            outputStream.flush();
        }
    }

    @Override // com.aiming.mdt.a.InterfaceC0041
    /* renamed from: ʽ */
    public long mo98() {
        return this.f805.length;
    }
}
