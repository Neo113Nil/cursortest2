package y1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5230e implements InterfaceC5245t, InterfaceC5232g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41830n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f41831u;

    public /* synthetic */ C5230e(Context context, int i) {
        this.f41830n = i;
        this.f41831u = context;
    }

    @Override // y1.InterfaceC5232g
    public Class a() {
        return Drawable.class;
    }

    @Override // y1.InterfaceC5232g
    public Object b(Resources resources, int i, Resources.Theme theme) {
        Context context = this.f41831u;
        return com.bumptech.glide.g.M(context, context, i, theme);
    }

    @Override // y1.InterfaceC5232g
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // y1.InterfaceC5245t
    public final InterfaceC5244s i(y yVar) {
        switch (this.f41830n) {
            case 0:
                return new C5227b(this.f41831u, this);
            default:
                return new C5227b(this.f41831u, yVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }
}
