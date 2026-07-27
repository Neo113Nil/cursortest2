package P;

import B1.C0097d;
import M2.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f3634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f3635e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f3636i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3637j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3638k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object[] f3639l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, n nVar, k kVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f3634d = bVar;
        this.f3635e = nVar;
        this.f3636i = kVar;
        this.f3637j = str;
        this.f3638k = obj;
        this.f3639l = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z4;
        b bVar = this.f3634d;
        k kVar = bVar.f3641e;
        k kVar2 = this.f3636i;
        boolean z5 = true;
        if (kVar != kVar2) {
            bVar.f3641e = kVar2;
            z4 = true;
        } else {
            z4 = false;
        }
        String str = bVar.f3642i;
        String str2 = this.f3637j;
        if (Intrinsics.a(str, str2)) {
            z5 = z4;
        } else {
            bVar.f3642i = str2;
        }
        bVar.f3640d = this.f3635e;
        bVar.f3643j = this.f3638k;
        bVar.f3644k = this.f3639l;
        C0097d c0097d = bVar.f3645l;
        if (c0097d != null && z5) {
            c0097d.I();
            bVar.f3645l = null;
            bVar.c();
        }
        return Unit.f7487a;
    }
}
