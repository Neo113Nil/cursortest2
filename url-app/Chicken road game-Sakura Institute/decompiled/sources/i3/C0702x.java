package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: i3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0702x extends O {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7115l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0702x(String name, C0703y generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f7115l = true;
    }

    @Override // i3.O, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f7115l;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, y2.j] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, y2.j] */
    @Override // i3.O
    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0702x) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.a(this.f7031a, serialDescriptor.d())) {
                C0702x c0702x = (C0702x) obj;
                if (c0702x.f7115l && Arrays.equals((SerialDescriptor[]) this.f7040j.getValue(), (SerialDescriptor[]) c0702x.f7040j.getValue())) {
                    int l4 = serialDescriptor.l();
                    int i4 = this.f7033c;
                    if (i4 == l4) {
                        for (0; i2 < i4; i2 + 1) {
                            i2 = (Intrinsics.a(h(i2).d(), serialDescriptor.h(i2).d()) && Intrinsics.a(h(i2).i(), serialDescriptor.h(i2).i())) ? i2 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // i3.O
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
