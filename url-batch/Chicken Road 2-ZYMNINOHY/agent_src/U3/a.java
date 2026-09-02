package U3;

import T3.g;
import kotlin.jvm.internal.i;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3113a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1504a.f15936a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f3113a = bytes;
    }

    public static final String a(g gVar, long j4) {
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (gVar.e(j5) == 13) {
                String n = gVar.n(j5, AbstractC1504a.f15936a);
                gVar.skip(2L);
                return n;
            }
        }
        String n4 = gVar.n(j4, AbstractC1504a.f15936a);
        gVar.skip(1L);
        return n4;
    }
}
