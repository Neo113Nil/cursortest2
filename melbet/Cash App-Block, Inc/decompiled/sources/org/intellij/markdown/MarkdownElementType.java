package org.intellij.markdown;

/* loaded from: classes4.dex */
public class MarkdownElementType {
    public final /* synthetic */ int $r8$classId;
    public final boolean isToken;
    public final String name;

    public MarkdownElementType(String str) {
        this.$r8$classId = 0;
        this.name = str;
        this.isToken = false;
    }

    public String getId() {
        return this.name;
    }

    public boolean isLimitAdTrackingEnabled() {
        return this.isToken;
    }

    public String toString() {
        int i = this.$r8$classId;
        String str = this.name;
        switch (i) {
            case 0:
                return "Markdown:" + str;
            case 1:
            default:
                return super.toString();
            case 2:
                int length = String.valueOf(str).length();
                boolean z = this.isToken;
                StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(z).length());
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(z);
                return sb.toString();
        }
    }

    public String zza() {
        return this.name;
    }

    public boolean zzc() {
        return this.isToken;
    }

    public /* synthetic */ MarkdownElementType(String str, boolean z, int i) {
        this.$r8$classId = i;
        this.name = str;
        this.isToken = z;
    }

    public MarkdownElementType(boolean z, String str) {
        this.$r8$classId = 1;
        this.isToken = z;
        this.name = str;
    }
}
