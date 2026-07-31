package n2;

import n.AbstractC0695v;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0725e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0725e f7362a;

    static {
        C0725e c0725e = new C0725e();
        if (!AbstractC0695v.e("  ") && !AbstractC0695v.e("") && !AbstractC0695v.e("")) {
            AbstractC0695v.e("");
        }
        f7362a = c0725e;
    }

    public final void a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("bytesPerLine = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytesPerGroup = ");
        sb.append(Integer.MAX_VALUE);
        sb.append(",");
        sb.append('\n');
        sb.append(str);
        sb.append("groupSeparator = \"");
        sb.append("  ");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSeparator = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("bytePrefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("byteSuffix = \"");
        sb.append("");
        sb.append("\"");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BytesHexFormat(\n");
        a(sb, "    ");
        sb.append('\n');
        sb.append(")");
        String sb2 = sb.toString();
        f2.j.e(sb2, "toString(...)");
        return sb2;
    }
}
