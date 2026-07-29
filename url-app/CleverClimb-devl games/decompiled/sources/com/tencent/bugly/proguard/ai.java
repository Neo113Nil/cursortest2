package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class ai extends k implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static ArrayList<String> f8703c;

    /* renamed from: a, reason: collision with root package name */
    private String f8704a = "";

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<String> f8705b = null;

    @Override // com.tencent.bugly.proguard.k
    public final void a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(j jVar) {
        jVar.a(this.f8704a, 0);
        if (this.f8705b != null) {
            jVar.a((Collection) this.f8705b, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.k
    public final void a(i iVar) {
        this.f8704a = iVar.b(0, true);
        if (f8703c == null) {
            f8703c = new ArrayList<>();
            f8703c.add("");
        }
        this.f8705b = (ArrayList) iVar.a((i) f8703c, 1, false);
    }
}
