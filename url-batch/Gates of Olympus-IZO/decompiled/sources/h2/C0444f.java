package h2;

import f.AbstractC0382a;

/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0444f f5072b = new C0444f();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5073a = true;

    public C0444f() {
        if (AbstractC0382a.c("")) {
            return;
        }
        AbstractC0382a.c("");
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
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }
}
