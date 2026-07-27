package s1;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.EnumC0475o;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;
import w2.C1294c;

/* renamed from: s1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192h extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1193i f10508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1192h(C1193i c1193i, int i2) {
        super(0);
        this.f10507d = i2;
        this.f10508e = c1193i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10507d) {
            case 0:
                C1193i c1193i = this.f10508e;
                Context context = c1193i.f10509d;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                return new P(applicationContext instanceof Application ? (Application) applicationContext : null, c1193i, c1193i.g());
            default:
                C1193i owner = this.f10508e;
                if (!owner.f10518p) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (owner.f10516n.f5496d == EnumC0475o.f5480d) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                C1190f factory = new C1190f();
                factory.f10504a = (C1248e) owner.f10517o.f63d;
                factory.f10505b = owner.f10516n;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Y d4 = owner.d();
                Intrinsics.checkNotNullParameter(owner, "owner");
                C1294c c1294c = new C1294c(d4, factory, owner.a());
                Intrinsics.checkNotNullParameter(C1191g.class, "modelClass");
                Intrinsics.checkNotNullParameter(C1191g.class, "<this>");
                return ((C1191g) c1294c.e(M2.F.a(C1191g.class))).f10506b;
        }
    }
}
