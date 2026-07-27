package t3;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends p3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f10803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC1211b f10805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(String str, p pVar, int i2, EnumC1211b enumC1211b, int i4) {
        super(str, true);
        this.f10802e = i4;
        this.f10803f = pVar;
        this.f10804g = i2;
        this.f10805h = enumC1211b;
    }

    @Override // p3.a
    public final long a() {
        switch (this.f10802e) {
            case 0:
                A a4 = this.f10803f.f10824q;
                EnumC1211b errorCode = this.f10805h;
                a4.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (this.f10803f) {
                    this.f10803f.f10813E.remove(Integer.valueOf(this.f10804g));
                    Unit unit = Unit.f7487a;
                }
                return -1L;
            default:
                p pVar = this.f10803f;
                try {
                    int i2 = this.f10804g;
                    EnumC1211b statusCode = this.f10805h;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    pVar.f10811C.i(i2, statusCode);
                } catch (IOException e4) {
                    pVar.b(e4);
                }
                return -1L;
        }
    }
}
