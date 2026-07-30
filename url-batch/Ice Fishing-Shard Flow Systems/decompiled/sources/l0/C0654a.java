package l0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654a implements e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6260d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6261e;

    public C0654a(String query, int i2) {
        this.f6260d = i2;
        switch (i2) {
            case 1:
                this.f6261e = query;
                break;
            default:
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(query, "query");
                this.f6261e = query;
                break;
        }
    }

    @Override // l0.e
    public String a() {
        return this.f6261e;
    }

    @Override // l0.e
    public void d(d statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    public String toString() {
        switch (this.f6260d) {
            case 1:
                return "<" + this.f6261e + '>';
            default:
                return super.toString();
        }
    }
}
