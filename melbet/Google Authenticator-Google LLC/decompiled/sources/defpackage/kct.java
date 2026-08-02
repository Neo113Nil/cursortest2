package defpackage;

import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kct implements hut {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public kct(dfj dfjVar, dff dffVar, ListPreference listPreference, String str, int i) {
        this.e = i;
        this.d = dfjVar;
        this.a = dffVar;
        this.c = listPreference;
        this.b = str;
    }

    @Override // defpackage.hut
    public final void a(Throwable th) {
        if (this.e == 0) {
            ((kbg) this.a).a(kbq.k.d(th).e("Authorization future failed"), new kaa());
        } else {
            th.getClass();
            ((hkf) ((hkf) dfj.c.f()).h(th).i("com/google/android/libraries/androidatgoogle/privacy/settings/PrivacyScreenSettingsFragment$authDelayListChangeListener$<anonymous>$<anonymous>$<anonymous>", "onFailure", 106, "PrivacyScreenSettingsFragment.kt")).u("Failed to change authentication delay to %s", ((dff) this.a).name());
            ((ListPreference) this.c).o((String) this.b);
            ((dfj) this.d).aH(true);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kbh] */
    @Override // defpackage.hut
    public final /* synthetic */ void b(Object obj) {
        if (this.e != 0) {
            ((dfj) this.d).aH(true);
            return;
        }
        kbq kbqVar = (kbq) obj;
        if (!kbqVar.g()) {
            ((kbg) this.a).a(kbqVar, new kaa());
            return;
        }
        Object obj2 = this.b;
        Object obj3 = this.a;
        try {
            kdv kdvVar = (kdv) obj2;
            kdvVar.a.set(this.d.a((kbg) obj3, (kaa) this.c));
            kdvVar.l();
        } catch (RuntimeException e) {
            ((kbg) obj3).a(kbq.k.d(e).e("Failed to start server call after authorization check"), new kaa());
        }
    }

    public kct(kbg kbgVar, kdv kdvVar, kaa kaaVar, kbh kbhVar, int i) {
        this.e = i;
        this.a = kbgVar;
        this.b = kdvVar;
        this.c = kaaVar;
        this.d = kbhVar;
    }
}
