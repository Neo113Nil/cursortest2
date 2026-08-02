package radiography;

/* loaded from: classes4.dex */
public final class AttributeAppendable {
    public boolean first;
    public final StringBuilder stringBuilder;

    public AttributeAppendable(StringBuilder sb) {
        sb.getClass();
        this.stringBuilder = sb;
        this.first = true;
    }

    public final void append(String str) {
        boolean z = this.first;
        StringBuilder sb = this.stringBuilder;
        if (z) {
            this.first = false;
        } else {
            sb.append(", ");
        }
        sb.append((CharSequence) str);
    }
}
