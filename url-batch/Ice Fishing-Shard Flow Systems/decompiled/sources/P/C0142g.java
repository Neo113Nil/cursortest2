package P;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: P.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142g extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f2085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ R.c f2086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142g(R.c cVar, V5.b bVar) {
        super(1, bVar);
        this.f2086e = cVar;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new C0142g(this.f2086e, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0142g) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    @Override // X5.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2085d;
        if (i2 == 0) {
            V6.b.P(obj);
            this.f2085d = 1;
            R.c cVar = this.f2086e;
            SharedPreferences.Editor edit = ((SharedPreferences) cVar.f2365e.getValue()).edit();
            LinkedHashSet linkedHashSet = cVar.f2366f;
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
            if (((SharedPreferences) cVar.f2365e.getValue()).getAll().isEmpty() && (context = cVar.f2363c) != null && (str = cVar.f2364d) != null) {
                R.a.a(context, str);
            }
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            if (Unit.f6114a == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
        }
        return Unit.f6114a;
    }
}
