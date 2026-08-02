package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rw {
    ry a;
    final /* synthetic */ rx b;

    public rw(rx rxVar) {
        this.b = rxVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + String.valueOf(this.a);
    }
}
