package u0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import m2.C0628c;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class T0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0628c f8250e;

    /* renamed from: f, reason: collision with root package name */
    public int f8251f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f8252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f8253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Uri f8254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ U0 f8255j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m2.e f8256k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f8257l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(ContentResolver contentResolver, Uri uri, U0 u02, m2.e eVar, Context context, P1.d dVar) {
        super(2, dVar);
        this.f8253h = contentResolver;
        this.f8254i = uri;
        this.f8255j = u02;
        this.f8256k = eVar;
        this.f8257l = context;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        m2.e eVar = this.f8256k;
        T0 t02 = new T0(this.f8253h, this.f8254i, this.f8255j, eVar, this.f8257l, dVar);
        t02.f8252g = obj;
        return t02;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((T0) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0044, B:14:0x0055, B:16:0x005d, B:25:0x002c, B:27:0x003d), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0701g interfaceC0701g;
        C0628c c0628c;
        InterfaceC0701g interfaceC0701g2;
        C0628c c0628c2;
        Object b2;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8251f;
        U0 u02 = this.f8255j;
        ContentResolver contentResolver = this.f8253h;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                interfaceC0701g = (InterfaceC0701g) this.f8252g;
                contentResolver.registerContentObserver(this.f8254i, false, u02);
                c0628c = new C0628c(this.f8256k);
                this.f8252g = interfaceC0701g;
                this.f8250e = c0628c;
                this.f8251f = 1;
                b2 = c0628c.b(this);
                if (b2 == aVar) {
                }
            } else if (i3 == 1) {
                c0628c2 = this.f8250e;
                interfaceC0701g2 = (InterfaceC0701g) this.f8252g;
                I2.l.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0628c2 = this.f8250e;
                interfaceC0701g2 = (InterfaceC0701g) this.f8252g;
                I2.l.Q(obj);
                interfaceC0701g = interfaceC0701g2;
                c0628c = c0628c2;
                this.f8252g = interfaceC0701g;
                this.f8250e = c0628c;
                this.f8251f = 1;
                b2 = c0628c.b(this);
                if (b2 == aVar) {
                    return aVar;
                }
                C0628c c0628c3 = c0628c;
                interfaceC0701g2 = interfaceC0701g;
                obj = b2;
                c0628c2 = c0628c3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(u02);
                    return L1.z.f2729a;
                }
                c0628c2.c();
                Float f3 = new Float(Settings.Global.getFloat(this.f8257l.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f8252g = interfaceC0701g2;
                this.f8250e = c0628c2;
                this.f8251f = 2;
                if (interfaceC0701g2.emit(f3, this) == aVar) {
                    return aVar;
                }
                interfaceC0701g = interfaceC0701g2;
                c0628c = c0628c2;
                this.f8252g = interfaceC0701g;
                this.f8250e = c0628c;
                this.f8251f = 1;
                b2 = c0628c.b(this);
                if (b2 == aVar) {
                }
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(u02);
            throw th;
        }
    }
}
