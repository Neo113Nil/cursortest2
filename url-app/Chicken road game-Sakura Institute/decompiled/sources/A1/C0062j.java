package A1;

import java.util.Comparator;
import z1.C1374S;
import z1.C1377c;
import z1.C1393s;

/* renamed from: A1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f616a;

    public /* synthetic */ C0062j(int i2) {
        this.f616a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f616a) {
            case 0:
                return B2.b.a(((C1374S) obj2).f11845c, ((C1374S) obj).f11845c);
            case 1:
                return B2.b.a(Integer.valueOf(((C1393s) obj).f11909c), Integer.valueOf(((C1393s) obj2).f11909c));
            case 2:
                return B2.b.a(Integer.valueOf(((C1393s) obj).f11909c), Integer.valueOf(((C1393s) obj2).f11909c));
            case 3:
                return B2.b.a(Integer.valueOf(((C1393s) obj).f11909c), Integer.valueOf(((C1393s) obj2).f11909c));
            case 4:
                return B2.b.a(Double.valueOf(((u0) obj).f732d), Double.valueOf(((u0) obj2).f732d));
            case 5:
                return B2.b.a(Double.valueOf(((u0) obj2).f732d), Double.valueOf(((u0) obj).f732d));
            case 6:
                return B2.b.a(Integer.valueOf(((C1377c) obj).f11853c), Integer.valueOf(((C1377c) obj2).f11853c));
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return B2.b.a(Integer.valueOf(((C1377c) obj).f11853c), Integer.valueOf(((C1377c) obj2).f11853c));
            default:
                return B2.b.a(((C1374S) obj2).f11845c, ((C1374S) obj).f11845c);
        }
    }
}
