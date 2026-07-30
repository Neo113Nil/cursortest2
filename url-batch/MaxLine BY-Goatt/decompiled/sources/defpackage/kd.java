package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kd {
    public final nd a;
    public final int b;

    public kd(nd ndVar, int i) {
        this.a = ndVar;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "Finished" : "BoundReached");
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
