package defpackage;

import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cbv implements gbj {
    final /* synthetic */ cbw a;

    public cbv(cbw cbwVar) {
        this.a = cbwVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        cbw cbwVar = this.a;
        ListPreference listPreference = cbwVar.k;
        listPreference.n(listPreference.g[num.intValue()]);
        cbwVar.k.e(num.intValue());
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
