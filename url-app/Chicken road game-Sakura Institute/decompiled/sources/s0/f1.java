package s0;

import Z2.InterfaceC0331g;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class f1 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Y2.c f10205k;

    /* renamed from: l, reason: collision with root package name */
    public int f10206l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10207m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f10208n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Uri f10209o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g1 f10210p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y2.e f10211q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f10212r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ContentResolver contentResolver, Uri uri, g1 g1Var, Y2.e eVar, Context context, C2.a aVar) {
        super(2, aVar);
        this.f10208n = contentResolver;
        this.f10209o = uri;
        this.f10210p = g1Var;
        this.f10211q = eVar;
        this.f10212r = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((f1) j((C2.a) obj2, (InterfaceC0331g) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        Y2.e eVar = this.f10211q;
        f1 f1Var = new f1(this.f10208n, this.f10209o, this.f10210p, eVar, this.f10212r, aVar);
        f1Var.f10207m = obj;
        return f1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:14:0x0055, B:16:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0331g interfaceC0331g;
        Y2.c cVar;
        InterfaceC0331g interfaceC0331g2;
        Y2.c cVar2;
        Object b4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10206l;
        g1 g1Var = this.f10210p;
        ContentResolver contentResolver = this.f10208n;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                interfaceC0331g = (InterfaceC0331g) this.f10207m;
                contentResolver.registerContentObserver(this.f10209o, false, g1Var);
                cVar = new Y2.c(this.f10211q);
                this.f10207m = interfaceC0331g;
                this.f10205k = cVar;
                this.f10206l = 1;
                b4 = cVar.b(this);
                if (b4 == aVar) {
                }
            } else if (i2 == 1) {
                cVar2 = this.f10205k;
                interfaceC0331g2 = (InterfaceC0331g) this.f10207m;
                AbstractC1343r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = this.f10205k;
                interfaceC0331g2 = (InterfaceC0331g) this.f10207m;
                AbstractC1343r.b(obj);
                interfaceC0331g = interfaceC0331g2;
                cVar = cVar2;
                this.f10207m = interfaceC0331g;
                this.f10205k = cVar;
                this.f10206l = 1;
                b4 = cVar.b(this);
                if (b4 == aVar) {
                    return aVar;
                }
                Y2.c cVar3 = cVar;
                interfaceC0331g2 = interfaceC0331g;
                obj = b4;
                cVar2 = cVar3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(g1Var);
                    return Unit.f7487a;
                }
                cVar2.c();
                Float f4 = new Float(Settings.Global.getFloat(this.f10212r.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f10207m = interfaceC0331g2;
                this.f10205k = cVar2;
                this.f10206l = 2;
                if (interfaceC0331g2.d(f4, this) == aVar) {
                    return aVar;
                }
                interfaceC0331g = interfaceC0331g2;
                cVar = cVar2;
                this.f10207m = interfaceC0331g;
                this.f10205k = cVar;
                this.f10206l = 1;
                b4 = cVar.b(this);
                if (b4 == aVar) {
                }
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(g1Var);
            throw th;
        }
    }
}
