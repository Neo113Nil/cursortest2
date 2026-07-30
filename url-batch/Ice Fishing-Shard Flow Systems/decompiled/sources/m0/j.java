package m0;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends i implements l0.d {

    /* renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f6518e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f6518e = delegate;
    }

    public final int a() {
        return this.f6518e.executeUpdateDelete();
    }
}
