package p2;

import android.os.Looper;
import java.util.List;
import o2.H0;
import t2.u;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3377a implements u {
    @Override // t2.u
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // t2.u
    public H0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // t2.u
    public int c() {
        return 1073741823;
    }
}
