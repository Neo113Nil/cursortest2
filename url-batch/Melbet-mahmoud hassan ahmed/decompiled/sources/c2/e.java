package c2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import m4.q;
import r0.i;

/* loaded from: classes.dex */
public final class e implements r0.i {

    /* renamed from: g, reason: collision with root package name */
    public static final e f1859g = new e(q.x());

    /* renamed from: h, reason: collision with root package name */
    public static final i.a<e> f1860h = new i.a() { // from class: c2.d
        @Override // r0.i.a
        public final r0.i a(Bundle bundle) {
            e b7;
            b7 = e.b(bundle);
            return b7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final q<b> f1861f;

    public e(List<b> list) {
        this.f1861f = q.t(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(0));
        return new e(parcelableArrayList == null ? q.x() : o2.c.b(b.f1823x, parcelableArrayList));
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }
}
