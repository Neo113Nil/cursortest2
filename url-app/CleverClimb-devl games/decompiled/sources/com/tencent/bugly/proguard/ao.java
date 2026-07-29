package com.tencent.bugly.proguard;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class ao extends k implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f8724a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f8725b = "";

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8724a, 0);
        jVar.a(this.f8725b, 1);
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8724a = iVar.b(0, true);
        this.f8725b = iVar.b(1, true);
    }
}
