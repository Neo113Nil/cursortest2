package B1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class r implements s1.l {

    /* renamed from: b, reason: collision with root package name */
    public final s1.l f122b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123c;

    public r(s1.l lVar, boolean z8) {
        this.f122b = lVar;
        this.f123c = z8;
    }

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        this.f122b.a(messageDigest);
    }

    @Override // s1.l
    public final u1.x b(Context context, u1.x xVar, int i, int i4) {
        InterfaceC5117a interfaceC5117a = com.bumptech.glide.c.a(context).f23530n;
        Drawable drawable = (Drawable) xVar.get();
        C0262d b9 = q.b(interfaceC5117a, drawable, i, i4);
        if (b9 != null) {
            u1.x b10 = this.f122b.b(context, b9, i, i4);
            if (!b10.equals(b9)) {
                return new C0262d(context.getResources(), b10);
            }
            b10.a();
            return xVar;
        }
        if (!this.f123c) {
            return xVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f122b.equals(((r) obj).f122b);
        }
        return false;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return this.f122b.hashCode();
    }
}
