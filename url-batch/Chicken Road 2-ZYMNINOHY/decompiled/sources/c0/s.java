package c0;

import T.C0097o;

/* loaded from: classes.dex */
public final class s extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5603a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(int i4, int i5, int i6, int i7, C0097o c0097o, boolean z, C0279l c0279l) {
        super(r0.toString(), c0279l);
        StringBuilder sb = new StringBuilder("AudioTrack init failed 0 Config(");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(") ");
        sb.append(c0097o);
        sb.append(z ? " (recoverable)" : "");
        this.f5603a = z;
    }
}
