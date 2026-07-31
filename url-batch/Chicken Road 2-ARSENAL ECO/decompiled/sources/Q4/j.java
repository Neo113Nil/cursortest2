package Q4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2027a;

    public j(int i7) {
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f2027a = new ArrayList();
                break;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                this.f2027a = new ArrayList(20);
                break;
            default:
                this.f2027a = new ArrayList();
                break;
        }
    }

    public i a() {
        return new i(this.f2027a);
    }

    public W3.a b() {
        ArrayList arrayList = this.f2027a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new W3.a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = W3.a.f2799i;
        for (int i7 = 0; i7 < array.length; i7 += 2) {
            X3.a aVar = (X3.a) array[i7];
            if (aVar != null && aVar.f2864b.isEmpty()) {
                array[i7] = null;
            }
        }
        return new W3.a(array, W3.a.f2799i);
    }

    public X5.n c() {
        return new X5.n((String[]) this.f2027a.toArray(new String[0]));
    }

    public void d(String str) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2027a;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }
}
