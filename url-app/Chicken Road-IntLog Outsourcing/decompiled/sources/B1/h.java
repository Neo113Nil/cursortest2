package B1;

import android.location.Location;
import android.os.Parcel;
import n1.C1322i;
import n1.RunnableC1302F;

/* loaded from: classes.dex */
public final class h extends A1.a implements E1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f216f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final C1322i f217e;

    public h(C1322i c1322i) {
        super("com.google.android.gms.location.ILocationListener", 1);
        this.f217e = c1322i;
    }

    @Override // A1.a
    public final boolean c(Parcel parcel, int i2) {
        if (i2 != 1) {
            return false;
        }
        Location location = (Location) k.a(parcel, Location.CREATOR);
        synchronized (this) {
            C1322i c1322i = this.f217e;
            g gVar = new g(0, location);
            c1322i.getClass();
            c1322i.f11387a.execute(new RunnableC1302F(c1322i, gVar));
        }
        return true;
    }
}
