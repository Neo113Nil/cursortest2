package f;

import g.AbstractC0407a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: f.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390i extends AbstractC0384c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0391j f4748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0407a f4750c;

    public C0390i(AbstractC0391j abstractC0391j, String str, AbstractC0407a abstractC0407a) {
        this.f4748a = abstractC0391j;
        this.f4749b = str;
        this.f4750c = abstractC0407a;
    }

    public final void a(Object obj) {
        AbstractC0391j abstractC0391j = this.f4748a;
        ArrayList arrayList = abstractC0391j.f4754d;
        LinkedHashMap linkedHashMap = abstractC0391j.f4752b;
        String str = this.f4749b;
        Object obj2 = linkedHashMap.get(str);
        AbstractC0407a abstractC0407a = this.f4750c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0407a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            abstractC0391j.b(intValue, abstractC0407a, obj);
        } catch (Exception e7) {
            arrayList.remove(str);
            throw e7;
        }
    }

    public final void b() {
        this.f4748a.e(this.f4749b);
    }
}
