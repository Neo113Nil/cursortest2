package i2;

import kotlin.jvm.functions.Function1;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4632e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f4633i;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4634d;

    static {
        int i3 = 1;
        f4632e = new a(i3, 0);
        f4633i = new a(i3, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i3, int i10) {
        super(i3);
        this.f4634d = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4634d) {
            case 0:
                throw null;
            default:
                v4.a.w(obj);
                throw null;
        }
    }
}
