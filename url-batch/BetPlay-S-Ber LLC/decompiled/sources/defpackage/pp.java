package defpackage;

import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class pp {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public pp(yo yoVar, String str, nn nnVar, vw vwVar, Map map) {
        yoVar.getClass();
        str.getClass();
        this.b = yoVar;
        this.c = str;
        this.d = nnVar;
        this.e = map;
    }

    public h8 a() {
        h8 h8Var = new h8();
        h8Var.i = new LinkedHashMap();
        h8Var.f = (yo) this.b;
        h8Var.g = (String) this.c;
        Map map = (Map) this.e;
        h8Var.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        h8Var.h = ((nn) this.d).c();
        return h8Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.e;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.c);
                sb.append(", url=");
                sb.append((yo) this.b);
                nn nnVar = (nn) this.d;
                if (nnVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = nnVar.iterator();
                    int i = 0;
                    while (true) {
                        h hVar = (h) it;
                        if (hVar.hasNext()) {
                            Object next = hVar.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            cx cxVar = (cx) next;
                            String str = (String) cxVar.f;
                            String str2 = (String) cxVar.g;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public pp(MaterialCardView materialCardView, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3) {
        this.b = materialCardView;
        this.c = checkBox;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }
}
