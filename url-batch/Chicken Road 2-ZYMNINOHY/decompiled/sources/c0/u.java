package c0;

import E.AbstractC0005f;
import T.C0097o;

/* loaded from: classes.dex */
public final class u extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5605b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097o f5606c;

    public u(int i4, C0097o c0097o, boolean z) {
        super(AbstractC0005f.j(i4, "AudioTrack write failed: "));
        this.f5605b = z;
        this.f5604a = i4;
        this.f5606c = c0097o;
    }
}
