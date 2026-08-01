package n8;

import a4.k;
import a4.l;
import a4.m;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f7177e;

    public /* synthetic */ a(c cVar, int i3) {
        this.f7176d = i3;
        this.f7177e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7176d) {
            case 0:
                x3.b bVar = (x3.b) obj;
                bVar.getClass();
                Log.w(c0.a(c.class).c(), "CorruptionException in " + this.f7177e.f7183a + " DataStore running in process " + Process.myPid(), bVar);
                return new b4.a(true);
            default:
                Context context = (Context) obj;
                context.getClass();
                String str = this.f7177e.f7183a;
                LinkedHashSet linkedHashSet = m.f288a;
                linkedHashSet.getClass();
                return x.c(new z3.b(context, str, z3.c.f10700a, new l(linkedHashSet, (ld.a) null, 0), new k(3, null)));
        }
    }
}
