package h5;

import android.os.Bundle;
import androidx.lifecycle.p;
import f5.e;
import java.util.LinkedHashMap;
import kotlin.collections.i0;
import u8.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f4468a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.b f4469b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4472e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f4473f;
    public boolean g;

    /* renamed from: c, reason: collision with root package name */
    public final d f4470c = new d(26);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4471d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4474h = true;

    public b(e eVar, a1.b bVar) {
        this.f4468a = eVar;
        this.f4469b = bVar;
    }

    public final void a() {
        e eVar = this.f4468a;
        if (eVar.g().f737c != p.f708e) {
            i0.l("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f4472e) {
                i0.l("SavedStateRegistry was already attached.");
                return;
            }
            this.f4469b.invoke();
            eVar.g().a(new a(0, this));
            this.f4472e = true;
        }
    }
}
