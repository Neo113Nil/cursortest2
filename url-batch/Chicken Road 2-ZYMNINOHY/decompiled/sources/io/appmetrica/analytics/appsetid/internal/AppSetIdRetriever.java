package io.appmetrica.analytics.appsetid.internal;

import X1.a;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import d2.C0389g;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import t2.InterfaceC1440a;
import t2.e;
import t2.f;
import t2.j;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9435a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f9436b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i4) {
        appSetIdRetriever.getClass();
        return i4 != 1 ? i4 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) throws Throwable {
        j F4 = new C0389g(context).F();
        InterfaceC1440a interfaceC1440a = new InterfaceC1440a() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // t2.InterfaceC1440a
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f9435a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f9436b;
                    list.remove(this);
                }
                if (task.c()) {
                    appSetIdListener.onAppSetIdRetrieved(((a) task.b()).f3607a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((a) task.b()).f3608b));
                } else {
                    appSetIdListener.onFailure(task.a());
                }
            }
        };
        synchronized (this.f9435a) {
            this.f9436b.add(interfaceC1440a);
        }
        F4.f15419b.b(new f(e.f15408a, interfaceC1440a));
        F4.g();
    }
}
