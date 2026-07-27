package p0;

import kotlin.jvm.functions.Function2;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0965a extends M2.m implements Function2 {

    /* renamed from: o, reason: collision with root package name */
    public static final C0965a f9031o = new C0965a(2, O2.a.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
