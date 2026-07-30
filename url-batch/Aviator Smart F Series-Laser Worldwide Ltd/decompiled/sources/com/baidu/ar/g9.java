package com.baidu.ar;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class g9 implements f8, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    /* renamed from: a, reason: collision with root package name */
    public String f2334a;

    @Override // com.baidu.ar.f8
    public String getName() {
        return this.f2334a;
    }

    public Object readResolve() {
        return g8.a(getName());
    }
}
