package n0;

import android.view.MotionEvent;
import f.AbstractC0382a;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6214a;

    /* renamed from: b, reason: collision with root package name */
    public int f6215b;

    public g(List list, C2.c cVar) {
        this.f6214a = list;
        MotionEvent motionEvent = cVar != null ? (MotionEvent) ((C2.c) cVar.f485f).f485f : null;
        int i3 = 0;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = cVar != null ? (MotionEvent) ((C2.c) cVar.f485f).f485f : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = cVar != null ? (MotionEvent) ((C2.c) cVar.f485f).f485f : null;
        int i4 = 1;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i3 >= size) {
                    i4 = 3;
                    break;
                }
                m mVar = (m) list.get(i3);
                if (s.b(mVar)) {
                    i4 = 2;
                    break;
                } else if (s.a(mVar)) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i3 = 6;
                                break;
                            case AbstractC0382a.f4777a /* 9 */:
                                i3 = 4;
                                break;
                            case AbstractC0382a.f4779c /* 10 */:
                                i3 = 5;
                                break;
                        }
                        i4 = i3;
                    }
                    i3 = 3;
                    i4 = i3;
                }
                i3 = 2;
                i4 = i3;
            }
            i3 = 1;
            i4 = i3;
        }
        this.f6215b = i4;
    }
}
