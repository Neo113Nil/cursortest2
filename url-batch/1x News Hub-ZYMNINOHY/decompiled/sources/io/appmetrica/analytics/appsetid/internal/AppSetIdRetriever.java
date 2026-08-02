package io.appmetrica.analytics.appsetid.internal;

import H0.a;
import V0.e;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import d1.b;
import d1.f;
import d1.g;
import d1.k;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5195a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f5196b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i3) {
        appSetIdRetriever.getClass();
        return i3 != 1 ? i3 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) throws Throwable {
        k A3 = new e(context, 28).A();
        b bVar = new b() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // d1.b
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f5195a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f5196b;
                    list.remove(this);
                }
                if (task.c()) {
                    appSetIdListener.onAppSetIdRetrieved(((a) task.b()).f597a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((a) task.b()).f598b));
                } else {
                    appSetIdListener.onFailure(task.a());
                }
            }
        };
        synchronized (this.f5195a) {
            this.f5196b.add(bVar);
        }
        A3.f4943b.d(new g(f.f4932a, bVar));
        A3.g();
    }
}
