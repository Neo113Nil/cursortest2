package c;

import d.AbstractC0104a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101h extends AbstractC0096c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0102i f1657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1658c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0104a f1659d;

    public /* synthetic */ C0101h(AbstractC0102i abstractC0102i, String str, AbstractC0104a abstractC0104a, int i) {
        this.f1656a = i;
        this.f1657b = abstractC0102i;
        this.f1658c = str;
        this.f1659d = abstractC0104a;
    }

    @Override // c.AbstractC0096c
    public final void a(Object obj) {
        switch (this.f1656a) {
            case 0:
                AbstractC0102i abstractC0102i = this.f1657b;
                LinkedHashMap linkedHashMap = abstractC0102i.f1661b;
                String str = this.f1658c;
                Object obj2 = linkedHashMap.get(str);
                AbstractC0104a abstractC0104a = this.f1659d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0104a + " and input android.permission.WRITE_EXTERNAL_STORAGE. You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                ArrayList arrayList = abstractC0102i.f1663d;
                arrayList.add(str);
                try {
                    abstractC0102i.b(intValue, abstractC0104a, "android.permission.WRITE_EXTERNAL_STORAGE");
                    return;
                } catch (Exception e2) {
                    arrayList.remove(str);
                    throw e2;
                }
            default:
                AbstractC0102i abstractC0102i2 = this.f1657b;
                LinkedHashMap linkedHashMap2 = abstractC0102i2.f1661b;
                String str2 = this.f1658c;
                Object obj3 = linkedHashMap2.get(str2);
                AbstractC0104a abstractC0104a2 = this.f1659d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC0104a2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue2 = ((Number) obj3).intValue();
                ArrayList arrayList2 = abstractC0102i2.f1663d;
                arrayList2.add(str2);
                try {
                    abstractC0102i2.b(intValue2, abstractC0104a2, obj);
                    return;
                } catch (Exception e3) {
                    arrayList2.remove(str2);
                    throw e3;
                }
        }
    }
}
