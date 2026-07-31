package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.AbstractC1686t0;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1681s implements AbstractC1686t0.a {

    /* renamed from: a, reason: collision with root package name */
    private final r f21523a;

    public C1681s(r rVar) {
        this.f21523a = rVar;
    }

    @Override // com.my.tracker.obfuscated.AbstractC1686t0.a
    public void a(OutputStream outputStream) {
        this.f21523a.a(outputStream);
    }

    @Override // com.my.tracker.obfuscated.AbstractC1686t0.a
    public String a() {
        return "application/octet-stream";
    }
}
