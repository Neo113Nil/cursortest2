package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class CLContainer extends CLElement {
    ArrayList mElements;

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement cLElement = (CLElement) it.next();
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    public int size() {
        return this.mElements.size();
    }
}
