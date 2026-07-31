package t;

import e2.InterfaceC0424c;
import java.util.Map;

/* loaded from: classes.dex */
public final class G extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R.k f8440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(R.k kVar, int i3) {
        super(1);
        this.f8439e = i3;
        this.f8440f = kVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f8439e) {
            case 0:
                R.k kVar = this.f8440f;
                return Boolean.valueOf(kVar != null ? kVar.b(obj) : true);
            default:
                return new I(this.f8440f, (Map) obj);
        }
    }
}
