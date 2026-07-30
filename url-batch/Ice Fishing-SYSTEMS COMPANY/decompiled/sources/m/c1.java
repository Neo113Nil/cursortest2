package m;

import a2.C0426e;
import android.app.Application;
import android.content.Context;
import b2.InterfaceC0525b;
import com.google.android.gms.internal.consent_sdk.C4333g;
import com.google.android.gms.internal.consent_sdk.C4349k;
import com.google.android.gms.internal.consent_sdk.C4357m;
import com.google.android.gms.internal.consent_sdk.C4365o;
import com.google.android.gms.internal.consent_sdk.C4399w2;
import com.google.android.gms.internal.consent_sdk.C4400x;
import com.google.android.gms.internal.consent_sdk.Z2;
import com.google.android.gms.internal.consent_sdk.a3;
import e3.C4470a;
import f2.C4500c;
import g1.C4523c;
import h2.InterfaceC4566c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p7.InterfaceC4864a;

/* loaded from: classes.dex */
public final class c1 implements a3, InterfaceC0525b {

    /* renamed from: n, reason: collision with root package name */
    public Object f39394n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39395u;

    /* renamed from: v, reason: collision with root package name */
    public Object f39396v;

    /* renamed from: w, reason: collision with root package name */
    public Object f39397w;

    /* renamed from: x, reason: collision with root package name */
    public Object f39398x;

    /* renamed from: y, reason: collision with root package name */
    public Object f39399y;

    /* renamed from: z, reason: collision with root package name */
    public Object f39400z;

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f39394n = obj;
        this.f39395u = obj2;
        this.f39396v = obj3;
        this.f39397w = obj4;
        this.f39398x = obj5;
        this.f39399y = obj6;
        this.f39400z = obj7;
    }

    @Override // com.google.android.gms.internal.consent_sdk.b3
    public Object d() {
        Application application = (Application) ((C4399w2) this.f39394n).f35944u;
        return new C4349k(application, (com.google.android.gms.internal.consent_sdk.r) ((Z2) this.f39396v).d(), (C4333g) ((Z2) this.f39397w).d(), (C4365o) ((C4399w2) this.f39398x).f35944u, (C4357m) this.f39399y, (C4400x) ((Z2) this.f39400z).d());
    }

    @Override // p7.InterfaceC4864a
    public Object get() {
        return new f2.i((Context) ((C4523c) this.f39394n).f37856u, (C0426e) ((InterfaceC4864a) this.f39395u).get(), (g2.d) ((InterfaceC4864a) this.f39396v).get(), (C4500c) ((Y2.e) this.f39397w).get(), (Executor) ((InterfaceC4864a) this.f39398x).get(), (InterfaceC4566c) ((InterfaceC4864a) this.f39399y).get(), new L2.i(19), new C3.e(), (g2.c) ((InterfaceC4864a) this.f39400z).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public c1(Set set, s.b bVar, String str, String str2, C4470a c4470a) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f39394n = unmodifiableSet;
        s.b bVar2 = bVar == null ? Collections.EMPTY_MAP : bVar;
        this.f39396v = bVar2;
        this.f39397w = str;
        this.f39398x = str2;
        this.f39399y = c4470a == null ? C4470a.f37325b : c4470a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = bVar2.values().iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
        this.f39395u = Collections.unmodifiableSet(hashSet);
    }
}
