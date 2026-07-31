package y2;

import M1.B;
import java.util.LinkedHashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;
import w2.d0;
import w2.g0;
import w2.j0;
import w2.m0;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f8856a;

    static {
        SerialDescriptor[] serialDescriptorArr = {g0.f8665b, j0.f8673b, d0.f8655b, m0.f8683b};
        LinkedHashSet linkedHashSet = new LinkedHashSet(B.I(4));
        for (int i3 = 0; i3 < 4; i3++) {
            linkedHashSet.add(serialDescriptorArr[i3]);
        }
        f8856a = linkedHashSet;
    }
}
