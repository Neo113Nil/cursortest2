package M5;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* loaded from: classes.dex */
public final class v implements U.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1624f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1625g;

    public /* synthetic */ v(String str, int i7) {
        this.f1624f = i7;
        this.f1625g = str;
    }

    @Override // U.e
    public String d() {
        return this.f1625g;
    }

    public String toString() {
        switch (this.f1624f) {
            case 0:
                return "<" + this.f1625g + '>';
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            default:
                return super.toString();
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return this.f1625g;
        }
    }

    public v(String query) {
        this.f1624f = 1;
        kotlin.jvm.internal.i.e(query, "query");
        this.f1625g = query;
    }

    @Override // U.e
    public void a(U.d dVar) {
    }
}
