package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i8, int i9) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i9 > 0 || json.length() + i8 >= CLElement.sMaxLine) {
            sb.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z7 = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (z7) {
                    z7 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i8);
                sb.append(next.toFormattedJSON(CLElement.sBaseIndent + i8, i9 - 1));
            }
            sb.append("\n");
            addIndent(sb, i8);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z7 = true;
        for (int i8 = 0; i8 < this.mElements.size(); i8++) {
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i8).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
