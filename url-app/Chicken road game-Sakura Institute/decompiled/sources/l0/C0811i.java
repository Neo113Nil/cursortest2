package l0;

import android.view.MotionEvent;
import java.util.List;
import q.AbstractC1024c;

/* renamed from: l0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7908b;

    /* renamed from: c, reason: collision with root package name */
    public int f7909c;

    public C0811i(List list, y.t tVar) {
        this.f7907a = list;
        MotionEvent motionEvent = tVar != null ? (MotionEvent) ((y.t) tVar.f11495i).f11495i : null;
        int i2 = 0;
        this.f7908b = motionEvent != null ? motionEvent.getButtonState() : 0;
        MotionEvent motionEvent2 = tVar != null ? (MotionEvent) ((y.t) tVar.f11495i).f11495i : null;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = tVar != null ? (MotionEvent) ((y.t) tVar.f11495i).f11495i : null;
        int i4 = 1;
        if (motionEvent3 == null) {
            int size = list.size();
            while (true) {
                if (i2 >= size) {
                    i4 = 3;
                    break;
                }
                s sVar = (s) list.get(i2);
                if (AbstractC0819q.c(sVar)) {
                    i4 = 2;
                    break;
                } else if (AbstractC0819q.a(sVar)) {
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                                i2 = 6;
                                break;
                            case AbstractC1024c.f9242c /* 9 */:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                        i4 = i2;
                    }
                    i2 = 3;
                    i4 = i2;
                }
                i2 = 2;
                i4 = i2;
            }
            i2 = 1;
            i4 = i2;
        }
        this.f7909c = i4;
    }
}
