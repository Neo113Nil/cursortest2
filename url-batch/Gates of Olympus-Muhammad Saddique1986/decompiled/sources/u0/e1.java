package u0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import e2.InterfaceC0426e;
import s2.C0969c;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class e1 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0969c f9338h;

    /* renamed from: i, reason: collision with root package name */
    public int f9339i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f9340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f9341k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f9342l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f1 f9343m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s2.g f9344n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f9345o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ContentResolver contentResolver, Uri uri, f1 f1Var, s2.g gVar, Context context, V1.d dVar) {
        super(2, dVar);
        this.f9341k = contentResolver;
        this.f9342l = uri;
        this.f9343m = f1Var;
        this.f9344n = gVar;
        this.f9345o = context;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((e1) o((V1.d) obj2, (InterfaceC1054g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        s2.g gVar = this.f9344n;
        e1 e1Var = new e1(this.f9341k, this.f9342l, this.f9343m, gVar, this.f9345o, dVar);
        e1Var.f9340j = obj;
        return e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:14:0x0055, B:16:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC1054g interfaceC1054g;
        C0969c c0969c;
        InterfaceC1054g interfaceC1054g2;
        C0969c c0969c2;
        Object b3;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9339i;
        f1 f1Var = this.f9343m;
        ContentResolver contentResolver = this.f9341k;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                interfaceC1054g = (InterfaceC1054g) this.f9340j;
                contentResolver.registerContentObserver(this.f9342l, false, f1Var);
                c0969c = new C0969c(this.f9344n);
                this.f9340j = interfaceC1054g;
                this.f9338h = c0969c;
                this.f9339i = 1;
                b3 = c0969c.b(this);
                if (b3 == aVar) {
                }
            } else if (i3 == 1) {
                c0969c2 = this.f9338h;
                interfaceC1054g2 = (InterfaceC1054g) this.f9340j;
                R1.a.e(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0969c2 = this.f9338h;
                interfaceC1054g2 = (InterfaceC1054g) this.f9340j;
                R1.a.e(obj);
                interfaceC1054g = interfaceC1054g2;
                c0969c = c0969c2;
                this.f9340j = interfaceC1054g;
                this.f9338h = c0969c;
                this.f9339i = 1;
                b3 = c0969c.b(this);
                if (b3 == aVar) {
                    return aVar;
                }
                C0969c c0969c3 = c0969c;
                interfaceC1054g2 = interfaceC1054g;
                obj = b3;
                c0969c2 = c0969c3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(f1Var);
                    return R1.y.f4171a;
                }
                c0969c2.c();
                Float f3 = new Float(Settings.Global.getFloat(this.f9345o.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f9340j = interfaceC1054g2;
                this.f9338h = c0969c2;
                this.f9339i = 2;
                if (interfaceC1054g2.e(f3, this) == aVar) {
                    return aVar;
                }
                interfaceC1054g = interfaceC1054g2;
                c0969c = c0969c2;
                this.f9340j = interfaceC1054g;
                this.f9338h = c0969c;
                this.f9339i = 1;
                b3 = c0969c.b(this);
                if (b3 == aVar) {
                }
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(f1Var);
            throw th;
        }
    }
}
