package net.oneformapp.schema;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.fillr.f;
import com.fillr.i0;
import com.fillr.j0;
import com.fillr.l1;
import com.fillr.m1;
import com.fillr.n0;
import com.fillr.o0;
import com.fillr.o1;
import com.fillr.p0;
import com.fillr.r1;
import com.fillr.v1;
import com.fillr.w;
import com.fillr.y1;
import com.fillr.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import org.w3c.dom.Node;

/* loaded from: classes4.dex */
public final class ElementType implements Serializable {

    /* renamed from: type, reason: collision with root package name */
    public int f1544type;
    public ArrayList listValues = new ArrayList();
    public ArrayList elements = new ArrayList();

    public ElementType(l1 l1Var) {
        String str;
        this.f1544type = 1;
        if (!(l1Var instanceof v1)) {
            if (l1Var instanceof i0) {
                i0 i0Var = (i0) l1Var;
                if ("DateType".equals(i0Var.i)) {
                    this.f1544type = 3;
                    return;
                }
                if ("MonthYearType".equals(i0Var.i)) {
                    this.f1544type = 4;
                    return;
                }
                if ("Image".equals(i0Var.i)) {
                    this.f1544type = 7;
                    return;
                }
                o1 o1Var = i0Var.o;
                if (o1Var != null) {
                    this.f1544type = 9;
                    Iterator it = ((Vector) ((r1) o1Var).j.a).iterator();
                    while (it.hasNext()) {
                        this.elements.add(new Element((o0) it.next()));
                    }
                    return;
                }
                return;
            }
            return;
        }
        v1 v1Var = (v1) l1Var;
        j0 j0Var = v1Var.k;
        if (j0Var instanceof y1) {
            m1 m1Var = ((y1) j0Var).j;
            if (((Vector) m1Var.a).size() <= 0) {
                if ("EmailType".equals(v1Var.i)) {
                    this.f1544type = 8;
                    return;
                }
                return;
            }
            this.f1544type = 2;
            Iterator it2 = ((Vector) m1Var.a).iterator();
            while (it2.hasNext()) {
                l1 l1Var2 = (l1) it2.next();
                if (l1Var2 instanceof p0) {
                    p0 p0Var = (p0) l1Var2;
                    w wVar = p0Var.e;
                    if (wVar != null) {
                        m1 m1Var2 = wVar.e;
                        str = "";
                        if (m1Var2 != null) {
                            Iterator it3 = ((Vector) m1Var2.a).iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                if (next instanceof z) {
                                    f fVar = ((z) next).f;
                                    for (int i = 0; i < fVar.a.size(); i++) {
                                        Node item = fVar.item(i);
                                        if (item instanceof org.w3c.dom.Element) {
                                            ((org.w3c.dom.Element) item).getAttribute("default");
                                        }
                                    }
                                }
                                if (next instanceof n0) {
                                    f fVar2 = ((n0) next).g;
                                    for (int i2 = 0; i2 < fVar2.a.size(); i2++) {
                                        Node item2 = fVar2.item(i2);
                                        String nodeValue = item2.getNodeValue();
                                        if (nodeValue != null && nodeValue.length() > 0) {
                                            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
                                            m.append(item2.getNodeValue());
                                            str = m.toString();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str = null;
                    }
                    this.listValues.add(str == null ? p0Var.i.toString() : str);
                }
            }
        }
    }

    public static boolean isInlineEditingField(ElementType elementType) {
        if (elementType == null) {
            return true;
        }
        int i = elementType.f1544type;
        return (i == 2 || i == 3 || i == 4) ? false : true;
    }

    public static boolean isNonRecursiveType(String str) {
        if (str != null) {
            return str.equals("DateType") || str.equals("MonthYearType");
        }
        return false;
    }

    public final String toString() {
        String str;
        switch (this.f1544type) {
            case 1:
                str = "TEXT";
                break;
            case 2:
                str = "LIST";
                break;
            case 3:
                str = "DATE";
                break;
            case 4:
                str = "MONTHYEAR";
                break;
            case 5:
                str = "TIME";
                break;
            case 6:
                str = "NUMBER";
                break;
            case 7:
                str = "IMAGE";
                break;
            case 8:
                str = "EMAIL";
                break;
            case 9:
                str = "COMPLEX";
                break;
            default:
                str = "null";
                break;
        }
        return str.concat("");
    }
}
