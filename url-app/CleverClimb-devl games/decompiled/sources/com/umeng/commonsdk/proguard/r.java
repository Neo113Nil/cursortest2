package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.ab;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: TSerializer.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f9076a;

    /* renamed from: b, reason: collision with root package name */
    private final at f9077b;

    /* renamed from: c, reason: collision with root package name */
    private ah f9078c;

    public r() {
        this(new ab.a());
    }

    public r(aj ajVar) {
        this.f9076a = new ByteArrayOutputStream();
        this.f9077b = new at(this.f9076a);
        this.f9078c = ajVar.a(this.f9077b);
    }

    public byte[] a(i iVar) throws o {
        this.f9076a.reset();
        iVar.write(this.f9078c);
        return this.f9076a.toByteArray();
    }

    public String a(i iVar, String str) throws o {
        try {
            return new String(a(iVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new o("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }

    public String b(i iVar) throws o {
        return new String(a(iVar));
    }
}
