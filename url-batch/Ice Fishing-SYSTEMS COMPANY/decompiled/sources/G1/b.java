package G1;

import B1.C0262d;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import s1.h;
import u1.x;
import y1.C5227b;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes.dex */
public final class b implements c, InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public final Resources f1196n;

    public /* synthetic */ b(Resources resources) {
        this.f1196n = resources;
    }

    @Override // G1.c
    public x g(x xVar, h hVar) {
        if (xVar == null) {
            return null;
        }
        return new C0262d(this.f1196n, xVar);
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        return new C5227b(this.f1196n, yVar.b(Uri.class, AssetFileDescriptor.class));
    }
}
