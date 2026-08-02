package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jps {
    public jpi a;
    public jph b;
    public jpk c;
    public int d = -1;
    public jpl e;

    public static boolean a(int i) {
        return i >= 0 && i < 8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
