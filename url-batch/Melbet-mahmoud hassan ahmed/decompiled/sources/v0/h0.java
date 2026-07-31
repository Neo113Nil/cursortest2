package v0;

import java.util.UUID;

/* loaded from: classes.dex */
public final class h0 implements u0.b {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22657d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f22658a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22659b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22660c;

    static {
        boolean z6;
        if ("Amazon".equals(o2.m0.f19754c)) {
            String str = o2.m0.f19755d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z6 = true;
                f22657d = z6;
            }
        }
        z6 = false;
        f22657d = z6;
    }

    public h0(UUID uuid, byte[] bArr, boolean z6) {
        this.f22658a = uuid;
        this.f22659b = bArr;
        this.f22660c = z6;
    }
}
