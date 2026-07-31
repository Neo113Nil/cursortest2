package n2;

import n.AbstractC0695v;

/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0726f f7363b = new C0726f();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7364a = true;

    public C0726f() {
        if (AbstractC0695v.e("")) {
            return;
        }
        AbstractC0695v.e("");
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }
}
