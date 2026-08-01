package d2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n2 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public ie.b f3488d;

    /* renamed from: e, reason: collision with root package name */
    public int f3489e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3490i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f3491r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Uri f3492s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o2 f3493t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ie.c f3494u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f3495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(ContentResolver contentResolver, Uri uri, o2 o2Var, ie.c cVar, Context context, ld.a aVar) {
        super(2, aVar);
        this.f3491r = contentResolver;
        this.f3492s = uri;
        this.f3493t = o2Var;
        this.f3494u = cVar;
        this.f3495v = context;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        n2 n2Var = new n2(this.f3491r, this.f3492s, this.f3493t, this.f3494u, this.f3495v, aVar);
        n2Var.f3490i = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((je.f) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r6.b(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:9:0x0043, B:15:0x0054, B:17:0x005c, B:25:0x002b, B:27:0x003c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007e -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        je.f fVar;
        ie.b bVar;
        je.f fVar2;
        ie.b bVar2;
        Object b10;
        md.a aVar = md.a.f6622d;
        int i3 = this.f3489e;
        o2 o2Var = this.f3493t;
        ContentResolver contentResolver = this.f3491r;
        try {
            if (i3 == 0) {
                cf.c.M(obj);
                fVar = (je.f) this.f3490i;
                contentResolver.registerContentObserver(this.f3492s, false, o2Var);
                bVar = new ie.b(this.f3494u);
                this.f3490i = fVar;
                this.f3488d = bVar;
                this.f3489e = 1;
                b10 = bVar.b(this);
                if (b10 != aVar) {
                }
            } else if (i3 == 1) {
                bVar2 = this.f3488d;
                fVar2 = (je.f) this.f3490i;
                cf.c.M(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = this.f3488d;
                fVar2 = (je.f) this.f3490i;
                cf.c.M(obj);
                fVar = fVar2;
                bVar = bVar2;
                this.f3490i = fVar;
                this.f3488d = bVar;
                this.f3489e = 1;
                b10 = bVar.b(this);
                if (b10 != aVar) {
                    return aVar;
                }
                ie.b bVar3 = bVar;
                fVar2 = fVar;
                obj = b10;
                bVar2 = bVar3;
                if (((Boolean) obj).booleanValue()) {
                    contentResolver.unregisterContentObserver(o2Var);
                    return Unit.f5554a;
                }
                bVar2.c();
                Context context = this.f3495v;
                s.h0 h0Var = p2.f3507a;
                Float f3 = new Float(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f));
                this.f3490i = fVar2;
                this.f3488d = bVar2;
                this.f3489e = 2;
            }
        } catch (Throwable th) {
            contentResolver.unregisterContentObserver(o2Var);
            throw th;
        }
    }
}
