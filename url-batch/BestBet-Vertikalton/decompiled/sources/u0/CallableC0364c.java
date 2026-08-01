package u0;

import android.database.Cursor;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0364c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0.p f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0365d f4173c;

    public /* synthetic */ CallableC0364c(C0365d c0365d, h0.p pVar, int i) {
        this.f4171a = i;
        this.f4173c = c0365d;
        this.f4172b = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor l2;
        switch (this.f4171a) {
            case 0:
                l2 = ((FortuneQuestDatabase_Impl) this.f4173c.f4175b).l(this.f4172b, null);
                try {
                    int i = AbstractC0091d.i(l2, "habitId");
                    int i2 = AbstractC0091d.i(l2, "dayEpoch");
                    ArrayList arrayList = new ArrayList(l2.getCount());
                    while (l2.moveToNext()) {
                        arrayList.add(new C0368g(l2.getLong(i), l2.getLong(i2)));
                    }
                    return arrayList;
                } finally {
                }
            default:
                Integer num = null;
                l2 = ((FortuneQuestDatabase_Impl) this.f4173c.f4175b).l(this.f4172b, null);
                try {
                    if (l2.moveToFirst() && !l2.isNull(0)) {
                        num = Integer.valueOf(l2.getInt(0));
                    }
                    return num;
                } finally {
                }
        }
    }
}
