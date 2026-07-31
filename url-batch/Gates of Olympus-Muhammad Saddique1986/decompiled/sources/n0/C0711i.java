package n0;

import android.view.MotionEvent;
import java.util.List;
import r.AbstractC0856c;
import z.C1256t;

/* renamed from: n0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7293b;

    /* renamed from: c, reason: collision with root package name */
    public int f7294c;

    public C0711i(List list, C1256t c1256t) {
        this.f7292a = list;
        MotionEvent motionEvent = c1256t != null ? (MotionEvent) ((C1256t) c1256t.f10467f).f10467f : null;
        int i3 = 0;
        this.f7293b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = c1256t != null ? (MotionEvent) ((C1256t) c1256t.f10467f).f10467f : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = c1256t != null ? (MotionEvent) ((C1256t) c1256t.f10467f).f10467f : null;
        int i4 = 1;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i3 >= size) {
                    i4 = 3;
                    break;
                }
                s sVar = (s) list.get(i3);
                if (q.c(sVar)) {
                    i4 = 2;
                    break;
                } else if (q.a(sVar)) {
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
                            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                                i3 = 6;
                                break;
                            case AbstractC0856c.f8037c /* 9 */:
                                i3 = 4;
                                break;
                            case AbstractC0856c.f8039e /* 10 */:
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
        this.f7294c = i4;
    }
}
