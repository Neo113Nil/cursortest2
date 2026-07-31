package h2;

import f.AbstractC0382a;

/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0443e f5071a;

    static {
        C0443e c0443e = new C0443e();
        if (!AbstractC0382a.c("  ") && !AbstractC0382a.c("") && !AbstractC0382a.c("")) {
            AbstractC0382a.c("");
        }
        f5071a = c0443e;
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
        Z1.i.e(sb2, "toString(...)");
        return sb2;
    }
}
