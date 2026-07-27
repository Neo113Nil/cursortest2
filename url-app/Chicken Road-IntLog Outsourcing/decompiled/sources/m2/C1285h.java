package m2;

import b2.AbstractC0279e;
import z4.InterfaceC1586c;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285h extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    public final int f11162a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1285h(int i2, InterfaceC1586c interfaceC1586c) {
        super(r0.toString());
        String str;
        StringBuilder i3 = AbstractC0279e.i(i2, "Unknown enum tag ", " for ");
        if (interfaceC1586c != null) {
            Class a6 = ((kotlin.jvm.internal.c) interfaceC1586c).a();
            kotlin.jvm.internal.i.c(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a6.getName();
        } else {
            str = null;
        }
        i3.append(str);
        this.f11162a = i2;
    }
}
