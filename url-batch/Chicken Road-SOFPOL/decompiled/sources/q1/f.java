package q1;

import a0.a0;
import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5986a;

    /* renamed from: b, reason: collision with root package name */
    public int f5987b;

    public f(List list, a0 a0Var) {
        this.f5986a = list;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = a0Var != null ? (MotionEvent) ((a0) a0Var.f12f).f12f : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = a0Var != null ? (MotionEvent) ((a0) a0Var.f12f).f12f : null;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = a0Var != null ? (MotionEvent) ((a0) a0Var.f12f).f12f : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = a0Var != null ? (MotionEvent) ((a0) a0Var.f12f).f12f : null;
        int i = 0;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                                i = 6;
                                break;
                            case v0.f8304b /* 9 */:
                                i = 4;
                                break;
                            case v0.f8306d /* 10 */:
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
                k kVar = (k) list.get(i);
                if (h0.a.l(kVar)) {
                    i = 2;
                } else if (h0.a.k(kVar)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f5987b = i;
    }
}
