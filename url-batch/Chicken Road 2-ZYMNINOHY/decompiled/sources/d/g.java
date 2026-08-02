package d;

import e.AbstractC0390a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0390a f8072d;

    public /* synthetic */ g(h hVar, String str, AbstractC0390a abstractC0390a, int i4) {
        this.f8069a = i4;
        this.f8070b = hVar;
        this.f8071c = str;
        this.f8072d = abstractC0390a;
    }

    @Override // d.c
    public final void a(Object obj) {
        switch (this.f8069a) {
            case 0:
                h hVar = this.f8070b;
                ArrayList arrayList = hVar.f8076d;
                LinkedHashMap linkedHashMap = hVar.f8074b;
                String str = this.f8071c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC0390a abstractC0390a = this.f8072d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0390a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    hVar.b(intValue, abstractC0390a, obj);
                    return;
                } catch (Exception e4) {
                    arrayList.remove(str);
                    throw e4;
                }
            default:
                h hVar2 = this.f8070b;
                ArrayList arrayList2 = hVar2.f8076d;
                LinkedHashMap linkedHashMap2 = hVar2.f8074b;
                String str2 = this.f8071c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC0390a abstractC0390a2 = this.f8072d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0390a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    hVar2.b(intValue2, abstractC0390a2, obj);
                    return;
                } catch (Exception e5) {
                    arrayList2.remove(str2);
                    throw e5;
                }
        }
    }

    public void b() {
        this.f8070b.f(this.f8071c);
    }
}
