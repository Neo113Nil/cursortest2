package y1;

import B1.H;
import android.content.Context;
import android.net.Uri;
import t1.AbstractC5064a;

/* renamed from: y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5240o implements InterfaceC5244s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41853a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41854b;

    public C5240o(Context context, int i) {
        this.f41853a = i;
        switch (i) {
            case 1:
                this.f41854b = context.getApplicationContext();
                break;
            case 2:
                this.f41854b = context.getApplicationContext();
                break;
            default:
                this.f41854b = context;
                break;
        }
    }

    @Override // y1.InterfaceC5244s
    public final boolean a(Object obj) {
        switch (this.f41853a) {
            case 0:
                return AbstractC5064a.a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC5064a.a(uri) && !uri.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f8601a);
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC5064a.a(uri2) && uri2.getPathSegments().contains(com.anythink.basead.exoplayer.k.o.f8601a);
        }
    }

    @Override // y1.InterfaceC5244s
    public final C5243r b(Object obj, int i, int i4, s1.h hVar) {
        Long l9;
        switch (this.f41853a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C5243r(new M1.d(uri), new C5239n(0, this.f41854b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384) {
                    return null;
                }
                M1.d dVar = new M1.d(uri2);
                Context context = this.f41854b;
                return new C5243r(dVar, t1.c.d(context, uri2, new t1.b(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384 || (l9 = (Long) hVar.c(H.f75d)) == null || l9.longValue() != -1) {
                    return null;
                }
                M1.d dVar2 = new M1.d(uri3);
                Context context2 = this.f41854b;
                return new C5243r(dVar2, t1.c.d(context2, uri3, new t1.b(context2.getContentResolver(), 1)));
        }
    }
}
