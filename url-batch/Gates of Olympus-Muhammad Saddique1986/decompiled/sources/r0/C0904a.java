package r0;

import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0904a extends f2.h implements InterfaceC0426e {

    /* renamed from: l, reason: collision with root package name */
    public static final C0904a f8148l = new C0904a(2, AbstractC0508a.class, "min", "min(II)I", 1);

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
