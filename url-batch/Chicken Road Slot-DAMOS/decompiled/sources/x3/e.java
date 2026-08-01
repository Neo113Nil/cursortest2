package x3;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends nd.i implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10349d;

    /* renamed from: e, reason: collision with root package name */
    public int f10350e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f10351i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, ld.a aVar, int i3) {
        super(1, aVar);
        this.f10349d = i3;
        this.f10351i = obj;
    }

    @Override // nd.a
    public final ld.a create(ld.a aVar) {
        switch (this.f10349d) {
            case 0:
                return new e((z3.b) this.f10351i, aVar, 0);
            default:
                return new e((w) this.f10351i, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ld.a aVar = (ld.a) obj;
        switch (this.f10349d) {
        }
        return ((e) create(aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        switch (this.f10349d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10350e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    z3.b bVar = (z3.b) this.f10351i;
                    this.f10350e = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) bVar.f10698e.getValue()).edit();
                    LinkedHashSet linkedHashSet = bVar.f10699f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) bVar.f10698e.getValue()).getAll().isEmpty() && (context = bVar.f10696c) != null) {
                        context.deleteSharedPreferences(bVar.f10697d);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.f5554a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10350e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                w wVar = (w) this.f10351i;
                this.f10350e = 1;
                Object invoke = wVar.invoke(this);
                return invoke == aVar2 ? aVar2 : invoke;
        }
    }
}
