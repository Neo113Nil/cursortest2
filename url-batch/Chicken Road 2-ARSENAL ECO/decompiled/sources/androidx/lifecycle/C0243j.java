package androidx.lifecycle;

import android.os.Bundle;
import android.util.Log;
import com.onesignal.inAppMessages.internal.display.impl.a;
import e.AbstractC0342g;
import e.C0336a;
import e.C0340e;
import e.C0341f;
import f.AbstractC0360a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243j implements InterfaceC0252t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3507f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3508g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3509h;

    public C0243j(InterfaceC0252t interfaceC0252t) {
        this.f3508g = interfaceC0252t;
        C0237d c0237d = C0237d.f3503c;
        Class<?> cls = interfaceC0252t.getClass();
        C0235b c0235b = (C0235b) c0237d.f3504a.get(cls);
        this.f3509h = c0235b == null ? c0237d.a(cls, null) : c0235b;
    }

    @Override // androidx.lifecycle.InterfaceC0252t
    public final void a(InterfaceC0253u interfaceC0253u, EnumC0246m enumC0246m) {
        Integer num;
        switch (this.f3507f) {
            case 0:
                if (enumC0246m == EnumC0246m.ON_START) {
                    ((AbstractC0248o) this.f3508g).b(this);
                    ((T.f) this.f3509h).d();
                    return;
                }
                return;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                C0235b c0235b = (C0235b) this.f3509h;
                InterfaceC0252t interfaceC0252t = (InterfaceC0252t) this.f3508g;
                HashMap hashMap = c0235b.f3499a;
                C0235b.a((List) hashMap.get(enumC0246m), interfaceC0253u, enumC0246m, interfaceC0252t);
                C0235b.a((List) hashMap.get(EnumC0246m.ON_ANY), interfaceC0253u, enumC0246m, interfaceC0252t);
                return;
            default:
                String str = (String) this.f3508g;
                AbstractC0342g abstractC0342g = (AbstractC0342g) this.f3509h;
                Bundle bundle = abstractC0342g.f4004g;
                HashMap hashMap2 = abstractC0342g.f4002e;
                HashMap hashMap3 = abstractC0342g.f4003f;
                if (EnumC0246m.ON_START.equals(enumC0246m)) {
                    hashMap2.put(str, new C0340e());
                    if (hashMap3.containsKey(str)) {
                        hashMap3.get(str);
                        hashMap3.remove(str);
                        throw null;
                    }
                    if (((C0336a) bundle.getParcelable(str)) == null) {
                        return;
                    }
                    bundle.remove(str);
                    throw null;
                }
                if (EnumC0246m.ON_STOP.equals(enumC0246m)) {
                    hashMap2.remove(str);
                    return;
                }
                if (EnumC0246m.ON_DESTROY.equals(enumC0246m)) {
                    HashMap hashMap4 = abstractC0342g.f4000c;
                    if (!abstractC0342g.f4001d.contains(str) && (num = (Integer) abstractC0342g.f3999b.remove(str)) != null) {
                        abstractC0342g.f3998a.remove(num);
                    }
                    hashMap2.remove(str);
                    if (hashMap3.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap3.get(str));
                        hashMap3.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
                        bundle.remove(str);
                    }
                    C0341f c0341f = (C0341f) hashMap4.get(str);
                    if (c0341f != null) {
                        ArrayList arrayList = c0341f.f3997b;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            c0341f.f3996a.b((InterfaceC0252t) obj);
                        }
                        arrayList.clear();
                        hashMap4.remove(str);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C0243j(T.f fVar, AbstractC0248o abstractC0248o) {
        this.f3508g = abstractC0248o;
        this.f3509h = fVar;
    }

    public C0243j(AbstractC0342g abstractC0342g, String str, AbstractC0360a abstractC0360a) {
        this.f3509h = abstractC0342g;
        this.f3508g = str;
    }
}
