package i5;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.Map;
import t5.q;
import t5.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4939f;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f4940g;

    public /* synthetic */ e(Iterator it, int i7) {
        this.f4939f = i7;
        this.f4940g = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4939f) {
        }
        return this.f4940g.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4939f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Map.Entry) this.f4940g.next()).getKey();
            default:
                Map.Entry entry = (Map.Entry) this.f4940g.next();
                return new q((t5.c) entry.getKey(), (s) entry.getValue());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4939f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.f4940g.remove();
                break;
            default:
                this.f4940g.remove();
                break;
        }
    }
}
