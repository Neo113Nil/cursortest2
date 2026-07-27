package i3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: i3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697s {

    /* renamed from: e, reason: collision with root package name */
    public static final long[] f7105e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f7106a;

    /* renamed from: b, reason: collision with root package name */
    public final k3.e f7107b;

    /* renamed from: c, reason: collision with root package name */
    public long f7108c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7109d;

    public C0697s(SerialDescriptor descriptor, k3.e readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f7106a = descriptor;
        this.f7107b = readIfAbsent;
        int l4 = descriptor.l();
        if (l4 <= 64) {
            this.f7108c = l4 != 64 ? (-1) << l4 : 0L;
            this.f7109d = f7105e;
            return;
        }
        this.f7108c = 0L;
        int i2 = (l4 - 1) >>> 6;
        long[] jArr = new long[i2];
        if ((l4 & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i2 - 1] = (-1) << l4;
        }
        this.f7109d = jArr;
    }
}
