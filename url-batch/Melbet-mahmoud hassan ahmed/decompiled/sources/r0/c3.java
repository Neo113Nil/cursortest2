package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public abstract class c3 implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final i.a<c3> f20565f = new i.a() { // from class: r0.b3
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            c3 b7;
            b7 = c3.b(bundle);
            return b7;
        }
    };

    c3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c3 b(Bundle bundle) {
        i.a aVar;
        int i7 = bundle.getInt(c(0), -1);
        if (i7 == 0) {
            aVar = v1.f21055i;
        } else if (i7 == 1) {
            aVar = p2.f20886h;
        } else if (i7 == 2) {
            aVar = l3.f20765i;
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException("Unknown RatingType: " + i7);
            }
            aVar = p3.f20888i;
        }
        return (c3) aVar.a(bundle);
    }

    private static String c(int i7) {
        return Integer.toString(i7, 36);
    }
}
