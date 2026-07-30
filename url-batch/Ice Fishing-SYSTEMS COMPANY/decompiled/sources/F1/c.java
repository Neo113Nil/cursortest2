package F1;

import B1.C0262d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import s1.l;
import u1.x;

/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f968b;

    public c(l lVar) {
        N1.g.c(lVar, "Argument must not be null");
        this.f968b = lVar;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        this.f968b.a(messageDigest);
    }

    @Override // s1.l
    public final x b(Context context, x xVar, int i, int i4) {
        b bVar = (b) xVar.get();
        x c0262d = new C0262d(((f) bVar.f961n.f744b).f986l, com.bumptech.glide.c.a(context).f23530n);
        l lVar = this.f968b;
        x b9 = lVar.b(context, c0262d, i, i4);
        if (!c0262d.equals(b9)) {
            c0262d.a();
        }
        ((f) bVar.f961n.f744b).c(lVar, (Bitmap) b9.get());
        return xVar;
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f968b.equals(((c) obj).f968b);
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return this.f968b.hashCode();
    }
}
