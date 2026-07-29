package com.tencent.bugly.proguard;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class ah extends k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f8699a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f8700b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f8701c = "";
    private String e = "";

    /* renamed from: d, reason: collision with root package name */
    public String f8702d = "";

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8699a, 0);
        if (this.f8700b != null) {
            jVar.a(this.f8700b, 1);
        }
        if (this.f8701c != null) {
            jVar.a(this.f8701c, 2);
        }
        if (this.e != null) {
            jVar.a(this.e, 3);
        }
        if (this.f8702d != null) {
            jVar.a(this.f8702d, 4);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8699a = iVar.b(0, true);
        this.f8700b = iVar.b(1, false);
        this.f8701c = iVar.b(2, false);
        this.e = iVar.b(3, false);
        this.f8702d = iVar.b(4, false);
    }
}
