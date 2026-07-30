package c4;

import C4.p;
import k6.InterfaceC0608c;
import kotlin.jvm.internal.InterfaceC0641f;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302h extends IllegalArgumentException {

    /* renamed from: d, reason: collision with root package name */
    public final int f4223d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0302h(int i2, InterfaceC0608c interfaceC0608c) {
        super(r0.toString());
        String str;
        StringBuilder k7 = p.k(i2, "Unknown enum tag ", " for ");
        if (interfaceC0608c != null) {
            Intrinsics.checkNotNullParameter(interfaceC0608c, "<this>");
            Class a7 = ((InterfaceC0641f) interfaceC0608c).a();
            Intrinsics.c(a7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            str = a7.getName();
        } else {
            str = null;
        }
        k7.append(str);
        this.f4223d = i2;
    }
}
