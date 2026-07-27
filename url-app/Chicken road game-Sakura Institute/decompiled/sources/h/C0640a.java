package h;

import java.util.HashMap;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640a extends C0645f {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f6811k = new HashMap();

    @Override // h.C0645f
    public final C0642c e(Object obj) {
        return (C0642c) this.f6811k.get(obj);
    }

    @Override // h.C0645f
    public final Object h(Object obj) {
        Object h4 = super.h(obj);
        this.f6811k.remove(obj);
        return h4;
    }
}
