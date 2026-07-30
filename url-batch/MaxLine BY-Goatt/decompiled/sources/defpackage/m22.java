package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class m22 {
    public final List a;
    public final int b;
    public int c;

    public m22(List list, t21 t21Var) {
        this.a = list;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = t21Var != null ? (MotionEvent) ((tt1) t21Var.o).o : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = t21Var != null ? (MotionEvent) ((tt1) t21Var.o).o : null;
        int i = 0;
        this.b = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = t21Var != null ? (MotionEvent) ((tt1) t21Var.o).o : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = t21Var != null ? (MotionEvent) ((tt1) t21Var.o).o : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
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
                t22 t22Var = (t22) list.get(i);
                if (s93.B(t22Var)) {
                    i = 2;
                } else if (s93.z(t22Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.c = i;
    }
}
