package B1;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* renamed from: B1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264f implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* renamed from: b, reason: collision with root package name */
    public final o f94b;

    public /* synthetic */ C0264f(o oVar, int i) {
        this.f93a = i;
        this.f94b = oVar;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i4, s1.h hVar) {
        switch (this.f93a) {
            case 0:
                o oVar = this.f94b;
                return oVar.a(new Y2.e((ByteBuffer) obj, oVar.f118d, oVar.f117c, 1), i, i4, hVar, o.f113j);
            default:
                o oVar2 = this.f94b;
                return oVar2.a(new Y2.e((ParcelFileDescriptor) obj, oVar2.f118d, oVar2.f117c), i, i4, hVar, o.f113j);
        }
    }

    @Override // s1.j
    public final boolean b(Object obj, s1.h hVar) {
        switch (this.f93a) {
            case 0:
                this.f94b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
