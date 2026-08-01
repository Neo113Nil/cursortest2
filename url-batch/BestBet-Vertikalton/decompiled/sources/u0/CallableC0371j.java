package u0;

import android.database.Cursor;
import c1.AbstractC0091d;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0371j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0.p f4188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0372k f4189c;

    public /* synthetic */ CallableC0371j(C0372k c0372k, h0.p pVar, int i) {
        this.f4187a = i;
        this.f4189c = c0372k;
        this.f4188b = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor l2;
        switch (this.f4187a) {
            case 0:
                l2 = ((FortuneQuestDatabase_Impl) this.f4189c.f4190a).l(this.f4188b, null);
                try {
                    int i = AbstractC0091d.i(l2, "id");
                    int i2 = AbstractC0091d.i(l2, "title");
                    int i3 = AbstractC0091d.i(l2, "symbolIndex");
                    int i4 = AbstractC0091d.i(l2, "createdAt");
                    int i5 = AbstractC0091d.i(l2, "active");
                    ArrayList arrayList = new ArrayList(l2.getCount());
                    while (l2.moveToNext()) {
                        arrayList.add(new C0373l(l2.getLong(i), l2.isNull(i2) ? null : l2.getString(i2), l2.getInt(i3), l2.getLong(i4), l2.getInt(i5) != 0));
                    }
                    return arrayList;
                } finally {
                }
            default:
                l2 = ((FortuneQuestDatabase_Impl) this.f4189c.f4190a).l(this.f4188b, null);
                try {
                    int i6 = AbstractC0091d.i(l2, "id");
                    int i7 = AbstractC0091d.i(l2, "title");
                    int i8 = AbstractC0091d.i(l2, "symbolIndex");
                    int i9 = AbstractC0091d.i(l2, "createdAt");
                    int i10 = AbstractC0091d.i(l2, "active");
                    ArrayList arrayList2 = new ArrayList(l2.getCount());
                    while (l2.moveToNext()) {
                        arrayList2.add(new C0373l(l2.getLong(i6), l2.isNull(i7) ? null : l2.getString(i7), l2.getInt(i8), l2.getLong(i9), l2.getInt(i10) != 0));
                    }
                    return arrayList2;
                } finally {
                }
        }
    }
}
