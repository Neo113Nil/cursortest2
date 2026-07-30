package defpackage;

import android.view.MotionEvent;
import com.appsflyer.attribution.RequestError;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mx0 {
    public final List a;
    public final e30 b;
    public int c;

    public mx0(List list, e30 e30Var) {
        this.a = list;
        this.b = e30Var;
        MotionEvent a = a();
        if (a != null) {
            a.getClassification();
        }
        MotionEvent a2 = a();
        if (a2 != null) {
            a2.getButtonState();
        }
        MotionEvent a3 = a();
        if (a3 != null) {
            a3.getMetaState();
        }
        MotionEvent a4 = a();
        int i = 0;
        if (a4 != null) {
            int actionMasked = a4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case RequestError.EVENT_TIMEOUT /* 10 */:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                qx0 qx0Var = (qx0) list.get(i);
                if (ka0.j(qx0Var)) {
                    i = 2;
                } else if (ka0.i(qx0Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.c = i;
    }

    public final MotionEvent a() {
        e30 e30Var = this.b;
        if (e30Var != null) {
            return (MotionEvent) ((yw) e30Var.c).g;
        }
        return null;
    }
}
