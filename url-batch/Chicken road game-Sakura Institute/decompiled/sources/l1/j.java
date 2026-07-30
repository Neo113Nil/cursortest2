package l1;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5813b;

    /* renamed from: c, reason: collision with root package name */
    public int f5814c;

    public j(List list, androidx.room.c cVar) {
        this.f5812a = list;
        MotionEvent motionEvent = cVar != null ? (MotionEvent) ((androidx.room.c) cVar.f1070h).f1070h : null;
        int i7 = 0;
        this.f5813b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = cVar != null ? (MotionEvent) ((androidx.room.c) cVar.f1070h).f1070h : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = cVar != null ? (MotionEvent) ((androidx.room.c) cVar.f1070h).f1070h : null;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i7 = 6;
                                break;
                            case q.c.f7259c /* 9 */:
                                i7 = 4;
                                break;
                            case q.c.f7261e /* 10 */:
                                i7 = 5;
                                break;
                        }
                    }
                    i7 = 3;
                }
                i7 = 2;
            }
            i7 = 1;
        } else {
            int size = list.size();
            while (i7 < size) {
                v vVar = (v) list.get(i7);
                if (t.c(vVar)) {
                    i7 = 2;
                } else if (t.a(vVar)) {
                    i7 = 1;
                } else {
                    i7++;
                }
            }
            i7 = 3;
        }
        this.f5814c = i7;
    }
}
