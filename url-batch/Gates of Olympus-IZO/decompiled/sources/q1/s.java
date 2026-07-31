package q1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class s extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f6939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Bundle bundle, int i3) {
        super(1);
        this.f6938e = i3;
        this.f6939f = bundle;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f6938e) {
            case 0:
                Z1.i.f((String) obj, "argName");
                return Boolean.valueOf(!this.f6939f.containsKey(r2));
            default:
                Z1.i.f((String) obj, "key");
                return Boolean.valueOf(!this.f6939f.containsKey(r2));
        }
    }
}
