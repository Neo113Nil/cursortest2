package com.ironsource.b.e;

import java.util.ArrayList;

/* compiled from: OfferwallConfigurations.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<j> f6799a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private j f6800b;

    public void a(j jVar) {
        if (jVar != null) {
            this.f6799a.add(jVar);
            if (jVar.a() == 0) {
                this.f6800b = jVar;
            }
        }
    }
}
